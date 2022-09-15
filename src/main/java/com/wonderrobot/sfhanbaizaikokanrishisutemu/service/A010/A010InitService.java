package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010TANTOUSHAIDSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010TANTOUSHAIDSYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010KYAKUSAKIIDKAISYAEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010KYAKUSAKIIDKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010KYAKUSAKIID1KAISYAEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010KYAKUSAKIID1KAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010TANTOUSHAID1SYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010TANTOUSHAID1SYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010grdC10TYUMONSYOEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10TYUMONSYODao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A010.A010GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010TYUMONSYODao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010TYUMONSYOEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010InitService
 *      Page: 注文管理検索
 * @version

 */

@Service
public class A010InitService {
	@Autowired
	private A010TANTOUSHAIDSYAINDao A010TANTOUSHAIDSYAINDao;
	@Autowired
	private A010KYAKUSAKIIDKAISYADao A010KYAKUSAKIIDKAISYADao;
	@Autowired
	private A010KYAKUSAKIID1KAISYADao A010KYAKUSAKIID1KAISYADao;
	@Autowired
	private A010TANTOUSHAID1SYAINDao A010TANTOUSHAID1SYAINDao;
	@Autowired
	private A010grdC10TYUMONSYODao A010grdC10TYUMONSYODao;
	@Autowired
	private A010TYUMONSYODao A010TYUMONSYODao;

   
	@Log
	public void A010TANTOUSHAIDInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A010TANTOUSHAIDSYAINEntity> A010TANTOUSHAIDSYAINEntityList = null;
		StringBuffer sBuffer = null;
		A010TANTOUSHAIDSYAINEntity A010TANTOUSHAIDSYAINEntity = null;
		String opValue = null;
		String opText = null;
		A010TANTOUSHAIDSYAINEntityList = A010TANTOUSHAIDSYAINDao.A010TANTOUSHAIDdrp();
		sBuffer = new StringBuffer();
		
		if (A010TANTOUSHAIDSYAINEntityList != null && A010TANTOUSHAIDSYAINEntityList .size() > 0) {
			for (int i = 0; i < A010TANTOUSHAIDSYAINEntityList.size(); i++) {
				A010TANTOUSHAIDSYAINEntity = A010TANTOUSHAIDSYAINEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A010TANTOUSHAIDSYAINEntity.getSHAINID());
				opText = StringUtil.changeNullToBlank(A010TANTOUSHAIDSYAINEntity.getSHAINMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"TANTOUSHAID\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A010TANTOUSHAIDInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('TANTOUSHAID', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	public void A010KYAKUSAKIIDInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A010KYAKUSAKIIDKAISYAEntity> A010KYAKUSAKIIDKAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A010KYAKUSAKIIDKAISYAEntity A010KYAKUSAKIIDKAISYAEntity = null;
		String opValue = null;
		String opText = null;
		A010KYAKUSAKIIDKAISYAEntityList = A010KYAKUSAKIIDKAISYADao.A010KYAKUSAKIIDdrp();
		sBuffer = new StringBuffer();
		
		if (A010KYAKUSAKIIDKAISYAEntityList != null && A010KYAKUSAKIIDKAISYAEntityList .size() > 0) {
			for (int i = 0; i < A010KYAKUSAKIIDKAISYAEntityList.size(); i++) {
				A010KYAKUSAKIIDKAISYAEntity = A010KYAKUSAKIIDKAISYAEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A010KYAKUSAKIIDKAISYAEntity.getKAISHAID());
				opText = StringUtil.changeNullToBlank(A010KYAKUSAKIIDKAISYAEntity.getKAISHAMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KYAKUSAKIID\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A010KYAKUSAKIIDInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KYAKUSAKIID', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A010SHUKKOJOUTAIInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		
		opValue = StringUtil.changeNullToBlank("1");
		opText = StringUtil.changeNullToBlank("入庫");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("2");
		opText = StringUtil.changeNullToBlank("出庫");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"SHUKKOJOUTAI\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A010SHUKKOJOUTAIInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('SHUKKOJOUTAI', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	public void A010KYAKUSAKIID1Init (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		List<A010KYAKUSAKIID1KAISYAEntity> A010KYAKUSAKIID1KAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A010KYAKUSAKIID1KAISYAEntity A010KYAKUSAKIID1KAISYAEntity = null;
		String opValue = null;
		String opText = null;
		String selectedShowText= "";
		A010KYAKUSAKIID1KAISYAEntityList = A010KYAKUSAKIID1KAISYADao.A010KYAKUSAKIID1drp();
		sBuffer = new StringBuffer();
		
		if (A010KYAKUSAKIID1KAISYAEntityList != null && A010KYAKUSAKIID1KAISYAEntityList .size() > 0) {
			for (int i = 0; i < A010KYAKUSAKIID1KAISYAEntityList.size(); i++) {
				A010KYAKUSAKIID1KAISYAEntity = A010KYAKUSAKIID1KAISYAEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A010KYAKUSAKIID1KAISYAEntity.getKAISHAID());
				opText = StringUtil.changeNullToBlank(A010KYAKUSAKIID1KAISYAEntity.getKAISHAMEI());
				if (opValue.equals(selectedVaule)) {
					selectedShowText = opText;
				}
			}
		}
		jsonObj.setScript("r", "$('#showKYAKUSAKIID1').html('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedShowText)) + "');$('#KYAKUSAKIID1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedVaule)) + "');");

	}

   
	@Log
	private void A010SHUTSUNYUUKOFURAGUInit (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		String selectedShowText= "";
		
		opValue = StringUtil.changeNullToBlank("2");
		opText = StringUtil.changeNullToBlank("出庫済み");
		if (opValue.equals(selectedVaule)) {
			selectedShowText = opText;
		}
		jsonObj.setScript("r", "$('#showSHUTSUNYUUKOFURAGU').html('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedShowText)) + "');$('#SHUTSUNYUUKOFURAGU').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedVaule)) + "');");

	}

   
	@Log
	public void A010TANTOUSHAID1Init (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		List<A010TANTOUSHAID1SYAINEntity> A010TANTOUSHAID1SYAINEntityList = null;
		StringBuffer sBuffer = null;
		A010TANTOUSHAID1SYAINEntity A010TANTOUSHAID1SYAINEntity = null;
		String opValue = null;
		String opText = null;
		String selectedShowText= "";
		A010TANTOUSHAID1SYAINEntityList = A010TANTOUSHAID1SYAINDao.A010TANTOUSHAID1drp();
		sBuffer = new StringBuffer();
		
		if (A010TANTOUSHAID1SYAINEntityList != null && A010TANTOUSHAID1SYAINEntityList .size() > 0) {
			for (int i = 0; i < A010TANTOUSHAID1SYAINEntityList.size(); i++) {
				A010TANTOUSHAID1SYAINEntity = A010TANTOUSHAID1SYAINEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A010TANTOUSHAID1SYAINEntity.getSHAINID());
				opText = StringUtil.changeNullToBlank(A010TANTOUSHAID1SYAINEntity.getSHAINMEI());
				if (opValue.equals(selectedVaule)) {
					selectedShowText = opText;
				}
			}
		}
		jsonObj.setScript("r", "$('#showTANTOUSHAID1').html('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedShowText)) + "');$('#TANTOUSHAID1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedVaule)) + "');");

	}

   
	@Log
	private void A010grdC10pageInitGridValueSetByDB (List<A010grdC10TYUMONSYOEntity> A010grdC10TYUMONSYOEntityList, JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		ArrayList<LinkedHashMap<String, String>> A010grdC10TYUMONSYOEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		
		A010grdC10TYUMONSYOEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A010grdC10TYUMONSYOEntityList != null && A010grdC10TYUMONSYOEntityList.size() > 0) {
			for (int i = 0;i < A010grdC10TYUMONSYOEntityList.size();i++) {
				A010grdC10TYUMONSYOEntity A010grdC10TYUMONSYOEntity_i = A010grdC10TYUMONSYOEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("TYUMONSYO_CHUUBUNSHONO", StringUtil.changeNullToBlank(A010grdC10TYUMONSYOEntity_i.getCHUUBUNSHONO()));
				selMap.put("TYUMONSYO_MITSUMORISHONO", StringUtil.changeNullToBlank(A010grdC10TYUMONSYOEntity_i.getMITSUMORISHONO()));
				selMap.put("TYUMONSYO_CHUUMONHIDZUKE", StringUtil.changeNullToBlank(A010grdC10TYUMONSYOEntity_i.getCHUUMONHIDZUKE()));
				selMap.put("TYUMONSYO_SHOUHINSOUGAKUJPY", StringUtil.changeNullToBlank(A010grdC10TYUMONSYOEntity_i.getSHOUHINSOUGAKUJPY()));
				selMap.put("TYUMONSYO_SHANAIKOUJIBANGOU", StringUtil.changeNullToBlank(A010grdC10TYUMONSYOEntity_i.getSHANAIKOUJIBANGOU()));
				selMap.put("TYUMONSYO_KYAKUSAKITANTOU", StringUtil.changeNullToBlank(A010grdC10TYUMONSYOEntity_i.getKYAKUSAKITANTOU()));
				selMap.put("TYUMONSYO_SHUTSUNYUUKOFURAGU", StringUtil.changeNullToBlank(A010grdC10TYUMONSYOEntity_i.getSHUTSUNYUUKOFURAGU()));
				selMap.put("TYUMONSYO_KYAKUSAKIID", StringUtil.changeNullToBlank(A010grdC10TYUMONSYOEntity_i.getKYAKUSAKIID()));
				selMap.put("TYUMONSYO_TANTOUSHAID", StringUtil.changeNullToBlank(A010grdC10TYUMONSYOEntity_i.getTANTOUSHAID()));
				A010grdC10TYUMONSYOEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A010GridDataConstant.getGridStrSet(A010grdC10TYUMONSYOEntityAy, "P00012", "43", 0, 1);
		jsonObj.setScript("r", "setGrid43();$('div#_ingrid_Grid43_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB43", returnVal);
		jsonObj.setReturnID("h", "dragB43");
		
		A010GridDataConstant.setGridDataToSession("P00012", "43", A010grdC10TYUMONSYOEntityAy, request);

	}

   
	@Log
	public void A010Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		List<A010grdC10TYUMONSYOEntity> A010grdC10TYUMONSYOEntityList = null;
		A010TANTOUSHAIDInit(request, jsonObj);
		A010KYAKUSAKIIDInit(request, jsonObj);
		A010SHUKKOJOUTAIInit(request, jsonObj);
		A010KYAKUSAKIID1Init("", jsonObj);
		A010SHUTSUNYUUKOFURAGUInit("", jsonObj);
		A010TANTOUSHAID1Init("", jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("".equals(mode) || StringUtil.isNullOrBlank(mode)) {
			mode = "1";
		}
		if ("1".equals(mode)) {
			A010grdC10TYUMONSYOEntityList = A010grdC10TYUMONSYODao.A010InitGrid();
		}
		A010grdC10pageInitGridValueSetByDB(A010grdC10TYUMONSYOEntityList, jsonObj, request);

	}
}