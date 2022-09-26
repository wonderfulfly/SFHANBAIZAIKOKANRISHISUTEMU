package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A015;

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
 *      class: A015DropDownListOptionBean
 *      Page: 
 * @version
 */

@Component
public class A015DropDownListOptionBean {

	private static A015DropDownListOptionBean InitStaticConstant;

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
			
			if ("A015".equals(pageID)) {
				if ("27".equals(subID)) {
					returnVal = A015KAISHAKUBUN(selectedVaule);
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

	private String A015KAISHAKUBUN (String selectedVaule) throws Exception {
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
			list.add("客先");
			dropList.add(list);
			list = new ArrayList<String>();
			list.add("1");
			list.add("仕入先");
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
