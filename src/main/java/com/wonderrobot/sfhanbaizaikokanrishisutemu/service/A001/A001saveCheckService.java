package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A001;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderfulfly.common.SaveDataCheckUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A001saveCheckService
 *      Page: 社員
 * @version

 */

@Service
public class A001saveCheckService {

   
	@Log
	private String BUMONCheck (String BUMON) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMustNullCheckErr(BUMON, "部門");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String DENWABANGOU1Check (String DENWABANGOU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(DENWABANGOU1, 20, "電話番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(DENWABANGOU1, 0, "電話番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SHAINMEI1Check (String SHAINMEI1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getNotNullCheckErr(SHAINMEI1, "社員名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(SHAINMEI1, 10, "社員名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(SHAINMEI1, 0, "社員名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KEITAIBANGOU1Check (String KEITAIBANGOU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KEITAIBANGOU1, 20, " 携帯番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KEITAIBANGOU1, 0, " 携帯番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String LINE1Check (String LINE1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(LINE1, 20, "LINE");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(LINE1, 0, "LINE");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String PASUWAADO1Check (String PASUWAADO1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMustNullCheckErr(PASUWAADO1, "パスワード");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(PASUWAADO1, 20, "パスワード");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(PASUWAADO1, 0, "パスワード");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String ROGUINID1Check (String ROGUINID1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getKeyNullCheckErr(ROGUINID1, "ログインID");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(ROGUINID1, 30, "ログインID");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(ROGUINID1, 0, "ログインID");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String EMAIL1Check (String EMAIL1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(EMAIL1, 50, "EMAIL");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(EMAIL1, 0, "EMAIL");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	public String saveDataCheck (HttpServletRequest request, A001DataCheckEntity A001DataCheckEntity) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		String BUMON = null;
		String DENWABANGOU1 = null;
		String SHAINMEI1 = null;
		String KEITAIBANGOU1 = null;
		String LINE1 = null;
		String PASUWAADO1 = null;
		String ROGUINID1 = null;
		String EMAIL1 = null;
		msgBuffer = new StringBuffer();
		BUMON = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A001DataCheckEntity.getBUMON()));
		DENWABANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A001DataCheckEntity.getDENWABANGOU1()));
		SHAINMEI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A001DataCheckEntity.getSHAINMEI1()));
		KEITAIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A001DataCheckEntity.getKEITAIBANGOU1()));
		LINE1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A001DataCheckEntity.getLINE1()));
		PASUWAADO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A001DataCheckEntity.getPASUWAADO1()));
		ROGUINID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A001DataCheckEntity.getROGUINID1()));
		EMAIL1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A001DataCheckEntity.getEMAIL1()));
		
		
		errMsg = BUMONCheck(BUMON);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = DENWABANGOU1Check(DENWABANGOU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = SHAINMEI1Check(SHAINMEI1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = KEITAIBANGOU1Check(KEITAIBANGOU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = LINE1Check(LINE1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = PASUWAADO1Check(PASUWAADO1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = ROGUINID1Check(ROGUINID1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = EMAIL1Check(EMAIL1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}
}