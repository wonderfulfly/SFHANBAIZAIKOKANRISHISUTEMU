package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A003;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003BUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003.A003BUMONDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A003InitService
 *      Page: 部門
 * @version

 */

@Service
public class A003InitService {
	@Autowired
	private A003BUMONDao A003BUMONDao;

   
	@Log
	private void A003pageInitValueSetByDB (List<A003BUMONEntity> A003BUMONEntityList, JSONWFCObject jsonObj) throws Exception {

		A003BUMONEntity A003BUMONEntity = null;
		if (A003BUMONEntityList != null && A003BUMONEntityList.size() == 1) {
			A003BUMONEntity = A003BUMONEntityList.get(0);
		}
		if (A003BUMONEntity != null) {
			jsonObj.setScript("r", "$('#BUMONID1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A003BUMONEntity.getBUMONID())) + "');");
			jsonObj.setScript("r", "$('#BUMONMEI1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A003BUMONEntity.getBUMONMEI())) + "');");
		}

	}

   
	@Log
	public void A003Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		//BUMONID1
		String BUMONID1 = null;
		List<A003BUMONEntity> A003BUMONEntityList = null;
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("1".equals(mode)) {
			BUMONID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUMONID1")));
			A003BUMONEntityList = A003BUMONDao.A003InitDepthZero(BUMONID1);
			A003pageInitValueSetByDB(A003BUMONEntityList, jsonObj);
		}

	}
}