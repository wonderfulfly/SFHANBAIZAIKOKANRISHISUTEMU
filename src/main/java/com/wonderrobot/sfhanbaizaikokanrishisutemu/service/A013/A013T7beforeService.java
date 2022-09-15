package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013T7beforeService
 *      Page: 部品管理画面
 *      Function: 部品管理画面部品詳細インポートbefore
 * @version

 */

@Service
public class A013T7beforeService {
	@Autowired
	private A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao;

   
	@Log
	public void A013T7before (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//ログインIDと一致するデータを削除する
		String ROGUINIDTOITCHISURUDEETAWOSAKUJOSURU = null;
		int A013T7beforedeleteBUHINSYOUSAIRINJIHYOUList = 0;
		String sysDate = DateUtil.getDBPatternDate();
		String loginID = (String) request.getSession().getAttribute("USER_ID");
		ROGUINIDTOITCHISURUDEETAWOSAKUJOSURU = loginID;
		//データ操作1:テーブル「部品詳細臨時表」の項目「登録者ID」がログインIDと一致するデータを削除する
		A013T7beforedeleteBUHINSYOUSAIRINJIHYOUList = A013T7beforedeleteBUHINSYOUSAIRINJIHYOUDao.A013T7beforedeleteBUHINSYOUSAIRINJIHYOU(ROGUINIDTOITCHISURUDEETAWOSAKUJOSURU);

	}
}