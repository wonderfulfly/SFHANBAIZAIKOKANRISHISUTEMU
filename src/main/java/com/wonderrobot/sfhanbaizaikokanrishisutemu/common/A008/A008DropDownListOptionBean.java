package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A008;

import java.util.ArrayList;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008DropDownListOption31SYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008DropDownListOption31SYAINDao;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008DropDownListOption25KAISYAEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A008.A008DropDownListOption25KAISYADao;
/**
 * @project
 *     null
 * @comment
 *      class: A008DropDownListOptionBean
 *      Page: 
 * @version
 */

@Component
public class A008DropDownListOptionBean {

	@Autowired
	private A008DropDownListOption31SYAINDao A008DropDownListOption31SYAINDao;
	@Autowired
	private A008DropDownListOption25KAISYADao A008DropDownListOption25KAISYADao;
	private static A008DropDownListOptionBean InitStaticConstant;

	@PostConstruct
	private void init() {
		InitStaticConstant = this;
	}

	/**
	 * ドロップダウンリストのオプションを取得する
	 * 
	 * @param pageID
	 * @param subID
	 * @param selectedVaule
	 * @return returnVal
	 * @throws Exception
	 */

	public String getDropDownListOptions(String pageID, String subID, String selectedVaule) throws Exception {
		String returnVal = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			if ("P00010".equals(pageID)) {
				if ("31".equals(subID)) {
					returnVal = A008TANTOUSHAID(selectedVaule);
				} else if ("25".equals(subID)) {
					returnVal = A008KYAKUSAKIID(selectedVaule);
				}
			}
			return returnVal;
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
	}

	/**
	 * ドロップダウンリストに値を付ける
	 * 
	 * @param selectedVaule
	 * @return returnVal
	 * @throws Exception
	 */

	private String A008TANTOUSHAID (String selectedVaule) throws Exception {
		List<A008DropDownListOption31SYAINEntity> A008DropDownListOption31SYAINEntityList = null;
		StringBuffer sBuffer = null;
		A008DropDownListOption31SYAINEntity A008DropDownListOption31SYAINEntity = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			
			
			A008DropDownListOption31SYAINEntityList = InitStaticConstant.A008DropDownListOption31SYAINDao.SYAIN31SHAINIDSHAINMEIdrp();
			if (A008DropDownListOption31SYAINEntityList != null && A008DropDownListOption31SYAINEntityList .size() > 0) {
				for (int i = 0; i < A008DropDownListOption31SYAINEntityList.size(); i++) {
					A008DropDownListOption31SYAINEntity = A008DropDownListOption31SYAINEntityList.get(i);
					opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A008DropDownListOption31SYAINEntity.getSHAINID()));
					opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A008DropDownListOption31SYAINEntity.getSHAINMEI()));
					if (opValue.equals(selectedVaule)) {
						return opText;
					}
				}
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
		return sBuffer.toString();
	}
	/**
	 * ドロップダウンリストに値を付ける
	 * 
	 * @param selectedVaule
	 * @return returnVal
	 * @throws Exception
	 */

	private String A008KYAKUSAKIID (String selectedVaule) throws Exception {
		List<A008DropDownListOption25KAISYAEntity> A008DropDownListOption25KAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A008DropDownListOption25KAISYAEntity A008DropDownListOption25KAISYAEntity = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			
			
			A008DropDownListOption25KAISYAEntityList = InitStaticConstant.A008DropDownListOption25KAISYADao.KAISYA25KAISHAIDKAISHAMEIdrp();
			if (A008DropDownListOption25KAISYAEntityList != null && A008DropDownListOption25KAISYAEntityList .size() > 0) {
				for (int i = 0; i < A008DropDownListOption25KAISYAEntityList.size(); i++) {
					A008DropDownListOption25KAISYAEntity = A008DropDownListOption25KAISYAEntityList.get(i);
					opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A008DropDownListOption25KAISYAEntity.getKAISHAID()));
					opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A008DropDownListOption25KAISYAEntity.getKAISHAMEI()));
					if (opValue.equals(selectedVaule)) {
						return opText;
					}
				}
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
		return sBuffer.toString();
	}
}
