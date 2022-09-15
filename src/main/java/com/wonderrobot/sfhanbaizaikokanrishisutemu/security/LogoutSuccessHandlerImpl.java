package com.wonderrobot.sfhanbaizaikokanrishisutemu.security;

import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Dylan
 * @date 2022-08-30 17:04
 * Copyright (C)
 * @description Custom Logout handler class 
 */
@Configuration
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler {
    /**
     * Logout Processing
     *
     * @return
     */
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        LoggerUtil.debug("LogoutSuccessHandlerImpl--------logged out--------");
    }
}
