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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T101ClickselectBUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickselectBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickupdateBUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T101ClickselectBUHINSYOUSAI1Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickselectBUHINSYOUSAI1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickinsertZAIKOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.GetAutonum;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickinsertSYOUHINDao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickupdateBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickdeleteSYOUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickdeleteZAIKOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickupdateBUHINSYOUSAI1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T101ClickupdateBUHIN1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T101ClickService
 *      Page: 部品管理画面
 *      Function: 部品管理画面全部確定_Click
 * @version

 */

@Service
public class A013T101ClickService {
	@Autowired
	private A013T101ClickselectBUHINSYOUSAIDao A013T101ClickselectBUHINSYOUSAIDao;
	@Autowired
	private A013T101ClickupdateBUHINDao A013T101ClickupdateBUHINDao;
	@Autowired
	private A013T101ClickselectBUHINSYOUSAI1Dao A013T101ClickselectBUHINSYOUSAI1Dao;
	@Autowired
	private A013T101ClickinsertZAIKOUDao A013T101ClickinsertZAIKOUDao;
	@Autowired
	private A013T101ClickinsertSYOUHINDao A013T101ClickinsertSYOUHINDao;
	@Autowired
	private A013T101ClickupdateBUHINSYOUSAIDao A013T101ClickupdateBUHINSYOUSAIDao;
	@Autowired
	private honnzonngosyoriService honnzonngosyoriService;
	@Autowired
	private A013T101ClickdeleteSYOUHINDao A013T101ClickdeleteSYOUHINDao;
	@Autowired
	private A013T101ClickdeleteZAIKOUDao A013T101ClickdeleteZAIKOUDao;
	@Autowired
	private A013T101ClickupdateBUHINSYOUSAI1Dao A013T101ClickupdateBUHINSYOUSAI1Dao;
	@Autowired
	private A013T101ClickupdateBUHIN1Dao A013T101ClickupdateBUHIN1Dao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void A013T101Click (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//部品注文書明細NO
		String BUHINCHUUBUNSHOMEISAINO = null;
		//工事管理番号
		String KOUJIKANRIBANGOU1 = null;
		List<A013T101ClickselectBUHINSYOUSAIEntity> A013T101ClickselectBUHINSYOUSAIList1 = null;
		
		A013T101ClickselectBUHINSYOUSAIEntity A013T101ClickselectBUHINSYOUSAIEntity = null;
		
		String ay1_BUHINSYOUSAI_CHUUBUNSHONO = null;
		int A013T101ClickupdateBUHINList = 0;
		List<A013T101ClickselectBUHINSYOUSAI1Entity> A013T101ClickselectBUHINSYOUSAI1List3 = null;
		int i = 0;
		
		A013T101ClickselectBUHINSYOUSAI1Entity A013T101ClickselectBUHINSYOUSAI1Entity = null;
		
		String ay3_BUHINSYOUSAI_HINMEI = null;
		
		String ay3_BUHINSYOUSAI_CHUUBUNSHONO = null;
		
		String ay3_BUHINSYOUSAI_CHUUBUNSHOMEISAINO = null;
		
		String ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI = null;
		
		double ay3_BUHINSYOUSAI_KOUNYUUTANKA = 0.0;
		
		String ay3_BUHINSYOUSAI_ZAISHITSU = null;
		
		int ay3_BUHINSYOUSAI_SOUKOSUU = 0;
		
		double ay3_BUHINSYOUSAI_SHOUKEI = 0.0;
		
		String ay3_BUHINSYOUSAI_KOUJIKANRIBANGOU = null;
		
		String ay3_BUHINSYOUSAI_HINBANNO = null;
		
		String ay3_BUHINSYOUSAI_NYUUKABI = null;
		//当日
		String TOUJITSU = null;
		//出荷NO
		String SHUKKANO1 = null;
		
		String ZAIKONOautoNum = null;
		GetAutonum autoNum = null;
		int A013T101ClickinsertZAIKOUList = 0;
		int A013T101ClickinsertSYOUHINList = 0;
		
		int KOSUU1 = 0;
		
		int SOUKOSUU1 = 0;
		
		double KOUNYUUTANKA1 = 0.0;
		
		double SHOUKEI1 = 0.0;
		int A013T101ClickupdateBUHINSYOUSAIList = 0;
		int A013T101ClickdeleteSYOUHINList = 0;
		int A013T101ClickdeleteZAIKOUList = 0;
		int A013T101ClickupdateBUHINSYOUSAI1List = 0;
		int A013T101ClickupdateBUHIN1List = 0;
		String KAKUTEIKUBUN1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAKUTEIKUBUN1")));
		String sysDate = DateUtil.getDBPatternDate();
		String SHOUHINNUMBER = "";
		int sysmonth = DateUtil.getMonth();
		int sysyear = DateUtil.getYear();
		String systemDate = sysDate;
		int intRow = 0;
		String SEISAKUHINKUBUN = null;
		String HINBANNO1 = null;
		String HINMEI = null;
		String KOSUU = null;
		String SOUKOSUU = null;
		String TSUKAMATSUNYUUSAKI = null;
		String KIBOUNOUKI = null;
		String TANTOU = null;
		String TEHAISAKI = null;
		String KOUNYUUTANKA = null;
		String KAHEI = null;
		String TEHAIBI = null;
		String NYUUKABI = null;
		String SHOUKEI = null;
		String KAKOTANKA = null;
		String grdB16AC16 = null;
		String CHUUBUNSHOMEISAINO1 = null;
		String CHUUBUNSHONO1 = null;
		String KIBOUTANKA = null;
		String NYUUKAYOTEIBI = null;
		String HINBANNO = null;
		String KAKUTEIKUBUN2 = null;
		String KOUJIKANRIBANGOU2 = null;
		String KETSUGOUMOJI1 = "";
		BUHINCHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHOMEISAINO")));
		KOUJIKANRIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIKANRIBANGOU1")));
		TOUJITSU = systemDate;
		SHUKKANO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHUKKANO1")));
		//条件は項目「確定区分1」が空白又は項目「確定区分1」が"0"場合
		if (StringUtil.isNullOrBlank(KAKUTEIKUBUN1) || StringUtil.changeNullToBlank(KAKUTEIKUBUN1).equals("0")) {
			//データ操作1:テーブル「部品詳細」のデータの項目「注文書NO」を取得,条件は「注文書明細NO」が「部品注文書明細NO」,「工事管理番号」が「工事管理番号」
			A013T101ClickselectBUHINSYOUSAIList1 = A013T101ClickselectBUHINSYOUSAIDao.A013T101ClickselectBUHINSYOUSAI(BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1);
			if (A013T101ClickselectBUHINSYOUSAIList1 != null && A013T101ClickselectBUHINSYOUSAIList1.size() > 0) {
				A013T101ClickselectBUHINSYOUSAIEntity = A013T101ClickselectBUHINSYOUSAIList1.get(0);
				if (A013T101ClickselectBUHINSYOUSAIEntity != null) {
					ay1_BUHINSYOUSAI_CHUUBUNSHONO = StringUtil.changeNullToBlank(A013T101ClickselectBUHINSYOUSAIEntity.getCHUUBUNSHONO());
				}
			}
			//<注文書NO>が空白場合
			if (StringUtil.isNullOrBlank(ay1_BUHINSYOUSAI_CHUUBUNSHONO)) {
				//「部品詳細データを追加してください」メッセージを表示する
				jsonObj.setScript("r", "alert('部品詳細データを追加してください');");
				//処理終了
			}
			//その他場合
			else {
				//データ操作2:テーブル「部品」の項目「注文書NO」が値<注文書NO>,「注文書明細NO」が値「部品注文書明細NO」のデータに対して,項目「確定区分」を"1"に変更する
				A013T101ClickupdateBUHINList = A013T101ClickupdateBUHINDao.A013T101ClickupdateBUHIN(ay1_BUHINSYOUSAI_CHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
				//データ操作3:テーブル「部品詳細」のデータの項目「品名,注文書NO,注文書明細NO,仕入先,購入単価,材質,総個数,小計,工事管理番号,品番NO,入荷日」を取得,条件は「工事管理番号」が「工事管理番号」,「注文書明細NO」が「部品注文書明細NO」,「確定区分」が"0"(ループ開始)
				A013T101ClickselectBUHINSYOUSAI1List3 = A013T101ClickselectBUHINSYOUSAI1Dao.A013T101ClickselectBUHINSYOUSAI1(KOUJIKANRIBANGOU1, BUHINCHUUBUNSHOMEISAINO);
				if (A013T101ClickselectBUHINSYOUSAI1List3 != null && A013T101ClickselectBUHINSYOUSAI1List3.size() > 0) {
					for (i = 0;i < A013T101ClickselectBUHINSYOUSAI1List3.size();i++) {
						A013T101ClickselectBUHINSYOUSAI1Entity = A013T101ClickselectBUHINSYOUSAI1List3.get(i);;
						if (A013T101ClickselectBUHINSYOUSAI1Entity != null) {
							ay3_BUHINSYOUSAI_HINMEI = StringUtil.changeNullToBlank(A013T101ClickselectBUHINSYOUSAI1Entity.getHINMEI());
							ay3_BUHINSYOUSAI_CHUUBUNSHONO = StringUtil.changeNullToBlank(A013T101ClickselectBUHINSYOUSAI1Entity.getCHUUBUNSHONO());
							ay3_BUHINSYOUSAI_CHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(A013T101ClickselectBUHINSYOUSAI1Entity.getCHUUBUNSHOMEISAINO());
							ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI = StringUtil.changeNullToBlank(A013T101ClickselectBUHINSYOUSAI1Entity.getTSUKAMATSUNYUUSAKI());
							ay3_BUHINSYOUSAI_KOUNYUUTANKA = A013T101ClickselectBUHINSYOUSAI1Entity.getKOUNYUUTANKA();
							ay3_BUHINSYOUSAI_ZAISHITSU = StringUtil.changeNullToBlank(A013T101ClickselectBUHINSYOUSAI1Entity.getZAISHITSU());
							ay3_BUHINSYOUSAI_SOUKOSUU = A013T101ClickselectBUHINSYOUSAI1Entity.getSOUKOSUU();
							ay3_BUHINSYOUSAI_SHOUKEI = A013T101ClickselectBUHINSYOUSAI1Entity.getSHOUKEI();
							ay3_BUHINSYOUSAI_KOUJIKANRIBANGOU = StringUtil.changeNullToBlank(A013T101ClickselectBUHINSYOUSAI1Entity.getKOUJIKANRIBANGOU());
							ay3_BUHINSYOUSAI_HINBANNO = StringUtil.changeNullToBlank(A013T101ClickselectBUHINSYOUSAI1Entity.getHINBANNO());
							ay3_BUHINSYOUSAI_NYUUKABI = StringUtil.changeNullToBlank(A013T101ClickselectBUHINSYOUSAI1Entity.getNYUUKABI());
						}
						//<商品NUMBER>が<注文書NO>と<注文書明細NO>と<品番NO>の結合文字
						SHOUHINNUMBER = ay3_BUHINSYOUSAI_CHUUBUNSHONO + ay3_BUHINSYOUSAI_CHUUBUNSHOMEISAINO + ay3_BUHINSYOUSAI_HINBANNO;
						
						autoNum = new GetAutonum();
						ZAIKONOautoNum = autoNum.getMaxNumValue("ZAIKOU","ZAIKONO");
						//データ操作5:テーブル「在庫」にデータ登録,「商品名称」が<品名>,「出入庫時間」が当日,「出入庫状態」が"0",「注文書NO」が<注文書NO>,「注文書明細NO」が<部品注文書明細NO>,「工事管理番号」が<工事管理番号>,「仕入先」が<仕入先>,「代金金額」が<小計>,「出荷NO」が「出荷NO」,「数量」が<総個数>,「在庫NO」が自動採番,「単価」が<購入単価>,「品番NO」が<品番NO>
						A013T101ClickinsertZAIKOUList = A013T101ClickinsertZAIKOUDao.A013T101ClickinsertZAIKOU(ay3_BUHINSYOUSAI_HINMEI, TOUJITSU, ay3_BUHINSYOUSAI_CHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, ay3_BUHINSYOUSAI_KOUJIKANRIBANGOU, ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, ay3_BUHINSYOUSAI_SHOUKEI, SHUKKANO1, ay3_BUHINSYOUSAI_SOUKOSUU, ZAIKONOautoNum, ay3_BUHINSYOUSAI_KOUNYUUTANKA, ay3_BUHINSYOUSAI_HINBANNO);
						//データ操作6:テーブル「商品」にデータ登録,「商品NO」が<商品NUMBER>,「商品名称」が<品名>,「仕入先」が<仕入先>,「材質」が<材質>,「単価」が<購入単価>,「在庫数量」が<総個数>,「入荷日付」が<入荷日>
						A013T101ClickinsertSYOUHINList = A013T101ClickinsertSYOUHINDao.A013T101ClickinsertSYOUHIN(SHOUHINNUMBER, ay3_BUHINSYOUSAI_HINMEI, ay3_BUHINSYOUSAI_TSUKAMATSUNYUUSAKI, ay3_BUHINSYOUSAI_ZAISHITSU, ay3_BUHINSYOUSAI_KOUNYUUTANKA, ay3_BUHINSYOUSAI_SOUKOSUU, ay3_BUHINSYOUSAI_NYUUKABI);
						//検索結果ループ終了
					}
				}
				//「全部確定済み」メッセージを表示する
				jsonObj.setScript("r", "alert('全部確定済み');");
				//「確定区分1」に"1"を設定する
				jsonObj.setScript("r", "$('#KAKUTEIKUBUN1').val('" + StringUtil.escapeJSTags("1") + "');");
				//「全部確定」に"全部取消"を設定する
				jsonObj.setScript("r", "$('#T10').val('" + StringUtil.escapeJSTags("全部取消") + "');");
				//「得意先USER,アセンブリライン名称,機械名称MC,部品名称PART,製作数QTY,担当者,工事管理番号」を入力不可にする
				jsonObj.setScript("r","SF.setDisabled('TOKUISAKIUSER',true);");
				jsonObj.setScript("r","SF.setDisabled('ASENBURIRAINMEISHOU',true);");
				jsonObj.setScript("r","SF.setDisabled('KIKAIMEISHOUMC',true);");
				jsonObj.setScript("r","SF.setDisabled('BUHINMEISHOUPART',true);");
				jsonObj.setScript("r","SF.setDisabled('SEISAKUSUUQTY',true);");
				jsonObj.setScript("r","SF.setDisabled('TANTOUSHA1',true);");
				jsonObj.setScript("r","SF.setDisabled('KOUJIKANRIBANGOU1',true);");
				//Grid「B16」を入力不可にする
				jsonObj.setScript("r", "$('div#_ingrid_Grid99_0_b').find('.editable').attr('disabled', true).addClass('disable0 btnmuko');");
				//Grid「B16」ループ開始
				intRow = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid99")));
				for (i = 1;i <= intRow; i++) {
					/* grid loop start */
					if (StringUtil.escapeSQLTags(request.getParameter("Grid99flg" + i)) !=null &&StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99flg" + i))).equals("0")) {
						continue;
					}
					SEISAKUHINKUBUN = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].SEISAKUHINKUBUN"));
					HINBANNO1 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].HINBANNO1"));
					HINMEI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].HINMEI"));
					KOSUU = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KOSUU"));
					SOUKOSUU = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].SOUKOSUU"));
					TSUKAMATSUNYUUSAKI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TSUKAMATSUNYUUSAKI"));
					KIBOUNOUKI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KIBOUNOUKI"));
					TANTOU = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TANTOU"));
					TEHAISAKI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TEHAISAKI"));
					KOUNYUUTANKA = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KOUNYUUTANKA"));
					KAHEI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KAHEI"));
					TEHAIBI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TEHAIBI"));
					NYUUKABI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].NYUUKABI"));
					SHOUKEI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].SHOUKEI"));
					KAKOTANKA = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KAKOTANKA"));
					grdB16AC16 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].grdB16AC16"));
					CHUUBUNSHOMEISAINO1 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].CHUUBUNSHOMEISAINO1"));
					CHUUBUNSHONO1 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].CHUUBUNSHONO1"));
					KIBOUTANKA = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KIBOUTANKA"));
					NYUUKAYOTEIBI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].NYUUKAYOTEIBI"));
					HINBANNO = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].HINBANNO"));
					KAKUTEIKUBUN2 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KAKUTEIKUBUN2"));
					KOUJIKANRIBANGOU2 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KOUJIKANRIBANGOU2"));
					//「確定」に"取消"を設定する
					jsonObj.setScript("r","$('#grdB16AC16_"+i+"').val('" +StringUtil.escapeJSTags("取消")+ "');");
					//「確定区分」に"1"を設定する
					jsonObj.setScript("r","$('#KAKUTEIKUBUN2_"+i+"').val('" +StringUtil.escapeJSTags("1")+ "');");
					KOSUU1 = StringUtil.changeStringToInt(KOSUU);
					SOUKOSUU1 = StringUtil.changeStringToInt(SOUKOSUU);
					KOUNYUUTANKA1 = StringUtil.changeStringToDouble(KOUNYUUTANKA);
					SHOUKEI1 = StringUtil.changeStringToDouble(SHOUKEI);
					//データ操作4:テーブル「部品詳細」の項目「注文書NO」が<注文書NO>,,「注文書明細NO」が「部品注文書明細NO」,「工事管理番号」が値「工事管理番号」,「品番NO」が値「品番Nohide」のデータに対して,項目「確定区分」を"1",「製作品区分」を「区分」,「品名」を「品名」,「品番NO1」を「品番NO」,「個数」を「個数」,「総個数」を「総個数」,「仕入先」を「仕入先」,「担当」を「担当」,「手配先」を「手配先」,「購入単価」を「購入単価」,「貨幣」を「貨幣」,「小計」を「小計」,「入荷日」を「入荷日付」,「手配日」を「購入日付」,「希望納期」を「希望納期」に変更する
					A013T101ClickupdateBUHINSYOUSAIList = A013T101ClickupdateBUHINSYOUSAIDao.A013T101ClickupdateBUHINSYOUSAI(SEISAKUHINKUBUN, HINMEI, HINBANNO1, KOSUU1, SOUKOSUU1, TSUKAMATSUNYUUSAKI, TANTOU, TEHAISAKI, KOUNYUUTANKA1, KAHEI, SHOUKEI1, NYUUKABI, TEHAIBI, KIBOUNOUKI, CHUUBUNSHONO1, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1, HINBANNO);
					//グリッドループ終了
				}
				//関数「honnzonngosyori」を実行する
				honnzonngosyoriService.honnzonngosyori(request, jsonObj);
				//処理終了
			}
			//処理終了
		}
		//条件は項目「確定区分1」が空白ではない且つ項目「確定区分1」が"1"場合
		if (!StringUtil.isNullOrBlank(KAKUTEIKUBUN1) && StringUtil.changeNullToBlank(KAKUTEIKUBUN1).equals("1")) {
			//<結合文字1>が「注文書NO」と「注文書明細NO」の結合文字
			KETSUGOUMOJI1 = CHUUBUNSHONO1 + CHUUBUNSHOMEISAINO1;
			//データ操作7:テーブル「商品」の項目「商品NO」先頭一致<結合文字1>のデータを削除する
			A013T101ClickdeleteSYOUHINList = A013T101ClickdeleteSYOUHINDao.A013T101ClickdeleteSYOUHIN();
			//データ操作8:テーブル「在庫」の項目「注文書NO」が<注文書NO>,「注文書明細NO」が<注文書明細NO>と一致するデータを削除する
			A013T101ClickdeleteZAIKOUList = A013T101ClickdeleteZAIKOUDao.A013T101ClickdeleteZAIKOU(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1);
			//データ操作9:テーブル「部品詳細」の項目「注文書NO」が値「注文書NO」,「注文書明細NO」が値「注文書明細NO」のデータに対して,項目「確定区分」を"0"に変更する
			A013T101ClickupdateBUHINSYOUSAI1List = A013T101ClickupdateBUHINSYOUSAI1Dao.A013T101ClickupdateBUHINSYOUSAI1(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1);
			//データ操作10:テーブル「部品」の項目「注文書NO」が値「注文書NO」,「注文書明細NO」が値「注文書明細NO」のデータに対して,項目「確定区分」を"0"に変更する
			A013T101ClickupdateBUHIN1List = A013T101ClickupdateBUHIN1Dao.A013T101ClickupdateBUHIN1(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO1);
			//「全部取消済み」メッセージを表示する
			jsonObj.setScript("r", "alert('全部取消済み');");
			//「確定区分1」に"0"を設定する
			jsonObj.setScript("r", "$('#KAKUTEIKUBUN1').val('" + StringUtil.escapeJSTags("0") + "');");
			//「全部確定」に"全部確定"を設定する
			jsonObj.setScript("r", "$('#T10').val('" + StringUtil.escapeJSTags("全部確定") + "');");
			//「得意先USER,アセンブリライン名称,機械名称MC,部品名称PART,製作数QTY,担当者,工事管理番号」を入力可能にする
			jsonObj.setScript("r","SF.setDisabled('TOKUISAKIUSER',false);");
			jsonObj.setScript("r","SF.setDisabled('ASENBURIRAINMEISHOU',false);");
			jsonObj.setScript("r","SF.setDisabled('KIKAIMEISHOUMC',false);");
			jsonObj.setScript("r","SF.setDisabled('BUHINMEISHOUPART',false);");
			jsonObj.setScript("r","SF.setDisabled('SEISAKUSUUQTY',false);");
			jsonObj.setScript("r","SF.setDisabled('TANTOUSHA1',false);");
			jsonObj.setScript("r","SF.setDisabled('KOUJIKANRIBANGOU1',false);");
			//Grid「B16」を入力可能にする
			jsonObj.setScript("r", "$('div#_ingrid_Grid99_0_b').find('.editable').attr('disabled', false).removeClass('disable0 btnmuko');");
			//Grid「B16」ループ開始
			for (i = 1;i <= intRow; i++) {
				/* grid loop start */
				if (StringUtil.escapeSQLTags(request.getParameter("Grid99flg" + i)) !=null &&StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99flg" + i))).equals("0")) {
					continue;
				}
				SEISAKUHINKUBUN = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].SEISAKUHINKUBUN"));
				HINBANNO1 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].HINBANNO1"));
				HINMEI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].HINMEI"));
				KOSUU = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KOSUU"));
				SOUKOSUU = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].SOUKOSUU"));
				TSUKAMATSUNYUUSAKI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TSUKAMATSUNYUUSAKI"));
				KIBOUNOUKI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KIBOUNOUKI"));
				TANTOU = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TANTOU"));
				TEHAISAKI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TEHAISAKI"));
				KOUNYUUTANKA = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KOUNYUUTANKA"));
				KAHEI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KAHEI"));
				TEHAIBI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TEHAIBI"));
				NYUUKABI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].NYUUKABI"));
				SHOUKEI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].SHOUKEI"));
				KAKOTANKA = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KAKOTANKA"));
				grdB16AC16 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].grdB16AC16"));
				CHUUBUNSHOMEISAINO1 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].CHUUBUNSHOMEISAINO1"));
				CHUUBUNSHONO1 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].CHUUBUNSHONO1"));
				KIBOUTANKA = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KIBOUTANKA"));
				NYUUKAYOTEIBI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].NYUUKAYOTEIBI"));
				HINBANNO = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].HINBANNO"));
				KAKUTEIKUBUN2 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KAKUTEIKUBUN2"));
				KOUJIKANRIBANGOU2 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KOUJIKANRIBANGOU2"));
				//「確定」に"確定"を設定する
				jsonObj.setScript("r","$('#grdB16AC16_"+i+"').val('" +StringUtil.escapeJSTags("確定")+ "');");
				//「確定区分」に"0"を設定する
				jsonObj.setScript("r","$('#KAKUTEIKUBUN2_"+i+"').val('" +StringUtil.escapeJSTags("0")+ "');");
				//グリッドループ終了
			}
			//関数「honnzonngosyori」を実行する
			honnzonngosyoriService.honnzonngosyori(request, jsonObj);
			//処理終了
		}

	}
}