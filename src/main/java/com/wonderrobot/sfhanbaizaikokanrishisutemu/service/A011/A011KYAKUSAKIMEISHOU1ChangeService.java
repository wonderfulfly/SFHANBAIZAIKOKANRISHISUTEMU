package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A011KYAKUSAKIMEISHOU1ChangeService
 *      Page: 注文管理詳細
 *      Function: 注文管理詳細客先名称_Change
 * @version

 */

@Service
public class A011KYAKUSAKIMEISHOU1ChangeService {
	@Autowired
	private A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao;

   
	@Log
	public void A011KYAKUSAKIMEISHOU1Change (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//客先名称
		String KYAKUSAKIMEISHOU = null;
		List<A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity> A011KYAKUSAKIMEISHOU1ChangeselectKAISYAList = null;
		
		A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity = null;
		
		String KAISYA_ADORESU = null;
		
		String KAISYA_RENRAKUSAKI = null;
		KYAKUSAKIMEISHOU = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KYAKUSAKIMEISHOU")));
		//データ操作:テーブル「会社」のデータの項目「アドレス,連絡先」を取得,条件は「会社ID」が「客先名称」
		A011KYAKUSAKIMEISHOU1ChangeselectKAISYAList = A011KYAKUSAKIMEISHOU1ChangeselectKAISYADao.A011KYAKUSAKIMEISHOU1ChangeselectKAISYA(KYAKUSAKIMEISHOU);
		if (A011KYAKUSAKIMEISHOU1ChangeselectKAISYAList != null && A011KYAKUSAKIMEISHOU1ChangeselectKAISYAList.size() > 0) {
			A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity = A011KYAKUSAKIMEISHOU1ChangeselectKAISYAList.get(0);
			if (A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity != null) {
				KAISYA_ADORESU = StringUtil.changeNullToBlank(A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity.getADORESU());
				KAISYA_RENRAKUSAKI = StringUtil.changeNullToBlank(A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity.getRENRAKUSAKI());
			}
		}
		//「アドレス」に<アドレス>を設定する
		jsonObj.setScript("r","SF.setServerExecute(true);$('#ADORESU1').val('" +StringUtil.escapeJSTags(KAISYA_ADORESU)+ "');");
		//「電話番号」に<連絡先>を設定する
		jsonObj.setScript("r","SF.setServerExecute(true);$('#DENWABANGOU1').val('" +StringUtil.escapeJSTags(KAISYA_RENRAKUSAKI)+ "');");

	}
}