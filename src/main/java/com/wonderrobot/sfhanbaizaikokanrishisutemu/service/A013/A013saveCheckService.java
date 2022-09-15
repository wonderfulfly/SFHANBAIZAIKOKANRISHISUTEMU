package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderfulfly.common.SaveDataCheckUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013DataCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013BUHINRepeatCheckEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013BUHINRepeatCheckDao;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A013saveCheckService
 *      Page: 部品管理画面
 * @version

 */

@Service
public class A013saveCheckService {
	@Autowired
	private A013BUHINRepeatCheckDao A013BUHINRepeatCheckDao;

   
	@Log
	private String BUHINCHUUBUNSHOMEISAINOCheck (String BUHINCHUUBUNSHOMEISAINO) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getKeyNullCheckErr(BUHINCHUUBUNSHOMEISAINO, "部品注文書明細NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(BUHINCHUUBUNSHOMEISAINO, 10, "部品注文書明細NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(BUHINCHUUBUNSHOMEISAINO, 0, "部品注文書明細NO");
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
	private String MAISUU1Check (String MAISUU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(MAISUU1, 10, "枚数");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(MAISUU1, 0, "枚数");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String BUHINCHUUBUNSHONOCheck (String BUHINCHUUBUNSHONO) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getKeyNullCheckErr(BUHINCHUUBUNSHONO, "部品注文書NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(BUHINCHUUBUNSHONO, 10, "部品注文書NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(BUHINCHUUBUNSHONO, 0, "部品注文書NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SEISAKUSUUQTYCheck (String SEISAKUSUUQTY) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(SEISAKUSUUQTY, 0, "製作数QTY");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(SEISAKUSUUQTY, 0, "製作数QTY");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getIntCheckErr(SEISAKUSUUQTY, "製作数QTY");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KOUJIKANRIBANGOU1Check (String KOUJIKANRIBANGOU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getKeyNullCheckErr(KOUJIKANRIBANGOU1, "工事管理番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KOUJIKANRIBANGOU1, 10, "工事管理番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KOUJIKANRIBANGOU1, 0, "工事管理番号");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String ASENBURIRAINMEISHOUCheck (String ASENBURIRAINMEISHOU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(ASENBURIRAINMEISHOU, 100, "アセンブリライン名称");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(ASENBURIRAINMEISHOU, 0, "アセンブリライン名称");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KIKAIMEISHOUMCCheck (String KIKAIMEISHOUMC) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KIKAIMEISHOUMC, 50, "機械名称MC");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KIKAIMEISHOUMC, 0, "機械名称MC");
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
	private String KAKUTEIKUBUN1Check (String KAKUTEIKUBUN1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KAKUTEIKUBUN1, 1, "確定区分1");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KAKUTEIKUBUN1, 0, "確定区分1");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String TOKUISAKIUSERCheck (String TOKUISAKIUSER) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(TOKUISAKIUSER, 100, "得意先USER");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(TOKUISAKIUSER, 0, "得意先USER");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String BUHINMEISHOUPARTCheck (String BUHINMEISHOUPART) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(BUHINMEISHOUPART, 50, "部品名称PART");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(BUHINMEISHOUPART, 0, "部品名称PART");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KIBOUTANKACheck (String KIBOUTANKA) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KIBOUTANKA, 0, "希望単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KIBOUTANKA, 0, "希望単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(KIBOUTANKA, "希望単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String HINMEICheck (String HINMEI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMustNullCheckErr(HINMEI, "品名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(HINMEI, 50, "品名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(HINMEI, 0, "品名");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KOUNYUUTANKACheck (String KOUNYUUTANKA) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KOUNYUUTANKA, 0, "購入単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KOUNYUUTANKA, 0, "購入単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(KOUNYUUTANKA, "購入単価");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SOUKOSUUCheck (String SOUKOSUU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMustNullCheckErr(SOUKOSUU, "総個数");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getIntCheckErr(SOUKOSUU, "総個数");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KOSUUCheck (String KOSUU) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMustNullCheckErr(KOSUU, "個数");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KOSUU, 0, "個数");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KOSUU, 0, "個数");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getIntCheckErr(KOSUU, "個数");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String NYUUKABICheck (String NYUUKABI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(NYUUKABI, "入荷日付");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KAKUTEIKUBUN2Check (String KAKUTEIKUBUN2) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KAKUTEIKUBUN2, 1, "確定区分");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KAKUTEIKUBUN2, 0, "確定区分");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String CHUUBUNSHOMEISAINO1Check (String CHUUBUNSHOMEISAINO1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(CHUUBUNSHOMEISAINO1, 10, "注文書明細NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(CHUUBUNSHOMEISAINO1, 0, "注文書明細NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String CHUUBUNSHONO1Check (String CHUUBUNSHONO1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(CHUUBUNSHONO1, 10, "注文書NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(CHUUBUNSHONO1, 0, "注文書NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KIBOUNOUKICheck (String KIBOUNOUKI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(KIBOUNOUKI, "希望納期");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String TEHAISAKICheck (String TEHAISAKI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(TEHAISAKI, 50, "手配先");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(TEHAISAKI, 0, "手配先");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SHOUKEICheck (String SHOUKEI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDoubleCheckErr(SHOUKEI, "小計");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String TEHAIBICheck (String TEHAIBI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(TEHAIBI, "購入日付");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String KOUJIKANRIBANGOU2Check (String KOUJIKANRIBANGOU2, String KOUJIKANRIBANGOU1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getNotNullCheckErr(KOUJIKANRIBANGOU1, "工事管理番号hide");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(KOUJIKANRIBANGOU2, 10, "工事管理番号hide");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(KOUJIKANRIBANGOU2, 0, "工事管理番号hide");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String NYUUKAYOTEIBICheck (String NYUUKAYOTEIBI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getDateCheckErr(NYUUKAYOTEIBI, "入荷予定日");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String TSUKAMATSUNYUUSAKICheck (String TSUKAMATSUNYUUSAKI) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMustNullCheckErr(TSUKAMATSUNYUUSAKI, "仕入先");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(TSUKAMATSUNYUUSAKI, 50, "仕入先");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(TSUKAMATSUNYUUSAKI, 0, "仕入先");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String HINBANNO1Check (String HINBANNO1) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMaxLengthCheckErr(HINBANNO1, 10, "品番NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = SaveDataCheckUtil.getMinLengthCheckErr(HINBANNO1, 0, "品番NO");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String SEISAKUHINKUBUNCheck (String SEISAKUHINKUBUN) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		
		errMsg = SaveDataCheckUtil.getMustNullCheckErr(SEISAKUHINKUBUN, "区分");
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String GridCheck (A013DataCheckEntity A013DataCheckEntity, HttpServletRequest request) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		int rowDataLine = 0;
		String gridOpFlag = null;
		String KOUJIKANRIBANGOU1 = null;
		String KIBOUTANKA = null;
		String HINMEI = null;
		String KOUNYUUTANKA = null;
		String SOUKOSUU = null;
		String KOSUU = null;
		String NYUUKABI = null;
		String KAKUTEIKUBUN2 = null;
		String CHUUBUNSHOMEISAINO1 = null;
		String CHUUBUNSHONO1 = null;
		String KIBOUNOUKI = null;
		String TEHAISAKI = null;
		String SHOUKEI = null;
		String TEHAIBI = null;
		String KOUJIKANRIBANGOU2 = null;
		String NYUUKAYOTEIBI = null;
		String TSUKAMATSUNYUUSAKI = null;
		String HINBANNO1 = null;
		String SEISAKUHINKUBUN = null;
		msgBuffer = new StringBuffer();
		rowDataLine = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid99")));
		KOUJIKANRIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIKANRIBANGOU1")));
		
		for (int j =0; j <= rowDataLine; j++) {
			gridOpFlag = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99flg" + (j+1))));
			if ("1".equals(gridOpFlag) || "2".equals(gridOpFlag)) {
				KIBOUTANKA = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KIBOUTANKA_j")));
				HINMEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("HINMEI_j")));
				KOUNYUUTANKA = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUNYUUTANKA_j")));
				SOUKOSUU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SOUKOSUU_j")));
				KOSUU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOSUU_j")));
				NYUUKABI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("NYUUKABI_j")));
				KAKUTEIKUBUN2 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAKUTEIKUBUN2_j")));
				CHUUBUNSHOMEISAINO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHOMEISAINO1_j")));
				CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1_j")));
				KIBOUNOUKI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KIBOUNOUKI_j")));
				TEHAISAKI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("TEHAISAKI_j")));
				SHOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("SHOUKEI_j")));
				TEHAIBI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("TEHAIBI_j")));
				KOUJIKANRIBANGOU2 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIKANRIBANGOU2_j")));
				NYUUKAYOTEIBI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("NYUUKAYOTEIBI_j")));
				TSUKAMATSUNYUUSAKI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUSAKI_j")));
				HINBANNO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("HINBANNO1_j")));
				SEISAKUHINKUBUN = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SEISAKUHINKUBUN_j")));
				
				
				errMsg = KIBOUTANKACheck(KIBOUTANKA);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = HINMEICheck(HINMEI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = KOUNYUUTANKACheck(KOUNYUUTANKA);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = SOUKOSUUCheck(SOUKOSUU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = KOSUUCheck(KOSUU);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = NYUUKABICheck(NYUUKABI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = KAKUTEIKUBUN2Check(KAKUTEIKUBUN2);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = CHUUBUNSHOMEISAINO1Check(CHUUBUNSHOMEISAINO1);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = CHUUBUNSHONO1Check(CHUUBUNSHONO1);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = KIBOUNOUKICheck(KIBOUNOUKI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = TEHAISAKICheck(TEHAISAKI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = SHOUKEICheck(SHOUKEI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = TEHAIBICheck(TEHAIBI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = KOUJIKANRIBANGOU2Check(KOUJIKANRIBANGOU2, KOUJIKANRIBANGOU1);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = NYUUKAYOTEIBICheck(NYUUKAYOTEIBI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = TSUKAMATSUNYUUSAKICheck(TSUKAMATSUNYUUSAKI);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = HINBANNO1Check(HINBANNO1);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
				
				errMsg = SEISAKUHINKUBUNCheck(SEISAKUHINKUBUN);
				SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
			}
		}
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	private String BUHINRepeatCheck (HttpServletRequest request) throws Exception {

		List<A013BUHINRepeatCheckEntity> A013BUHINRepeatCheckEntityList = null;
		String errMsg = null;
		StringBuffer msgBuffer = null;
		msgBuffer = new StringBuffer();
		String KOUJIKANRIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIKANRIBANGOU1")));
		String BUHINCHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHOMEISAINO")));
		String BUHINCHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHONO")));
		A013BUHINRepeatCheckEntityList = A013BUHINRepeatCheckDao.A013BUHINRepeatCheckselectBUHIN(KOUJIKANRIBANGOU1, BUHINCHUUBUNSHOMEISAINO, BUHINCHUUBUNSHONO);
		if (A013BUHINRepeatCheckEntityList != null && A013BUHINRepeatCheckEntityList.size() > 0) {
			
			errMsg = SaveDataCheckUtil.getKeyRepeatErr("BUHIN");
			SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		}
		errMsg = msgBuffer.toString();

		return errMsg;
	}

   
	@Log
	public String saveDataCheck (HttpServletRequest request, A013DataCheckEntity A013DataCheckEntity) throws Exception {

		String errMsg = null;
		StringBuffer msgBuffer = null;
		String BUHINCHUUBUNSHOMEISAINO = null;
		String USDGOUKEI = null;
		String MAISUU1 = null;
		String BUHINCHUUBUNSHONO = null;
		String SEISAKUSUUQTY = null;
		String KOUJIKANRIBANGOU1 = null;
		String ASENBURIRAINMEISHOU = null;
		String KIKAIMEISHOUMC = null;
		String SHUKKANO1 = null;
		String RMBGOUKEI = null;
		String JPYGOUKEI = null;
		String KAKUTEIKUBUN1 = null;
		String TOKUISAKIUSER = null;
		String BUHINMEISHOUPART = null;
		String mode = null;
		msgBuffer = new StringBuffer();
		BUHINCHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getBUHINCHUUBUNSHOMEISAINO()));
		USDGOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(A013DataCheckEntity.getUSDGOUKEI()));
		MAISUU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getMAISUU1()));
		BUHINCHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getBUHINCHUUBUNSHONO()));
		SEISAKUSUUQTY = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getSEISAKUSUUQTY()));
		KOUJIKANRIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getKOUJIKANRIBANGOU1()));
		ASENBURIRAINMEISHOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getASENBURIRAINMEISHOU()));
		KIKAIMEISHOUMC = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getKIKAIMEISHOUMC()));
		SHUKKANO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getSHUKKANO1()));
		RMBGOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(A013DataCheckEntity.getRMBGOUKEI()));
		JPYGOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(A013DataCheckEntity.getJPYGOUKEI()));
		KAKUTEIKUBUN1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getKAKUTEIKUBUN1()));
		TOKUISAKIUSER = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getTOKUISAKIUSER()));
		BUHINMEISHOUPART = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(A013DataCheckEntity.getBUHINMEISHOUPART()));
		
		
		errMsg = BUHINCHUUBUNSHOMEISAINOCheck(BUHINCHUUBUNSHOMEISAINO);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = USDGOUKEICheck(USDGOUKEI);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = MAISUU1Check(MAISUU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = BUHINCHUUBUNSHONOCheck(BUHINCHUUBUNSHONO);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = SEISAKUSUUQTYCheck(SEISAKUSUUQTY);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = KOUJIKANRIBANGOU1Check(KOUJIKANRIBANGOU1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = ASENBURIRAINMEISHOUCheck(ASENBURIRAINMEISHOU);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = KIKAIMEISHOUMCCheck(KIKAIMEISHOUMC);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = SHUKKANO1Check(SHUKKANO1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = RMBGOUKEICheck(RMBGOUKEI);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = JPYGOUKEICheck(JPYGOUKEI);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = KAKUTEIKUBUN1Check(KAKUTEIKUBUN1);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = TOKUISAKIUSERCheck(TOKUISAKIUSER);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = BUHINMEISHOUPARTCheck(BUHINMEISHOUPART);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		
		errMsg = GridCheck(A013DataCheckEntity,request);
		SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("2".equals(mode)) {
			
			errMsg = BUHINRepeatCheck(request);
			SaveDataCheckUtil.addMsg(errMsg, msgBuffer);
		}
		errMsg = msgBuffer.toString();

		return errMsg;
	}
}