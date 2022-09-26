package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A004;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004.A004DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004InsertSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004UpdateSaveDao;
/**
*  ＠project
*  ＠comment
*  class：A004saveService
*  Page：会社
*  @verson
**/
@Service
@Transactional(rollbackFor=Exception.class)
public class A004saveService {
	@Autowired
	private GetMaxNumValueDao GetMaxNumValueDao;
	@Autowired
	private Properties springSystemProperties;
	@Autowired
	private A004InsertSaveDao A004InsertSaveDao;
	@Autowired
	private A004UpdateSaveDao A004UpdateSaveDao;
	@Log
	public void A004F20091208153604208(HttpServletRequest request, A004DataCheckEntity A004DataCheckEntity,JSONWFCObject jsonObj) throws Exception {
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
			String KAISHAID = null;
			if (pageActionMode.equals("2")) {
				KAISHAID = getAutonumValue("KAISYA" , "KAISHAID");
			} else if (pageActionMode.equals("1")) {
				KAISHAID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAISHAID1")));
			}
		AlKeyData.add(new ArrayList<String>(Arrays.asList(new String[] { "KAISHAID1" , KAISHAID })));
			String KAISHAMEI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A004DataCheckEntity.getKAISHAMEI1()));
			String KAISHARYAKUSHOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A004DataCheckEntity.getKAISHARYAKUSHOU1()));
			String ADORESU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A004DataCheckEntity.getADORESU1()));
			String RENRAKUSAKI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A004DataCheckEntity.getRENRAKUSAKI1()));
			String SHIHARAIKIGEN = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A004DataCheckEntity.getSHIHARAIKIGEN1()));
			String KAISHAKUBUN = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A004DataCheckEntity.getKAISHAKUBUN1()));
		if (pageActionMode.equals("2")) {
				A004InsertSaveDao.A004InsertSaveData(KAISHAID,KAISHAMEI,KAISHARYAKUSHOU,ADORESU,RENRAKUSAKI,SHIHARAIKIGEN,KAISHAKUBUN);
		} else if (pageActionMode.equals("1")) {
			A004UpdateSaveDao.A004UpdateSaveData(KAISHAID,KAISHAMEI,KAISHARYAKUSHOU,ADORESU,RENRAKUSAKI,SHIHARAIKIGEN,KAISHAKUBUN,KAISHAID);
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
	private String getAutonumValue(String tableID, String fieldID) throws Exception {
		
		GetAutonum autoNum = new GetAutonum();
		String paramRequestVal = autoNum.getMaxNumValue(tableID, fieldID);

		return paramRequestVal;
	}
}
