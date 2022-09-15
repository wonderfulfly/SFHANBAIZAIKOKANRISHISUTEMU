package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A001;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001BUMONBUMONEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001.A001BUMONBUMONDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001.A001SYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A001.A001SYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A001InitService
 *      Page: 社員
 * @version

 */

@Service
public class A001InitService {
	@Autowired
	private A001BUMONBUMONDao A001BUMONBUMONDao;
	@Autowired
	private A001SYAINDao A001SYAINDao;

   
	@Log
	public void A001BUMONInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A001BUMONBUMONEntity> A001BUMONBUMONEntityList = null;
		StringBuffer sBuffer = null;
		A001BUMONBUMONEntity A001BUMONBUMONEntity = null;
		String opValue = null;
		String opText = null;
		A001BUMONBUMONEntityList = A001BUMONBUMONDao.A001BUMONdrp();
		sBuffer = new StringBuffer();
		
		if (A001BUMONBUMONEntityList != null && A001BUMONBUMONEntityList .size() > 0) {
			for (int i = 0; i < A001BUMONBUMONEntityList.size(); i++) {
				A001BUMONBUMONEntity = A001BUMONBUMONEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A001BUMONBUMONEntity.getBUMONID());
				opText = StringUtil.changeNullToBlank(A001BUMONBUMONEntity.getBUMONMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"BUMON\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A001BUMONInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('BUMON', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	private void A001pageInitValueSetByDefault (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String SHAINID1Default = null;
		//社員ID
		SHAINID1Default = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHAINID1")));
		if (StringUtil.isNullOrBlank(SHAINID1Default)) {
			SHAINID1Default = "[自動採番]";
		}
		jsonObj.setScript("r", "$('#SHAINID1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(SHAINID1Default)) + "');");

	}

   
	@Log
	private void A001pageInitValueSetByDB (List<A001SYAINEntity> A001SYAINEntityList, JSONWFCObject jsonObj) throws Exception {

		A001SYAINEntity A001SYAINEntity = null;
		if (A001SYAINEntityList != null && A001SYAINEntityList.size() == 1) {
			A001SYAINEntity = A001SYAINEntityList.get(0);
		}
		if (A001SYAINEntity != null) {
			jsonObj.setScript("r", "$('#SHAINID1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A001SYAINEntity.getSHAINID())) + "');");
			jsonObj.setScript("r", "$('#SHAINMEI1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A001SYAINEntity.getSHAINMEI())) + "');");
			jsonObj.setScript("r", "$('#DENWABANGOU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A001SYAINEntity.getDENWABANGOU())) + "');");
			jsonObj.setScript("r", "$('#KEITAIBANGOU1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A001SYAINEntity.getKEITAIBANGOU())) + "');");
			jsonObj.setScript("r", "$('#EMAIL1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A001SYAINEntity.getEMAIL())) + "');");
			jsonObj.setScript("r", "$('#LINE1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A001SYAINEntity.getLINE())) + "');");
			A001BUMONInitSelected(A001SYAINEntity.getYUUZAAKENGEN(), jsonObj);
			jsonObj.setScript("r", "SF.setCheckboxCheckedByValue('YUUKOUKUBUN1', '" + StringUtil.changeNullToBlank(A001SYAINEntity.getYUUKOUKUBUN()) + "');");
			jsonObj.setScript("r", "$('#ROGUINID1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A001SYAINEntity.getROGUINID())) + "');");
			jsonObj.setScript("r", "$('#PASUWAADO1').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(A001SYAINEntity.getPASUWAADO())) + "');");
		}

	}

   
	@Log
	public void A001Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		//SHAINID1
		String SHAINID1 = null;
		//ROGUINID1
		String ROGUINID1 = null;
		List<A001SYAINEntity> A001SYAINEntityList = null;
		A001BUMONInit(request, jsonObj);
		A001pageInitValueSetByDefault(request, jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("1".equals(mode)) {
			SHAINID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("SHAINID1")));
			ROGUINID1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("ROGUINID1")));
			A001SYAINEntityList = A001SYAINDao.A001InitDepthZero(SHAINID1, ROGUINID1);
			A001pageInitValueSetByDB(A001SYAINEntityList, jsonObj);
		}

	}
}