package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A007;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007TSUKAMATSUNYUUSAKIKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007TSUKAMATSUNYUUSAKIKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007grdB8ZAIKOUEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8ZAIKOUDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A007.A007GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007ZAIKOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007ZAIKOUEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007InitService
 *      Page: 商品入庫画面
 * @version

 */

@Service
public class A007InitService {
	@Autowired
	private A007TSUKAMATSUNYUUSAKIKAISYADao A007TSUKAMATSUNYUUSAKIKAISYADao;
	@Autowired
	private A007grdB8ZAIKOUDao A007grdB8ZAIKOUDao;
	@Autowired
	private A007ZAIKOUDao A007ZAIKOUDao;

   
	@Log
	public void A007TSUKAMATSUNYUUSAKIInit (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		List<A007TSUKAMATSUNYUUSAKIKAISYAEntity> A007TSUKAMATSUNYUUSAKIKAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A007TSUKAMATSUNYUUSAKIKAISYAEntity A007TSUKAMATSUNYUUSAKIKAISYAEntity = null;
		String opValue = null;
		String opText = null;
		String selectedShowText= "";
		A007TSUKAMATSUNYUUSAKIKAISYAEntityList = A007TSUKAMATSUNYUUSAKIKAISYADao.A007TSUKAMATSUNYUUSAKIdrp();
		sBuffer = new StringBuffer();
		
		if (A007TSUKAMATSUNYUUSAKIKAISYAEntityList != null && A007TSUKAMATSUNYUUSAKIKAISYAEntityList .size() > 0) {
			for (int i = 0; i < A007TSUKAMATSUNYUUSAKIKAISYAEntityList.size(); i++) {
				A007TSUKAMATSUNYUUSAKIKAISYAEntity = A007TSUKAMATSUNYUUSAKIKAISYAEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A007TSUKAMATSUNYUUSAKIKAISYAEntity.getKAISHAID());
				opText = StringUtil.changeNullToBlank(A007TSUKAMATSUNYUUSAKIKAISYAEntity.getKAISHAMEI());
				if (opValue.equals(selectedVaule)) {
					selectedShowText = opText;
				}
			}
		}
		jsonObj.setScript("r", "$('#showTSUKAMATSUNYUUSAKI').html('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedShowText)) + "');$('#TSUKAMATSUNYUUSAKI').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedVaule)) + "');");

	}

   
	@Log
	private void A007SHUTSUNYUUKOJOUTAIInit (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		String selectedShowText= "";
		
		opValue = StringUtil.changeNullToBlank("0");
		opText = StringUtil.changeNullToBlank("未入庫");
		if (opValue.equals(selectedVaule)) {
			selectedShowText = opText;
		}
		opValue = StringUtil.changeNullToBlank("1");
		opText = StringUtil.changeNullToBlank("入庫済み");
		if (opValue.equals(selectedVaule)) {
			selectedShowText = opText;
		}
		opValue = StringUtil.changeNullToBlank("2");
		opText = StringUtil.changeNullToBlank("出庫");
		if (opValue.equals(selectedVaule)) {
			selectedShowText = opText;
		}
		jsonObj.setScript("r", "$('#showSHUTSUNYUUKOJOUTAI').html('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedShowText)) + "');$('#SHUTSUNYUUKOJOUTAI').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedVaule)) + "');");

	}

   
	@Log
	private void A007grdB8pageInitGridValueSetByDB (List<A007grdB8ZAIKOUEntity> A007grdB8ZAIKOUEntityList, JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		ArrayList<LinkedHashMap<String, String>> A007grdB8ZAIKOUEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		
		A007grdB8ZAIKOUEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A007grdB8ZAIKOUEntityList != null && A007grdB8ZAIKOUEntityList.size() > 0) {
			for (int i = 0;i < A007grdB8ZAIKOUEntityList.size();i++) {
				A007grdB8ZAIKOUEntity A007grdB8ZAIKOUEntity_i = A007grdB8ZAIKOUEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("ZAIKOU_CHUUBUNSHONO", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getCHUUBUNSHONO()));
				selMap.put("ZAIKOU_CHUUBUNSHOMEISAINO", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getCHUUBUNSHOMEISAINO()));
				selMap.put("ZAIKOU_KOUJIKANRIBANGOU", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getKOUJIKANRIBANGOU()));
				selMap.put("ZAIKOU_ZAIKONO", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getZAIKONO()));
				selMap.put("ZAIKOU_SHOUHINMEISHOU", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getSHOUHINMEISHOU()));
				selMap.put("ZAIKOU_SHUTSUNYUUKOJIKAN", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getSHUTSUNYUUKOJIKAN()));
				selMap.put("ZAIKOU_SUURYOU", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getSUURYOU()));
				selMap.put("ZAIKOU_PRICE", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getPRICE()));
				selMap.put("ZAIKOU_SHUKKANO", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getSHUKKANO()));
				selMap.put("ZAIKOU_SHOUHINKATABAN", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getSHOUHINKATABAN()));
				selMap.put("ZAIKOU_ZAIKOSUURYOU", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getZAIKOSUURYOU()));
				selMap.put("ZAIKOU_SHOUHINNO", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getSHOUHINNO()));
				selMap.put("ZAIKOU_SHUTSUNYUUKOJOUTAI", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getSHUTSUNYUUKOJOUTAI()));
				selMap.put("ZAIKOU_TSUKAMATSUNYUUSAKI", StringUtil.changeNullToBlank(A007grdB8ZAIKOUEntity_i.getTSUKAMATSUNYUUSAKI()));
				A007grdB8ZAIKOUEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A007GridDataConstant.getGridStrSet(A007grdB8ZAIKOUEntityAy, "P00007", "19", 10, 1);
		jsonObj.setScript("r", "setGrid19();$('div#_ingrid_Grid19_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB19", returnVal);
		jsonObj.setReturnID("h", "dragB19");
		
		A007GridDataConstant.setGridDataToSession("P00007", "19", A007grdB8ZAIKOUEntityAy, request);

	}

   
	@Log
	public void A007Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		List<A007grdB8ZAIKOUEntity> A007grdB8ZAIKOUEntityList = null;
		A007TSUKAMATSUNYUUSAKIInit("", jsonObj);
		A007SHUTSUNYUUKOJOUTAIInit("", jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("".equals(mode) || StringUtil.isNullOrBlank(mode)) {
			mode = "1";
		}
		if ("1".equals(mode)) {
			A007grdB8ZAIKOUEntityList = A007grdB8ZAIKOUDao.A007InitGrid();
		}
		A007grdB8pageInitGridValueSetByDB(A007grdB8ZAIKOUEntityList, jsonObj, request);
		jsonObj.setScript("r", "PageDefaultSet();");

	}
}