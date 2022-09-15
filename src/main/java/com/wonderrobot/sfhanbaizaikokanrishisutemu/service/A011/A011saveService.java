package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011InsertSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011UpdateSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011Delete95GridSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011Update95GridSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011Insert95GridSaveDao;

import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011.A011PageAfterSave1Service;
/**
*  ＠project
*  ＠comment
*  class：A011saveService
*  Page：注文管理詳細
*  @verson
**/
@Service
@Transactional(rollbackFor=Exception.class)
public class A011saveService {
	@Autowired
	private GetMaxNumValueDao GetMaxNumValueDao;
	@Autowired
	private Properties springSystemProperties;
	@Autowired
	private A011InsertSaveDao A011InsertSaveDao;
	@Autowired
	private A011UpdateSaveDao A011UpdateSaveDao;
	@Autowired
	private A011Update95GridSaveDao A011Update95GridSaveDao;
	@Autowired
	private A011Delete95GridSaveDao A011Delete95GridSaveDao;
	@Autowired
	private A011Insert95GridSaveDao A011Insert95GridSaveDao;

	@Autowired
	private A011PageAfterSave1Service A011PageAfterSave1Service;
	@Log
	public void A011F20091208153604208(HttpServletRequest request, A011DataCheckEntity A011DataCheckEntity,JSONWFCObject jsonObj) throws Exception {
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
			String SHUTSUNYUUKOFURAGU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getSHUTSUNYUUKOFURAGU1()));
			String CHUUMONHIDZUKE = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getCHUUMONHIDZUKE1()));
			String CHUUBUNSHONO = null;
			if (pageActionMode.equals("2")) {
				CHUUBUNSHONO = getAutonumValue("TYUMONSYO" , "CHUUBUNSHONO");
			} else if (pageActionMode.equals("1")) {
				CHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
			}
		AlKeyData.add(new ArrayList<String>(Arrays.asList(new String[] { "CHUUBUNSHONO1" , CHUUBUNSHONO })));
			String SHUKKANO = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getSHUKKANO1()));
			String MITSUMORISHONO = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getMITSUMORISHONO1()));
			String KYAKUSAKIID = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getKYAKUSAKIMEISHOU()));
			String KYAKUSAKITANTOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getKYAKUSAKITANTOU1()));
			String ADORESU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getADORESU1()));
			String DENWABANGOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getDENWABANGOU1()));
			String RESHIITONO = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getRESHIITONO()));
			String SHANAIKOUJIBANGOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getSHANAIKOUJIBANGOU1()));
			String HINMEI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getHINMEI1()));
			String TANTOUSHAID = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getTANTOUSHA()));
			String KEIYAKUSAKI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getKEIYAKUSAKI1()));
			String NOUKIYOTEIBI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getNOUKIYOTEIBI1()));
			String NOUNYUUBI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getNOUNYUUBI1()));
			String SHOUHINSOUGAKUJPY = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getJPYGOUKEI()));
			String SHOUHINSOUGAKURMB = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getRMBGOUKEI()));
			String SHOUHINSOUGAKUUSD = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A011DataCheckEntity.getUSDGOUKEI()));
		if (pageActionMode.equals("2")) {
				A011InsertSaveDao.A011InsertSaveData(SHUTSUNYUUKOFURAGU,CHUUMONHIDZUKE,CHUUBUNSHONO,SHUKKANO,MITSUMORISHONO,KYAKUSAKIID,KYAKUSAKITANTOU,ADORESU,DENWABANGOU,RESHIITONO,SHANAIKOUJIBANGOU,HINMEI,TANTOUSHAID,KEIYAKUSAKI,NOUKIYOTEIBI,NOUNYUUBI,SHOUHINSOUGAKUJPY,SHOUHINSOUGAKURMB,SHOUHINSOUGAKUUSD);
		} else if (pageActionMode.equals("1")) {
			A011UpdateSaveDao.A011UpdateSaveData(SHUTSUNYUUKOFURAGU,CHUUMONHIDZUKE,CHUUBUNSHONO,SHUKKANO,MITSUMORISHONO,KYAKUSAKIID,KYAKUSAKITANTOU,ADORESU,DENWABANGOU,RESHIITONO,SHANAIKOUJIBANGOU,HINMEI,TANTOUSHAID,KEIYAKUSAKI,NOUKIYOTEIBI,NOUNYUUBI,SHOUHINSOUGAKUJPY,SHOUHINSOUGAKURMB,SHOUHINSOUGAKUUSD,CHUUBUNSHONO);
		}
			String gridOpFlg = null;
		int RowLine95 = StringUtil.changeStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid95")));
		for (int u = 0; u <= RowLine95; u++) {
			gridOpFlg = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid"+"95"+"flg" + (u+1))));
					String KUBUN = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KUBUN_"+u)));
					String KOUMOKU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KOUMOKU_"+u)));
					String SUURYOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("SUURYOU_"+u)));
					String HANBAITANKA = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("HANBAITANKA_"+u)));
					String KAHEI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KAHEI_"+u)));
					String HANBAIKINGAKU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("HANBAIKINGAKU_"+u)));
					String TSUKAMATSUNYUUKINGAKUJPY = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUKINGAKUJPY_"+u)));
					String TSUKAMATSUNYUUKINGAKURMB = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUKINGAKURMB_"+u)));
					String TSUKAMATSUNYUUKINGAKUUSD = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUKINGAKUUSD_"+u)));
					String SHUKKOFURAGU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("SHUKKOFURAGU_"+u)));
					String CHUUBUNSHOMEISAINO = null;
				if (!StringUtil.isNullOrBlank(gridOpFlg) && ("0".equals(gridOpFlg) || "1".equals(gridOpFlg))) {
					CHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHOMEISAINO_"+u)));
				} else if (!StringUtil.isNullOrBlank(gridOpFlg) && "2".equals(gridOpFlg)) {
					CHUUBUNSHOMEISAINO = getAutonumValue("TYUMONSYOMEISAI" , "CHUUBUNSHOMEISAINO");
				}
			if (!StringUtil.isNullOrBlank(gridOpFlg) && "0".equals(gridOpFlg)) { 
				A011Delete95GridSaveDao.A011Delete95GridSaveData(CHUUBUNSHONO,CHUUBUNSHOMEISAINO);
			} else if (!StringUtil.isNullOrBlank(gridOpFlg) && "1".equals(gridOpFlg)) { 
				A011Update95GridSaveDao.A011Update95GridSaveData(KUBUN,KOUMOKU,SUURYOU,HANBAITANKA,KAHEI,HANBAIKINGAKU,TSUKAMATSUNYUUKINGAKUJPY,TSUKAMATSUNYUUKINGAKURMB,TSUKAMATSUNYUUKINGAKUUSD,SHUKKOFURAGU,CHUUBUNSHONO,CHUUBUNSHOMEISAINO,CHUUBUNSHONO,CHUUBUNSHOMEISAINO);
			}  else if (!StringUtil.isNullOrBlank(gridOpFlg) && "2".equals(gridOpFlg)) { 
				A011Insert95GridSaveDao.A011Insert95GridSaveData(KUBUN,KOUMOKU,SUURYOU,HANBAITANKA,KAHEI,HANBAIKINGAKU,TSUKAMATSUNYUUKINGAKUJPY,TSUKAMATSUNYUUKINGAKURMB,TSUKAMATSUNYUUKINGAKUUSD,SHUKKOFURAGU,CHUUBUNSHONO,CHUUBUNSHOMEISAINO);
			}
		}

			A011PageAfterSave1Service.A011PageAfterSave1(request, jsonObj);
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
