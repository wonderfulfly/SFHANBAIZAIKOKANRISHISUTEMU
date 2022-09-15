package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A002;

import java.util.ArrayList;
import com.wonderfulfly.core.util.StringUtil;
import com.wonderfulfly.core.util.log.LoggerUtil;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002DropDownListOption27BUMONEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A002.A002DropDownListOption27BUMONDao;
import java.util.List;
/**
 * @project
 *     null
 * @comment
 *      class: A002DropDownListOptionBean
 *      Page: 
 * @version
 */

@Component
public class A002DropDownListOptionBean {

	@Autowired
	private A002DropDownListOption27BUMONDao A002DropDownListOption27BUMONDao;
	private static A002DropDownListOptionBean InitStaticConstant;

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
			
			if ("P00002".equals(pageID)) {
				if ("27".equals(subID)) {
					returnVal = A002YUUZAAKENGEN(selectedVaule);
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

	private String A002YUUZAAKENGEN (String selectedVaule) throws Exception {
		List<A002DropDownListOption27BUMONEntity> A002DropDownListOption27BUMONEntityList = null;
		StringBuffer sBuffer = null;
		A002DropDownListOption27BUMONEntity A002DropDownListOption27BUMONEntity = null;
		String opValue = null;
		String opText = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			sBuffer = new StringBuffer();
			
			
			A002DropDownListOption27BUMONEntityList = InitStaticConstant.A002DropDownListOption27BUMONDao.BUMON27BUMONIDBUMONMEIdrp();
			if (A002DropDownListOption27BUMONEntityList != null && A002DropDownListOption27BUMONEntityList .size() > 0) {
				for (int i = 0; i < A002DropDownListOption27BUMONEntityList.size(); i++) {
					A002DropDownListOption27BUMONEntity = A002DropDownListOption27BUMONEntityList.get(i);
					opValue = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A002DropDownListOption27BUMONEntity.getBUMONID()));
					opText = StringUtil.escapeHTMLTags(StringUtil.changeNullToBlank(A002DropDownListOption27BUMONEntity.getBUMONMEI()));
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
