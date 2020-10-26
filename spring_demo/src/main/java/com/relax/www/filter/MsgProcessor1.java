package com.relax.www.filter;
public class MsgProcessor1 {
    private String msg;
    private Filter[] filters = {new HtmlFilter(),new SensitiveFilter()};
 
    public MsgProcessor1(String msg){
        this.msg = msg;
    }
 
    public String process(){
        String r = msg;
        for(Filter f : filters){
            r = f.doFilter(r);
        }
        return r;
    }
    
    public static void main(String[] args) {
		MsgProcessor1 msgProcessor = new MsgProcessor1("敏感被就业");
		System.out.println(msgProcessor.process());
	}
}