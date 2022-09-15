package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011grdB18W181ClickselectBUHINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011grdB18W181ClickselectBUHINDao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011grdB18W181ClickService
 *      Page: 注文管理詳細
 *      Function: 注文管理詳細部品明細_Click
 * @version

 */

@Service
public class A011grdB18W181ClickService {
	@Autowired
	private A011grdB18W181ClickselectBUHINDao A011grdB18W181ClickselectBUHINDao;

   
	@Log
	public void A011grdB18W181Click (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//注文書NO
		String CHUUBUNSHONO1 = null;
		List<A011grdB18W181ClickselectBUHINEntity> A011grdB18W181ClickselectBUHINList = null;
		
		A011grdB18W181ClickselectBUHINEntity A011grdB18W181ClickselectBUHINEntity = null;
		
		String BUHIN_CHUUBUNSHONO = null;
		String triggerID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("triggerID")));
		String row = triggerID.indexOf("_") > 0 ? triggerID.substring(triggerID.lastIndexOf("_") + 1) : "";
		String CHUUBUNSHOMEISAINO = null;
		CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		//「注文書明細NO」を取得
		CHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHOMEISAINO_"+row)));
		//<注文書明細NO>が空白場合
		if ((StringUtil.isNullOrBlank(CHUUBUNSHOMEISAINO) || StringUtil.changeNullToBlank(CHUUBUNSHOMEISAINO).equals("[自動採番]")) ) {
			//「先に保存してください。」メッセージを表示する
			jsonObj.setScript("r", "alert('先に保存してください。');");
			//処理終了
		}
		//その他場合
		else {
			//データ操作:テーブル「部品」のデータの項目「注文書NO」を取得,条件は「注文書NO」が「注文書NO」,「注文書明細NO」が「注文書明細NO」
			A011grdB18W181ClickselectBUHINList = A011grdB18W181ClickselectBUHINDao.A011grdB18W181ClickselectBUHIN(CHUUBUNSHONO1, CHUUBUNSHOMEISAINO);
			if (A011grdB18W181ClickselectBUHINList != null && A011grdB18W181ClickselectBUHINList.size() > 0) {
				A011grdB18W181ClickselectBUHINEntity = A011grdB18W181ClickselectBUHINList.get(0);
				if (A011grdB18W181ClickselectBUHINEntity != null) {
					BUHIN_CHUUBUNSHONO = StringUtil.changeNullToBlank(A011grdB18W181ClickselectBUHINEntity.getCHUUBUNSHONO());
				}
			}
			//<注文書NO>が空白でない場合
			if (!StringUtil.isNullOrBlank(BUHIN_CHUUBUNSHONO)) {
				//「部品明細next」ボタンを実行する
				jsonObj.setScript("r","SF.setServerExecute(true);$('#grdB18AA18_"+row+"').click();");
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