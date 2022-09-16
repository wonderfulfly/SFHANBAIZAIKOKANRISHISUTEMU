package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A007;

import java.util.ArrayList;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007DropDownListOption29KAISYAEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A007.A007DropDownListOption29KAISYADao;
import java.util.List;
/**
 * @project
 *     null
 * @comment
 *      class: A007DropDownListOptionBean
 *      Page: 
 * @version
 */

@Component
public class A007DropDownListOptionBean {

	@Autowired
	private A007DropDownListOption29KAISYADao A007DropDownListOption29KAISYADao;
	private static A007DropDownListOptionBean InitStaticConstant;

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
			
			if ("A007".equals(pageID)) {
				if ("29".equals(subID)) {
					returnVal = A007TSUKAMATSUNYUUSAKI(selectedVaule);
				} else if ("39".equals(subID)) {
					returnVal = A007SHUTSUNYUUKOJOUTAI(selectedVaule);
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

	private String A007TSUKAMATSUNYUUSAKI (String selectedVaule) throws Exception {
		List<A007DropDownListOption29KAISYAEntity> A007DropDownListOption29KAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A007DropDownListOption29KAISYAEntity A007DropDownListOption29KAISYAEntity = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			
			
			A007DropDownListOption29KAISYAEntityList = InitStaticConstant.A007DropDownListOption29KAISYADao.KAISYA29KAISHAIDKAISHAMEIdrp();
			if (A007DropDownListOption29KAISYAEntityList != null && A007DropDownListOption29KAISYAEntityList .size() > 0) {
				for (int i = 0; i < A007DropDownListOption29KAISYAEntityList.size(); i++) {
					A007DropDownListOption29KAISYAEntity = A007DropDownListOption29KAISYAEntityList.get(i);
					opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A007DropDownListOption29KAISYAEntity.getKAISHAID()));
					opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A007DropDownListOption29KAISYAEntity.getKAISHAMEI()));
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

	private String A007SHUTSUNYUUKOJOUTAI (String selectedVaule) throws Exception {
		ArrayList<ArrayList<String>> dropList = null;
		ArrayList<String> list = null;
		StringBuffer sBuffer = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			
			
			dropList = new ArrayList<ArrayList<String>>();
			list = new ArrayList<String>();
			list.add("0");
			list.add("未入庫");
			dropList.add(list);
			list = new ArrayList<String>();
			list.add("1");
			list.add("入庫済み");
			dropList.add(list);
			list = new ArrayList<String>();
			list.add("2");
			list.add("出庫");
			dropList.add(list);
			for (int i = 0; i < dropList.size(); i++) {
				list = dropList.get(i);
				opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(list.get(0)));
				opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(list.get(1)));
				if (opValue.equals(selectedVaule)) {
					return opText;
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
