package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A005;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import com.wonderfulfly.core.util.FileUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005.A005C14deleteKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005.A005C14insertKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A005.A005C14insertKAISYAEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A005C14ImportService
 * @version

 */

@Service
public class A005C14ImportService {
	@Autowired
	private A005C14deleteKAISYADao A005C14deleteKAISYADao;
	@Autowired
	private A005C14insertKAISYADao A005C14insertKAISYADao;

   
	@Log
	private void setDataA005C14insertKAISYAEntity (ArrayList<String> dataListStr, ArrayList<A005C14insertKAISYAEntity> A005C14insertKAISYAEntityList) throws Exception {

		A005C14insertKAISYAEntity A005C14insertKAISYAEntity = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			if (dataListStr != null && dataListStr.size() >= 7) {
				A005C14insertKAISYAEntity = new A005C14insertKAISYAEntity();
				A005C14insertKAISYAEntity.setKAISHAID(dataListStr.get(0));
				A005C14insertKAISYAEntity.setKAISHAMEI(dataListStr.get(1));
				A005C14insertKAISYAEntity.setKAISHARYAKUSHOU(dataListStr.get(2));
				A005C14insertKAISYAEntity.setADORESU(dataListStr.get(3));
				A005C14insertKAISYAEntity.setRENRAKUSAKI(dataListStr.get(4));
				A005C14insertKAISYAEntity.setSHIHARAIKIGEN(StringUtil.changeStringToInt(dataListStr.get(5)));
				A005C14insertKAISYAEntity.setKAISHAKUBUN(dataListStr.get(6));
				A005C14insertKAISYAEntityList.add(A005C14insertKAISYAEntity);
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			A005C14insertKAISYAEntity = null;
		}
	}

   
	@Log
	private void splitData (HttpServletRequest request, String lineStr, ArrayList<String> dataListStr) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			if (!StringUtil.isNullOrBlank(lineStr)) {
				StringUtil.split2Array2(lineStr, ",", dataListStr);
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
	}

   
	@Log
	private void readImportFile (HttpServletRequest request, MultipartFile[] files, ArrayList<A005C14insertKAISYAEntity> A005C14insertKAISYAEntityList) throws Exception {

		MultipartFile oriFile = null;
		int filepos = 0;
		InputStreamReader inpurtSreamReader = null;
		BufferedReader bufferedReader = null;
		String line = null;
		int lineNum = 0;
		ArrayList<String> dataListStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			if (files != null && files.length > 0) {
				oriFile = files[filepos];
				
				inpurtSreamReader = new InputStreamReader(FileUtil.skipUTF8BOM(oriFile.getInputStream(), "UTF-8"));
				bufferedReader = new BufferedReader(inpurtSreamReader);
				while ((line = bufferedReader.readLine()) != null) {
					lineNum++;
					if (lineNum > 0) {
						dataListStr = new ArrayList<String>();
						splitData(request,line, dataListStr);
						setDataA005C14insertKAISYAEntity(dataListStr, A005C14insertKAISYAEntityList);
					}
				}
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			bufferedReader = null;
			inpurtSreamReader = null;
			line = null;
			oriFile = null;
			dataListStr = null;
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
	public void A005C14Import (MultipartFile[] files, HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		ArrayList<A005C14insertKAISYAEntity> A005C14insertKAISYAEntityList = null;
		A005C14insertKAISYAEntity A005C14insertKAISYAEntity = null;
		StringBuffer errMsgSB = null;
		int lineNum = 0;
		String cleanDataBeforeImport = null;
		String KAISHAID = null;
		String KAISHAMEI = null;
		String KAISHARYAKUSHOU = null;
		String ADORESU = null;
		String RENRAKUSAKI = null;
		int SHIHARAIKIGEN = 0;
		String KAISHAKUBUN = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			lineNum = 1;
			A005C14insertKAISYAEntityList = new ArrayList<A005C14insertKAISYAEntity>();
			errMsgSB = new StringBuffer();
			cleanDataBeforeImport = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("cleanDataBeforeImport")));
			readImportFile(request,files, A005C14insertKAISYAEntityList);
			if ("1".equals(cleanDataBeforeImport)) {
				
				A005C14deleteKAISYADao.A005C14deleteKAISYA ();
			}
			for (int i = 0; i < A005C14insertKAISYAEntityList.size();i++) {
				lineNum = i + 1 + 0;
				A005C14insertKAISYAEntity = A005C14insertKAISYAEntityList.get(i);
				
				KAISHAID = A005C14insertKAISYAEntity.getKAISHAID();
				KAISHAMEI = A005C14insertKAISYAEntity.getKAISHAMEI();
				KAISHARYAKUSHOU = A005C14insertKAISYAEntity.getKAISHARYAKUSHOU();
				ADORESU = A005C14insertKAISYAEntity.getADORESU();
				RENRAKUSAKI = A005C14insertKAISYAEntity.getRENRAKUSAKI();
				SHIHARAIKIGEN = A005C14insertKAISYAEntity.getSHIHARAIKIGEN();
				KAISHAKUBUN = A005C14insertKAISYAEntity.getKAISHAKUBUN();
				LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
				try {
					
					A005C14insertKAISYADao.A005C14insertKAISYA (KAISHAID,KAISHAMEI,KAISHARYAKUSHOU,ADORESU,RENRAKUSAKI,SHIHARAIKIGEN,KAISHAKUBUN);
				} catch (Exception e) {
					LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
					errMsgSB.append(lineNum).append("行目のデータをインポートする時にエラーが発生しました。").append("\n").append("\t").append(KAISHAID).append(",").append(KAISHAMEI).append(",").append(KAISHARYAKUSHOU).append(",").append(ADORESU).append(",").append(RENRAKUSAKI).append(",").append(SHIHARAIKIGEN).append(",").append(KAISHAKUBUN).append("\n");
					} finally {
					LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
				}
			}
			
			if (errMsgSB.length() == 0) {
				jsonObj.setMessageValue("i", "インポート処理が正常に完了しました。");
			} else {
				setErrMsg(errMsgSB.toString(), jsonObj);
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			A005C14insertKAISYAEntityList = null;
			A005C14insertKAISYAEntity = null;
			errMsgSB = null;
			KAISHAID = null;
			KAISHAKUBUN = null;
			KAISHARYAKUSHOU = null;
			RENRAKUSAKI = null;
			cleanDataBeforeImport = null;
			KAISHAMEI = null;
			ADORESU = null;
		}
	}
}