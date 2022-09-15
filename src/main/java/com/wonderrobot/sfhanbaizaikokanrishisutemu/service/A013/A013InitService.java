package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013TANTOUSHA1SYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013TANTOUSHA1SYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013TANTOUSYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013TANTOUSYAINDao;
import com.wonderfulfly.common.DefaultValueUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013BUHINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013BUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16BUHINSYOUSAIEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16BUHINSYOUSAIDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A013.A013GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013InitService
 *      Page: 部品管理画面
 * @version

 */

@Service
public class A013InitService {
	@Autowired
	private A013TANTOUSHA1SYAINDao A013TANTOUSHA1SYAINDao;
	@Autowired
	private A013TANTOUSYAINDao A013TANTOUSYAINDao;
	@Autowired
	private A013BUHINDao A013BUHINDao;
	@Autowired
	private A013grdB16BUHINSYOUSAIDao A013grdB16BUHINSYOUSAIDao;

   
	@Log
	public void A013TANTOUSHA1Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A013TANTOUSHA1SYAINEntity> A013TANTOUSHA1SYAINEntityList = null;
		StringBuffer sBuffer = null;
		A013TANTOUSHA1SYAINEntity A013TANTOUSHA1SYAINEntity = null;
		String opValue = null;
		String opText = null;
		A013TANTOUSHA1SYAINEntityList = A013TANTOUSHA1SYAINDao.A013TANTOUSHA1drp();
		sBuffer = new StringBuffer();
		
		if (A013TANTOUSHA1SYAINEntityList != null && A013TANTOUSHA1SYAINEntityList .size() > 0) {
			for (int i = 0; i < A013TANTOUSHA1SYAINEntityList.size(); i++) {
				A013TANTOUSHA1SYAINEntity = A013TANTOUSHA1SYAINEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A013TANTOUSHA1SYAINEntity.getSHAINID());
				opText = StringUtil.changeNullToBlank(A013TANTOUSHA1SYAINEntity.getSHAINMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"TANTOUSHA1\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A013TANTOUSHA1InitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('TANTOUSHA1', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	public void A013TANTOUInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A013TANTOUSYAINEntity> A013TANTOUSYAINEntityList = null;
		StringBuffer sBuffer = null;
		A013TANTOUSYAINEntity A013TANTOUSYAINEntity = null;
		String opValue = null;
		String opText = null;
		A013TANTOUSYAINEntityList = A013TANTOUSYAINDao.A013TANTOUdrp();
		sBuffer = new StringBuffer();
		
		if (A013TANTOUSYAINEntityList != null && A013TANTOUSYAINEntityList .size() > 0) {
			for (int i = 0; i < A013TANTOUSYAINEntityList.size(); i++) {
				A013TANTOUSYAINEntity = A013TANTOUSYAINEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A013TANTOUSYAINEntity.getSHAINID());
				opText = StringUtil.changeNullToBlank(A013TANTOUSYAINEntity.getSHAINMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"TANTOU\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A013TANTOUInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('TANTOU', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A013KAHEIInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		
		opValue = StringUtil.changeNullToBlank("0");
		opText = StringUtil.changeNullToBlank("JPY");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("1");
		opText = StringUtil.changeNullToBlank("RMB");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("2");
		opText = StringUtil.changeNullToBlank("USD");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KAHEI\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A013KAHEIInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KAHEI', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A013SEISAKUHINKUBUNInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		
		opValue = StringUtil.changeNullToBlank("0");
		opText = StringUtil.changeNullToBlank("加工件");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("1");
		opText = StringUtil.changeNullToBlank("購入品");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"SEISAKUHINKUBUN\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A013SEISAKUHINKUBUNInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('SEISAKUHINKUBUN', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A013pageInitValueSetByDefault (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String KUDARISUUDefault = null;
		String GENZAINICHIDZUKEDefault = null;
		//行数
		KUDARISUUDefault = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KUDARISUU")));
		if (StringUtil.isNullOrBlank(KUDARISUUDefault)) {
			KUDARISUUDefault = "30";
		}
		//現在日付
		GENZAINICHIDZUKEDefault = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("GENZAINICHIDZUKE")));
		if (StringUtil.isNullOrBlank(GENZAINICHIDZUKEDefault)) {
			GENZAINICHIDZUKEDefault = DefaultValueUtil.getSystemToday();
		}
		jsonObj.setScript("r", "$('#KUDARISUU').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(KUDARISUUDefault)) + "');");
		jsonObj.setScript("r", "$('#GENZAINICHIDZUKE').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(GENZAINICHIDZUKEDefault)) + "');");

	}

   
	@Log
	private void A013pageInitValueSetByDB (List<A013BUHINEntity> A013BUHINEntityList, JSONWFCObject jsonObj) throws Exception {

		A013BUHINEntity A013BUHINEntity = null;
		if (A013BUHINEntityList != null && A013BUHINEntityList.size() == 1) {
			A013BUHINEntity = A013BUHINEntityList.get(0);
		}
		if (A013BUHINEntity != null) {
			jsonObj.setScript("r", "$('#TOKUISAKIUSER').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getTOKUISAKI())) + "');");
			jsonObj.setScript("r", "$('#MAISUU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getMAISUU())) + "');");
			jsonObj.setScript("r", "$('#ASENBURIRAINMEISHOU').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getASENBURIRAIN())) + "');");
			jsonObj.setScript("r", "$('#KAKUTEIKUBUN1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getKAKUTEIKUBUN())) + "');");
			jsonObj.setScript("r", "$('#KIKAIMEISHOUMC').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getKIKAIMEISHOU())) + "');");
			jsonObj.setScript("r", "$('#BUHINMEISHOUPART').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getBUHINMEISHOU())) + "');");
			jsonObj.setScript("r", "$('#BUHINCHUUBUNSHONO').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getCHUUBUNSHONO())) + "');");
			jsonObj.setScript("r", "$('#SEISAKUSUUQTY').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(StringUtil.ChangeIntToString(A013BUHINEntity.getSEISAKUSUU()))) + "');");
			A013TANTOUSHA1InitSelected(A013BUHINEntity.getTANTOUSHA(), jsonObj);
			jsonObj.setScript("r", "$('#KOUJIKANRIBANGOU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getKOUJIKANRIBANGOU())) + "');");
			jsonObj.setScript("r", "$('#SHUKKANO1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getSHUKKANO())) + "');");
			jsonObj.setScript("r", "$('#JPYGOUKEI').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(String.valueOf(A013BUHINEntity.getJPYGOUKEIKINGAKU()))) + "');");
			jsonObj.setScript("r", "$('#RMBGOUKEI').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(String.valueOf(A013BUHINEntity.getRMBGOUKEIKINGAKU()))) + "');");
			jsonObj.setScript("r", "$('#USDGOUKEI').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(String.valueOf(A013BUHINEntity.getUSDGOUKEIKINGAKU()))) + "');");
			jsonObj.setScript("r", "$('#BUHINCHUUBUNSHOMEISAINO').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A013BUHINEntity.getCHUUBUNSHOMEISAINO())) + "');");
		}

	}

   
	@Log
	private void A013grdB16pageInitGridValueSetByDB (List<A013grdB16BUHINSYOUSAIEntity> A013grdB16BUHINSYOUSAIEntityList, JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		ArrayList<LinkedHashMap<String, String>> A013grdB16BUHINSYOUSAIEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		
		A013grdB16BUHINSYOUSAIEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A013grdB16BUHINSYOUSAIEntityList != null && A013grdB16BUHINSYOUSAIEntityList.size() > 0) {
			for (int i = 0;i < A013grdB16BUHINSYOUSAIEntityList.size();i++) {
				A013grdB16BUHINSYOUSAIEntity A013grdB16BUHINSYOUSAIEntity_i = A013grdB16BUHINSYOUSAIEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("BUHINSYOUSAI_HINBANNO1", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getHINBANNO1()));
				selMap.put("BUHINSYOUSAI_HINMEI", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getHINMEI()));
				selMap.put("BUHINSYOUSAI_KOSUU", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getKOSUU()));
				selMap.put("BUHINSYOUSAI_SOUKOSUU", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getSOUKOSUU()));
				selMap.put("BUHINSYOUSAI_TSUKAMATSUNYUUSAKI", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getTSUKAMATSUNYUUSAKI()));
				selMap.put("BUHINSYOUSAI_KIBOUNOUKI", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getKIBOUNOUKI()));
				selMap.put("BUHINSYOUSAI_TEHAISAKI", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getTEHAISAKI()));
				selMap.put("BUHINSYOUSAI_KOUNYUUTANKA", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getKOUNYUUTANKA()));
				selMap.put("BUHINSYOUSAI_TEHAIBI", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getTEHAIBI()));
				selMap.put("BUHINSYOUSAI_NYUUKABI", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getNYUUKABI()));
				selMap.put("BUHINSYOUSAI_SHOUKEI", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getSHOUKEI()));
				selMap.put("BUHINSYOUSAI_KAKOTANKA", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getKAKOTANKA()));
				selMap.put("BUHINSYOUSAI_CHUUBUNSHOMEISAINO", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getCHUUBUNSHOMEISAINO()));
				selMap.put("BUHINSYOUSAI_CHUUBUNSHONO", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getCHUUBUNSHONO()));
				selMap.put("BUHINSYOUSAI_KIBOUTANKA", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getKIBOUTANKA()));
				selMap.put("BUHINSYOUSAI_NYUUKAYOTEIBI", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getNYUUKAYOTEIBI()));
				selMap.put("BUHINSYOUSAI_HINBANNO", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getHINBANNO()));
				selMap.put("BUHINSYOUSAI_KAKUTEIKUBUN", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getKAKUTEIKUBUN()));
				selMap.put("BUHINSYOUSAI_KOUJIKANRIBANGOU", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getKOUJIKANRIBANGOU()));
				selMap.put("BUHINSYOUSAI_KAHEI", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getKAHEI()));
				selMap.put("BUHINSYOUSAI_SEISAKUHINKUBUN", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getSEISAKUHINKUBUN()));
				selMap.put("BUHINSYOUSAI_TANTOU", StringUtil.changeNullToBlank(A013grdB16BUHINSYOUSAIEntity_i.getTANTOU()));
				A013grdB16BUHINSYOUSAIEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A013GridDataConstant.getGridStrSet(A013grdB16BUHINSYOUSAIEntityAy, "P00012", "99", 0, 1);
		jsonObj.setScript("r", "setGrid99();$('div#_ingrid_Grid99_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB99", returnVal);
		jsonObj.setReturnID("h", "dragB99");
		
		A013GridDataConstant.setGridDataToSession("P00012", "99", A013grdB16BUHINSYOUSAIEntityAy, request);

	}

   
	@Log
	public void A013Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		//BUHINCHUUBUNSHONO
		String BUHINCHUUBUNSHONO = null;
		//KOUJIKANRIBANGOU1
		String KOUJIKANRIBANGOU1 = null;
		//BUHINCHUUBUNSHOMEISAINO
		String BUHINCHUUBUNSHOMEISAINO = null;
		List<A013BUHINEntity> A013BUHINEntityList = null;
		List<A013grdB16BUHINSYOUSAIEntity> A013grdB16BUHINSYOUSAIEntityList = null;
		A013TANTOUSHA1Init(request, jsonObj);
		A013TANTOUInit(request, jsonObj);
		A013KAHEIInit(request, jsonObj);
		A013SEISAKUHINKUBUNInit(request, jsonObj);
		A013pageInitValueSetByDefault(request, jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("".equals(mode) || StringUtil.isNullOrBlank(mode)) {
			mode = "1";
		}
		if ("1".equals(mode)) {
			BUHINCHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHONO")));
			KOUJIKANRIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIKANRIBANGOU1")));
			BUHINCHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHOMEISAINO")));
			A013BUHINEntityList = A013BUHINDao.A013InitDepthZero(BUHINCHUUBUNSHONO, KOUJIKANRIBANGOU1, BUHINCHUUBUNSHOMEISAINO);
			A013pageInitValueSetByDB(A013BUHINEntityList, jsonObj);
			A013grdB16BUHINSYOUSAIEntityList = A013grdB16BUHINSYOUSAIDao.A013InitGrid(BUHINCHUUBUNSHOMEISAINO, BUHINCHUUBUNSHONO, KOUJIKANRIBANGOU1);
		}
		A013grdB16pageInitGridValueSetByDB(A013grdB16BUHINSYOUSAIEntityList, jsonObj, request);
		jsonObj.setScript("r", "A013PageAfterLoad1();");

	}
}