package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderfulfly.core.util.RequestUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009PageAfterLoad1selectKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009PageAfterLoad1selectKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009PageAfterLoad1Service
 *      Page: 入金管理詳細
 *      Function: 入金管理詳細PageAfterLoad
 * @version

 */

@Service
public class A009PageAfterLoad1Service {
	@Autowired
	private A009PageAfterLoad1selectKAISYADao A009PageAfterLoad1selectKAISYADao;

   
	@Log
	public void A009PageAfterLoad1 (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//客先
		String KYAKUSAKI = null;
		List<A009PageAfterLoad1selectKAISYAEntity> A009PageAfterLoad1selectKAISYAList = null;
		
		A009PageAfterLoad1selectKAISYAEntity A009PageAfterLoad1selectKAISYAEntity = null;
		
		int KAISYA_SHIHARAIKIGEN = 0;
		String RYOUSHUUSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RYOUSHUUSHONO")));
		String CHUUMONHIDZUKE1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUMONHIDZUKE1")));
		KYAKUSAKI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KYAKUSAKI")));
		//「領収書NO」が空白場合
		if ((StringUtil.isNullOrBlank(RYOUSHUUSHONO) || StringUtil.changeNullToBlank(RYOUSHUUSHONO).equals("[自動採番]")) ) {
			//データ操作:テーブル「会社」のデータの項目「支払期限」を取得,条件は「会社ID」が画面項目の「客先」と一致
			A009PageAfterLoad1selectKAISYAList = A009PageAfterLoad1selectKAISYADao.A009PageAfterLoad1selectKAISYA(KYAKUSAKI);
			if (A009PageAfterLoad1selectKAISYAList != null && A009PageAfterLoad1selectKAISYAList.size() > 0) {
				A009PageAfterLoad1selectKAISYAEntity = A009PageAfterLoad1selectKAISYAList.get(0);
				if (A009PageAfterLoad1selectKAISYAEntity != null) {
					KAISYA_SHIHARAIKIGEN = A009PageAfterLoad1selectKAISYAEntity.getSHIHARAIKIGEN();
				}
			}
			//「注文日付」が空白ではない場合
			if (!StringUtil.isNullOrBlank(CHUUMONHIDZUKE1)) {
				//「入金予定日付」に画面項目「注文日付」の<支払期限>日後を設定する
				
				//処理終了
			}
			//処理終了
		}

	}
}