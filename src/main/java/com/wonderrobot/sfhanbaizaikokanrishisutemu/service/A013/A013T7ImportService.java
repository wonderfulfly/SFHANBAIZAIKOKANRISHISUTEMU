package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013T7beforeService;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import com.wonderfulfly.core.util.FileUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import com.wonderfulfly.common.ImportDataUtil;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7deleteBUHINSYOUSAIRINJIHYOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A013.A013T7insertBUHINSYOUSAIRINJIHYOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013T7insertBUHINSYOUSAIRINJIHYOUEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A013.A013T7afterService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A013T7ImportService
 * @version

 */

@Service
public class A013T7ImportService {
	@Autowired
	private A013T7beforeService A013T7beforeService;
	@Autowired
	private A013T7deleteBUHINSYOUSAIRINJIHYOUDao A013T7deleteBUHINSYOUSAIRINJIHYOUDao;
	@Autowired
	private A013T7insertBUHINSYOUSAIRINJIHYOUDao A013T7insertBUHINSYOUSAIRINJIHYOUDao;
	@Autowired
	private A013T7afterService A013T7afterService;

   
	@Log
	private String getCellValue (Sheet sheet, int rowIndex, int columnIndex, String itemFieldType) throws Exception {

		String cellValue = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			cellValue = ImportDataUtil.getCellValue(sheet, rowIndex, columnIndex);
			if ("2".equals(itemFieldType)) {
				cellValue = StringUtil.replace(cellValue, ",", "");
			} else if ("3".equals(itemFieldType) || "5".equals(itemFieldType) || "6".equals(itemFieldType)) {
				cellValue = StringUtil.isNullOrBlank(cellValue) ? null : cellValue;
			}
			return cellValue;
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			cellValue = null;
		}
	}

   
	@Log
	private A013T7insertBUHINSYOUSAIRINJIHYOUEntity getNewCommonDataBean (A013T7insertBUHINSYOUSAIRINJIHYOUEntity oriEntity) throws Exception {

		A013T7insertBUHINSYOUSAIRINJIHYOUEntity newEntity = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			newEntity = new A013T7insertBUHINSYOUSAIRINJIHYOUEntity();
			newEntity.setKYAKUSAKIMEISHOU(oriEntity.getKYAKUSAKIMEISHOU());
			newEntity.setASENBURIRAIN(oriEntity.getASENBURIRAIN());
			newEntity.setKIKAIMEISHOU(oriEntity.getKIKAIMEISHOU());
			newEntity.setBUHINMEISHOU(oriEntity.getBUHINMEISHOU());
			newEntity.setHINBANNO1(oriEntity.getHINBANNO1());
			newEntity.setSEISAKUSUU(oriEntity.getSEISAKUSUU());
			newEntity.setSHANAIKOUJIBANGOU(oriEntity.getSHANAIKOUJIBANGOU());
			newEntity.setTANTOUSHA(oriEntity.getTANTOUSHA());
			newEntity.setMAISUU(oriEntity.getMAISUU());
			newEntity.setHIDZUKE(oriEntity.getHIDZUKE());
			newEntity.setTOUROKUSHAID(oriEntity.getTOUROKUSHAID());
			newEntity.setSEISAKUHINKUBUN(oriEntity.getSEISAKUHINKUBUN());
			return newEntity;
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			newEntity = null;
		}
	}

   
	@Log
	private void getDownData (Sheet sheet, int sheetNum, A013T7insertBUHINSYOUSAIRINJIHYOUEntity oriEntity, ArrayList<A013T7insertBUHINSYOUSAIRINJIHYOUEntity> entityList) throws Exception {

		A013T7insertBUHINSYOUSAIRINJIHYOUEntity newEntity = null;
		int loopNum = 0;
		int minLoopRowIndex = 0;
		int rowIndex = 0;
		Row row = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			minLoopRowIndex = 6;
			loopNum = sheet.getLastRowNum() - minLoopRowIndex;
			for (int i = 0;i < loopNum;i++) {
				rowIndex = i + minLoopRowIndex;
				row = sheet.getRow(rowIndex);
				if (row != null) {
					
					if (sheetNum > 0 && i < entityList.size()) {
						newEntity = entityList.get(i);
					} else {
						newEntity = getNewCommonDataBean(oriEntity);
						entityList.add(newEntity);
					}
					if (rowIndex >= 6) {
						newEntity.setHINMEI(getCellValue(sheet, rowIndex, 1, "1"));
						newEntity.setKOSUU(StringUtil.changeStringToInt(getCellValue(sheet, rowIndex, 2, "2")));
						newEntity.setSOUKOSUU(StringUtil.changeStringToInt(getCellValue(sheet, rowIndex, 3, "2")));
						newEntity.setZAISHITSU_KEISHIKI(getCellValue(sheet, rowIndex, 5, "1"));
						newEntity.setSEISAKUSHA(getCellValue(sheet, rowIndex, 4, "1"));
						newEntity.setKIBOUNOUKI(getCellValue(sheet, rowIndex, 8, "3"));
					}
					
				}
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			newEntity = null;
			row = null;
		}
	}

   
	@Log
	private void readImportFile (HttpServletRequest request, MultipartFile[] files, ArrayList<A013T7insertBUHINSYOUSAIRINJIHYOUEntity> A013T7insertBUHINSYOUSAIRINJIHYOUEntityList) throws Exception {

		MultipartFile oriFile = null;
		int filepos = 0;
		Workbook workBook = null;
		Sheet sheet = null;
		String sheetName = null;
		A013T7insertBUHINSYOUSAIRINJIHYOUEntity oriEntity = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			if (files != null && files.length > 0) {
				oriFile = files[filepos];
				
				workBook = ImportDataUtil.getWorkbook(oriFile);
				if (workBook != null) {
					oriEntity = new A013T7insertBUHINSYOUSAIRINJIHYOUEntity();
					sheetName = "部品明細";
					sheet = workBook.getSheet(sheetName);
					if (sheet != null) {
						
						oriEntity.setKYAKUSAKIMEISHOU(getCellValue(sheet, 1, 1, "1"));
						oriEntity.setASENBURIRAIN(getCellValue(sheet, 2, 1, "1"));
						oriEntity.setKIKAIMEISHOU(getCellValue(sheet, 3, 1, "1"));
						oriEntity.setBUHINMEISHOU(getCellValue(sheet, 4, 1, "1"));
						oriEntity.setHINBANNO1(getCellValue(sheet, 2, 4, "1"));
						oriEntity.setSEISAKUSUU(StringUtil.changeStringToInt(getCellValue(sheet, 3, 5, "2")));
						oriEntity.setSHANAIKOUJIBANGOU(getCellValue(sheet, 2, 6, "1"));
						oriEntity.setTANTOUSHA(getCellValue(sheet, 3, 6, "1"));
						oriEntity.setMAISUU(getCellValue(sheet, 3, 7, "1"));
						oriEntity.setHIDZUKE(getCellValue(sheet, 4, 6, "3"));
						oriEntity.setTOUROKUSHAID(getCellValue(sheet, 0, 8, "1"));
						oriEntity.setSEISAKUHINKUBUN(getCellValue(sheet, 2, 8, "1"));
					}
					sheetName = "部品明細";
					sheet = workBook.getSheet(sheetName);
					if (sheet != null) {
						getDownData(sheet, 0, oriEntity, A013T7insertBUHINSYOUSAIRINJIHYOUEntityList);
					}
				}
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			workBook = null;
			sheetName = null;
			oriFile = null;
			sheet = null;
			oriEntity = null;
		}
	}

   
	@Log
	private void setErrMsg (String errMsgStr, JSONWFCObject jsonObj) throws Exception {

		String divID = null;
		String scriptStr = null;
		String htmlStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			StringBuffer sBuffer = new StringBuffer();
			divID = "inout_step2";
			sBuffer.setLength(0);
			sBuffer.append("<table><tr><td style='width: 675px;'><fieldset><legend>").append("エラー詳細")
			.append("</legend><br><textarea id='errorInfoContent' name='errorInfoContent' style='width: 100%;height: 260px; resize: none;' readonly>")
			.append(errMsgStr).append("</textarea></fieldset></td></tr></table>");
			
			htmlStr = sBuffer.toString();
			
			jsonObj.setHtml(divID, htmlStr);
			jsonObj.setReturnID(divID);
			
			sBuffer.setLength(0);
			sBuffer.append("$('#").append(divID).append("').dialog('open');");
			scriptStr= sBuffer.toString();
			jsonObj.setScript("r", scriptStr);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			scriptStr = null;
			htmlStr = null;
			divID = null;
		}
	}

   
	@Log
	public void A013T7Import (MultipartFile[] files, HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		ArrayList<A013T7insertBUHINSYOUSAIRINJIHYOUEntity> A013T7insertBUHINSYOUSAIRINJIHYOUEntityList = null;
		A013T7insertBUHINSYOUSAIRINJIHYOUEntity A013T7insertBUHINSYOUSAIRINJIHYOUEntity = null;
		StringBuffer errMsgSB = null;
		int lineNum = 0;
		String cleanDataBeforeImport = null;
		String KYAKUSAKIMEISHOU = null;
		String ASENBURIRAIN = null;
		String KIKAIMEISHOU = null;
		String BUHINMEISHOU = null;
		String HINBANNO1 = null;
		int SEISAKUSUU = 0;
		String SHANAIKOUJIBANGOU = null;
		String TANTOUSHA = null;
		String MAISUU = null;
		String HIDZUKE = null;
		String HINMEI = null;
		int KOSUU = 0;
		int SOUKOSUU = 0;
		String ZAISHITSU_KEISHIKI = null;
		String SEISAKUSHA = null;
		String TOUROKUSHAID = null;
		String SEISAKUHINKUBUN = null;
		String DOUNYUUBANGOU = null;
		String KIBOUNOUKI = null;
		String HINBANNO = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			//import前関数処理
			A013T7beforeService.A013T7before(request, jsonObj);
			
			lineNum = 1;
			A013T7insertBUHINSYOUSAIRINJIHYOUEntityList = new ArrayList<A013T7insertBUHINSYOUSAIRINJIHYOUEntity>();
			errMsgSB = new StringBuffer();
			cleanDataBeforeImport = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("cleanDataBeforeImport")));
			readImportFile(request,files, A013T7insertBUHINSYOUSAIRINJIHYOUEntityList);
			if ("1".equals(cleanDataBeforeImport)) {
				
				A013T7deleteBUHINSYOUSAIRINJIHYOUDao.A013T7deleteBUHINSYOUSAIRINJIHYOU ();
			}
			for (int i = 0; i < A013T7insertBUHINSYOUSAIRINJIHYOUEntityList.size();i++) {
				lineNum = i + 1 + 0;
				A013T7insertBUHINSYOUSAIRINJIHYOUEntity = A013T7insertBUHINSYOUSAIRINJIHYOUEntityList.get(i);
				
				KYAKUSAKIMEISHOU = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getKYAKUSAKIMEISHOU();
				ASENBURIRAIN = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getASENBURIRAIN();
				KIKAIMEISHOU = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getKIKAIMEISHOU();
				BUHINMEISHOU = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getBUHINMEISHOU();
				HINBANNO1 = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getHINBANNO1();
				SEISAKUSUU = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getSEISAKUSUU();
				SHANAIKOUJIBANGOU = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getSHANAIKOUJIBANGOU();
				TANTOUSHA = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getTANTOUSHA();
				MAISUU = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getMAISUU();
				HIDZUKE = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getHIDZUKE();
				HINMEI = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getHINMEI();
				KOSUU = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getKOSUU();
				SOUKOSUU = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getSOUKOSUU();
				ZAISHITSU_KEISHIKI = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getZAISHITSU_KEISHIKI();
				SEISAKUSHA = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getSEISAKUSHA();
				TOUROKUSHAID = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getTOUROKUSHAID();
				SEISAKUHINKUBUN = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getSEISAKUHINKUBUN();
				DOUNYUUBANGOU = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getDOUNYUUBANGOU();
				KIBOUNOUKI = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getKIBOUNOUKI();
				HINBANNO = A013T7insertBUHINSYOUSAIRINJIHYOUEntity.getHINBANNO();
				LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
				try {
					
					A013T7insertBUHINSYOUSAIRINJIHYOUDao.A013T7insertBUHINSYOUSAIRINJIHYOU (KYAKUSAKIMEISHOU,ASENBURIRAIN,KIKAIMEISHOU,BUHINMEISHOU,HINBANNO1,SEISAKUSUU,SHANAIKOUJIBANGOU,TANTOUSHA,MAISUU,HIDZUKE,HINMEI,KOSUU,SOUKOSUU,ZAISHITSU_KEISHIKI,SEISAKUSHA,TOUROKUSHAID,SEISAKUHINKUBUN,DOUNYUUBANGOU,KIBOUNOUKI,HINBANNO);
				} catch (Exception e) {
					LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
					errMsgSB.append(lineNum).append("行目のデータをインポートする時にエラーが発生しました。").append("\n").append("\t").append(KYAKUSAKIMEISHOU).append(",").append(ASENBURIRAIN).append(",").append(KIKAIMEISHOU).append(",").append(BUHINMEISHOU).append(",").append(HINBANNO1).append(",").append(SEISAKUSUU).append(",").append(SHANAIKOUJIBANGOU).append(",").append(TANTOUSHA).append(",").append(MAISUU).append(",").append(HIDZUKE).append(",").append(HINMEI).append(",").append(KOSUU).append(",").append(SOUKOSUU).append(",").append(ZAISHITSU_KEISHIKI).append(",").append(SEISAKUSHA).append(",").append(TOUROKUSHAID).append(",").append(SEISAKUHINKUBUN).append(",").append(DOUNYUUBANGOU).append(",").append(KIBOUNOUKI).append(",").append(HINBANNO).append("\n");
					} finally {
					LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
				}
			}
			
			if (errMsgSB.length() == 0) {
				jsonObj.setMessageValue("i", "インポート処理が正常に完了しました。");
			} else {
				setErrMsg(errMsgSB.toString(), jsonObj);
			}
			//import後関数処理
			A013T7afterService.A013T7after(request, jsonObj);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			HIDZUKE = null;
			ASENBURIRAIN = null;
			MAISUU = null;
			KYAKUSAKIMEISHOU = null;
			TANTOUSHA = null;
			KIBOUNOUKI = null;
			HINBANNO1 = null;
			BUHINMEISHOU = null;
			SEISAKUHINKUBUN = null;
			HINMEI = null;
			A013T7insertBUHINSYOUSAIRINJIHYOUEntityList = null;
			A013T7insertBUHINSYOUSAIRINJIHYOUEntity = null;
			SHANAIKOUJIBANGOU = null;
			SEISAKUSHA = null;
			KIKAIMEISHOU = null;
			errMsgSB = null;
			HINBANNO = null;
			ZAISHITSU_KEISHIKI = null;
			DOUNYUUBANGOU = null;
			TOUROKUSHAID = null;
			cleanDataBeforeImport = null;
		}
	}
}