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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005.A005C9deleteBUMONDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005.A005C9insertBUMONDao;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A005.A005C9insertBUMONEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A005C9ImportService
 * @version

 */

@Service
public class A005C9ImportService {
	@Autowired
	private A005C9deleteBUMONDao A005C9deleteBUMONDao;
	@Autowired
	private A005C9insertBUMONDao A005C9insertBUMONDao;

   
	@Log
	private void setDataA005C9insertBUMONEntity (ArrayList<String> dataListStr, ArrayList<A005C9insertBUMONEntity> A005C9insertBUMONEntityList) throws Exception {

		A005C9insertBUMONEntity A005C9insertBUMONEntity = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			if (dataListStr != null && dataListStr.size() >= 2) {
				A005C9insertBUMONEntity = new A005C9insertBUMONEntity();
				A005C9insertBUMONEntity.setBUMONID(dataListStr.get(0));
				A005C9insertBUMONEntity.setBUMONMEI(dataListStr.get(1));
				A005C9insertBUMONEntityList.add(A005C9insertBUMONEntity);
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			A005C9insertBUMONEntity = null;
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
	private void readImportFile (HttpServletRequest request, MultipartFile[] files, ArrayList<A005C9insertBUMONEntity> A005C9insertBUMONEntityList) throws Exception {

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
						setDataA005C9insertBUMONEntity(dataListStr, A005C9insertBUMONEntityList);
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
	public void A005C9Import (MultipartFile[] files, HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		ArrayList<A005C9insertBUMONEntity> A005C9insertBUMONEntityList = null;
		A005C9insertBUMONEntity A005C9insertBUMONEntity = null;
		StringBuffer errMsgSB = null;
		int lineNum = 0;
		String cleanDataBeforeImport = null;
		String BUMONID = null;
		String BUMONMEI = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			lineNum = 1;
			A005C9insertBUMONEntityList = new ArrayList<A005C9insertBUMONEntity>();
			errMsgSB = new StringBuffer();
			cleanDataBeforeImport = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("cleanDataBeforeImport")));
			readImportFile(request,files, A005C9insertBUMONEntityList);
			if ("1".equals(cleanDataBeforeImport)) {
				
				A005C9deleteBUMONDao.A005C9deleteBUMON ();
			}
			for (int i = 0; i < A005C9insertBUMONEntityList.size();i++) {
				lineNum = i + 1 + 0;
				A005C9insertBUMONEntity = A005C9insertBUMONEntityList.get(i);
				
				BUMONID = A005C9insertBUMONEntity.getBUMONID();
				BUMONMEI = A005C9insertBUMONEntity.getBUMONMEI();
				LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
				try {
					
					A005C9insertBUMONDao.A005C9insertBUMON (BUMONID,BUMONMEI);
				} catch (Exception e) {
					LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
					errMsgSB.append(lineNum).append("行目のデータをインポートする時にエラーが発生しました。").append("\n").append("\t").append(BUMONID).append(",").append(BUMONMEI).append("\n");
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
			errMsgSB = null;
			A005C9insertBUMONEntity = null;
			BUMONMEI = null;
			A005C9insertBUMONEntityList = null;
			BUMONID = null;
			cleanDataBeforeImport = null;
		}
	}
}