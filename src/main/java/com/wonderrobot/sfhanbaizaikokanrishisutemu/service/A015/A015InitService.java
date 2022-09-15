package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A015;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015.A015grdB6KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A015.A015grdB6KAISYADao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A015.A015GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A015InitService
 *      Page: 会社検索
 * @version

 */

@Service
public class A015InitService {
	@Autowired
	private A015grdB6KAISYADao A015grdB6KAISYADao;

   
	@Log
	private void A015KAISHAKUBUNInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		
		opValue = StringUtil.changeNullToBlank("0");
		opText = StringUtil.changeNullToBlank("客先");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("1");
		opText = StringUtil.changeNullToBlank("仕入先");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KAISHAKUBUN\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A015KAISHAKUBUNInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KAISHAKUBUN', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A015grdB6pageInitGridValueSetByDB (List<A015grdB6KAISYAEntity> A015grdB6KAISYAEntityList, JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		ArrayList<LinkedHashMap<String, String>> A015grdB6KAISYAEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		
		A015grdB6KAISYAEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A015grdB6KAISYAEntityList != null && A015grdB6KAISYAEntityList.size() > 0) {
			for (int i = 0;i < A015grdB6KAISYAEntityList.size();i++) {
				A015grdB6KAISYAEntity A015grdB6KAISYAEntity_i = A015grdB6KAISYAEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("KAISYA_KAISHAID", StringUtil.changeNullToBlank(A015grdB6KAISYAEntity_i.getKAISHAID()));
				selMap.put("KAISYA_KAISHAMEI", StringUtil.changeNullToBlank(A015grdB6KAISYAEntity_i.getKAISHAMEI()));
				selMap.put("KAISYA_KAISHARYAKUSHOU", StringUtil.changeNullToBlank(A015grdB6KAISYAEntity_i.getKAISHARYAKUSHOU()));
				selMap.put("KAISYA_ADORESU", StringUtil.changeNullToBlank(A015grdB6KAISYAEntity_i.getADORESU()));
				selMap.put("KAISYA_RENRAKUSAKI", StringUtil.changeNullToBlank(A015grdB6KAISYAEntity_i.getRENRAKUSAKI()));
				selMap.put("KAISYA_SHIHARAIKIGEN", StringUtil.changeNullToBlank(A015grdB6KAISYAEntity_i.getSHIHARAIKIGEN()));
				selMap.put("KAISYA_KAISHAKUBUN", StringUtil.changeNullToBlank(A015grdB6KAISYAEntity_i.getKAISHAKUBUN()));
				A015grdB6KAISYAEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A015GridDataConstant.getGridStrSet(A015grdB6KAISYAEntityAy, "P00006", "13", 0, 1);
		jsonObj.setScript("r", "setGrid13();$('div#_ingrid_Grid13_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB13", returnVal);
		jsonObj.setReturnID("h", "dragB13");
		
		A015GridDataConstant.setGridDataToSession("P00006", "13", A015grdB6KAISYAEntityAy, request);

	}

   
	@Log
	public void A015Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		List<A015grdB6KAISYAEntity> A015grdB6KAISYAEntityList = null;
		A015KAISHAKUBUNInit(request, jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("".equals(mode) || StringUtil.isNullOrBlank(mode)) {
			mode = "1";
		}
		if ("1".equals(mode)) {
			A015grdB6KAISYAEntityList = A015grdB6KAISYADao.A015InitGrid();
		}
		A015grdB6pageInitGridValueSetByDB(A015grdB6KAISYAEntityList, jsonObj, request);

	}
}