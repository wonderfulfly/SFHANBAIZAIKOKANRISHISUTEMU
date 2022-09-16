package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.wonderfulfly.saasforce.business.edit.inout.data.ExcelCellBean;
import com.wonderfulfly.saasforce.business.edit.inout.data.ExcelDataBean;
import com.wonderfulfly.common.FileDownLoadJsonSet;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.PrintByFunction;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013I00007Entity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013I00007Dao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: A013AA71Service
 *      Page: 部品管理画面
 *      Function: 部品管理画面処理済リストClick
 * @version

 */

@Service
public class A013AA71Service {
	@Autowired
	private A013I00007Dao A013I00007Dao;

   
	@Log
	private void setInstalBean (ExcelDataBean sheeBean, ExcelDataBean excelDataBean) throws Exception {

	}

   
	@Log
	private String printData (ExcelDataBean excelDataBean, JSONWFCObject jsonObj) throws Exception {

		String outFileID = null;
		excelDataBean.setFooterCenter("%page% / %numPages%");
		PrintByFunction excelPrint = new PrintByFunction();
		excelPrint.setExcelDataBean(excelDataBean);
		outFileID = excelPrint.print("製作部品List.xlsx", "20220916_202948258.xlsx", jsonObj);
		return outFileID;

	}

   
	@Log
	private boolean isNullOfFormFeed (List<A013I00007Entity> A013I00007EntityList) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String TOKUISAKI = null;
		for (A013I00007Entity A013I00007Entity : A013I00007EntityList) {
			sBuffer.setLength(0);
			TOKUISAKI = StringUtil.changeNullToBlank(A013I00007Entity.getTOKUISAKI());
			sBuffer.append(TOKUISAKI);
			if (sBuffer.length() == 0) {
				return true;
			}
		}
		return false;

	}

   
	@Log
	private Map<String, List<A013I00007Entity>> setMapByRsheet (List<A013I00007Entity> A013I00007EntityList) throws Exception {

		Map<String, List<A013I00007Entity>> A013I00007EntityMap = new LinkedHashMap<String, List<A013I00007Entity>>();
		StringBuffer sBuffer = new StringBuffer();
		String sheetName = null;
		List<A013I00007Entity> EntityList = null;
		String TOKUISAKI = null;
		for (A013I00007Entity A013I00007Entity : A013I00007EntityList) {
			sBuffer.setLength(0);
			TOKUISAKI = StringUtil.changeNullToBlank(A013I00007Entity.getTOKUISAKI());
			sBuffer.append(TOKUISAKI).append("_");
			sheetName = StringUtil.removeRightString(sBuffer.toString(), "_");
			EntityList = A013I00007EntityMap.get(sheetName);
			if (EntityList == null) {
				EntityList = new ArrayList<A013I00007Entity>();
			}
			EntityList.add(A013I00007Entity);
			A013I00007EntityMap.put(sheetName, EntityList);
		}
		return A013I00007EntityMap;

	}

   
	@Log
	private void setSheetBeanData (List<A013I00007Entity> entityList, ExcelDataBean sheeBean) throws Exception {

		ArrayList<ArrayList<String>> rowDataList = null;
		ArrayList<String> list = null;
		Map<Integer, ExcelCellBean> conditionMap = null;
		
		String SEISAKUHINKUBUN = null;
		String TOKUISAKI = null;
		String HINBAN = null;
		String KOUJIKANRIBANGOU = null;
		String ASENBURIRAIN = null;
		String KIKAIMEISHOU = null;
		String BUBUNMEISHOU = null;
		String SEISAKUSUU = null;
		String SHAINMEI1 = null;
		String MAISUU = null;
		String HIDZUKE = null;
		String HINBANNO = null;
		String HINMEI = null;
		String KOSUU = null;
		String ZONGGESHU1 = null;
		String ZAISHITSU = null;
		String BIKOU = null;
		String KIBOUTANKA = null;
		String KIBOUNOUKI = null;
		String DANDANG = null;
		String TEHAISAKI = null;
		String KOUNYUUTANKA = null;
		String TEHAIBI = null;
		String NYUUKAYOTEIBI = null;
		String NYUUKABI = null;
		String ZONGGESHU2 = null;
		String SHOUKEI = null;
		
		rowDataList = new ArrayList<ArrayList<String>>();
		if (entityList != null && entityList.size() > 0) {
			for (A013I00007Entity A013I00007Entity : entityList) {
				list = new ArrayList<String>();
				SEISAKUHINKUBUN = StringUtil.changeNullToBlank(A013I00007Entity.getSEISAKUHINKUBUN());
				TOKUISAKI = StringUtil.changeNullToBlank(A013I00007Entity.getTOKUISAKI());
				HINBAN = StringUtil.changeNullToBlank(A013I00007Entity.getHINBAN());
				KOUJIKANRIBANGOU = StringUtil.changeNullToBlank(A013I00007Entity.getKOUJIKANRIBANGOU());
				ASENBURIRAIN = StringUtil.changeNullToBlank(A013I00007Entity.getASENBURIRAIN());
				KIKAIMEISHOU = StringUtil.changeNullToBlank(A013I00007Entity.getKIKAIMEISHOU());
				BUBUNMEISHOU = StringUtil.changeNullToBlank(A013I00007Entity.getBUBUNMEISHOU());
				SEISAKUSUU = StringUtil.ChangeIntToString(A013I00007Entity.getSEISAKUSUU());
				SHAINMEI1 = StringUtil.changeNullToBlank(A013I00007Entity.getSHAINMEI1());
				MAISUU = StringUtil.changeNullToBlank(A013I00007Entity.getMAISUU());
				HIDZUKE = StringUtil.changeNullToBlank(A013I00007Entity.getHIDZUKE());
				HINBANNO = StringUtil.changeNullToBlank(A013I00007Entity.getHINBANNO());
				list.add(HINBANNO);
				HINMEI = StringUtil.changeNullToBlank(A013I00007Entity.getHINMEI());
				list.add(HINMEI);
				KOSUU = StringUtil.ChangeIntToString(A013I00007Entity.getKOSUU());
				list.add(KOSUU);
				ZONGGESHU1 = StringUtil.ChangeIntToString(A013I00007Entity.getZONGGESHU1());
				list.add(ZONGGESHU1);
				ZAISHITSU = StringUtil.changeNullToBlank(A013I00007Entity.getZAISHITSU());
				list.add(ZAISHITSU);
				BIKOU = StringUtil.changeNullToBlank(A013I00007Entity.getBIKOU());
				list.add(BIKOU);
				KIBOUTANKA = StringUtil.ChangeDoubleToString(A013I00007Entity.getKIBOUTANKA());
				list.add(KIBOUTANKA);
				KIBOUNOUKI = StringUtil.changeNullToBlank(A013I00007Entity.getKIBOUNOUKI());
				list.add(KIBOUNOUKI);
				DANDANG = StringUtil.changeNullToBlank(A013I00007Entity.getDANDANG());
				list.add(DANDANG);
				TEHAISAKI = StringUtil.changeNullToBlank(A013I00007Entity.getTEHAISAKI());
				list.add(TEHAISAKI);
				KOUNYUUTANKA = StringUtil.ChangeDoubleToString(A013I00007Entity.getKOUNYUUTANKA());
				list.add(KOUNYUUTANKA);
				TEHAIBI = StringUtil.changeNullToBlank(A013I00007Entity.getTEHAIBI());
				list.add(TEHAIBI);
				NYUUKAYOTEIBI = StringUtil.changeNullToBlank(A013I00007Entity.getNYUUKAYOTEIBI());
				list.add(NYUUKAYOTEIBI);
				NYUUKABI = StringUtil.changeNullToBlank(A013I00007Entity.getNYUUKABI());
				list.add(NYUUKABI);
				ZONGGESHU2 = StringUtil.ChangeIntToString(A013I00007Entity.getZONGGESHU2());
				list.add(ZONGGESHU2);
				SHOUKEI = StringUtil.ChangeDoubleToString(A013I00007Entity.getSHOUKEI());
				list.add(SHOUKEI);
				rowDataList.add(list);
			}
			sheeBean.addItem("I3", SEISAKUHINKUBUN);
			sheeBean.addItem("B2", TOKUISAKI);
			sheeBean.addItem("E3", HINBAN);
			sheeBean.addItem("G3", KOUJIKANRIBANGOU);
			sheeBean.addItem("B3", ASENBURIRAIN);
			sheeBean.addItem("B4", KIKAIMEISHOU);
			sheeBean.addItem("B5", BUBUNMEISHOU);
			sheeBean.addItem("F4", SEISAKUSUU);
			sheeBean.addItem("G4", SHAINMEI1);
			sheeBean.addItem("H4", MAISUU);
			sheeBean.addItem("G5", HIDZUKE);
			sheeBean.addCopyItem("A1", "A6");
			conditionMap = new HashMap<Integer, ExcelCellBean>();
			conditionMap.put(0, new ExcelCellBean(0, 0, "string"));
			conditionMap.put(1, new ExcelCellBean(0, 1, "string"));
			conditionMap.put(2, new ExcelCellBean(0, 2, "number"));
			conditionMap.put(3, new ExcelCellBean(0, 3, "number"));
			conditionMap.put(4, new ExcelCellBean(0, 4, "string"));
			conditionMap.put(5, new ExcelCellBean(0, 5, "string"));
			conditionMap.put(6, new ExcelCellBean(0, 8, "number"));
			conditionMap.put(7, new ExcelCellBean(0, 9, "date"));
			conditionMap.put(8, new ExcelCellBean(0, 11, "string"));
			conditionMap.put(9, new ExcelCellBean(0, 12, "string"));
			conditionMap.put(10, new ExcelCellBean(0, 13, "number"));
			conditionMap.put(11, new ExcelCellBean(0, 14, "date"));
			conditionMap.put(12, new ExcelCellBean(0, 15, "date"));
			conditionMap.put(13, new ExcelCellBean(0, 16, "date"));
			conditionMap.put(14, new ExcelCellBean(0, 17, "number"));
			conditionMap.put(15, new ExcelCellBean(0, 18, "number"));
			sheeBean.addList("A7", rowDataList, conditionMap);
			sheeBean.addRelativeCopyItem("S8","S8", 0, 0, false, true, true);
		}

	}

   
	@Log
	public void A013AA71 (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		//部品注文書NO
		String BUHINCHUUBUNSHONO = null;
		//部品注文書明細NO
		String BUHINCHUUBUNSHOMEISAINO = null;
		List<A013I00007Entity> A013AA71selectI00007FuncPrintList = null;
		Map<String, List<A013I00007Entity>> A013I00007EntityMap = null;
		ExcelDataBean sheeBean = null;
		ExcelDataBean excelDataBean = null;
		String outFileID = null;
		BUHINCHUUBUNSHONO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHONO")));
		BUHINCHUUBUNSHOMEISAINO = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("BUHINCHUUBUNSHOMEISAINO")));
		
		A013AA71selectI00007FuncPrintList = A013I00007Dao.A013AA71selectI00007FuncPrint(BUHINCHUUBUNSHONO, BUHINCHUUBUNSHOMEISAINO);
		if (A013AA71selectI00007FuncPrintList != null && A013AA71selectI00007FuncPrintList.size() > 0) {
			if (!isNullOfFormFeed(A013AA71selectI00007FuncPrintList)) {
				excelDataBean = new ExcelDataBean();
				
				A013I00007EntityMap = setMapByRsheet(A013AA71selectI00007FuncPrintList);
				for (String sheetName : A013I00007EntityMap.keySet()) {
					sheeBean = new ExcelDataBean();
					setSheetBeanData(A013I00007EntityMap.get(sheetName), sheeBean);
					excelDataBean.addSheet(sheetName, sheeBean);
				}
				setInstalBean(sheeBean, excelDataBean);
				outFileID = printData(excelDataBean, jsonObj);
				
				FileDownLoadJsonSet.setFunctionPrintJsonObj(outFileID, "P00014", "35", jsonObj);
			} else {
				jsonObj.setMessageValue("e", "シート名は空白に設定できません。「改シート条件項目」を指定する場合、条件項目の値に空白があるか確認してください。");
			}
		} else {
			jsonObj.setMessageValue("e", "該当データは存在しません。");
		}

	}
}