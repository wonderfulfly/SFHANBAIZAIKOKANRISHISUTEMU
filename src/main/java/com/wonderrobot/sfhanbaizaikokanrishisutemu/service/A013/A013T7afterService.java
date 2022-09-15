package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectBUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOUDao;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderfulfly.core.util.RequestUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterdeleteBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterdeleteBUHINSYOUSAI1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterupdateBUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterinsertBUHINSYOUSAIDao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectSYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectSYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectBUHINSYOUSAIRINJIHYOU2Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7afterselectBUHINSYOUSAIEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterselectBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7afterupdateBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7afterService
 *      Page: 部品管理画面
 *      Function: 部品管理画面部品詳細インポートafter
 * @version

 */

@Service
public class A013T7afterService {
	@Autowired
	private A013T7afterselectBUHINDao A013T7afterselectBUHINDao;
	@Autowired
	private A013T7afterselectBUHINSYOUSAIRINJIHYOUDao A013T7afterselectBUHINSYOUSAIRINJIHYOUDao;
	@Autowired
	private A013T7afterdeleteBUHINSYOUSAIDao A013T7afterdeleteBUHINSYOUSAIDao;
	@Autowired
	private A013T7afterdeleteBUHINSYOUSAI1Dao A013T7afterdeleteBUHINSYOUSAI1Dao;
	@Autowired
	private A013T7afterupdateBUHINDao A013T7afterupdateBUHINDao;
	@Autowired
	private A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao;
	@Autowired
	private A013T7afterinsertBUHINSYOUSAIDao A013T7afterinsertBUHINSYOUSAIDao;
	@Autowired
	private A013T7afterselectSYAINDao A013T7afterselectSYAINDao;
	@Autowired
	private A013T7afterselectBUHINSYOUSAIRINJIHYOU2Dao A013T7afterselectBUHINSYOUSAIRINJIHYOU2Dao;
	@Autowired
	private A013T7afterselectBUHINSYOUSAIDao A013T7afterselectBUHINSYOUSAIDao;
	@Autowired
	private A013T7afterupdateBUHINSYOUSAIDao A013T7afterupdateBUHINSYOUSAIDao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void A013T7after (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//部品注文書NO
		String BUHINCHUUBUNSHONO = null;
		//部品注文書明細NO
		String BUHINCHUUBUNSHOMEISAINO = null;
		List<A013T7afterselectBUHINEntity> A013T7afterselectBUHINList2 = null;
		
		A013T7afterselectBUHINEntity A013T7afterselectBUHINEntity = null;
		
		String ay2_BUHIN_KAKUTEIKUBUN = null;
		//ログインID
		String ROGUINID = null;
		List<A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity> A013T7afterselectBUHINSYOUSAIRINJIHYOUList3 = null;
		
		A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_HINMEI = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_CHUUBUNSHONO = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_CHUUBUNSHOMEISAINO = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_KYAKUSAKIMEISHOU = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_HINBAN = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_ASENBURIRAIN = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_KIKAIMEISHOU = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_BUHINMEISHOU = null;
		
		int ay3_BUHINSYOUSAIRINJIHYOU_SEISAKUSUU = 0;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_MAISUU = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_HIDZUKE = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_HINBANNO = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_KIBOUNOUKI = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_TOUROKUSHAID = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_BIKOU1 = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_HITSUYOU = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_TEHAI = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_KANRYOU = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHAID = null;
		
		double ay3_BUHINSYOUSAIRINJIHYOU_KOUNYUUTANKA = 0.0;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_KOUNYUUHIDZUKE = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_NYUUKAYOTEIBI = null;
		
		String ay3_BUHINSYOUSAIRINJIHYOU_NYUUKAHIDZUKE = null;
		
		int ay3_BUHINSYOUSAIRINJIHYOU_SOUKOSUU1 = 0;
		
		double ay3_BUHINSYOUSAIRINJIHYOU_SHOUKEI = 0.0;
		int A013T7afterdeleteBUHINSYOUSAIList = 0;
		//空白のデータを削除する
		String KUUHAKUNODEETAWOSAKUJOSURU = null;
		int A013T7afterdeleteBUHINSYOUSAI1List = 0;
		int A013T7afterupdateBUHINList = 0;
		//のログインIDと一致する
		String NOROGUINIDTOITCHISURU = null;
		List<A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity> A013T7afterselectBUHINSYOUSAIRINJIHYOU1List7 = null;
		int i = 0;
		
		A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_SEISAKUHINKUBUN = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_HINBANNO = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_HINMEI = null;
		
		int ay7_BUHINSYOUSAIRINJIHYOU_KOSUU = 0;
		
		int ay7_BUHINSYOUSAIRINJIHYOU_SOUKOSUU = 0;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_ZAISHITSU_KEISHIKI = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_SEISAKUSHA = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_BIKOU = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_KIBOUNOUKI = null;
		
		double ay7_BUHINSYOUSAIRINJIHYOU_KOUNYUUTANKA = 0.0;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_KOUNYUUHIDZUKE = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_NYUUKAHIDZUKE = null;
		
		double ay7_BUHINSYOUSAIRINJIHYOU_SHOUKEI = 0.0;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_TOUROKUSHAID = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_BIKOU1 = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_HITSUYOU = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_TEHAI = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_KANRYOU = null;
		
		int ay7_BUHINSYOUSAIRINJIHYOU_SOUKOSUU1 = 0;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_NYUUKAYOTEIBI = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_TANTOUSHAID = null;
		
		String ay7_BUHINSYOUSAIRINJIHYOU_HINBANNO1 = null;
		int A013T7afterinsertBUHINSYOUSAIList = 0;
		List<A013T7afterselectSYAINEntity> A013T7afterselectSYAINList8 = null;
		
		A013T7afterselectSYAINEntity A013T7afterselectSYAINEntity = null;
		
		String ay8_SYAIN_SHAINMEI = null;
		//ログインID(ループ開始)
		String ROGUINID_RUUPUKAISHI_ = null;
		List<A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity> A013T7afterselectBUHINSYOUSAIRINJIHYOU2List9 = null;
		int j = 0;
		
		A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_HINMEI = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_KYAKUSAKIMEISHOU = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_HINBAN = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_ASENBURIRAIN = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_KIKAIMEISHOU = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_BUHINMEISHOU = null;
		
		int ay9_BUHINSYOUSAIRINJIHYOU_SEISAKUSUU = 0;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_TANTOUSHA = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_MAISUU = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_HINBANNO = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_KIBOUNOUKI = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_TOUROKUSHAID = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_HITSUYOU = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_TEHAI = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_KANRYOU = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_TANTOUSHAID = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_SEISAKUSHA = null;
		
		double ay9_BUHINSYOUSAIRINJIHYOU_KOUNYUUTANKA = 0.0;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_KOUNYUUHIDZUKE = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_NYUUKAYOTEIBI = null;
		
		String ay9_BUHINSYOUSAIRINJIHYOU_NYUUKAHIDZUKE = null;
		
		int ay9_BUHINSYOUSAIRINJIHYOU_SOUKOSUU1 = 0;
		
		double ay9_BUHINSYOUSAIRINJIHYOU_SHOUKEI = 0.0;
		List<Double> A013T7afterselectBUHINSYOUSAIList10 = null;
		
		double KOUNYUUTANKA_SUM = 0.0;
		
		String KOUJIKANRIBANGOU = null;
		int A013T7afterupdateBUHINSYOUSAIList = 0;
		String sysDate = DateUtil.getDBPatternDate();
		String loginID = (String) request.getSession().getAttribute("USER_ID");
		String SHANAIKOUJIBANGOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHANAIKOUJIBANGOU")));String KOUNYUUTANKA = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUNYUUTANKA")));
		BUHINCHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHONO")));
		BUHINCHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHOMEISAINO")));
		ROGUINID = loginID;
		KUUHAKUNODEETAWOSAKUJOSURU = null;
		NOROGUINIDTOITCHISURU = loginID;
		ROGUINID_RUUPUKAISHI_ = loginID;
		//データ操作2:テーブル「部品」の「確定区分」を取得,条件は「注文書NO」が画面項目「部品注文書NO」,且つ「注文書明細NO」が画面項目「部品注文書明細NO」,「確定区分」が"1"
		A013T7afterselectBUHINList2 = A013T7afterselectBUHINDao.A013T7afterselectBUHIN(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
		if (A013T7afterselectBUHINList2 != null && A013T7afterselectBUHINList2.size() > 0) {
			A013T7afterselectBUHINEntity = A013T7afterselectBUHINList2.get(0);
			if (A013T7afterselectBUHINEntity != null) {
				ay2_BUHIN_KAKUTEIKUBUN = StringUtil.changeNullToBlank(A013T7afterselectBUHINEntity.getKAKUTEIKUBUN());
			}
		}
		//項目<確定区分>が空白ではない場合
		if (!StringUtil.isNullOrBlank(ay2_BUHIN_KAKUTEIKUBUN)) {
			//「データは確定されており,繰り返しインポートすることはできません」メッセージを表示する
			jsonObj.setScript("r", "alert('データは確定されており,繰り返しインポートすることはできません');");
			//処理終了
		}
		//その他場合
		else {
			//データ操作3:テーブル「部品詳細臨時表」の「品名,注文書NO,注文書明細NO,社内工事番号,客先名称,品番,アセンブリライン,機械名称,部品名称,製作数,担当者,枚数,日付,品番NO,希望納期,登録者ID,備考1,必要,手配,完了,担当者ID,製作数,購入単価,購入日付,入荷予定日,入荷日付,総個数1,小計」を取得,条件は「登録者ID」がログインID
			A013T7afterselectBUHINSYOUSAIRINJIHYOUList3 = A013T7afterselectBUHINSYOUSAIRINJIHYOUDao.A013T7afterselectBUHINSYOUSAIRINJIHYOU(ROGUINID);
			if (A013T7afterselectBUHINSYOUSAIRINJIHYOUList3 != null && A013T7afterselectBUHINSYOUSAIRINJIHYOUList3.size() > 0) {
				A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity = A013T7afterselectBUHINSYOUSAIRINJIHYOUList3.get(0);
				if (A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity != null) {
					ay3_BUHINSYOUSAIRINJIHYOU_HINMEI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getHINMEI());
					ay3_BUHINSYOUSAIRINJIHYOU_CHUUBUNSHONO = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getCHUUBUNSHONO());
					ay3_BUHINSYOUSAIRINJIHYOU_CHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getCHUUBUNSHOMEISAINO());
					ay3_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getSHANAIKOUJIBANGOU());
					ay3_BUHINSYOUSAIRINJIHYOU_KYAKUSAKIMEISHOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getKYAKUSAKIMEISHOU());
					ay3_BUHINSYOUSAIRINJIHYOU_HINBAN = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getHINBAN());
					ay3_BUHINSYOUSAIRINJIHYOU_ASENBURIRAIN = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getASENBURIRAIN());
					ay3_BUHINSYOUSAIRINJIHYOU_KIKAIMEISHOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getKIKAIMEISHOU());
					ay3_BUHINSYOUSAIRINJIHYOU_BUHINMEISHOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getBUHINMEISHOU());
					ay3_BUHINSYOUSAIRINJIHYOU_SEISAKUSUU = A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getSEISAKUSUU();
					ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getTANTOUSHA());
					ay3_BUHINSYOUSAIRINJIHYOU_MAISUU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getMAISUU());
					ay3_BUHINSYOUSAIRINJIHYOU_HIDZUKE = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getHIDZUKE());
					ay3_BUHINSYOUSAIRINJIHYOU_HINBANNO = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getHINBANNO());
					ay3_BUHINSYOUSAIRINJIHYOU_KIBOUNOUKI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getKIBOUNOUKI());
					ay3_BUHINSYOUSAIRINJIHYOU_TOUROKUSHAID = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getTOUROKUSHAID());
					ay3_BUHINSYOUSAIRINJIHYOU_BIKOU1 = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getBIKOU1());
					ay3_BUHINSYOUSAIRINJIHYOU_HITSUYOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getHITSUYOU());
					ay3_BUHINSYOUSAIRINJIHYOU_TEHAI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getTEHAI());
					ay3_BUHINSYOUSAIRINJIHYOU_KANRYOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getKANRYOU());
					ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHAID = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getTANTOUSHAID());
					ay3_BUHINSYOUSAIRINJIHYOU_SEISAKUSUU = A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getSEISAKUSUU();
					ay3_BUHINSYOUSAIRINJIHYOU_KOUNYUUTANKA = A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getKOUNYUUTANKA();
					ay3_BUHINSYOUSAIRINJIHYOU_KOUNYUUHIDZUKE = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getKOUNYUUHIDZUKE());
					ay3_BUHINSYOUSAIRINJIHYOU_NYUUKAYOTEIBI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getNYUUKAYOTEIBI());
					ay3_BUHINSYOUSAIRINJIHYOU_NYUUKAHIDZUKE = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getNYUUKAHIDZUKE());
					ay3_BUHINSYOUSAIRINJIHYOU_SOUKOSUU1 = A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getSOUKOSUU1();
					ay3_BUHINSYOUSAIRINJIHYOU_SHOUKEI = A013T7afterselectBUHINSYOUSAIRINJIHYOUEntity.getSHOUKEI();
				}
			}
			//項目<社内工事番号>が空白ではない場合
			if (!StringUtil.isNullOrBlank(ay3_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU)) {
				//<社内工事番号>が画面項目「社内工事番号」ではない場合
				if (!StringUtil.changeNullToBlank(ay3_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU).equals(SHANAIKOUJIBANGOU)) {
					//「インポート失敗しました:社内工事番号と一致ではない,変更してください。」メッセージを表示する
					jsonObj.setScript("r", "alert('インポート失敗しました:社内工事番号と一致ではない,変更してください。');");
					//処理終了
				}
				//その他場合
				else {
					//データ操作4:テーブル「部品詳細」の項目「注文書NO」が画面項目「部品注文書NO」,且つ「注文書明細NO」が画面項目「部品注文書明細NO」,且つ「確定区分」が"1"でないのデータを削除する
					A013T7afterdeleteBUHINSYOUSAIList = A013T7afterdeleteBUHINSYOUSAIDao.A013T7afterdeleteBUHINSYOUSAI(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
					//データ操作5:テーブル「部品詳細」の項目「注文書NO」が画面項目「部品注文書NO」,且つ「注文書明細NO」が画面項目「部品注文書明細NO」,且つ「確定区分」が空白のデータを削除する
					A013T7afterdeleteBUHINSYOUSAI1List = A013T7afterdeleteBUHINSYOUSAI1Dao.A013T7afterdeleteBUHINSYOUSAI1(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KUUHAKUNODEETAWOSAKUJOSURU);
					//データ操作6:テーブル「部品」の項目「注文書NO」が値「部品注文書NO」,且つ項目「注文書明細NO」が値「部品注文書明細NO」のデータに対して,項目「得意先」を<客先名称>,項目「品番」を<品番>,項目「工事管理番号」を<社内工事番号>,項目「アセンブリライン」を<アセンブリライン>,項目「機械名称」を<機械名称>,項目「部品名称」を<部品名称>,項目「製作数」を<製作数>,項目「担当者」を<担当者>,項目「枚数」を<枚数>,項目「日付」を<日付>に変更する
					A013T7afterupdateBUHINList = A013T7afterupdateBUHINDao.A013T7afterupdateBUHIN(ay3_BUHINSYOUSAIRINJIHYOU_KYAKUSAKIMEISHOU, ay3_BUHINSYOUSAIRINJIHYOU_HINBAN, ay3_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU, ay3_BUHINSYOUSAIRINJIHYOU_ASENBURIRAIN, ay3_BUHINSYOUSAIRINJIHYOU_KIKAIMEISHOU, ay3_BUHINSYOUSAIRINJIHYOU_BUHINMEISHOU, ay3_BUHINSYOUSAIRINJIHYOU_SEISAKUSUU, ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA, ay3_BUHINSYOUSAIRINJIHYOU_MAISUU, ay3_BUHINSYOUSAIRINJIHYOU_HIDZUKE, BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
					//データ操作7:テーブル「部品詳細臨時表」によるテーブル「部品詳細」にデータ登録,「部品詳細」テーブルの項目「製作品区分,品番NO,品名,個数,総個数,材質,仕入先,備考,希望納期,購入単価,手配日,入荷日,小計,登録者ID,備考1,必要,手配,完了,総個数1,入荷予定日,担当,品番NO1」はテーブル「部品詳細臨時表」から取得するデータ項目「製作品区分,品番NO,品名,個数,総個数,材質_形式,製作者,備考,希望納期,購入単価,購入日付,入荷日付,小計,登録者ID,備考1,必要,手配,完了,総個数1,入荷予定日,担当者ID,品番NO1」,条件は「登録者ID」がのログインIDと一致する,「注文書NO」が「部品注文書NO」,「注文書明細NO」が「部品注文書明細NO」,「工事管理番号」が<社内工事番号>
					A013T7afterselectBUHINSYOUSAIRINJIHYOU1List7 = A013T7afterselectBUHINSYOUSAIRINJIHYOU1Dao.A013T7afterselectBUHINSYOUSAIRINJIHYOU1(NOROGUINIDTOITCHISURU);
					if (A013T7afterselectBUHINSYOUSAIRINJIHYOU1List7 != null && A013T7afterselectBUHINSYOUSAIRINJIHYOU1List7.size() > 0) {
						for (i = 0;i < A013T7afterselectBUHINSYOUSAIRINJIHYOU1List7.size();i++) {
							A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity = A013T7afterselectBUHINSYOUSAIRINJIHYOU1List7.get(i);;
							if (A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity != null) {
								ay7_BUHINSYOUSAIRINJIHYOU_SEISAKUHINKUBUN = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getSEISAKUHINKUBUN());
								ay7_BUHINSYOUSAIRINJIHYOU_HINBANNO = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getHINBANNO());
								ay7_BUHINSYOUSAIRINJIHYOU_HINMEI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getHINMEI());
								ay7_BUHINSYOUSAIRINJIHYOU_KOSUU = A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getKOSUU();
								ay7_BUHINSYOUSAIRINJIHYOU_SOUKOSUU = A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getSOUKOSUU();
								ay7_BUHINSYOUSAIRINJIHYOU_ZAISHITSU_KEISHIKI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getZAISHITSU_KEISHIKI());
								ay7_BUHINSYOUSAIRINJIHYOU_SEISAKUSHA = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getSEISAKUSHA());
								ay7_BUHINSYOUSAIRINJIHYOU_BIKOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getBIKOU());
								ay7_BUHINSYOUSAIRINJIHYOU_KIBOUNOUKI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getKIBOUNOUKI());
								ay7_BUHINSYOUSAIRINJIHYOU_KOUNYUUTANKA = A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getKOUNYUUTANKA();
								ay7_BUHINSYOUSAIRINJIHYOU_KOUNYUUHIDZUKE = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getKOUNYUUHIDZUKE());
								ay7_BUHINSYOUSAIRINJIHYOU_NYUUKAHIDZUKE = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getNYUUKAHIDZUKE());
								ay7_BUHINSYOUSAIRINJIHYOU_SHOUKEI = A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getSHOUKEI();
								ay7_BUHINSYOUSAIRINJIHYOU_TOUROKUSHAID = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getTOUROKUSHAID());
								ay7_BUHINSYOUSAIRINJIHYOU_BIKOU1 = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getBIKOU1());
								ay7_BUHINSYOUSAIRINJIHYOU_HITSUYOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getHITSUYOU());
								ay7_BUHINSYOUSAIRINJIHYOU_TEHAI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getTEHAI());
								ay7_BUHINSYOUSAIRINJIHYOU_KANRYOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getKANRYOU());
								ay7_BUHINSYOUSAIRINJIHYOU_SOUKOSUU1 = A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getSOUKOSUU1();
								ay7_BUHINSYOUSAIRINJIHYOU_NYUUKAYOTEIBI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getNYUUKAYOTEIBI());
								ay7_BUHINSYOUSAIRINJIHYOU_TANTOUSHAID = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getTANTOUSHAID());
								ay7_BUHINSYOUSAIRINJIHYOU_HINBANNO1 = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU1Entity.getHINBANNO1());
							}
							//
							A013T7afterinsertBUHINSYOUSAIList = A013T7afterinsertBUHINSYOUSAIDao.A013T7afterinsertBUHINSYOUSAI(ay7_BUHINSYOUSAIRINJIHYOU_SEISAKUHINKUBUN, ay7_BUHINSYOUSAIRINJIHYOU_HINBANNO, ay7_BUHINSYOUSAIRINJIHYOU_HINMEI, ay7_BUHINSYOUSAIRINJIHYOU_KOSUU, ay7_BUHINSYOUSAIRINJIHYOU_SOUKOSUU, ay7_BUHINSYOUSAIRINJIHYOU_ZAISHITSU_KEISHIKI, ay7_BUHINSYOUSAIRINJIHYOU_SEISAKUSHA, ay7_BUHINSYOUSAIRINJIHYOU_BIKOU, ay7_BUHINSYOUSAIRINJIHYOU_KIBOUNOUKI, ay7_BUHINSYOUSAIRINJIHYOU_KOUNYUUTANKA, ay7_BUHINSYOUSAIRINJIHYOU_KOUNYUUHIDZUKE, ay7_BUHINSYOUSAIRINJIHYOU_NYUUKAHIDZUKE, ay7_BUHINSYOUSAIRINJIHYOU_SHOUKEI, ay7_BUHINSYOUSAIRINJIHYOU_TOUROKUSHAID, ay7_BUHINSYOUSAIRINJIHYOU_BIKOU1, ay7_BUHINSYOUSAIRINJIHYOU_HITSUYOU, ay7_BUHINSYOUSAIRINJIHYOU_TEHAI, ay7_BUHINSYOUSAIRINJIHYOU_KANRYOU, ay7_BUHINSYOUSAIRINJIHYOU_SOUKOSUU1, ay7_BUHINSYOUSAIRINJIHYOU_NYUUKAYOTEIBI, ay7_BUHINSYOUSAIRINJIHYOU_TANTOUSHAID, ay7_BUHINSYOUSAIRINJIHYOU_HINBANNO1, BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, ay3_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU);
						}
					}
					//「得意先USER」に<客先名称>を設定する
					jsonObj.setScript("r","SF.setServerExecute(true);$('#TOKUISAKIUSER').val('" +StringUtil.escapeJSTags(ay3_BUHINSYOUSAIRINJIHYOU_KYAKUSAKIMEISHOU)+ "');");
					//「アセンブリライン名称」に<アセンブリライン>を設定する
					jsonObj.setScript("r","SF.setServerExecute(true);$('#ASENBURIRAINMEISHOU').val('" +StringUtil.escapeJSTags(ay3_BUHINSYOUSAIRINJIHYOU_ASENBURIRAIN)+ "');");
					//「機械名称MC」に<機械名称>を設定する
					jsonObj.setScript("r","SF.setServerExecute(true);$('#KIKAIMEISHOUMC').val('" +StringUtil.escapeJSTags(ay3_BUHINSYOUSAIRINJIHYOU_KIKAIMEISHOU)+ "');");
					//「部品名称PART」に<部品名称>を設定する
					jsonObj.setScript("r","SF.setServerExecute(true);$('#BUHINMEISHOUPART').val('" +StringUtil.escapeJSTags(ay3_BUHINSYOUSAIRINJIHYOU_BUHINMEISHOU)+ "');");
					//「製作数QTY」に<製作数>を設定する
					jsonObj.setScript("r","SF.setServerExecute(true);$('#SEISAKUSUUQTY').val('"+ay3_BUHINSYOUSAIRINJIHYOU_SEISAKUSUU+"');");
					//「工事管理番号」に<社内工事番号>を設定する
					jsonObj.setScript("r","SF.setServerExecute(true);$('#KOUJIKANRIBANGOU1').val('" +StringUtil.escapeJSTags(ay3_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU)+ "');");
					//データ操作8:テーブル「社員」の「社員名」を取得,条件は「社員ID」が<担当者>
					A013T7afterselectSYAINList8 = A013T7afterselectSYAINDao.A013T7afterselectSYAIN(ay3_BUHINSYOUSAIRINJIHYOU_TANTOUSHA);
					if (A013T7afterselectSYAINList8 != null && A013T7afterselectSYAINList8.size() > 0) {
						A013T7afterselectSYAINEntity = A013T7afterselectSYAINList8.get(0);
						if (A013T7afterselectSYAINEntity != null) {
							ay8_SYAIN_SHAINMEI = StringUtil.changeNullToBlank(A013T7afterselectSYAINEntity.getSHAINMEI());
						}
					}
					//「担当者」に<社員名>を設定する
					jsonObj.setScript("r", "SF.setComboboxValue('TANTOUSHA1','"+ ay8_SYAIN_SHAINMEI +"');");
					//データ操作9:テーブル「部品詳細臨時表」の「品名,社内工事番号,客先名称,品番,アセンブリライン,機械名称,部品名称,製作数,担当者,枚数,品番NO,希望納期,登録者ID,必要,手配,完了,担当者ID,製作者,購入単価,購入日付,入荷予定日,入荷日付,総個数1,小計」を取得,条件は「登録者ID」がログインID(ループ開始)
					A013T7afterselectBUHINSYOUSAIRINJIHYOU2List9 = A013T7afterselectBUHINSYOUSAIRINJIHYOU2Dao.A013T7afterselectBUHINSYOUSAIRINJIHYOU2(ROGUINID_RUUPUKAISHI_);
					if (A013T7afterselectBUHINSYOUSAIRINJIHYOU2List9 != null && A013T7afterselectBUHINSYOUSAIRINJIHYOU2List9.size() > 0) {
						for (j = 0;j < A013T7afterselectBUHINSYOUSAIRINJIHYOU2List9.size();j++) {
							A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity = A013T7afterselectBUHINSYOUSAIRINJIHYOU2List9.get(j);;
							if (A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity != null) {
								ay9_BUHINSYOUSAIRINJIHYOU_HINMEI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getHINMEI());
								ay9_BUHINSYOUSAIRINJIHYOU_SHANAIKOUJIBANGOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getSHANAIKOUJIBANGOU());
								ay9_BUHINSYOUSAIRINJIHYOU_KYAKUSAKIMEISHOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getKYAKUSAKIMEISHOU());
								ay9_BUHINSYOUSAIRINJIHYOU_HINBAN = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getHINBAN());
								ay9_BUHINSYOUSAIRINJIHYOU_ASENBURIRAIN = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getASENBURIRAIN());
								ay9_BUHINSYOUSAIRINJIHYOU_KIKAIMEISHOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getKIKAIMEISHOU());
								ay9_BUHINSYOUSAIRINJIHYOU_BUHINMEISHOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getBUHINMEISHOU());
								ay9_BUHINSYOUSAIRINJIHYOU_SEISAKUSUU = A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getSEISAKUSUU();
								ay9_BUHINSYOUSAIRINJIHYOU_TANTOUSHA = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getTANTOUSHA());
								ay9_BUHINSYOUSAIRINJIHYOU_MAISUU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getMAISUU());
								ay9_BUHINSYOUSAIRINJIHYOU_HINBANNO = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getHINBANNO());
								ay9_BUHINSYOUSAIRINJIHYOU_KIBOUNOUKI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getKIBOUNOUKI());
								ay9_BUHINSYOUSAIRINJIHYOU_TOUROKUSHAID = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getTOUROKUSHAID());
								ay9_BUHINSYOUSAIRINJIHYOU_HITSUYOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getHITSUYOU());
								ay9_BUHINSYOUSAIRINJIHYOU_TEHAI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getTEHAI());
								ay9_BUHINSYOUSAIRINJIHYOU_KANRYOU = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getKANRYOU());
								ay9_BUHINSYOUSAIRINJIHYOU_TANTOUSHAID = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getTANTOUSHAID());
								ay9_BUHINSYOUSAIRINJIHYOU_SEISAKUSHA = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getSEISAKUSHA());
								ay9_BUHINSYOUSAIRINJIHYOU_KOUNYUUTANKA = A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getKOUNYUUTANKA();
								ay9_BUHINSYOUSAIRINJIHYOU_KOUNYUUHIDZUKE = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getKOUNYUUHIDZUKE());
								ay9_BUHINSYOUSAIRINJIHYOU_NYUUKAYOTEIBI = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getNYUUKAYOTEIBI());
								ay9_BUHINSYOUSAIRINJIHYOU_NYUUKAHIDZUKE = StringUtil.changeNullToBlank(A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getNYUUKAHIDZUKE());
								ay9_BUHINSYOUSAIRINJIHYOU_SOUKOSUU1 = A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getSOUKOSUU1();
								ay9_BUHINSYOUSAIRINJIHYOU_SHOUKEI = A013T7afterselectBUHINSYOUSAIRINJIHYOU2Entity.getSHOUKEI();
							}
							//項目<品名>が空白ではない場合
							if (!StringUtil.isNullOrBlank(ay9_BUHINSYOUSAIRINJIHYOU_HINMEI)) {
								//データ操作10:「部品詳細」テーブルから「注文書明細NO」単位の「購入単価の合計」を取得,条件は「品名」が<品名>,ソート順「購入単価」,件数範囲「3」
								A013T7afterselectBUHINSYOUSAIList10 = A013T7afterselectBUHINSYOUSAIDao.A013T7afterselectBUHINSYOUSAI(ay9_BUHINSYOUSAIRINJIHYOU_HINMEI);
								if (A013T7afterselectBUHINSYOUSAIList10 != null && A013T7afterselectBUHINSYOUSAIList10.size() > 0) {
									if (A013T7afterselectBUHINSYOUSAIList10.get(0) != null) {
										KOUNYUUTANKA_SUM = A013T7afterselectBUHINSYOUSAIList10.get(0);
									}
								}
								//「購入単価」が空白でない場合
								if (!StringUtil.isNullOrBlank(KOUNYUUTANKA)) {
									//データ操作11:テーブル「部品詳細」の項目「注文書NO」が値<部品注文書NO>,且つ「注文書明細NO」が値<部品注文書明細NO>,且つ「工事管理番号」が値<工事管理番号>,且つ「品番NO」が値<品番NO>のデータに対して,項目「購入単価」を文字列<購入単価の合計>に変更する
									A013T7afterupdateBUHINSYOUSAIList = A013T7afterupdateBUHINSYOUSAIDao.A013T7afterupdateBUHINSYOUSAI(KOUNYUUTANKA_SUM, BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU, ay9_BUHINSYOUSAIRINJIHYOU_HINBANNO);
									//処理終了
								}
								//処理終了
							}
							//検索結果ループ終了
						}
					}
					//「インポート完了。」メッセージを表示する
					jsonObj.setScript("r", "alert('インポート完了。');");
					//Grid検索処理:「B16」と関連付け,条件は「購入日付1<入荷日付,部品注文書NO=部品詳細.注文書NO,部品注文書明細NO=部品詳細.注文書明細NO」,検索後処理関数「kyoutukannsuu_nyukahidukei」
					jsonObj.setScript("r", "doSmartSearch(\"194\",\"99\",\"2\",\"kyoutukannsuu_nyukahidukei()\");");
					//処理終了
				}
				//処理終了
			}
			//処理終了
		}

	}
}