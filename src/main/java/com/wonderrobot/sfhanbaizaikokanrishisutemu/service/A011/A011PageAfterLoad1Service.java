package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterLoad1selectSYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectBUMONEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterLoad1selectBUMONDao;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011PageAfterLoad1selectTYUMONSYOEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011PageAfterLoad1selectTYUMONSYODao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011PageAfterLoad1Service
 *      Page: 注文管理詳細
 *      Function: 注文管理詳細PageAfterLoad
 * @version

 */

@Service
public class A011PageAfterLoad1Service {
	@Autowired
	private A011PageAfterLoad1selectSYAINDao A011PageAfterLoad1selectSYAINDao;
	@Autowired
	private A011PageAfterLoad1selectBUMONDao A011PageAfterLoad1selectBUMONDao;
	@Autowired
	private A011PageAfterLoad1selectTYUMONSYODao A011PageAfterLoad1selectTYUMONSYODao;

   
	@Log
	public void A011PageAfterLoad1 (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		
		String ROGUINID = null;
		List<A011PageAfterLoad1selectSYAINEntity> A011PageAfterLoad1selectSYAINList = null;
		
		A011PageAfterLoad1selectSYAINEntity A011PageAfterLoad1selectSYAINEntity = null;
		
		String SYAIN_YUUZAAKENGEN = null;
		List<A011PageAfterLoad1selectBUMONEntity> A011PageAfterLoad1selectBUMONList = null;
		
		A011PageAfterLoad1selectBUMONEntity A011PageAfterLoad1selectBUMONEntity = null;
		
		String BUMON_BUMONMEI = null;
		//注文書NO
		String CHUUBUNSHONO1 = null;
		List<A011PageAfterLoad1selectTYUMONSYOEntity> A011PageAfterLoad1selectTYUMONSYOList = null;
		
		A011PageAfterLoad1selectTYUMONSYOEntity A011PageAfterLoad1selectTYUMONSYOEntity = null;
		
		String TYUMONSYO_SHUTSUNYUUKOFURAGU = null;
		String userID = (String) request.getSession().getAttribute("USER_ID");
		String sysDate = DateUtil.getDBPatternDate();
		CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		//ユーザーIDを取得
		
		//データ操作:テーブル「社員」のデータの項目「ユーザー権限」を取得,条件は「ログインID」が<ログインID>
		A011PageAfterLoad1selectSYAINList = A011PageAfterLoad1selectSYAINDao.A011PageAfterLoad1selectSYAIN(ROGUINID);
		if (A011PageAfterLoad1selectSYAINList != null && A011PageAfterLoad1selectSYAINList.size() > 0) {
			A011PageAfterLoad1selectSYAINEntity = A011PageAfterLoad1selectSYAINList.get(0);
			if (A011PageAfterLoad1selectSYAINEntity != null) {
				SYAIN_YUUZAAKENGEN = StringUtil.changeNullToBlank(A011PageAfterLoad1selectSYAINEntity.getYUUZAAKENGEN());
			}
		}
		//データ操作:テーブル「M_部門」のデータの項目「部門名」を取得,条件は「部門ID」が<ユーザー権限>
		A011PageAfterLoad1selectBUMONList = A011PageAfterLoad1selectBUMONDao.A011PageAfterLoad1selectBUMON(SYAIN_YUUZAAKENGEN);
		if (A011PageAfterLoad1selectBUMONList != null && A011PageAfterLoad1selectBUMONList.size() > 0) {
			A011PageAfterLoad1selectBUMONEntity = A011PageAfterLoad1selectBUMONList.get(0);
			if (A011PageAfterLoad1selectBUMONEntity != null) {
				BUMON_BUMONMEI = StringUtil.changeNullToBlank(A011PageAfterLoad1selectBUMONEntity.getBUMONMEI());
			}
		}
		//<部門名>が空白でない場合
		if (!StringUtil.isNullOrBlank(BUMON_BUMONMEI)) {
			//<部門名>が"営業"又は<部門名>が"設計"又は<部門名>が"購買検収"又は<部門名>が"財務"場合
			if (StringUtil.changeNullToBlank(BUMON_BUMONMEI).equals("営業") || StringUtil.changeNullToBlank(BUMON_BUMONMEI).equals("設計") || StringUtil.changeNullToBlank(BUMON_BUMONMEI).equals("購買検収") || StringUtil.changeNullToBlank(BUMON_BUMONMEI).equals("財務")) {
				//「保存」ボタンを入力不可にする
				jsonObj.setScript("r","SF.setDisabled('W10',true);");
				//「保存」のスタイル「btn02」を削除する
				jsonObj.setScript("r","$('#W10').removeClass('btn02');");
				//「入金」ボタンを入力不可にする
				jsonObj.setScript("r","SF.setDisabled('W6',true);");
				//「入金」のスタイル「btn04」を削除する
				jsonObj.setScript("r","$('#W6').removeClass('btn04');");
				//処理終了
			}
			//処理終了
		}
		//データ操作:テーブル「注文書」のデータの項目「出入庫フラグ」を取得,条件は「注文書NO」が「注文書NO」
		A011PageAfterLoad1selectTYUMONSYOList = A011PageAfterLoad1selectTYUMONSYODao.A011PageAfterLoad1selectTYUMONSYO(CHUUBUNSHONO1);
		if (A011PageAfterLoad1selectTYUMONSYOList != null && A011PageAfterLoad1selectTYUMONSYOList.size() > 0) {
			A011PageAfterLoad1selectTYUMONSYOEntity = A011PageAfterLoad1selectTYUMONSYOList.get(0);
			if (A011PageAfterLoad1selectTYUMONSYOEntity != null) {
				TYUMONSYO_SHUTSUNYUUKOFURAGU = StringUtil.changeNullToBlank(A011PageAfterLoad1selectTYUMONSYOEntity.getSHUTSUNYUUKOFURAGU());
			}
		}
		//<出入庫フラグ>が空白でない,且つ<出入庫フラグ>が"2"場合
		if (!StringUtil.isNullOrBlank(TYUMONSYO_SHUTSUNYUUKOFURAGU) && StringUtil.changeNullToBlank(TYUMONSYO_SHUTSUNYUUKOFURAGU).equals("2")) {
			//「全部出庫」に"出庫取消"を設定する
			jsonObj.setScript("r", "$('#W4').val('" + StringUtil.escapeJSTags("出庫取消") + "');");
			//「出入庫フラグ」に"出庫済み"を設定する
			jsonObj.setScript("r", "SF.setComboboxSelectedByText('SHUTSUNYUUKOFURAGU1','"+ "出庫済み" +"');");
			//処理終了
		}

	}
}