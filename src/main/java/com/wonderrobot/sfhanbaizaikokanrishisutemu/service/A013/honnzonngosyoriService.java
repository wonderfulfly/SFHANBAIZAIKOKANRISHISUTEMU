package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.honnzonngosyoriselectBUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.honnzonngosyoriselectBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.honnzonngosyoriselectBUHINSYOUSAI1Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.honnzonngosyoriselectBUHINSYOUSAI1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.honnzonngosyoriselectBUHINSYOUSAI2Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.honnzonngosyoriselectBUHINSYOUSAI2Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.honnzonngosyoriupdateTYUMONSYOMEISAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.honnzonngosyoriupdateBUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: honnzonngosyoriService
 *      Page: 部品管理画面
 *      Function: 部品管理画面PageAfterSave
 * @version

 */

@Service
public class honnzonngosyoriService {
	@Autowired
	private honnzonngosyoriselectBUHINSYOUSAIDao honnzonngosyoriselectBUHINSYOUSAIDao;
	@Autowired
	private honnzonngosyoriselectBUHINSYOUSAI1Dao honnzonngosyoriselectBUHINSYOUSAI1Dao;
	@Autowired
	private honnzonngosyoriselectBUHINSYOUSAI2Dao honnzonngosyoriselectBUHINSYOUSAI2Dao;
	@Autowired
	private honnzonngosyoriupdateTYUMONSYOMEISAIDao honnzonngosyoriupdateTYUMONSYOMEISAIDao;
	@Autowired
	private honnzonngosyoriupdateBUHINDao honnzonngosyoriupdateBUHINDao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void honnzonngosyori (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//部品注文書NO
		String BUHINCHUUBUNSHONO = null;
		//部品注文書明細NO
		String BUHINCHUUBUNSHOMEISAINO = null;
		//工事管理番号
		String KOUJIKANRIBANGOU1 = null;
		List<Double> honnzonngosyoriselectBUHINSYOUSAIList1 = null;
		
		double SHOUKEI_SUM = 0.0;
		List<Double> honnzonngosyoriselectBUHINSYOUSAI1List2 = null;
		List<Double> honnzonngosyoriselectBUHINSYOUSAI2List3 = null;
		
		double JPYGOUKEI1 = 0.0;
		
		double RMBGOUKEI1 = 0.0;
		
		double USDGOUKEI1 = 0.0;
		int honnzonngosyoriupdateTYUMONSYOMEISAIList = 0;
		
		double JPYGOUKEI2 = 0.0;
		
		double RMBGOUKEI2 = 0.0;
		
		double USDGOUKEI2 = 0.0;
		int honnzonngosyoriupdateBUHINList = 0;
		String JPYGOUKEI = null;
		String RMBGOUKEI = null;
		String USDGOUKEI = null;
		BUHINCHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHONO")));
		BUHINCHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHOMEISAINO")));
		KOUJIKANRIBANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KOUJIKANRIBANGOU1")));
		//「JPY合計,RMB合計,USD合計」を取得
		JPYGOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("JPYGOUKEI")));
		RMBGOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("RMBGOUKEI")));
		USDGOUKEI = StringUtil.changeNullToBlankRemoveComma(StringUtil.escapeSQLTags(request.getParameter("USDGOUKEI")));
		//データ操作1:「部品詳細」テーブルから「貨幣」単位の「小計の合計」を取得,条件は「貨幣」が"0",「注文書NO」が「部品注文書NO」,「注文書明細NO」が「部品注文書明細NO」,「工事管理番号」が「工事管理番号」
		honnzonngosyoriselectBUHINSYOUSAIList1 = honnzonngosyoriselectBUHINSYOUSAIDao.honnzonngosyoriselectBUHINSYOUSAI(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1);
		if (honnzonngosyoriselectBUHINSYOUSAIList1 != null && honnzonngosyoriselectBUHINSYOUSAIList1.size() > 0) {
			if (honnzonngosyoriselectBUHINSYOUSAIList1.get(0) != null) {
				SHOUKEI_SUM = honnzonngosyoriselectBUHINSYOUSAIList1.get(0);
			}
		}
		//変数<JPY合計>に<小計の合計>を設定する
		JPYGOUKEI = StringUtil.changeNullToBlank(SHOUKEI_SUM);
		//データ操作2:「部品詳細」テーブルから「貨幣」単位の「小計の合計」を取得,条件は「貨幣」が"1",「注文書NO」が「部品注文書NO」,「注文書明細NO」が「部品注文書明細NO」,「工事管理番号」が「工事管理番号」
		honnzonngosyoriselectBUHINSYOUSAI1List2 = honnzonngosyoriselectBUHINSYOUSAI1Dao.honnzonngosyoriselectBUHINSYOUSAI1(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1);
		if (honnzonngosyoriselectBUHINSYOUSAI1List2 != null && honnzonngosyoriselectBUHINSYOUSAI1List2.size() > 0) {
			if (honnzonngosyoriselectBUHINSYOUSAI1List2.get(0) != null) {
				SHOUKEI_SUM = honnzonngosyoriselectBUHINSYOUSAI1List2.get(0);
			}
		}
		//変数<RMB合計>に<小計の合計>を設定する
		RMBGOUKEI = StringUtil.changeNullToBlank(SHOUKEI_SUM);
		//データ操作3:「部品詳細」テーブルから「貨幣」単位の「小計の合計」を取得,条件は「貨幣」が"2",「注文書NO」が「部品注文書NO」,「注文書明細NO」が「部品注文書明細NO」,「工事管理番号」が「工事管理番号」
		honnzonngosyoriselectBUHINSYOUSAI2List3 = honnzonngosyoriselectBUHINSYOUSAI2Dao.honnzonngosyoriselectBUHINSYOUSAI2(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1);
		if (honnzonngosyoriselectBUHINSYOUSAI2List3 != null && honnzonngosyoriselectBUHINSYOUSAI2List3.size() > 0) {
			if (honnzonngosyoriselectBUHINSYOUSAI2List3.get(0) != null) {
				SHOUKEI_SUM = honnzonngosyoriselectBUHINSYOUSAI2List3.get(0);
			}
		}
		//変数<USD合計>に<小計の合計>を設定する
		USDGOUKEI = StringUtil.changeNullToBlank(SHOUKEI_SUM);
		//<JPY合計>が空白場合
		if (StringUtil.isNullOrBlank(JPYGOUKEI)) {
			//変数<JPY合計>に"0"を設定する
			JPYGOUKEI = "0";
			//処理終了
		}
		//<RMB合計>が空白場合
		if (StringUtil.isNullOrBlank(RMBGOUKEI)) {
			//変数<RMB合計>に"0"を設定する
			RMBGOUKEI = "0";
			//処理終了
		}
		//<USD合計>が空白場合
		if (StringUtil.isNullOrBlank(USDGOUKEI)) {
			//変数<USD合計>に"0"を設定する
			USDGOUKEI = "0";
			//処理終了
		}
		JPYGOUKEI1 = StringUtil.changeStringToDouble(JPYGOUKEI);
		RMBGOUKEI1 = StringUtil.changeStringToDouble(RMBGOUKEI);
		USDGOUKEI1 = StringUtil.changeStringToDouble(USDGOUKEI);
		//データ操作1:テーブル「注文書明細」の項目「注文書NO」が「部品注文書NO」,「注文書明細NO」が「部品注文書明細NO」のデータに対して,項目「仕入金額JPY」を<JPY合計>,「仕入金額RMB」を<RMB合計>,「仕入金額USD」を<USD合計>に変更する
		honnzonngosyoriupdateTYUMONSYOMEISAIList = honnzonngosyoriupdateTYUMONSYOMEISAIDao.honnzonngosyoriupdateTYUMONSYOMEISAI(JPYGOUKEI1, RMBGOUKEI1, USDGOUKEI1, BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
		JPYGOUKEI2 = StringUtil.changeStringToDouble(JPYGOUKEI);
		RMBGOUKEI2 = StringUtil.changeStringToDouble(RMBGOUKEI);
		USDGOUKEI2 = StringUtil.changeStringToDouble(USDGOUKEI);
		//データ操作2:テーブル「部品」の項目「注文書NO」が「部品注文書NO」,「注文書明細NO」が「部品注文書明細NO」,「工事管理番号」が「工事管理番号」のデータに対して,項目「JPY合計金額」を<JPY合計>,「RMB合計金額」を<RMB合計>,「USD合計金額」を<USD合計>に変更する
		honnzonngosyoriupdateBUHINList = honnzonngosyoriupdateBUHINDao.honnzonngosyoriupdateBUHIN(JPYGOUKEI2, RMBGOUKEI2, USDGOUKEI2, BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO, KOUJIKANRIBANGOU1);

	}
}