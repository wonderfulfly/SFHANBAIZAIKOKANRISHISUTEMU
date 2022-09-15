package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderfulfly.common.SaveDataCheckUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A011saveCheckService
 *      Page: 注文管理詳細
 * @version

 */

@Service
public class A011saveCheckService {

   
	@Log
	private String KEIYAKUSAKI1Check (String KEIYAKUSAKI1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KEIYAKUSAKI1, 100, "契約先");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KEIYAKUSAKI1, 0, "契約先");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String USDGOUKEICheck (String USDGOUKEI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(USDGOUKEI, "USD合計");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KYAKUSAKITANTOU1Check (String KYAKUSAKITANTOU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KYAKUSAKITANTOU1, 30, "客先担当");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KYAKUSAKITANTOU1, 0, "客先担当");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String HINMEI1Check (String HINMEI1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(HINMEI1, 50, "品名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(HINMEI1, 0, "品名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String NOUNYUUBI1Check (String NOUNYUUBI1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(NOUNYUUBI1, "納入日");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String MITSUMORISHONO1Check (String MITSUMORISHONO1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(MITSUMORISHONO1, 10, "見積書NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(MITSUMORISHONO1, 0, "見積書NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SHANAIKOUJIBANGOU1Check (String SHANAIKOUJIBANGOU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMustNullCheckErr(SHANAIKOUJIBANGOU1, "社内工事番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(SHANAIKOUJIBANGOU1, 10, "社内工事番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(SHANAIKOUJIBANGOU1, 0, "社内工事番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String RESHIITONOCheck (String RESHIITONO) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(RESHIITONO, 10, "レシートNO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(RESHIITONO, 0, "レシートNO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SHUKKANO1Check (String SHUKKANO1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(SHUKKANO1, 30, "出荷NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(SHUKKANO1, 0, "出荷NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String RMBGOUKEICheck (String RMBGOUKEI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(RMBGOUKEI, "RMB合計");
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
	private String JPYGOUKEICheck (String JPYGOUKEI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(JPYGOUKEI, "JPY合計");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String NOUKIYOTEIBI1Check (String NOUKIYOTEIBI1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(NOUKIYOTEIBI1, "納期予定日");
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
	private String SUURYOUCheck (String SUURYOU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(SUURYOU, 0, "数量");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(SUURYOU, 0, "数量");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getIntCheckErr(SUURYOU, "数量");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String HANBAITANKACheck (String HANBAITANKA) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(HANBAITANKA, 0, "販売単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(HANBAITANKA, 0, "販売単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(HANBAITANKA, "販売単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String HANBAIKINGAKUCheck (String HANBAIKINGAKU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(HANBAIKINGAKU, "販売金額");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KOUMOKUCheck (String KOUMOKU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KOUMOKU, 100, "項目");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KOUMOKU, 0, "項目");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String TSUKAMATSUNYUUKINGAKUJPYCheck (String TSUKAMATSUNYUUKINGAKUJPY) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(TSUKAMATSUNYUUKINGAKUJPY, "仕入金額(JPY)");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String CHUUBUNSHONO2Check (String CHUUBUNSHONO2) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(CHUUBUNSHONO2, 10, "注文書NOGIRD");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(CHUUBUNSHONO2, 0, "注文書NOGIRD");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String TSUKAMATSUNYUUKINGAKURMBCheck (String TSUKAMATSUNYUUKINGAKURMB) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(TSUKAMATSUNYUUKINGAKURMB, "仕入金額(RMB)");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String TSUKAMATSUNYUUKINGAKUUSDCheck (String TSUKAMATSUNYUUKINGAKUUSD) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(TSUKAMATSUNYUUKINGAKUUSD, "仕入金額(USD)");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SHUKKOFURAGUCheck (String SHUKKOFURAGU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(SHUKKOFURAGU, 1, "出庫フラグ");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(SHUKKOFURAGU, 0, "出庫フラグ");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String GridCheck (A011DataCheckEntity A011DataCheckEntity, HttpServletRequest request) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		int rowDataLine = 0;
		String gridOpFlag = null;
		String SUURYOU = null;
		String HANBAITANKA = null;
		String HANBAIKINGAKU = null;
		String KOUMOKU = null;
		String TSUKAMATSUNYUUKINGAKUJPY = null;
		String CHUUBUNSHONO2 = null;
		String TSUKAMATSUNYUUKINGAKURMB = null;
		String TSUKAMATSUNYUUKINGAKUUSD = null;
		String SHUKKOFURAGU = null;
		msgBuffer = new StringBuffer();
		rowDataLine = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid95")));
		
		for (int j =0; j <= rowDataLine; j++) {
			gridOpFlag = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid95flg" + (j+1))));
			if ("1".equals(gridOpFlag) || "2".equals(gridOpFlag)) {
				SUURYOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SUURYOU_j")));
				HANBAITANKA = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("HANBAITANKA_j")));
				HANBAIKINGAKU = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("HANBAIKINGAKU_j")));
				KOUMOKU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUMOKU_j")));
				TSUKAMATSUNYUUKINGAKUJPY = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUKINGAKUJPY_j")));
				CHUUBUNSHONO2 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO2_j")));
				TSUKAMATSUNYUUKINGAKURMB = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUKINGAKURMB_j")));
				TSUKAMATSUNYUUKINGAKUUSD = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUKINGAKUUSD_j")));
				SHUKKOFURAGU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHUKKOFURAGU_j")));
				
				
				errMsg = SUURYOUCheck(SUURYOU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = HANBAITANKACheck(HANBAITANKA);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = HANBAIKINGAKUCheck(HANBAIKINGAKU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = KOUMOKUCheck(KOUMOKU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = TSUKAMATSUNYUUKINGAKUJPYCheck(TSUKAMATSUNYUUKINGAKUJPY);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = CHUUBUNSHONO2Check(CHUUBUNSHONO2);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = TSUKAMATSUNYUUKINGAKURMBCheck(TSUKAMATSUNYUUKINGAKURMB);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = TSUKAMATSUNYUUKINGAKUUSDCheck(TSUKAMATSUNYUUKINGAKUUSD);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = SHUKKOFURAGUCheck(SHUKKOFURAGU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
			}
		}
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	public String saveDataCheck (HttpServletRequest request, A011DataCheckEntity A011DataCheckEntity) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		String KEIYAKUSAKI1 = null;
		String USDGOUKEI = null;
		String KYAKUSAKITANTOU1 = null;
		String HINMEI1 = null;
		String NOUNYUUBI1 = null;
		String MITSUMORISHONO1 = null;
		String SHANAIKOUJIBANGOU1 = null;
		String RESHIITONO = null;
		String SHUKKANO1 = null;
		String RMBGOUKEI = null;
		String DENWABANGOU1 = null;
		String JPYGOUKEI = null;
		String NOUKIYOTEIBI1 = null;
		String ADORESU1 = null;
		String CHUUMONHIDZUKE1 = null;
		msgBuffer = new StringBuffer();
		KEIYAKUSAKI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getKEIYAKUSAKI1()));
		USDGOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(A011DataCheckEntity.getUSDGOUKEI()));
		KYAKUSAKITANTOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getKYAKUSAKITANTOU1()));
		HINMEI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getHINMEI1()));
		NOUNYUUBI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getNOUNYUUBI1()));
		MITSUMORISHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getMITSUMORISHONO1()));
		SHANAIKOUJIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getSHANAIKOUJIBANGOU1()));
		RESHIITONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getRESHIITONO()));
		SHUKKANO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getSHUKKANO1()));
		RMBGOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(A011DataCheckEntity.getRMBGOUKEI()));
		DENWABANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getDENWABANGOU1()));
		JPYGOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(A011DataCheckEntity.getJPYGOUKEI()));
		NOUKIYOTEIBI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getNOUKIYOTEIBI1()));
		ADORESU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getADORESU1()));
		CHUUMONHIDZUKE1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A011DataCheckEntity.getCHUUMONHIDZUKE1()));
		
		
		errMsg = KEIYAKUSAKI1Check(KEIYAKUSAKI1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = USDGOUKEICheck(USDGOUKEI);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = KYAKUSAKITANTOU1Check(KYAKUSAKITANTOU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = HINMEI1Check(HINMEI1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = NOUNYUUBI1Check(NOUNYUUBI1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = MITSUMORISHONO1Check(MITSUMORISHONO1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = SHANAIKOUJIBANGOU1Check(SHANAIKOUJIBANGOU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = RESHIITONOCheck(RESHIITONO);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = SHUKKANO1Check(SHUKKANO1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = RMBGOUKEICheck(RMBGOUKEI);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = DENWABANGOU1Check(DENWABANGOU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = JPYGOUKEICheck(JPYGOUKEI);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = NOUKIYOTEIBI1Check(NOUKIYOTEIBI1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = ADORESU1Check(ADORESU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = CHUUMONHIDZUKE1Check(CHUUMONHIDZUKE1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = GridCheck(A011DataCheckEntity,request);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}
}