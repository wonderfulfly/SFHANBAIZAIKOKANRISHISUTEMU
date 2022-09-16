package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A008;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008KYAKUSAKIKAISYAEntity;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008KYAKUSAKIKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008TANTOUSHAIDSYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008TANTOUSHAIDSYAINDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008KYAKUSAKIIDKAISYAEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008KYAKUSAKIIDKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A008.A008GridDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A008InitService
 *      Page: 入金管理検索
 * @version

 */

@Service
public class A008InitService {
	@Autowired
	private A008KYAKUSAKIKAISYADao A008KYAKUSAKIKAISYADao;
	@Autowired
	private A008TANTOUSHAIDSYAINDao A008TANTOUSHAIDSYAINDao;
	@Autowired
	private A008KYAKUSAKIIDKAISYADao A008KYAKUSAKIIDKAISYADao;

   
	@Log
	public void A008KYAKUSAKIInit (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		List<A008KYAKUSAKIKAISYAEntity> A008KYAKUSAKIKAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A008KYAKUSAKIKAISYAEntity A008KYAKUSAKIKAISYAEntity = null;
		String opValue = null;
		String opText = null;
		A008KYAKUSAKIKAISYAEntityList = A008KYAKUSAKIKAISYADao.A008KYAKUSAKIdrp();
		sBuffer = new StringBuffer();
		
		if (A008KYAKUSAKIKAISYAEntityList != null && A008KYAKUSAKIKAISYAEntityList .size() > 0) {
			for (int i = 0; i < A008KYAKUSAKIKAISYAEntityList.size(); i++) {
				A008KYAKUSAKIKAISYAEntity = A008KYAKUSAKIKAISYAEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A008KYAKUSAKIKAISYAEntity.getKAISHAID());
				opText = StringUtil.changeNullToBlank(A008KYAKUSAKIKAISYAEntity.getKAISHAMEI());
				sBuffer.append(opValue).append("#").append(opText).append(",");
			}
		}
		jsonObj.setScript("r", "SF.resetDropDownOptionsValue(\"KYAKUSAKI\", \""+sBuffer.toString()+"\");");

	}

   
	@Log
	private void A008KYAKUSAKIInitSelected (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		jsonObj.setScript("r", "SF.setComboboxValue('KYAKUSAKI', '" + StringUtil.changeNullToBlank(selectedVaule) + "');");

	}

   
	@Log
	public void A008TANTOUSHAIDInit (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		List<A008TANTOUSHAIDSYAINEntity> A008TANTOUSHAIDSYAINEntityList = null;
		StringBuffer sBuffer = null;
		A008TANTOUSHAIDSYAINEntity A008TANTOUSHAIDSYAINEntity = null;
		String opValue = null;
		String opText = null;
		String selectedShowText= "";
		A008TANTOUSHAIDSYAINEntityList = A008TANTOUSHAIDSYAINDao.A008TANTOUSHAIDdrp();
		sBuffer = new StringBuffer();
		
		if (A008TANTOUSHAIDSYAINEntityList != null && A008TANTOUSHAIDSYAINEntityList .size() > 0) {
			for (int i = 0; i < A008TANTOUSHAIDSYAINEntityList.size(); i++) {
				A008TANTOUSHAIDSYAINEntity = A008TANTOUSHAIDSYAINEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A008TANTOUSHAIDSYAINEntity.getSHAINID());
				opText = StringUtil.changeNullToBlank(A008TANTOUSHAIDSYAINEntity.getSHAINMEI());
				if (opValue.equals(selectedVaule)) {
					selectedShowText = opText;
				}
			}
		}
		jsonObj.setScript("r", "$('#showTANTOUSHAID').html('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedShowText)) + "');$('#TANTOUSHAID').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedVaule)) + "');");

	}

   
	@Log
	public void A008KYAKUSAKIIDInit (String selectedVaule, JSONWFCObject jsonObj) throws Exception {

		List<A008KYAKUSAKIIDKAISYAEntity> A008KYAKUSAKIIDKAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A008KYAKUSAKIIDKAISYAEntity A008KYAKUSAKIIDKAISYAEntity = null;
		String opValue = null;
		String opText = null;
		String selectedShowText= "";
		A008KYAKUSAKIIDKAISYAEntityList = A008KYAKUSAKIIDKAISYADao.A008KYAKUSAKIIDdrp();
		sBuffer = new StringBuffer();
		
		if (A008KYAKUSAKIIDKAISYAEntityList != null && A008KYAKUSAKIIDKAISYAEntityList .size() > 0) {
			for (int i = 0; i < A008KYAKUSAKIIDKAISYAEntityList.size(); i++) {
				A008KYAKUSAKIIDKAISYAEntity = A008KYAKUSAKIIDKAISYAEntityList.get(i);
				opValue = StringUtil.changeNullToBlank(A008KYAKUSAKIIDKAISYAEntity.getKAISHAID());
				opText = StringUtil.changeNullToBlank(A008KYAKUSAKIIDKAISYAEntity.getKAISHAMEI());
				if (opValue.equals(selectedVaule)) {
					selectedShowText = opText;
				}
			}
		}
		jsonObj.setScript("r", "$('#showKYAKUSAKIID').html('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedShowText)) + "');$('#KYAKUSAKIID').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(selectedVaule)) + "');");

	}

   
	@Log
	private void A008pageInitValueSetByDefault (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String MINYUUKINDefault = null;
		//未入金
		MINYUUKINDefault = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("MINYUUKIN")));
		if (StringUtil.isNullOrBlank(MINYUUKINDefault)) {
			MINYUUKINDefault = "1";
		}
		jsonObj.setScript("r", "$('#MINYUUKIN').val('" + StringUtil.escapeJSTags(StringUtil.changeNullToBlank(MINYUUKINDefault)) + "');");

	}

   
	@Log
	private void A008grdB8pageInitGrid (JSONWFCObject jsonObj, HttpServletRequest request) throws Exception {

		String returnVal = null;
		
		returnVal = A008GridDataConstant.getGridStrSet(null, "A008", "23", 0, 1);
		jsonObj.setScript("r", "setGrid23();$('div#_ingrid_Grid23_0_b').find('input:button').button();setCalendar();");
		jsonObj.setHtml("dragB23", returnVal);
		jsonObj.setReturnID("h", "dragB23");
		
		A008GridDataConstant.setGridDataToSession("A008", "23", null, request);

	}

   
	@Log
	public void A008Init (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//mode
		String mode = null;
		A008KYAKUSAKIInit(request, jsonObj);
		A008TANTOUSHAIDInit("", jsonObj);
		A008KYAKUSAKIIDInit("", jsonObj);
		A008pageInitValueSetByDefault(request, jsonObj);
		mode = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("mode")));
		if ("".equals(mode) || StringUtil.isNullOrBlank(mode)) {
			mode = "1";
		}
		if ("1".equals(mode)) {
			A008grdB8pageInitGrid(jsonObj, request);
		}
		jsonObj.setScript("r", "A008PageAfterLoad1();");

	}
}