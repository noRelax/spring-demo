package com.relax.www.collection.queue;
 
import java.util.Arrays;
 
 
/**
 * 队列满足的条件是FIFO先进先出，本例是基于数组完成的Queue
 * 
 * @author Administrator
 *
 */
public class ArrayQueue<T> {
    Object[] data = null;
    // 对头指针
    private int front;
    // 队尾指针
    private int rear;
    // 队列中当前的元素
    private int itemNums;
    private int maxSize;
 
    public ArrayQueue(Integer maxSize) {
        this.maxSize = maxSize;
        data = new Object[maxSize];
        front = 0;
        rear = -1;
        itemNums = 0;
    }
 
    /**
     * 插入元素:
     * 1、一般情况下，插入操作是在队列不满的情况下，才调用。因此在插入前，应该先调用isFull
     * 2、在队列中插入元素，正常情况下是在队尾指针(rear)+1的位置上插入，因为我们编写的是循环队列
     *       因此，当队尾指针指向数组顶端的时候，我们要将队尾指针(rear)重置为-1，此时再加1，就是0，也就是数组顶端
     * @param element
     */
    public void enqueue(T element) {
        if (isFull()) {
            throw new IllegalStateException("queue is full!");
        }
        needCycle();
        data[++rear] = element;
        itemNums++;
    }
    
    /**
     * 让队列支持循环的核心代码:
     * 如果rear= maxSize - 1，说明下一个元素应该是的数组的首部，将rear置为-1
     * 因为插入操作是队尾指针rear+1的位置，因此下一个位置就是0，即数组第一个元素下标
     */
    private void needCycle() {
        if (rear == maxSize - 1) {
            rear = -1;
        }
    }
 
    /**
     * 移除元素，返回队头指针front所指向的数据项的值
     * 正常情况下，在remove之前，应该调用isEmpty，如果为空，则不能输入
     * @return
     */
    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("no elements in the queue");
        }
        T t = (T) data[front];
        data[front]=null;
        front=front+1;
        if (front == maxSize) {
            front = 0;
        }
        itemNums--;
        return t;
    }
 
    /**
     * 查看队列首部元素，不移除
     * 
     * @return
     */
    @SuppressWarnings("unchecked")
    public T peekFront() {
        if (isEmpty()) {
            throw new IllegalStateException("no elements in the queue");
        }
        return (T) data[front];
    }
 
    public boolean isEmpty() {
        return itemNums == 0;
    }
 
    public boolean isFull() {
        return itemNums == maxSize;
    }
 
    public int size() {
        return itemNums;
    }
    public int getMaxSize() {
        return maxSize;
    }
 
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
 
    @Override
    public String toString() {
        return "ArrayQueue [container=" + Arrays.toString(data)
                + ", front=" + front + ", rear=" + rear + ", size="
                + itemNums + ", maxSize=" + maxSize + "]";
    }
}