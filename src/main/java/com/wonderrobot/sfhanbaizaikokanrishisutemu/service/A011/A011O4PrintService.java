package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A011;
import javax.servlet.http.HttpServletRequest;
import com.wonderfulfly.core.util.log.LoggerUtil;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wonderfulfly.core.json.JSONWFCObject;
import com.wonderfulfly.core.util.StringUtil;
import org.springframework.transaction.annotation.Transactional;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.ConfigEntity;
import com.wonderfulfly.common.FileDownLoadJsonSet;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011O4I00017PrintEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A011.A011O4I00017PrintDao;
import javax.imageio.ImageIO;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.formula.FormulaParser;
import org.apache.poi.ss.formula.FormulaParsingWorkbook;
import org.apache.poi.ss.formula.FormulaRenderer;
import org.apache.poi.ss.formula.FormulaRenderingWorkbook;
import org.apache.poi.ss.formula.FormulaType;
import org.apache.poi.ss.formula.ptg.AreaPtgBase;
import org.apache.poi.ss.formula.ptg.Ptg;
import org.apache.poi.ss.formula.ptg.RefPtgBase;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FontFormatting;
import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.ss.usermodel.PrintSetup;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFBorderFormatting;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormatting;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormattingRule;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheetConditionalFormatting;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import com.wonderfulfly.core.constant.FileConstant;
import com.wonderfulfly.core.constant.JsonConstant;
import com.wonderfulfly.core.constant.SessionConstant;
import com.wonderfulfly.core.constant.StringConst;
import com.wonderfulfly.core.constant.SystemConstant;
import com.wonderfulfly.core.constant.ViewConstant;
import com.wonderfulfly.core.constant.saasforce.ManageConstant;
import com.wonderfulfly.core.exception.ExcelPrintException;
import com.wonderfulfly.core.lang.PageLabelUtil;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderfulfly.core.util.HashMapUtil;
import com.wonderfulfly.core.util.RegexpUtil;
import com.wonderfulfly.core.util.fileimport.Excel;
import java.io.FileInputStream;
import com.google.zxing.EncodeHintType;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.OutPutDataConstant;
import com.wonderfulfly.common.Utility;
import com.wonderfulfly.common.InsertExcel;
import com.wonderfulfly.common.QRCodeGenerator;
import com.wonderfulfly.common.InOutPrintBean;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.SpringPropertiesUtil;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A011O4PrintService
 *      Page: 注文管理詳細
 * @version

 */

@Service
public class A011O4PrintService {
	@Autowired
	private A011O4I00017PrintDao A011O4I00017PrintDao;
	private Workbook wb;
	private HashMap<String,String> CopyRowInfo;
	private ArrayList<String> printFileSheetNameList;
	private HashMap<String,String> printFileSheetNameMap;
	private String TemplateFileFullPath;
	@Autowired
	private ConfigEntity ConfigEntity;
	@Autowired
	private OutPutDataConstant OutPutDataConstant;

   
	@Log
	public void A011O4Print (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String outFilePath = null;
		String outFileID = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			outFilePath = ConfigEntity.getPrint_file_path();
			//エクスポート
			outFileID = outputFile(request, outFilePath, jsonObj);
			
			//download
			FileDownLoadJsonSet.setPrintJsonObj(outFileID, jsonObj);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			outFileID = null;
			outFilePath = null;
		}
	}

   
	@Log
	private ArrayList<ArrayList<String>> P0001315ChangeToArraList (List<A011O4I00017PrintEntity> A011O4I00017PrintEntityList) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			ArrayList<ArrayList<String>> outDataAy = new ArrayList<ArrayList<String>>();
			ArrayList<String> sellist = null;
			if (A011O4I00017PrintEntityList != null && A011O4I00017PrintEntityList.size() > 0) {
				for (int i = 0;i < A011O4I00017PrintEntityList.size();i++) {
					A011O4I00017PrintEntity A011O4I00017PrintEntity = A011O4I00017PrintEntityList.get(i);
					sellist = new ArrayList<String>();
					sellist.add(StringUtil.changeNullToBlank(A011O4I00017PrintEntity.getBUHIN_KOUJIKANRIBANGOU1()));
					sellist.add(StringUtil.changeNullToBlank(A011O4I00017PrintEntity.getBUHIN_TOKUISAKI2()));
					sellist.add(StringUtil.changeNullToBlank(A011O4I00017PrintEntity.getSHAIN_SHAINMEI3()));
					sellist.add(StringUtil.changeNullToBlank(A011O4I00017PrintEntity.getCHUUBUNSHO_HINMEI4()));
					sellist.add(StringUtil.changeNullToBlank(A011O4I00017PrintEntity.getCHUUBUNSHO_MITSUMORISHONO5()));
					outDataAy.add(sellist);
				}
			}
			return outDataAy;
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
	}

   
	@Log
	public void A011O4PrintService () throws Exception {

		printFileSheetNameList = new ArrayList<String>();
		printFileSheetNameMap = new HashMap<String, String>();
	}

   
	@Log
	private String getOutFileID (String fileName, String timeStep, int i, String fileExt) throws Exception {

		StringBuffer sBuffer = new StringBuffer();
		String outFileID = null;
		sBuffer.append(fileName).append("_").append(timeStep).append(i).append(fileExt);
		outFileID = sBuffer.toString();
		return outFileID;
	}

   
	@Log
	private void newWorkBook (File file) throws Exception {

		Excel excel = new Excel();
		String version = excel.getExcelVersion(file);
		if (version.equals(SystemConstant.EXCEL_VERSION_XLSX) || version.equals(SystemConstant.EXCEL_VERSION_XLSM)) {
			wb = new XSSFWorkbook(file);
		} else if (version.equals(SystemConstant.EXCEL_VERSION_XLS)) {
			POIFSFileSystem fs = new POIFSFileSystem(file);
			wb = new HSSFWorkbook(fs);
		}
	}

   
	@Log
	private String getOutFileIDByPrintName (String printFileName, String outFileID, String timeStamp, ArrayList<InOutPrintBean> alViewCell, ArrayList<ArrayList<String>> alViewData, HttpServletRequest uRequest) throws Exception {

		HashMap<String, String> hmFileSeqNum = null;
		String extension = null;
		StringBuffer sBuffer = new StringBuffer();
		if (!StringUtil.isNullOrBlank(printFileName)) {
			hmFileSeqNum = getSheetNameReplace(alViewCell, printFileName);
			extension = outFileID.substring(outFileID.lastIndexOf("."));
			if (alViewData != null && alViewData.size() > 0) {
				outFileID = changeNameByDborParam(uRequest, printFileName, hmFileSeqNum, alViewData.get(0));
				sBuffer.append(outFileID).append("_").append(timeStamp).append(extension);
				outFileID = sBuffer.toString();
			}
		} 
		return outFileID;
	}

   
	@Log
	private String writeExcel (ArrayList<ArrayList<String>> outDataAy, File file, String outFilePath, String outFileID, String timeStamp, HttpServletRequest request) throws Exception {

		int numOfSheets = 0;
		ArrayList<InOutPrintBean> alViewCell = null;
		FileOutputStream outPutStream = null;
		String outFileFullPath = null;
		String beginRow = null;
		String endRow = null;
		String districtFlg = null;
		String pagingFlg = null;
		String pagingRows = null;
		String printFileName = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			beginRow = "4";
			endRow = "4";
			districtFlg = "1";
			pagingFlg = "";
			pagingRows = "";
			printFileName = "";
			
			newWorkBook(file);
			numOfSheets = wb.getNumberOfSheets();
			alViewCell = getAlViewCell8();
			setTemplateViewData(alViewCell, outDataAy, numOfSheets, beginRow, endRow, districtFlg, pagingFlg, pagingRows, printFileName, request);
			outFileID = getOutFileIDByPrintName(printFileName, outFileID, timeStamp, alViewCell, outDataAy, request);
			outFileFullPath = outFilePath + "/" + outFileID;
			outPutStream = new FileOutputStream(outFileFullPath);
			wb.write(outPutStream);
			outPutStream.close();
			return outFileID;
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			districtFlg = null;
			outFileFullPath = null;
			beginRow = null;
			printFileName = null;
			endRow = null;
			pagingFlg = null;
			pagingRows = null;
			outPutStream = null;
			alViewCell = null;
		}
	}

   
	@Log
	private void setTemplateViewData (ArrayList<InOutPrintBean> alViewCell, ArrayList<ArrayList<String>> alViewData, int numOfSheets, String beginRowIn, String endRowIn, String districtFlg, String pagingFlg, String pagingRows, String printFileName, HttpServletRequest uRequest) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		String dataValue = null;
		ArrayList<String> alRowData = null;
		InOutPrintBean alRowDataTmp = null;
		ArrayList<InOutPrintBean> alTemplateList = null;
		InOutPrintBean alListProperty = null;
		HashMap<String, InOutPrintBean> hmTemplateListInfo = new HashMap<String, InOutPrintBean>();
		StringBuffer sbLevel0Pos = new StringBuffer();
		StringBuffer sbLevel1Pos = null;
		String dataLevel0 = "";
		HashMap<String, ArrayList<String>> hmLevel0Data = new HashMap<String, ArrayList<String>>();
		HashMap<String, HashMap<String, ArrayList<ArrayList<String>>>> hmLevel0DataWithLevel1 = new HashMap<String, HashMap<String, ArrayList<ArrayList<String>>>>();
		HashMap<String, StringBuffer> hmList = new HashMap<String, StringBuffer>();
		HashMap<String, ArrayList<ArrayList<String>>> hmListData = null;
		HashMap<String, InOutPrintBean> hmCellName = new HashMap<String, InOutPrintBean>();
		Set<String> keySetLvl1 = null;
		Iterator<String> keyIteLvl1 = null;
		Object keyLvl1 = null;
		Cell cell = null;
		String sheetName = "";
		String cellName = "";
		Sheet sheet = null;
		StringBuffer sLevel1Pos = null;

		ArrayList<String> alListL0 = new ArrayList<String>();
		ArrayList<String> keyLvl0value = null;
		ArrayList<ArrayList<String>> alLevel1Data = null;
		ArrayList<String> keyLvl1value = null;
		int i = 0;
		int j = 0;
		int k = 0;
		int seqnum = 0;
		String listName = "";
		Map<String, String> sheetNameMap = new HashMap<String, String>();
		String templateSheetName = "";
		HashMap<String, String> hmSheetSeqNum = null;
		HashMap<String, String> hmFileSeqNum = null;
		String dataType = "";
		HashMap<String, String> dataTypeMap = new HashMap<String, String>();
		try {
			alTemplateList = getalTemplateList();
			hmTemplateListInfo = setHashMapFromArrayList(0, hmTemplateListInfo, alTemplateList, "templateList");


			hmCellName = setHashMapFromArrayList(6, hmCellName, alViewCell, "viewCell");

			if (!StringUtil.isNullOrBlank(alViewCell.get(0).getPrint_file_sheet_name())) {
				hmSheetSeqNum = getSheetNameReplace(alViewCell, alViewCell.get(0).getPrint_file_sheet_name());
			}
			for (j = 0; j < alViewCell.size(); j++) {
				alRowDataTmp = alViewCell.get(j);
				dataType = StringUtil.changeNullToBlank(alRowDataTmp.getData_type());
				seqnum = StringUtil.changeStringToInt(alRowDataTmp.getSeqnum()) - 1;
				listName = alRowDataTmp.getList_name();

				cellName = alRowDataTmp.getCell_num();

				dataTypeMap.put(cellName, dataType);
				templateSheetName = alRowDataTmp.getSheet_name();

				if (!sheetNameMap.containsKey(templateSheetName)) {
					String outputSheetName = alRowDataTmp.getPrint_file_sheet_name();
					if (StringUtil.isNullOrBlank(outputSheetName)) {
						sheetNameMap.put(templateSheetName, StringConst.STRING_OF_BLANK);
					} else {
						sheetNameMap.put(templateSheetName, alRowDataTmp.getPrint_file_sheet_name());
					}
				}

				if (StringUtil.isNullOrBlank(listName)) {
					if (sbLevel0Pos.length() > 0) {
						sbLevel0Pos.append(",").append(seqnum);
					} else {
						sbLevel0Pos.append(seqnum);
					}

				} else { //Level1
					if (!hmList.containsKey(listName)) {
						sbLevel1Pos = new StringBuffer();
						sbLevel1Pos.append(seqnum);
						hmList.put(listName, sbLevel1Pos);
					} else {
						sbLevel1Pos = hmList.get(listName);
						sbLevel1Pos.append(",").append(seqnum);
						hmList.put(listName, sbLevel1Pos);
					}
				}
			}


			listName = null;

			String[] hL0 = sbLevel0Pos.toString().split(",");
			String[] hL1 = null;
			int num = 0;
			for (i = 0; i < alViewData.size(); i++) {
				alRowData = alViewData.get(i);

				if (hL0.length > 0 && !StringUtil.isNullOrBlank(hL0[0])) {
					dataLevel0 = getLevel0(hL0, alRowData);

				} else {
					dataLevel0 = "";
				}

				if (!hmLevel0Data.containsKey(dataLevel0)) {
					hmListData = new HashMap<String, ArrayList<ArrayList<String>>>();
					hmLevel0Data.put(dataLevel0, alRowData);
					alListL0.add(dataLevel0);
					hmListData = gethmListData(hmListData, hmList, sbLevel1Pos, alRowData);
					initSheetCopy(numOfSheets, num, sheetNameMap, uRequest, alRowData, hmSheetSeqNum);
					num++;
				} else {
					hmListData = hmLevel0DataWithLevel1.get(dataLevel0);
					hmListData = gethmListData(hmListData, hmList, sbLevel1Pos, alRowData);
				}

				hmLevel0DataWithLevel1.put(dataLevel0, hmListData);

			}


			int lvl0Cnt = 0;
			int listDataCnt = 0;

			lvl0Cnt = 0; 
			listDataCnt = 0;

			for (k = 0; k < alListL0.size(); k++) {
				dataLevel0 = alListL0.get(k);
				keyLvl0value = hmLevel0Data.get(dataLevel0);

				for (i = 0; i < hL0.length; i++) {

					if (!StringUtil.isNullOrBlank(hL0[i])) {
						dataValue = getDataValue(hL0[i], keyLvl0value);
						cellName = hmCellName.get(String.valueOf(StringUtil.changeStringToInt(hL0[i]) + 1)).getCell_num();
						dataType = dataTypeMap.get(cellName);
						if (!StringUtil.isNullOrBlank(cellName) && !"-".equals(cellName)) {

							if (lvl0Cnt == 0) {
								sheetName = hmCellName.get(String.valueOf(StringUtil.changeStringToInt(hL0[i]) + 1)).getSheet_name();

								if (printFileSheetNameMap != null && printFileSheetNameMap.size() > 0) {
									sheetName = printFileSheetNameMap.get(sheetName);
								}
								if (StringUtil.isNullOrBlank(sheetName)) {
									sheetName = printFileSheetNameList.get(lvl0Cnt);
								}
							} else {
								if (printFileSheetNameList != null && printFileSheetNameList.size() > 0) {
									sheetName = printFileSheetNameList.get(lvl0Cnt);
								} else {
									sheetName = hmCellName.get(String.valueOf(StringUtil.changeStringToInt(hL0[i]) + 1)).getSheet_name() + "_" + lvl0Cnt;
								}
							}

							cell = getCell(sheetName, cellName, null, listDataCnt);
							if (!StringUtil.isNullOrBlank(dataValue)) {
								setCellContent(cell, dataValue, dataType, cellName);
							} else {
								setCellContent(cell, "", dataType, cellName);
							}
						}
					}
				}

				hmListData = hmLevel0DataWithLevel1.get(dataLevel0); 

				keySetLvl1 = hmListData.keySet(); 
				keyIteLvl1 = keySetLvl1.iterator();

				int intMaxDataCnt = 0;
				int intCurrListPageDataCnt = 0;
				int intListPageDataCnt = 0;
				int intPageCnt = 0;
				int intBeginRow = 0;
				int intEndRow = 0;
				int intTempBeginRow = 0;
				int intTempEndRow = 0;
				int intCnt = 0;

				while (keyIteLvl1.hasNext()) {
					keyLvl1 = keyIteLvl1.next();
					alLevel1Data = hmListData.get(keyLvl1); 
					alListProperty = hmTemplateListInfo.get(keyLvl1);

					if (alListProperty != null) {
						if (alListProperty.getList_data_per_page() != null) {
							intListPageDataCnt = Integer.parseInt(alListProperty.getList_data_per_page());
						} else {
							intListPageDataCnt = 0;
						}
					} else {
						intListPageDataCnt = 0;
					}

					if (intMaxDataCnt < alLevel1Data.size()) {
						intMaxDataCnt = alLevel1Data.size();
					}

					if (intCnt == 0) {
						intCurrListPageDataCnt = intListPageDataCnt;
					}

					if (intCurrListPageDataCnt > intListPageDataCnt) {
						intCurrListPageDataCnt = intListPageDataCnt;
					}

					intCnt++;

				}

				if (intCurrListPageDataCnt != 0) {
					if (intMaxDataCnt % intCurrListPageDataCnt == 0) {
						intPageCnt = intMaxDataCnt / intCurrListPageDataCnt;
					} else {
						intPageCnt = intMaxDataCnt / intCurrListPageDataCnt + 1;
					}
				} else {
					intPageCnt = 1;
				}

				if (StringUtil.isNullOrBlank(sheetName)) {
					sheetName = alViewCell.get(0).getSheet_name();
				}
				if (districtFlg != null && districtFlg.equals("1")) {
					intBeginRow = Integer.parseInt(beginRowIn) - 1;
					intEndRow = Integer.parseInt(endRowIn) - 1;
				} else {
					intBeginRow = wb.getSheet(sheetName).getFirstRowNum();
					intEndRow = wb.getSheet(sheetName).getLastRowNum();
				}

				int endCol = 0;
				int cols = 0;
				int rows = wb.getSheet(sheetName).getLastRowNum();
				Row row;

				int dataNum = 0;
				if (alListProperty != null) {
					dataNum = StringUtil.changeStringToInt(alListProperty.getList_extend_method());
				}
				if (dataNum == 0) {
					dataNum = 1;
				}
				for (i = 0; i < rows; i++) {
					row = wb.getSheet(sheetName).getRow(i);
					if (row == null)
						continue;
					cols = row.getLastCellNum();
					if (cols > endCol) {
						endCol = cols;
					}
				}

				String tagetsheetName = "";

				if (lvl0Cnt == 0) {
					tagetsheetName = printFileSheetNameList.get(lvl0Cnt);
				} else {
					if (printFileSheetNameList != null && printFileSheetNameList.size() > 0) {
						tagetsheetName = printFileSheetNameList.get(lvl0Cnt);
					} else {
						tagetsheetName = hmCellName.get(String.valueOf(StringUtil.changeStringToInt(hL0[i]) + 1)).getSheet_name() + "_" + lvl0Cnt;
					}
				}

				if (districtFlg != null && districtFlg.equals("1")) {

					if (intCurrListPageDataCnt == 0) {
						if (intMaxDataCnt > 1) {

							for (int intI = 1; intI < intMaxDataCnt; intI++) {

								copyRows(sheetName, tagetsheetName, intBeginRow, intEndRow, intBeginRow + (intEndRow - intBeginRow + 1) * intI, intI);
							}

						}
					} else {

						if (intPageCnt > 1) {
							for (int intI = 1; intI < intPageCnt; intI++) {
								copyRows(sheetName, tagetsheetName, intBeginRow, intEndRow, intBeginRow + (intEndRow - intBeginRow + 1) * intI, intI);
							}

						}
					}

				}

				if ("1".equals(pagingFlg)) {
					if (intPageCnt > 1) {
						for (int intI = 1; intI < intPageCnt; intI++) {
							wb.getSheet(sheetName).setRowBreak(Integer.parseInt(pagingRows, 10) * intI - 1);
						}
						wb.setPrintArea(wb.getSheetIndex(sheetName), 0, endCol,
										0, Integer.parseInt(pagingRows, 10) * intPageCnt - 1);
					}
				}

				keySetLvl1 = hmListData.keySet(); 
				keyIteLvl1 = keySetLvl1.iterator();
				while (keyIteLvl1.hasNext()) {
					keyLvl1 = keyIteLvl1.next();

					alLevel1Data = hmListData.get(keyLvl1); 
					sLevel1Pos = null;
					sLevel1Pos = hmList.get(keyLvl1);
					alListProperty = hmTemplateListInfo.get(keyLvl1);

					hL1 = sLevel1Pos.toString().split(","); 

					listDataCnt = 0; 

					if (alListProperty != null) {
						if (alListProperty.getList_data_per_page() != null) {
							intListPageDataCnt = Integer.parseInt((String) alListProperty.getList_data_per_page());
						} else {
							intListPageDataCnt = 0;
						}

					} else {
						intListPageDataCnt = 0;
					}

					int intPage = 1; 

					for (j = 0; j < alLevel1Data.size(); j++) {
						keyLvl1value = alLevel1Data.get(j); 
						if (intCurrListPageDataCnt != 0) {
							if (intListPageDataCnt != 0) {
								if ((listDataCnt + 1) > intListPageDataCnt) {
									if ((listDataCnt + 1) % intListPageDataCnt == 0) {
										intPage = (listDataCnt + 1) / intListPageDataCnt;
									} else {
										intPage = (listDataCnt + 1) / intListPageDataCnt + 1;
									}
								} else {
									intPage = 1;
								}
							} else {
								intPage = 1;
							}
						} else {
							intPage = 1;
						}

						for (i = 0; i < hL1.length; i++) {

							dataValue = getDataValue(hL1[i], keyLvl1value);
							cellName = hmCellName.get(String.valueOf(StringUtil.changeStringToInt(hL1[i]) + 1)).getCell_num();

							if (!StringUtil.isNullOrBlank(cellName)) {

								dataType = dataTypeMap.get(cellName);


								if (lvl0Cnt == 0) {
									sheetName = hmCellName.get(String.valueOf(StringUtil.changeStringToInt(hL1[i]) + 1)).getSheet_name();
									if (printFileSheetNameMap != null && printFileSheetNameMap.size() > 0) {
										sheetName = printFileSheetNameMap.get(sheetName);
									}
									if (StringUtil.isNullOrBlank(sheetName)) {
										sheetName = printFileSheetNameList.get(lvl0Cnt);
									}

								} else {
									if (printFileSheetNameList != null && printFileSheetNameList.size() > 0) {
										sheetName = printFileSheetNameList.get(lvl0Cnt);
									} else {
										sheetName = hmCellName.get(String.valueOf(StringUtil.changeStringToInt(hL0[i]) + 1)).getSheet_name() + "_" + lvl0Cnt;
									}
								}

								if (!StringUtil.isNullOrBlank(dataValue)) {
									if (alListProperty != null) {

										cell = getCellObject(sheetName, cellName, alListProperty.getList_extend_method(),
														listDataCnt, intBeginRow, intEndRow, intPage, intListPageDataCnt,
														districtFlg, intCurrListPageDataCnt, intTempBeginRow, intTempEndRow, dataNum);

									} else {
										cell = getCell(sheetName, cellName, null, listDataCnt);
									}
									setCellContent(cell, dataValue, dataType, cellName);
								}
							}

						}
						listDataCnt += dataNum;
					}
				}
				lvl0Cnt++;

			}

			for (int m = 0; m < wb.getNumberOfSheets(); m++) {
				sheet = wb.getSheetAt(m);
				sheet.setForceFormulaRecalculation(true);
			}

			String firstSheet = StringConst.STRING_OF_BLANK;
			for (Entry<String, String> entry : sheetNameMap.entrySet()) {
				int sheetseq = -1;
				if ((sheetseq = wb.getSheetIndex(entry.getKey())) > -1) {
					wb.removeSheetAt(wb.getSheetIndex(entry.getKey()));
				}
				firstSheet = entry.getKey() + "_0";
				if ((sheetseq = wb.getSheetIndex(firstSheet)) > -1) {
					wb.setSheetName(sheetseq, entry.getKey());
				}
			}

		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			alRowDataTmp = null;
			alTemplateList = null;
			alListProperty = null;
			hmTemplateListInfo = null;
			sbLevel0Pos = null;
			sbLevel1Pos = null;
			hmLevel0Data = null;
			hmLevel0DataWithLevel1 = null;
			hmList = null;
			hmListData = null;
			keySetLvl1 = null;
			keyIteLvl1 = null;
			keyLvl1 = null;
			cell = null;
			sheet = null;

			alListL0 = null;
			keyLvl0value = null;
			alLevel1Data = null;
			keyLvl1value = null;
		}
	}

   
	@Log
	private HashMap<String, ArrayList<ArrayList<String>>> gethmListData (HashMap<String, ArrayList<ArrayList<String>>> hmListData, HashMap<String, StringBuffer> hmList, StringBuffer sbLevel1Pos, ArrayList<String> alRowData) throws Exception {

		Set<String> keySet = null;
		Iterator<String> keyIte = null;
		String key = null;
		ArrayList<ArrayList<String>> alLevel1Data = null;

		if (hmList.size() > 0) {
			keySet = hmList.keySet();
			keyIte = keySet.iterator();
			while (keyIte.hasNext()) {
				key = keyIte.next(); 
				sbLevel1Pos = (StringBuffer) hmList.get(key);   
				if (sbLevel1Pos.length() > 0) {

					if (hmListData.get(key) == null) {
						alLevel1Data = new ArrayList<ArrayList<String>>();
					} else {
						alLevel1Data = hmListData.get(key);
					}
					alLevel1Data.add(alRowData);
					hmListData.put(key, alLevel1Data); 
				}
			}
		}
		return hmListData;
	}

   
	@Log
	private String getLevel0 (String[] hL0, ArrayList<String> alRowData) throws Exception {

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < hL0.length; i++) {
			sb.append(alRowData.get(StringUtil.changeStringToInt(hL0[i])));
		}
		return sb.toString();
	}

   
	@Log
	private String getDataValue (String pos, ArrayList<String> alRowData) throws Exception {

		return alRowData.get(StringUtil.changeStringToInt(pos));
	}

   
	@Log
	private void setPrintSetupByOri (Sheet sheetHssf, Sheet sheetNew) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		PrintSetup printSetupHssf = null;
		PrintSetup printSetup = null;
		try {
			printSetup = sheetNew.getPrintSetup();

			printSetupHssf = sheetHssf.getPrintSetup();
			printSetup.setPaperSize(printSetupHssf.getPaperSize());

			printSetup.setHeaderMargin(printSetupHssf.getHeaderMargin());
			printSetup.setFooterMargin(printSetupHssf.getFooterMargin());

			printSetup.setScale(printSetupHssf.getScale());
			printSetup.setFitHeight(printSetupHssf.getFitHeight());
			printSetup.setFitWidth(printSetupHssf.getFitWidth());
			printSetup.setLandscape(printSetupHssf.getLandscape());
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			printSetupHssf = null;
		}
	}

   
	@Log
	private void initSheetCopy (int numOfSheets, int num, Map<String, String> sheetNameMap, HttpServletRequest uRequest, ArrayList<String> alViewData, HashMap<String, String> printSheetSeqNum) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		String sheetName = "";
		try {

			for (Entry<String, String> entry : sheetNameMap.entrySet()) {
				Sheet sheet = wb.cloneSheet(wb.getSheetIndex(entry.getKey()));
				setPrintSetupByOri(wb.getSheet(entry.getKey()), sheet);
				if (!StringUtil.isNullOrBlank(entry.getValue())) {
					sheetName = changeNameByDborParam(uRequest, entry.getValue(), printSheetSeqNum, alViewData);
				} else {
					sheetName = wb.getSheetName(wb.getSheetIndex(entry.getKey()));
					sheetName += "_" + num;
				}
				printFileSheetNameMap.put(sheetName, sheetName);
				printFileSheetNameList.add(sheetName);
				wb.setSheetName(wb.getSheetIndex(sheet), sheetName);

			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			sheetName = null;
		}
	}

   
	@Log
	private String changeNameByDborParam (HttpServletRequest uRequest, String printFileName, HashMap<String, String> printSheetSeqNum, ArrayList<String> alViewData) throws Exception {

		String remain = "";
		String pdflg = null;
		String pdParam = null;
		int index = 0;
		int index2 = 0;
		StringBuilder sheetName = new StringBuilder();

		if (!StringUtil.isNullOrBlank(printFileName)) {

			remain = printFileName;
			index = remain.indexOf("[");
			while (index > -1) {
				index = remain.indexOf("[");

				if (index > -1 && remain.length() > (index + 3)) {
					pdflg = remain.substring(index + 1, index + 3).toLowerCase();
					sheetName.append(remain.substring(0, index));
					remain = remain.substring(index);
					index2 = remain.indexOf("]");
					if (index2 > -1) {
						pdParam = remain.substring(3, index2);

						if ("p:".equals(pdflg)) {
							sheetName.append(StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(uRequest.getParameter(pdParam)).replaceAll(" ", "").replaceAll("　", "")));
							remain = remain.substring(index2 + 1);
						} else if ("d:".equals(pdflg)) {
							if (printSheetSeqNum != null && printSheetSeqNum.size() > 0) {
								sheetName.append(StringUtil.changeNullToBlank(alViewData.get(StringUtil.changeStringToInt(printSheetSeqNum.get(pdParam)) - 1)).replaceAll(" ", "").replaceAll("　", ""));
							}
							remain = remain.substring(index2 + 1);
						} else {
							sheetName.append(remain.substring(0, 1));
							remain = remain.substring(1);
						}

					} else {
						index = -1;
						sheetName.append(remain);
					}
				} else {
					index = -1;
					sheetName.append(remain);
				}

			}
			if (sheetName.length() == 0) {
				sheetName.append(printFileName);
			}
		}
		remain = null;
		pdflg = null;
		pdParam = null;
		return sheetName.toString();
	}

   
	@Log
	private HashMap<String, String> getDataBaseParam (String printFileName, HashMap<String, InOutPrintBean> hmFieldSeq) throws Exception {

		String remain = "";
		String pdflg = null;
		String seq = null;
		int index = 0;
		int index2 = 0;
		String dbparam = null;
		HashMap<String, String> rev = new HashMap<String, String>();
		if (!StringUtil.isNullOrBlank(printFileName)) {

			remain = printFileName;
			index = remain.indexOf("[");
			while (index > -1) {

				if (index > -1 && remain.length() > 3) {
					pdflg = remain.substring(index + 1, index + 3).toLowerCase();
					index2 = remain.indexOf("]");
					if (index2 > -1) {
						if ("d:".equals(pdflg.toLowerCase())) {
							dbparam = remain.substring(index + 3, index2);
							if (hmFieldSeq.containsKey(dbparam)) {
								seq = hmFieldSeq.get(dbparam).getSeqnum();
								rev.put(dbparam, seq);
							}
						}

					} else {
						break;
					}
				} else {
					break;
				}
				remain = remain.substring(index2 + 1);
				index = remain.indexOf("[");
			}
		}
		remain = null;
		pdflg = null;
		return rev;
	}

   
	@Log
	private void setCellContent (Cell cell, String cellValue, String dataType, String cellName) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		CellStyle cellstyle = null;
		try {
			cellstyle = cell.getCellStyle();
			if (!StringUtil.isNullOrBlank(cellValue)) {

				if (("3".equals(dataType) || "6".equals(dataType)) && ((RegexpUtil.isDateString(cellValue) ||
																		RegexpUtil.isDateTimeString(cellValue) ||
					RegexpUtil.isTimeString(cellValue)
					) && DateUtil.getDateFromStr(cellValue) != null)) {
					cell.setCellValue((Date) DateUtil.getDateFromStr(cellValue).getTime());

				} else if ("2".equals(dataType) && ((RegexpUtil.isInteger(cellValue)
														&& cellstyle != null
														&& cellstyle.getDataFormatString() != null
														&& !cellstyle.getDataFormatString().equals("General")))) {
					cell.setCellValue(StringUtil.parseDouble(cellValue));

				} else if ("5".equals(dataType) && (RegexpUtil.isDouble(cellValue) || RegexpUtil.isInteger(cellValue)
																						&& cellstyle != null
																						&& cellstyle.getDataFormatString() != null
																						&& !cellstyle.getDataFormatString().equals("General"))) {
					cell.setCellValue(StringUtil.parseDouble(cellValue));

				} else if ("10".equals(dataType) || "11".equals(dataType) || "12".equals(dataType)) {

					BufferedImage image = null;
					CellRangeAddress range = null;
					String imagePath = "";
					String filePath = "";
					String fileId = "";
					String foldID = "";
					ArrayList<ArrayList<String>> alRstFile = null;
					try {
						Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
						hints.put(EncodeHintType.CHARACTER_SET, "utf-8");

						range = Utility.getRangeIfMerge(cell);
						if ("10".equals(dataType)) {
							image = new InsertExcel().DataBarcode(cellValue);
						} else if ("11".equals(dataType)) {
							image = new QRCodeGenerator().generateQRCodeImage(cellValue, 350, 350, hints);
						} else if ("12".equals(dataType)) {
							image = getImageFile(cellValue);
						}
						if (image != null) {
							ImagePrint(cell, image, range);
						}
					} finally {
						image = null;
						range = null;
						alRstFile = null;
					}
				} else {
					cell.setCellValue(cellValue);
				}

			} else {
				cell.setCellValue("");
			}
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			cellstyle = null;
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
	}

   
	@Log
	private void ImagePrint (Cell cell, BufferedImage image, CellRangeAddress range) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		short x1 = 0;
		short y1 = 0;
		short x2 = 0;
		short y2 = 0;

		XSSFDrawing patriarch = null;
		ByteArrayOutputStream byteArrayOutputStream = null;
		XSSFClientAnchor anchor = null;
		byte[] pictureData = null;

		try {
			byteArrayOutputStream = new ByteArrayOutputStream();
			ImageIO.write(image, "PNG", byteArrayOutputStream);
			patriarch = (XSSFDrawing) cell.getSheet().createDrawingPatriarch();
			if (range != null) {
				x1 = (short) range.getFirstColumn();
				y1 = (short) range.getFirstRow();
				x2 = (short) (range.getLastColumn() + 1);
				y2 = (short) (range.getLastRow() + 1);
			} else {
				x1 = (short) cell.getColumnIndex();
				y1 = (short) cell.getRowIndex();
				x2 = (short) (cell.getColumnIndex() + 1);
				y2 = (short) (cell.getRowIndex() + 1);
			}
			int yInEMU = 2 * XSSFShape.EMU_PER_PIXEL;
			anchor = new XSSFClientAnchor(yInEMU, yInEMU, yInEMU * -1, yInEMU * -1, (short) x1, y1, (short) x2, y2);

			pictureData = byteArrayOutputStream.toByteArray();
			int pictureFormat = XSSFWorkbook.PICTURE_TYPE_PNG;
			int pictureIndex = wb.addPicture(pictureData, pictureFormat);
			patriarch.createPicture(anchor, pictureIndex);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			byteArrayOutputStream = null;
			patriarch = null;
			anchor = null;
			pictureData = null;
		}
	}

   
	@Log
	private Cell getCell (String sheetName, String excelRowCol, String extendFlg, int cnt) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		char[] chletter = excelRowCol.toCharArray();
		String charRow = "";
		Sheet hSheet = null;
		Row row = null;
		Cell cell = null;

		try {
			int iRow = 0;
			int iColumn = 0;

			int numstart = 1;

			if (chletter[1] >= 'A' && chletter[1] <= 'Z') {
				iColumn = (chletter[0] - 64) * 26 + (chletter[1] - 65);
				numstart = 2;
			} else {
				iColumn = chletter[0] - 65;
			}

			charRow = excelRowCol.substring(numstart);
			iRow = Integer.parseInt(charRow) - 1;

			if (extendFlg != null) {
				if ("0".equals(extendFlg)) {
					iRow = iRow + cnt;
				}
				if ("1".equals(extendFlg)) {
					iColumn = iColumn + cnt;
				}
			}
			hSheet = wb.getSheet(sheetName);
			if (hSheet == null) {
				throw new Exception("指定している帳票シート名が存在していません。");
			}
			row = hSheet.getRow(iRow);
			if (row == null) {
				row = hSheet.createRow(iRow);
			}

			cell = row.getCell(iColumn);
			if (cell == null) {
				cell = row.createCell(iColumn);
			}
			return cell;

		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			chletter = null;
			charRow = null;
			hSheet = null;
			row = null;
			cell = null;
		}
	}

   
	@Log
	private Cell getCellObject (String sheetName, String excelRowCol, String extendFlg, int cnt, int intBeginRow, int intEndRow, int intPage, int intListPageCnt, String districtFlg, int intMinPageCnt, int intTempBeginRow, int intTempEndRow, int dataNum) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		char[] chletter = excelRowCol.toCharArray();
		String charRow = "";
		Sheet hSheet = null;
		Row row = null;
		Cell cell = null;

		try {
			int iRow = 0;
			int iColumn = 0;

			int numstart = 1;

			int cntData = cnt / dataNum;
			if (chletter[1] >= 'A' && chletter[1] <= 'Z') {
				iColumn = (chletter[0] - 64) * 26 + (chletter[1] - 65);
				numstart = 2;
			} else {
				iColumn = chletter[0] - 65;
			}

			charRow = excelRowCol.substring(numstart);
			iRow = Integer.parseInt(charRow) - 1;

			int intSpaceCnt = 0;
			if ((cntData + 1) * dataNum > intListPageCnt) {
				districtFlg = "1";
			}
			if (districtFlg.equals("1")) {
				if (intMinPageCnt > 0) {
					if ((cnt % intListPageCnt) == 0) {
						if (cnt > 0) {
							intSpaceCnt = (intEndRow - intBeginRow + 1) * (cnt / intListPageCnt);
						}
					} else {
						if ((cnt + 1) > intListPageCnt) {
							intSpaceCnt = cnt % intListPageCnt + (intEndRow - intBeginRow + 1) * (cnt / intListPageCnt);
						} else {
							intSpaceCnt = cnt + (intEndRow - intBeginRow + 1) * (cnt / intListPageCnt);
						}
					}
				} else {
					intSpaceCnt = cnt;
				}
			} else {
				if (intPage > 1) {
					intSpaceCnt = (intEndRow - intBeginRow + 1) * (intPage - 1);
				}
			}
			if (extendFlg != null) {
				if (districtFlg.equals("1")) {
					iRow = iRow + intSpaceCnt;
				} else {
					if (intListPageCnt != 0) {
						iRow = iRow + (cntData * dataNum) % intListPageCnt + intSpaceCnt;
					} else {
						iRow = iRow + cntData + intSpaceCnt;
					}
				}
			}
			hSheet = wb.getSheet(sheetName);

			row = hSheet.getRow(iRow);
			if (row == null) {
				row = hSheet.createRow(iRow);
			}

			cell = row.getCell(iColumn);
			if (cell == null) {
				cell = row.createCell(iColumn);
			}
			return cell;

		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			chletter = null;
			charRow = null;
			hSheet = null;
			row = null;
		}
	}

   
	@Log
	private void copyRows (String pSourceSheetName, String pTargetSheetName, int pStartRow, int pEndRow, int pPosition, int firstFlg) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		Row sourceRow = null;
		Row targetRow = null;
		Cell sourceCell = null;
		Cell targetCell = null;
		Sheet sourceSheet = null;
		Sheet targetSheet = null;
		CellRangeAddress region = null;
		CellRangeAddress regionClone = null;
		int cType;
		int i;
		int j;
		int targetRowFrom;
		int targetRowTo;
		int firstRow;
		int lastRow;
		int firstColomn;
		int lastColomn;
		String rowInfo;
		try {
			if ((pStartRow == -1) || (pEndRow == -1)) {
				return;

			}

			sourceSheet = wb.getSheet(pSourceSheetName);
			targetSheet = wb.getSheet(pTargetSheetName);

			for (i = pStartRow; i <= pEndRow; i++) {
				sourceRow = sourceSheet.getRow(i);
				if (sourceRow != null) {
					for (j = sourceRow.getFirstCellNum(); j < sourceRow.getLastCellNum(); j++) {
						targetSheet.setColumnWidth(j, sourceSheet.getColumnWidth(j));

					}
					break;
				}
			}

			for (i = pStartRow; i <= pEndRow; i++) {
				sourceRow = sourceSheet.getRow(i);
				if (sourceRow == null) {
					continue;
				}

				targetRow = targetSheet.createRow(i - pStartRow + pPosition);
				targetRow.setHeight(sourceRow.getHeight());

				for (j = sourceRow.getFirstCellNum(); j < sourceRow.getLastCellNum(); j++) {
					sourceCell = sourceRow.getCell(j);
					if (sourceCell == null) {
						continue;
					}
					targetCell = targetRow.createCell(j);
					targetCell.setCellStyle(sourceCell.getCellStyle());
					cType = sourceCell.getCellType();
					targetCell.setCellType(cType);

					switch (cType) {
						case HSSFCell.CELL_TYPE_BLANK:
							break;
						case HSSFCell.CELL_TYPE_BOOLEAN:
							targetCell.setCellValue(sourceCell.getBooleanCellValue());
							break;
						case HSSFCell.CELL_TYPE_ERROR:
							targetCell.setCellValue(sourceCell.getErrorCellValue());
							break;
						case HSSFCell.CELL_TYPE_FORMULA:
							targetCell.setCellFormula(getCopyFormular(sourceSheet, sourceCell.getCellFormula(), pPosition - pStartRow));
							break;
						case HSSFCell.CELL_TYPE_NUMERIC:
							targetCell.setCellValue(sourceCell.getNumericCellValue());
							break;
						case HSSFCell.CELL_TYPE_STRING:
							targetCell.setCellValue(sourceCell.getStringCellValue());
							break;
						default:

					}
				}
			}

			if (firstFlg == 1) {
				CopyRowInfo = new HashMap<String, String>();
				for (i = 0; i < sourceSheet.getNumMergedRegions(); i++) {
					region = sourceSheet.getMergedRegion(i);
					CopyRowInfo.put("rowInfo" + String.valueOf(i), region.getFirstRow() + "," + region.getLastRow() + "," + region.getFirstColumn() + "," + region.getLastColumn());
					if ((region.getFirstRow() >= pStartRow) && (region.getLastRow() <= pEndRow)) {
						targetRowFrom = region.getFirstRow() - pStartRow + pPosition;
						targetRowTo = region.getLastRow() - pStartRow + pPosition;
						regionClone = (CellRangeAddress) region.copy();
						regionClone.setFirstRow(targetRowFrom);
						regionClone.setLastRow(targetRowTo);
						targetSheet.addMergedRegion(regionClone);
					}
				}
			} else { 

				for (i = 0; i < CopyRowInfo.size(); i++) {
					rowInfo = CopyRowInfo.get("rowInfo" + String.valueOf(i));
					if (rowInfo != null && !"".equals(rowInfo)) {
						firstRow = StringUtil.changeStringToInt(rowInfo.split(",", -1)[0]);
						lastRow = StringUtil.changeStringToInt(rowInfo.split(",", -1)[1]);
						firstColomn = StringUtil.changeStringToInt(rowInfo.split(",", -1)[2]);
						lastColomn = StringUtil.changeStringToInt(rowInfo.split(",", -1)[3]);
						if (firstRow >= pStartRow && lastRow <= pEndRow) {
							targetRowFrom = firstRow - pStartRow + pPosition;
							targetRowTo = lastRow - pStartRow + pPosition;
							region = new CellRangeAddress(targetRowFrom, targetRowTo, firstColomn, lastColomn);
							targetSheet.addMergedRegion(region);
						}
					}
				}

			}
			copyConditionalFormatting(sourceSheet, targetSheet, pStartRow, pPosition);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			sourceRow = null;
			targetRow = null;
			sourceCell = null;
			targetCell = null;
			sourceSheet = null;
			targetSheet = null;
			region = null;
		}
	}

   
	@Log
	private void copyConditionalFormatting (Sheet sourceSheet, Sheet targetSheet, int pStartRow, int pPosition) throws Exception {

		XSSFWorkbook wbTemplate = new XSSFWorkbook(new File(TemplateFileFullPath));
		XSSFSheet sheetTempalte = null;
		if (wb.getSheetIndex(sourceSheet) < 0 || (wb.getSheetIndex(sourceSheet) + 1) > wbTemplate.getNumberOfSheets()) {
			sheetTempalte = wbTemplate.getSheetAt(wb.getSheetIndex(sourceSheet) % wbTemplate.getNumberOfSheets());
		} else {
			sheetTempalte = wbTemplate.getSheetAt(wb.getSheetIndex(sourceSheet));
		}
		XSSFSheetConditionalFormatting xscfRead = ((XSSFSheet) sheetTempalte).getSheetConditionalFormatting();
		XSSFSheetConditionalFormatting xscfWrite = ((XSSFSheet) targetSheet).getSheetConditionalFormatting();
		XSSFConditionalFormatting cfRead = null;
		XSSFConditionalFormattingRule rRead = null;
		XSSFConditionalFormattingRule rWrite = null;
		PatternFormatting pf = null;
		FontFormatting fontFormatting = null;
		XSSFBorderFormatting rxbf = null;
		CellRangeAddress[] regions = null;
		CellRangeAddress[] region = null;
		CellRangeAddress reg = null;
		String ruleStr = null;
		int pos = pPosition - pStartRow;
		for (int idx = 0; idx < xscfRead.getNumConditionalFormattings(); idx++) {
			cfRead = xscfRead.getConditionalFormattingAt(idx);
			int count = cfRead.getNumberOfRules();
			for (int k = 0; k < count; k++) {
				rRead = cfRead.getRule(k);
				ruleStr = rRead.getFormula1();
				if (ruleStr != null) {
					ruleStr = getCopyFormular(sourceSheet, ruleStr, pos);
				}
				rWrite = xscfWrite.createConditionalFormattingRule(ruleStr);
				if (rRead.getPatternFormatting() != null) {
					pf = rWrite.createPatternFormatting();
					if (rRead.getPatternFormatting().getFillBackgroundColorColor() != null) {
						pf.setFillBackgroundColor(rRead.getPatternFormatting().getFillBackgroundColorColor());
					}
					if (rRead.getPatternFormatting().getFillForegroundColorColor() != null) {
						pf.setFillForegroundColor(rRead.getPatternFormatting().getFillForegroundColorColor());
					}
					if (rRead.getPatternFormatting().getFillPattern() > 0) {
						pf.setFillPattern(rRead.getPatternFormatting().getFillPattern());
					}
				}
				if (rRead.getFontFormatting() != null) {
					fontFormatting = rWrite.createFontFormatting();
					fontFormatting.setFontStyle(rRead.getFontFormatting().isItalic(), rRead.getFontFormatting().isBold());
					fontFormatting.setFontColorIndex(rRead.getFontFormatting().getFontColorIndex());
					fontFormatting.setFontColor(rRead.getFontFormatting().getFontColor());
					fontFormatting.setFontHeight(rRead.getFontFormatting().getFontHeight());
					fontFormatting.setUnderlineType(rRead.getFontFormatting().getUnderlineType());
					fontFormatting.setEscapementType(rRead.getFontFormatting().getEscapementType());
				}
				rxbf = rRead.getBorderFormatting();
				if (rRead.getBorderFormatting() != null) {
					XSSFBorderFormatting xbf = rWrite.createBorderFormatting();
					xbf.setBorderBottom(rxbf.getBorderBottom());
					xbf.setBorderLeft(rxbf.getBorderLeft());
					xbf.setBorderRight(rxbf.getBorderRight());
					xbf.setBorderTop(rxbf.getBorderTop());
					xbf.setBorderDiagonal(rxbf.getBorderDiagonal());
					if (rxbf.getBottomBorderColorColor() != null) {
						xbf.setBottomBorderColor(rxbf.getBottomBorderColorColor());
					}
					if (rxbf.getLeftBorderColorColor() != null) {
						xbf.setLeftBorderColor(rxbf.getLeftBorderColorColor());
					}
					if (rxbf.getRightBorderColorColor() != null) {
						xbf.setRightBorderColor(rxbf.getRightBorderColorColor());
					}
					if (rxbf.getTopBorderColorColor() != null) {
						xbf.setTopBorderColor(rxbf.getTopBorderColorColor());
					}
					if (rxbf.getDiagonalBorderColorColor() != null) {
						xbf.setDiagonalBorderColor(rxbf.getDiagonalBorderColorColor());
					}
				}

				regions = cfRead.getFormattingRanges();

				if (regions != null && regions.length > 0) {
					region = new CellRangeAddress[regions.length];
					for (int p = 0; p < region.length; p++) {
						reg = regions[0];
						region[p] = new CellRangeAddress(reg.getFirstRow() + pos, reg.getLastRow() + pos, reg.getFirstColumn(), reg.getLastColumn());
					}
					xscfWrite.addConditionalFormatting(region, rWrite);
				}
			}
		}
	}

   
	@Log
	private String getCopyFormular (Sheet sheet, String oldFormula, int pos) throws Exception {

		String newFormula = "";
		if (oldFormula != null) {
			FormulaParsingWorkbook parsingWorkbook = null;
			FormulaRenderingWorkbook renderingWorkbook = null;

			parsingWorkbook = XSSFEvaluationWorkbook.create((XSSFWorkbook) wb);
			renderingWorkbook = XSSFEvaluationWorkbook.create((XSSFWorkbook) wb);

			Ptg[] ptgs = FormulaParser.parse(oldFormula, parsingWorkbook, FormulaType.CELL, wb.getSheetIndex(sheet));

			for (Ptg ptg : ptgs)
			{
				if (ptg instanceof RefPtgBase) {

					RefPtgBase refPtgBase = (RefPtgBase) ptg;
					setFormulaParser((short) (refPtgBase.getRow() + pos),
									(short) (refPtgBase.getColumn()), refPtgBase);

				}

				if (ptg instanceof AreaPtgBase) {

					AreaPtgBase areaPtgBase = (AreaPtgBase) ptg;

					if (areaPtgBase.isFirstRowRelative()) {
						int firstRowIndex = 0;
						firstRowIndex = areaPtgBase.getFirstRow() + pos;
						areaPtgBase.setFirstRow((short) firstRowIndex);
					}

					if (areaPtgBase.isLastRowRelative()) {
						int lastRowIndex = 0;
						lastRowIndex = areaPtgBase.getLastRow() + pos;
						areaPtgBase.setLastRow((short) lastRowIndex);
					}

					if (areaPtgBase.isFirstColRelative()) {
						areaPtgBase.setFirstColumn((short) (areaPtgBase.getFirstColumn()));
					}

					if (areaPtgBase.isLastColRelative()) {
						areaPtgBase.setLastColumn((short) (areaPtgBase.getLastColumn()));
					}
				}
			}

			newFormula = FormulaRenderer.toFormulaString(renderingWorkbook, ptgs);
		}
		return newFormula;
	}

   
	@Log
	private void setFormulaParser (short row, short column, RefPtgBase refPtgBase) throws Exception {

		if (refPtgBase.isRowRelative()) {
			refPtgBase.setRow(row);
		}

		if (refPtgBase.isColRelative()) {
			refPtgBase.setColumn(column);
		}
	}

   
	@Log
	private HashMap<String, String> getSheetNameReplace (ArrayList<InOutPrintBean> alViewCell, String sheetNameFormat) throws Exception {

		HashMap<String, String> rev = null;
		HashMap<String, InOutPrintBean> hmFieldSeq = new HashMap<String, InOutPrintBean>();
		hmFieldSeq = setHashMapFromArrayList(5, hmFieldSeq, alViewCell, "viewCell");
		rev = getDataBaseParam(sheetNameFormat, hmFieldSeq);
		return rev;
	}

   
	@Log
	private BufferedImage getImageFile (String attachID) throws Exception {

		BufferedImage image = null;
		String fileID = null;
		String uploadFileFullPath = null;
		fileID = OutPutDataConstant.getFileIDByAttachID(attachID);
		if (!StringUtil.isNullOrBlank(fileID)) {
			uploadFileFullPath = SpringPropertiesUtil.getSystemProperties("UPLOAD_FILE_PATH") + "/" + fileID;
			image = ImageIO.read(new FileInputStream(uploadFileFullPath));
		} else {
		    uploadFileFullPath = SpringPropertiesUtil.getSystemProperties("UPLOAD_FILE_PATH") + "/" + attachID;
			image = ImageIO.read(new FileInputStream(uploadFileFullPath));
		}
		return image;
	}

   
	@Log
	private HashMap<String, InOutPrintBean> setHashMapFromArrayList (int i, HashMap<String, InOutPrintBean> ph, ArrayList<InOutPrintBean> alObj, String inoutkub) throws Exception {

		
		InOutPrintBean alRowData = null;
		String objStr = "";
		
		if (alObj == null) {
			return ph;
		}
		for (int j = 0; j < alObj.size(); j++) {
			alRowData = alObj.get(j);
			if ("viewCell".equals(inoutkub)) {
				if (i == 1) {
					objStr = alRowData.getTemplate_id();
				} else if (i == 2) {
					objStr = alRowData.getSheet_name();
				} else if (i == 3) {
					objStr = alRowData.getCell_num();
				} else if (i == 4) {
					objStr = alRowData.getRecordid();
				} else if (i == 5) {
					objStr = alRowData.getFieldid();
				} else if (i == 6) {
					objStr = alRowData.getSeqnum();
				} else if (i == 7) {
					objStr = alRowData.getFromflg();
				} else if (i == 8) {
					objStr = alRowData.getList_name();
				} else if (i == 9) {
					objStr = alRowData.getPrint_file_sheet_name();
				} else if (i == 10) {
					objStr = alRowData.getData_type();
				}
			} else if ("templateList".equals(inoutkub)) {
				if (i == 0) {
					objStr = alRowData.getList_name();
				} else if (i == 1) {
					objStr = alRowData.getList_extend_method();
				} else if (i == 2) {
					objStr = alRowData.getList_data_per_page();
				}
			}
			ph.put(objStr, alRowData);
		}
		alRowData = null;
		return ph;
	}

   
	@Log
	private ArrayList<InOutPrintBean> getAlViewCell8 () throws Exception {

		ArrayList<InOutPrintBean> returnList = null;
		InOutPrintBean iopbean = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			returnList = new ArrayList<InOutPrintBean>();
			iopbean = new InOutPrintBean();
			
			iopbean.setTemplate_id("8");
			iopbean.setSheet_name("社内工事番号");
			iopbean.setCell_num("B4");
			iopbean.setRecordid("I00017");
			iopbean.setFieldid("BUHIN_KOUJIKANRIBANGOU1");
			iopbean.setSeqnum("1");
			iopbean.setFromflg("1");
			iopbean.setList_name("content");
			iopbean.setPrint_file_sheet_name("");
			iopbean.setData_type("1");
			returnList.add(iopbean);
			iopbean = new InOutPrintBean();
			
			iopbean.setTemplate_id("8");
			iopbean.setSheet_name("社内工事番号");
			iopbean.setCell_num("C4");
			iopbean.setRecordid("I00017");
			iopbean.setFieldid("BUHIN_TOKUISAKI2");
			iopbean.setSeqnum("2");
			iopbean.setFromflg("1");
			iopbean.setList_name("content");
			iopbean.setPrint_file_sheet_name("");
			iopbean.setData_type("1");
			returnList.add(iopbean);
			iopbean = new InOutPrintBean();
			
			iopbean.setTemplate_id("8");
			iopbean.setSheet_name("社内工事番号");
			iopbean.setCell_num("D4");
			iopbean.setRecordid("I00017");
			iopbean.setFieldid("SHAIN_SHAINMEI3");
			iopbean.setSeqnum("3");
			iopbean.setFromflg("1");
			iopbean.setList_name("content");
			iopbean.setPrint_file_sheet_name("");
			iopbean.setData_type("1");
			returnList.add(iopbean);
			iopbean = new InOutPrintBean();
			
			iopbean.setTemplate_id("8");
			iopbean.setSheet_name("社内工事番号");
			iopbean.setCell_num("E4");
			iopbean.setRecordid("I00017");
			iopbean.setFieldid("CHUUBUNSHO_HINMEI4");
			iopbean.setSeqnum("4");
			iopbean.setFromflg("1");
			iopbean.setList_name("content");
			iopbean.setPrint_file_sheet_name("");
			iopbean.setData_type("1");
			returnList.add(iopbean);
			iopbean = new InOutPrintBean();
			
			iopbean.setTemplate_id("8");
			iopbean.setSheet_name("社内工事番号");
			iopbean.setCell_num("F4");
			iopbean.setRecordid("I00017");
			iopbean.setFieldid("CHUUBUNSHO_MITSUMORISHONO5");
			iopbean.setSeqnum("5");
			iopbean.setFromflg("1");
			iopbean.setList_name("content");
			iopbean.setPrint_file_sheet_name("");
			iopbean.setData_type("1");
			returnList.add(iopbean);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
		return returnList;
	}

   
	@Log
	private ArrayList<InOutPrintBean> getalTemplateList () throws Exception {

		ArrayList<InOutPrintBean> returnList = null;
		InOutPrintBean iopbean = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			returnList = new ArrayList<InOutPrintBean>();
			iopbean = new InOutPrintBean();
			iopbean.setList_name("content");
			iopbean.setList_extend_method("1");
			iopbean.setList_data_per_page("0");
			returnList.add(iopbean);
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
		return returnList;
	}

   
	@Log
	private String printFile (ArrayList<ArrayList<String>> outDataAy, HttpServletRequest request, String outFilePath, JSONWFCObject jsonObj) throws Exception {

		String timeStamp = null;
		String ext = null;
		String templateFilePath = null;
		String templateID = null;
		String outFileID = null;
		File file = null;
		StringBuffer returnFileSB = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			timeStamp = DateUtil.getFilePatternDateTimeMillisecond();
			returnFileSB = new StringBuffer();
			
			templateFilePath = SpringPropertiesUtil.getPrint_template_file_path();
			ext = ".xlsx";
			outFileID = getOutFileID("社内工事番号", timeStamp, 0, ext);
			templateID = "20220920_124353865.xlsx";
			TemplateFileFullPath = System.getProperty("user.dir") + templateFilePath + "/" + templateID;
			file = new File(TemplateFileFullPath);
			if (file.exists()) {
				
				if (outDataAy != null && outDataAy.size() > 0) {
					outFileID = writeExcel(outDataAy, file, outFilePath, outFileID, timeStamp, request);
					if (!StringUtil.isNullOrBlank(outFileID)) {
						returnFileSB.append(outFileID).append(",");
					}
				} else {
					jsonObj.setMessageValue("e", "該当データが存在していません。");
				}
			} else {
				jsonObj.setMessageValue("e", "テンプレートファイルが存在していません。");
			}
			return StringUtil.removeRightString(returnFileSB.toString(), ",");
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			timeStamp = null;
			ext = null;
			outFileID = null;
			file = null;
			templateFilePath = null;
			templateID = null;
			returnFileSB = null;
		}
	}

   
	@Log
	public String outputFile (HttpServletRequest request, String outFilePath, JSONWFCObject jsonObj) throws Exception {

		List<A011O4I00017PrintEntity> A011O4I00017PrintEntityList = null;
		String CHUUBUNSHONO1 = null;
		ArrayList<ArrayList<String>> outDataAy = null;
		String outFileID = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			CHUUBUNSHONO1 = StringUtil.changeNullToBlank(StringUtil.escapeSQLTags(request.getParameter("CHUUBUNSHONO1")));
			
			A011O4I00017PrintEntityList = A011O4I00017PrintDao.A011O4I00017Print (CHUUBUNSHONO1);
			outDataAy = P0001315ChangeToArraList(A011O4I00017PrintEntityList);
			
			
			OutPutDataConstant.createDirs (outFilePath);
			outFileID = printFile(outDataAy, request, outFilePath, jsonObj);
			return outFileID;
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			outFileID = null;
			CHUUBUNSHONO1 = null;
			outDataAy = null;
		}
	}
}