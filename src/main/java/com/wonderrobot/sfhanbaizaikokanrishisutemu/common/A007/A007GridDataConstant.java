package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A007;
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
 *      class: A007GridDataConstant
 *      Page: 
 * @version
 */

public class A007GridDataConstant {
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
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='CHUUBUNSHONO1_9999999'  name='CHUUBUNSHONO1_9999999'  value='WFC#COLUMN_VALUE#WFC21WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:88px;height:31px; text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='21'  _itemname='注文書NO' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='CHUUBUNSHOMEISAINO_9999999'  name='CHUUBUNSHOMEISAINO_9999999'  value='WFC#COLUMN_VALUE#WFC23WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:91px;height:31px; text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='23'  _itemname='注文書明細NO' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KOUJIKANRIBANGOU_9999999'  name='KOUJIKANRIBANGOU_9999999'  value='WFC#COLUMN_VALUE#WFC25WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:79px;height:31px; text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='25'  _itemname='工事管理番号' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='ZAIKONO1_9999999'  name='ZAIKONO1_9999999'  value='WFC#COLUMN_VALUE#WFC27WFC#COLUMN_VALUE#WFC'  _k='1'  class='readonly' readOnly style='width:81px;height:25px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='27'  _itemname='部品明細連番' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 l' _colid=5 style='word-wrap: break-word;'><input type=text name=showTSUKAMATSUNYUUSAKI_9999999 id=showTSUKAMATSUNYUUSAKI_9999999 value='WFC#ITEM_SHOW_VALUE#WFC29WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=29 _itemname='仕入先' style='width:83px;height:27px;vertical-align:middle;display: table-cell;vertical-align: middle;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=TSUKAMATSUNYUUSAKI_9999999 id=TSUKAMATSUNYUUSAKI_9999999 value='WFC#COLUMN_VALUE#WFC29WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHOUHINMEISHOU_9999999'  name='SHOUHINMEISHOU_9999999'  value='WFC#COLUMN_VALUE#WFC31WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:99px;height:31px; text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='31'  _itemname='部品名称' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg9999999' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=SHUTSUNYUUKOJIKAN_9999999 id=SHUTSUNYUUKOJIKAN_9999999 data-bind='value: SHUTSUNYUUKOJIKAN' value='WFC#COLUMN_VALUE#WFC33WFC#COLUMN_VALUE#WFC' class='readonly' readOnly _subid=33 _itemname='出入庫時間' _gid='Grid19' _gflg='Grid19flg9999999' onChange ='getObj(\"SHUTSUNYUUKOJIKAN_9999999\").value=this.value;dateFormatChange($(this),\"出入庫時間\");cs($(this),\"rowseq\",\"Grid19flg\",\"0\");'  style='width:86px;height:29px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SUURYOU_9999999'  name='SUURYOU_9999999'  value='WFC#COLUMN_VALUE#WFC35WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:52px;height:31px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='35'  _itemname='数量'  _rge='2' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=9 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='PRICE_9999999'  name='PRICE_9999999'  value='WFC#COLUMN_VALUE#WFC37WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:52px;height:31px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='37'  _itemname='単価'  _ire='###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 l' _colid=10 style='word-wrap: break-word;'><input type=text name=showSHUTSUNYUUKOJOUTAI_9999999 id=showSHUTSUNYUUKOJOUTAI_9999999 value='WFC#ITEM_SHOW_VALUE#WFC39WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=39 _itemname='状態' style='width:55px;height:27px;vertical-align:middle;display: table-cell;vertical-align: middle;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=SHUTSUNYUUKOJOUTAI_9999999 id=SHUTSUNYUUKOJOUTAI_9999999 value='WFC#COLUMN_VALUE#WFC39WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 o' _colid=11><div style=\"overflow:hidden;\"><input id='grdB8AE8_9999999'  name='grdB8AE8_9999999'  value='入庫'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdB8AE8_9999999\").value=this.value;ajaxDoAddExeJs(\"A007grdB8AE81Click\",null,null,$(this));}'  _gid='Grid19'  _gflg='Grid19flg9999999'  class='button_red' _sf_class='button_red'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=12><input id='SHUKKANO_9999999'  name='SHUKKANO_9999999'  value='WFC#COLUMN_VALUE#WFC43WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=13><input id='SHOUHINKATABAN_9999999'  name='SHOUHINKATABAN_9999999'  value='WFC#COLUMN_VALUE#WFC45WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=14><input id='ZAIKOSUURYOU_9999999'  name='ZAIKOSUURYOU_9999999'  value='WFC#COLUMN_VALUE#WFC47WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=15><input id='SHOUHINNO_9999999'  name='SHOUHINNO_9999999'  value='WFC#COLUMN_VALUE#WFC49WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		map.put("19", sBuffer.toString());
		GridDataRowTDMap.put("A007", map);

		//GridRowStartTDMap data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<td class='g3 l' _colid=0><input style='float:left;' type=hidden id='Grid19delchkWFC#ROW_COUNT#WFC' name='Grid19delchkWFC#ROW_COUNT#WFC'>WFC#ROW_COUNT#WFC<input type=hidden id='Grid19flgWFC#ROW_COUNT#WFC' name='Grid19flgWFC#ROW_COUNT#WFC'></td>");
		map.put("19", sBuffer.toString());
		GridRowStartTDMap.put("A007", map);

		//Grid title data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<input type='hidden' name='initRowGrid19' id='initRowGrid19' value='9999999'><input type='hidden' name='RowGrid19' id='RowGrid19' value='9999999'><table id='Grid19' name ='Grid19' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>注文書NO*</th><th style='overflow:hidden;text-align:center;'>注文書明細NO</th><th style='overflow:hidden;text-align:center;'>工事管理番号</th><th style='overflow:hidden;text-align:center;'>部品明細連番</th><th style='overflow:hidden;text-align:center;'>仕入先</th><th style='overflow:hidden;text-align:center;'>部品名称</th><th style='overflow:hidden;text-align:center;'>出入庫時間</th><th style='overflow:hidden;text-align:center;'>数量</th><th style='overflow:hidden;text-align:center;'>単価</th><th style='overflow:hidden;text-align:center;'>状態</th><th style='overflow:hidden;text-align:center;'>入庫</th><th style='display:none'>出荷NO</th><th style='display:none'>商品型番</th><th style='display:none'>在庫数量</th><th style='display:none'>商品NO</th></tr></thead>");
		map.put("19", sBuffer.toString());
		GridTitleItemMap.put("A007", map);

		//Grid zero row data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0>0<input type=hidden width=0px id='Grid19flg0' name='Grid19flg0'></td>");
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='CHUUBUNSHONO1_0'  name='CHUUBUNSHONO1_0'  class='readonly' readOnly style='width:88px;height:31px; text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='21'  _itemname='注文書NO'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='CHUUBUNSHOMEISAINO_0'  name='CHUUBUNSHOMEISAINO_0'  class='readonly' readOnly style='width:91px;height:31px; text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='23'  _itemname='注文書明細NO'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KOUJIKANRIBANGOU_0'  name='KOUJIKANRIBANGOU_0'  class='readonly' readOnly style='width:79px;height:31px; text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='25'  _itemname='工事管理番号'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='ZAIKONO1_0'  name='ZAIKONO1_0'  value='[自動採番]'  _k='1'  class='readonly' readOnly style='width:81px;height:25px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='27'  _itemname='部品明細連番'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg0' ></div></td>");
		sBuffer.append("<td class='g1 l' _colid=5 style='word-wrap: break-word;'><input type=text name=showTSUKAMATSUNYUUSAKI_0 id=showTSUKAMATSUNYUUSAKI_0 value='WFC#ITEM_SHOW_VALUE#WFC29WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=29 _itemname='仕入先' style='width:83px;height:27px;vertical-align:middle;display: table-cell;vertical-align: middle;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=TSUKAMATSUNYUUSAKI_0 id=TSUKAMATSUNYUUSAKI_0 value='WFC#COLUMN_VALUE#WFC29WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHOUHINMEISHOU_0'  name='SHOUHINMEISHOU_0'  class='readonly' readOnly style='width:99px;height:31px; text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='31'  _itemname='部品名称'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg0' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=SHUTSUNYUUKOJIKAN_0 id=SHUTSUNYUUKOJIKAN_0 data-bind='value: SHUTSUNYUUKOJIKAN' value='' class='readonly' readOnly _subid=33 _itemname='出入庫時間' _gid='Grid19' _gflg='Grid19flg0' onChange ='getObj(\"SHUTSUNYUUKOJIKAN_0\").value=this.value;dateFormatChange($(this),\"出入庫時間\");cs($(this),\"rowseq\",\"Grid19flg\",\"0\");'  style='width:86px;height:29px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SUURYOU_0'  name='SUURYOU_0'  class='readonly' readOnly style='width:52px;height:31px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='35'  _itemname='数量'  _rge='2' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=9 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='PRICE_0'  name='PRICE_0'  class='readonly' readOnly style='width:52px;height:31px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='37'  _itemname='単価'  _ire='###,##0.##'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid19'  _gflg='Grid19flg0' ></div></td>");
		sBuffer.append("<td class='g1 l' _colid=10 style='word-wrap: break-word;'><input type=text name=showSHUTSUNYUUKOJOUTAI_0 id=showSHUTSUNYUUKOJOUTAI_0 value='WFC#ITEM_SHOW_VALUE#WFC39WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=39 _itemname='状態' style='width:55px;height:27px;vertical-align:middle;display: table-cell;vertical-align: middle;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=SHUTSUNYUUKOJOUTAI_0 id=SHUTSUNYUUKOJOUTAI_0 value='WFC#COLUMN_VALUE#WFC39WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 o' _colid=11><div style=\"overflow:hidden;\"><input id='grdB8AE8_0'  name='grdB8AE8_0'  value='入庫'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdB8AE8_0\").value=this.value;ajaxDoAddExeJs(\"A007grdB8AE81Click\",null,null,$(this));}'  _gid='Grid19'  _gflg='Grid19flg0'  class='button_red' _sf_class='button_red'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=12><input id='SHUKKANO_0'  name='SHUKKANO_0'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=13><input id='SHOUHINKATABAN_0'  name='SHOUHINKATABAN_0'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=14><input id='ZAIKOSUURYOU_0'  name='ZAIKOSUURYOU_0'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=15><input id='SHOUHINNO_0'  name='SHOUHINNO_0'  type='hidden' ></div></td></tr>");
		map.put("19", sBuffer.toString());
		GridRowZeroMap.put("A007", map);

		//Grid item map
		mapList = new HashMap<String, ArrayList<ItemBean>>();
		beanList = new ArrayList<ItemBean>();
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "21";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "CHUUBUNSHONO";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "23";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "CHUUBUNSHOMEISAINO";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "25";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "KOUJIKANRIBANGOU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "7";
		itemBean.SubID = "27";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "ZAIKONO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "29";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "TSUKAMATSUNYUUSAKI";
		itemBean.ReadOnly = "2";
		itemBean.RelData = "KAISYA";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "31";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "SHOUHINMEISHOU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "33";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "SHUTSUNYUUKOJIKAN";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "35";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "SUURYOU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "37";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "PRICE";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "39";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "SHUTSUNYUUKOJOUTAI";
		itemBean.ReadOnly = "2";
		itemBean.RelData = "0:未入庫;1:入庫済み;2:出庫";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "11";
		itemBean.SubID = "41";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "43";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "SHUKKANO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "45";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "SHOUHINKATABAN";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "47";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "ZAIKOSUURYOU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A007GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "49";
		itemBean.TableID = "ZAIKOU";
		itemBean.FieldID = "SHOUHINNO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		mapList.put("19", beanList);
		GridItemSubIDMap.put("A007", mapList);
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
			gridTitle = getMapValueByKey(pageID, subID, A007GridDataConstant.GridTitleItemMap);
		}
		
		gridRowZero = getMapValueByKey(pageID, subID, A007GridDataConstant.GridRowZeroMap);
		gridRowZero = changeGridItem(gridRowZero, pageID, subID, null)	;
		if (dataListMap != null && dataListMap.size() > 0) {
			rowStartTD = getMapValueByKey(pageID, subID, A007GridDataConstant.GridRowStartTDMap);
			
			rowTD = getMapValueByKey(pageID, subID, A007GridDataConstant.GridDataRowTDMap);
			
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
    A007DropDownListOptionBean ddloc = new A007DropDownListOptionBean();
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
