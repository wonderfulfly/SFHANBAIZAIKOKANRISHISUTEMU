package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A004;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004.A004KAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004KAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A004InitService
 *      Page: 会社
 * @version

 */

@Service
public class A004InitService {
	@Autowired
	private A004KAISYADao A004KAISYADao;

   
	@Log
	private void A004KAISHAKUBUN1Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String opValue = null;
		String opText = null;
		
		opValue = StringUtil.changeNullToBlank("0");
		opText = StringUtil.changeNullToBlank("客先");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		opValue = StringUtil.changeNullToBlank("1");
		opText = StringUtil.changeNullToBlank("仕入先");
		sBuffer.append(opValue).append("#").append(opText).append(",");
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KAISHAKUBUN1\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A004KAISHAKUBUN1InitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KAISHAKUBUN1', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A004pageInitValueSetByDefault (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String KAISHAID1Default = null;
		//会社ID
		KAISHAID1Default = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAISHAID1")));
		if (StringUtil.isNullOrBlank(KAISHAID1Default)) {
			KAISHAID1Default = "[自動採番]";
		}
		jsonObj.setScript("r", "$('#KAISHAID1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(KAISHAID1Default)) + "');");

	}

   
	@Log
	private void A004pageInitValueSetByDB (List<A004KAISYAEntity> A004KAISYAEntityList, JSONWFCObject jsonObj) throws Exception {

		A004KAISYAEntity A004KAISYAEntity = null;
		if (A004KAISYAEntityList != null && A004KAISYAEntityList.size() == 1) {
			A004KAISYAEntity = A004KAISYAEntityList.get(0);
		}
		if (A004KAISYAEntity != null) {
			jsonObj.setScript("r", "$('#KAISHAID1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A004KAISYAEntity.getKAISHAID())) + "');");
			jsonObj.setScript("r", "$('#KAISHAMEI1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A004KAISYAEntity.getKAISHAMEI())) + "');");
			jsonObj.setScript("r", "$('#KAISHARYAKUSHOU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A004KAISYAEntity.getKAISHARYAKUSHOU())) + "');");
			jsonObj.setScript("r", "$('#ADORESU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A004KAISYAEntity.getADORESU())) + "');");
			jsonObj.setScript("r", "$('#RENRAKUSAKI1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A004KAISYAEntity.getRENRAKUSAKI())) + "');");
			jsonObj.setScript("r", "$('#SHIHARAIKIGEN1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(StringUtil.ChangeIntToString(A004KAISYAEntity.getSHIHARAIKIGEN()))) + "');");
			A004KAISHAKUBUN1InitSelected(A004KAISYAEntity.getKAISHAKUBUN(), jsonObj);
		}

	}

   
	@Log
	public void A004Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		//KAISHAID1
		String KAISHAID1 = null;
		List<A004KAISYAEntity> A004KAISYAEntityList = null;
		A004KAISHAKUBUN1Init(request, jsonObj);
		A004pageInitValueSetByDefault(request, jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("1".equals(mode)) {
			KAISHAID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("KAISHAID1")));
			A004KAISYAEntityList = A004KAISYADao.A004InitDepthZero(KAISHAID1);
			A004pageInitValueSetByDB(A004KAISYAEntityList, jsonObj);
		}

	}
}