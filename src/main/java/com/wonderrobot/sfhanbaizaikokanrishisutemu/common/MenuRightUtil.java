package com.wonderrobot.sfhanbaizaikokanrishisutemu.common;
import com.wonderfulfly.core.util.StringUtil;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import com.wonderfulfly.core.util.log.LoggerUtil;
@Component
public class MenuRightUtil {
	private void setRightMap(Map<String, Map<String, String>> rightMap) throws Exception {

		Map<String, String> menuStyleMap = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			//テストグループ
			menuStyleMap = new HashMap<String, String>();
			menuStyleMap.put("M00002", "width: 16.67%;");
			menuStyleMap.put("M00003", "width: 16.67%;");
			menuStyleMap.put("M00004", "width: 16.67%;");
			menuStyleMap.put("M00005", "width: 16.67%;");
			menuStyleMap.put("M00006", "width: 16.67%;");
			menuStyleMap.put("M00007", "width: 16.67%;");
			rightMap.put("G00002", menuStyleMap);
			//管理者S級
			menuStyleMap = new HashMap<String, String>();
			menuStyleMap.put("M00002", "width: 16.67%;");
			menuStyleMap.put("M00003", "width: 16.67%;");
			menuStyleMap.put("M00004", "width: 16.67%;");
			menuStyleMap.put("M00005", "width: 16.67%;");
			menuStyleMap.put("M00006", "width: 16.67%;");
			menuStyleMap.put("M00007", "width: 16.67%;");
			rightMap.put("G00003", menuStyleMap);
			//管理者A級
			menuStyleMap = new HashMap<String, String>();
			menuStyleMap.put("M00002", "width: 25.00%;display:none;");
			menuStyleMap.put("M00003", "width: 25.00%;");
			menuStyleMap.put("M00004", "width: 25.00%;display:none;");
			menuStyleMap.put("M00005", "width: 25.00%;");
			menuStyleMap.put("M00006", "width: 25.00%;");
			menuStyleMap.put("M00007", "width: 25.00%;");
			rightMap.put("G00004", menuStyleMap);
			//営業部門長
			menuStyleMap = new HashMap<String, String>();
			menuStyleMap.put("M00002", "width: 33.33%;display:none;");
			menuStyleMap.put("M00003", "width: 33.33%;");
			menuStyleMap.put("M00004", "width: 33.33%;display:none;");
			menuStyleMap.put("M00005", "width: 33.33%;display:none;");
			menuStyleMap.put("M00006", "width: 33.33%;");
			menuStyleMap.put("M00007", "width: 33.33%;");
			rightMap.put("G00005", menuStyleMap);
			//営業
			menuStyleMap = new HashMap<String, String>();
			menuStyleMap.put("M00002", "width: 33.33%;display:none;");
			menuStyleMap.put("M00003", "width: 33.33%;");
			menuStyleMap.put("M00004", "width: 33.33%;display:none;");
			menuStyleMap.put("M00005", "width: 33.33%;display:none;");
			menuStyleMap.put("M00006", "width: 33.33%;");
			menuStyleMap.put("M00007", "width: 33.33%;");
			rightMap.put("G00006", menuStyleMap);
			//購買設計部門長
			menuStyleMap = new HashMap<String, String>();
			menuStyleMap.put("M00002", "width: 50.00%;display:none;");
			menuStyleMap.put("M00003", "width: 50.00%;display:none;");
			menuStyleMap.put("M00004", "width: 50.00%;display:none;");
			menuStyleMap.put("M00005", "width: 50.00%;");
			menuStyleMap.put("M00006", "width: 50.00%;");
			menuStyleMap.put("M00007", "width: 50.00%;display:none;");
			rightMap.put("G00007", menuStyleMap);
			//設計
			menuStyleMap = new HashMap<String, String>();
			menuStyleMap.put("M00002", "width: 50.00%;display:none;");
			menuStyleMap.put("M00003", "width: 50.00%;display:none;");
			menuStyleMap.put("M00004", "width: 50.00%;display:none;");
			menuStyleMap.put("M00005", "width: 50.00%;");
			menuStyleMap.put("M00006", "width: 50.00%;");
			menuStyleMap.put("M00007", "width: 50.00%;display:none;");
			rightMap.put("G00008", menuStyleMap);
			//購買検収
			menuStyleMap = new HashMap<String, String>();
			menuStyleMap.put("M00002", "width: 50.00%;display:none;");
			menuStyleMap.put("M00003", "width: 50.00%;display:none;");
			menuStyleMap.put("M00004", "width: 50.00%;display:none;");
			menuStyleMap.put("M00005", "width: 50.00%;");
			menuStyleMap.put("M00006", "width: 50.00%;");
			menuStyleMap.put("M00007", "width: 50.00%;display:none;");
			rightMap.put("G00009", menuStyleMap);
			//財務
			menuStyleMap = new HashMap<String, String>();
			menuStyleMap.put("M00002", "width: 33.33%;display:none;");
			menuStyleMap.put("M00003", "width: 33.33%;display:none;");
			menuStyleMap.put("M00004", "width: 33.33%;");
			menuStyleMap.put("M00005", "width: 33.33%;display:none;");
			menuStyleMap.put("M00006", "width: 33.33%;");
			menuStyleMap.put("M00007", "width: 33.33%;");
			rightMap.put("G00010", menuStyleMap);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			menuStyleMap = null;
		}
	}
	public void setSessionRight(HttpSession session, String groupID) throws Exception {

		Map<String, Map<String, String>> rightMap = null;
		Map<String, String> menuStyleMap = null;
		StringBuffer sBuffer = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			rightMap = new HashMap<String, Map<String, String>>();
			sBuffer = new StringBuffer();
			setRightMap(rightMap);
			menuStyleMap = rightMap.get(groupID);
			if (menuStyleMap != null && menuStyleMap.size() > 0) {
				for (String menuID : menuStyleMap.keySet()) {
					if (!StringUtil.isNullOrBlank(menuID)) {
						
						sBuffer.setLength(0);
						sBuffer.append("right_").append(menuID);
						session.setAttribute(sBuffer.toString(),menuStyleMap.get(menuID));
					}
				}
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			rightMap = null;
			menuStyleMap = null;
			sBuffer = null;
		}
	}
	public void setAdminSessionRight(HttpSession session) throws Exception {

		StringBuffer sBuffer = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			sBuffer = new StringBuffer();
			sBuffer.setLength(0);
			sBuffer.append("right_").append("M00002");
			session.setAttribute(sBuffer.toString(),"width: 16.67%;");
			sBuffer.setLength(0);
			sBuffer.append("right_").append("M00003");
			session.setAttribute(sBuffer.toString(),"width: 16.67%;");
			sBuffer.setLength(0);
			sBuffer.append("right_").append("M00004");
			session.setAttribute(sBuffer.toString(),"width: 16.67%;");
			sBuffer.setLength(0);
			sBuffer.append("right_").append("M00005");
			session.setAttribute(sBuffer.toString(),"width: 16.67%;");
			sBuffer.setLength(0);
			sBuffer.append("right_").append("M00006");
			session.setAttribute(sBuffer.toString(),"width: 16.67%;");
			sBuffer.setLength(0);
			sBuffer.append("right_").append("M00007");
			session.setAttribute(sBuffer.toString(),"width: 16.67%;");
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			sBuffer = null;
		}
	}
}
