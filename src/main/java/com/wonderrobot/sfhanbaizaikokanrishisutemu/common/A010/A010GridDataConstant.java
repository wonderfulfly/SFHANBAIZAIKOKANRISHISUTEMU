package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A010;
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
 *      class: A010GridDataConstant
 *      Page: 
 * @version
 */

public class A010GridDataConstant {
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
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='CHUUBUNSHONO_9999999'  name='CHUUBUNSHONO_9999999'  value='WFC#COLUMN_VALUE#WFC45WFC#COLUMN_VALUE#WFC'  _k='1'  class='readonly' readOnly style='width:102px;height:25px;text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='45'  _itemname='注文書NO' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='MITSUMORISHONO_9999999'  name='MITSUMORISHONO_9999999'  value='WFC#COLUMN_VALUE#WFC47WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:126px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='47'  _itemname='見積書NO' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg9999999' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=CHUUMONHIDZUKE_9999999 id=CHUUMONHIDZUKE_9999999 data-bind='value: CHUUMONHIDZUKE' value='WFC#COLUMN_VALUE#WFC49WFC#COLUMN_VALUE#WFC' class='readonly' readOnly _subid=49 _itemname='注文日付' _gid='Grid43' _gflg='Grid43flg9999999' onChange ='getObj(\"CHUUMONHIDZUKE_9999999\").value=this.value;dateFormatChange($(this),\"注文日付\");cs($(this),\"rowseq\",\"Grid43flg\",\"0\");'  style='width:135px;height:29px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHOUHINSOUGAKUJPY_9999999'  name='SHOUHINSOUGAKUJPY_9999999'  value='WFC#COLUMN_VALUE#WFC51WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:74px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='51'  _itemname='商品総額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHANAIKOUJIBANGOU_9999999'  name='SHANAIKOUJIBANGOU_9999999'  value='WFC#COLUMN_VALUE#WFC53WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:95px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='53'  _itemname='社内工事番号'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 l' _colid=6 style='word-wrap: break-word;'><input type=text name=showKYAKUSAKIID1_9999999 id=showKYAKUSAKIID1_9999999 value='WFC#ITEM_SHOW_VALUE#WFC55WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=55 _itemname='客先' style='width:100px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=KYAKUSAKIID1_9999999 id=KYAKUSAKIID1_9999999 value='WFC#COLUMN_VALUE#WFC55WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 l' _colid=7 style='word-wrap: break-word;'><input type=text name=showSHUTSUNYUUKOFURAGU_9999999 id=showSHUTSUNYUUKOFURAGU_9999999 value='WFC#ITEM_SHOW_VALUE#WFC57WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=57 _itemname='出入庫状態' style='width:99px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=SHUTSUNYUUKOFURAGU_9999999 id=SHUTSUNYUUKOFURAGU_9999999 value='WFC#COLUMN_VALUE#WFC57WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 l' _colid=8 style='word-wrap: break-word;'><input type=text name=showTANTOUSHAID1_9999999 id=showTANTOUSHAID1_9999999 value='WFC#ITEM_SHOW_VALUE#WFC59WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=59 _itemname='担当者' style='width:112px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=TANTOUSHAID1_9999999 id=TANTOUSHAID1_9999999 value='WFC#COLUMN_VALUE#WFC59WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 o' _colid=9><div style=\"overflow:hidden;\"><input id='grdC10Z10_9999999'  name='grdC10Z10_9999999'  value='編集'   _subid='61'  _itemname='編集'  type='button'  _gid='Grid43'  _gflg='Grid43flg9999999'  onclick='doLinkTrans61($(this));'  _sf_class='button_blue'></div></td>");
		sBuffer.append("<td class='g1 o' _colid=10><div style=\"overflow:hidden;\"><input id='grdC10AA10_9999999'  name='grdC10AA10_9999999'  value='削除'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdC10AA10_9999999\").value=this.value;A010grdC10AA101($(this));}'  _gid='Grid43'  _gflg='Grid43flg9999999'  class='button_red' _sf_class='button_red'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=11><input id='KYAKUSAKITANTOU_9999999'  name='KYAKUSAKITANTOU_9999999'  value='WFC#COLUMN_VALUE#WFC67WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=12><div style=\"overflow:hidden;\"><input id='grdC10AD10_9999999'  name='grdC10AD10_9999999'  value='削除確認'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdC10AD10_9999999\").value=this.value;ajaxDoAddExeJs(\"A010grdC10AD101Click\",null,null,$(this));}'  _gid='Grid43'  _gflg='Grid43flg9999999'  class='btn04' _sf_class='btn04'></div></td>");
		map.put("43", sBuffer.toString());
		GridDataRowTDMap.put("P00012", map);

		//GridRowStartTDMap data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<td class='g3 l' _colid=0><input style='float:left;' type=hidden id='Grid43delchkWFC#ROW_COUNT#WFC' name='Grid43delchkWFC#ROW_COUNT#WFC'>WFC#ROW_COUNT#WFC<input type=hidden id='Grid43flgWFC#ROW_COUNT#WFC' name='Grid43flgWFC#ROW_COUNT#WFC'></td>");
		map.put("43", sBuffer.toString());
		GridRowStartTDMap.put("P00012", map);

		//Grid title data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<input type='hidden' name='initRowGrid43' id='initRowGrid43' value='9999999'><input type='hidden' name='RowGrid43' id='RowGrid43' value='9999999'><table id='Grid43' name ='Grid43' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>注文書NO*</th><th style='overflow:hidden;text-align:center;'>見積書NO</th><th style='overflow:hidden;text-align:center;'>注文日付</th><th style='overflow:hidden;text-align:center;'>商品総額</th><th style='overflow:hidden;text-align:center;'>社内工事番号</th><th style='overflow:hidden;text-align:center;'>客先</th><th style='overflow:hidden;text-align:center;'>出入庫状態</th><th style='overflow:hidden;text-align:center;'>担当者</th><th style='overflow:hidden;text-align:center;'>編集</th><th style='overflow:hidden;text-align:center;'>削除</th><th style='display:none'>客先担当</th><th style='display:none'>削除確認</th></tr></thead>");
		map.put("43", sBuffer.toString());
		GridTitleItemMap.put("P00012", map);

		//Grid zero row data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0>0<input type=hidden width=0px id='Grid43flg0' name='Grid43flg0'></td>");
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='CHUUBUNSHONO_0'  name='CHUUBUNSHONO_0'  value='[自動採番]'  _k='1'  class='readonly' readOnly style='width:102px;height:25px;text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='45'  _itemname='注文書NO'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='MITSUMORISHONO_0'  name='MITSUMORISHONO_0'  class='readonly' readOnly style='width:126px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='47'  _itemname='見積書NO'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg0' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=CHUUMONHIDZUKE_0 id=CHUUMONHIDZUKE_0 data-bind='value: CHUUMONHIDZUKE' value='' class='readonly' readOnly _subid=49 _itemname='注文日付' _gid='Grid43' _gflg='Grid43flg0' onChange ='getObj(\"CHUUMONHIDZUKE_0\").value=this.value;dateFormatChange($(this),\"注文日付\");cs($(this),\"rowseq\",\"Grid43flg\",\"0\");'  style='width:135px;height:29px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHOUHINSOUGAKUJPY_0'  name='SHOUHINSOUGAKUJPY_0'  class='readonly' readOnly style='width:74px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='51'  _itemname='商品総額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHANAIKOUJIBANGOU_0'  name='SHANAIKOUJIBANGOU_0'  class='readonly' readOnly style='width:95px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='53'  _itemname='社内工事番号'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid43'  _gflg='Grid43flg0' ></div></td>");
		sBuffer.append("<td class='g1 l' _colid=6 style='word-wrap: break-word;'><input type=text name=showKYAKUSAKIID1_0 id=showKYAKUSAKIID1_0 value='WFC#ITEM_SHOW_VALUE#WFC55WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=55 _itemname='客先' style='width:100px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=KYAKUSAKIID1_0 id=KYAKUSAKIID1_0 value='WFC#COLUMN_VALUE#WFC55WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 l' _colid=7 style='word-wrap: break-word;'><input type=text name=showSHUTSUNYUUKOFURAGU_0 id=showSHUTSUNYUUKOFURAGU_0 value='WFC#ITEM_SHOW_VALUE#WFC57WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=57 _itemname='出入庫状態' style='width:99px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=SHUTSUNYUUKOFURAGU_0 id=SHUTSUNYUUKOFURAGU_0 value='WFC#COLUMN_VALUE#WFC57WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 l' _colid=8 style='word-wrap: break-word;'><input type=text name=showTANTOUSHAID1_0 id=showTANTOUSHAID1_0 value='WFC#ITEM_SHOW_VALUE#WFC59WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=59 _itemname='担当者' style='width:112px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=TANTOUSHAID1_0 id=TANTOUSHAID1_0 value='WFC#COLUMN_VALUE#WFC59WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 o' _colid=9><div style=\"overflow:hidden;\"><input id='grdC10Z10_0'  name='grdC10Z10_0'  value='編集'   _subid='61'  _itemname='編集'  type='button'  _gid='Grid43'  _gflg='Grid43flg0'  onclick='doLinkTrans61($(this));'  _sf_class='button_blue'></div></td>");
		sBuffer.append("<td class='g1 o' _colid=10><div style=\"overflow:hidden;\"><input id='grdC10AA10_0'  name='grdC10AA10_0'  value='削除'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdC10AA10_0\").value=this.value;A010grdC10AA101($(this));}'  _gid='Grid43'  _gflg='Grid43flg0'  class='button_red' _sf_class='button_red'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=11><input id='KYAKUSAKITANTOU_0'  name='KYAKUSAKITANTOU_0'  type='hidden' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=12><div style=\"overflow:hidden;\"><input id='grdC10AD10_0'  name='grdC10AD10_0'  value='削除確認'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdC10AD10_0\").value=this.value;ajaxDoAddExeJs(\"A010grdC10AD101Click\",null,null,$(this));}'  _gid='Grid43'  _gflg='Grid43flg0'  class='btn04' _sf_class='btn04'></div></td></tr>");
		map.put("43", sBuffer.toString());
		GridRowZeroMap.put("P00012", map);

		//Grid item map
		mapList = new HashMap<String, ArrayList<ItemBean>>();
		beanList = new ArrayList<ItemBean>();
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "7";
		itemBean.SubID = "45";
		itemBean.TableID = "TYUMONSYO";
		itemBean.FieldID = "CHUUBUNSHONO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "47";
		itemBean.TableID = "TYUMONSYO";
		itemBean.FieldID = "MITSUMORISHONO";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "49";
		itemBean.TableID = "TYUMONSYO";
		itemBean.FieldID = "CHUUMONHIDZUKE";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "51";
		itemBean.TableID = "TYUMONSYO";
		itemBean.FieldID = "SHOUHINSOUGAKUJPY";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "53";
		itemBean.TableID = "TYUMONSYO";
		itemBean.FieldID = "SHANAIKOUJIBANGOU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "55";
		itemBean.TableID = "TYUMONSYO";
		itemBean.FieldID = "KYAKUSAKIID";
		itemBean.ReadOnly = "2";
		itemBean.RelData = "KAISYA";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "57";
		itemBean.TableID = "TYUMONSYO";
		itemBean.FieldID = "SHUTSUNYUUKOFURAGU";
		itemBean.ReadOnly = "2";
		itemBean.RelData = "1: ;2:出庫済み";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "59";
		itemBean.TableID = "TYUMONSYO";
		itemBean.FieldID = "TANTOUSHAID";
		itemBean.ReadOnly = "2";
		itemBean.RelData = "SYAIN";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "12";
		itemBean.SubID = "61";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "L00029";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "11";
		itemBean.SubID = "63";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "67";
		itemBean.TableID = "TYUMONSYO";
		itemBean.FieldID = "KYAKUSAKITANTOU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A010GridDataConstant().new ItemBean();
		itemBean.OjeKind = "11";
		itemBean.SubID = "65";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		mapList.put("43", beanList);
		GridItemSubIDMap.put("P00012", mapList);
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
			gridTitle = getMapValueByKey(pageID, subID, A010GridDataConstant.GridTitleItemMap);
		}
		
		gridRowZero = getMapValueByKey(pageID, subID, A010GridDataConstant.GridRowZeroMap);
		gridRowZero = changeGridItem(gridRowZero, pageID, subID, null)	;
		if (dataListMap != null && dataListMap.size() > 0) {
			rowStartTD = getMapValueByKey(pageID, subID, A010GridDataConstant.GridRowStartTDMap);
			
			rowTD = getMapValueByKey(pageID, subID, A010GridDataConstant.GridDataRowTDMap);
			
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
    A010DropDownListOptionBean ddloc = new A010DropDownListOptionBean();
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
