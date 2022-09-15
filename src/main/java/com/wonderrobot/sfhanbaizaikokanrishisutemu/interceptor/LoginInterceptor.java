package com.wonderrobot.sfhanbaizaikokanrishisutemu.interceptor;

import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.LoginCheckUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WFC
 * 
 * Copyright (C)
 * @description Login authentication
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            System.out.println("--------------------LoginInterceptor preHandle" + request.getRequestURI());
            JSONWFCObject jsonObj = new JSONWFCObject();
            boolean b = LoginCheckUtil.hasUserID(request, jsonObj);
            if (b) {
                return true;
            }
            response.setContentType("text/plain;charset=UTF-8");
            PrintWriter writer = response.getWriter();
            String jsonObjStr = jsonObj.toJSONString();
            if (!StringUtil.isNullOrBlank(jsonObjStr)) {
                writer.print(jsonObjStr);
            }
            return false;
        } catch (Exception e) {
            System.out.println("--------------------LoginInterceptor catch err");
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}