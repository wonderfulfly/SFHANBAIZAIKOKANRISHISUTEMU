package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A009;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009PageAfterSave1selectNYUKINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009PageAfterSave1selectNYUKINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A009.A009PageAfterSave1updateTYUMONSYODao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A009PageAfterSave1Service
 *      Page: 入金管理詳細
 *      Function: 入金管理詳細PageAfterSave
 * @version

 */

@Service
public class A009PageAfterSave1Service {
	@Autowired
	private A009PageAfterSave1selectNYUKINDao A009PageAfterSave1selectNYUKINDao;
	@Autowired
	private A009PageAfterSave1updateTYUMONSYODao A009PageAfterSave1updateTYUMONSYODao;

   @Transactional(rollbackFor=Exception.class)
	@Log
	public void A009PageAfterSave1 (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//注文書NO
		String CHUUBUNSHONO1 = null;
		List<A009PageAfterSave1selectNYUKINEntity> A009PageAfterSave1selectNYUKINList1 = null;
		
		A009PageAfterSave1selectNYUKINEntity A009PageAfterSave1selectNYUKINEntity = null;
		
		String ay1_NYUKIN_RESHIITONO = null;
		int A009PageAfterSave1updateTYUMONSYOList = 0;
		CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
		//データ操作1:テーブル「入金」の項目「レシートNO」を取得,条件は「注文書NO」が画面項目「注文書NO」
		A009PageAfterSave1selectNYUKINList1 = A009PageAfterSave1selectNYUKINDao.A009PageAfterSave1selectNYUKIN(CHUUBUNSHONO1);
		if (A009PageAfterSave1selectNYUKINList1 != null && A009PageAfterSave1selectNYUKINList1.size() > 0) {
			A009PageAfterSave1selectNYUKINEntity = A009PageAfterSave1selectNYUKINList1.get(0);
			if (A009PageAfterSave1selectNYUKINEntity != null) {
				ay1_NYUKIN_RESHIITONO = StringUtil.changeNullToBlank(A009PageAfterSave1selectNYUKINEntity.getRESHIITONO());
			}
		}
		//データ操作2:テーブル「注文書」の項目「注文書NO」が値「注文書No」のデータに対して,項目「レシートNO」を<レシートNO>に変更する
		A009PageAfterSave1updateTYUMONSYOList = A009PageAfterSave1updateTYUMONSYODao.A009PageAfterSave1updateTYUMONSYO(ay1_NYUKIN_RESHIITONO, CHUUBUNSHONO1);

	}
}