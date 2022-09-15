package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011W61ClickselectNYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011W61ClickselectNYUKINDao;
import com.wonderfulfly.core.util.RequestUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011W61ClickService
 *      Page: 注文管理詳細
 *      Function: 注文管理詳細入金_Click
 * @version

 */

@Service
public class A011W61ClickService {
	@Autowired
	private A011W61ClickselectNYUKINDao A011W61ClickselectNYUKINDao;

   
	@Log
	public void A011W61Click (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//注文書NO
		String CHUUBUNSHONO1 = null;
		List<A011W61ClickselectNYUKINEntity> A011W61ClickselectNYUKINList = null;
		
		A011W61ClickselectNYUKINEntity A011W61ClickselectNYUKINEntity = null;
		
		String NYUKIN_RESHIITONO = null;
		String RESHIITONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RESHIITONO")));
		CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		//データ操作:テーブル「入金」のデータの項目「レシートNO」を取得,条件は「注文書NO」が「注文書NO」
		A011W61ClickselectNYUKINList = A011W61ClickselectNYUKINDao.A011W61ClickselectNYUKIN(CHUUBUNSHONO1);
		if (A011W61ClickselectNYUKINList != null && A011W61ClickselectNYUKINList.size() > 0) {
			A011W61ClickselectNYUKINEntity = A011W61ClickselectNYUKINList.get(0);
			if (A011W61ClickselectNYUKINEntity != null) {
				NYUKIN_RESHIITONO = StringUtil.changeNullToBlank(A011W61ClickselectNYUKINEntity.getRESHIITONO());
			}
		}
		//「レシートNO」が空白場合
		if (StringUtil.isNullOrBlank(RESHIITONO)) {
			//「AA4」ボタンを実行する
			jsonObj.setScript("r","SF.setServerExecute(true);$('#AA4').click();");
			//処理終了
		}
		//その他場合
		else {
			//「AA6」ボタンを実行する
			jsonObj.setScript("r","SF.setServerExecute(true);$('#AA6').click();");
			//処理終了
		}

	}
}