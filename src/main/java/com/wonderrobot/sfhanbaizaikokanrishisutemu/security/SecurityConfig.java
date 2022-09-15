package com.wonderrobot.sfhanbaizaikokanrishisutemu.security;

import com.wonderfulfly.core.security.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Dylan
 * @date 2022-08-30 17:04
 * Copyright (C)
 * @description Security 設定
 */
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 認証失敗処理クラス
     */
    @Autowired
    private AuthenticationEntryPointImpl unauthorizedHandler;
    /**
     * ログアウト処理类
     */
    @Autowired
    private LogoutSuccessHandlerImpl logoutSuccessHandler;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf().disable()
                // 認証失敗処理クラス
                .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
                // リクエストのフィルタリング
//                .authorizeRequests()
//                // インターフェイスへの匿名アクセスを許可する
//                .antMatchers("/", "/error", "/login.do", "/logoutButton.do", "/logoutGamenn.do").anonymous()
//                // 匿名でアクセスできる静的リソース
//                .antMatchers("/**/*.jsp", "/**/*.js", "/static/**", "/fonts/**", "/**/*.css").permitAll()
//                // 上記以外のすべてのリクエストには認証が必要
//                .anyRequest().authenticated()
        ;
        // Logout filter追加
        httpSecurity.logout().logoutUrl("/logoutButton.do").logoutSuccessHandler(logoutSuccessHandler);
    }

    /**
     * ID 認証インターフェース
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(new PasswordEncoder() {
                    // パスワード暗号化チェック
            @Override
            public String encode(CharSequence rawPassword) {
                return Encrypt.encrypt(rawPassword.toString());
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                return encode(rawPassword).equals(encodedPassword);
            }
        });
    }

}
