package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectMITUMORIRINJIHYOUDao;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU1Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectMITUMORIRINJIHYOU1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU2Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectMITUMORIRINJIHYOU2Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU3Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectMITUMORIRINJIHYOU3Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectTYUMONSYOEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectTYUMONSYODao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU4Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectMITUMORIRINJIHYOU4Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectKAISYAEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterinsertKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.GetAutonum;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterinsertTYUMONSYODao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterinsertMITUMORIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6afterselectMITUMORIRINJIHYOU5Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterselectMITUMORIRINJIHYOU5Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterinsertTYUMONSYOMEISAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6afterdeleteMITUMORIRINJIHYOUDao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6afterService
 *      Page: 注文管理検索
 *      Function: 注文管理検索見積書インポートafter
 * @version

 */

@Service
public class A010W6afterService {
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOUDao A010W6afterselectMITUMORIRINJIHYOUDao;
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU1Dao A010W6afterselectMITUMORIRINJIHYOU1Dao;
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU2Dao A010W6afterselectMITUMORIRINJIHYOU2Dao;
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU3Dao A010W6afterselectMITUMORIRINJIHYOU3Dao;
	@Autowired
	private A010W6afterselectTYUMONSYODao A010W6afterselectTYUMONSYODao;
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU4Dao A010W6afterselectMITUMORIRINJIHYOU4Dao;
	@Autowired
	private A010W6afterselectKAISYADao A010W6afterselectKAISYADao;
	@Autowired
	private A010W6afterinsertKAISYADao A010W6afterinsertKAISYADao;
	@Autowired
	private A010W6afterinsertTYUMONSYODao A010W6afterinsertTYUMONSYODao;
	@Autowired
	private A010W6afterinsertMITUMORIDao A010W6afterinsertMITUMORIDao;
	@Autowired
	private A010W6afterselectMITUMORIRINJIHYOU5Dao A010W6afterselectMITUMORIRINJIHYOU5Dao;
	@Autowired
	private A010W6afterinsertTYUMONSYOMEISAIDao A010W6afterinsertTYUMONSYOMEISAIDao;
	@Autowired
	private A010W6afterdeleteMITUMORIRINJIHYOUDao A010W6afterdeleteMITUMORIRINJIHYOUDao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void A010W6after (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//ログインID
		String ROGUINID = null;
		List<Double> A010W6afterselectMITUMORIRINJIHYOUList = null;
		
		double GOLD_SUM = 0.0;
		List<Double> A010W6afterselectMITUMORIRINJIHYOU1List = null;
		List<Double> A010W6afterselectMITUMORIRINJIHYOU2List = null;
		//ログインID(ループ開始)
		String ROGUINID_RUUPUKAISHI_ = null;
		List<A010W6afterselectMITUMORIRINJIHYOU3Entity> A010W6afterselectMITUMORIRINJIHYOU3List = null;
		int i = 0;
		
		A010W6afterselectMITUMORIRINJIHYOU3Entity A010W6afterselectMITUMORIRINJIHYOU3Entity = null;
		
		String MITUMORIRINJIHYOU_MITSUMORINO = null;
		
		String MITUMORIRINJIHYOU_HIDZUKE = null;
		
		String MITUMORIRINJIHYOU_KYAKUSAKI = null;
		
		String MITUMORIRINJIHYOU_SAKUSEISHA = null;
		
		String MITUMORIRINJIHYOU_HINMEI = null;
		
		double MITUMORIRINJIHYOU_SHOUKEI = 0.0;
		
		double MITUMORIRINJIHYOU_WARIBIKI = 0.0;
		
		double MITUMORIRINJIHYOU_GOUKEI = 0.0;
		
		String MITUMORIRINJIHYOU_KYAKUSAKITANTOU = null;
		List<A010W6afterselectTYUMONSYOEntity> A010W6afterselectTYUMONSYOList = null;
		
		A010W6afterselectTYUMONSYOEntity A010W6afterselectTYUMONSYOEntity = null;
		
		String TYUMONSYO_MITSUMORISHONO = null;
		List<A010W6afterselectMITUMORIRINJIHYOU4Entity> A010W6afterselectMITUMORIRINJIHYOU4List = null;
		int j = 0;
		
		A010W6afterselectMITUMORIRINJIHYOU4Entity A010W6afterselectMITUMORIRINJIHYOU4Entity = null;
		List<A010W6afterselectKAISYAEntity> A010W6afterselectKAISYAList = null;
		
		A010W6afterselectKAISYAEntity A010W6afterselectKAISYAEntity = null;
		
		String KAISYA_KAISHAID = null;
		
		String KAISHAIDautoNum = null;
		GetAutonum autoNum = null;
		int A010W6afterinsertKAISYAList = 0;
		
		String CHUUBUNSHONOautoNum = null;
		
		double JPY1 = 0.0;
		
		double RMB1 = 0.0;
		
		double USD1 = 0.0;
		int A010W6afterinsertTYUMONSYOList = 0;
		int A010W6afterinsertMITUMORIList = 0;
		List<A010W6afterselectMITUMORIRINJIHYOU5Entity> A010W6afterselectMITUMORIRINJIHYOU5List = null;
		int k = 0;
		
		A010W6afterselectMITUMORIRINJIHYOU5Entity A010W6afterselectMITUMORIRINJIHYOU5Entity = null;
		
		String MITUMORIRINJIHYOU_KOUMOKU = null;
		
		int MITUMORIRINJIHYOU_SUURYOU = 0;
		
		double MITUMORIRINJIHYOU_PRICE = 0.0;
		
		double MITUMORIRINJIHYOU_GOLD = 0.0;
		
		String MITUMORIRINJIHYOU_KAHEI = null;
		
		String CHUUBUNSHOMEISAINOautoNum = null;
		int A010W6afterinsertTYUMONSYOMEISAIList = 0;
		//ログインIDのデータを削除する
		String ROGUINIDNODEETAWOSAKUJOSURU = null;
		int A010W6afterdeleteMITUMORIRINJIHYOUList = 0;
		String RMB = null;
		String JPY = null;
		String USD = null;
		String STOP = null;
		String sysDate = DateUtil.getDBPatternDate();
		String loginID = (String) request.getSession().getAttribute("USER_ID");
		String KETSUGOUMOJI = "";
		int sysmonth = DateUtil.getMonth();
		int sysyear = DateUtil.getYear();String KAISHAID2 = "";
		ROGUINID = loginID;
		ROGUINID_RUUPUKAISHI_ = loginID;
		ROGUINIDNODEETAWOSAKUJOSURU = loginID;
		//「RMB,JPY,USD,STOP」を取得
		RMB = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RMB")));
		JPY = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("JPY")));
		USD = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("USD")));
		STOP = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("STOP")));
		//データ操作:「見積り臨時表」テーブルから「見積りNO,記録者ID」単位の「金額の合計」を取得,条件は「記録者ID」がログインID,且つ「貨幣」が"1"と一致
		A010W6afterselectMITUMORIRINJIHYOUList = A010W6afterselectMITUMORIRINJIHYOUDao.A010W6afterselectMITUMORIRINJIHYOU(ROGUINID);
		if (A010W6afterselectMITUMORIRINJIHYOUList != null && A010W6afterselectMITUMORIRINJIHYOUList.size() > 0) {
			if (A010W6afterselectMITUMORIRINJIHYOUList.get(0) != null) {
				GOLD_SUM = A010W6afterselectMITUMORIRINJIHYOUList.get(0);
			}
		}
		//変数<RMB>に<金額の合計>を設定する
		RMB = StringUtil.changeNullToBlank(GOLD_SUM);
		//データ操作:「見積り臨時表」テーブルから「見積りNO,記録者ID」単位の「金額の合計」を取得,条件は「記録者ID」がログインID,且つ「貨幣」が"0"と一致
		A010W6afterselectMITUMORIRINJIHYOU1List = A010W6afterselectMITUMORIRINJIHYOU1Dao.A010W6afterselectMITUMORIRINJIHYOU1(ROGUINID);
		if (A010W6afterselectMITUMORIRINJIHYOU1List != null && A010W6afterselectMITUMORIRINJIHYOU1List.size() > 0) {
			if (A010W6afterselectMITUMORIRINJIHYOU1List.get(0) != null) {
				GOLD_SUM = A010W6afterselectMITUMORIRINJIHYOU1List.get(0);
			}
		}
		//変数<JPY>に<金額の合計>を設定する
		JPY = StringUtil.changeNullToBlank(GOLD_SUM);
		//データ操作:「見積り臨時表」テーブルから「見積りNO,記録者ID」単位の「金額の合計」を取得,条件は「記録者ID」がログインID,且つ「貨幣」が"2"と一致
		A010W6afterselectMITUMORIRINJIHYOU2List = A010W6afterselectMITUMORIRINJIHYOU2Dao.A010W6afterselectMITUMORIRINJIHYOU2(ROGUINID);
		if (A010W6afterselectMITUMORIRINJIHYOU2List != null && A010W6afterselectMITUMORIRINJIHYOU2List.size() > 0) {
			if (A010W6afterselectMITUMORIRINJIHYOU2List.get(0) != null) {
				GOLD_SUM = A010W6afterselectMITUMORIRINJIHYOU2List.get(0);
			}
		}
		//変数<USD>に<金額の合計>を設定する
		USD = StringUtil.changeNullToBlank(GOLD_SUM);
		//データ操作:テーブル「見積り臨時表」の項目「見積りNO,日付,客先,作成者,品名,小計,割引,合計,客先担当」を取得,条件は「記録者ID」がログインID(ループ開始)
		A010W6afterselectMITUMORIRINJIHYOU3List = A010W6afterselectMITUMORIRINJIHYOU3Dao.A010W6afterselectMITUMORIRINJIHYOU3(ROGUINID_RUUPUKAISHI_);
		if (A010W6afterselectMITUMORIRINJIHYOU3List != null && A010W6afterselectMITUMORIRINJIHYOU3List.size() > 0) {
			for (i = 0;i < A010W6afterselectMITUMORIRINJIHYOU3List.size();i++) {
				A010W6afterselectMITUMORIRINJIHYOU3Entity = A010W6afterselectMITUMORIRINJIHYOU3List.get(i);;
				if (A010W6afterselectMITUMORIRINJIHYOU3Entity != null) {
					MITUMORIRINJIHYOU_MITSUMORINO = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU3Entity.getMITSUMORINO());
					MITUMORIRINJIHYOU_HIDZUKE = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU3Entity.getHIDZUKE());
					MITUMORIRINJIHYOU_KYAKUSAKI = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU3Entity.getKYAKUSAKI());
					MITUMORIRINJIHYOU_SAKUSEISHA = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU3Entity.getSAKUSEISHA());
					MITUMORIRINJIHYOU_HINMEI = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU3Entity.getHINMEI());
					MITUMORIRINJIHYOU_SHOUKEI = A010W6afterselectMITUMORIRINJIHYOU3Entity.getSHOUKEI();
					MITUMORIRINJIHYOU_WARIBIKI = A010W6afterselectMITUMORIRINJIHYOU3Entity.getWARIBIKI();
					MITUMORIRINJIHYOU_GOUKEI = A010W6afterselectMITUMORIRINJIHYOU3Entity.getGOUKEI();
					MITUMORIRINJIHYOU_KYAKUSAKITANTOU = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU3Entity.getKYAKUSAKITANTOU());
				}
				//データ操作:テーブル「注文書」の項目「見積書NO」を取得,条件は「見積書NO」が<見積りNO>
				A010W6afterselectTYUMONSYOList = A010W6afterselectTYUMONSYODao.A010W6afterselectTYUMONSYO(MITUMORIRINJIHYOU_MITSUMORINO);
				if (A010W6afterselectTYUMONSYOList != null && A010W6afterselectTYUMONSYOList.size() > 0) {
					A010W6afterselectTYUMONSYOEntity = A010W6afterselectTYUMONSYOList.get(0);
					if (A010W6afterselectTYUMONSYOEntity != null) {
						TYUMONSYO_MITSUMORISHONO = StringUtil.changeNullToBlank(A010W6afterselectTYUMONSYOEntity.getMITSUMORISHONO());
					}
				}
				//項目<見積書NO>が空白でない場合
				if (!StringUtil.isNullOrBlank(TYUMONSYO_MITSUMORISHONO)) {
					//<結合文字>が"("と<見積書NO>と")"と"見積書はすでに存在します。確認してインポートしてください。"の結合文字
					KETSUGOUMOJI = "(" + TYUMONSYO_MITSUMORISHONO + ")" + "見積書はすでに存在します。確認してインポートしてください。";
					//<結合文字>メッセージを表示する
					jsonObj.setScript("r", "alert('" +KETSUGOUMOJI + "');");
					//変数<STOP>に"1"を設定する
					STOP = "1";
					//処理終了
				}
				//検索結果ループ終了
			}
		}
		//項目<STOP>が"1"でない場合
		if (!StringUtil.changeNullToBlank(STOP).equals("1")) {
			//データ操作:テーブル「見積り臨時表」の項目「見積りNO,日付,客先,作成者,品名,小計,割引,合計,客先担当」を取得,条件は「記録者ID」がログインID(ループ開始)
			A010W6afterselectMITUMORIRINJIHYOU4List = A010W6afterselectMITUMORIRINJIHYOU4Dao.A010W6afterselectMITUMORIRINJIHYOU4(ROGUINID_RUUPUKAISHI_);
			if (A010W6afterselectMITUMORIRINJIHYOU4List != null && A010W6afterselectMITUMORIRINJIHYOU4List.size() > 0) {
				for (j = 0;j < A010W6afterselectMITUMORIRINJIHYOU4List.size();j++) {
					A010W6afterselectMITUMORIRINJIHYOU4Entity = A010W6afterselectMITUMORIRINJIHYOU4List.get(j);;
					if (A010W6afterselectMITUMORIRINJIHYOU4Entity != null) {
						MITUMORIRINJIHYOU_MITSUMORINO = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU4Entity.getMITSUMORINO());
						MITUMORIRINJIHYOU_HIDZUKE = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU4Entity.getHIDZUKE());
						MITUMORIRINJIHYOU_KYAKUSAKI = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU4Entity.getKYAKUSAKI());
						MITUMORIRINJIHYOU_SAKUSEISHA = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU4Entity.getSAKUSEISHA());
						MITUMORIRINJIHYOU_HINMEI = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU4Entity.getHINMEI());
						MITUMORIRINJIHYOU_SHOUKEI = A010W6afterselectMITUMORIRINJIHYOU4Entity.getSHOUKEI();
						MITUMORIRINJIHYOU_WARIBIKI = A010W6afterselectMITUMORIRINJIHYOU4Entity.getWARIBIKI();
						MITUMORIRINJIHYOU_GOUKEI = A010W6afterselectMITUMORIRINJIHYOU4Entity.getGOUKEI();
						MITUMORIRINJIHYOU_KYAKUSAKITANTOU = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU4Entity.getKYAKUSAKITANTOU());
					}
					//データ操作:テーブル「会社」の項目「会社.会社ID」を取得,条件は「会社名」が<客先>
					A010W6afterselectKAISYAList = A010W6afterselectKAISYADao.A010W6afterselectKAISYA(MITUMORIRINJIHYOU_KYAKUSAKI);
					if (A010W6afterselectKAISYAList != null && A010W6afterselectKAISYAList.size() > 0) {
						A010W6afterselectKAISYAEntity = A010W6afterselectKAISYAList.get(0);
						if (A010W6afterselectKAISYAEntity != null) {
							KAISYA_KAISHAID = StringUtil.changeNullToBlank(A010W6afterselectKAISYAEntity.getKAISHAID());
						}
					}
					//変数<会社ID2>に<会社.会社ID>を設定する
					KAISHAID2 = KAISYA_KAISHAID;
					//項目<会社.会社ID>が空白場合
					if (StringUtil.isNullOrBlank(KAISYA_KAISHAID)) {
						
						autoNum = new GetAutonum();
						KAISHAIDautoNum = autoNum.getMaxNumValue("KAISYA","KAISHAID");
						//データ操作:テーブル「会社」にデータ登録,「会社ID」が自動採番,「会社名」が<客先>
						A010W6afterinsertKAISYAList = A010W6afterinsertKAISYADao.A010W6afterinsertKAISYA(KAISHAIDautoNum, MITUMORIRINJIHYOU_KYAKUSAKI);
						//変数<会社ID2>に<会社ID>を設定する
						KAISHAID2 = KAISHAIDautoNum;
						//処理終了
					}
					
					autoNum = new GetAutonum();
					CHUUBUNSHONOautoNum = autoNum.getMaxNumValue("TYUMONSYO","CHUUBUNSHONO");
					JPY1 = StringUtil.changeStringToDouble(JPY);
					RMB1 = StringUtil.changeStringToDouble(RMB);
					USD1 = StringUtil.changeStringToDouble(USD);
					//データ操作:テーブル「注文書」にデータ登録,「注文書NO」が自動採番,「見積書NO」が<見積りNO>,「注文日付」が<日付>,「客先ID」が<会社ID2>,「商品総額JPY」が<JPY>,「担当者ID」が<作成者>,「品名」が<品名>,「見積金額」が<合計>,「客先担当」が<客先担当>,「商品総額RMB」が<RMB>,「商品総額USD」が<USD>
					A010W6afterinsertTYUMONSYOList = A010W6afterinsertTYUMONSYODao.A010W6afterinsertTYUMONSYO(CHUUBUNSHONOautoNum, MITUMORIRINJIHYOU_MITSUMORINO, MITUMORIRINJIHYOU_HIDZUKE, KAISHAID2, JPY1, MITUMORIRINJIHYOU_SAKUSEISHA, MITUMORIRINJIHYOU_HINMEI, MITUMORIRINJIHYOU_GOUKEI, MITUMORIRINJIHYOU_KYAKUSAKITANTOU, RMB1, USD1);
					//データ操作:テーブル「見積り」にデータ登録,「見積書NO」が<見積りNO>,「日付」が<日付>,「顧客ID」が<客先>,「作成者」が<作成者>,「品名」が<品名>,「合計」が<合計>
					A010W6afterinsertMITUMORIList = A010W6afterinsertMITUMORIDao.A010W6afterinsertMITUMORI(MITUMORIRINJIHYOU_MITSUMORINO, MITUMORIRINJIHYOU_HIDZUKE, MITUMORIRINJIHYOU_KYAKUSAKI, MITUMORIRINJIHYOU_SAKUSEISHA, MITUMORIRINJIHYOU_HINMEI, MITUMORIRINJIHYOU_GOUKEI);
					//データ操作:テーブル「見積り臨時表」の項目「見積りNO,項目,数量,単価,金額,貨幣」を取得,条件は「見積りNO」が<見積りNO>,且つ「記録者ID」がログインID(ループ開始)
					A010W6afterselectMITUMORIRINJIHYOU5List = A010W6afterselectMITUMORIRINJIHYOU5Dao.A010W6afterselectMITUMORIRINJIHYOU5(MITUMORIRINJIHYOU_MITSUMORINO, ROGUINID_RUUPUKAISHI_);
					if (A010W6afterselectMITUMORIRINJIHYOU5List != null && A010W6afterselectMITUMORIRINJIHYOU5List.size() > 0) {
						for (k = 0;k < A010W6afterselectMITUMORIRINJIHYOU5List.size();k++) {
							A010W6afterselectMITUMORIRINJIHYOU5Entity = A010W6afterselectMITUMORIRINJIHYOU5List.get(k);;
							if (A010W6afterselectMITUMORIRINJIHYOU5Entity != null) {
								MITUMORIRINJIHYOU_MITSUMORINO = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU5Entity.getMITSUMORINO());
								MITUMORIRINJIHYOU_KOUMOKU = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU5Entity.getKOUMOKU());
								MITUMORIRINJIHYOU_SUURYOU = A010W6afterselectMITUMORIRINJIHYOU5Entity.getSUURYOU();
								MITUMORIRINJIHYOU_PRICE = A010W6afterselectMITUMORIRINJIHYOU5Entity.getPRICE();
								MITUMORIRINJIHYOU_GOLD = A010W6afterselectMITUMORIRINJIHYOU5Entity.getGOLD();
								MITUMORIRINJIHYOU_KAHEI = StringUtil.changeNullToBlank(A010W6afterselectMITUMORIRINJIHYOU5Entity.getKAHEI());
							}
							//項目<貨幣>が"JPY"場合
							if (StringUtil.changeNullToBlank(MITUMORIRINJIHYOU_KAHEI).equals("JPY")) {
								//変数<貨幣>に"0"を設定する
								MITUMORIRINJIHYOU_KAHEI = "0";
								//処理終了
							}
							//項目<貨幣>が"RMB"場合
							if (StringUtil.changeNullToBlank(MITUMORIRINJIHYOU_KAHEI).equals("RMB")) {
								//変数<貨幣>に"1"を設定する
								MITUMORIRINJIHYOU_KAHEI = "1";
								//処理終了
							}
							//項目<貨幣>が"USD"場合
							if (StringUtil.changeNullToBlank(MITUMORIRINJIHYOU_KAHEI).equals("USD")) {
								//変数<貨幣>に"2"を設定する
								MITUMORIRINJIHYOU_KAHEI = "2";
								//処理終了
							}
							
							autoNum = new GetAutonum();
							CHUUBUNSHOMEISAINOautoNum = autoNum.getMaxNumValue("TYUMONSYOMEISAI","CHUUBUNSHOMEISAINO");
							//データ操作:テーブル「注文書明細」にデータ登録,「注文書NO」が<注文書NO>,「注文書明細NO」が自動採番,「項目」が<項目>,「数量」が<数量>,「販売単価」が<単価>,「販売金額」が<金額>,「区分」が"0",「貨幣」が<貨幣>
							A010W6afterinsertTYUMONSYOMEISAIList = A010W6afterinsertTYUMONSYOMEISAIDao.A010W6afterinsertTYUMONSYOMEISAI(CHUUBUNSHONOautoNum, CHUUBUNSHOMEISAINOautoNum, MITUMORIRINJIHYOU_KOUMOKU, MITUMORIRINJIHYOU_SUURYOU, MITUMORIRINJIHYOU_PRICE, MITUMORIRINJIHYOU_GOLD, MITUMORIRINJIHYOU_KAHEI);
							//検索結果ループ終了
						}
					}
					//検索結果ループ終了
				}
			}
			//データ操作:テーブル「見積り臨時表」の項目「記録者ID」がログインIDのデータを削除する
			A010W6afterdeleteMITUMORIRINJIHYOUList = A010W6afterdeleteMITUMORIRINJIHYOUDao.A010W6afterdeleteMITUMORIRINJIHYOU(ROGUINIDNODEETAWOSAKUJOSURU);
			//「インポート完了」メッセージを表示する
			jsonObj.setScript("r", "alert('インポート完了');");
			//「検索」ボタンを実行する
			jsonObj.setScript("r","SF.setServerExecute(true);$('#H8').click();");
			//処理終了
		}

	}
}