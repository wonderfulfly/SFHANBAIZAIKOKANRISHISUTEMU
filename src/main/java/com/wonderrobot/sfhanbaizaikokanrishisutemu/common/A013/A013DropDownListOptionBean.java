package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A013;

import java.util.ArrayList;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013DropDownListOption115SYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013DropDownListOption115SYAINDao;
import java.util.List;
/**
 * @project
 *     null
 * @comment
 *      class: A013DropDownListOptionBean
 *      Page: 
 * @version
 */

@Component
public class A013DropDownListOptionBean {

	@Autowired
	private A013DropDownListOption115SYAINDao A013DropDownListOption115SYAINDao;
	private static A013DropDownListOptionBean InitStaticConstant;

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
			
			if ("P00012".equals(pageID)) {
				if ("115".equals(subID)) {
					returnVal = A013TANTOU(selectedVaule);
				} else if ("121".equals(subID)) {
					returnVal = A013KAHEI(selectedVaule);
				} else if ("101".equals(subID)) {
					returnVal = A013SEISAKUHINKUBUN(selectedVaule);
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

	private String A013TANTOU (String selectedVaule) throws Exception {
		List<A013DropDownListOption115SYAINEntity> A013DropDownListOption115SYAINEntityList = null;
		StringBuffer sBuffer = null;
		A013DropDownListOption115SYAINEntity A013DropDownListOption115SYAINEntity = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			sBuffer.append("<option value =''></option>");
			
			A013DropDownListOption115SYAINEntityList = InitStaticConstant.A013DropDownListOption115SYAINDao.SYAIN115SHAINIDSHAINMEIdrp();
			if (A013DropDownListOption115SYAINEntityList != null && A013DropDownListOption115SYAINEntityList .size() > 0) {
				for (int i = 0; i < A013DropDownListOption115SYAINEntityList.size(); i++) {
					A013DropDownListOption115SYAINEntity = A013DropDownListOption115SYAINEntityList.get(i);
					opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A013DropDownListOption115SYAINEntity.getSHAINID()));
					opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A013DropDownListOption115SYAINEntity.getSHAINMEI()));
					sBuffer.append("<option value ='").append(opValue).append("'");
					if (opValue.equals(selectedVaule)) {
						sBuffer.append("selected");
					}
					sBuffer.append(">");
					sBuffer.append(opText).append("</option>");
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

	private String A013KAHEI (String selectedVaule) throws Exception {
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

	private String A013SEISAKUHINKUBUN (String selectedVaule) throws Exception {
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
			list.add("加工件");
			dropList.add(list);
			list = new ArrayList<String>();
			list.add("1");
			list.add("購入品");
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
