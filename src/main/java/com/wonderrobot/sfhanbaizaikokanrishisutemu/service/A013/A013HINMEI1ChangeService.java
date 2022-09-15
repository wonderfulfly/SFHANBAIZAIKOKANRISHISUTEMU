package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013HINMEI1ChangeselectBUHINSYOUSAIEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013HINMEI1ChangeselectBUHINSYOUSAIDao;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013HINMEI1ChangeService
 *      Page: 部品管理画面
 *      Function: 部品管理画面品名_Change
 * @version

 */

@Service
public class A013HINMEI1ChangeService {
	@Autowired
	private A013HINMEI1ChangeselectBUHINSYOUSAIDao A013HINMEI1ChangeselectBUHINSYOUSAIDao;

   
	@Log
	public void A013HINMEI1Change (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//品名
		String HINMEI = null;
		List<A013HINMEI1ChangeselectBUHINSYOUSAIEntity> A013HINMEI1ChangeselectBUHINSYOUSAIList1 = null;
		int i = 0;
		
		A013HINMEI1ChangeselectBUHINSYOUSAIEntity A013HINMEI1ChangeselectBUHINSYOUSAIEntity = null;
		
		String ay1_BUHINSYOUSAI_KAKOTANKA = null;
		String triggerID = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("triggerID")));
		String row = triggerID.indexOf("_") > 0 ? triggerID.substring(triggerID.lastIndexOf("_") + 1) : "";
		String II = null;
		String sysDate = DateUtil.getDBPatternDate();
		int sysmonth = DateUtil.getMonth();
		int sysyear = DateUtil.getYear();
		HINMEI = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99["+(StringUtil.changeStringToInt(row)-1)+"].HINMEI")));
		//「II」を取得
		II = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("II")));
		//データ操作1:テーブル「部品詳細」のデータの項目「部品詳細.過去単価」を取得,条件は「品名」が「品名」,ソート順「過去単価」,件数範囲「0,3」(ループ開始)
		A013HINMEI1ChangeselectBUHINSYOUSAIList1 = A013HINMEI1ChangeselectBUHINSYOUSAIDao.A013HINMEI1ChangeselectBUHINSYOUSAI(HINMEI);
		if (A013HINMEI1ChangeselectBUHINSYOUSAIList1 != null && A013HINMEI1ChangeselectBUHINSYOUSAIList1.size() > 0) {
			for (i = 0;i < A013HINMEI1ChangeselectBUHINSYOUSAIList1.size();i++) {
				A013HINMEI1ChangeselectBUHINSYOUSAIEntity = A013HINMEI1ChangeselectBUHINSYOUSAIList1.get(i);;
				if (A013HINMEI1ChangeselectBUHINSYOUSAIEntity != null) {
					ay1_BUHINSYOUSAI_KAKOTANKA = StringUtil.changeNullToBlank(A013HINMEI1ChangeselectBUHINSYOUSAIEntity.getKAKOTANKA());
				}
				//<II>が<部品詳細.過去単価>と","の結合文字
				II = ay1_BUHINSYOUSAI_KAKOTANKA + ",";
				//検索結果ループ終了
			}
		}
		//「過去単価」に<II>を設定する
		jsonObj.setScript("r","$('#KAKOTANKA_"+row+"').val('" +II+ "');");

	}
}