package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A004;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderfulfly.common.SaveDataCheckUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004.A004DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A004saveCheckService
 *      Page: 会社
 * @version

 */

@Service
public class A004saveCheckService {

   
	@Log
	private String RENRAKUSAKI1Check (String RENRAKUSAKI1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(RENRAKUSAKI1, 20, "連絡先");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(RENRAKUSAKI1, 0, "連絡先");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String ADORESU1Check (String ADORESU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(ADORESU1, 100, "アドレス");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(ADORESU1, 0, "アドレス");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KAISHARYAKUSHOU1Check (String KAISHARYAKUSHOU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KAISHARYAKUSHOU1, 100, "会社略称");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KAISHARYAKUSHOU1, 0, "会社略称");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KAISHAMEI1Check (String KAISHAMEI1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getNotNullCheckErr(KAISHAMEI1, "会社名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KAISHAMEI1, 100, "会社名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KAISHAMEI1, 0, "会社名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SHIHARAIKIGEN1Check (String SHIHARAIKIGEN1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(SHIHARAIKIGEN1, 0, "支払期限");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(SHIHARAIKIGEN1, 0, "支払期限");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getIntCheckErr(SHIHARAIKIGEN1, "支払期限");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	public String saveDataCheck (HttpServletRequest request, A004DataCheckEntity A004DataCheckEntity) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		String RENRAKUSAKI1 = null;
		String ADORESU1 = null;
		String KAISHARYAKUSHOU1 = null;
		String KAISHAMEI1 = null;
		String SHIHARAIKIGEN1 = null;
		msgBuffer = new StringBuffer();
		RENRAKUSAKI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A004DataCheckEntity.getRENRAKUSAKI1()));
		ADORESU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A004DataCheckEntity.getADORESU1()));
		KAISHARYAKUSHOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A004DataCheckEntity.getKAISHARYAKUSHOU1()));
		KAISHAMEI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A004DataCheckEntity.getKAISHAMEI1()));
		SHIHARAIKIGEN1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A004DataCheckEntity.getSHIHARAIKIGEN1()));
		
		
		errMsg = RENRAKUSAKI1Check(RENRAKUSAKI1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = ADORESU1Check(ADORESU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = KAISHARYAKUSHOU1Check(KAISHARYAKUSHOU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = KAISHAMEI1Check(KAISHAMEI1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = SHIHARAIKIGEN1Check(SHIHARAIKIGEN1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}
}