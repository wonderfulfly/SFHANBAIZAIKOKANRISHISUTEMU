package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6beforedeleteMITUMORIRINJIHYOUDao;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A010W6beforeService
 *      Page: 注文管理検索
 *      Function: 注文管理検索見積書インポートbefore
 * @version

 */

@Service
public class A010W6beforeService {
	@Autowired
	private A010W6beforedeleteMITUMORIRINJIHYOUDao A010W6beforedeleteMITUMORIRINJIHYOUDao;

   
	@Log
	public void A010W6before (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//ログインIDと一致するのデータを削除する
		String ROGUINIDTOITCHISURUNODEETAWOSAKUJOSURU = null;
		int A010W6beforedeleteMITUMORIRINJIHYOUList = 0;
		String sysDate = DateUtil.getDBPatternDate();
		String loginID = (String) request.getSession().getAttribute("USER_ID");
		ROGUINIDTOITCHISURUNODEETAWOSAKUJOSURU = loginID;
		//データ操作:テーブル「見積り臨時表」の項目「記録者ID」がログインIDと一致するのデータを削除する
		A010W6beforedeleteMITUMORIRINJIHYOUList = A010W6beforedeleteMITUMORIRINJIHYOUDao.A010W6beforedeleteMITUMORIRINJIHYOU(ROGUINIDTOITCHISURUNODEETAWOSAKUJOSURU);

	}
}