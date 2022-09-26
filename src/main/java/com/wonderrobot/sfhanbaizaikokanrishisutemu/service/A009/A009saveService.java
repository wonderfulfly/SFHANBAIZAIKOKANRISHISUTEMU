package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009InsertSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009UpdateSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009Delete61GridSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009Update61GridSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009Insert61GridSaveDao;

import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009.A009PageAfterSave1Service;
/**
*  ＠project
*  ＠comment
*  class：A009saveService
*  Page：入金管理詳細
*  @verson
**/
@Service
@Transactional(rollbackFor=Exception.class)
public class A009saveService {
	@Autowired
	private GetMaxNumValueDao GetMaxNumValueDao;
	@Autowired
	private Properties springSystemProperties;
	@Autowired
	private A009InsertSaveDao A009InsertSaveDao;
	@Autowired
	private A009UpdateSaveDao A009UpdateSaveDao;
	@Autowired
	private A009Update61GridSaveDao A009Update61GridSaveDao;
	@Autowired
	private A009Delete61GridSaveDao A009Delete61GridSaveDao;
	@Autowired
	private A009Insert61GridSaveDao A009Insert61GridSaveDao;

	@Autowired
	private A009PageAfterSave1Service A009PageAfterSave1Service;
	@Log
	public void A009F20091208153604208(HttpServletRequest request, A009DataCheckEntity A009DataCheckEntity,JSONWFCObject jsonObj) throws Exception {
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
			String KYAKUSAKIID = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A009DataCheckEntity.getKYAKUSAKI()));
			String TANTOUSHAID = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A009DataCheckEntity.getTANTOUSHA()));
			String RESHIITONO = null;
			if (pageActionMode.equals("2")) {
				RESHIITONO = getAutonumValue("NYUKIN" , "RESHIITONO");
			} else if (pageActionMode.equals("1")) {
				RESHIITONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RYOUSHUUSHONO")));
			}
		AlKeyData.add(new ArrayList<String>(Arrays.asList(new String[] { "RYOUSHUUSHONO" , RESHIITONO })));
			String CHUUBUNSHONO = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A009DataCheckEntity.getCHUUBUNSHONO1()));
			String KANTOKU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A009DataCheckEntity.getKANTOKU1()));
			String CHUUMONHIDZUKE = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A009DataCheckEntity.getCHUUMONHIDZUKE1()));
			String NYUUKINKINGAKU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A009DataCheckEntity.getNYUUKINKINGAKU1()));
			String JISSAINYUUKINJOUTAI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A009DataCheckEntity.getJISSAINYUUKINJOUTAI1()));
		if (pageActionMode.equals("2")) {
				A009InsertSaveDao.A009InsertSaveData(KYAKUSAKIID,TANTOUSHAID,RESHIITONO,CHUUBUNSHONO,KANTOKU,CHUUMONHIDZUKE,NYUUKINKINGAKU,JISSAINYUUKINJOUTAI);
		} else if (pageActionMode.equals("1")) {
			A009UpdateSaveDao.A009UpdateSaveData(KYAKUSAKIID,TANTOUSHAID,RESHIITONO,CHUUBUNSHONO,KANTOKU,CHUUMONHIDZUKE,NYUUKINKINGAKU,JISSAINYUUKINJOUTAI,RESHIITONO);
		}
			String gridOpFlg = null;
		int RowLine61 = StringUtil.changeStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid61")));
		for (int u = 0; u <= RowLine61; u++) {
			gridOpFlg = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid"+"61"+"flg" + (u+1))));
					String SHIHARAIHIDZUKE = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("SHIHARAIHIDZUKE_"+u)));
					String SHIHARAIWARIAI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("SHIHARAIWARIAI_"+u)));
					String FURIDASHIZUMIHIDZUKE = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("FURIDASHIZUMIHIDZUKE_"+u)));
					String FURIDASHIZUMIKINGAKU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("FURIDASHIZUMIKINGAKU_"+u)));
					String FURIDASHIZUMIWARIAI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("FURIDASHIZUMIWARIAI_"+u)));
					String NYUUKINZUMIHIDZUKE = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("NYUUKINZUMIHIDZUKE_"+u)));
					String NYUUKINZUMIKINGAKU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("NYUUKINZUMIKINGAKU_"+u)));
					String NYUUKINZUMIWARIAI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("NYUUKINZUMIWARIAI_"+u)));
					String RESHIITOMEISAINO = null;
				if (!StringUtil.isNullOrBlank(gridOpFlg) && ("0".equals(gridOpFlg) || "1".equals(gridOpFlg))) {
					RESHIITOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RESHIITOMEISAINO_"+u)));
				} else if (!StringUtil.isNullOrBlank(gridOpFlg) && "2".equals(gridOpFlg)) {
					RESHIITOMEISAINO = getAutonumValue("NYUKINMEISAI" , "RESHIITOMEISAINO");
				}
			if (!StringUtil.isNullOrBlank(gridOpFlg) && "0".equals(gridOpFlg)) { 
				A009Delete61GridSaveDao.A009Delete61GridSaveData(RESHIITONO,RESHIITOMEISAINO);
			} else if (!StringUtil.isNullOrBlank(gridOpFlg) && "1".equals(gridOpFlg)) { 
				A009Update61GridSaveDao.A009Update61GridSaveData(SHIHARAIHIDZUKE,SHIHARAIWARIAI,FURIDASHIZUMIHIDZUKE,FURIDASHIZUMIKINGAKU,FURIDASHIZUMIWARIAI,NYUUKINZUMIHIDZUKE,NYUUKINZUMIKINGAKU,NYUUKINZUMIWARIAI,RESHIITOMEISAINO,RESHIITONO,RESHIITONO,RESHIITOMEISAINO);
			}  else if (!StringUtil.isNullOrBlank(gridOpFlg) && "2".equals(gridOpFlg)) { 
				A009Insert61GridSaveDao.A009Insert61GridSaveData(SHIHARAIHIDZUKE,SHIHARAIWARIAI,FURIDASHIZUMIHIDZUKE,FURIDASHIZUMIKINGAKU,FURIDASHIZUMIWARIAI,NYUUKINZUMIHIDZUKE,NYUUKINZUMIKINGAKU,NYUUKINZUMIWARIAI,RESHIITOMEISAINO,RESHIITONO);
			}
		}

			A009PageAfterSave1Service.A009PageAfterSave1(request, jsonObj);
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
