package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.ArraylistUtil;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A009.A009GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;

@Service
public class A009GridFormFeedService {

	@Log
	public void A009GridFormFeed(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String returnVal = "";
		String pageID = "A009";
		String subID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("subID")));
		String recognID = session.getId();
		ArrayList<LinkedHashMap<String, String>> alGridData = null;
		JSONWFCObject jsonObj = new JSONWFCObject();
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String pn = StringUtil.escapeSQLTags(request.getParameter("pagingNum"));
		if (StringUtil.isNullOrBlank(pn)) {
			pn = "1";
		}
		int pagingNum = StringUtil.changeStringToInt(pn);
		int pagingRecordNum = StringUtil.changeStringToInt(request.getParameter("recordNum"));
		String dir = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("dir")));
		String sort = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("sort")));
		HashMap hmSession = (HashMap)session.getAttribute(recognID + pageID + subID + "_Grid");
		alGridData = (ArrayList)((ArrayList)hmSession.get(pageID+subID)).get(1);
		returnVal = A009GridDataConstant.getGridStrSet(alGridData, pageID, subID, pagingRecordNum, pagingNum, false);
		out.println(returnVal);
	}
}

