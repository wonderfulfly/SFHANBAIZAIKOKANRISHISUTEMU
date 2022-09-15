package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006Delete19GridSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006Update19GridSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006Insert19GridSaveDao;
/**
*  ＠project
*  ＠comment
*  class：A006saveService
*  Page：商品
*  @verson
**/
@Service
@Transactional(rollbackFor=Exception.class)
public class A006saveService {
	@Autowired
	private GetMaxNumValueDao GetMaxNumValueDao;
	@Autowired
	private Properties springSystemProperties;
	@Autowired
	private A006Update19GridSaveDao A006Update19GridSaveDao;
	@Autowired
	private A006Delete19GridSaveDao A006Delete19GridSaveDao;
	@Autowired
	private A006Insert19GridSaveDao A006Insert19GridSaveDao;
	@Log
	public void A006F20091208153604208(HttpServletRequest request, A006DataCheckEntity A006DataCheckEntity,JSONWFCObject jsonObj) throws Exception {
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
			String gridOpFlg = null;
		int RowLine19 = StringUtil.changeStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid19")));
		for (int u = 0; u <= RowLine19; u++) {
			gridOpFlg = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid"+"19"+"flg" + (u+1))));
					String SHOUHINMEISHOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("SHOUHINMEISHOU_"+u)));
					String ZAISHITSU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("ZAISHITSU_"+u)));
					String TSUKAMATSUNYUUSAKI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUSAKI_"+u)));
					String NYUUKAHIDZUKE = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("NYUUKAHIDZUKE_"+u)));
					String PRICE = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("PRICE_"+u)));
					String ZAIKOSUURYOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("ZAIKOSUURYOU_"+u)));
					String SHOUHINNO = null;
				if (!StringUtil.isNullOrBlank(gridOpFlg) && ("0".equals(gridOpFlg) || "1".equals(gridOpFlg))) {
					SHOUHINNO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHOUHINNO_"+u)));
				} else if (!StringUtil.isNullOrBlank(gridOpFlg) && "2".equals(gridOpFlg)) {
					SHOUHINNO = getAutonumValue("SYOUHIN" , "SHOUHINNO");
				}
			if (!StringUtil.isNullOrBlank(gridOpFlg) && "0".equals(gridOpFlg)) { 
				A006Delete19GridSaveDao.A006Delete19GridSaveData(SHOUHINNO);
			} else if (!StringUtil.isNullOrBlank(gridOpFlg) && "1".equals(gridOpFlg)) { 
				A006Update19GridSaveDao.A006Update19GridSaveData(SHOUHINMEISHOU,ZAISHITSU,TSUKAMATSUNYUUSAKI,NYUUKAHIDZUKE,PRICE,ZAIKOSUURYOU,SHOUHINNO,SHOUHINNO);
			}  else if (!StringUtil.isNullOrBlank(gridOpFlg) && "2".equals(gridOpFlg)) { 
				A006Insert19GridSaveDao.A006Insert19GridSaveData(SHOUHINMEISHOU,ZAISHITSU,TSUKAMATSUNYUUSAKI,NYUUKAHIDZUKE,PRICE,ZAIKOSUURYOU,SHOUHINNO);
			}
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
