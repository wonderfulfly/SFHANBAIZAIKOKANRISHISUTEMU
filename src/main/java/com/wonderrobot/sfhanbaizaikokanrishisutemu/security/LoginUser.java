package com.wonderrobot.sfhanbaizaikokanrishisutemu.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author Dylan
 * @date 2022-08-31 10:42
 * Copyright (C)
 * @description
 */
public class LoginUser implements UserDetails {

    private String username;

    private String PASSWORD;

    private String groupId;

    /**
     * menu list
     */
    private List<String> menu;

    /**
     * List of pages and corresponding permissions
     */
    private Map<String, String> USER_AUTH_MAP;

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public Map<String, String> getUSER_AUTH_MAP() {
        return USER_AUTH_MAP;
    }

    public void setUSER_AUTH_MAP(Map<String, String> USER_AUTH_MAP) {
        this.USER_AUTH_MAP = USER_AUTH_MAP;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.PASSWORD = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return PASSWORD;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}