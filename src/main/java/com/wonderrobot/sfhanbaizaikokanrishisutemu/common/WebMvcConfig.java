package com.wonderrobot.sfhanbaizaikokanrishisutemu.common;

import com.wonderrobot.sfhanbaizaikokanrishisutemu.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * webmvcConfig
 * 
 * @author wfc
 *
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	/**
	 * Interceptor add
	 *
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// MDC
		MdcHandlerInterceptor mdcInterceptor = new MdcHandlerInterceptor();
		InterceptorRegistration registration = registry.addInterceptor(mdcInterceptor);
		registration.addPathPatterns("/**"); 
		registration.excludePathPatterns(
                        "/**/*.html",
                        "/**/*.js",
                        "/static/**",
                        "/fonts/**",
                        "/**/*.css");

		registry.addInterceptor(new LoginInterceptor())
				.addPathPatterns("/**")
				.excludePathPatterns(
						"/",
						"/error",
						"/login.do",
						"/logoutButton.do",
						"/logoutGamenn.do",
				"/**/*.jsp",
				"/**/*.js",
				"/static/**",
				"/fonts/**",
				"/**/*.css");

	}

}
