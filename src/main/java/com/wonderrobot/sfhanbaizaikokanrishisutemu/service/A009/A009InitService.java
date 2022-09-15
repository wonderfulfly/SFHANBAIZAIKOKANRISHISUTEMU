package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009KYAKUSAKIKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009KYAKUSAKIKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009TANTOUSHASYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009TANTOUSHASYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009KANTOKU1SYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009KANTOKU1SYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009NYUKINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009NYUKINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009grdB8NYUKINMEISAIEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009grdB8NYUKINMEISAIDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A009.A009GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009NYUKINMEISAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009NYUKINMEISAIEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009InitService
 *      Page: 入金管理詳細
 * @version

 */

@Service
public class A009InitService {
	@Autowired
	private A009KYAKUSAKIKAISYADao A009KYAKUSAKIKAISYADao;
	@Autowired
	private A009TANTOUSHASYAINDao A009TANTOUSHASYAINDao;
	@Autowired
	private A009KANTOKU1SYAINDao A009KANTOKU1SYAINDao;
	@Autowired
	private A009NYUKINDao A009NYUKINDao;
	@Autowired
	private A009grdB8NYUKINMEISAIDao A009grdB8NYUKINMEISAIDao;
	@Autowired
	private A009NYUKINMEISAIDao A009NYUKINMEISAIDao;
	@Autowired
	private A009PageAfterLoad1Service A009PageAfterLoad1Service;

   
	@Log
	public void A009KYAKUSAKIInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A009KYAKUSAKIKAISYAEntity> A009KYAKUSAKIKAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A009KYAKUSAKIKAISYAEntity A009KYAKUSAKIKAISYAEntity = null;
		String opValue = null;
		String opText = null;
		A009KYAKUSAKIKAISYAEntityList = A009KYAKUSAKIKAISYADao.A009KYAKUSAKIdrp();
		sBuffer = new StringBuffer();
		
		if (A009KYAKUSAKIKAISYAEntityList != null && A009KYAKUSAKIKAISYAEntityList .size() > 0) {
			for (int i = 0; i < A009KYAKUSAKIKAISYAEntityList.size(); i++) {
				A009KYAKUSAKIKAISYAEntity = A009KYAKUSAKIKAISYAEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A009KYAKUSAKIKAISYAEntity.getKAISHAID());
				opText = StringUtil.changeNullToBlank(A009KYAKUSAKIKAISYAEntity.getKAISHAMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KYAKUSAKI\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A009KYAKUSAKIInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KYAKUSAKI', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	public void A009TANTOUSHAInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A009TANTOUSHASYAINEntity> A009TANTOUSHASYAINEntityList = null;
		StringBuffer sBuffer = null;
		A009TANTOUSHASYAINEntity A009TANTOUSHASYAINEntity = null;
		String opValue = null;
		String opText = null;
		A009TANTOUSHASYAINEntityList = A009TANTOUSHASYAINDao.A009TANTOUSHAdrp();
		sBuffer = new StringBuffer();
		
		if (A009TANTOUSHASYAINEntityList != null && A009TANTOUSHASYAINEntityList .size() > 0) {
			for (int i = 0; i < A009TANTOUSHASYAINEntityList.size(); i++) {
				A009TANTOUSHASYAINEntity = A009TANTOUSHASYAINEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A009TANTOUSHASYAINEntity.getSHAINID());
				opText = StringUtil.changeNullToBlank(A009TANTOUSHASYAINEntity.getSHAINMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"TANTOUSHA\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A009TANTOUSHAInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('TANTOUSHA', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	public void A009KANTOKU1Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A009KANTOKU1SYAINEntity> A009KANTOKU1SYAINEntityList = null;
		StringBuffer sBuffer = null;
		A009KANTOKU1SYAINEntity A009KANTOKU1SYAINEntity = null;
		String opValue = null;
		String opText = null;
		A009KANTOKU1SYAINEntityList = A009KANTOKU1SYAINDao.A009KANTOKU1drp();
		sBuffer = new StringBuffer();
		
		if (A009KANTOKU1SYAINEntityList != null && A009KANTOKU1SYAINEntityList .size() > 0) {
			for (int i = 0; i < A009KANTOKU1SYAINEntityList.size(); i++) {
				A009KANTOKU1SYAINEntity = A009KANTOKU1SYAINEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A009KANTOKU1SYAINEntity.getSHAINID());
				opText = StringUtil.changeNullToBlank(A009KANTOKU1SYAINEntity.getSHAINMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KANTOKU1\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A009KANTOKU1InitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KANTOKU1', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A009JISSAINYUUKINJOUTAI1Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		
		opValue = StringUtil.changeNullToBlank("1");
		opText = StringUtil.changeNullToBlank("未入金");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("2");
		opText = StringUtil.changeNullToBlank("入金済み");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"JISSAINYUUKINJOUTAI1\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A009JISSAINYUUKINJOUTAI1InitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('JISSAINYUUKINJOUTAI1', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A009pageInitValueSetByDefault (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String RYOUSHUUSHONODefault = null;
		//領収書NO
		RYOUSHUUSHONODefault = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RYOUSHUUSHONO")));
		if (StringUtil.isNullOrBlank(RYOUSHUUSHONODefault)) {
			RYOUSHUUSHONODefault = "[自動採番]";
		}
		jsonObj.setScript("r", "$('#RYOUSHUUSHONO').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(RYOUSHUUSHONODefault)) + "');");

	}

   
	@Log
	private void A009pageInitValueSetByDB (List<A009NYUKINEntity> A009NYUKINEntityList, JSONWFCObject jsonObj) throws Exception {

		A009NYUKINEntity A009NYUKINEntity = null;
		if (A009NYUKINEntityList != null && A009NYUKINEntityList.size() == 1) {
			A009NYUKINEntity = A009NYUKINEntityList.get(0);
		}
		if (A009NYUKINEntity != null) {
			A009KYAKUSAKIInitSelected(A009NYUKINEntity.getKYAKUSAKIID(), jsonObj);
			A009TANTOUSHAInitSelected(A009NYUKINEntity.getTANTOUSHAID(), jsonObj);
			jsonObj.setScript("r", "$('#RYOUSHUUSHONO').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A009NYUKINEntity.getRESHIITONO())) + "');");
			jsonObj.setScript("r", "$('#CHUUBUNSHONO1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A009NYUKINEntity.getCHUUBUNSHONO())) + "');");
			A009KANTOKU1InitSelected(A009NYUKINEntity.getKANTOKU(), jsonObj);
			jsonObj.setScript("r", "$('#CHUUMONHIDZUKE1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A009NYUKINEntity.getCHUUMONHIDZUKE())) + "');");
			jsonObj.setScript("r", "$('#NYUUKINKINGAKU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(String.valueOf(A009NYUKINEntity.getNYUUKINKINGAKU()))) + "');");
			A009JISSAINYUUKINJOUTAI1InitSelected(A009NYUKINEntity.getJISSAINYUUKINJOUTAI(), jsonObj);
		}

	}

   
	@Log
	private void A009grdB8pageInitGridValueSetByDB (List<A009grdB8NYUKINMEISAIEntity> A009grdB8NYUKINMEISAIEntityList, JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		ArrayList<LinkedHashMap<String, String>> A009grdB8NYUKINMEISAIEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		
		A009grdB8NYUKINMEISAIEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A009grdB8NYUKINMEISAIEntityList != null && A009grdB8NYUKINMEISAIEntityList.size() > 0) {
			for (int i = 0;i < A009grdB8NYUKINMEISAIEntityList.size();i++) {
				A009grdB8NYUKINMEISAIEntity A009grdB8NYUKINMEISAIEntity_i = A009grdB8NYUKINMEISAIEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("NYUKINMEISAI_SHIHARAIHIDZUKE", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getSHIHARAIHIDZUKE()));
				selMap.put("NYUKINMEISAI_SHIHARAIWARIAI", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getSHIHARAIWARIAI()));
				selMap.put("NYUKINMEISAI_FURIDASHIZUMIHIDZUKE", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getFURIDASHIZUMIHIDZUKE()));
				selMap.put("NYUKINMEISAI_FURIDASHIZUMIKINGAKU", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getFURIDASHIZUMIKINGAKU()));
				selMap.put("NYUKINMEISAI_FURIDASHIZUMIWARIAI", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getFURIDASHIZUMIWARIAI()));
				selMap.put("NYUKINMEISAI_NYUUKINZUMIHIDZUKE", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getNYUUKINZUMIHIDZUKE()));
				selMap.put("NYUKINMEISAI_NYUUKINZUMIKINGAKU", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getNYUUKINZUMIKINGAKU()));
				selMap.put("NYUKINMEISAI_NYUUKINZUMIWARIAI", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getNYUUKINZUMIWARIAI()));
				selMap.put("NYUKINMEISAI_RESHIITOMEISAINO", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getRESHIITOMEISAINO()));
				selMap.put("NYUKINMEISAI_RESHIITONO", StringUtil.changeNullToBlank(A009grdB8NYUKINMEISAIEntity_i.getRESHIITONO()));
				A009grdB8NYUKINMEISAIEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A009GridDataConstant.getGridStrSet(A009grdB8NYUKINMEISAIEntityAy, "P00011", "61", 0, 1);
		jsonObj.setScript("r", "setGrid61();$('div#_ingrid_Grid61_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB61", returnVal);
		jsonObj.setReturnID("h", "dragB61");
		
		A009GridDataConstant.setGridDataToSession("P00011", "61", A009grdB8NYUKINMEISAIEntityAy, request);

	}

   
	@Log
	public void A009Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		//RYOUSHUUSHONO
		String RYOUSHUUSHONO = null;
		List<A009NYUKINEntity> A009NYUKINEntityList = null;
		List<A009grdB8NYUKINMEISAIEntity> A009grdB8NYUKINMEISAIEntityList = null;
		A009KYAKUSAKIInit(request, jsonObj);
		A009TANTOUSHAInit(request, jsonObj);
		A009KANTOKU1Init(request, jsonObj);
		A009JISSAINYUUKINJOUTAI1Init(request, jsonObj);
		A009pageInitValueSetByDefault(request, jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("1".equals(mode)) {
			RYOUSHUUSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RYOUSHUUSHONO")));
			A009NYUKINEntityList = A009NYUKINDao.A009InitDepthZero(RYOUSHUUSHONO);
			A009pageInitValueSetByDB(A009NYUKINEntityList, jsonObj);
			A009grdB8NYUKINMEISAIEntityList = A009grdB8NYUKINMEISAIDao.A009InitGrid(RYOUSHUUSHONO);
		}
		A009grdB8pageInitGridValueSetByDB(A009grdB8NYUKINMEISAIEntityList, jsonObj, request);
		A009PageAfterLoad1Service.A009PageAfterLoad1(request, jsonObj);

	}
}