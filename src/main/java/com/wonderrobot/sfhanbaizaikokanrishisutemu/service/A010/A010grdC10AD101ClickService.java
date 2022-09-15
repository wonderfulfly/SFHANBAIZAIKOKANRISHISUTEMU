package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010grdC10AD101ClickselectNYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickselectNYUKINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteNYUKINMEISAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteNYUKINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteZAIKOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteTYUMONSYOMEISAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteTYUMONSYODao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteBUHINSYOUSAIDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteBUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteSYOUHINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010grdC10AD101ClickdeleteMITUMORIDao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010grdC10AD101ClickService
 *      Page: 注文管理検索
 *      Function: 注文管理検索削除確認_Click
 * @version

 */

@Service
public class A010grdC10AD101ClickService {
	@Autowired
	private A010grdC10AD101ClickselectNYUKINDao A010grdC10AD101ClickselectNYUKINDao;
	@Autowired
	private A010grdC10AD101ClickdeleteNYUKINMEISAIDao A010grdC10AD101ClickdeleteNYUKINMEISAIDao;
	@Autowired
	private A010grdC10AD101ClickdeleteNYUKINDao A010grdC10AD101ClickdeleteNYUKINDao;
	@Autowired
	private A010grdC10AD101ClickdeleteZAIKOUDao A010grdC10AD101ClickdeleteZAIKOUDao;
	@Autowired
	private A010grdC10AD101ClickdeleteTYUMONSYOMEISAIDao A010grdC10AD101ClickdeleteTYUMONSYOMEISAIDao;
	@Autowired
	private A010grdC10AD101ClickdeleteTYUMONSYODao A010grdC10AD101ClickdeleteTYUMONSYODao;
	@Autowired
	private A010grdC10AD101ClickdeleteBUHINSYOUSAIDao A010grdC10AD101ClickdeleteBUHINSYOUSAIDao;
	@Autowired
	private A010grdC10AD101ClickdeleteBUHINDao A010grdC10AD101ClickdeleteBUHINDao;
	@Autowired
	private A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUDao A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUDao;
	@Autowired
	private A010grdC10AD101ClickdeleteSYOUHINDao A010grdC10AD101ClickdeleteSYOUHINDao;
	@Autowired
	private A010grdC10AD101ClickdeleteMITUMORIDao A010grdC10AD101ClickdeleteMITUMORIDao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void A010grdC10AD101Click (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String triggerID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("triggerID")));
		String row = triggerID.indexOf("_") > 0 ? triggerID.substring(triggerID.lastIndexOf("_") + 1) : "";
		//注文書NO
		String CHUUBUNSHONO = null;
		List<A010grdC10AD101ClickselectNYUKINEntity> A010grdC10AD101ClickselectNYUKINList = null;
		
		A010grdC10AD101ClickselectNYUKINEntity A010grdC10AD101ClickselectNYUKINEntity = null;
		
		String NYUKIN_RESHIITONO = null;
		int A010grdC10AD101ClickdeleteNYUKINMEISAIList = 0;
		int A010grdC10AD101ClickdeleteNYUKINList = 0;
		int A010grdC10AD101ClickdeleteZAIKOUList = 0;
		int A010grdC10AD101ClickdeleteTYUMONSYOMEISAIList = 0;
		int A010grdC10AD101ClickdeleteTYUMONSYOList = 0;
		int A010grdC10AD101ClickdeleteBUHINSYOUSAIList = 0;
		int A010grdC10AD101ClickdeleteBUHINList = 0;
		int A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUList = 0;
		int A010grdC10AD101ClickdeleteSYOUHINList = 0;
		//見積書NO
		String MITSUMORISHONO = null;
		int A010grdC10AD101ClickdeleteMITUMORIList = 0;
		CHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid43["+(StringUtil.changeStringToInt(row)-1)+"].CHUUBUNSHONO")));
		MITSUMORISHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid43["+(StringUtil.changeStringToInt(row)-1)+"].MITSUMORISHONO")));
		//データ操作:テーブル「入金」の項目「レシートNO」を取得,条件は「注文書NO」が「注文書NO」
		A010grdC10AD101ClickselectNYUKINList = A010grdC10AD101ClickselectNYUKINDao.A010grdC10AD101ClickselectNYUKIN(CHUUBUNSHONO);
		if (A010grdC10AD101ClickselectNYUKINList != null && A010grdC10AD101ClickselectNYUKINList.size() > 0) {
			A010grdC10AD101ClickselectNYUKINEntity = A010grdC10AD101ClickselectNYUKINList.get(0);
			if (A010grdC10AD101ClickselectNYUKINEntity != null) {
				NYUKIN_RESHIITONO = StringUtil.changeNullToBlank(A010grdC10AD101ClickselectNYUKINEntity.getRESHIITONO());
			}
		}
		//データ操作:テーブル「入金明細」の項目「レシートNO」が<レシートNO>と一致するデータを削除する
		A010grdC10AD101ClickdeleteNYUKINMEISAIList = A010grdC10AD101ClickdeleteNYUKINMEISAIDao.A010grdC10AD101ClickdeleteNYUKINMEISAI(NYUKIN_RESHIITONO);
		//データ操作:テーブル「入金」の項目「注文書NO」が画面項目「注文書NO」と一致するデータを削除する
		A010grdC10AD101ClickdeleteNYUKINList = A010grdC10AD101ClickdeleteNYUKINDao.A010grdC10AD101ClickdeleteNYUKIN(CHUUBUNSHONO);
		//データ操作:テーブル「在庫」の項目「注文書NO」が画面項目「注文書NO」と一致するデータを削除する
		A010grdC10AD101ClickdeleteZAIKOUList = A010grdC10AD101ClickdeleteZAIKOUDao.A010grdC10AD101ClickdeleteZAIKOU(CHUUBUNSHONO);
		//データ操作:テーブル「注文書明細」の項目「注文書NO」が画面項目「注文書NO」と一致するデータを削除する
		A010grdC10AD101ClickdeleteTYUMONSYOMEISAIList = A010grdC10AD101ClickdeleteTYUMONSYOMEISAIDao.A010grdC10AD101ClickdeleteTYUMONSYOMEISAI(CHUUBUNSHONO);
		//データ操作:テーブル「注文書」の項目「注文書NO」が画面項目「注文書NO」と一致するデータを削除する
		A010grdC10AD101ClickdeleteTYUMONSYOList = A010grdC10AD101ClickdeleteTYUMONSYODao.A010grdC10AD101ClickdeleteTYUMONSYO(CHUUBUNSHONO);
		//データ操作:テーブル「部品詳細」の項目「注文書NO」が画面項目「注文書NO」と一致するデータを削除する
		A010grdC10AD101ClickdeleteBUHINSYOUSAIList = A010grdC10AD101ClickdeleteBUHINSYOUSAIDao.A010grdC10AD101ClickdeleteBUHINSYOUSAI(CHUUBUNSHONO);
		//データ操作:テーブル「部品」の項目「注文書NO」が画面項目「注文書NO」と一致するデータを削除する
		A010grdC10AD101ClickdeleteBUHINList = A010grdC10AD101ClickdeleteBUHINDao.A010grdC10AD101ClickdeleteBUHIN(CHUUBUNSHONO);
		//データ操作:テーブル「部品詳細臨時表」の項目「注文書NO」が画面項目「注文書NO」と一致するデータを削除する
		A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUList = A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOUDao.A010grdC10AD101ClickdeleteBUHINSYOUSAIRINJIHYOU(CHUUBUNSHONO);
		//データ操作:テーブル「商品」の項目「商品NO」が先頭一致画面項目「注文書NO」のデータを削除する
		A010grdC10AD101ClickdeleteSYOUHINList = A010grdC10AD101ClickdeleteSYOUHINDao.A010grdC10AD101ClickdeleteSYOUHIN(CHUUBUNSHONO);
		//データ操作:テーブル「見積り」の項目「見積書NO」が先頭一致画面項目「見積書NO」のデータを削除する
		A010grdC10AD101ClickdeleteMITUMORIList = A010grdC10AD101ClickdeleteMITUMORIDao.A010grdC10AD101ClickdeleteMITUMORI(MITSUMORISHONO);
		//「削除完了」メッセージを表示する
		jsonObj.setScript("r", "alert('削除完了');");
		//「検索」ボタンを実行する
		jsonObj.setScript("r","SF.setServerExecute(true);$('#H8').click();");

	}
}