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
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A007grdB81ChangeService
 *      Page: 商品入庫画面
 *      Function: 商品入庫画面grdB8_Change
 * @version

 */

@Service
public class A007grdB81ChangeService {

   
	@Log
	public void A007grdB81Change (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		int intRow = 0;
		int i = 0;
		String CHUUBUNSHONO1 = null;
		String CHUUBUNSHOMEISAINO = null;
		String KOUJIKANRIBANGOU = null;
		String ZAIKONO1 = null;
		String TSUKAMATSUNYUUSAKI = null;
		String SHOUHINMEISHOU = null;
		String SHUTSUNYUUKOJIKAN = null;
		String SUURYOU = null;
		String PRICE = null;
		String SHUTSUNYUUKOJOUTAI = null;
		String grdB8AE8 = null;
		String SHUKKANO = null;
		String SHOUHINKATABAN = null;
		String ZAIKOSUURYOU = null;
		String SHOUHINNO = null;
		String sysDate = DateUtil.getDBPatternDate();
		String row = request.getParameter("RowGrid19");
		//Grid「B8」ループ開始
		intRow = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid19")));
		for (i = 1;i <= intRow; i++) {
			/* grid loop start */
			if (StringUtil.escapeSQLTags(request.getParameter("Grid19flg" + i)) !=null &&StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid19flg" + i))).equals("0")) {
				continue;
			}
			CHUUBUNSHONO1 = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].CHUUBUNSHONO1"));
			CHUUBUNSHOMEISAINO = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].CHUUBUNSHOMEISAINO"));
			KOUJIKANRIBANGOU = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].KOUJIKANRIBANGOU"));
			ZAIKONO1 = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].ZAIKONO1"));
			TSUKAMATSUNYUUSAKI = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].TSUKAMATSUNYUUSAKI"));
			SHOUHINMEISHOU = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].SHOUHINMEISHOU"));
			SHUTSUNYUUKOJIKAN = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].SHUTSUNYUUKOJIKAN"));
			SUURYOU = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].SUURYOU"));
			PRICE = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].PRICE"));
			SHUTSUNYUUKOJOUTAI = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].SHUTSUNYUUKOJOUTAI"));
			grdB8AE8 = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].grdB8AE8"));
			SHUKKANO = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].SHUKKANO"));
			SHOUHINKATABAN = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].SHOUHINKATABAN"));
			ZAIKOSUURYOU = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].ZAIKOSUURYOU"));
			SHOUHINNO = StringUtil.escapeSQLTags(request.getParameter("Grid19["+(i+1)+"].SHOUHINNO"));
			//「状態」が"2"場合
			if (StringUtil.changeNullToBlank(SHUTSUNYUUKOJOUTAI).equals("2")) {
				//「入庫」を非表示にする
				jsonObj.setScript("r","SF.setVisible('grdB8AE8_"+row+"', false);");
				//処理終了
			}
			//「状態」が"1"場合
			if (StringUtil.changeNullToBlank(SHUTSUNYUUKOJOUTAI).equals("1")) {
				//「入庫」ボタンに"キャンセル"を設定する
				jsonObj.setScript("r","$('#grdB8AE8_"+i+"').val('" +StringUtil.escapeJSTags("キャンセル")+ "');");
				//処理終了
			}
			//グリッドループ終了
		}

	}
}