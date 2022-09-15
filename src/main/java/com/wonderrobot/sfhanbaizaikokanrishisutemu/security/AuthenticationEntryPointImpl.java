package com.wonderrobot.sfhanbaizaikokanrishisutemu.security;

import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * @author Dylan
 * @date 2022-08-29 17:31
 * Copyright (C)
 * @description Permission Authentication Failure Handling Class
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint, Serializable {
    private static final long serialVersionUID = -8970718410437077606L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e)
            throws IOException {
        LoggerUtil.error("AuthenticationEntryPointImpl--------UnAuthorized--------");
        JSONWFCObject jsonObj = new JSONWFCObject();
        jsonObj.setScript(JsonConstant.JSONID_RUN_SCRIPT, "location.href='login.do'");
        response.getWriter().print(jsonObj.toJSONString());
    }
}