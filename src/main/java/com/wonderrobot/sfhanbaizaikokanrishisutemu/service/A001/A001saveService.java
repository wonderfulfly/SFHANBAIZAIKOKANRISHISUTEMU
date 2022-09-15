package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A001;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001.A001InsertSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001.A001UpdateSaveDao;
/**
*  ＠project
*  ＠comment
*  class：A001saveService
*  Page：社員
*  @verson
**/
@Service
@Transactional(rollbackFor=Exception.class)
public class A001saveService {
	@Autowired
	private GetMaxNumValueDao GetMaxNumValueDao;
	@Autowired
	private Properties springSystemProperties;
	@Autowired
	private A001InsertSaveDao A001InsertSaveDao;
	@Autowired
	private A001UpdateSaveDao A001UpdateSaveDao;
	@Log
	public void A001F20091208153604208(HttpServletRequest request, A001DataCheckEntity A001DataCheckEntity,JSONWFCObject jsonObj) throws Exception {
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
			String SHAINID = null;
			if (pageActionMode.equals("2")) {
				SHAINID = getAutonumValue("SYAIN" , "SHAINID");
			} else if (pageActionMode.equals("1")) {
				SHAINID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHAINID1")));
			}
		AlKeyData.add(new ArrayList<String>(Arrays.asList(new String[] { "SHAINID1" , SHAINID })));
			String SHAINMEI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A001DataCheckEntity.getSHAINMEI1()));
			String DENWABANGOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A001DataCheckEntity.getDENWABANGOU1()));
			String KEITAIBANGOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A001DataCheckEntity.getKEITAIBANGOU1()));
			String EMAIL = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A001DataCheckEntity.getEMAIL1()));
			String LINE = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A001DataCheckEntity.getLINE1()));
			String YUUZAAKENGEN = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A001DataCheckEntity.getBUMON()));
			String YUUKOUKUBUN = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A001DataCheckEntity.getYUUKOUKUBUN1()));
			String ROGUINID = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A001DataCheckEntity.getROGUINID1()));
		AlKeyData.add(new ArrayList<String>(Arrays.asList(new String[] { "ROGUINID1" , ROGUINID })));
			String PASUWAADO = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A001DataCheckEntity.getPASUWAADO1()));
		if (pageActionMode.equals("2")) {
				A001InsertSaveDao.A001InsertSaveData(SHAINID,SHAINMEI,DENWABANGOU,KEITAIBANGOU,EMAIL,LINE,YUUZAAKENGEN,YUUKOUKUBUN,ROGUINID,PASUWAADO);
		} else if (pageActionMode.equals("1")) {
			A001UpdateSaveDao.A001UpdateSaveData(SHAINID,SHAINMEI,DENWABANGOU,KEITAIBANGOU,EMAIL,LINE,YUUZAAKENGEN,YUUKOUKUBUN,ROGUINID,PASUWAADO,SHAINID,ROGUINID);
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
