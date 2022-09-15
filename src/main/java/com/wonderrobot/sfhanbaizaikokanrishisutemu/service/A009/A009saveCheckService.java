package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderfulfly.common.SaveDataCheckUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A009saveCheckService
 *      Page: 入金管理詳細
 * @version

 */

@Service
public class A009saveCheckService {

   
	@Log
	private String CHUUBUNSHONO1Check (String CHUUBUNSHONO1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getNotNullCheckErr(CHUUBUNSHONO1, "注文書NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String CHUUMONHIDZUKE1Check (String CHUUMONHIDZUKE1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(CHUUMONHIDZUKE1, "注文日付");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String NYUUKINKINGAKU1Check (String NYUUKINKINGAKU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(NYUUKINKINGAKU1, 0, "入金金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(NYUUKINKINGAKU1, 0, "入金金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(NYUUKINKINGAKU1, "入金金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String RESHIITONO1Check (String RESHIITONO1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(RESHIITONO1, 10, "領収書NOHIDE");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(RESHIITONO1, 0, "領収書NOHIDE");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SHIHARAIHIDZUKECheck (String SHIHARAIHIDZUKE) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(SHIHARAIHIDZUKE, "支払日付");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SHIHARAIWARIAICheck (String SHIHARAIWARIAI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(SHIHARAIWARIAI, 10, "支払割合");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(SHIHARAIWARIAI, 0, "支払割合");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String FURIDASHIZUMIHIDZUKECheck (String FURIDASHIZUMIHIDZUKE) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(FURIDASHIZUMIHIDZUKE, "領収書発行日");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String NYUUKINZUMIHIDZUKECheck (String NYUUKINZUMIHIDZUKE) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(NYUUKINZUMIHIDZUKE, "入金済み日付");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String NYUUKINZUMIWARIAICheck (String NYUUKINZUMIWARIAI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(NYUUKINZUMIWARIAI, "入金済み%");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String FURIDASHIZUMIKINGAKUCheck (String FURIDASHIZUMIKINGAKU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(FURIDASHIZUMIKINGAKU, 0, "振出済み金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(FURIDASHIZUMIKINGAKU, 0, "振出済み金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(FURIDASHIZUMIKINGAKU, "振出済み金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String NYUUKINZUMIKINGAKUCheck (String NYUUKINZUMIKINGAKU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(NYUUKINZUMIKINGAKU, 0, "入金済み金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(NYUUKINZUMIKINGAKU, 0, "入金済み金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(NYUUKINZUMIKINGAKU, "入金済み金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String GridCheck (A009DataCheckEntity A009DataCheckEntity, HttpServletRequest request) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		int rowDataLine = 0;
		String gridOpFlag = null;
		String RESHIITONO1 = null;
		String SHIHARAIHIDZUKE = null;
		String SHIHARAIWARIAI = null;
		String FURIDASHIZUMIHIDZUKE = null;
		String NYUUKINZUMIHIDZUKE = null;
		String NYUUKINZUMIWARIAI = null;
		String FURIDASHIZUMIKINGAKU = null;
		String NYUUKINZUMIKINGAKU = null;
		msgBuffer = new StringBuffer();
		rowDataLine = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid61")));
		
		for (int j =0; j <= rowDataLine; j++) {
			gridOpFlag = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid61flg" + (j+1))));
			if ("1".equals(gridOpFlag) || "2".equals(gridOpFlag)) {
				RESHIITONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RESHIITONO1_j")));
				SHIHARAIHIDZUKE = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHIHARAIHIDZUKE_j")));
				SHIHARAIWARIAI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHIHARAIWARIAI_j")));
				FURIDASHIZUMIHIDZUKE = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("FURIDASHIZUMIHIDZUKE_j")));
				NYUUKINZUMIHIDZUKE = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("NYUUKINZUMIHIDZUKE_j")));
				NYUUKINZUMIWARIAI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("NYUUKINZUMIWARIAI_j")));
				FURIDASHIZUMIKINGAKU = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("FURIDASHIZUMIKINGAKU_j")));
				NYUUKINZUMIKINGAKU = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("NYUUKINZUMIKINGAKU_j")));
				
				
				errMsg = RESHIITONO1Check(RESHIITONO1);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = SHIHARAIHIDZUKECheck(SHIHARAIHIDZUKE);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = SHIHARAIWARIAICheck(SHIHARAIWARIAI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = FURIDASHIZUMIHIDZUKECheck(FURIDASHIZUMIHIDZUKE);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = NYUUKINZUMIHIDZUKECheck(NYUUKINZUMIHIDZUKE);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = NYUUKINZUMIWARIAICheck(NYUUKINZUMIWARIAI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = FURIDASHIZUMIKINGAKUCheck(FURIDASHIZUMIKINGAKU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = NYUUKINZUMIKINGAKUCheck(NYUUKINZUMIKINGAKU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
			}
		}
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	public String saveDataCheck (HttpServletRequest request, A009DataCheckEntity A009DataCheckEntity) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		String CHUUBUNSHONO1 = null;
		String CHUUMONHIDZUKE1 = null;
		String NYUUKINKINGAKU1 = null;
		msgBuffer = new StringBuffer();
		CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A009DataCheckEntity.getCHUUBUNSHONO1()));
		CHUUMONHIDZUKE1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A009DataCheckEntity.getCHUUMONHIDZUKE1()));
		NYUUKINKINGAKU1 = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(A009DataCheckEntity.getNYUUKINKINGAKU1()));
		
		
		errMsg = CHUUBUNSHONO1Check(CHUUBUNSHONO1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = CHUUMONHIDZUKE1Check(CHUUMONHIDZUKE1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = NYUUKINKINGAKU1Check(NYUUKINKINGAKU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = GridCheck(A009DataCheckEntity,request);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}
}