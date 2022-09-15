package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A011;

import java.util.ArrayList;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
/**
 * @project
 *     null
 * @comment
 *      class: A011DropDownListOptionBean
 *      Page: 
 * @version
 */

@Component
public class A011DropDownListOptionBean {

	private static A011DropDownListOptionBean InitStaticConstant;

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
			
			if ("P00013".equals(pageID)) {
				if ("105".equals(subID)) {
					returnVal = A011KAHEI(selectedVaule);
				} else if ("97".equals(subID)) {
					returnVal = A011KUBUN(selectedVaule);
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

	private String A011KAHEI (String selectedVaule) throws Exception {
		ArrayList<ArrayList<String>> dropList = null;
		ArrayList<String> list = null;
		StringBuffer sBuffer = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			sBuffer.append("<option value =''></option>");
			
			dropList = new ArrayList<ArrayList<String>>();
			list = new ArrayList<String>();
			list.add("0");
			list.add("JPY");
			dropList.add(list);
			list = new ArrayList<String>();
			list.add("1");
			list.add("RMB");
			dropList.add(list);
			list = new ArrayList<String>();
			list.add("2");
			list.add("USD");
			dropList.add(list);
			for (int i = 0; i < dropList.size(); i++) {
				list = dropList.get(i);
				opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(list.get(0)));
				opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(list.get(1)));
				sBuffer.append("<option value ='").append(opValue).append("'");
				if (opValue.equals(selectedVaule)) {
					sBuffer.append("selected");
				}
				sBuffer.append(">");
				sBuffer.append(opText).append("</option>");
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

	private String A011KUBUN (String selectedVaule) throws Exception {
		ArrayList<ArrayList<String>> dropList = null;
		ArrayList<String> list = null;
		StringBuffer sBuffer = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			sBuffer.append("<option value =''></option>");
			
			dropList = new ArrayList<ArrayList<String>>();
			list = new ArrayList<String>();
			list.add("0");
			list.add("項目");
			dropList.add(list);
			list = new ArrayList<String>();
			list.add("1");
			list.add("人件費");
			dropList.add(list);
			list = new ArrayList<String>();
			list.add("2");
			list.add("運送費");
			dropList.add(list);
			for (int i = 0; i < dropList.size(); i++) {
				list = dropList.get(i);
				opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(list.get(0)));
				opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(list.get(1)));
				sBuffer.append("<option value ='").append(opValue).append("'");
				if (opValue.equals(selectedVaule)) {
					sBuffer.append("selected");
				}
				sBuffer.append(">");
				sBuffer.append(opText).append("</option>");
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
