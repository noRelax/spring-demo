package com.relax.www.filter;
public class MainClass {
    public static void main(String[] args) {
        //需要被过滤的语句
        String msg = "<img 被就业了：），敏感信息，<script>";
 
        //搞一个过过滤链
        FilterChain chain = new FilterChain();
        chain.addFilter(new ImageFilter()).addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());
        //实例化处理类
        MsgProcessor mp = new MsgProcessor(msg,chain);
        String r = mp.process();
 
        System.out.println(r);
    }
}