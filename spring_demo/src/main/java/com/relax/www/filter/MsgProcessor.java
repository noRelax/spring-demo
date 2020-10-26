package com.relax.www.filter;

public class MsgProcessor {
    private String msg;
    private Filter chain = new FilterChain();
 
    public MsgProcessor(String msg,Filter chain){
        this.msg = msg;
        this.chain = chain;
    }
 
    public String process(){
        return chain.doFilter(msg);
    }
}