package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A004;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004O14deleteKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A004.A004O14insertKAISYADao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004.A004O14insertKAISYAEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A004O14ImportService
 * @version

 */

@Service
public class A004O14ImportService {
	@Autowired
	private A004O14deleteKAISYADao A004O14deleteKAISYADao;
	@Autowired
	private A004O14insertKAISYADao A004O14insertKAISYADao;

   
	@Log
	private void setDataA004O14insertKAISYAEntity (ArrayList<String> dataListStr, ArrayList<A004O14insertKAISYAEntity> A004O14insertKAISYAEntityList) throws Exception {

		A004O14insertKAISYAEntity A004O14insertKAISYAEntity = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			if (dataListStr != null && dataListStr.size() >= 7) {
				A004O14insertKAISYAEntity = new A004O14insertKAISYAEntity();
				A004O14insertKAISYAEntity.setKAISHAMEI(dataListStr.get(0));
				A004O14insertKAISYAEntity.setKAISHARYAKUSHOU(dataListStr.get(1));
				A004O14insertKAISYAEntity.setADORESU(dataListStr.get(2));
				A004O14insertKAISYAEntity.setRENRAKUSAKI(dataListStr.get(3));
				A004O14insertKAISYAEntity.setSHIHARAIKIGEN(StringUtil.changeStringToInt(dataListStr.get(4)));
				A004O14insertKAISYAEntity.setKAISHAKUBUN(dataListStr.get(5));
				A004O14insertKAISYAEntity.setKAISHAID(dataListStr.get(6));
				A004O14insertKAISYAEntityList.add(A004O14insertKAISYAEntity);
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			A004O14insertKAISYAEntity = null;
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
	private void readImportFile (HttpServletRequest request, MultipartFile[] files, ArrayList<A004O14insertKAISYAEntity> A004O14insertKAISYAEntityList) throws Exception {

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
				
				inpurtSreamReader = new InputStreamReader(FileUtil.skipUTF8BOM(oriFile.getInputStream(), "shift-jis"));
				bufferedReader = new BufferedReader(inpurtSreamReader);
				while ((line = bufferedReader.readLine()) != null) {
					lineNum++;
					if (lineNum > 0) {
						dataListStr = new ArrayList<String>();
						splitData(request,line, dataListStr);
						setDataA004O14insertKAISYAEntity(dataListStr, A004O14insertKAISYAEntityList);
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
	public void A004O14Import (MultipartFile[] files, HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		ArrayList<A004O14insertKAISYAEntity> A004O14insertKAISYAEntityList = null;
		A004O14insertKAISYAEntity A004O14insertKAISYAEntity = null;
		StringBuffer errMsgSB = null;
		int lineNum = 0;
		String cleanDataBeforeImport = null;
		String KAISHAMEI = null;
		String KAISHARYAKUSHOU = null;
		String ADORESU = null;
		String RENRAKUSAKI = null;
		int SHIHARAIKIGEN = 0;
		String KAISHAKUBUN = null;
		String KAISHAID = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			lineNum = 1;
			A004O14insertKAISYAEntityList = new ArrayList<A004O14insertKAISYAEntity>();
			errMsgSB = new StringBuffer();
			cleanDataBeforeImport = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("cleanDataBeforeImport")));
			readImportFile(request,files, A004O14insertKAISYAEntityList);
			if ("1".equals(cleanDataBeforeImport)) {
				
				A004O14deleteKAISYADao.A004O14deleteKAISYA ();
			}
			for (int i = 0; i < A004O14insertKAISYAEntityList.size();i++) {
				lineNum = i + 1 + 0;
				A004O14insertKAISYAEntity = A004O14insertKAISYAEntityList.get(i);
				
				KAISHAMEI = A004O14insertKAISYAEntity.getKAISHAMEI();
				KAISHARYAKUSHOU = A004O14insertKAISYAEntity.getKAISHARYAKUSHOU();
				ADORESU = A004O14insertKAISYAEntity.getADORESU();
				RENRAKUSAKI = A004O14insertKAISYAEntity.getRENRAKUSAKI();
				SHIHARAIKIGEN = A004O14insertKAISYAEntity.getSHIHARAIKIGEN();
				KAISHAKUBUN = A004O14insertKAISYAEntity.getKAISHAKUBUN();
				KAISHAID = A004O14insertKAISYAEntity.getKAISHAID();
				LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
				try {
					
					A004O14insertKAISYADao.A004O14insertKAISYA (KAISHAMEI,KAISHARYAKUSHOU,ADORESU,RENRAKUSAKI,SHIHARAIKIGEN,KAISHAKUBUN,KAISHAID);
				} catch (Exception e) {
					LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
					errMsgSB.append(lineNum).append("行目のデータをインポートする時にエラーが発生しました。").append("\n").append("\t").append(KAISHAMEI).append(",").append(KAISHARYAKUSHOU).append(",").append(ADORESU).append(",").append(RENRAKUSAKI).append(",").append(SHIHARAIKIGEN).append(",").append(KAISHAKUBUN).append(",").append(KAISHAID).append("\n");
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
			A004O14insertKAISYAEntityList = null;
			errMsgSB = null;
			KAISHAID = null;
			KAISHAKUBUN = null;
			A004O14insertKAISYAEntity = null;
			KAISHARYAKUSHOU = null;
			RENRAKUSAKI = null;
			cleanDataBeforeImport = null;
			KAISHAMEI = null;
			ADORESU = null;
		}
	}
}