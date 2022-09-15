package com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.security.LoginUser;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.LoginEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.security.PageRight;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LoginMapper {

    public List<LoginEntity> LoginInit(@Param("LOGINID")String LOGINID,@Param("LOGINPASSWORD") String LOGINPASSWORD, @Param("USER_EFF") String USER_EFF, @Param("GROUPID")String GROUPID,@Param("LOGINTABLEID") String LOGINTABLEID,@Param("WHRLOGINID") String WHRLOGINID,@Param("WHRLOGINPASSWORD") String WHRLOGINPASSWORD,@Param("USERID") String USERID );
    public List<LoginEntity> LoginAdminInit(@Param("LOGINID")String LOGINID,@Param("PASSWORD") String PASSWORD);
    public List<LoginUser> getAdminByUsername(@Param("LOGINID")String LOGINID);
    public List<PageRight> getPageRightByGroup(@Param("GROUPID")String GROUPID);
}

