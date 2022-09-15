package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A015;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015.A015O4grdB6SmartSearchEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A015.A015O4grdB6SmartSearchDao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A015.A015GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A015O4grdB6SmartSearchService
 *      Page: 会社検索
 * @version

 */

@Service
public class A015O4grdB6SmartSearchService {
	@Autowired
	private A015O4grdB6SmartSearchDao A015O4grdB6SmartSearchDao;

   
	@Log
	public void A015O4grdB6SmartSearch (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//KAISHAID
		String KAISHAID = null;
		//KAISHAMEI
		String KAISHAMEI = null;
		List<A015O4grdB6SmartSearchEntity> A015O4grdB6SmartSearchEntityList = null;
		ArrayList<LinkedHashMap<String, String>> A015O4grdB6SmartSearchEntityAy = null;
		
		
		LinkedHashMap<String, String> selMap = null;
		KAISHAID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAISHAID")));
		KAISHAMEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAISHAMEI")));
		A015O4grdB6SmartSearchEntityList = A015O4grdB6SmartSearchDao.A015O4grdB6SmartSearch(KAISHAID, KAISHAMEI);
		
		A015O4grdB6SmartSearchEntityAy = new ArrayList<LinkedHashMap<String, String>>();
		if (A015O4grdB6SmartSearchEntityList != null && A015O4grdB6SmartSearchEntityList.size() > 0) {
			for (int i = 0;i < A015O4grdB6SmartSearchEntityList.size();i++) {
				A015O4grdB6SmartSearchEntity A015O4grdB6SmartSearchEntity_i = A015O4grdB6SmartSearchEntityList.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("KAISYA_KAISHAID", StringUtil.changeNullToBlank(A015O4grdB6SmartSearchEntity_i.getA1KAISHAID()));
				selMap.put("KAISYA_KAISHAMEI", StringUtil.changeNullToBlank(A015O4grdB6SmartSearchEntity_i.getA1KAISHAMEI()));
				selMap.put("KAISYA_KAISHARYAKUSHOU", StringUtil.changeNullToBlank(A015O4grdB6SmartSearchEntity_i.getA1KAISHARYAKUSHOU()));
				selMap.put("KAISYA_ADORESU", StringUtil.changeNullToBlank(A015O4grdB6SmartSearchEntity_i.getA1ADORESU()));
				selMap.put("KAISYA_RENRAKUSAKI", StringUtil.changeNullToBlank(A015O4grdB6SmartSearchEntity_i.getA1RENRAKUSAKI()));
				selMap.put("KAISYA_SHIHARAIKIGEN", StringUtil.changeNullToBlank(A015O4grdB6SmartSearchEntity_i.getA1SHIHARAIKIGEN()));
				selMap.put("KAISYA_KAISHAKUBUN", StringUtil.changeNullToBlank(A015O4grdB6SmartSearchEntity_i.getA1KAISHAKUBUN()));
				A015O4grdB6SmartSearchEntityAy.add(selMap);
			}
		}
		String returnVal = null;
		
		returnVal = A015GridDataConstant.getGridStrSet(A015O4grdB6SmartSearchEntityAy, "P00006", "13", 50, 1);
		jsonObj.setScript("r", "setGrid13();$('div#_ingrid_Grid13_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB13", returnVal);
		jsonObj.setReturnID("h", "dragB13");
		
		A015GridDataConstant.setGridDataToSession("P00006", "13", A015O4grdB6SmartSearchEntityAy, request);

	}
}