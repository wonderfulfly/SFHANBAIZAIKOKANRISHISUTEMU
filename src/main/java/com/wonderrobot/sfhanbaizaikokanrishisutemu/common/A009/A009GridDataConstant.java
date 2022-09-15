package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A009;
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
 *      class: A009GridDataConstant
 *      Page: 
 * @version
 */

public class A009GridDataConstant {
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
		sBuffer.append("<td class='g2 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=SHIHARAIHIDZUKE_9999999 id=SHIHARAIHIDZUKE_9999999 data-bind='value: SHIHARAIHIDZUKE' value='WFC#COLUMN_VALUE#WFC63WFC#COLUMN_VALUE#WFC' class='editable calendar' _subid=63 _itemname='支払日付' _gid='Grid61' _gflg='Grid61flg9999999' onChange ='getObj(\"SHIHARAIHIDZUKE_9999999\").value=this.value;dateFormatChange($(this),\"支払日付\");cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  style='width:107px;height:29px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHIHARAIWARIAI_9999999'  name='SHIHARAIWARIAI_9999999'  value='WFC#COLUMN_VALUE#WFC65WFC#COLUMN_VALUE#WFC'  class='editable' style='width:150px;height:31px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='65'  _itemname='支払割合'  _rge='2'  type='text'  onChange ='getObj(\"SHIHARAIWARIAI_9999999\").value=this.value;F20220915174752763($(this));cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  _gid='Grid61'  _gflg='Grid61flg9999999' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=FURIDASHIZUMIHIDZUKE_9999999 id=FURIDASHIZUMIHIDZUKE_9999999 data-bind='value: FURIDASHIZUMIHIDZUKE' value='WFC#COLUMN_VALUE#WFC67WFC#COLUMN_VALUE#WFC' class='editable calendar' _subid=67 _itemname='領収書発行日' _gid='Grid61' _gflg='Grid61flg9999999' onChange ='getObj(\"FURIDASHIZUMIHIDZUKE_9999999\").value=this.value;dateFormatChange($(this),\"領収書発行日\");cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  style='width:101px;height:29px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='FURIDASHIZUMIKINGAKU_9999999'  name='FURIDASHIZUMIKINGAKU_9999999'  value='WFC#COLUMN_VALUE#WFC69WFC#COLUMN_VALUE#WFC'  class='editable' style='width:147px;height:31px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='69'  _itemname='振出済み金額'  _ire='###,###,##0.##'  _rge='1'  type='text'  onChange ='getObj(\"FURIDASHIZUMIKINGAKU_9999999\").value=this.value;F20220915174752781($(this));cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  _gid='Grid61'  _gflg='Grid61flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='FURIDASHIZUMIWARIAI_9999999'  name='FURIDASHIZUMIWARIAI_9999999'  value='WFC#COLUMN_VALUE#WFC71WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:100px;height:31px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='71'  _itemname='振出済み%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid61'  _gflg='Grid61flg9999999' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=NYUUKINZUMIHIDZUKE_9999999 id=NYUUKINZUMIHIDZUKE_9999999 data-bind='value: NYUUKINZUMIHIDZUKE' value='WFC#COLUMN_VALUE#WFC73WFC#COLUMN_VALUE#WFC' class='editable calendar' _subid=73 _itemname='入金済み日付' _gid='Grid61' _gflg='Grid61flg9999999' onChange ='getObj(\"NYUUKINZUMIHIDZUKE_9999999\").value=this.value;dateFormatChange($(this),\"入金済み日付\");cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  style='width:149px;height:29px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINZUMIKINGAKU_9999999'  name='NYUUKINZUMIKINGAKU_9999999'  value='WFC#COLUMN_VALUE#WFC75WFC#COLUMN_VALUE#WFC'  class='editable' style='width:90px;height:31px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='75'  _itemname='入金済み金額'  _ire='###,###,##0.##'  _rge='1'  type='text'  onChange ='getObj(\"NYUUKINZUMIKINGAKU_9999999\").value=this.value;F20220915174752763($(this));cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  _gid='Grid61'  _gflg='Grid61flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINZUMIWARIAI_9999999'  name='NYUUKINZUMIWARIAI_9999999'  value='WFC#COLUMN_VALUE#WFC77WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:141px;height:31px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='77'  _itemname='入金済み%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid61'  _gflg='Grid61flg9999999' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=9><input id='RESHIITOMEISAINO_9999999'  name='RESHIITOMEISAINO_9999999'  value='WFC#COLUMN_VALUE#WFC79WFC#COLUMN_VALUE#WFC'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=10><input id='RESHIITONO1_9999999'  name='RESHIITONO1_9999999'  value='WFC#COLUMN_VALUE#WFC81WFC#COLUMN_VALUE#WFC'  _k='1'  type='hidden' ></div></td>");
		map.put("61", sBuffer.toString());
		GridDataRowTDMap.put("P00011", map);

		//GridRowStartTDMap data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<td class='g3 l' _colid=0><input style='float:left;' type=checkbox id='Grid61delchkWFC#ROW_COUNT#WFC' name='Grid61delchkWFC#ROW_COUNT#WFC'>WFC#ROW_COUNT#WFC<input type=hidden id='Grid61flgWFC#ROW_COUNT#WFC' name='Grid61flgWFC#ROW_COUNT#WFC'></td>");
		map.put("61", sBuffer.toString());
		GridRowStartTDMap.put("P00011", map);

		//Grid title data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<input type='hidden' name='initRowGrid61' id='initRowGrid61' value='9999999'><input type='hidden' name='RowGrid61' id='RowGrid61' value='9999999'><table id='Grid61' name ='Grid61' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>支払日付</th><th style='overflow:hidden;text-align:center;'>支払割合</th><th style='overflow:hidden;text-align:center;'>領収書発行日</th><th style='overflow:hidden;text-align:center;'>振出済み金額</th><th style='overflow:hidden;text-align:center;'>振出済み%</th><th style='overflow:hidden;text-align:center;'>入金済み日付</th><th style='overflow:hidden;text-align:center;'>入金済み金額</th><th style='overflow:hidden;text-align:center;'>入金済み%</th><th style='display:none'>領収書明細NO</th><th style='display:none'>領収書NOHIDE</th></tr></thead>");
		map.put("61", sBuffer.toString());
		GridTitleItemMap.put("P00011", map);

		//Grid zero row data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0><input style='float:left;' type=checkbox id='Grid61delchk0' name='Grid61delchk0'>0<input type=hidden width=0px id='Grid61flg0' name='Grid61flg0'></td>");
		sBuffer.append("<td class='g2 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=SHIHARAIHIDZUKE_0 id=SHIHARAIHIDZUKE_0 data-bind='value: SHIHARAIHIDZUKE' value='' class='editable calendar' _subid=63 _itemname='支払日付' _gid='Grid61' _gflg='Grid61flg0' onChange ='getObj(\"SHIHARAIHIDZUKE_0\").value=this.value;dateFormatChange($(this),\"支払日付\");cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  style='width:107px;height:29px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHIHARAIWARIAI_0'  name='SHIHARAIWARIAI_0'  class='editable' style='width:150px;height:31px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='65'  _itemname='支払割合'  _rge='2'  type='text'  onChange ='getObj(\"SHIHARAIWARIAI_0\").value=this.value;F20220915174752763($(this));cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  _gid='Grid61'  _gflg='Grid61flg0' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=FURIDASHIZUMIHIDZUKE_0 id=FURIDASHIZUMIHIDZUKE_0 data-bind='value: FURIDASHIZUMIHIDZUKE' value='' class='editable calendar' _subid=67 _itemname='領収書発行日' _gid='Grid61' _gflg='Grid61flg0' onChange ='getObj(\"FURIDASHIZUMIHIDZUKE_0\").value=this.value;dateFormatChange($(this),\"領収書発行日\");cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  style='width:101px;height:29px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='FURIDASHIZUMIKINGAKU_0'  name='FURIDASHIZUMIKINGAKU_0'  class='editable' style='width:147px;height:31px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='69'  _itemname='振出済み金額'  _ire='###,###,##0.##'  _rge='1'  type='text'  onChange ='getObj(\"FURIDASHIZUMIKINGAKU_0\").value=this.value;F20220915174752781($(this));cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  _gid='Grid61'  _gflg='Grid61flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='FURIDASHIZUMIWARIAI_0'  name='FURIDASHIZUMIWARIAI_0'  class='readonly' readOnly style='width:100px;height:31px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='71'  _itemname='振出済み%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid61'  _gflg='Grid61flg0' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=NYUUKINZUMIHIDZUKE_0 id=NYUUKINZUMIHIDZUKE_0 data-bind='value: NYUUKINZUMIHIDZUKE' value='' class='editable calendar' _subid=73 _itemname='入金済み日付' _gid='Grid61' _gflg='Grid61flg0' onChange ='getObj(\"NYUUKINZUMIHIDZUKE_0\").value=this.value;dateFormatChange($(this),\"入金済み日付\");cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  style='width:149px;height:29px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINZUMIKINGAKU_0'  name='NYUUKINZUMIKINGAKU_0'  class='editable' style='width:90px;height:31px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='75'  _itemname='入金済み金額'  _ire='###,###,##0.##'  _rge='1'  type='text'  onChange ='getObj(\"NYUUKINZUMIKINGAKU_0\").value=this.value;F20220915174752763($(this));cs($(this),\"rowseq\",\"Grid61flg\",\"0\");'  _gid='Grid61'  _gflg='Grid61flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINZUMIWARIAI_0'  name='NYUUKINZUMIWARIAI_0'  class='readonly' readOnly style='width:141px;height:31px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='77'  _itemname='入金済み%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid61'  _gflg='Grid61flg0' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=9><input id='RESHIITOMEISAINO_0'  name='RESHIITOMEISAINO_0'  value='[自動採番]'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=10><input id='RESHIITONO1_0'  name='RESHIITONO1_0'  _k='1'  type='hidden' ></div></td></tr>");
		map.put("61", sBuffer.toString());
		GridRowZeroMap.put("P00011", map);

		//Grid item map
		mapList = new HashMap<String, ArrayList<ItemBean>>();
		beanList = new ArrayList<ItemBean>();
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "63";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "SHIHARAIHIDZUKE";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "65";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "SHIHARAIWARIAI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "67";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "FURIDASHIZUMIHIDZUKE";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "69";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "FURIDASHIZUMIKINGAKU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "71";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "FURIDASHIZUMIWARIAI";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "73";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "NYUUKINZUMIHIDZUKE";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "75";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "NYUUKINZUMIKINGAKU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "77";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "NYUUKINZUMIWARIAI";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "7";
		itemBean.SubID = "79";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "RESHIITOMEISAINO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A009GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "81";
		itemBean.TableID = "NYUKINMEISAI";
		itemBean.FieldID = "RESHIITONO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		mapList.put("61", beanList);
		GridItemSubIDMap.put("P00011", mapList);
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
			gridTitle = getMapValueByKey(pageID, subID, A009GridDataConstant.GridTitleItemMap);
		}
		
		gridRowZero = getMapValueByKey(pageID, subID, A009GridDataConstant.GridRowZeroMap);
		gridRowZero = changeGridItem(gridRowZero, pageID, subID, null)	;
		if (dataListMap != null && dataListMap.size() > 0) {
			rowStartTD = getMapValueByKey(pageID, subID, A009GridDataConstant.GridRowStartTDMap);
			
			rowTD = getMapValueByKey(pageID, subID, A009GridDataConstant.GridDataRowTDMap);
			
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
