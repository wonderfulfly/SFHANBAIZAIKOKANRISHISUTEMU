package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A006;

import java.util.ArrayList;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006DropDownListOption25I00001Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A006.A006DropDownListOption25I00001Dao;
import java.util.List;
/**
 * @project
 *     null
 * @comment
 *      class: A006DropDownListOptionBean
 *      Page: 
 * @version
 */

@Component
public class A006DropDownListOptionBean {

	@Autowired
	private A006DropDownListOption25I00001Dao A006DropDownListOption25I00001Dao;
	private static A006DropDownListOptionBean InitStaticConstant;

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
			
			if ("A006".equals(pageID)) {
				if ("25".equals(subID)) {
					returnVal = A006TSUKAMATSUNYUUSAKI(selectedVaule);
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

	private String A006TSUKAMATSUNYUUSAKI (String selectedVaule) throws Exception {
		List<A006DropDownListOption25I00001Entity> A006DropDownListOption25I00001EntityList = null;
		StringBuffer sBuffer = null;
		A006DropDownListOption25I00001Entity A006DropDownListOption25I00001Entity = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			
			
			A006DropDownListOption25I00001EntityList = InitStaticConstant.A006DropDownListOption25I00001Dao.I0000125KAISHAIDKAISHAMEIdrp();
			if (A006DropDownListOption25I00001EntityList != null && A006DropDownListOption25I00001EntityList .size() > 0) {
				for (int i = 0; i < A006DropDownListOption25I00001EntityList.size(); i++) {
					A006DropDownListOption25I00001Entity = A006DropDownListOption25I00001EntityList.get(i);
					opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A006DropDownListOption25I00001Entity.getKAISHAID()));
					opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A006DropDownListOption25I00001Entity.getKAISHAMEI()));
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
