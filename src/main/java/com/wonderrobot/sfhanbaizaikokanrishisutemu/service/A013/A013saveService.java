package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013InsertSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013UpdateSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013Delete99GridSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013Update99GridSaveDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013Insert99GridSaveDao;

import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.honnzonngosyoriService;
/**
*  ＠project
*  ＠comment
*  class：A013saveService
*  Page：部品管理画面
*  @verson
**/
@Service
@Transactional(rollbackFor=Exception.class)
public class A013saveService {
	@Autowired
	private GetMaxNumValueDao GetMaxNumValueDao;
	@Autowired
	private Properties springSystemProperties;
	@Autowired
	private A013InsertSaveDao A013InsertSaveDao;
	@Autowired
	private A013UpdateSaveDao A013UpdateSaveDao;
	@Autowired
	private A013Update99GridSaveDao A013Update99GridSaveDao;
	@Autowired
	private A013Delete99GridSaveDao A013Delete99GridSaveDao;
	@Autowired
	private A013Insert99GridSaveDao A013Insert99GridSaveDao;

	@Autowired
	private honnzonngosyoriService honnzonngosyoriService;
	@Log
	public void A013F20091208153604208(HttpServletRequest request, A013DataCheckEntity A013DataCheckEntity,JSONWFCObject jsonObj) throws Exception {
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
			String TOKUISAKI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getTOKUISAKIUSER()));
			String MAISUU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getMAISUU1()));
			String ASENBURIRAIN = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getASENBURIRAINMEISHOU()));
			String KAKUTEIKUBUN = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getKAKUTEIKUBUN1()));
			String KIKAIMEISHOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getKIKAIMEISHOUMC()));
			String BUHINMEISHOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getBUHINMEISHOUPART()));
			String CHUUBUNSHONO = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getBUHINCHUUBUNSHONO()));
		AlKeyData.add(new ArrayList<String>(Arrays.asList(new String[] { "BUHINCHUUBUNSHONO" , CHUUBUNSHONO })));
			String SEISAKUSUU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getSEISAKUSUUQTY()));
			String TANTOUSHA = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getTANTOUSHA1()));
			String KOUJIKANRIBANGOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getKOUJIKANRIBANGOU1()));
		AlKeyData.add(new ArrayList<String>(Arrays.asList(new String[] { "KOUJIKANRIBANGOU1" , KOUJIKANRIBANGOU })));
			String SHUKKANO = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getSHUKKANO1()));
			String JPYGOUKEIKINGAKU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getJPYGOUKEI()));
			String RMBGOUKEIKINGAKU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getRMBGOUKEI()));
			String USDGOUKEIKINGAKU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getUSDGOUKEI()));
			String CHUUBUNSHOMEISAINO = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(A013DataCheckEntity.getBUHINCHUUBUNSHOMEISAINO()));
		AlKeyData.add(new ArrayList<String>(Arrays.asList(new String[] { "BUHINCHUUBUNSHOMEISAINO" , CHUUBUNSHOMEISAINO })));
		if (pageActionMode.equals("2")) {
				A013InsertSaveDao.A013InsertSaveData(TOKUISAKI,MAISUU,ASENBURIRAIN,KAKUTEIKUBUN,KIKAIMEISHOU,BUHINMEISHOU,CHUUBUNSHONO,SEISAKUSUU,TANTOUSHA,KOUJIKANRIBANGOU,SHUKKANO,JPYGOUKEIKINGAKU,RMBGOUKEIKINGAKU,USDGOUKEIKINGAKU,CHUUBUNSHOMEISAINO);
		} else if (pageActionMode.equals("1")) {
			A013UpdateSaveDao.A013UpdateSaveData(TOKUISAKI,MAISUU,ASENBURIRAIN,KAKUTEIKUBUN,KIKAIMEISHOU,BUHINMEISHOU,CHUUBUNSHONO,SEISAKUSUU,TANTOUSHA,KOUJIKANRIBANGOU,SHUKKANO,JPYGOUKEIKINGAKU,RMBGOUKEIKINGAKU,USDGOUKEIKINGAKU,CHUUBUNSHOMEISAINO,CHUUBUNSHONO,CHUUBUNSHOMEISAINO,KOUJIKANRIBANGOU);
		}
			String gridOpFlg = null;
		int RowLine99 = StringUtil.changeStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid99")));
		for (int u = 0; u <= RowLine99; u++) {
			gridOpFlg = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid"+"99"+"flg" + (u+1))));
					String SEISAKUHINKUBUN = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("SEISAKUHINKUBUN_"+u)));
					String HINBANNO1 = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("HINBANNO1_"+u)));
					String HINMEI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("HINMEI_"+u)));
					String KOSUU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KOSUU_"+u)));
					String SOUKOSUU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("SOUKOSUU_"+u)));
					String TSUKAMATSUNYUUSAKI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUSAKI_"+u)));
					String KIBOUNOUKI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KIBOUNOUKI_"+u)));
					String TANTOU = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("TANTOU_"+u)));
					String TEHAISAKI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("TEHAISAKI_"+u)));
					String KOUNYUUTANKA = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KOUNYUUTANKA_"+u)));
					String KAHEI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KAHEI_"+u)));
					String TEHAIBI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("TEHAIBI_"+u)));
					String NYUUKABI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("NYUUKABI_"+u)));
					String SHOUKEI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("SHOUKEI_"+u)));
					String KAKOTANKA = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KAKOTANKA_"+u)));
					String KIBOUTANKA = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KIBOUTANKA_"+u)));
					String NYUUKAYOTEIBI = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("NYUUKAYOTEIBI_"+u)));
					String HINBANNO = null;
				if (!StringUtil.isNullOrBlank(gridOpFlg) && ("0".equals(gridOpFlg) || "1".equals(gridOpFlg))) {
					HINBANNO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("HINBANNO_"+u)));
				} else if (!StringUtil.isNullOrBlank(gridOpFlg) && "2".equals(gridOpFlg)) {
					HINBANNO = getAutonumValue("BUHINSYOUSAI" , "HINBANNO");
				}
					KAKUTEIKUBUN = StringUtil.changeBlankToNull(StringUtil.escapeSQLTags(request.getParameter("KAKUTEIKUBUN2_"+u)));
			if (!StringUtil.isNullOrBlank(gridOpFlg) && "0".equals(gridOpFlg)) { 
				A013Delete99GridSaveDao.A013Delete99GridSaveData(CHUUBUNSHONO,CHUUBUNSHOMEISAINO,HINBANNO);
			} else if (!StringUtil.isNullOrBlank(gridOpFlg) && "1".equals(gridOpFlg)) { 
				A013Update99GridSaveDao.A013Update99GridSaveData(SEISAKUHINKUBUN,HINBANNO1,HINMEI,KOSUU,SOUKOSUU,TSUKAMATSUNYUUSAKI,KIBOUNOUKI,TANTOU,TEHAISAKI,KOUNYUUTANKA,KAHEI,TEHAIBI,NYUUKABI,SHOUKEI,KAKOTANKA,CHUUBUNSHOMEISAINO,CHUUBUNSHONO,KIBOUTANKA,NYUUKAYOTEIBI,HINBANNO,KAKUTEIKUBUN,KOUJIKANRIBANGOU,CHUUBUNSHONO,CHUUBUNSHOMEISAINO,HINBANNO);
			}  else if (!StringUtil.isNullOrBlank(gridOpFlg) && "2".equals(gridOpFlg)) { 
				A013Insert99GridSaveDao.A013Insert99GridSaveData(SEISAKUHINKUBUN,HINBANNO1,HINMEI,KOSUU,SOUKOSUU,TSUKAMATSUNYUUSAKI,KIBOUNOUKI,TANTOU,TEHAISAKI,KOUNYUUTANKA,KAHEI,TEHAIBI,NYUUKABI,SHOUKEI,KAKOTANKA,CHUUBUNSHOMEISAINO,CHUUBUNSHONO,KIBOUTANKA,NYUUKAYOTEIBI,HINBANNO,KAKUTEIKUBUN,KOUJIKANRIBANGOU);
			}
		}

			honnzonngosyoriService.honnzonngosyori(request, jsonObj);
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
