package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A015;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.wonderfulfly.core.util.StringUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.wonderfulfly.core.util.HashMapUtil;
import java.util.LinkedHashMap;

/**
 * @project
 *     null
 * @comment
 *      class: A015GridDataConstant
 *      Page: 
 * @version
 */

public class A015GridDataConstant {
	public static HashMap<String, HashMap<String, String>> GridDataRowTDMap =  new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, HashMap<String, String>> GridRowStartTDMap =  new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, HashMap<String, String>> GridTitleItemMap =  new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, HashMap<String, String>> GridRowZeroMap =  new HashMap<String, HashMap<String, String>>();
	public static HashMap<String, HashMap<String, ArrayList<ItemBean>>> GridItemSubIDMap =  new HashMap<String, HashMap<String, ArrayList<ItemBean>>>();
	static {
		HashMap<String, String> map = null;
		StringBuffer sBuffer = new StringBuffer();
		HashMap<String, ArrayList<ItemBean>> mapList = null;
		ArrayList<ItemBean> beanList = null;
		ItemBean itemBean = null;

		//Grid data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KAISHAID1_9999999'  name='KAISHAID1_9999999'  value='WFC#COLUMN_VALUE#WFC15WFC#COLUMN_VALUE#WFC'  _k='1'  class='readonly' readOnly style='width:84px;height:25px;text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='15'  _itemname='会社ID' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KAISHAMEI1_9999999'  name='KAISHAMEI1_9999999'  value='WFC#COLUMN_VALUE#WFC17WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:115px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='17'  _itemname='会社名' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KAISHARYAKUSHOU_9999999'  name='KAISHARYAKUSHOU_9999999'  value='WFC#COLUMN_VALUE#WFC19WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:111px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='19'  _itemname='会社略称' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='ADORESU_9999999'  name='ADORESU_9999999'  value='WFC#COLUMN_VALUE#WFC21WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:124px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='21'  _itemname='アドレス' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='RENRAKUSAKI_9999999'  name='RENRAKUSAKI_9999999'  value='WFC#COLUMN_VALUE#WFC23WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:124px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='23'  _itemname='連絡先' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHIHARAIKIGEN_9999999'  name='SHIHARAIKIGEN_9999999'  value='WFC#COLUMN_VALUE#WFC25WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:112px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='25'  _itemname='支払期限' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=KAISHAKUBUN_9999999 name=KAISHAKUBUN_9999999 data-bind='value: KAISHAKUBUN' _req=0 disabled _subid=27 _itemname='会社区分' _gid='Grid13' _gflg='Grid13flg9999999' onChange ='getObj(\"KAISHAKUBUN_9999999\").value=this.value;cs($(this),\"rowseq\",\"Grid13flg\",\"0\");'  style='width:91px;height:27px;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC27WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g1 o' _colid=8><div style=\"overflow:hidden;\"><input id='grdB6W6_9999999'  name='grdB6W6_9999999'  value='編集'   _subid='29'  _itemname='編集'  type='button'  _gid='Grid13'  _gflg='Grid13flg9999999'  onclick='doLinkTrans29($(this));'  _sf_class='button_red'></div></td>");
		map.put("13", sBuffer.toString());
		GridDataRowTDMap.put("P00006", map);

		//GridRowStartTDMap data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<td class='g3 l' _colid=0><input style='float:left;' type=hidden id='Grid13delchkWFC#ROW_COUNT#WFC' name='Grid13delchkWFC#ROW_COUNT#WFC'>WFC#ROW_COUNT#WFC<input type=hidden id='Grid13flgWFC#ROW_COUNT#WFC' name='Grid13flgWFC#ROW_COUNT#WFC'></td>");
		map.put("13", sBuffer.toString());
		GridRowStartTDMap.put("P00006", map);

		//Grid title data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<input type='hidden' name='initRowGrid13' id='initRowGrid13' value='9999999'><input type='hidden' name='RowGrid13' id='RowGrid13' value='9999999'><table id='Grid13' name ='Grid13' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>会社ID</th><th style='overflow:hidden;text-align:center;'>会社名</th><th style='overflow:hidden;text-align:center;'>会社略称</th><th style='overflow:hidden;text-align:center;'>アドレス</th><th style='overflow:hidden;text-align:center;'>連絡先</th><th style='overflow:hidden;text-align:center;'>支払期限</th><th style='overflow:hidden;text-align:center;'>会社区分</th><th style='overflow:hidden;text-align:center;'>編集</th></tr></thead>");
		map.put("13", sBuffer.toString());
		GridTitleItemMap.put("P00006", map);

		//Grid zero row data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0>0<input type=hidden width=0px id='Grid13flg0' name='Grid13flg0'></td>");
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KAISHAID1_0'  name='KAISHAID1_0'  value='[自動採番]'  _k='1'  class='readonly' readOnly style='width:84px;height:25px;text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='15'  _itemname='会社ID' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KAISHAMEI1_0'  name='KAISHAMEI1_0'  class='readonly' readOnly style='width:115px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='17'  _itemname='会社名' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KAISHARYAKUSHOU_0'  name='KAISHARYAKUSHOU_0'  class='readonly' readOnly style='width:111px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='19'  _itemname='会社略称' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='ADORESU_0'  name='ADORESU_0'  class='readonly' readOnly style='width:124px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='21'  _itemname='アドレス' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='RENRAKUSAKI_0'  name='RENRAKUSAKI_0'  class='readonly' readOnly style='width:124px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='23'  _itemname='連絡先' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHIHARAIKIGEN_0'  name='SHIHARAIKIGEN_0'  class='readonly' readOnly style='width:112px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='25'  _itemname='支払期限' onblur='changeSpecHtml(this);' type='text'  _gid='Grid13'  _gflg='Grid13flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=KAISHAKUBUN_0 name=KAISHAKUBUN_0 data-bind='value: KAISHAKUBUN' _req=0 disabled _subid=27 _itemname='会社区分' _gid='Grid13' _gflg='Grid13flg0' onChange ='getObj(\"KAISHAKUBUN_0\").value=this.value;cs($(this),\"rowseq\",\"Grid13flg\",\"0\");'  style='width:91px;height:27px;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC27WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g1 o' _colid=8><div style=\"overflow:hidden;\"><input id='grdB6W6_0'  name='grdB6W6_0'  value='編集'   _subid='29'  _itemname='編集'  type='button'  _gid='Grid13'  _gflg='Grid13flg0'  onclick='doLinkTrans29($(this));'  _sf_class='button_red'></div></td></tr>");
		map.put("13", sBuffer.toString());
		GridRowZeroMap.put("P00006", map);

		//Grid item map
		mapList = new HashMap<String, ArrayList<ItemBean>>();
		beanList = new ArrayList<ItemBean>();
		itemBean = new A015GridDataConstant().new ItemBean();
		itemBean.OjeKind = "7";
		itemBean.SubID = "15";
		itemBean.TableID = "KAISYA";
		itemBean.FieldID = "KAISHAID";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A015GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "17";
		itemBean.TableID = "KAISYA";
		itemBean.FieldID = "KAISHAMEI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A015GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "19";
		itemBean.TableID = "KAISYA";
		itemBean.FieldID = "KAISHARYAKUSHOU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A015GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "21";
		itemBean.TableID = "KAISYA";
		itemBean.FieldID = "ADORESU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A015GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "23";
		itemBean.TableID = "KAISYA";
		itemBean.FieldID = "RENRAKUSAKI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A015GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "25";
		itemBean.TableID = "KAISYA";
		itemBean.FieldID = "SHIHARAIKIGEN";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A015GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "27";
		itemBean.TableID = "KAISYA";
		itemBean.FieldID = "KAISHAKUBUN";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "0:客先;1:仕入先";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A015GridDataConstant().new ItemBean();
		itemBean.OjeKind = "12";
		itemBean.SubID = "29";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "L00038";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		mapList.put("13", beanList);
		GridItemSubIDMap.put("P00006", mapList);
	}

	/**
	 * set gridData in session
	 * @param pageID
	 * @param subID
	 * @param AlSessionData
	 * @param request
	 * @throws Exception
	 */
	public static void setGridDataToSession(String pageID, String subID, ArrayList<LinkedHashMap<String, String>> alNewGridData, HttpServletRequest request) throws Exception {
		String sessionID = null;
		HashMap hmGridSession = new HashMap();
		HttpSession session = request.getSession();
		ArrayList<ArrayList<String>> AlSessionData = new ArrayList<ArrayList<String>>();
		ArrayList alSessionMap = new ArrayList();
		alSessionMap.add(pageID + subID);
		alSessionMap.add(alNewGridData);
		AlSessionData.add(alSessionMap);
		sessionID = session.getId();
		hmGridSession = HashMapUtil.setHashMapFromArrayList(0, hmGridSession, AlSessionData);
		session.setAttribute(sessionID + pageID + subID + "_Grid" , hmGridSession);
	}

	/**
	 * get grid str 
	 * @param dataList grid data
	 * @param pageID page id
	 * @param subID grid subID
	 * @param PagingRecordNum  the number of one grid page
	 * @param PagingNum  grid page number
	 * @throws Exception
	*/
	public static String getGridStrSet (ArrayList<LinkedHashMap<String, String>> dataListMap, String pageID, String subID
	                               , int PagingRecordNum, int PagingNum) throws Exception {
		return getGridStrSet(dataListMap, pageID, subID, PagingRecordNum, PagingNum, true);
	}


	/**
	 * get grid str 
	 * @param dataList grid data
	 * @param pageID page id
	 * @param subID grid subID
	 * @param PagingRecordNum  the number of one grid page
	 * @param PagingNum  grid page number
	 * @param isHaveGridTitle  grid title
	 * @throws Exception
	*/
	public static String getGridStrSet (ArrayList<LinkedHashMap<String, String>> dataListMap, String pageID, String subID
	                               , int PagingRecordNum, int PagingNum, boolean isHaveGridTitle) throws Exception {
		String returnVal = null;
		ArrayList<HashMap<String, String>> gridShowListMap = new ArrayList<HashMap<String, String>>();
		int begin = (PagingNum - 1) * PagingRecordNum;
		String gridTitle = null;
		String gridRowZero = null;
		String rowStartTD = null;
		String rowTD = null;
		int initRowNum = 0;
		if (isHaveGridTitle) {
			gridTitle = getMapValueByKey(pageID, subID, A015GridDataConstant.GridTitleItemMap);
		}
		
		gridRowZero = getMapValueByKey(pageID, subID, A015GridDataConstant.GridRowZeroMap);
		gridRowZero = changeGridItem(gridRowZero, pageID, subID, null)	;
		if (dataListMap != null && dataListMap.size() > 0) {
			rowStartTD = getMapValueByKey(pageID, subID, A015GridDataConstant.GridRowStartTDMap);
			
			rowTD = getMapValueByKey(pageID, subID, A015GridDataConstant.GridDataRowTDMap);
			
			begin = setGridShowListMap(PagingRecordNum, PagingNum, dataListMap, gridShowListMap);
			initRowNum = dataListMap.size();
		}
		returnVal = getGridStr(pageID, subID, gridShowListMap, gridTitle, gridRowZero,rowStartTD, rowTD, initRowNum, begin);
		return returnVal;
	}
	

	/**
	 * グリッド取得データの先頭位置を取得する。
	 * 
	 * @param PagingRecordNum
	 * @param PagingNum
	 * @param dataListMap
	 * @param gridShowListMap
	 * @return 
	 * @throws Exception
	 */

	private static int setGridShowListMap(int PagingRecordNum, int PagingNum, ArrayList<LinkedHashMap<String, String>> dataListMap, ArrayList<HashMap<String, String>> gridShowListMap) throws Exception {
		int begin = (PagingNum - 1) * PagingRecordNum;
		int end = 0;
		if (dataListMap != null && dataListMap.size() > 0) {
			if (PagingRecordNum == 0){
				begin = 0;
				end = dataListMap.size();
			} else if (PagingNum * PagingRecordNum > dataListMap.size()) {
				PagingNum = dataListMap.size() / PagingRecordNum;
				if (dataListMap.size() % PagingRecordNum > 0)
					begin = PagingNum * PagingRecordNum;
				else {
					begin = PagingRecordNum;
				}
	
				end = dataListMap.size();
			} else {
				end = PagingNum * PagingRecordNum;
			}
			for (int i = begin; i < end; i++) {
				gridShowListMap.add(dataListMap.get(i));
			}
		}
		return begin;
	}

	/**
	 * グリッドのHTMLを取得する
	 * 
	 * @param pageID
	 * @param subID
	 * @param gridShowListMap
	 * @param gridTitleOri
	 * @param gridRowZeroOri
	 * @param rowStartTDOri
	 * @param rowTDOri
	 * @param initRowNum
	 * @param begin
	 * @return returnVal
	 * @throws Exception
	 */
	private static String getGridStr (String pageID, String subID, ArrayList<HashMap<String, String>> gridShowListMap, String gridTitleOri, String gridRowZeroOri, String rowStartTDOri, String rowTDOri, int initRowNum, int begin) throws Exception {
		StringBuffer sBuffer = new StringBuffer();
		HashMap<String, String> dMap = null;
		StringBuffer replaceStrOriSB = new StringBuffer();
		String replaceStrNew = null;
		String rowStartTD = null;
		String rowTD = null;
		
		String gridTitle = null;

		replaceStrNew = StringUtil.ChangeIntToString(initRowNum);
		gridTitle = StringUtil.replace(gridTitleOri, "9999999", replaceStrNew);
		if (!StringUtil.isNullOrBlank(gridTitle)) {
			sBuffer.append(gridTitle);
		} else {
			sBuffer.append("<table>");
		}
		sBuffer.append("<tbody>");
		sBuffer.append(gridRowZeroOri);
		for (int n = 0; n < gridShowListMap.size(); n++) {
			dMap = gridShowListMap.get(n);
			sBuffer.append("<tr id ='").append("rowseq").append(n + 1 + begin).append("'>");
			replaceStrNew = StringUtil.ChangeIntToString(n + 1 + begin);
			rowStartTD = StringUtil.replace(rowStartTDOri, "WFC#ROW_COUNT#WFC", replaceStrNew);
			sBuffer.append(StringUtil.changeNullToBlank(rowStartTD));
			rowTD = rowTDOri;
			
			replaceStrOriSB.setLength(0);
			replaceStrOriSB.append(StringUtil.ChangeIntToString(9999999));
			replaceStrNew = StringUtil.ChangeIntToString(n + 1 + begin);
			rowTD = StringUtil.replace(rowTD, "["+replaceStrOriSB.toString()+"]", "[" + StringUtil.ChangeIntToString(StringUtil.changeStringToInt(replaceStrNew) - 1) + "]");			rowTD = StringUtil.replace(rowTD, replaceStrOriSB.toString(), replaceStrNew);
			
			rowTD = changeGridItem(rowTD, pageID, subID, dMap);
			sBuffer.append(StringUtil.changeNullToBlank(rowTD));
			sBuffer.append("</tr>");
		}
		sBuffer.append("</tbody></table>");
		
		return sBuffer.toString();
	}

	/**
	 * 表グリッドの対応するヘッダ、ボディを取得する
	 * 
	 * @param pageID
	 * @param subID
	 * @param mapName
	 * @return returnVal
	 * @throws Exception
	 */
	private static String getMapValueByKey (String pageID, String subID, HashMap<String, HashMap<String, String>> mapName) throws Exception {
		String tdStr = null;
		Map<String, String> map = mapName.get(pageID);
		if (map != null && map.size() > 0) {
			tdStr = map.get(subID);
		}
		return tdStr;
	}

	/**
	 * グリッド内の各コントロールを作成する。
	 * 
	 * @param rowStrOri
	 * @param pageID
	 * @param subID
	 * @param valueMap
	 * @return returnVal
	 * @throws Exception
	 */

	private static String changeGridItem (String rowStrOri, String pageID, String subID, HashMap<String, String> valueMap) throws Exception {
    A015DropDownListOptionBean ddloc = new A015DropDownListOptionBean();
		ArrayList<ItemBean> itemList = null;
		String optionStr = null;
		String valueSignKey = null;
		StringBuffer sBuffer = new StringBuffer();
		String returnStr = null;
		String valueSet = null;
		itemList = getItemList(pageID, subID, GridItemSubIDMap);
		returnStr = rowStrOri;
		if (itemList != null && itemList.size() > 0) {
			for (ItemBean itemBean : itemList) {
				sBuffer.setLength(0);
				sBuffer.append(itemBean.TableID).append("_").append(itemBean.FieldID);
				valueSignKey = sBuffer.toString();
				if (valueMap == null || !"0".equals(itemBean.DbFlg)) {
					valueSet = StringUtil.escapeSQLTags(StringUtil.changeNullToBlank(itemBean.DefaultValue));
				} else {
					valueSet = StringUtil.escapeSQLTags(StringUtil.changeNullToBlank(valueMap.get(valueSignKey)));
				}
				if ("2".equals(itemBean.OjeKind)) {
					optionStr = ddloc.getDropDownListOptions(pageID, itemBean.SubID, valueSet);
					if ("0".equals(itemBean.ReadOnly) || "1".equals(itemBean.ReadOnly)) {
						sBuffer.setLength(0);
						sBuffer.append("WFC#ROW_DROPDOWNLIST_OPTIONS#WFC").append(itemBean.SubID).append("WFC#ROW_DROPDOWNLIST_OPTIONS#WFC");
						returnStr = StringUtil.replace(returnStr, sBuffer.toString(), StringUtil.changeNullToBlank(optionStr));
					} else if ("2".equals(itemBean.ReadOnly) || "3".equals(itemBean.ReadOnly)) {
						sBuffer.setLength(0);
						sBuffer.append("WFC#ITEM_SHOW_VALUE#WFC").append(itemBean.SubID).append("WFC#ITEM_SHOW_VALUE#WFC");
						returnStr = StringUtil.replace(returnStr, sBuffer.toString(), StringUtil.changeNullToBlank(optionStr));
						sBuffer.setLength(0);
						sBuffer.append("WFC#COLUMN_VALUE#WFC").append(itemBean.SubID).append("WFC#COLUMN_VALUE#WFC");
						returnStr = StringUtil.replace(returnStr, sBuffer.toString(), StringUtil.changeNullToBlank(valueSet));
					}
				} else if ("3".equals(itemBean.OjeKind)) {
					sBuffer.setLength(0);
					sBuffer.append("WFC#ROW_RADIO_CHECKED#WFC").append(itemBean.SubID).append("_").append(valueSet).append("_").append("WFC#ROW_RADIO_CHECKED#WFC");
					if (isChecked(itemBean, valueSet)) {
						returnStr = StringUtil.replace(returnStr, sBuffer.toString(), "checked");
					} else {
						returnStr = StringUtil.replace(returnStr, sBuffer.toString(), "");
					}
				} else if ("4".equals(itemBean.OjeKind)) {
					sBuffer.setLength(0);
					sBuffer.append("WFC#COLUMN_VALUE#WFC").append(itemBean.SubID).append("WFC#COLUMN_VALUE#WFC");
					returnStr = StringUtil.replace(returnStr, sBuffer.toString(), StringUtil.changeNullToBlank(valueSet));
					sBuffer.setLength(0);
					sBuffer.append("WFC#ROW_CHECKBOX_CHECKED#WFC").append(itemBean.SubID).append("WFC#ROW_CHECKBOX_CHECKED#WFC");
					if (isChecked(itemBean, valueSet)) {
						returnStr = StringUtil.replace(returnStr, sBuffer.toString(), "checked");
					} else {
						returnStr = StringUtil.replace(returnStr, sBuffer.toString(), "");
					}
				   } else if ("10".equals(itemBean.OjeKind))  {
                       sBuffer.setLength(0);
                       sBuffer.append("WFC#COLUMN_VALUE#WFC").append(itemBean.SubID).append("WFC#COLUMN_VALUE#WFC");
                       returnStr = StringUtil.replace(returnStr, sBuffer.toString(), StringUtil.changeNullToBlank(valueSet));
                       sBuffer.setLength(0);
                       sBuffer.append("WFC#COLUMN_HREF#WFC").append(itemBean.SubID).append("WFC#COLUMN_HREF#WFC");
                       returnStr = StringUtil.replace(returnStr, sBuffer.toString(), StringUtil.changeNullToBlank("../upload/" +valueSet));
                       sBuffer.setLength(0);
                       sBuffer.append("WFC#COLUMN_SRC#WFC").append(itemBean.SubID).append("WFC#COLUMN_SRC#WFC");
                       returnStr = StringUtil.replace(returnStr, sBuffer.toString(), StringUtil.changeNullToBlank("../upload/" +valueSet));
				} else {
					sBuffer.setLength(0);
					sBuffer.append("WFC#COLUMN_VALUE#WFC").append(itemBean.SubID).append("WFC#COLUMN_VALUE#WFC");
					returnStr = StringUtil.replace(returnStr, sBuffer.toString(), StringUtil.changeNullToBlank(valueSet));
				}
			}
		}
		return returnStr;
	}
	/**
	 * グリッド内の各コントロールを取得する。
	 * 
	 * @param pageID
	 * @param subID
	 * @param mapName
	 * @return 
	 * @throws Exception
	 */

	private static ArrayList<ItemBean> getItemList (String pageID, String subID, HashMap<String, HashMap<String, ArrayList<ItemBean>>> mapName) throws Exception {
		ArrayList<ItemBean> returnList = null;
		Map<String, ArrayList<ItemBean>> map = mapName.get(pageID);
		if (map != null && map.size() > 0) {
			returnList = map.get(subID);
		}
		return returnList;
	}
	/**
	 * チェックボックスにiCheckedを追加するか
	 * 
	 * @param itemBean
	 * @param checkedValue
	 * @return 
	 * @throws Exception
	 */

	private static boolean isChecked(ItemBean itemBean, String checkedValue) throws Exception {
		String RelData = itemBean.RelData;
		String checkStr = null;
		String checkedVal = null;
		if (!StringUtil.isNullOrBlank(RelData)) {
			if (RelData.startsWith("checkbox:")) {
				checkStr = RelData.substring(9);
				if (checkStr.indexOf(";") > -1 && checkStr.split(";").length == 2) {
					checkStr = checkStr.split(";")[0];
					if (checkStr.indexOf(":") > -1 && checkStr.split(":").length == 2) {
						checkedVal = checkStr.split(":")[1];
					}
				}
			}
		}
		if (StringUtil.isNullOrBlank(checkedVal)) 
			checkedVal = "1";
		if (checkedVal.equals(checkedValue))
			return true;
		else 
			return false;
	}

	class ItemBean {
		String OjeKind;
		String SubID;
		String TableID;
		String FieldID;
		String ReadOnly;
		String RelData;
		String DefaultValue;
		String DbFlg;
	}
}
