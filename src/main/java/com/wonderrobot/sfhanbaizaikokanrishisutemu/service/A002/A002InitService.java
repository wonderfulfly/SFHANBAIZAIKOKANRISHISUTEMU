package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A002;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002YUUZAAKENGENBUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002.A002YUUZAAKENGENBUMONDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002grdB6SYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002.A002grdB6SYAINDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A002.A002GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A002InitService
 *      Page: 社員検索
 * @version

 */

@Service
public class A002InitService {
	@Autowired
	private A002YUUZAAKENGENBUMONDao A002YUUZAAKENGENBUMONDao;
	@Autowired
	private A002grdB6SYAINDao A002grdB6SYAINDao;

   
	@Log
	public void A002YUUZAAKENGENInit (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		List<A002YUUZAAKENGENBUMONEntity> A002YUUZAAKENGENBUMONEntityList = null;
		StringBuffer sBuffer = null;
		A002YUUZAAKENGENBUMONEntity A002YUUZAAKENGENBUMONEntity = null;
		String opValue = null;
		String opText = null;
		String selectedShowText= "";
		A002YUUZAAKENGENBUMONEntityList = A002YUUZAAKENGENBUMONDao.A002YUUZAAKENGENdrp();
		sBuffer = new StringBuffer();
		
		if (A002YUUZAAKENGENBUMONEntityList != null && A002YUUZAAKENGENBUMONEntityList .size() > 0) {
			for (int i = 0; i < A002YUUZAAKENGENBUMONEntityList.size(); i++) {
				A002YUUZAAKENGENBUMONEntity = A002YUUZAAKENGENBUMONEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A002YUUZAAKENGENBUMONEntity.getBUMONID());
				opText = StringUtil.changeNullToBlank(A002YUUZAAKENGENBUMONEntity.getBUMONMEI());
				if (opValue.equals(selectedVaule)) {
					selectedShowText = opText;
				}
			}
		}
		jsonObj.setScript("r", "$('#showYUUZAAKENGEN').html('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedShowText)) + "');$('#YUUZAAKENGEN').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedVaule)) + "');");

	}

   
	@Log
	private void A002grdB6pageInitGridValueSetByDB (List<A002grdB6SYAINEntity> A002grdB6SYAINEntityList, JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		ArrayList<LinkedHashMap<String, String>> A002grdB6SYAINEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		
		A002grdB6SYAINEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A002grdB6SYAINEntityList != null && A002grdB6SYAINEntityList.size() > 0) {
			for (int i = 0;i < A002grdB6SYAINEntityList.size();i++) {
				A002grdB6SYAINEntity A002grdB6SYAINEntity_i = A002grdB6SYAINEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("SYAIN_SHAINID", StringUtil.changeNullToBlank(A002grdB6SYAINEntity_i.getSHAINID()));
				selMap.put("SYAIN_SHAINMEI", StringUtil.changeNullToBlank(A002grdB6SYAINEntity_i.getSHAINMEI()));
				selMap.put("SYAIN_DENWABANGOU", StringUtil.changeNullToBlank(A002grdB6SYAINEntity_i.getDENWABANGOU()));
				selMap.put("SYAIN_KEITAIBANGOU", StringUtil.changeNullToBlank(A002grdB6SYAINEntity_i.getKEITAIBANGOU()));
				selMap.put("SYAIN_EMAIL", StringUtil.changeNullToBlank(A002grdB6SYAINEntity_i.getEMAIL()));
				selMap.put("SYAIN_LINE", StringUtil.changeNullToBlank(A002grdB6SYAINEntity_i.getLINE()));
				selMap.put("SYAIN_ROGUINID", StringUtil.changeNullToBlank(A002grdB6SYAINEntity_i.getROGUINID()));
				selMap.put("SYAIN_YUUZAAKENGEN", StringUtil.changeNullToBlank(A002grdB6SYAINEntity_i.getYUUZAAKENGEN()));
				A002grdB6SYAINEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A002GridDataConstant.getGridStrSet(A002grdB6SYAINEntityAy, "P00002", "13", 0, 1);
		jsonObj.setScript("r", "setGrid13();$('div#_ingrid_Grid13_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB13", returnVal);
		jsonObj.setReturnID("h", "dragB13");
		
		A002GridDataConstant.setGridDataToSession("P00002", "13", A002grdB6SYAINEntityAy, request);

	}

   
	@Log
	public void A002Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		List<A002grdB6SYAINEntity> A002grdB6SYAINEntityList = null;
		A002YUUZAAKENGENInit("", jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("".equals(mode) || StringUtil.isNullOrBlank(mode)) {
			mode = "1";
		}
		if ("1".equals(mode)) {
			A002grdB6SYAINEntityList = A002grdB6SYAINDao.A002InitGrid();
		}
		A002grdB6pageInitGridValueSetByDB(A002grdB6SYAINEntityList, jsonObj, request);

	}
}