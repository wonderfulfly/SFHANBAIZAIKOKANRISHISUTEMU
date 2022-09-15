package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A014;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014.A014grdC6BUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A014.A014grdC6BUMONDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A014.A014GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A014InitService
 *      Page: 部門検索
 * @version

 */

@Service
public class A014InitService {
	@Autowired
	private A014grdC6BUMONDao A014grdC6BUMONDao;

   
	@Log
	private void A014grdC6pageInitGridValueSetByDB (List<A014grdC6BUMONEntity> A014grdC6BUMONEntityList, JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		ArrayList<LinkedHashMap<String, String>> A014grdC6BUMONEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		
		A014grdC6BUMONEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A014grdC6BUMONEntityList != null && A014grdC6BUMONEntityList.size() > 0) {
			for (int i = 0;i < A014grdC6BUMONEntityList.size();i++) {
				A014grdC6BUMONEntity A014grdC6BUMONEntity_i = A014grdC6BUMONEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("BUMON_BUMONID", StringUtil.changeNullToBlank(A014grdC6BUMONEntity_i.getBUMONID()));
				selMap.put("BUMON_BUMONMEI", StringUtil.changeNullToBlank(A014grdC6BUMONEntity_i.getBUMONMEI()));
				A014grdC6BUMONEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A014GridDataConstant.getGridStrSet(A014grdC6BUMONEntityAy, "P00004", "13", 0, 1);
		jsonObj.setScript("r", "setGrid13();$('div#_ingrid_Grid13_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB13", returnVal);
		jsonObj.setReturnID("h", "dragB13");
		
		A014GridDataConstant.setGridDataToSession("P00004", "13", A014grdC6BUMONEntityAy, request);

	}

   
	@Log
	public void A014Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		List<A014grdC6BUMONEntity> A014grdC6BUMONEntityList = null;
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("".equals(mode) || StringUtil.isNullOrBlank(mode)) {
			mode = "1";
		}
		if ("1".equals(mode)) {
			A014grdC6BUMONEntityList = A014grdC6BUMONDao.A014InitGrid();
		}
		A014grdC6pageInitGridValueSetByDB(A014grdC6BUMONEntityList, jsonObj, request);

	}
}