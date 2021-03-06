//package com.example.zuulapi.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletResponse;
//
//@Component
//public class PostFilter extends ZuulFilter {
//    private static Logger log = LoggerFactory.getLogger(PostFilter.class);
//
//    @Override
//    public String filterType() {
//        return "post";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 1;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() {
//        HttpServletResponse response = com.netflix.zuul.context.RequestContext.getCurrentContext().getResponse();
//
//        log.info("PostFilter: " + String.format("response's content type is %s", response.getStatus()));
//
//        return null;
//    }
//}