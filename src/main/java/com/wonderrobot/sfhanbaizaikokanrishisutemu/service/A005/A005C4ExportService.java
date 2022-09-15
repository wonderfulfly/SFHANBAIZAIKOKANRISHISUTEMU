package com.wonderrobot.sfhanbaizaikokanrishisutemu.service.A005;
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
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A005.A005C4I00005ExportEntity;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.dao.A005.A005C4I00005ExportDao;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.PrintSetup;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import com.wonderfulfly.core.util.DateUtil;
import com.wonderfulfly.core.util.ExcelUtils;
import com.wonderfulfly.core.util.RegexpUtil;
import com.wonderfulfly.common.InOutPrintBean;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import java.io.FileOutputStream;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.SpringPropertiesUtil;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.common.OutPutDataConstant;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.aspect.Log;


/**
 * @project
 *     
 * @comment
 *      class: A005C4ExportService
 *      Page: データインタフェース
 * @version

 */

@Service
public class A005C4ExportService {
	@Autowired
	private A005C4I00005ExportDao A005C4I00005ExportDao;
	private Workbook wb;
	private Sheet sheet;
	private int headerRowCount;
	private Map<String, Double> dataMap;
	private CellStyle titlestyle;
	private CellStyle datastyle;
	private CellStyle datastyleleft;
	private CellStyle datastylecenter;
	private CellStyle datastylemoney;
	private CellStyle datastylenumber;
	private DataFormat formatNumber;
	private DataFormat formatDate;
	private int dataColumn;
	private int TitleStyle;
	private int SumStyle;
	private int CountStyle;
	private int InfoStyle;
	@Autowired
	private OutPutDataConstant OutPutDataConstant;
	@Autowired
	private ConfigEntity ConfigEntity;

   
	@Log
	public void A005C4Export (HttpServletRequest request, JSONWFCObject jsonObj) throws Exception {

		String outFilePath = null;
		String outFileID = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			outFilePath = ConfigEntity.getPrint_file_path();
			//エクスポート
			outFileID = outputFile(request, outFilePath);
			
			//download
			FileDownLoadJsonSet.setExportJsonObj(outFileID, "UTF-8", jsonObj);
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
	private ArrayList<Map<String, String>> P000071ChangeToArraList (List<A005C4I00005ExportEntity> A005C4I00005ExportEntityList) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			ArrayList<Map<String, String>> outDataAy = new ArrayList<Map<String, String>>();
			Map<String, String> selMap = null;
			if (A005C4I00005ExportEntityList != null && A005C4I00005ExportEntityList.size() > 0) {
				for (int i = 0;i < A005C4I00005ExportEntityList.size();i++) {
					A005C4I00005ExportEntity A005C4I00005ExportEntity = A005C4I00005ExportEntityList.get(i);
					selMap = new HashMap<String, String>();
					selMap.put("NYUUKOTSUKI", StringUtil.changeNullToBlank(A005C4I00005ExportEntity.getNYUUKOTSUKI()));
					selMap.put("NYUUKOBI", StringUtil.changeNullToBlank(A005C4I00005ExportEntity.getNYUUKOBI()));
					selMap.put("KARIKATASUURYOU", StringUtil.changeNullToBlank(A005C4I00005ExportEntity.getKARIKATASUURYOU()));
					selMap.put("KASHIKATASUURYOU", StringUtil.changeNullToBlank(A005C4I00005ExportEntity.getKASHIKATASUURYOU()));
					selMap.put("PRICE", StringUtil.changeNullToBlank(A005C4I00005ExportEntity.getPRICE()));
					selMap.put("KARIKATAKINGAKU", StringUtil.changeNullToBlank(A005C4I00005ExportEntity.getKARIKATAKINGAKU()));
					selMap.put("KASHIKATAKINGAKU", StringUtil.changeNullToBlank(A005C4I00005ExportEntity.getKASHIKATAKINGAKU()));
					selMap.put("KOUJIKANRIBANGOU", StringUtil.changeNullToBlank(A005C4I00005ExportEntity.getKOUJIKANRIBANGOU()));
					selMap.put("SEISAKUHINKUBUN", StringUtil.changeNullToBlank(A005C4I00005ExportEntity.getSEISAKUHINKUBUN()));
					outDataAy.add(selMap);
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
	private void initValue () throws Exception {

		dataMap = new HashMap<String, Double>();
		headerRowCount = 3;
		dataColumn = 0;
		TitleStyle = 1;
		SumStyle = 2;
		CountStyle = 3;
		InfoStyle = 4;
	}

   
	@Log
	private void initSheetStyle () throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		Font ffont = null, ffont2 = null;

		try {
			ffont = wb.createFont();
			ffont.setBoldweight(Font.BOLDWEIGHT_BOLD);
			ffont.setColor(IndexedColors.WHITE.getIndex());
			ffont.setFontName("ＭＳ Ｐゴシック");
			
			titlestyle = wb.createCellStyle();
			titlestyle.setFont(ffont);
			titlestyle.setAlignment(CellStyle.ALIGN_CENTER);
			titlestyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
			titlestyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
			titlestyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			titlestyle.setBorderTop(CellStyle.BORDER_THIN);
			titlestyle.setBorderBottom(CellStyle.BORDER_THIN);
			titlestyle.setBorderLeft(CellStyle.BORDER_THIN);
			titlestyle.setBorderRight(CellStyle.BORDER_THIN);
			
			ffont2 = wb.createFont();
			ffont2.setBoldweight(Font.BOLDWEIGHT_NORMAL);
			ffont2.setColor(IndexedColors.BLACK.getIndex());
			ffont2.setFontName("ＭＳ Ｐゴシック");
			
			datastyle= wb.createCellStyle();
			datastyle.setFont(ffont2);
			datastyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
			datastyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
			datastyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			datastyle.setBorderTop(CellStyle.BORDER_THIN);
			datastyle.setBorderBottom(CellStyle.BORDER_THIN);
			datastyle.setBorderLeft(CellStyle.BORDER_THIN);
			datastyle.setBorderRight(CellStyle.BORDER_THIN);
			
			datastyleleft= wb.createCellStyle();
			datastyleleft.cloneStyleFrom(datastyle);
			datastyleleft.setAlignment(CellStyle.ALIGN_LEFT);
			
			datastylecenter= wb.createCellStyle();
			datastylecenter.cloneStyleFrom(datastyle);
			datastylecenter.setAlignment(CellStyle.ALIGN_CENTER);
			formatDate = wb.createDataFormat();
			datastylecenter.setDataFormat(formatDate.getFormat("yyyy/MM/dd"));
			
			datastylemoney= wb.createCellStyle();
			datastylemoney.cloneStyleFrom(datastyle);
			datastylemoney.setAlignment(CellStyle.ALIGN_RIGHT);
			formatNumber = wb.createDataFormat();
			datastylemoney.setDataFormat(formatNumber.getFormat("#,##0"));

			datastylenumber= wb.createCellStyle();
			datastylenumber.cloneStyleFrom(datastyle);
			datastylenumber.setAlignment(CellStyle.ALIGN_RIGHT);

		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			ffont = null; 
			ffont2 = null;
		}

	}

   
	@Log
	private ArrayList<String> P000071getFieldList () throws Exception {

		ArrayList<String> returnList = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			returnList = new ArrayList<String>();
			returnList.add("NYUUKOTSUKI");
			returnList.add("NYUUKOBI");
			returnList.add("KARIKATASUURYOU");
			returnList.add("KASHIKATASUURYOU");
			returnList.add("PRICE");
			returnList.add("KARIKATAKINGAKU");
			returnList.add("KASHIKATAKINGAKU");
			returnList.add("KOUJIKANRIBANGOU");
			returnList.add("SEISAKUHINKUBUN");
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
		return returnList;
	}

   
	@Log
	private ArrayList<String> P000071getColumnWidthList () throws Exception {

		ArrayList<String> returnList = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			returnList = new ArrayList<String>();
			returnList.add("");
			returnList.add("");
			returnList.add("");
			returnList.add("");
			returnList.add("");
			returnList.add("");
			returnList.add("");
			returnList.add("");
			returnList.add("");
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
		return returnList;
	}

   
	@Log
	private Map<String, Map<String, String>> P000071getBreakMap () throws Exception {

		Map<String, Map<String, String>> returnMap = null;
		Map<String, String> map = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			returnMap = new HashMap<String, Map<String,String>>();
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
		return returnMap;
	}

   
	@Log
	private ArrayList<InOutPrintBean> P000071getHeadText () throws Exception {

		ArrayList<InOutPrintBean> returnList = null;
		InOutPrintBean iopbean = null;
		ArrayList<String> reList = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			reList = new ArrayList<String>();
			returnList = new ArrayList<InOutPrintBean>();
			iopbean = new InOutPrintBean();
			reList.add("入庫月");
			reList.add("入庫日");
			reList.add("借り方数量");
			reList.add("貸し方数量");
			reList.add("単価");
			reList.add("借り方金額");
			reList.add("貸し方金額");
			reList.add("工事管理番号");
			reList.add("製作品区分");
			iopbean.setLabel_id(reList);
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
	private List<Map<String, String>> P000071getPrintItemDataMap () throws Exception {

		List<Map<String, String>> returnList = null;
		Map<String, String> map = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			returnList = new ArrayList<Map<String,String>>();
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
		return returnList;
	}

   
	@Log
	private ArrayList<String> P000071getFieldType () throws Exception {

		ArrayList<String> returnList = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			returnList = new ArrayList<String>();
			returnList.add("3");
			returnList.add("3");
			returnList.add("2");
			returnList.add("2");
			returnList.add("1");
			returnList.add("5");
			returnList.add("5");
			returnList.add("1");
			returnList.add("1");
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
		}
		return returnList;
	}

   
	@Log
	private Workbook OutExcelMap (String title, ArrayList<Map<String, String>> altl, HttpServletRequest URequest) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		Map<String, String> rowi = null;
		int intColumns = 0;
		RichTextString rtext = null;
		Row row = null;
		Cell cell = null;
		String sumstr = null;
		String dateString = null;
		List<String> fieldList = null;
		List<String> columnList = null; 
		String langid = null;
		Map<String, Map<String, String>> BreakMap = null;
		Map<String, List<Integer>> breakDataMap = null;
		ArrayList<String> headText = null;
		List<Map<String, String>> printItemDataMap = null;
		String site = null;
		String itemId = null;
		int[] sites = null;
		String cellValue = null;
		ArrayList<String> fieldTypeList = null;
		try {
			initValue();
			wb = new XSSFWorkbook();
			sheet = wb.createSheet("I00005");
			sheet.setDisplayGridlines(false);

			initSheetStyle();
			
			fieldList = P000071getFieldList();
			columnList = P000071getColumnWidthList();
			createMerged(0, 0, 0, fieldList.size());
			createMerged(1, 0, 1, fieldList.size());
			setTyoHyoName(title);

			BreakMap = P000071getBreakMap();
			breakDataMap = new HashMap<String, List<Integer>>();
			headText = P000071getHeadText().get(0).getLabel_id();
			printItemDataMap = P000071getPrintItemDataMap();
			
			for (int i = 0; i < printItemDataMap.size(); i++) {
				site = printItemDataMap.get(i).get("CELL_SITE");
				itemId = printItemDataMap.get(i).get("ITEMID");
				sites = ExcelUtils.getCellRowColumnIndex(site);
				if (sheet.getRow(sites[0]) == null) {
					row = sheet.createRow(sites[0]);
				} else {
					row = sheet.getRow(sites[0]);
				}
				cell = row.createCell(sites[1]);
				String value = StringUtil.escapeSQLTags(URequest.getParameter(itemId));
				cell.setCellValue(value);
			}
			intColumns = fieldList.size() + 1;
			dataColumn = intColumns;
			for (int i = 0; i < altl.size(); i++) {
				row = sheet.createRow(i+headerRowCount);
				rowi = altl.get(i);
				for (int j=0;j<intColumns; j++) {
					cell = row.createCell(j);
					if (i==0 ) {
						if (j==0) {
							cell.setCellValue("No.");
						} else {
							rtext = getRichTextString(headText.get(j-1));
							cell.setCellValue(rtext);
						}
						cell.setCellStyle(titlestyle);
					} else { 
						if (j==0) {
							cell.setCellValue(i);
							cell.setCellStyle(datastyle);
						} else {
							
							if (BreakMap.containsKey(String.valueOf(j))) {
								Map<String, String> breakDataParamMap = BreakMap.get(String.valueOf(j));
								String condition1 = breakDataParamMap.get("condition1");
								String condition2 = breakDataParamMap.get("condition2");
								String condition3 = breakDataParamMap.get("condition3");
								String fieldid = breakDataParamMap.get("FIELDID");
								String compareKey = "";
								if (StringUtil.isNullOrBlank(condition1) && StringUtil.isNullOrBlank(condition2) && StringUtil.isNullOrBlank(condition3)) {
									compareKey = fieldid + "_" + rowi.get(fieldid);
								} else {
									compareKey = fieldid + "_" + "$1_" + rowi.get(condition1);
									if (!StringUtil.isNullOrBlank(condition2)) {
										compareKey += "$2_" + rowi.get(condition2);
									}
									if (!StringUtil.isNullOrBlank(condition3)) {
										compareKey += "$3_" + rowi.get(condition3);
									}
								}
								if (breakDataMap.containsKey(compareKey)) {
									List<Integer> dataList = breakDataMap.get(compareKey);
									dataList.set(2, dataList.get(2) + 1);
								} else {
									List<Integer> dataList = new ArrayList<Integer>();
									dataList.add(cell.getRowIndex());
									dataList.add(cell.getColumnIndex());
									dataList.add(cell.getRowIndex());
									breakDataMap.put(compareKey, dataList);
								}
								condition1 = null;
								condition2 = null;
								condition3 = null;
								fieldid = null;
								compareKey = null;
							}

							fieldTypeList = P000071getFieldType();
							if ("1".equals(fieldTypeList.get(j-1))) {
								rtext = getRichTextString(rowi.get(fieldList.get(j - 1)));
								cell.setCellValue(rtext);
								cell.setCellStyle(datastyleleft);
								
							} else if ("4".equals(fieldTypeList.get(j-1))) {
								cell.setCellType(Cell.CELL_TYPE_NUMERIC);
								cell.setCellStyle(datastylemoney);
								cellValue = rowi.get(fieldList.get(j - 1));
								if (!StringUtil.isNullOrBlank(cellValue)) {
									if (RegexpUtil.isDouble(cellValue)) {
										cell.setCellValue(Double.valueOf(cellValue));
									} else {
										cell.setCellValue(cellValue);
									}
								}
								
							} else if ("2".equals(fieldTypeList.get(j-1))) {
								cell.setCellType(Cell.CELL_TYPE_NUMERIC);
								cell.setCellStyle(datastylenumber);
								cellValue = rowi.get(fieldList.get(j - 1));
								if (!StringUtil.isNullOrBlank(cellValue)) {
									if (RegexpUtil.isDouble(cellValue)) {
										cell.setCellValue(Double.valueOf(cellValue));
									} else {
										cell.setCellValue(cellValue);
									}
								}
								
							} else if ("3".equals(fieldTypeList.get(j-1))) {
								cell.setCellType(Cell.CELL_TYPE_NUMERIC);
								cell.setCellStyle(datastylecenter);
								cellValue = rowi.get(fieldList.get(j - 1));
								if (!StringUtil.isNullOrBlank(cellValue)) {
									if (!RegexpUtil.isDateTimeString(cellValue) && !RegexpUtil.isDateString(cellValue)) {
										cell.setCellValue(cellValue);
									} else {
										cell.setCellValue(DateUtil.getDateFromStr(cellValue));
									}
								}
							} else {
								cell.setCellStyle(datastyle);
							}
						}
					}
				}
			}
			int rowSize = intColumns;
			createSumArea(altl.size());
			for (int i = 0; i < intColumns; i++) {
				sheet.autoSizeColumn(i);
				if(i == 0 ||columnList.get(i-1) == null || "".equals(columnList.get(i-1))){
					sheet.setColumnWidth(i, sheet.getColumnWidth(i) + 200);
				}else{
					sheet.setColumnWidth(i,Integer.parseInt(columnList.get(i-1)) * 256 + 200);
				}
			}
			
			for (String key : breakDataMap.keySet()) {
				List<Integer> dataList = breakDataMap.get(key);
				createMerged(dataList.get(0), dataList.get(1), dataList.get(2), dataList.get(1));
			}
			
			setSheetHeader();
			
			setPrintSetup();
			
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			rtext = null;
			titlestyle = null;
			datastyle = null;
			cell = null;
			row = null;
			fieldList = null;
			columnList = null;
			langid = null;
			BreakMap = null;
			breakDataMap = null;
			headText = null;
			printItemDataMap = null;
			site = null;
			itemId = null;
			sites = null;
			cellValue = null;
		}
		return wb;
	}

   
	@Log
	private void createSumArea (int dataSize) throws Exception {

	}

   
	@Log
	private void setPrintSetup () throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		PrintSetup prsetup = null;
		
		try {
			sheet.setRepeatingRows(CellRangeAddress.valueOf("1:4")); 
			prsetup = sheet.getPrintSetup();
			prsetup.setLandscape(false);
			prsetup.setScale(Short.parseShort("100",10));
			

			prsetup.setPaperSize(PrintSetup.A4_PAPERSIZE);
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			prsetup = null;
		}

	}

   
	@Log
	private void createMerged (int beforeRow, int beforeColumn, int afterRow, int afterColumn) throws Exception {

		CellRangeAddress cellRangeAddress = new CellRangeAddress(beforeRow, afterRow, beforeColumn, afterColumn);
		sheet.addMergedRegion(cellRangeAddress);
	}

   
	@Log
	private void setTyoHyoName (String title) throws Exception {

		Font ffont = wb.createFont();
		ffont.setBoldweight(Font.BOLDWEIGHT_BOLD);
		ffont.setColor(IndexedColors.BLACK.getIndex());
		ffont.setFontName("ＭＳ Ｐゴシック");
		ffont.setFontHeightInPoints((short)20);
		
		CellStyle titlestyle = wb.createCellStyle();
		titlestyle.setFont(ffont);
		titlestyle.setAlignment(CellStyle.ALIGN_CENTER);
		titlestyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		titlestyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
		titlestyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		titlestyle.setBorderTop(CellStyle.BORDER_NONE);
		titlestyle.setBorderBottom(CellStyle.BORDER_NONE);
		titlestyle.setBorderLeft(CellStyle.BORDER_NONE);
		titlestyle.setBorderRight(CellStyle.BORDER_NONE);
		titlestyle.setShrinkToFit(true);
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(0);
		cell.setCellValue(title);
		cell.setCellStyle(titlestyle);
	}

   
	@Log
	private void setInfo (String content, String cellSite, String align, int showStyle) throws Exception {

		int[] sites = ExcelUtils.getCellRowColumnIndex(cellSite);
		if (sites != null) {
			setInfo(content, sites[0], sites[1], align, showStyle);
		}
		sites = null;
	}

   
	@Log
	private void setInfo (String content, int rowIndex, int columnIndex, String align, int showStyle) throws Exception {


		Font ffont = wb.createFont();
		ffont.setColor(IndexedColors.BLACK.getIndex());
		ffont.setFontName("ＭＳ Ｐゴシック");
		
		CellStyle titlestyle = wb.createCellStyle();
		if (showStyle == TitleStyle) {
			titlestyle.setFont(ffont);
			titlestyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
			titlestyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
			titlestyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
			titlestyle.setBorderTop(CellStyle.BORDER_NONE);
			titlestyle.setBorderBottom(CellStyle.BORDER_NONE);
			titlestyle.setBorderLeft(CellStyle.BORDER_NONE);
			titlestyle.setBorderRight(CellStyle.BORDER_NONE);
		}
		
		Row row = sheet.getRow(rowIndex);
		if (row == null) {
			row = sheet.createRow(rowIndex);
		}
		Cell cell = row.getCell(columnIndex);
		CellStyle cellStyle = null;
		if (cell == null) {
			cell = row.createCell(columnIndex);
			cellStyle = titlestyle;
			cellStyle.setAlignment(getAlignment(align));
			cell.setCellValue(content);
		} else {
			if (showStyle == SumStyle) {
				cellStyle = datastylemoney;
				if (!StringUtil.isNullOrBlank(content)) {
					cell.setCellValue(Double.valueOf(content));
				}
			} else if (showStyle == CountStyle) {
				cellStyle = datastylemoney;
				cell.setCellValue(content);
			} else if (showStyle == InfoStyle) {
				cell.setCellValue(content);
			} else {
				cellStyle = cell.getCellStyle();
			}
		}
		cell.setCellStyle(cellStyle);
		
		ffont = null;
		titlestyle = null;
		cell = null;
		cellStyle = null;
	}

   
	@Log
	private short getAlignment (String align) throws Exception {

		if ("0".equals(align)) {
			return CellStyle.ALIGN_LEFT;
		} else if ("2".equals(align)) {
			return CellStyle.ALIGN_RIGHT;
		} else {
			return CellStyle.ALIGN_CENTER;
		}
	}

   
	@Log
	private RichTextString getRichTextString (String c) throws Exception {

		return new XSSFRichTextString(c);
	}

   
	@Log
	private void setSheetHeader () throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		Header header;
		Locale locale;
		try {
			header = sheet.getHeader();
			
				locale = new Locale("ja","JP","JP");
				header.setRight(DateUtil.getPatternDate("GGGGy年MM月dd日", locale) + " &T Page-&P");
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			header = null;
			locale = null;
		}
	}

   
	@Log
	private void ExportExcelToStream (String outFileFullPath, String title, ArrayList<Map<String, String>> altl, HttpServletRequest URequest) throws Exception {

		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName()+ ": start");
		altl.add(0, new HashMap<String, String>());
		OutExcelMap(title, altl, URequest);
		FileOutputStream outs = null;
		try {
			outs = new FileOutputStream(outFileFullPath,true);
			wb.write(outs);
		} catch (IOException e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			if (outs != null) {
				outs.close();
				outs = null;
			}
			wb = null;
			sheet = null;
		}
		
	}

   
	@Log
	public String outputFile (HttpServletRequest request, String outFilePath) throws Exception {

		List<A005C4I00005ExportEntity> A005C4I00005ExportEntityList = null;
		ArrayList<Map<String, String>> outDataAy = null;
		String ext = null;
		String encode = null;
		String title = null;
		String fileName = null;
		String outFileID = null;
		String outFileFullPath = null;
		String dataStr = null;
		LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": start");
		try {
			
			A005C4I00005ExportEntityList = A005C4I00005ExportDao.A005C4I00005Export ();
			outDataAy = P000071ChangeToArraList(A005C4I00005ExportEntityList);
			
			ext = ".xlsx";
			encode = "UTF-8";
			title = "";
			fileName = "";
			outFileID = "Export_" + DateUtil.getFilePatternDateTimeMillisecond() + ext;
			outFileFullPath = outFilePath + "/" + outFileID;
			
			
			OutPutDataConstant.createDirs (outFilePath);
			ExportExcelToStream(outFileFullPath, title, outDataAy, request);
			return outFileID;
		} catch (Exception e) {
			LoggerUtil.error(Thread.currentThread().getStackTrace()[1].getMethodName()+":", e);
			throw e;
		} finally {
			LoggerUtil.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + ": end");
			outFileID = null;
			outDataAy = null;
		}
	}
}