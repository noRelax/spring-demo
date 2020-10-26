package com.relax.www.proxy.cglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 评论动态代理类-cglib实现
 *
 * @author wusong
 * @create 2019-12-03 16:21
 **/
public class CommentCglibProxy implements MethodInterceptor {
    private Object target;

    private Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(method.getName() + "方法调用前...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println(method.getName() + "方法调用后...");
        return result;
    }

    public static void main(String[] args) {
        CommentServiceImpl commentService = new CommentServiceImpl();
        CommentCglibProxy commentCglibProxy = new CommentCglibProxy();
        commentService = (CommentServiceImpl) commentCglibProxy.getInstance(commentService);
        commentService.save();
        commentService.delete();
    }
}
