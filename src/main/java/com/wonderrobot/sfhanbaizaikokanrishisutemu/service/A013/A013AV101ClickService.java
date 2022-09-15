package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013AV101ClickselectSYAINEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013AV101ClickselectSYAINDao;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013AV101ClickselectBUMONEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013AV101ClickselectBUMONDao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.util.RequestUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013AV101ClickService
 *      Page: 部品管理画面
 *      Function: 部品管理画面確定権限制限_Click
 * @version

 */

@Service
public class A013AV101ClickService {
	@Autowired
	private A013AV101ClickselectSYAINDao A013AV101ClickselectSYAINDao;
	@Autowired
	private A013AV101ClickselectBUMONDao A013AV101ClickselectBUMONDao;

   
	@Log
	public void A013AV101Click (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//ログインID
		String ROGUINID = null;
		List<A013AV101ClickselectSYAINEntity> A013AV101ClickselectSYAINList1 = null;
		
		A013AV101ClickselectSYAINEntity A013AV101ClickselectSYAINEntity = null;
		
		String ay1_SYAIN_YUUZAAKENGEN = null;
		List<A013AV101ClickselectBUMONEntity> A013AV101ClickselectBUMONList2 = null;
		
		A013AV101ClickselectBUMONEntity A013AV101ClickselectBUMONEntity = null;
		
		String ay2_BUMON_BUMONMEI = null;
		String sysDate = DateUtil.getDBPatternDate();
		String loginID = (String) request.getSession().getAttribute("USER_ID");
		String row = request.getParameter("RowGrid99");
		int intRow = 0;
		int i = 0;
		String SEISAKUHINKUBUN = null;
		String HINBANNO1 = null;
		String HINMEI = null;
		String KOSUU = null;
		String SOUKOSUU = null;
		String TSUKAMATSUNYUUSAKI = null;
		String KIBOUNOUKI = null;
		String TANTOU = null;
		String TEHAISAKI = null;
		String KOUNYUUTANKA = null;
		String KAHEI = null;
		String TEHAIBI = null;
		String NYUUKABI = null;
		String SHOUKEI = null;
		String KAKOTANKA = null;
		String grdB16AC16 = null;
		String CHUUBUNSHOMEISAINO1 = null;
		String CHUUBUNSHONO1 = null;
		String KIBOUTANKA = null;
		String NYUUKAYOTEIBI = null;
		String HINBANNO = null;
		String KAKUTEIKUBUN2 = null;
		String KOUJIKANRIBANGOU2 = null;
		ROGUINID = loginID;
		//データ操作1:テーブル「社員」のデータの項目「ユーザー権限」を取得,条件は「ログインID」がログインID
		A013AV101ClickselectSYAINList1 = A013AV101ClickselectSYAINDao.A013AV101ClickselectSYAIN(ROGUINID);
		if (A013AV101ClickselectSYAINList1 != null && A013AV101ClickselectSYAINList1.size() > 0) {
			A013AV101ClickselectSYAINEntity = A013AV101ClickselectSYAINList1.get(0);
			if (A013AV101ClickselectSYAINEntity != null) {
				ay1_SYAIN_YUUZAAKENGEN = StringUtil.changeNullToBlank(A013AV101ClickselectSYAINEntity.getYUUZAAKENGEN());
			}
		}
		//データ操作2:テーブル「M_部門」のデータの項目「部門名」を取得,条件は「部門ID」が<ユーザー権限>
		A013AV101ClickselectBUMONList2 = A013AV101ClickselectBUMONDao.A013AV101ClickselectBUMON(ay1_SYAIN_YUUZAAKENGEN);
		if (A013AV101ClickselectBUMONList2 != null && A013AV101ClickselectBUMONList2.size() > 0) {
			A013AV101ClickselectBUMONEntity = A013AV101ClickselectBUMONList2.get(0);
			if (A013AV101ClickselectBUMONEntity != null) {
				ay2_BUMON_BUMONMEI = StringUtil.changeNullToBlank(A013AV101ClickselectBUMONEntity.getBUMONMEI());
			}
		}
		//<部門名>が空白,又は<部門名>が"営業部門長",又は<部門名>が"営業",又は<部門名>が"設計",又は<部門名>が"財務"場合
		if (StringUtil.isNullOrBlank(ay2_BUMON_BUMONMEI) || StringUtil.changeNullToBlank(ay2_BUMON_BUMONMEI).equals("営業部門長") || StringUtil.changeNullToBlank(ay2_BUMON_BUMONMEI).equals("営業") || StringUtil.changeNullToBlank(ay2_BUMON_BUMONMEI).equals("設計") || StringUtil.changeNullToBlank(ay2_BUMON_BUMONMEI).equals("財務")) {
			//「保存」ボタンを入力不可にする
			jsonObj.setScript("r","SF.setDisabled('W10',true);");
			//「確定」ボタンを入力不可にする
			jsonObj.setScript("r","SF.setDisabled('grdB16AC16_"+row+"',true);");
			//Grid「B16」ループ開始
			intRow = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid99")));
			for (i = 1;i <= intRow; i++) {
				/* grid loop start */
				if (StringUtil.escapeSQLTags(request.getParameter("Grid99flg" + i)) !=null &&StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid99flg" + i))).equals("0")) {
					continue;
				}
				SEISAKUHINKUBUN = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].SEISAKUHINKUBUN"));
				HINBANNO1 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].HINBANNO1"));
				HINMEI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].HINMEI"));
				KOSUU = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KOSUU"));
				SOUKOSUU = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].SOUKOSUU"));
				TSUKAMATSUNYUUSAKI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TSUKAMATSUNYUUSAKI"));
				KIBOUNOUKI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KIBOUNOUKI"));
				TANTOU = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TANTOU"));
				TEHAISAKI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TEHAISAKI"));
				KOUNYUUTANKA = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KOUNYUUTANKA"));
				KAHEI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KAHEI"));
				TEHAIBI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].TEHAIBI"));
				NYUUKABI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].NYUUKABI"));
				SHOUKEI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].SHOUKEI"));
				KAKOTANKA = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KAKOTANKA"));
				grdB16AC16 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].grdB16AC16"));
				CHUUBUNSHOMEISAINO1 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].CHUUBUNSHOMEISAINO1"));
				CHUUBUNSHONO1 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].CHUUBUNSHONO1"));
				KIBOUTANKA = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KIBOUTANKA"));
				NYUUKAYOTEIBI = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].NYUUKAYOTEIBI"));
				HINBANNO = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].HINBANNO"));
				KAKUTEIKUBUN2 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KAKUTEIKUBUN2"));
				KOUJIKANRIBANGOU2 = StringUtil.escapeSQLTags(request.getParameter("Grid99["+(i+1)+"].KOUJIKANRIBANGOU2"));
				//「確定」ボタンを入力不可にする
				jsonObj.setScript("r","SF.setDisabled('grdB16AC16_"+row+"',true);");
				//グリッドループ終了
			}
			//処理終了
		}

	}
}