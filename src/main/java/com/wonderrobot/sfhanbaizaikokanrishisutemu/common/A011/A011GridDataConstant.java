package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A011;
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
 *      class: A011GridDataConstant
 *      Page: 
 * @version
 */

public class A011GridDataConstant {
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
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=KUBUN_9999999 name=KUBUN_9999999 data-bind='value: KUBUN' _req=0 class='editable' _subid=97 _itemname='区分' _gid='Grid95' _gflg='Grid95flg9999999' onChange ='getObj(\"KUBUN_9999999\").value=this.value;cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  style='width:119px;height:27px;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC97WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KOUMOKU_9999999'  name='KOUMOKU_9999999'  value='WFC#COLUMN_VALUE#WFC99WFC#COLUMN_VALUE#WFC'  class='editable' style='width:136px;height:31px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;'  _subid='99'  _itemname='項目'  type='text'  _gid='Grid95'  _gflg='Grid95flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SUURYOU_9999999'  name='SUURYOU_9999999'  value='WFC#COLUMN_VALUE#WFC101WFC#COLUMN_VALUE#WFC'  class='editable' style='width:89px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='101'  _itemname='数量'  type='text'  onChange ='getObj(\"SUURYOU_9999999\").value=this.value;F20220915201226810($(this));F20220915201226827($(this));F20220915201226844($(this));F20220915201226862($(this));cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  _gid='Grid95'  _gflg='Grid95flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='HANBAITANKA_9999999'  name='HANBAITANKA_9999999'  value='WFC#COLUMN_VALUE#WFC103WFC#COLUMN_VALUE#WFC'  class='editable' style='width:73px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='103'  _itemname='販売単価'  _ire='###,###,##0'  _rge='1'  type='text'  onChange ='getObj(\"HANBAITANKA_9999999\").value=this.value;F20220915201226810($(this));F20220915201226827($(this));F20220915201226844($(this));F20220915201226862($(this));cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  _gid='Grid95'  _gflg='Grid95flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=KAHEI_9999999 name=KAHEI_9999999 data-bind='value: KAHEI' _req=0 class='editable' _subid=105 _itemname='貨幣' _gid='Grid95' _gflg='Grid95flg9999999' onChange ='getObj(\"KAHEI_9999999\").value=this.value;F20220915201226827($(this));F20220915201226844($(this));F20220915201226862($(this));cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  style='width:54px;height:27px;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC105WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g3 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='HANBAIKINGAKU_9999999'  name='HANBAIKINGAKU_9999999'  value='WFC#COLUMN_VALUE#WFC107WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:66px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='107'  _itemname='販売金額'  _ire='###,###,##0'  _rge='1'  type='text'  onChange ='getObj(\"HANBAIKINGAKU_9999999\").value=this.value;F20220915201226827($(this));F20220915201226844($(this));F20220915201226862($(this));cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  _gid='Grid95'  _gflg='Grid95flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TSUKAMATSUNYUUKINGAKUJPY_9999999'  name='TSUKAMATSUNYUUKINGAKUJPY_9999999'  value='WFC#COLUMN_VALUE#WFC109WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:117px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='109'  _itemname='仕入金額(JPY)'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid95'  _gflg='Grid95flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TSUKAMATSUNYUUKINGAKURMB_9999999'  name='TSUKAMATSUNYUUKINGAKURMB_9999999'  value='WFC#COLUMN_VALUE#WFC111WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:99px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='111'  _itemname='仕入金額(RMB)'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid95'  _gflg='Grid95flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=9 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TSUKAMATSUNYUUKINGAKUUSD_9999999'  name='TSUKAMATSUNYUUKINGAKUUSD_9999999'  value='WFC#COLUMN_VALUE#WFC113WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:113px;height:31px; text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='113'  _itemname='仕入金額(USD)'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid95'  _gflg='Grid95flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=10><div style=\"overflow:hidden;\"><input id='grdB18W18_9999999'  name='grdB18W18_9999999'  value='部品明細'  style='width:157px;height:29px; padding:0 2px;padding:0 2px;text-align:center;font-size:14px;color:#ffffff;font-weight:normal;background:#007b50;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdB18W18_9999999\").value=this.value;ajaxDoAddExeJs(\"A011grdB18W181Click\",null,null,$(this));}'  _gid='Grid95'  _gflg='Grid95flg9999999' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=11><input id='CHUUBUNSHONO2_9999999'  name='CHUUBUNSHONO2_9999999'  value='WFC#COLUMN_VALUE#WFC123WFC#COLUMN_VALUE#WFC'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=12><input id='SHUKKOFURAGU_9999999'  name='SHUKKOFURAGU_9999999'  value='WFC#COLUMN_VALUE#WFC117WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=13><div style=\"overflow:hidden;\"><input id='grdB18AA18_9999999'  name='grdB18AA18_9999999'  value='部品明細next'   _subid='119'  _itemname='部品明細next'  type='button'  _gid='Grid95'  _gflg='Grid95flg9999999'  onclick='doLinkTrans119($(this));'  _sf_class='btn04'></div></td>");
		sBuffer.append("<td class='g1 o' _colid=14><div style=\"overflow:hidden;\"><input id='grdB18AB18_9999999'  name='grdB18AB18_9999999'  value='部品新規'   _subid='121'  _itemname='部品新規'  type='button'  _gid='Grid95'  _gflg='Grid95flg9999999'  onclick='doLinkTrans121($(this));'  _sf_class='btn04'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=15><input id='CHUUBUNSHOMEISAINO_9999999'  name='CHUUBUNSHOMEISAINO_9999999'  value='WFC#COLUMN_VALUE#WFC125WFC#COLUMN_VALUE#WFC'  _k='1'  type='hidden' ></div></td>");
		map.put("95", sBuffer.toString());
		GridDataRowTDMap.put("P00013", map);

		//GridRowStartTDMap data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<td class='g3 l' _colid=0><input style='float:left;' type=checkbox id='Grid95delchkWFC#ROW_COUNT#WFC' name='Grid95delchkWFC#ROW_COUNT#WFC'>WFC#ROW_COUNT#WFC<input type=hidden id='Grid95flgWFC#ROW_COUNT#WFC' name='Grid95flgWFC#ROW_COUNT#WFC'></td>");
		map.put("95", sBuffer.toString());
		GridRowStartTDMap.put("P00013", map);

		//Grid title data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<input type='hidden' name='initRowGrid95' id='initRowGrid95' value='9999999'><input type='hidden' name='RowGrid95' id='RowGrid95' value='9999999'><table id='Grid95' name ='Grid95' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>区分</th><th style='overflow:hidden;text-align:center;'>項目</th><th style='overflow:hidden;text-align:center;'>数量</th><th style='overflow:hidden;text-align:center;'>販売単価</th><th style='overflow:hidden;text-align:center;'>貨幣</th><th style='overflow:hidden;text-align:center;'>販売金額</th><th style='overflow:hidden;text-align:center;'>仕入金額(JPY)</th><th style='overflow:hidden;text-align:center;'>仕入金額(RMB)</th><th style='overflow:hidden;text-align:center;'>仕入金額(USD)</th><th style='overflow:hidden;text-align:center;'>部品明細</th><th style='display:none'>注文書NOGIRD</th><th style='display:none'>出庫フラグ</th><th style='display:none'>部品明細next</th><th style='display:none'>部品新規</th><th style='display:none'>注文書明細NO</th></tr></thead>");
		map.put("95", sBuffer.toString());
		GridTitleItemMap.put("P00013", map);

		//Grid zero row data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0><input style='float:left;' type=checkbox id='Grid95delchk0' name='Grid95delchk0'>0<input type=hidden width=0px id='Grid95flg0' name='Grid95flg0'></td>");
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=KUBUN_0 name=KUBUN_0 data-bind='value: KUBUN' _req=0 class='editable' _subid=97 _itemname='区分' _gid='Grid95' _gflg='Grid95flg0' onChange ='getObj(\"KUBUN_0\").value=this.value;cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  style='width:119px;height:27px;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC97WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KOUMOKU_0'  name='KOUMOKU_0'  class='editable' style='width:136px;height:31px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;'  _subid='99'  _itemname='項目'  _rge='1'  type='text'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SUURYOU_0'  name='SUURYOU_0'  class='editable' style='width:89px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='101'  _itemname='数量'  _rge='1'  type='text'  onChange ='getObj(\"SUURYOU_0\").value=this.value;F20220915201226810($(this));F20220915201226827($(this));F20220915201226844($(this));F20220915201226862($(this));cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='HANBAITANKA_0'  name='HANBAITANKA_0'  class='editable' style='width:73px;height:31px; padding:0 2px;text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='103'  _itemname='販売単価'  _ire='###,###,##0'  _rge='1'  type='text'  onChange ='getObj(\"HANBAITANKA_0\").value=this.value;F20220915201226810($(this));F20220915201226827($(this));F20220915201226844($(this));F20220915201226862($(this));cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=KAHEI_0 name=KAHEI_0 data-bind='value: KAHEI' _req=0 class='editable' _subid=105 _itemname='貨幣' _gid='Grid95' _gflg='Grid95flg0' onChange ='getObj(\"KAHEI_0\").value=this.value;F20220915201226827($(this));F20220915201226844($(this));F20220915201226862($(this));cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  style='width:54px;height:27px;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC105WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g3 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='HANBAIKINGAKU_0'  name='HANBAIKINGAKU_0'  class='readonly' readOnly style='width:66px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='107'  _itemname='販売金額'  _ire='###,###,##0'  _rge='1'  type='text'  onChange ='getObj(\"HANBAIKINGAKU_0\").value=this.value;F20220915201226827($(this));F20220915201226844($(this));F20220915201226862($(this));cs($(this),\"rowseq\",\"Grid95flg\",\"0\");'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TSUKAMATSUNYUUKINGAKUJPY_0'  name='TSUKAMATSUNYUUKINGAKUJPY_0'  class='readonly' readOnly style='width:117px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='109'  _itemname='仕入金額(JPY)'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TSUKAMATSUNYUUKINGAKURMB_0'  name='TSUKAMATSUNYUUKINGAKURMB_0'  class='readonly' readOnly style='width:99px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='111'  _itemname='仕入金額(RMB)'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=9 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TSUKAMATSUNYUUKINGAKUUSD_0'  name='TSUKAMATSUNYUUKINGAKUUSD_0'  class='readonly' readOnly style='width:113px;height:31px; text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='113'  _itemname='仕入金額(USD)'  _ire='###,###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=10><div style=\"overflow:hidden;\"><input id='grdB18W18_0'  name='grdB18W18_0'  value='部品明細'  style='width:157px;height:29px; padding:0 2px;padding:0 2px;text-align:center;font-size:14px;color:#ffffff;font-weight:normal;background:#007b50;' type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdB18W18_0\").value=this.value;ajaxDoAddExeJs(\"A011grdB18W181Click\",null,null,$(this));}'  _gid='Grid95'  _gflg='Grid95flg0' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=11><input id='CHUUBUNSHONO2_0'  name='CHUUBUNSHONO2_0'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=12><input id='SHUKKOFURAGU_0'  name='SHUKKOFURAGU_0'  type='hidden' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=13><div style=\"overflow:hidden;\"><input id='grdB18AA18_0'  name='grdB18AA18_0'  value='部品明細next'   _subid='119'  _itemname='部品明細next'  type='button'  _gid='Grid95'  _gflg='Grid95flg0'  onclick='doLinkTrans119($(this));'  _sf_class='btn04'></div></td>");
		sBuffer.append("<td class='g1 o' _colid=14><div style=\"overflow:hidden;\"><input id='grdB18AB18_0'  name='grdB18AB18_0'  value='部品新規'   _subid='121'  _itemname='部品新規'  type='button'  _gid='Grid95'  _gflg='Grid95flg0'  onclick='doLinkTrans121($(this));'  _sf_class='btn04'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=15><input id='CHUUBUNSHOMEISAINO_0'  name='CHUUBUNSHOMEISAINO_0'  value='[自動採番]'  _k='1'  type='hidden' ></div></td></tr>");
		map.put("95", sBuffer.toString());
		GridRowZeroMap.put("P00013", map);

		//Grid item map
		mapList = new HashMap<String, ArrayList<ItemBean>>();
		beanList = new ArrayList<ItemBean>();
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "97";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "KUBUN";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "0:項目;1:人件費;2:運送費";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "99";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "KOUMOKU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "101";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "SUURYOU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "103";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "HANBAITANKA";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "105";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "KAHEI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "0:JPY;1:RMB;2:USD";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "107";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "HANBAIKINGAKU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "109";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "TSUKAMATSUNYUUKINGAKUJPY";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "111";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "TSUKAMATSUNYUUKINGAKURMB";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "113";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "TSUKAMATSUNYUUKINGAKUUSD";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "11";
		itemBean.SubID = "115";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "123";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "CHUUBUNSHONO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "117";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "SHUKKOFURAGU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "12";
		itemBean.SubID = "119";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "L00046";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "12";
		itemBean.SubID = "121";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "L00047";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		itemBean = new A011GridDataConstant().new ItemBean();
		itemBean.OjeKind = "7";
		itemBean.SubID = "125";
		itemBean.TableID = "TYUMONSYOMEISAI";
		itemBean.FieldID = "CHUUBUNSHOMEISAINO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		mapList.put("95", beanList);
		GridItemSubIDMap.put("P00013", mapList);
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
			gridTitle = getMapValueByKey(pageID, subID, A011GridDataConstant.GridTitleItemMap);
		}
		
		gridRowZero = getMapValueByKey(pageID, subID, A011GridDataConstant.GridRowZeroMap);
		gridRowZero = changeGridItem(gridRowZero, pageID, subID, null)	;
		if (dataListMap != null && dataListMap.size() > 0) {
			rowStartTD = getMapValueByKey(pageID, subID, A011GridDataConstant.GridRowStartTDMap);
			
			rowTD = getMapValueByKey(pageID, subID, A011GridDataConstant.GridDataRowTDMap);
			
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
    A011DropDownListOptionBean ddloc = new A011DropDownListOptionBean();
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
