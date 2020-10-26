package com.relax.www.filter;

import com.relax.www.filter.demo1.*;
import com.relax.www.filter.demo1.FilterChain;

/**
 * 图片过滤器
 *
 * @author wusong
 * @create 2018-11-29 15:21
 **/
public class ImageFilter implements Filter {

    @Override
    public String doFilter(String str) {
        String s = str.replaceAll("<img", "").replaceAll(">", "");
        return s;
    }
}
