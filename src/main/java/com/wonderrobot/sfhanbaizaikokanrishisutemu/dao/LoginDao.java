package com.wonderrobot.sfhanbaizaikokanrishisutemu.dao;
import org.springframework.stereotype.Repository;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.LoginEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class LoginDao {
	
	@Autowired
	private LoginMapper LoginMapper;
	
	public List<LoginEntity> LoginInit (String LOGINID, String LOGINPASSWORD, String USER_EFF, String GROUPID, String LOGINTABLEID, String WHRLOGINID, String WHRLOGINPASSWORD, String USERID) throws Exception {

		List<LoginEntity> returnVal = LoginMapper.LoginInit(LOGINID, LOGINPASSWORD, USER_EFF, GROUPID, LOGINTABLEID, WHRLOGINID, WHRLOGINPASSWORD, USERID);
		return returnVal;
	}
	public List<LoginEntity> LoginAdminInit (String LOGINID, String PASSWORD) throws Exception {

		List<LoginEntity> returnVal = LoginMapper.LoginAdminInit(LOGINID, PASSWORD);
		return returnVal;
	}
}

