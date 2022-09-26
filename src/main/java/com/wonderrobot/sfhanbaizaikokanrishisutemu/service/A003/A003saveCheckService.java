package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A003;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderfulfly.common.SaveDataCheckUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003.A003BUMONRepeatCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A003.A003BUMONRepeatCheckDao;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A003saveCheckService
 *      Page: 部門
 * @version

 */

@Service
public class A003saveCheckService {
	@Autowired
	private A003BUMONRepeatCheckDao A003BUMONRepeatCheckDao;

   
	@Log
	private String BUMONID1Check (String BUMONID1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getKeyNullCheckErr(BUMONID1, "部門ID");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(BUMONID1, 10, "部門ID");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(BUMONID1, 0, "部門ID");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String BUMONMEI1Check (String BUMONMEI1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMustNullCheckErr(BUMONMEI1, "部門名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(BUMONMEI1, 50, "部門名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(BUMONMEI1, 0, "部門名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String BUMONRepeatCheck (HttpServletRequest request) throws Exception {

		List<A003BUMONRepeatCheckEntity> A003BUMONRepeatCheckEntityList = null;
		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		String BUMONID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUMONID1")));
		A003BUMONRepeatCheckEntityList = A003BUMONRepeatCheckDao.A003BUMONRepeatCheckselectBUMON(BUMONID1);
		if (A003BUMONRepeatCheckEntityList != null && A003BUMONRepeatCheckEntityList.size() > 0) {
			
			errMsg = SaveDataCheckUtil.getKeyRepeatErr("BUMON");
			SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		}
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	public String saveDataCheck (HttpServletRequest request, A003DataCheckEntity A003DataCheckEntity) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		String BUMONID1 = null;
		String BUMONMEI1 = null;
		String mode = null;
		msgBuffer = new StringBuffer();
		BUMONID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A003DataCheckEntity.getBUMONID1()));
		BUMONMEI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A003DataCheckEntity.getBUMONMEI1()));
		
		
		errMsg = BUMONID1Check(BUMONID1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = BUMONMEI1Check(BUMONMEI1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("2".equals(mode)) {
			
			errMsg = BUMONRepeatCheck(request);
			SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		}
		errMsg = msgBuffer.toString();

		return errMsg;
	}
}