package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011KYAKUSAKIMEISHOUKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011KYAKUSAKIMEISHOUKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TANTOUSHASYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011TANTOUSHASYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TYUMONSYOEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011TYUMONSYODao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011grdB18TYUMONSYOMEISAIEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011grdB18TYUMONSYOMEISAIDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A011.A011GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011TYUMONSYOMEISAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TYUMONSYOMEISAIEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011InitService
 *      Page: 注文管理詳細
 * @version

 */

@Service
public class A011InitService {
	@Autowired
	private A011KYAKUSAKIMEISHOUKAISYADao A011KYAKUSAKIMEISHOUKAISYADao;
	@Autowired
	private A011TANTOUSHASYAINDao A011TANTOUSHASYAINDao;
	@Autowired
	private A011TYUMONSYODao A011TYUMONSYODao;
	@Autowired
	private A011grdB18TYUMONSYOMEISAIDao A011grdB18TYUMONSYOMEISAIDao;
	@Autowired
	private A011TYUMONSYOMEISAIDao A011TYUMONSYOMEISAIDao;
	@Autowired
	private A011PageAfterLoad1Service A011PageAfterLoad1Service;

   
	@Log
	private void A011SHUTSUNYUUKOFURAGU1Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		
		opValue = StringUtil.changeNullToBlank("1");
		opText = StringUtil.changeNullToBlank("未出庫");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("2");
		opText = StringUtil.changeNullToBlank("出庫済み");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"SHUTSUNYUUKOFURAGU1\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A011SHUTSUNYUUKOFURAGU1InitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('SHUTSUNYUUKOFURAGU1', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	public void A011KYAKUSAKIMEISHOUInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A011KYAKUSAKIMEISHOUKAISYAEntity> A011KYAKUSAKIMEISHOUKAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A011KYAKUSAKIMEISHOUKAISYAEntity A011KYAKUSAKIMEISHOUKAISYAEntity = null;
		String opValue = null;
		String opText = null;
		A011KYAKUSAKIMEISHOUKAISYAEntityList = A011KYAKUSAKIMEISHOUKAISYADao.A011KYAKUSAKIMEISHOUdrp();
		sBuffer = new StringBuffer();
		
		if (A011KYAKUSAKIMEISHOUKAISYAEntityList != null && A011KYAKUSAKIMEISHOUKAISYAEntityList .size() > 0) {
			for (int i = 0; i < A011KYAKUSAKIMEISHOUKAISYAEntityList.size(); i++) {
				A011KYAKUSAKIMEISHOUKAISYAEntity = A011KYAKUSAKIMEISHOUKAISYAEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A011KYAKUSAKIMEISHOUKAISYAEntity.getKAISHAID());
				opText = StringUtil.changeNullToBlank(A011KYAKUSAKIMEISHOUKAISYAEntity.getKAISHAMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KYAKUSAKIMEISHOU\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A011KYAKUSAKIMEISHOUInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KYAKUSAKIMEISHOU', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	public void A011TANTOUSHAInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A011TANTOUSHASYAINEntity> A011TANTOUSHASYAINEntityList = null;
		StringBuffer sBuffer = null;
		A011TANTOUSHASYAINEntity A011TANTOUSHASYAINEntity = null;
		String opValue = null;
		String opText = null;
		A011TANTOUSHASYAINEntityList = A011TANTOUSHASYAINDao.A011TANTOUSHAdrp();
		sBuffer = new StringBuffer();
		
		if (A011TANTOUSHASYAINEntityList != null && A011TANTOUSHASYAINEntityList .size() > 0) {
			for (int i = 0; i < A011TANTOUSHASYAINEntityList.size(); i++) {
				A011TANTOUSHASYAINEntity = A011TANTOUSHASYAINEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A011TANTOUSHASYAINEntity.getSHAINID());
				opText = StringUtil.changeNullToBlank(A011TANTOUSHASYAINEntity.getSHAINMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"TANTOUSHA\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A011TANTOUSHAInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('TANTOUSHA', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A011KAHEIInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

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
	private void A011KAHEIInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KAHEI', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A011KUBUNInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		
		opValue = StringUtil.changeNullToBlank("0");
		opText = StringUtil.changeNullToBlank("項目");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("1");
		opText = StringUtil.changeNullToBlank("人件費");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("2");
		opText = StringUtil.changeNullToBlank("運送費");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KUBUN\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A011KUBUNInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KUBUN', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A011pageInitValueSetByDefault (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String SHUTSUNYUUKOFURAGU1Default = null;
		String CHUUBUNSHONO1Default = null;
		//出入庫フラグ
		SHUTSUNYUUKOFURAGU1Default = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHUTSUNYUUKOFURAGU1")));
		if (StringUtil.isNullOrBlank(SHUTSUNYUUKOFURAGU1Default)) {
			SHUTSUNYUUKOFURAGU1Default = "1";
		}
		//注文書NO
		CHUUBUNSHONO1Default = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		if (StringUtil.isNullOrBlank(CHUUBUNSHONO1Default)) {
			CHUUBUNSHONO1Default = "[自動採番]";
		}
		A011SHUTSUNYUUKOFURAGU1InitSelected(SHUTSUNYUUKOFURAGU1Default, jsonObj);
		jsonObj.setScript("r", "$('#CHUUBUNSHONO1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(CHUUBUNSHONO1Default)) + "');");

	}

   
	@Log
	private void A011pageInitValueSetByDB (List<A011TYUMONSYOEntity> A011TYUMONSYOEntityList, JSONWFCObject jsonObj) throws Exception {

		A011TYUMONSYOEntity A011TYUMONSYOEntity = null;
		if (A011TYUMONSYOEntityList != null && A011TYUMONSYOEntityList.size() == 1) {
			A011TYUMONSYOEntity = A011TYUMONSYOEntityList.get(0);
		}
		if (A011TYUMONSYOEntity != null) {
			A011SHUTSUNYUUKOFURAGU1InitSelected(A011TYUMONSYOEntity.getSHUTSUNYUUKOFURAGU(), jsonObj);
			jsonObj.setScript("r", "$('#CHUUMONHIDZUKE1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getCHUUMONHIDZUKE())) + "');");
			jsonObj.setScript("r", "$('#CHUUBUNSHONO1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getCHUUBUNSHONO())) + "');");
			jsonObj.setScript("r", "$('#SHUKKANO1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getSHUKKANO())) + "');");
			jsonObj.setScript("r", "$('#MITSUMORISHONO1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getMITSUMORISHONO())) + "');");
			A011KYAKUSAKIMEISHOUInitSelected(A011TYUMONSYOEntity.getKYAKUSAKIID(), jsonObj);
			jsonObj.setScript("r", "$('#KYAKUSAKITANTOU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getKYAKUSAKITANTOU())) + "');");
			jsonObj.setScript("r", "$('#ADORESU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getADORESU())) + "');");
			jsonObj.setScript("r", "$('#DENWABANGOU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getDENWABANGOU())) + "');");
			jsonObj.setScript("r", "$('#RESHIITONO').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getRESHIITONO())) + "');");
			jsonObj.setScript("r", "$('#SHANAIKOUJIBANGOU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getSHANAIKOUJIBANGOU())) + "');");
			jsonObj.setScript("r", "$('#HINMEI1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getHINMEI())) + "');");
			A011TANTOUSHAInitSelected(A011TYUMONSYOEntity.getTANTOUSHAID(), jsonObj);
			jsonObj.setScript("r", "$('#KEIYAKUSAKI1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getKEIYAKUSAKI())) + "');");
			jsonObj.setScript("r", "$('#NOUKIYOTEIBI1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getNOUKIYOTEIBI())) + "');");
			jsonObj.setScript("r", "$('#NOUNYUUBI1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A011TYUMONSYOEntity.getNOUNYUUBI())) + "');");
			jsonObj.setScript("r", "$('#JPYGOUKEI').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(String.valueOf(A011TYUMONSYOEntity.getSHOUHINSOUGAKUJPY()))) + "');");
			jsonObj.setScript("r", "$('#RMBGOUKEI').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(String.valueOf(A011TYUMONSYOEntity.getSHOUHINSOUGAKURMB()))) + "');");
			jsonObj.setScript("r", "$('#USDGOUKEI').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(String.valueOf(A011TYUMONSYOEntity.getSHOUHINSOUGAKUUSD()))) + "');");
		}

	}

   
	@Log
	private void A011grdB18pageInitGridValueSetByDB (List<A011grdB18TYUMONSYOMEISAIEntity> A011grdB18TYUMONSYOMEISAIEntityList, JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		ArrayList<LinkedHashMap<String, String>> A011grdB18TYUMONSYOMEISAIEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		
		A011grdB18TYUMONSYOMEISAIEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A011grdB18TYUMONSYOMEISAIEntityList != null && A011grdB18TYUMONSYOMEISAIEntityList.size() > 0) {
			for (int i = 0;i < A011grdB18TYUMONSYOMEISAIEntityList.size();i++) {
				A011grdB18TYUMONSYOMEISAIEntity A011grdB18TYUMONSYOMEISAIEntity_i = A011grdB18TYUMONSYOMEISAIEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("TYUMONSYOMEISAI_KOUMOKU", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getKOUMOKU()));
				selMap.put("TYUMONSYOMEISAI_SUURYOU", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getSUURYOU()));
				selMap.put("TYUMONSYOMEISAI_HANBAITANKA", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getHANBAITANKA()));
				selMap.put("TYUMONSYOMEISAI_HANBAIKINGAKU", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getHANBAIKINGAKU()));
				selMap.put("TYUMONSYOMEISAI_TSUKAMATSUNYUUKINGAKUJPY", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getTSUKAMATSUNYUUKINGAKUJPY()));
				selMap.put("TYUMONSYOMEISAI_TSUKAMATSUNYUUKINGAKURMB", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getTSUKAMATSUNYUUKINGAKURMB()));
				selMap.put("TYUMONSYOMEISAI_TSUKAMATSUNYUUKINGAKUUSD", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getTSUKAMATSUNYUUKINGAKUUSD()));
				selMap.put("TYUMONSYOMEISAI_SHUKKOFURAGU", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getSHUKKOFURAGU()));
				selMap.put("TYUMONSYOMEISAI_CHUUBUNSHONO", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getCHUUBUNSHONO()));
				selMap.put("TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getCHUUBUNSHOMEISAINO()));
				selMap.put("TYUMONSYOMEISAI_KAHEI", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getKAHEI()));
				selMap.put("TYUMONSYOMEISAI_KUBUN", StringUtil.changeNullToBlank(A011grdB18TYUMONSYOMEISAIEntity_i.getKUBUN()));
				A011grdB18TYUMONSYOMEISAIEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A011GridDataConstant.getGridStrSet(A011grdB18TYUMONSYOMEISAIEntityAy, "P00011", "95", 0, 1);
		jsonObj.setScript("r", "setGrid95();$('div#_ingrid_Grid95_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB95", returnVal);
		jsonObj.setReturnID("h", "dragB95");
		
		A011GridDataConstant.setGridDataToSession("P00011", "95", A011grdB18TYUMONSYOMEISAIEntityAy, request);

	}

   
	@Log
	public void A011Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		//CHUUBUNSHONO1
		String CHUUBUNSHONO1 = null;
		List<A011TYUMONSYOEntity> A011TYUMONSYOEntityList = null;
		List<A011grdB18TYUMONSYOMEISAIEntity> A011grdB18TYUMONSYOMEISAIEntityList = null;
		A011SHUTSUNYUUKOFURAGU1Init(request, jsonObj);
		A011KYAKUSAKIMEISHOUInit(request, jsonObj);
		A011TANTOUSHAInit(request, jsonObj);
		A011KAHEIInit(request, jsonObj);
		A011KUBUNInit(request, jsonObj);
		A011pageInitValueSetByDefault(request, jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("1".equals(mode)) {
			CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
			A011TYUMONSYOEntityList = A011TYUMONSYODao.A011InitDepthZero(CHUUBUNSHONO1);
			A011pageInitValueSetByDB(A011TYUMONSYOEntityList, jsonObj);
			A011grdB18TYUMONSYOMEISAIEntityList = A011grdB18TYUMONSYOMEISAIDao.A011InitGrid(CHUUBUNSHONO1);
		}
		A011grdB18pageInitGridValueSetByDB(A011grdB18TYUMONSYOMEISAIEntityList, jsonObj, request);
		A011PageAfterLoad1Service.A011PageAfterLoad1(request, jsonObj);

	}
}