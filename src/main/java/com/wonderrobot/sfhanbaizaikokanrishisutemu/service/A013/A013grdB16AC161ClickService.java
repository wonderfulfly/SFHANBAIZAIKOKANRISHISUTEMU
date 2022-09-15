package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickupdateBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickdeleteSYOUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickdeleteZAIKOUDao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16AC161ClickselectBUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickselectBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16AC161ClickselectBUHINSYOUSAI1Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickselectBUHINSYOUSAI1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickinsertZAIKOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.GetAutonum;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013grdB16AC161ClickinsertSYOUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013grdB16AC161ClickService
 *      Page: 部品管理画面
 *      Function: 部品管理画面確定_Click
 * @version

 */

@Service
public class A013grdB16AC161ClickService {
	@Autowired
	private A013grdB16AC161ClickupdateBUHINSYOUSAIDao A013grdB16AC161ClickupdateBUHINSYOUSAIDao;
	@Autowired
	private A013grdB16AC161ClickdeleteSYOUHINDao A013grdB16AC161ClickdeleteSYOUHINDao;
	@Autowired
	private A013grdB16AC161ClickdeleteZAIKOUDao A013grdB16AC161ClickdeleteZAIKOUDao;
	@Autowired
	private honnzonngosyoriService honnzonngosyoriService;
	@Autowired
	private A013grdB16AC161ClickselectBUHINSYOUSAIDao A013grdB16AC161ClickselectBUHINSYOUSAIDao;
	@Autowired
	private A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao;
	@Autowired
	private A013grdB16AC161ClickselectBUHINSYOUSAI1Dao A013grdB16AC161ClickselectBUHINSYOUSAI1Dao;
	@Autowired
	private A013grdB16AC161ClickinsertZAIKOUDao A013grdB16AC161ClickinsertZAIKOUDao;
	@Autowired
	private A013grdB16AC161ClickinsertSYOUHINDao A013grdB16AC161ClickinsertSYOUHINDao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void A013grdB16AC161Click (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//注文書NO
		String CHUUBUNSHONO1 = null;
		//注文書明細NO
		String CHUUBUNSHOMEISAINO1 = null;
		//工事管理番号
		String KOUJIKANRIBANGOU1 = null;
		//品番Nohide
		String HINBANNO = null;
		int A013grdB16AC161ClickupdateBUHINSYOUSAIList = 0;
		int A013grdB16AC161ClickdeleteSYOUHINList = 0;
		int A013grdB16AC161ClickdeleteZAIKOUList = 0;
		List<A013grdB16AC161ClickselectBUHINSYOUSAIEntity> A013grdB16AC161ClickselectBUHINSYOUSAIList4 = null;
		
		A013grdB16AC161ClickselectBUHINSYOUSAIEntity A013grdB16AC161ClickselectBUHINSYOUSAIEntity = null;
		
		String ay4_BUHINSYOUSAI_CHUUBUNSHONO = null;
		//区分
		String SEISAKUHINKUBUN = null;
		//品名
		String HINMEI = null;
		//品番NO
		String HINBANNO1 = null;
		//個数
		int KOSUU = 0;
		//総個数
		int SOUKOSUU = 0;
		//担当
		String TANTOU = null;
		//手配先
		String TEHAISAKI = null;
		
		double KOUNYUUTANKA1 = 0.0;
		//小計
		double SHOUKEI = 0.0;
		//入荷日付
		String NYUUKABI = null;
		//希望納期
		String KIBOUNOUKI = null;
		int A013grdB16AC161ClickupdateBUHINSYOUSAI1List = 0;
		List<A013grdB16AC161ClickselectBUHINSYOUSAI1Entity> A013grdB16AC161ClickselectBUHINSYOUSAI1List6 = null;
		
		A013grdB16AC161ClickselectBUHINSYOUSAI1Entity A013grdB16AC161ClickselectBUHINSYOUSAI1Entity = null;
		
		String ay6_BUHINSYOUSAI_HINMEI = null;
		
		String ay6_BUHINSYOUSAI_CHUUBUNSHONO = null;
		
		String ay6_BUHINSYOUSAI_CHUUBUNSHOMEISAINO = null;
		
		String ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI = null;
		
		double ay6_BUHINSYOUSAI_KOUNYUUTANKA = 0.0;
		
		String ay6_BUHINSYOUSAI_ZAISHITSU = null;
		
		int ay6_BUHINSYOUSAI_SOUKOSUU = 0;
		
		double ay6_BUHINSYOUSAI_SHOUKEI = 0.0;
		
		String ay6_BUHINSYOUSAI_KOUJIKANRIBANGOU = null;
		
		String ay6_BUHINSYOUSAI_HINBANNO = null;
		
		String ay6_BUHINSYOUSAI_NYUUKABI = null;
		//当日
		String TOUJITSU = null;
		//出荷NO
		String SHUKKANO1 = null;
		
		String ZAIKONOautoNum = null;
		GetAutonum autoNum = null;
		int A013grdB16AC161ClickinsertZAIKOUList = 0;
		int A013grdB16AC161ClickinsertSYOUHINList = 0;
		String triggerID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("triggerID")));
		String row = triggerID.indexOf("_") > 0 ? triggerID.substring(triggerID.lastIndexOf("_") + 1) : "";
		String KAKUTEIKUBUN2 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAKUTEIKUBUN2_"+row)));
		String sysDate = DateUtil.getDBPatternDate();
		String KETSUGOUMOJI2 = "";
		int sysmonth = DateUtil.getMonth();
		int sysyear = DateUtil.getYear();
		String TSUKAMATSUNYUUSAKI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("TSUKAMATSUNYUUSAKI_"+row)));
		String KOUNYUUTANKA = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUNYUUTANKA_"+row)));
		String TEHAIBI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("TEHAIBI_"+row)));
		String KAHEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAHEI_"+row)));
		String systemDate = sysDate;
		CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].CHUUBUNSHONO1")));
		CHUUBUNSHOMEISAINO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].CHUUBUNSHOMEISAINO1")));
		KOUJIKANRIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIKANRIBANGOU1")));
		HINBANNO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].HINBANNO")));
		SEISAKUHINKUBUN = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].SEISAKUHINKUBUN")));
		HINMEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].HINMEI")));
		HINBANNO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].HINBANNO1")));
		KOSUU = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].KOSUU")));
		SOUKOSUU = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].SOUKOSUU")));
		TANTOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].TANTOU")));
		TEHAISAKI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].TEHAISAKI")));
		SHOUKEI = StringUtil.getCommaStringToDouoble(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].SHOUKEI")));
		NYUUKABI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].NYUUKABI")));
		KIBOUNOUKI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].KIBOUNOUKI")));
		TOUJITSU = systemDate;
		SHUKKANO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHUKKANO1")));
		//「確定区分」が空白でない,且つ「確定区分」が"1"場合
		if (!StringUtil.isNullOrBlank(KAKUTEIKUBUN2) && StringUtil.changeNullToBlank(KAKUTEIKUBUN2).equals("1")) {
			//データ操作1:テーブル「部品詳細」の項目「注文書NO」が値「注文書NO」,項目「注文書明細NO」が値「注文書明細NO」,項目「工事管理番号」が値「工事管理番号」,項目「品番NO」が値「品番Nohide」のデータに対して,項目「確定区分」を"0"に変更する
			A013grdB16AC161ClickupdateBUHINSYOUSAIList = A013grdB16AC161ClickupdateBUHINSYOUSAIDao.A013grdB16AC161ClickupdateBUHINSYOUSAI(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1, KOUJIKANRIBANGOU1, HINBANNO);
			//<結合文字2>が「注文書NO」と「注文書明細NO」と<品番Nohide>の結合文字
			KETSUGOUMOJI2 = CHUUBUNSHONO1 + CHUUBUNSHOMEISAINO1 + HINBANNO;
			//データ操作2:テーブル「商品」の項目「商品NO」が<結合文字2>のデータを削除する
			A013grdB16AC161ClickdeleteSYOUHINList = A013grdB16AC161ClickdeleteSYOUHINDao.A013grdB16AC161ClickdeleteSYOUHIN(KETSUGOUMOJI2);
			//データ操作3:テーブル「在庫」の項目「注文書NO」が「注文書NO」,「注文書明細NO」が「注文書明細NO」,「品番NO」が「品番Nohide」のデータを削除する
			A013grdB16AC161ClickdeleteZAIKOUList = A013grdB16AC161ClickdeleteZAIKOUDao.A013grdB16AC161ClickdeleteZAIKOU(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1, HINBANNO);
			//「取消済み」メッセージを表示する
			jsonObj.setScript("r", "alert('取消済み');");
			//「確定」に"確定"を設定する
			jsonObj.setScript("r","$('#grdB16AC16_"+row+"').val('" +StringUtil.escapeJSTags("確定")+ "');");
			//「確定区分」に"0"を設定する
			jsonObj.setScript("r","$('#KAKUTEIKUBUN2_"+row+"').val('" +StringUtil.escapeJSTags("0")+ "');");
			//Grid「B16」の行を入力可能にする
			jsonObj.setScript("r", "$('div#_ingrid_Grid99_0_b [id=rowseq" + row + "] td').find('.editable').attr('disabled', false).removeClass('disable0 btnmuko');");
			//関数「honnzonngosyori」を実行する
			honnzonngosyoriService.honnzonngosyori(request, jsonObj);
			//処理終了
		}
		//その他場合
		else {
			//データ操作4:テーブル「部品詳細」のデータの項目「注文書NO」を取得,条件は「注文書NO」が「注文書NO」,「注文書明細NO」が「注文書明細NO」,「工事管理番号」が値「工事管理番号」,「品番NO」が値「品番Nohide」
			A013grdB16AC161ClickselectBUHINSYOUSAIList4 = A013grdB16AC161ClickselectBUHINSYOUSAIDao.A013grdB16AC161ClickselectBUHINSYOUSAI(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1, KOUJIKANRIBANGOU1, HINBANNO);
			if (A013grdB16AC161ClickselectBUHINSYOUSAIList4 != null && A013grdB16AC161ClickselectBUHINSYOUSAIList4.size() > 0) {
				A013grdB16AC161ClickselectBUHINSYOUSAIEntity = A013grdB16AC161ClickselectBUHINSYOUSAIList4.get(0);
				if (A013grdB16AC161ClickselectBUHINSYOUSAIEntity != null) {
					ay4_BUHINSYOUSAI_CHUUBUNSHONO = StringUtil.changeNullToBlank(A013grdB16AC161ClickselectBUHINSYOUSAIEntity.getCHUUBUNSHONO());
				}
			}
			//<結合文字2>が「注文書NO」と「注文書明細NO」と<品番Nohide>の結合文字の結合文字
			KETSUGOUMOJI2 = CHUUBUNSHONO1 + CHUUBUNSHOMEISAINO1 + HINBANNO;
			//<注文書NO>が空白ではない場合
			if (!StringUtil.isNullOrBlank(ay4_BUHINSYOUSAI_CHUUBUNSHONO)) {
				//「仕入先」が空白ではない場合
				if (!StringUtil.isNullOrBlank(TSUKAMATSUNYUUSAKI)) {
					//「購入単価」が空白ではない場合
					if (!StringUtil.isNullOrBlank(KOUNYUUTANKA)) {
						//「購入日付」が空白ではない場合
						if (!StringUtil.isNullOrBlank(TEHAIBI)) {
							//「貨幣」が空白ではない場合
							if (!StringUtil.isNullOrBlank(KAHEI)) {
								KOUNYUUTANKA1 = StringUtil.changeStringToDouble(KOUNYUUTANKA);
								//データ操作5:テーブル「部品詳細」の項目「注文書NO」が<注文書NO>,,「注文書明細NO」が「注文書明細NO」,「工事管理番号」が値「工事管理番号」,「品番NO」が値「品番Nohide」のデータに対して,項目「確定区分」を"1",「製作品区分」を「区分」,「品名」を「品名」,「品番NO1」を「品番NO」,「個数」を「個数」,「総個数」を「総個数」,「仕入先」を「仕入先」,「担当」を「担当」,「手配先」を「手配先」,「購入単価」を「購入単価」,「貨幣」を「貨幣」,「小計」を「小計」,「入荷日」を「入荷日付」,「手配日」を「購入日付」,「希望納期」を「希望納期」に変更する
								A013grdB16AC161ClickupdateBUHINSYOUSAI1List = A013grdB16AC161ClickupdateBUHINSYOUSAI1Dao.A013grdB16AC161ClickupdateBUHINSYOUSAI1(SEISAKUHINKUBUN, HINMEI, HINBANNO1, KOSUU, SOUKOSUU, TSUKAMATSUNYUUSAKI, TANTOU, TEHAISAKI, KOUNYUUTANKA1, KAHEI, SHOUKEI, NYUUKABI, TEHAIBI, KIBOUNOUKI, ay4_BUHINSYOUSAI_CHUUBUNSHONO, CHUUBUNSHOMEISAINO1, KOUJIKANRIBANGOU1, HINBANNO);
								//データ操作6:テーブル「部品詳細」のデータの項目「品名,注文書NO,注文書明細NO,仕入先,購入単価,材質,総個数,小計,工事管理番号,品番NO,入荷日」を取得,条件は「注文書NO」が<注文書NO>,「注文書明細NO」が「注文書明細NO」,「工事管理番号」が値「工事管理番号」,「品番NO」が値「品番Nohide」
								A013grdB16AC161ClickselectBUHINSYOUSAI1List6 = A013grdB16AC161ClickselectBUHINSYOUSAI1Dao.A013grdB16AC161ClickselectBUHINSYOUSAI1(ay4_BUHINSYOUSAI_CHUUBUNSHONO, CHUUBUNSHOMEISAINO1, KOUJIKANRIBANGOU1, HINBANNO);
								if (A013grdB16AC161ClickselectBUHINSYOUSAI1List6 != null && A013grdB16AC161ClickselectBUHINSYOUSAI1List6.size() > 0) {
									A013grdB16AC161ClickselectBUHINSYOUSAI1Entity = A013grdB16AC161ClickselectBUHINSYOUSAI1List6.get(0);
									if (A013grdB16AC161ClickselectBUHINSYOUSAI1Entity != null) {
										ay6_BUHINSYOUSAI_HINMEI = StringUtil.changeNullToBlank(A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getHINMEI());
										ay6_BUHINSYOUSAI_CHUUBUNSHONO = StringUtil.changeNullToBlank(A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getCHUUBUNSHONO());
										ay6_BUHINSYOUSAI_CHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getCHUUBUNSHOMEISAINO());
										ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI = StringUtil.changeNullToBlank(A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getTSUKAMATSUNYUUSAKI());
										ay6_BUHINSYOUSAI_KOUNYUUTANKA = A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getKOUNYUUTANKA();
										ay6_BUHINSYOUSAI_ZAISHITSU = StringUtil.changeNullToBlank(A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getZAISHITSU());
										ay6_BUHINSYOUSAI_SOUKOSUU = A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getSOUKOSUU();
										ay6_BUHINSYOUSAI_SHOUKEI = A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getSHOUKEI();
										ay6_BUHINSYOUSAI_KOUJIKANRIBANGOU = StringUtil.changeNullToBlank(A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getKOUJIKANRIBANGOU());
										ay6_BUHINSYOUSAI_HINBANNO = StringUtil.changeNullToBlank(A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getHINBANNO());
										ay6_BUHINSYOUSAI_NYUUKABI = StringUtil.changeNullToBlank(A013grdB16AC161ClickselectBUHINSYOUSAI1Entity.getNYUUKABI());
									}
								}
								//関数「honnzonngosyori」を実行する
								honnzonngosyoriService.honnzonngosyori(request, jsonObj);
								//<品番NO>が空白ではない場合
								if (!StringUtil.isNullOrBlank(ay6_BUHINSYOUSAI_HINBANNO)) {
									
									autoNum = new GetAutonum();
									ZAIKONOautoNum = autoNum.getMaxNumValue("ZAIKOU","ZAIKONO");
									//データ操作:テーブル「在庫」にデータ登録,「商品名称」が<品名>,「出入庫時間」が当日,「出入庫状態」が"0",「注文書NO」が<注文書NO>,「注文書明細NO」が<注文書明細NO>,「工事管理番号」が<工事管理番号>,「仕入先」が<仕入先>,「代金金額」が<小計>,「出荷NO」が「出荷NO」,「数量」が<総個数>,「在庫NO」が自動採番,「単価」が<購入単価>,「品番NO」が<品番NO>
									A013grdB16AC161ClickinsertZAIKOUList = A013grdB16AC161ClickinsertZAIKOUDao.A013grdB16AC161ClickinsertZAIKOU(ay6_BUHINSYOUSAI_HINMEI, TOUJITSU, ay6_BUHINSYOUSAI_CHUUBUNSHONO, ay6_BUHINSYOUSAI_CHUUBUNSHOMEISAINO, ay6_BUHINSYOUSAI_KOUJIKANRIBANGOU, ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, ay6_BUHINSYOUSAI_SHOUKEI, SHUKKANO1, ay6_BUHINSYOUSAI_SOUKOSUU, ZAIKONOautoNum, ay6_BUHINSYOUSAI_KOUNYUUTANKA, ay6_BUHINSYOUSAI_HINBANNO);
									//データ操作:テーブル「商品」にデータ登録,「商品NO」が<結合文字2>,「商品名称」が<品名>,「仕入先」が<仕入先>,「材質」が<材質>,「単価」が<購入単価>,「在庫数量」が<総個数>,「入荷日付」が<入荷日>
									A013grdB16AC161ClickinsertSYOUHINList = A013grdB16AC161ClickinsertSYOUHINDao.A013grdB16AC161ClickinsertSYOUHIN(KETSUGOUMOJI2, ay6_BUHINSYOUSAI_HINMEI, ay6_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, ay6_BUHINSYOUSAI_ZAISHITSU, ay6_BUHINSYOUSAI_KOUNYUUTANKA, ay6_BUHINSYOUSAI_SOUKOSUU, ay6_BUHINSYOUSAI_NYUUKABI);
									//「確定済み」メッセージを表示する
									jsonObj.setScript("r", "alert('確定済み');");
									//「確定」に"取消"を設定する
									jsonObj.setScript("r","$('#grdB16AC16_"+row+"').val('" +StringUtil.escapeJSTags("取消")+ "');");
									//「確定区分」に"1"を設定する
									jsonObj.setScript("r","$('#KAKUTEIKUBUN2_"+row+"').val('" +StringUtil.escapeJSTags("1")+ "');");
									//Grid「B16」の行を入力不可にする
									jsonObj.setScript("r", "$('div#_ingrid_Grid99_0_b [id=rowseq" + row + "] td').find('.editable').attr('disabled', true).addClass('disable0 btnmuko');");
									//処理終了
								}
								//処理終了
							}
							//その他場合
							else {
								//「貨幣には値が必要です。」メッセージを表示する
								jsonObj.setScript("r", "alert('貨幣には値が必要です。');");
								//処理終了
							}
							//処理終了
						}
						//その他場合
						else {
							//「購入日付には値が必要です。」メッセージを表示する
							jsonObj.setScript("r", "alert('購入日付には値が必要です。');");
							//処理終了
						}
						//処理終了
					}
					//その他場合
					else {
						//「購入単価には値が必要です。」メッセージを表示する
						jsonObj.setScript("r", "alert('購入単価には値が必要です。');");
						//処理終了
					}
					//処理終了
				}
				//その他場合
				else {
					//「仕入先には値が必要です。」メッセージを表示する
					jsonObj.setScript("r", "alert('仕入先には値が必要です。');");
					//処理終了
				}
				//処理終了
			}
			//その他場合
			else {
				//「先に保存してください。」メッセージを表示する
				jsonObj.setScript("r", "alert('先に保存してください。');");
				//処理終了
			}
			//処理終了
		}

	}
}