package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A003;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.GetAutonum;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.GetMaxNumValueDao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003.A003InsertSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003.A003UpdateSaveDao;
/**
*  ＠project
*  ＠comment
*  class：A003saveService
*  Page：部門
*  @verson
**/
@Service
@Transactional(rollbackFor=Exception.class)
public class A003saveService {
	@Autowired
	private GetMaxNumValueDao GetMaxNumValueDao;
	@Autowired
	private Properties springSystemProperties;
	@Autowired
	private A003InsertSaveDao A003InsertSaveDao;
	@Autowired
	private A003UpdateSaveDao A003UpdateSaveDao;
	@Log
	public void A003F20091208153604208(HttpServletRequest request, A003DataCheckEntity A003DataCheckEntity,JSONWFCObject jsonObj) throws Exception {
		ArrayList<ArrayList<String>> AlKeyData = null;
		ArrayList<ArrayList<String>> alGridCount = null;
		AlKeyData = new ArrayList<ArrayList<String>>();
		int actFlg = StringUtil.changeStringToInt(request.getParameter("actflg"));
		String pageActionMode = "";
		if (actFlg == 1) {
			pageActionMode = "2";
		} else if (actFlg == 2) { 
			pageActionMode = "1";
		} else if (actFlg == 0) { 
			pageActionMode = "2";
		}
			String BUMONID = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A003DataCheckEntity.getBUMONID1()));
		AlKeyData.add(new ArrayList<String>(Arrays.asList(new String[] { "BUMONID1" , BUMONID })));
			String BUMONMEI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A003DataCheckEntity.getBUMONMEI1()));
		if (pageActionMode.equals("2")) {
				A003InsertSaveDao.A003InsertSaveData(BUMONID,BUMONMEI);
		} else if (pageActionMode.equals("1")) {
			A003UpdateSaveDao.A003UpdateSaveData(BUMONID,BUMONMEI,BUMONID);
		}
		if ((AlKeyData != null) && (AlKeyData.size() > 0)) {
			for (int i = 0; i < AlKeyData.size(); i++) {
				jsonObj.setValue(AlKeyData.get(i).get(0), AlKeyData.get(i).get(1));
				jsonObj.setReturnID("v", AlKeyData.get(i).get(0));
			}
		}
		jsonObj.setMessageValue("i", "保存が完了しました。");
		jsonObj.setValue("WF_RUNRESULT", "1");
		jsonObj.setReturnID("v", "WF_RUNRESULT");
		jsonObj.setValue("actflg", "2");
		jsonObj.setReturnID("v", "actflg");
	}
}
