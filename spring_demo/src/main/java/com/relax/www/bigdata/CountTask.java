package com.relax.www.bigdata;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Integer> {
	private static final int THRESHOLD = 1000;
	private int start;
	private int end;

	public CountTask(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		boolean canCompute = end - start <= THRESHOLD;
		if (canCompute) { // 小于阀值直接计算结果
			for (int i = start; i <= end; i++) {
				sum += i;
			}
		} else { // 大于阀值则拆分为2个子任务
			int middle = (start + end) / 2;
			CountTask task1 = new CountTask(start, middle);
			CountTask task2 = new CountTask(middle + 1, end);

			task1.fork();
			task2.fork();

			int r1 = task1.join(); // 等待子任务执行结果
			int r2 = task2.join();

			sum = r1 + r2;
		}
		return sum;
	}

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		CountTask task = new CountTask(1, 99999999);
		Future<Integer> result = forkJoinPool.submit(task); // 提交任务

		System.out.println(result.get());

		if (task.isCompletedAbnormally()) { // 处理异常
			System.out.println(task.getException());
		}
		forkJoinPool.shutdown();
	}
}