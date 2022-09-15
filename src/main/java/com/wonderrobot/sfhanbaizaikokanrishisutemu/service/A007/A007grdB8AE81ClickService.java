package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A007;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8AE81ClickupdateZAIKOUDao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8AE81ClickupdateZAIKOU1Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007grdB8AE81ClickselectSYOUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8AE81ClickselectSYOUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007grdB8AE81ClickupdateSYOUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB8AE81ClickService
 *      Page: 商品入庫画面
 *      Function: 商品入庫画面入庫_Click
 * @version

 */

@Service
public class A007grdB8AE81ClickService {
	@Autowired
	private A007grdB8AE81ClickupdateZAIKOUDao A007grdB8AE81ClickupdateZAIKOUDao;
	@Autowired
	private A007grdB8AE81ClickupdateZAIKOU1Dao A007grdB8AE81ClickupdateZAIKOU1Dao;
	@Autowired
	private A007grdB8AE81ClickselectSYOUHINDao A007grdB8AE81ClickselectSYOUHINDao;
	@Autowired
	private A007grdB8AE81ClickupdateSYOUHINDao A007grdB8AE81ClickupdateSYOUHINDao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void A007grdB8AE81Click (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		int A007grdB8AE81ClickupdateZAIKOUList = 0;
		int A007grdB8AE81ClickupdateZAIKOU1List = 0;
		//商品NO
		String SHOUHINNO = null;
		List<A007grdB8AE81ClickselectSYOUHINEntity> A007grdB8AE81ClickselectSYOUHINList3 = null;
		
		A007grdB8AE81ClickselectSYOUHINEntity A007grdB8AE81ClickselectSYOUHINEntity = null;
		
		int ay3_SYOUHIN_ZAIKOSUURYOU = 0;
		int A007grdB8AE81ClickupdateSYOUHINList = 0;
		String triggerID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("triggerID")));
		String row = triggerID.indexOf("_") > 0 ? triggerID.substring(triggerID.lastIndexOf("_") + 1) : "";
		String SHUTSUNYUUKOJOUTAI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHUTSUNYUUKOJOUTAI_"+row)));
		String sysDate = DateUtil.getDBPatternDate();
		String ZAIKONO1 = null;
		String SUURYOU = null;
		SHOUHINNO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid19["+(StringUtil.changeStringToInt(row)-1)+"].SHOUHINNO")));
		//「状態」が"1"又は「状態」が"2"場合
		if (StringUtil.changeNullToBlank(SHUTSUNYUUKOJOUTAI).equals("1") || StringUtil.changeNullToBlank(SHUTSUNYUUKOJOUTAI).equals("2")) {
			//「状態」が"1"場合
			if (StringUtil.changeNullToBlank(SHUTSUNYUUKOJOUTAI).equals("1")) {
				//「部品明細連番」を取得
				ZAIKONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("ZAIKONO1_"+row)));
				//データ操作1:テーブル「在庫」の項目「在庫NO」が値<部品明細連番>のデータに対して,項目「出入庫状態」を文字列"0"に変更する
				A007grdB8AE81ClickupdateZAIKOUList = A007grdB8AE81ClickupdateZAIKOUDao.A007grdB8AE81ClickupdateZAIKOU(ZAIKONO1);
				//「入庫取消完了」メッセージを表示する
				jsonObj.setScript("r", "alert('入庫取消完了');");
				//「状態」に"未入庫"を設定する
				String[] selectTextSHUTSUNYUUKOJOUTAI = {"出庫", "未入庫", "入庫済み"};
				String[] selectValueSHUTSUNYUUKOJOUTAI = {"2", "0", "1"};
				String vaMINYUUKO = "未入庫";
				for (int sel = 0;sel < selectTextSHUTSUNYUUKOJOUTAI.length;sel++) {
					if (vaMINYUUKO == selectTextSHUTSUNYUUKOJOUTAI[sel]) {
						vaMINYUUKO = selectValueSHUTSUNYUUKOJOUTAI[sel];
					}
				}
				jsonObj.setScript("r", "$('#showSHUTSUNYUUKOJOUTAI_"+row+"').val('"+ "未入庫" +"');");
				jsonObj.setScript("r", "$('#SHUTSUNYUUKOJOUTAI_"+row+"').val('"+ vaMINYUUKO +"');");
				//「入庫」ボタンに"入庫"を設定する
				jsonObj.setScript("r","$('#grdB8AE8_"+row+"').val('" +StringUtil.escapeJSTags("入庫")+ "');");
				//処理終了
			}
			//「状態」が"2"場合
			if (StringUtil.changeNullToBlank(SHUTSUNYUUKOJOUTAI).equals("2")) {
				//「出庫済データ,重複操作！」メッセージを表示する
				jsonObj.setScript("r", "alert('出庫済データ,重複操作！');");
				//処理終了
			}
			//処理終了
		}
		//その他場合
		else {
			//「数量」を取得
			SUURYOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SUURYOU_"+row)));
			//「部品明細連番」を取得
			ZAIKONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("ZAIKONO1_"+row)));
			//データ操作2:テーブル「在庫」の項目「在庫NO」が値<部品明細連番>のデータに対して,項目「出入庫状態」を文字列"1"に変更する
			A007grdB8AE81ClickupdateZAIKOU1List = A007grdB8AE81ClickupdateZAIKOU1Dao.A007grdB8AE81ClickupdateZAIKOU1(ZAIKONO1);
			//データ操作3:テーブル「商品」によるフィールド「在庫数量」を取得,条件はフィールド「商品NO」が画面項目「商品NO」
			A007grdB8AE81ClickselectSYOUHINList3 = A007grdB8AE81ClickselectSYOUHINDao.A007grdB8AE81ClickselectSYOUHIN(SHOUHINNO);
			if (A007grdB8AE81ClickselectSYOUHINList3 != null && A007grdB8AE81ClickselectSYOUHINList3.size() > 0) {
				A007grdB8AE81ClickselectSYOUHINEntity = A007grdB8AE81ClickselectSYOUHINList3.get(0);
				if (A007grdB8AE81ClickselectSYOUHINEntity != null) {
					ay3_SYOUHIN_ZAIKOSUURYOU = A007grdB8AE81ClickselectSYOUHINEntity.getZAIKOSUURYOU();
				}
			}
			//<在庫数量>が空白でない場合
			if (ay3_SYOUHIN_ZAIKOSUURYOU != 0) {
				//変数計算:<在庫数量>=<在庫数量>+<数量>
				ay3_SYOUHIN_ZAIKOSUURYOU=(int) (ay3_SYOUHIN_ZAIKOSUURYOU+StringUtil.changeStringToDouble(SUURYOU));
				//処理終了
			}
			//その他場合
			else {
				//変数<在庫数量>に<数量>を設定する
				ay3_SYOUHIN_ZAIKOSUURYOU = StringUtil.changeStringToInt(SUURYOU);
				//処理終了
			}
			//データ操作4:テーブル「商品」の項目「商品NO」が値「商品NO」のデータに対して,「在庫数量」を<在庫数量>に変更する
			A007grdB8AE81ClickupdateSYOUHINList = A007grdB8AE81ClickupdateSYOUHINDao.A007grdB8AE81ClickupdateSYOUHIN(ay3_SYOUHIN_ZAIKOSUURYOU, SHOUHINNO);
			//「状態」に"入庫済み"を設定する
			String[] selectTextSHUTSUNYUUKOJOUTAI = {"出庫", "未入庫", "入庫済み"};
			String[] selectValueSHUTSUNYUUKOJOUTAI = {"2", "0", "1"};
			String vaNYUUKOZUMI = "入庫済み";
			for (int sel = 0;sel < selectTextSHUTSUNYUUKOJOUTAI.length;sel++) {
				if (vaNYUUKOZUMI == selectTextSHUTSUNYUUKOJOUTAI[sel]) {
					vaNYUUKOZUMI = selectValueSHUTSUNYUUKOJOUTAI[sel];
				}
			}
			jsonObj.setScript("r", "$('#showSHUTSUNYUUKOJOUTAI_"+row+"').val('"+ "入庫済み" +"');");
			jsonObj.setScript("r", "$('#SHUTSUNYUUKOJOUTAI_"+row+"').val('"+ vaNYUUKOZUMI +"');");
			//「入庫」ボタンに"キャンセル"を設定する
			jsonObj.setScript("r","$('#grdB8AE8_"+row+"').val('" +StringUtil.escapeJSTags("キャンセル")+ "');");
			//「入庫更新完了」メッセージを表示する
			jsonObj.setScript("r", "alert('入庫更新完了');");
			//処理終了
		}

	}
}