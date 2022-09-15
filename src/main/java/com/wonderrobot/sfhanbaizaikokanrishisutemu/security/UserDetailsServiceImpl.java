package com.wonderrobot.sfhanbaizaikokanrishisutemu.security;

import com.wonderfulfly.core.util.StringUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dylan
 * @date 2022-08-30 17:22
 * Copyright (C)
 * @description
 */
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<LoginUser> userList = loginMapper.getAdminByUsername(username);
        Assert.notEmpty(userList, "Account does not exist");
        LoginUser loginUser = userList.get(0);
//        Assert.hasText(loginUser.getGroupId(),"User has not selected a group");
        if (StringUtil.isNullOrBlank(loginUser.getGroupId())) {
            return loginUser;
        }
        List<PageRight> group = loginMapper.getPageRightByGroup(loginUser.getGroupId());

        List<String> menu = new ArrayList<>();
        Map<String, String> USER_AUTH_MAP = new HashMap<>();

        // Set permission fields
        for (PageRight right : group) {
            if (right.getPAGEID().startsWith("M")) {
                menu.add(right.getPAGEID());
            } else if (right.getPAGEID().startsWith("P")) {
                StringBuilder sb = new StringBuilder();
                sb.append(right.getNORIGHTFLG()).append(right.getINSERTFLG())
                        .append(right.getUPDATEFLG()).append(right.getDISPLAYFLG())
                        .append(right.getDELETEFLG());
                USER_AUTH_MAP.put(right.getPAGEID(), sb.toString());
            }
        }
        loginUser.setMenu(menu);
        loginUser.setUSER_AUTH_MAP(USER_AUTH_MAP);
        return loginUser;
    }


}
