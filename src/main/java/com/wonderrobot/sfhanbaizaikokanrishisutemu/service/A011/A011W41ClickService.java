package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderfulfly.core.util.RequestUtil;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickdeleteZAIKOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateTYUMONSYODao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateTYUMONSYOMEISAIDao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickselectZAIKOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOU1Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickselectZAIKOU1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOU2Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickselectZAIKOU2Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOU3Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickselectZAIKOU3Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickinsertZAIKOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.GetAutonum;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectZAIKOU4Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickselectZAIKOU4Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W41ClickselectSYOUHINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickselectSYOUHINDao;
import java.text.DecimalFormat;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateSYOUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateBUHINSYOUSAI1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateBUHINSYOUSAI2Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateTYUMONSYO1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W41ClickupdateTYUMONSYOMEISAI1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W41ClickService
 *      Page: 注文管理詳細
 *      Function: 注文管理詳細全部出庫_Click
 * @version

 */

@Service
public class A011W41ClickService {
	@Autowired
	private A011W41ClickdeleteZAIKOUDao A011W41ClickdeleteZAIKOUDao;
	@Autowired
	private A011W41ClickupdateBUHINSYOUSAIDao A011W41ClickupdateBUHINSYOUSAIDao;
	@Autowired
	private A011W41ClickupdateTYUMONSYODao A011W41ClickupdateTYUMONSYODao;
	@Autowired
	private A011W41ClickupdateTYUMONSYOMEISAIDao A011W41ClickupdateTYUMONSYOMEISAIDao;
	@Autowired
	private A011W41ClickselectZAIKOUDao A011W41ClickselectZAIKOUDao;
	@Autowired
	private A011W41ClickselectZAIKOU1Dao A011W41ClickselectZAIKOU1Dao;
	@Autowired
	private A011W41ClickselectZAIKOU2Dao A011W41ClickselectZAIKOU2Dao;
	@Autowired
	private A011W41ClickselectZAIKOU3Dao A011W41ClickselectZAIKOU3Dao;
	@Autowired
	private A011W41ClickinsertZAIKOUDao A011W41ClickinsertZAIKOUDao;
	@Autowired
	private A011W41ClickselectZAIKOU4Dao A011W41ClickselectZAIKOU4Dao;
	@Autowired
	private A011W41ClickselectSYOUHINDao A011W41ClickselectSYOUHINDao;
	@Autowired
	private A011W41ClickupdateSYOUHINDao A011W41ClickupdateSYOUHINDao;
	@Autowired
	private A011W41ClickupdateBUHINSYOUSAI1Dao A011W41ClickupdateBUHINSYOUSAI1Dao;
	@Autowired
	private A011W41ClickupdateBUHINSYOUSAI2Dao A011W41ClickupdateBUHINSYOUSAI2Dao;
	@Autowired
	private A011W41ClickupdateTYUMONSYO1Dao A011W41ClickupdateTYUMONSYO1Dao;
	@Autowired
	private A011W41ClickupdateTYUMONSYOMEISAI1Dao A011W41ClickupdateTYUMONSYOMEISAI1Dao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void A011W41Click (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//注文書NO
		String CHUUBUNSHONO1 = null;
		int A011W41ClickdeleteZAIKOUList = 0;
		int A011W41ClickupdateBUHINSYOUSAIList = 0;
		int A011W41ClickupdateTYUMONSYOList = 0;
		int A011W41ClickupdateTYUMONSYOMEISAIList = 0;
		List<A011W41ClickselectZAIKOUEntity> A011W41ClickselectZAIKOUList = null;
		
		A011W41ClickselectZAIKOUEntity A011W41ClickselectZAIKOUEntity = null;
		
		String ZAIKOU_SHUTSUNYUUKOJOUTAI = null;
		List<A011W41ClickselectZAIKOU1Entity> A011W41ClickselectZAIKOU1List = null;
		
		A011W41ClickselectZAIKOU1Entity A011W41ClickselectZAIKOU1Entity = null;
		List<A011W41ClickselectZAIKOU2Entity> A011W41ClickselectZAIKOU2List = null;
		
		A011W41ClickselectZAIKOU2Entity A011W41ClickselectZAIKOU2Entity = null;
		List<A011W41ClickselectZAIKOU3Entity> A011W41ClickselectZAIKOU3List1 = null;
		int i = 0;
		
		A011W41ClickselectZAIKOU3Entity A011W41ClickselectZAIKOU3Entity = null;
		
		String ay1_ZAIKOU_SHOUHINMEISHOU = null;
		
		String ay1_ZAIKOU_SHUTSUNYUUKOJIKAN = null;
		
		String ay1_ZAIKOU_SHUTSUNYUUKOJOUTAI = null;
		
		String ay1_ZAIKOU_CHUUBUNSHOMEISAINO = null;
		
		String ay1_ZAIKOU_CHUUBUNSHONO = null;
		
		String ay1_ZAIKOU_KOUJIKANRIBANGOU = null;
		
		String ay1_ZAIKOU_TSUKAMATSUNYUUSAKI = null;
		
		double ay1_ZAIKOU_GOUKEI = 0.0;
		
		String ay1_ZAIKOU_SHUKKANO = null;
		
		int ay1_ZAIKOU_SUURYOU = 0;
		
		int ay1_ZAIKOU_ZAIKOSUURYOU = 0;
		
		double ay1_ZAIKOU_PRICE = 0.0;
		
		String ay1_ZAIKOU_HINBANNO = null;
		//今日
		String KYOU = null;
		
		double SHOUKEI = 0.0;
		//出荷NO
		String SHUKKANO1 = null;
		
		String ZAIKONOautoNum = null;
		GetAutonum autoNum = null;
		int A011W41ClickinsertZAIKOUList = 0;
		List<A011W41ClickselectZAIKOU4Entity> A011W41ClickselectZAIKOU4List1 = null;
		int j = 0;
		
		A011W41ClickselectZAIKOU4Entity A011W41ClickselectZAIKOU4Entity = null;
		
		String ay1_ZAIKOU_SHOUHINNO = null;
		List<A011W41ClickselectSYOUHINEntity> A011W41ClickselectSYOUHINList = null;
		
		A011W41ClickselectSYOUHINEntity A011W41ClickselectSYOUHINEntity = null;
		
		int SYOUHIN_ZAIKOSUURYOU = 0;
		int A011W41ClickupdateSYOUHINList = 0;
		int A011W41ClickupdateBUHINSYOUSAI1List = 0;
		int A011W41ClickupdateBUHINSYOUSAI2List = 0;
		int A011W41ClickupdateTYUMONSYO1List = 0;
		int A011W41ClickupdateTYUMONSYOMEISAI1List = 0;
		String SHUTSUNYUUKOFURAGU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHUTSUNYUUKOFURAGU1")));
		String sysDate = DateUtil.getDBPatternDate();
		String systemDate = sysDate;
		DecimalFormat df;
		CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		KYOU = systemDate;
		SHUKKANO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHUKKANO1")));
		//条件は項目「出入庫フラグ」が空白でない且つ項目「出入庫フラグ」が"2"場合
		if (!StringUtil.isNullOrBlank(SHUTSUNYUUKOFURAGU1) && StringUtil.changeNullToBlank(SHUTSUNYUUKOFURAGU1).equals("2")) {
			//データ操作:テーブル「在庫」の項目「注文書NO」が「注文書NO」,「出入庫状態」が"2"のデータを削除する
			A011W41ClickdeleteZAIKOUList = A011W41ClickdeleteZAIKOUDao.A011W41ClickdeleteZAIKOU(CHUUBUNSHONO1);
			//データ操作:テーブル「部品詳細」の項目「注文書NO」が「注文書NO」のデータに対して,項目「入庫フラグ」を文字列"0"に変更する
			A011W41ClickupdateBUHINSYOUSAIList = A011W41ClickupdateBUHINSYOUSAIDao.A011W41ClickupdateBUHINSYOUSAI(CHUUBUNSHONO1);
			//データ操作:テーブル「注文書」の項目「注文書NO」が「注文書NO」のデータに対して,項目「出入庫フラグ」を文字列"0"に変更する
			A011W41ClickupdateTYUMONSYOList = A011W41ClickupdateTYUMONSYODao.A011W41ClickupdateTYUMONSYO(CHUUBUNSHONO1);
			//データ操作:テーブル「注文書明細」の項目「注文書NO」が「注文書NO」のデータに対して,項目「出庫フラグ」を文字列"0"に変更する
			A011W41ClickupdateTYUMONSYOMEISAIList = A011W41ClickupdateTYUMONSYOMEISAIDao.A011W41ClickupdateTYUMONSYOMEISAI(CHUUBUNSHONO1);
			//「出庫キャンセル」メッセージを表示する
			jsonObj.setScript("r", "alert('出庫キャンセル');");
			//「全部出庫」に"全部出庫"を設定する
			jsonObj.setScript("r", "$('#W4').val('" + StringUtil.escapeJSTags("全部出庫") + "');");
			//「出入庫フラグ」に""を設定する
			jsonObj.setScript("r", "SF.setComboboxValue('SHUTSUNYUUKOFURAGU1','"+ "" +"');");
			//処理終了
		}
		//その他場合
		else {
			//データ操作:テーブル「在庫」のデータの項目「出入庫状態」を取得,条件は「注文書NO」が「注文書NO」
			A011W41ClickselectZAIKOUList = A011W41ClickselectZAIKOUDao.A011W41ClickselectZAIKOU(CHUUBUNSHONO1);
			if (A011W41ClickselectZAIKOUList != null && A011W41ClickselectZAIKOUList.size() > 0) {
				A011W41ClickselectZAIKOUEntity = A011W41ClickselectZAIKOUList.get(0);
				if (A011W41ClickselectZAIKOUEntity != null) {
					ZAIKOU_SHUTSUNYUUKOJOUTAI = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOUEntity.getSHUTSUNYUUKOJOUTAI());
				}
			}
			//<出入庫状態>が空白場合
			if (StringUtil.isNullOrBlank(ZAIKOU_SHUTSUNYUUKOJOUTAI)) {
				//「出庫情報なし」メッセージを表示する
				jsonObj.setScript("r", "alert('出庫情報なし');");
				//処理終了
			}
			//その他場合
			else {
				//データ操作:テーブル「在庫」のデータの項目「出入庫状態」を取得,条件は「注文書NO」が「注文書NO」,「出入庫状態」が"0"
				A011W41ClickselectZAIKOU1List = A011W41ClickselectZAIKOU1Dao.A011W41ClickselectZAIKOU1(CHUUBUNSHONO1);
				if (A011W41ClickselectZAIKOU1List != null && A011W41ClickselectZAIKOU1List.size() > 0) {
					A011W41ClickselectZAIKOU1Entity = A011W41ClickselectZAIKOU1List.get(0);
					if (A011W41ClickselectZAIKOU1Entity != null) {
						ZAIKOU_SHUTSUNYUUKOJOUTAI = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU1Entity.getSHUTSUNYUUKOJOUTAI());
					}
				}
				//<出入庫状態>が空白でない場合
				if (!StringUtil.isNullOrBlank(ZAIKOU_SHUTSUNYUUKOJOUTAI)) {
					//「入庫していない部品があります。入庫してください。」メッセージを表示する
					jsonObj.setScript("r", "alert('入庫していない部品があります。入庫してください。');");
					//処理終了
				}
				//その他場合
				else {
					//データ操作:テーブル「在庫」のデータの項目「出入庫状態」を取得,条件は「注文書NO」が「注文書NO」,「出入庫状態」が"2"
					A011W41ClickselectZAIKOU2List = A011W41ClickselectZAIKOU2Dao.A011W41ClickselectZAIKOU2(CHUUBUNSHONO1);
					if (A011W41ClickselectZAIKOU2List != null && A011W41ClickselectZAIKOU2List.size() > 0) {
						A011W41ClickselectZAIKOU2Entity = A011W41ClickselectZAIKOU2List.get(0);
						if (A011W41ClickselectZAIKOU2Entity != null) {
							ZAIKOU_SHUTSUNYUUKOJOUTAI = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU2Entity.getSHUTSUNYUUKOJOUTAI());
						}
					}
					//<出入庫状態>が空白でない場合
					if (!StringUtil.isNullOrBlank(ZAIKOU_SHUTSUNYUUKOJOUTAI)) {
						//「出庫済みです。再度出庫する必要ないです。」メッセージを表示する
						jsonObj.setScript("r", "alert('出庫済みです。再度出庫する必要ないです。');");
						//処理終了
					}
					//その他場合
					else {
						//データ操作1:テーブル「在庫」のデータの項目「商品名称,出入庫時間,出入庫状態,注文書明細NO,注文書NO,工事管理番号,仕入先,合計,出荷NO,数量,在庫数量,単価,品番NO」を取得,条件は「注文書NO」が「注文書NO」(ループ開始)
						A011W41ClickselectZAIKOU3List1 = A011W41ClickselectZAIKOU3Dao.A011W41ClickselectZAIKOU3(CHUUBUNSHONO1);
						if (A011W41ClickselectZAIKOU3List1 != null && A011W41ClickselectZAIKOU3List1.size() > 0) {
							for (i = 0;i < A011W41ClickselectZAIKOU3List1.size();i++) {
								A011W41ClickselectZAIKOU3Entity = A011W41ClickselectZAIKOU3List1.get(i);;
								if (A011W41ClickselectZAIKOU3Entity != null) {
									ay1_ZAIKOU_SHOUHINMEISHOU = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU3Entity.getSHOUHINMEISHOU());
									ay1_ZAIKOU_SHUTSUNYUUKOJIKAN = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU3Entity.getSHUTSUNYUUKOJIKAN());
									ay1_ZAIKOU_SHUTSUNYUUKOJOUTAI = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU3Entity.getSHUTSUNYUUKOJOUTAI());
									ay1_ZAIKOU_CHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU3Entity.getCHUUBUNSHOMEISAINO());
									ay1_ZAIKOU_CHUUBUNSHONO = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU3Entity.getCHUUBUNSHONO());
									ay1_ZAIKOU_KOUJIKANRIBANGOU = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU3Entity.getKOUJIKANRIBANGOU());
									ay1_ZAIKOU_TSUKAMATSUNYUUSAKI = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU3Entity.getTSUKAMATSUNYUUSAKI());
									ay1_ZAIKOU_GOUKEI = A011W41ClickselectZAIKOU3Entity.getGOUKEI();
									ay1_ZAIKOU_SHUKKANO = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU3Entity.getSHUKKANO());
									ay1_ZAIKOU_SUURYOU = A011W41ClickselectZAIKOU3Entity.getSUURYOU();
									ay1_ZAIKOU_ZAIKOSUURYOU = A011W41ClickselectZAIKOU3Entity.getZAIKOSUURYOU();
									ay1_ZAIKOU_PRICE = A011W41ClickselectZAIKOU3Entity.getPRICE();
									ay1_ZAIKOU_HINBANNO = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU3Entity.getHINBANNO());
								}
								
								autoNum = new GetAutonum();
								ZAIKONOautoNum = autoNum.getMaxNumValue("ZAIKOU","ZAIKONO");
								//データ操作2:テーブル「在庫」にデータ登録,「商品名称」が<商品名称>,「出入庫時間」が今日,「出入庫状態」が"2",「注文書明細NO」が<注文書明細NO>,「工事管理番号」が<工事管理番号>,「仕入先」が<仕入先>,「代金金額」が<小計>,「出荷NO」が「出荷NO」,「数量」が<数量>,「在庫NO」が自動採番,「単価」が<単価>,「品番NO」が<品番NO>
								A011W41ClickinsertZAIKOUList = A011W41ClickinsertZAIKOUDao.A011W41ClickinsertZAIKOU(ay1_ZAIKOU_SHOUHINMEISHOU, KYOU, ay1_ZAIKOU_CHUUBUNSHOMEISAINO, ay1_ZAIKOU_KOUJIKANRIBANGOU, ay1_ZAIKOU_TSUKAMATSUNYUUSAKI, SHOUKEI, SHUKKANO1, ay1_ZAIKOU_SUURYOU, ZAIKONOautoNum, ay1_ZAIKOU_PRICE, ay1_ZAIKOU_HINBANNO);
								//検索結果ループ終了
							}
						}
						//データ操作1:テーブル「在庫」のデータの項目「商品NO,数量」を取得,条件は「注文書NO」が「注文書NO」,「出入庫状態」が"2"(ループ開始)
						A011W41ClickselectZAIKOU4List1 = A011W41ClickselectZAIKOU4Dao.A011W41ClickselectZAIKOU4(CHUUBUNSHONO1);
						if (A011W41ClickselectZAIKOU4List1 != null && A011W41ClickselectZAIKOU4List1.size() > 0) {
							for (j = 0;j < A011W41ClickselectZAIKOU4List1.size();j++) {
								A011W41ClickselectZAIKOU4Entity = A011W41ClickselectZAIKOU4List1.get(j);;
								if (A011W41ClickselectZAIKOU4Entity != null) {
									ay1_ZAIKOU_SHOUHINNO = StringUtil.changeNullToBlank(A011W41ClickselectZAIKOU4Entity.getSHOUHINNO());
									ay1_ZAIKOU_SUURYOU = A011W41ClickselectZAIKOU4Entity.getSUURYOU();
								}
								//<商品NO>が空白でない,且つ<数量>が空白でない場合
								if (!StringUtil.isNullOrBlank(ay1_ZAIKOU_SHOUHINNO) && ay1_ZAIKOU_SUURYOU != 0) {
									//データ操作:テーブル「商品」のデータの項目「在庫数量」を取得,条件は「商品NO」が<商品NO>
									A011W41ClickselectSYOUHINList = A011W41ClickselectSYOUHINDao.A011W41ClickselectSYOUHIN(ay1_ZAIKOU_SHOUHINNO);
									if (A011W41ClickselectSYOUHINList != null && A011W41ClickselectSYOUHINList.size() > 0) {
										A011W41ClickselectSYOUHINEntity = A011W41ClickselectSYOUHINList.get(0);
										if (A011W41ClickselectSYOUHINEntity != null) {
											SYOUHIN_ZAIKOSUURYOU = A011W41ClickselectSYOUHINEntity.getZAIKOSUURYOU();
										}
									}
									//変数計算(double,小数点以下第2位を四捨五入):<在庫数量>=<在庫数量>-<数量>
									SYOUHIN_ZAIKOSUURYOU=(int) (SYOUHIN_ZAIKOSUURYOU-ay1_ZAIKOU_SUURYOU);
									df = new DecimalFormat("#0.00");
									SYOUHIN_ZAIKOSUURYOU = StringUtil.changeStringToInt(df.format(SYOUHIN_ZAIKOSUURYOU));
									//データ操作:テーブル「商品」の項目「商品NO」が値<商品NO>のデータに対して,項目「在庫数量」を文字列<在庫数量>に変更する
									A011W41ClickupdateSYOUHINList = A011W41ClickupdateSYOUHINDao.A011W41ClickupdateSYOUHIN(SYOUHIN_ZAIKOSUURYOU, ay1_ZAIKOU_SHOUHINNO);
									//処理終了
								}
								//検索結果ループ終了
							}
						}
						//データ操作:テーブル「部品詳細」の項目「注文書NO」が値「注文書NO」のデータに対して,項目「入庫フラグ」を"2"に変更する
						A011W41ClickupdateBUHINSYOUSAI1List = A011W41ClickupdateBUHINSYOUSAI1Dao.A011W41ClickupdateBUHINSYOUSAI1(CHUUBUNSHONO1);
						//データ操作:テーブル「部品詳細」の項目「注文書NO」が「注文書NO」のデータに対して,項目「入庫フラグ」を文字列"2"に変更する
						A011W41ClickupdateBUHINSYOUSAI2List = A011W41ClickupdateBUHINSYOUSAI2Dao.A011W41ClickupdateBUHINSYOUSAI2(CHUUBUNSHONO1);
						//データ操作:テーブル「注文書」の項目「注文書NO」が「注文書NO」のデータに対して,項目「出入庫フラグ」を文字列"2"に変更する
						A011W41ClickupdateTYUMONSYO1List = A011W41ClickupdateTYUMONSYO1Dao.A011W41ClickupdateTYUMONSYO1(CHUUBUNSHONO1);
						//データ操作:テーブル「注文書明細」の項目「注文書NO」が「注文書NO」のデータに対して,項目「出庫フラグ」を文字列"2"に変更する
						A011W41ClickupdateTYUMONSYOMEISAI1List = A011W41ClickupdateTYUMONSYOMEISAI1Dao.A011W41ClickupdateTYUMONSYOMEISAI1(CHUUBUNSHONO1);
						//「出庫済み」メッセージを表示する
						jsonObj.setScript("r", "alert('出庫済み');");
						//「全部出庫」に"出庫取消"を設定する
						jsonObj.setScript("r", "$('#W4').val('" + StringUtil.escapeJSTags("出庫取消") + "');");
						//「出入庫フラグ」に"出庫済み"を設定する
						jsonObj.setScript("r", "SF.setComboboxSelectedByText('SHUTSUNYUUKOFURAGU1','"+ "出庫済み" +"');");
						//処理終了
					}
					//処理終了
				}
				//処理終了
			}
			//処理終了
		}

	}
}