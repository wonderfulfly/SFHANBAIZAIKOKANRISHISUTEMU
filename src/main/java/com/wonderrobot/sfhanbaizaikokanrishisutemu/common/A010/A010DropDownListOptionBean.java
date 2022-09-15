package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A010;

import java.util.ArrayList;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010DropDownListOption55KAISYAEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010DropDownListOption55KAISYADao;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010DropDownListOption59SYAINEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010DropDownListOption59SYAINDao;
/**
 * @project
 *     null
 * @comment
 *      class: A010DropDownListOptionBean
 *      Page: 
 * @version
 */

@Component
public class A010DropDownListOptionBean {

	@Autowired
	private A010DropDownListOption55KAISYADao A010DropDownListOption55KAISYADao;
	@Autowired
	private A010DropDownListOption59SYAINDao A010DropDownListOption59SYAINDao;
	private static A010DropDownListOptionBean InitStaticConstant;

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
				if ("55".equals(subID)) {
					returnVal = A010KYAKUSAKIID1(selectedVaule);
				} else if ("57".equals(subID)) {
					returnVal = A010SHUTSUNYUUKOFURAGU(selectedVaule);
				} else if ("59".equals(subID)) {
					returnVal = A010TANTOUSHAID1(selectedVaule);
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

	private String A010KYAKUSAKIID1 (String selectedVaule) throws Exception {
		List<A010DropDownListOption55KAISYAEntity> A010DropDownListOption55KAISYAEntityList = null;
		StringBuffer sBuffer = null;
		A010DropDownListOption55KAISYAEntity A010DropDownListOption55KAISYAEntity = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			
			
			A010DropDownListOption55KAISYAEntityList = InitStaticConstant.A010DropDownListOption55KAISYADao.KAISYA55KAISHAIDKAISHAMEIdrp();
			if (A010DropDownListOption55KAISYAEntityList != null && A010DropDownListOption55KAISYAEntityList .size() > 0) {
				for (int i = 0; i < A010DropDownListOption55KAISYAEntityList.size(); i++) {
					A010DropDownListOption55KAISYAEntity = A010DropDownListOption55KAISYAEntityList.get(i);
					opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A010DropDownListOption55KAISYAEntity.getKAISHAID()));
					opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A010DropDownListOption55KAISYAEntity.getKAISHAMEI()));
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

	private String A010SHUTSUNYUUKOFURAGU (String selectedVaule) throws Exception {
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
			list.add("2");
			list.add("出庫済み");
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
	/**
	 * ドロップダウンリストに値を付ける
	 * 
	 * @param selectedVaule
	 * @return returnVal
	 * @throws Exception
	 */

	private String A010TANTOUSHAID1 (String selectedVaule) throws Exception {
		List<A010DropDownListOption59SYAINEntity> A010DropDownListOption59SYAINEntityList = null;
		StringBuffer sBuffer = null;
		A010DropDownListOption59SYAINEntity A010DropDownListOption59SYAINEntity = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			
			
			A010DropDownListOption59SYAINEntityList = InitStaticConstant.A010DropDownListOption59SYAINDao.SYAIN59SHAINIDSHAINMEIdrp();
			if (A010DropDownListOption59SYAINEntityList != null && A010DropDownListOption59SYAINEntityList .size() > 0) {
				for (int i = 0; i < A010DropDownListOption59SYAINEntityList.size(); i++) {
					A010DropDownListOption59SYAINEntity = A010DropDownListOption59SYAINEntityList.get(i);
					opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A010DropDownListOption59SYAINEntity.getSHAINID()));
					opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A010DropDownListOption59SYAINEntity.getSHAINMEI()));
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
