package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1updateNYUKINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectTYUMONSYOEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1selectTYUMONSYODao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectNYUKINMEISAIEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1selectNYUKINMEISAIDao;
import java.text.DecimalFormat;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1updateNYUKINMEISAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1updateKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectTYUMONSYO1Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1selectTYUMONSYO1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterSave1selectBUHINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1selectBUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterSave1insertBUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterSave1Service
 *      Page: 注文管理詳細
 *      Function: 注文管理詳細PageAfterSave
 * @version

 */

@Service
public class A011PageAfterSave1Service {
	@Autowired
	private A011PageAfterSave1updateNYUKINDao A011PageAfterSave1updateNYUKINDao;
	@Autowired
	private A011PageAfterSave1selectTYUMONSYODao A011PageAfterSave1selectTYUMONSYODao;
	@Autowired
	private A011PageAfterSave1selectNYUKINMEISAIDao A011PageAfterSave1selectNYUKINMEISAIDao;
	@Autowired
	private A011PageAfterSave1updateNYUKINMEISAIDao A011PageAfterSave1updateNYUKINMEISAIDao;
	@Autowired
	private A011PageAfterSave1updateKAISYADao A011PageAfterSave1updateKAISYADao;
	@Autowired
	private A011PageAfterSave1selectTYUMONSYO1Dao A011PageAfterSave1selectTYUMONSYO1Dao;
	@Autowired
	private A011PageAfterSave1selectBUHINDao A011PageAfterSave1selectBUHINDao;
	@Autowired
	private A011PageAfterSave1insertBUHINDao A011PageAfterSave1insertBUHINDao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void A011PageAfterSave1 (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//JPY合計
		double JPYGOUKEI = 0.0;
		//注文書NO
		String CHUUBUNSHONO1 = null;
		int A011PageAfterSave1updateNYUKINList = 0;
		List<A011PageAfterSave1selectTYUMONSYOEntity> A011PageAfterSave1selectTYUMONSYOList2 = null;
		
		A011PageAfterSave1selectTYUMONSYOEntity A011PageAfterSave1selectTYUMONSYOEntity = null;
		
		String ay2_TYUMONSYO_RESHIITONO = null;
		List<A011PageAfterSave1selectNYUKINMEISAIEntity> A011PageAfterSave1selectNYUKINMEISAIList3 = null;
		int i = 0;
		
		A011PageAfterSave1selectNYUKINMEISAIEntity A011PageAfterSave1selectNYUKINMEISAIEntity = null;
		
		String ay3_NYUKINMEISAI_FURIDASHIZUMIWARIAI = null;
		
		double ay3_NYUKINMEISAI_FURIDASHIZUMIKINGAKU = 0.0;
		
		double ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI = 0.0;
		
		double ay3_NYUKINMEISAI_NYUUKINZUMIKINGAKU = 0.0;
		
		String ay3_NYUKINMEISAI_RESHIITOMEISAINO = null;
		int A011PageAfterSave1updateNYUKINMEISAIList = 0;
		//アドレス
		String ADORESU1 = null;
		//電話番号
		String DENWABANGOU1 = null;
		//客先名称
		String KYAKUSAKIMEISHOU = null;
		int A011PageAfterSave1updateKAISYAList = 0;
		List<A011PageAfterSave1selectTYUMONSYO1Entity> A011PageAfterSave1selectTYUMONSYO1List6 = null;
		int j = 0;
		
		A011PageAfterSave1selectTYUMONSYO1Entity A011PageAfterSave1selectTYUMONSYO1Entity = null;
		
		String ay6_TYUMONSYO_CHUUBUNSHONO = null;
		
		String ay6_TYUMONSYO_SHANAIKOUJIBANGOU = null;
		
		String ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO = null;
		List<A011PageAfterSave1selectBUHINEntity> A011PageAfterSave1selectBUHINList7 = null;
		
		A011PageAfterSave1selectBUHINEntity A011PageAfterSave1selectBUHINEntity = null;
		
		String ay7_BUHIN_CHUUBUNSHONO = null;
		int A011PageAfterSave1insertBUHINList = 0;
		DecimalFormat df;
		JPYGOUKEI = StringUtil.getCommaStringToDouoble(StringUtil.escapeSQLTags(request.getParameter("JPYGOUKEI")));
		CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		ADORESU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("ADORESU1")));
		DENWABANGOU1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("DENWABANGOU1")));
		KYAKUSAKIMEISHOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KYAKUSAKIMEISHOU")));
		//データ操作1:テーブル「入金」の項目「注文書NO」が値「注文書NO」のデータに対して,項目「入金金額」を「JPY合計」に変更する
		A011PageAfterSave1updateNYUKINList = A011PageAfterSave1updateNYUKINDao.A011PageAfterSave1updateNYUKIN(JPYGOUKEI, CHUUBUNSHONO1);
		//データ操作2:テーブル「注文書」のデータの項目「レシートNO」を取得,条件は「注文書NO」が「注文書NO」
		A011PageAfterSave1selectTYUMONSYOList2 = A011PageAfterSave1selectTYUMONSYODao.A011PageAfterSave1selectTYUMONSYO(CHUUBUNSHONO1);
		if (A011PageAfterSave1selectTYUMONSYOList2 != null && A011PageAfterSave1selectTYUMONSYOList2.size() > 0) {
			A011PageAfterSave1selectTYUMONSYOEntity = A011PageAfterSave1selectTYUMONSYOList2.get(0);
			if (A011PageAfterSave1selectTYUMONSYOEntity != null) {
				ay2_TYUMONSYO_RESHIITONO = StringUtil.changeNullToBlank(A011PageAfterSave1selectTYUMONSYOEntity.getRESHIITONO());
			}
		}
		//<レシートNO>が空白でない場合
		if (!StringUtil.isNullOrBlank(ay2_TYUMONSYO_RESHIITONO)) {
			//データ操作3:テーブル「入金明細」のデータの項目「振出済み割合,振出済み金額,入金済み割合,入金済み金額,レシート明細NO」を取得,条件は「レシートNO」が<レシートNO>（ループ開始）
			A011PageAfterSave1selectNYUKINMEISAIList3 = A011PageAfterSave1selectNYUKINMEISAIDao.A011PageAfterSave1selectNYUKINMEISAI(ay2_TYUMONSYO_RESHIITONO);
			if (A011PageAfterSave1selectNYUKINMEISAIList3 != null && A011PageAfterSave1selectNYUKINMEISAIList3.size() > 0) {
				for (i = 0;i < A011PageAfterSave1selectNYUKINMEISAIList3.size();i++) {
					A011PageAfterSave1selectNYUKINMEISAIEntity = A011PageAfterSave1selectNYUKINMEISAIList3.get(i);;
					if (A011PageAfterSave1selectNYUKINMEISAIEntity != null) {
						ay3_NYUKINMEISAI_FURIDASHIZUMIWARIAI = StringUtil.changeNullToBlank(A011PageAfterSave1selectNYUKINMEISAIEntity.getFURIDASHIZUMIWARIAI());
						ay3_NYUKINMEISAI_FURIDASHIZUMIKINGAKU = A011PageAfterSave1selectNYUKINMEISAIEntity.getFURIDASHIZUMIKINGAKU();
						ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI = A011PageAfterSave1selectNYUKINMEISAIEntity.getNYUUKINZUMIWARIAI();
						ay3_NYUKINMEISAI_NYUUKINZUMIKINGAKU = A011PageAfterSave1selectNYUKINMEISAIEntity.getNYUUKINZUMIKINGAKU();
						ay3_NYUKINMEISAI_RESHIITOMEISAINO = StringUtil.changeNullToBlank(A011PageAfterSave1selectNYUKINMEISAIEntity.getRESHIITOMEISAINO());
					}
					//<振出済み金額>が空白でない場合
					if (ay3_NYUKINMEISAI_FURIDASHIZUMIKINGAKU != 0) {
						//変数計算(double,小数点以下第「2」位を切り捨て（包括整数)):<振出済み割合>=(<振出済み金額>/<JPY合計>*100*100)/100
						ay3_NYUKINMEISAI_FURIDASHIZUMIWARIAI=StringUtil.changeNullToBlank((ay3_NYUKINMEISAI_FURIDASHIZUMIKINGAKU/JPYGOUKEI*100*100)/100);
						if (!StringUtil.isNullOrBlank(ay3_NYUKINMEISAI_FURIDASHIZUMIWARIAI)) {
							ay3_NYUKINMEISAI_FURIDASHIZUMIWARIAI = StringUtil.changeNullToBlank(Math.floor(StringUtil.changeStringToDouble(ay3_NYUKINMEISAI_FURIDASHIZUMIWARIAI)*100)/100);
							df = new DecimalFormat("#0.00");
							ay3_NYUKINMEISAI_FURIDASHIZUMIWARIAI = df.format(StringUtil.changeStringToDouble(ay3_NYUKINMEISAI_FURIDASHIZUMIWARIAI));
						}
						//処理終了
					}
					//<入金済み金額>が空白でない場合
					if (ay3_NYUKINMEISAI_NYUUKINZUMIKINGAKU != 0) {
						//変数計算(double,小数点以下第「2」位を切り捨て（包括整数）):<入金済み割合>=(<入金済み金額>/<JPY合計>*100*100)/100
						ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI=(ay3_NYUKINMEISAI_NYUUKINZUMIKINGAKU/JPYGOUKEI*100*100)/100;
						ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI = Math.floor(ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI*100)/100;
						df = new DecimalFormat("#0.00");
						ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI = StringUtil.changeStringToDouble(df.format(ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI));
						//処理終了
					}
					//データ操作4:テーブル「入金明細」の項目「レシート明細NO」が値<レシート明細NO>のデータに対して,項目「入金済み割合」を<入金済み割合>に変更する
					A011PageAfterSave1updateNYUKINMEISAIList = A011PageAfterSave1updateNYUKINMEISAIDao.A011PageAfterSave1updateNYUKINMEISAI(ay3_NYUKINMEISAI_NYUUKINZUMIWARIAI, ay3_NYUKINMEISAI_RESHIITOMEISAINO);
					//検索結果ループ終了
				}
			}
			//処理終了
		}
		//データ操作5:テーブル「会社」の項目「会社ID」が「客先名称」のデータに対して,「アドレス」を「アドレス」,「連絡先」を「電話番号」に変更する
		A011PageAfterSave1updateKAISYAList = A011PageAfterSave1updateKAISYADao.A011PageAfterSave1updateKAISYA(ADORESU1, DENWABANGOU1, KYAKUSAKIMEISHOU);
		//データ操作6:テーブル「注文書,注文書明細」のデータの項目「注文書.注文書NO,注文書.社内工事番号,注文書明細.注文書明細NO」を取得,条件は「注文書.注文書NO」が「注文書NO」(ループ開始)
		A011PageAfterSave1selectTYUMONSYO1List6 = A011PageAfterSave1selectTYUMONSYO1Dao.A011PageAfterSave1selectTYUMONSYO1(CHUUBUNSHONO1);
		if (A011PageAfterSave1selectTYUMONSYO1List6 != null && A011PageAfterSave1selectTYUMONSYO1List6.size() > 0) {
			for (j = 0;j < A011PageAfterSave1selectTYUMONSYO1List6.size();j++) {
				A011PageAfterSave1selectTYUMONSYO1Entity = A011PageAfterSave1selectTYUMONSYO1List6.get(j);;
				if (A011PageAfterSave1selectTYUMONSYO1Entity != null) {
					ay6_TYUMONSYO_CHUUBUNSHONO = StringUtil.changeNullToBlank(A011PageAfterSave1selectTYUMONSYO1Entity.getCHUUBUNSHONO());
					ay6_TYUMONSYO_SHANAIKOUJIBANGOU = StringUtil.changeNullToBlank(A011PageAfterSave1selectTYUMONSYO1Entity.getSHANAIKOUJIBANGOU());
					ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(A011PageAfterSave1selectTYUMONSYO1Entity.getA011TYUMONSYOMEISAIEntityList().get(0).getCHUUBUNSHOMEISAINO());
				}
				//データ操作7:テーブル「部品」のデータの項目「注文書NO」を取得,条件は「注文書NO」が<注文書.注文書NO>,「注文書明細NO」が<注文書明細.注文書明細NO>
				A011PageAfterSave1selectBUHINList7 = A011PageAfterSave1selectBUHINDao.A011PageAfterSave1selectBUHIN(ay6_TYUMONSYO_CHUUBUNSHONO, ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO);
				if (A011PageAfterSave1selectBUHINList7 != null && A011PageAfterSave1selectBUHINList7.size() > 0) {
					A011PageAfterSave1selectBUHINEntity = A011PageAfterSave1selectBUHINList7.get(0);
					if (A011PageAfterSave1selectBUHINEntity != null) {
						ay7_BUHIN_CHUUBUNSHONO = StringUtil.changeNullToBlank(A011PageAfterSave1selectBUHINEntity.getCHUUBUNSHONO());
					}
				}
				//<注文書NO>が空白且つ<注文書明細.注文書明細NO><注文書NO>が空白でない場合
				if (StringUtil.isNullOrBlank(ay7_BUHIN_CHUUBUNSHONO) && !StringUtil.isNullOrBlank(ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO)) {
					//データ操作8:テーブル「部品」にデータ登録,「注文書NO」が<注文書.注文書NO>,「工事管理番号」が<注文書.社内工事番号>,「注文書明細NO」が<注文書明細.注文書明細NO>
					A011PageAfterSave1insertBUHINList = A011PageAfterSave1insertBUHINDao.A011PageAfterSave1insertBUHIN(ay6_TYUMONSYO_CHUUBUNSHONO, ay6_TYUMONSYO_SHANAIKOUJIBANGOU, ay6_TYUMONSYOMEISAI_CHUUBUNSHOMEISAINO);
					//処理終了
				}
				//検索結果ループ終了
			}
		}

	}
}