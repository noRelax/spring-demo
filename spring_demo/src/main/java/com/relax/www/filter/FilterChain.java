package com.relax.www.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
 
    public List<Filter> filters= new ArrayList<Filter>();
 
    public FilterChain addFilter(Filter f){
        filters.add(f);
        return this;
    }
 
    public String doFilter(String msg) {//执行filters中的doFilter方法即可
        String r = msg;
        for(Filter f : filters){
            r = f.doFilter(r);
        }
        return r;
    }
}