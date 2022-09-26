package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A006;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderfulfly.common.SaveDataCheckUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A006saveCheckService
 *      Page: 商品
 * @version

 */

@Service
public class A006saveCheckService {

   
	@Log
	private String NYUUKAHIDZUKECheck (String NYUUKAHIDZUKE) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(NYUUKAHIDZUKE, "入荷日付");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String PRICECheck (String PRICE) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(PRICE, 0, "単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(PRICE, 0, "単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(PRICE, "単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String ZAISHITSUCheck (String ZAISHITSU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(ZAISHITSU, 20, "材質");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(ZAISHITSU, 0, "材質");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SHOUHINMEISHOUCheck (String SHOUHINMEISHOU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(SHOUHINMEISHOU, 100, "商品名称");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(SHOUHINMEISHOU, 0, "商品名称");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String ZAIKOSUURYOUCheck (String ZAIKOSUURYOU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(ZAIKOSUURYOU, 0, "購買数量");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(ZAIKOSUURYOU, 0, "購買数量");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getIntCheckErr(ZAIKOSUURYOU, "購買数量");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String GridCheck (A006DataCheckEntity A006DataCheckEntity, HttpServletRequest request) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		int rowDataLine = 0;
		String gridOpFlag = null;
		String NYUUKAHIDZUKE = null;
		String PRICE = null;
		String ZAISHITSU = null;
		String SHOUHINMEISHOU = null;
		String ZAIKOSUURYOU = null;
		msgBuffer = new StringBuffer();
		rowDataLine = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid19")));
		
		for (int j =0; j <= rowDataLine; j++) {
			gridOpFlag = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid19flg" + (j+1))));
			if ("1".equals(gridOpFlag) || "2".equals(gridOpFlag)) {
				NYUUKAHIDZUKE = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("NYUUKAHIDZUKE_j")));
				PRICE = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("PRICE_j")));
				ZAISHITSU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("ZAISHITSU_j")));
				SHOUHINMEISHOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHOUHINMEISHOU_j")));
				ZAIKOSUURYOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("ZAIKOSUURYOU_j")));
				
				
				errMsg = NYUUKAHIDZUKECheck(NYUUKAHIDZUKE);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = PRICECheck(PRICE);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = ZAISHITSUCheck(ZAISHITSU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = SHOUHINMEISHOUCheck(SHOUHINMEISHOU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = ZAIKOSUURYOUCheck(ZAIKOSUURYOU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
			}
		}
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	public String saveDataCheck (HttpServletRequest request, A006DataCheckEntity A006DataCheckEntity) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		
		errMsg = GridCheck(A006DataCheckEntity,request);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}
}