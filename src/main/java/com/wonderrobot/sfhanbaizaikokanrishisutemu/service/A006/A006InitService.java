package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006KAISHAMEII00001Entity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006KAISHAMEII00001Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006TSUKAMATSUNYUUSAKII00001Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006TSUKAMATSUNYUUSAKII00001Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006grdB6SYOUHINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006grdB6SYOUHINDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A006.A006GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006SYOUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006SYOUHINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A006InitService
 *      Page: 商品
 * @version

 */

@Service
public class A006InitService {
	@Autowired
	private A006KAISHAMEII00001Dao A006KAISHAMEII00001Dao;
	@Autowired
	private A006TSUKAMATSUNYUUSAKII00001Dao A006TSUKAMATSUNYUUSAKII00001Dao;
	@Autowired
	private A006grdB6SYOUHINDao A006grdB6SYOUHINDao;
	@Autowired
	private A006SYOUHINDao A006SYOUHINDao;

   
	@Log
	public void A006KAISHAMEIInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A006KAISHAMEII00001Entity> A006KAISHAMEII00001EntityList = null;
		StringBuffer sBuffer = null;
		A006KAISHAMEII00001Entity A006KAISHAMEII00001Entity = null;
		String opValue = null;
		String opText = null;
		A006KAISHAMEII00001EntityList = A006KAISHAMEII00001Dao.A006KAISHAMEIdrp();
		sBuffer = new StringBuffer();
		
		if (A006KAISHAMEII00001EntityList != null && A006KAISHAMEII00001EntityList .size() > 0) {
			for (int i = 0; i < A006KAISHAMEII00001EntityList.size(); i++) {
				A006KAISHAMEII00001Entity = A006KAISHAMEII00001EntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A006KAISHAMEII00001Entity.getKAISHAID());
				opText = StringUtil.changeNullToBlank(A006KAISHAMEII00001Entity.getKAISHAMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KAISHAMEI\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A006KAISHAMEIInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KAISHAMEI', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	public void A006TSUKAMATSUNYUUSAKIInit (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		List<A006TSUKAMATSUNYUUSAKII00001Entity> A006TSUKAMATSUNYUUSAKII00001EntityList = null;
		StringBuffer sBuffer = null;
		A006TSUKAMATSUNYUUSAKII00001Entity A006TSUKAMATSUNYUUSAKII00001Entity = null;
		String opValue = null;
		String opText = null;
		String selectedShowText= "";
		A006TSUKAMATSUNYUUSAKII00001EntityList = A006TSUKAMATSUNYUUSAKII00001Dao.A006TSUKAMATSUNYUUSAKIdrp();
		sBuffer = new StringBuffer();
		
		if (A006TSUKAMATSUNYUUSAKII00001EntityList != null && A006TSUKAMATSUNYUUSAKII00001EntityList .size() > 0) {
			for (int i = 0; i < A006TSUKAMATSUNYUUSAKII00001EntityList.size(); i++) {
				A006TSUKAMATSUNYUUSAKII00001Entity = A006TSUKAMATSUNYUUSAKII00001EntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A006TSUKAMATSUNYUUSAKII00001Entity.getKAISHAID());
				opText = StringUtil.changeNullToBlank(A006TSUKAMATSUNYUUSAKII00001Entity.getKAISHAMEI());
				if (opValue.equals(selectedVaule)) {
					selectedShowText = opText;
				}
			}
		}
		jsonObj.setScript("r", "$('#showTSUKAMATSUNYUUSAKI').html('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedShowText)) + "');$('#TSUKAMATSUNYUUSAKI').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedVaule)) + "');");

	}

   
	@Log
	private void A006grdB6pageInitGridValueSetByDB (List<A006grdB6SYOUHINEntity> A006grdB6SYOUHINEntityList, JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		ArrayList<LinkedHashMap<String, String>> A006grdB6SYOUHINEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		
		A006grdB6SYOUHINEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A006grdB6SYOUHINEntityList != null && A006grdB6SYOUHINEntityList.size() > 0) {
			for (int i = 0;i < A006grdB6SYOUHINEntityList.size();i++) {
				A006grdB6SYOUHINEntity A006grdB6SYOUHINEntity_i = A006grdB6SYOUHINEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("SYOUHIN_SHOUHINMEISHOU", StringUtil.changeNullToBlank(A006grdB6SYOUHINEntity_i.getSHOUHINMEISHOU()));
				selMap.put("SYOUHIN_ZAISHITSU", StringUtil.changeNullToBlank(A006grdB6SYOUHINEntity_i.getZAISHITSU()));
				selMap.put("SYOUHIN_NYUUKAHIDZUKE", StringUtil.changeNullToBlank(A006grdB6SYOUHINEntity_i.getNYUUKAHIDZUKE()));
				selMap.put("SYOUHIN_PRICE", StringUtil.changeNullToBlank(A006grdB6SYOUHINEntity_i.getPRICE()));
				selMap.put("SYOUHIN_ZAIKOSUURYOU", StringUtil.changeNullToBlank(A006grdB6SYOUHINEntity_i.getZAIKOSUURYOU()));
				selMap.put("SYOUHIN_SHOUHINNO", StringUtil.changeNullToBlank(A006grdB6SYOUHINEntity_i.getSHOUHINNO()));
				selMap.put("SYOUHIN_TSUKAMATSUNYUUSAKI", StringUtil.changeNullToBlank(A006grdB6SYOUHINEntity_i.getTSUKAMATSUNYUUSAKI()));
				A006grdB6SYOUHINEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A006GridDataConstant.getGridStrSet(A006grdB6SYOUHINEntityAy, "P00006", "19", 20, 1);
		jsonObj.setScript("r", "setGrid19();$('div#_ingrid_Grid19_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB19", returnVal);
		jsonObj.setReturnID("h", "dragB19");
		
		A006GridDataConstant.setGridDataToSession("P00006", "19", A006grdB6SYOUHINEntityAy, request);

	}

   
	@Log
	public void A006Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		List<A006grdB6SYOUHINEntity> A006grdB6SYOUHINEntityList = null;
		A006KAISHAMEIInit(request, jsonObj);
		A006TSUKAMATSUNYUUSAKIInit("", jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("".equals(mode) || StringUtil.isNullOrBlank(mode)) {
			mode = "1";
		}
		if ("1".equals(mode)) {
			A006grdB6SYOUHINEntityList = A006grdB6SYOUHINDao.A006InitGrid();
		}
		A006grdB6pageInitGridValueSetByDB(A006grdB6SYOUHINEntityList, jsonObj, request);

	}
}