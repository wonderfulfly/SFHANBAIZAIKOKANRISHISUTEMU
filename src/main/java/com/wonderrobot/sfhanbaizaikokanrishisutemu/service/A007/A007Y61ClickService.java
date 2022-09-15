package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A007;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007Y61ClickselectZAIKOUEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007Y61ClickselectZAIKOUDao;
import java.util.HashMap;
import java.util.ArrayList;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A007.A007GridDataConstant;
import java.util.LinkedHashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007Y61ClickService
 *      Page: 商品入庫画面
 *      Function: 商品入庫画面検索_Click
 * @version

 */

@Service
public class A007Y61ClickService {
	@Autowired
	private A007Y61ClickselectZAIKOUDao A007Y61ClickselectZAIKOUDao;

   
	@Log
	public void A007Y61Click (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//注文書No
		String CHUUBUNSHONO = null;
		//部品名
		String BUHINMEI = null;
		//在庫NO
		String ZAIKONO = null;
		//社内工事番号
		String SHANAIKOUJIBANGOU = null;
		List<A007Y61ClickselectZAIKOUEntity> A007Y61ClickselectZAIKOUList1 = null;
		
		A007Y61ClickselectZAIKOUEntity A007Y61ClickselectZAIKOUEntity = null;
		
		String ay1_ZAIKOU_CHUUBUNSHONO = null;
		
		String ay1_ZAIKOU_CHUUBUNSHOMEISAINO = null;
		
		String ay1_ZAIKOU_KOUJIKANRIBANGOU = null;
		
		String ay1_ZAIKOU_ZAIKONO = null;
		
		String ay1_ZAIKOU_TSUKAMATSUNYUUSAKI = null;
		
		String ay1_ZAIKOU_SHOUHINMEISHOU = null;
		
		String ay1_ZAIKOU_SHUTSUNYUUKOJIKAN = null;
		
		int ay1_ZAIKOU_SUURYOU = 0;
		
		double ay1_ZAIKOU_PRICE = 0.0;
		
		String ay1_ZAIKOU_SHUTSUNYUUKOJOUTAI = null;
		
		double ay1_ZAIKOU_DAIKINKINGAKU = 0.0;
		
		String ay1_ZAIKOU_SHUKKANO = null;
		
		String ay1_ZAIKOU_SHOUHINKATABAN = null;
		
		int ay1_ZAIKOU_ZAIKOSUURYOU = 0;
		
		String ay1_ZAIKOU_SHOUHINNO = null;
		ArrayList<LinkedHashMap<String, String>> ay1 = new ArrayList<LinkedHashMap<String, String>>();
		String returnVal = null;
		LinkedHashMap<String, String> selMap = null;
		CHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO")));
		BUHINMEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINMEI")));
		ZAIKONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("ZAIKONO")));
		SHANAIKOUJIBANGOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHANAIKOUJIBANGOU")));
		//データ操作1:テーブル「在庫」によるフィールド「注文書NO,注文書明細NO,工事管理番号,在庫NO,仕入先,商品名称,出入庫時間,数量,単価,出入庫状態,代金金額,出荷NO,商品型番,在庫数量,商品NO」を取得,条件はフィールド「注文書NO」が画面項目「注文書No」,フィールド「商品名称」が画面項目「部品名」,フィールド「在庫NO」が画面項目「在庫NO」,フィールド「工事管理番号」が画面項目「社内工事番号」
		A007Y61ClickselectZAIKOUList1 = A007Y61ClickselectZAIKOUDao.A007Y61ClickselectZAIKOU(CHUUBUNSHONO, BUHINMEI, ZAIKONO, SHANAIKOUJIBANGOU);
		if (A007Y61ClickselectZAIKOUList1 != null && A007Y61ClickselectZAIKOUList1.size() > 0) {
			A007Y61ClickselectZAIKOUEntity = A007Y61ClickselectZAIKOUList1.get(0);
			if (A007Y61ClickselectZAIKOUEntity != null) {
				ay1_ZAIKOU_CHUUBUNSHONO = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getCHUUBUNSHONO());
				ay1_ZAIKOU_CHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getCHUUBUNSHOMEISAINO());
				ay1_ZAIKOU_KOUJIKANRIBANGOU = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getKOUJIKANRIBANGOU());
				ay1_ZAIKOU_ZAIKONO = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getZAIKONO());
				ay1_ZAIKOU_TSUKAMATSUNYUUSAKI = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getTSUKAMATSUNYUUSAKI());
				ay1_ZAIKOU_SHOUHINMEISHOU = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getSHOUHINMEISHOU());
				ay1_ZAIKOU_SHUTSUNYUUKOJIKAN = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getSHUTSUNYUUKOJIKAN());
				ay1_ZAIKOU_SUURYOU = A007Y61ClickselectZAIKOUEntity.getSUURYOU();
				ay1_ZAIKOU_PRICE = A007Y61ClickselectZAIKOUEntity.getPRICE();
				ay1_ZAIKOU_SHUTSUNYUUKOJOUTAI = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getSHUTSUNYUUKOJOUTAI());
				ay1_ZAIKOU_DAIKINKINGAKU = A007Y61ClickselectZAIKOUEntity.getDAIKINKINGAKU();
				ay1_ZAIKOU_SHUKKANO = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getSHUKKANO());
				ay1_ZAIKOU_SHOUHINKATABAN = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getSHOUHINKATABAN());
				ay1_ZAIKOU_ZAIKOSUURYOU = A007Y61ClickselectZAIKOUEntity.getZAIKOSUURYOU();
				ay1_ZAIKOU_SHOUHINNO = StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity.getSHOUHINNO());
			}
		}
		//検索結果データ操作1をGrid「B8」に設定する
		ay1 = new ArrayList<LinkedHashMap<String, String>>();
		if (A007Y61ClickselectZAIKOUList1 != null && A007Y61ClickselectZAIKOUList1.size() > 0) {
			for (int i = 0;i < A007Y61ClickselectZAIKOUList1.size();i++) {
				A007Y61ClickselectZAIKOUEntity A007Y61ClickselectZAIKOUEntity_i = A007Y61ClickselectZAIKOUList1.get(i);
				selMap = new LinkedHashMap<String, String>();
				selMap.put("ZAIKOU_CHUUBUNSHONO", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getCHUUBUNSHONO()));
				selMap.put("ZAIKOU_CHUUBUNSHOMEISAINO", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getCHUUBUNSHOMEISAINO()));
				selMap.put("ZAIKOU_KOUJIKANRIBANGOU", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getKOUJIKANRIBANGOU()));
				selMap.put("ZAIKOU_ZAIKONO", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getZAIKONO()));
				selMap.put("ZAIKOU_TSUKAMATSUNYUUSAKI", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getTSUKAMATSUNYUUSAKI()));
				selMap.put("ZAIKOU_SHOUHINMEISHOU", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getSHOUHINMEISHOU()));
				selMap.put("ZAIKOU_SHUTSUNYUUKOJIKAN", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getSHUTSUNYUUKOJIKAN()));
				selMap.put("ZAIKOU_SUURYOU", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getSUURYOU()));
				selMap.put("ZAIKOU_PRICE", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getPRICE()));
				selMap.put("ZAIKOU_SHUTSUNYUUKOJOUTAI", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getSHUTSUNYUUKOJOUTAI()));
				selMap.put("ZAIKOU_DAIKINKINGAKU", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getDAIKINKINGAKU()));
				selMap.put("ZAIKOU_SHUKKANO", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getSHUKKANO()));
				selMap.put("ZAIKOU_SHOUHINKATABAN", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getSHOUHINKATABAN()));
				selMap.put("ZAIKOU_ZAIKOSUURYOU", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getZAIKOSUURYOU()));
				selMap.put("ZAIKOU_SHOUHINNO", StringUtil.changeNullToBlank(A007Y61ClickselectZAIKOUEntity_i.getSHOUHINNO()));
				ay1.add(selMap);
			}
		}
		returnVal = A007GridDataConstant.getGridStrSet(ay1, "P00007", "19", 10, 1);
		jsonObj.setScript("r", "setGrid19();$('div#_ingrid_Grid19_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB19", returnVal);
		jsonObj.setReturnID("h", "dragB19");
		A007GridDataConstant.setGridDataToSession("P00007", "19", ay1, request);
		//関数「PageDefaultSet」を実行する
		jsonObj.setScript("r", "PageDefaultSet();");

	}
}