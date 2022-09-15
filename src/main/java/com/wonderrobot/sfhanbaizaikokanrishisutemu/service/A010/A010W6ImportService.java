package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010W6beforeService;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6deleteMITUMORIRINJIHYOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A010.A010W6insertMITUMORIRINJIHYOUDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010.A010W6insertMITUMORIRINJIHYOUEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A010.A010W6afterService;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A010W6ImportService
 * @version

 */

@Service
public class A010W6ImportService {
	@Autowired
	private A010W6beforeService A010W6beforeService;
	@Autowired
	private A010W6deleteMITUMORIRINJIHYOUDao A010W6deleteMITUMORIRINJIHYOUDao;
	@Autowired
	private A010W6insertMITUMORIRINJIHYOUDao A010W6insertMITUMORIRINJIHYOUDao;
	@Autowired
	private A010W6afterService A010W6afterService;

   
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
	private A010W6insertMITUMORIRINJIHYOUEntity getNewCommonDataBean (A010W6insertMITUMORIRINJIHYOUEntity oriEntity) throws Exception {

		A010W6insertMITUMORIRINJIHYOUEntity newEntity = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			newEntity = new A010W6insertMITUMORIRINJIHYOUEntity();
			newEntity.setHIDZUKE(oriEntity.getHIDZUKE());
			newEntity.setKYAKUSAKI(oriEntity.getKYAKUSAKI());
			newEntity.setKYAKUSAKITANTOU(oriEntity.getKYAKUSAKITANTOU());
			newEntity.setMITSUMORINO(oriEntity.getMITSUMORINO());
			newEntity.setSAKUSEISHA(oriEntity.getSAKUSEISHA());
			newEntity.setHINMEI(oriEntity.getHINMEI());
			newEntity.setKAHEI(oriEntity.getKAHEI());
			newEntity.setKIROKUSHAID(oriEntity.getKIROKUSHAID());
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
	private void getDownData (Sheet sheet, int sheetNum, A010W6insertMITUMORIRINJIHYOUEntity oriEntity, ArrayList<A010W6insertMITUMORIRINJIHYOUEntity> entityList) throws Exception {

		A010W6insertMITUMORIRINJIHYOUEntity newEntity = null;
		int loopNum = 0;
		int minLoopRowIndex = 0;
		int rowIndex = 0;
		Row row = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			minLoopRowIndex = 17;
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
					if (rowIndex >= 17) {
						newEntity.setBANGOU(StringUtil.changeStringToDouble(getCellValue(sheet, rowIndex, 0, "4")));
						newEntity.setKOUMOKU(getCellValue(sheet, rowIndex, 1, "1"));
						newEntity.setSUURYOU(StringUtil.changeStringToInt(getCellValue(sheet, rowIndex, 2, "2")));
						newEntity.setPRICE(StringUtil.changeStringToDouble(getCellValue(sheet, rowIndex, 4, "4")));
						newEntity.setGOLD(StringUtil.changeStringToDouble(getCellValue(sheet, rowIndex, 5, "4")));
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
	private void readImportFile (HttpServletRequest request, MultipartFile[] files, ArrayList<A010W6insertMITUMORIRINJIHYOUEntity> A010W6insertMITUMORIRINJIHYOUEntityList) throws Exception {

		MultipartFile oriFile = null;
		int filepos = 0;
		Workbook workBook = null;
		Sheet sheet = null;
		String sheetName = null;
		A010W6insertMITUMORIRINJIHYOUEntity oriEntity = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			if (files != null && files.length > 0) {
				oriFile = files[filepos];
				
				workBook = ImportDataUtil.getWorkbook(oriFile);
				if (workBook != null) {
					oriEntity = new A010W6insertMITUMORIRINJIHYOUEntity();
					sheetName = "new";
					sheet = workBook.getSheet(sheetName);
					if (sheet != null) {
						
						oriEntity.setHIDZUKE(getCellValue(sheet, 2, 5, "3"));
						oriEntity.setKYAKUSAKI(getCellValue(sheet, 3, 1, "1"));
						oriEntity.setKYAKUSAKITANTOU(getCellValue(sheet, 4, 1, "1"));
						oriEntity.setMITSUMORINO(getCellValue(sheet, 3, 5, "1"));
						oriEntity.setSAKUSEISHA(getCellValue(sheet, 2, 7, "1"));
						oriEntity.setHINMEI(getCellValue(sheet, 14, 1, "1"));
						oriEntity.setKAHEI(getCellValue(sheet, 16, 6, "1"));
						oriEntity.setKIROKUSHAID(getCellValue(sheet, 1, 1, "1"));
					}
					sheetName = "new";
					sheet = workBook.getSheet(sheetName);
					if (sheet != null) {
						getDownData(sheet, 0, oriEntity, A010W6insertMITUMORIRINJIHYOUEntityList);
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
	public void A010W6Import (MultipartFile[] files, HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		ArrayList<A010W6insertMITUMORIRINJIHYOUEntity> A010W6insertMITUMORIRINJIHYOUEntityList = null;
		A010W6insertMITUMORIRINJIHYOUEntity A010W6insertMITUMORIRINJIHYOUEntity = null;
		StringBuffer errMsgSB = null;
		int lineNum = 0;
		String cleanDataBeforeImport = null;
		String HIDZUKE = null;
		String KYAKUSAKI = null;
		String KYAKUSAKITANTOU = null;
		String MITSUMORINO = null;
		String SAKUSEISHA = null;
		String HINMEI = null;
		double BANGOU = 0.0;
		String KOUMOKU = null;
		int SUURYOU = 0;
		double PRICE = 0.0;
		double GOLD = 0.0;
		String KAHEI = null;
		String KIROKUSHAID = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			//import前関数処理
			A010W6beforeService.A010W6before(request, jsonObj);
			
			lineNum = 1;
			A010W6insertMITUMORIRINJIHYOUEntityList = new ArrayList<A010W6insertMITUMORIRINJIHYOUEntity>();
			errMsgSB = new StringBuffer();
			cleanDataBeforeImport = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("cleanDataBeforeImport")));
			readImportFile(request,files, A010W6insertMITUMORIRINJIHYOUEntityList);
			if ("1".equals(cleanDataBeforeImport)) {
				
				A010W6deleteMITUMORIRINJIHYOUDao.A010W6deleteMITUMORIRINJIHYOU ();
			}
			for (int i = 0; i < A010W6insertMITUMORIRINJIHYOUEntityList.size();i++) {
				lineNum = i + 1 + 0;
				A010W6insertMITUMORIRINJIHYOUEntity = A010W6insertMITUMORIRINJIHYOUEntityList.get(i);
				
				HIDZUKE = A010W6insertMITUMORIRINJIHYOUEntity.getHIDZUKE();
				KYAKUSAKI = A010W6insertMITUMORIRINJIHYOUEntity.getKYAKUSAKI();
				KYAKUSAKITANTOU = A010W6insertMITUMORIRINJIHYOUEntity.getKYAKUSAKITANTOU();
				MITSUMORINO = A010W6insertMITUMORIRINJIHYOUEntity.getMITSUMORINO();
				SAKUSEISHA = A010W6insertMITUMORIRINJIHYOUEntity.getSAKUSEISHA();
				HINMEI = A010W6insertMITUMORIRINJIHYOUEntity.getHINMEI();
				BANGOU = A010W6insertMITUMORIRINJIHYOUEntity.getBANGOU();
				KOUMOKU = A010W6insertMITUMORIRINJIHYOUEntity.getKOUMOKU();
				SUURYOU = A010W6insertMITUMORIRINJIHYOUEntity.getSUURYOU();
				PRICE = A010W6insertMITUMORIRINJIHYOUEntity.getPRICE();
				GOLD = A010W6insertMITUMORIRINJIHYOUEntity.getGOLD();
				KAHEI = A010W6insertMITUMORIRINJIHYOUEntity.getKAHEI();
				KIROKUSHAID = A010W6insertMITUMORIRINJIHYOUEntity.getKIROKUSHAID();
				LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
				try {
					
					A010W6insertMITUMORIRINJIHYOUDao.A010W6insertMITUMORIRINJIHYOU (HIDZUKE,KYAKUSAKI,KYAKUSAKITANTOU,MITSUMORINO,SAKUSEISHA,HINMEI,BANGOU,KOUMOKU,SUURYOU,PRICE,GOLD,KAHEI,KIROKUSHAID);
				} catch (Exception e) {
					LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
					errMsgSB.append(lineNum).append("行目のデータをインポートする時にエラーが発生しました。").append("\n").append("\t").append(HIDZUKE).append(",").append(KYAKUSAKI).append(",").append(KYAKUSAKITANTOU).append(",").append(MITSUMORINO).append(",").append(SAKUSEISHA).append(",").append(HINMEI).append(",").append(BANGOU).append(",").append(KOUMOKU).append(",").append(SUURYOU).append(",").append(PRICE).append(",").append(GOLD).append(",").append(KAHEI).append(",").append(KIROKUSHAID).append("\n");
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
			A010W6afterService.A010W6after(request, jsonObj);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			HIDZUKE = null;
			HINMEI = null;
			KYAKUSAKITANTOU = null;
			A010W6insertMITUMORIRINJIHYOUEntityList = null;
			SAKUSEISHA = null;
			KOUMOKU = null;
			KAHEI = null;
			A010W6insertMITUMORIRINJIHYOUEntity = null;
			KIROKUSHAID = null;
			errMsgSB = null;
			KYAKUSAKI = null;
			MITSUMORINO = null;
			cleanDataBeforeImport = null;
		}
	}
}