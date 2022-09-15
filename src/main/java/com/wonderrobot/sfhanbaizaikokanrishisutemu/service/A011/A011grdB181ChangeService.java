package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
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
import java.text.DecimalFormat;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011grdB181ChangeService
 *      Page: 注文管理詳細
 *      Function: 注文管理詳細grdB18_Change
 * @version

 */

@Service
public class A011grdB181ChangeService {

   
	@Log
	public void A011grdB181Change (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String JPYGOUKEI1 = null;
		String RMBGOUKEI1 = null;
		String USDGOUKEI1 = null;
		int intRow = 0;
		int i = 0;
		String KUBUN = null;
		String KOUMOKU = null;
		String SUURYOU = null;
		String HANBAITANKA = null;
		String KAHEI = null;
		String HANBAIKINGAKU = null;
		String TSUKAMATSUNYUUKINGAKUJPY = null;
		String TSUKAMATSUNYUUKINGAKURMB = null;
		String TSUKAMATSUNYUUKINGAKUUSD = null;
		String grdB18W18 = null;
		String SHUKKOFURAGU = null;
		String grdB18AA18 = null;
		String grdB18AB18 = null;
		String CHUUBUNSHONO2 = null;
		String CHUUBUNSHOMEISAINO = null;
		String sysDate = DateUtil.getDBPatternDate();
		DecimalFormat df;
		//「JPY合計1,RMB合計1,USD合計1」を取得
		JPYGOUKEI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("JPYGOUKEI1")));
		RMBGOUKEI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("RMBGOUKEI1")));
		USDGOUKEI1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("USDGOUKEI1")));
		//Grid「B18」ループ開始
		intRow = StringUtil.getCommaStringToInt(StringUtil.escapeSQLTags(request.getParameter("RowGrid95")));
		for (i = 1;i <= intRow; i++) {
			/* grid loop start */
			if (StringUtil.escapeSQLTags(request.getParameter("Grid95flg" + i)) !=null &&StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("Grid95flg" + i))).equals("0")) {
				continue;
			}
			KUBUN = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].KUBUN"));
			KOUMOKU = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].KOUMOKU"));
			SUURYOU = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].SUURYOU"));
			HANBAITANKA = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].HANBAITANKA"));
			KAHEI = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].KAHEI"));
			HANBAIKINGAKU = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].HANBAIKINGAKU"));
			TSUKAMATSUNYUUKINGAKUJPY = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].TSUKAMATSUNYUUKINGAKUJPY"));
			TSUKAMATSUNYUUKINGAKURMB = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].TSUKAMATSUNYUUKINGAKURMB"));
			TSUKAMATSUNYUUKINGAKUUSD = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].TSUKAMATSUNYUUKINGAKUUSD"));
			grdB18W18 = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].grdB18W18"));
			SHUKKOFURAGU = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].SHUKKOFURAGU"));
			grdB18AA18 = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].grdB18AA18"));
			grdB18AB18 = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].grdB18AB18"));
			CHUUBUNSHONO2 = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].CHUUBUNSHONO2"));
			CHUUBUNSHOMEISAINO = StringUtil.escapeSQLTags(request.getParameter("Grid95["+(i+1)+"].CHUUBUNSHOMEISAINO"));
			//<貨幣>が"0"場合
			if (StringUtil.changeNullToBlank(KAHEI).equals("0")) {
				//変数計算(double,小数点以下第2位を四捨五入):<JPY合計1>=<JPY合計1>+<販売金額>
				JPYGOUKEI1=StringUtil.changeNullToBlank(StringUtil.changeStringToDouble(JPYGOUKEI1)+StringUtil.changeStringToDouble(HANBAIKINGAKU));
				if (!StringUtil.isNullOrBlank(JPYGOUKEI1)) {
					df = new DecimalFormat("#0.00");
					JPYGOUKEI1 = df.format(StringUtil.changeStringToDouble(JPYGOUKEI1));
				}
				//処理終了
			}
			//<貨幣>が"1"場合
			if (StringUtil.changeNullToBlank(KAHEI).equals("1")) {
				//変数計算(double,小数点以下第2位を四捨五入):<RMB合計1>=<RMB合計1>+<販売金額>
				RMBGOUKEI1=StringUtil.changeNullToBlank(StringUtil.changeStringToDouble(RMBGOUKEI1)+StringUtil.changeStringToDouble(HANBAIKINGAKU));
				if (!StringUtil.isNullOrBlank(RMBGOUKEI1)) {
					df = new DecimalFormat("#0.00");
					RMBGOUKEI1 = df.format(StringUtil.changeStringToDouble(RMBGOUKEI1));
				}
				//処理終了
			}
			//<貨幣>が"2"場合
			if (StringUtil.changeNullToBlank(KAHEI).equals("2")) {
				//変数計算(double,小数点以下第2位を四捨五入):<USD合計1>=<USD合計1>+<販売金額>
				USDGOUKEI1=StringUtil.changeNullToBlank(StringUtil.changeStringToDouble(USDGOUKEI1)+StringUtil.changeStringToDouble(HANBAIKINGAKU));
				if (!StringUtil.isNullOrBlank(USDGOUKEI1)) {
					df = new DecimalFormat("#0.00");
					USDGOUKEI1 = df.format(StringUtil.changeStringToDouble(USDGOUKEI1));
				}
				//処理終了
			}
			//グリッドループ終了
		}
		//「JPY合計」に<JPY合計1>を設定する
		jsonObj.setScript("r","SF.setServerExecute(true);$('#JPYGOUKEI').val('" +StringUtil.escapeJSTags(JPYGOUKEI1)+ "');");
		//「RMB合計」に<RMB合計1>を設定する
		jsonObj.setScript("r","SF.setServerExecute(true);$('#RMBGOUKEI').val('" +StringUtil.escapeJSTags(RMBGOUKEI1)+ "');");
		//「USD合計」に<USD合計1>を設定する
		jsonObj.setScript("r","SF.setServerExecute(true);$('#USDGOUKEI').val('" +StringUtil.escapeJSTags(USDGOUKEI1)+ "');");

	}
}