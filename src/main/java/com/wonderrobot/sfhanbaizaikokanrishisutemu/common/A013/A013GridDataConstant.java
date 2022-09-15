package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A013;
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
 *      class: A013GridDataConstant
 *      Page: 
 * @version
 */

public class A013GridDataConstant {
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
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=SEISAKUHINKUBUN_9999999 name=SEISAKUHINKUBUN_9999999 data-bind='value: SEISAKUHINKUBUN' _req=1 class='editable' _subid=101 _itemname='区分' _gid='Grid99' _gflg='Grid99flg9999999' onChange ='getObj(\"SEISAKUHINKUBUN_9999999\").value=this.value;cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:74px;height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC101WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='HINBANNO1_9999999'  name='HINBANNO1_9999999'  value='WFC#COLUMN_VALUE#WFC103WFC#COLUMN_VALUE#WFC'  class='editable' style='width:75px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='103'  _itemname='品番NO'  type='text'  _gid='Grid99'  _gflg='Grid99flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='HINMEI_9999999'  name='HINMEI_9999999'  value='WFC#COLUMN_VALUE#WFC105WFC#COLUMN_VALUE#WFC'  class='editable' style='width:95px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='105'  _itemname='品名'  type='text'  onChange ='getObj(\"HINMEI_9999999\").value=this.value;ajaxDoAddExeJs(\"A013HINMEI1Change\",null,null,$(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  _gid='Grid99'  _gflg='Grid99flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KOSUU_9999999'  name='KOSUU_9999999'  value='WFC#COLUMN_VALUE#WFC107WFC#COLUMN_VALUE#WFC'  class='editable' style='width:63px;height:26px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='107'  _itemname='個数'  type='text'  onChange ='getObj(\"KOSUU_9999999\").value=this.value;A013KOSUU1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  _gid='Grid99'  _gflg='Grid99flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SOUKOSUU_9999999'  name='SOUKOSUU_9999999'  value='WFC#COLUMN_VALUE#WFC109WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:70px;height:26px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='109'  _itemname='総個数' onblur='changeSpecHtml(this);' type='text'  _gid='Grid99'  _gflg='Grid99flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TSUKAMATSUNYUUSAKI_9999999'  name='TSUKAMATSUNYUUSAKI_9999999'  value='WFC#COLUMN_VALUE#WFC111WFC#COLUMN_VALUE#WFC'  class='editable' style='width:143px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='111'  _itemname='仕入先'  type='text'  _gid='Grid99'  _gflg='Grid99flg9999999' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=KIBOUNOUKI_9999999 id=KIBOUNOUKI_9999999 data-bind='value: KIBOUNOUKI' value='WFC#COLUMN_VALUE#WFC113WFC#COLUMN_VALUE#WFC' class='editable calendar' _subid=113 _itemname='希望納期' _gid='Grid99' _gflg='Grid99flg9999999' onChange ='getObj(\"KIBOUNOUKI_9999999\").value=this.value;dateFormatChange($(this),\"希望納期\");A013KIBOUNOUKI1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:88px;height:24px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g1 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=TANTOU_9999999 name=TANTOU_9999999 data-bind='value: TANTOU' _req=0 class='editable' _subid=115 _itemname='担当' _gid='Grid99' _gflg='Grid99flg9999999' onChange ='getObj(\"TANTOU_9999999\").value=this.value;cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:71px;height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC115WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g1 o' _colid=9 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TEHAISAKI_9999999'  name='TEHAISAKI_9999999'  value='WFC#COLUMN_VALUE#WFC117WFC#COLUMN_VALUE#WFC'  class='editable' style='width:145px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='117'  _itemname='手配先'  _rge='2'  type='text'  _gid='Grid99'  _gflg='Grid99flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=10 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KOUNYUUTANKA_9999999'  name='KOUNYUUTANKA_9999999'  value='WFC#COLUMN_VALUE#WFC119WFC#COLUMN_VALUE#WFC'  class='editable' style='width:79px;height:26px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='119'  _itemname='購入単価'  _rge='2'  type='text'  onChange ='getObj(\"KOUNYUUTANKA_9999999\").value=this.value;A013KOUNYUUTANKA1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  _gid='Grid99'  _gflg='Grid99flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=11 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=KAHEI_9999999 name=KAHEI_9999999 data-bind='value: KAHEI' _req=0 class='editable' _subid=121 _itemname='貨幣' _gid='Grid99' _gflg='Grid99flg9999999' onChange ='getObj(\"KAHEI_9999999\").value=this.value;A013KAHEI1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:73px;height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC121WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g2 o' _colid=12 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=TEHAIBI_9999999 id=TEHAIBI_9999999 data-bind='value: TEHAIBI' value='WFC#COLUMN_VALUE#WFC123WFC#COLUMN_VALUE#WFC' class='editable calendar' _subid=123 _itemname='購入日付' _gid='Grid99' _gflg='Grid99flg9999999' onChange ='getObj(\"TEHAIBI_9999999\").value=this.value;dateFormatChange($(this),\"購入日付\");cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:79px;height:24px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g2 o' _colid=13 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=NYUUKABI_9999999 id=NYUUKABI_9999999 data-bind='value: NYUUKABI' value='WFC#COLUMN_VALUE#WFC125WFC#COLUMN_VALUE#WFC' class='editable calendar' _subid=125 _itemname='入荷日付' _gid='Grid99' _gflg='Grid99flg9999999' onChange ='getObj(\"NYUUKABI_9999999\").value=this.value;dateFormatChange($(this),\"入荷日付\");A013NYUUKABI1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:84px;height:24px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=14 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHOUKEI_9999999'  name='SHOUKEI_9999999'  value='WFC#COLUMN_VALUE#WFC127WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:53px;height:26px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='127'  _itemname='小計'  _ire='###,###,##0'  _rge='1'  type='text'  onChange ='getObj(\"SHOUKEI_9999999\").value=this.value;A013SHOUKEI1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  _gid='Grid99'  _gflg='Grid99flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=15 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KAKOTANKA_9999999'  name='KAKOTANKA_9999999'  value='WFC#COLUMN_VALUE#WFC129WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:70px;height:26px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='129'  _itemname='過去単価'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid99'  _gflg='Grid99flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=16><div style=\"overflow:hidden;\"><input id='grdB16AC16_9999999'  name='grdB16AC16_9999999'  value='確定'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdB16AC16_9999999\").value=this.value;ajaxDoAddExeJs(\"A013grdB16AC161Click\",null,null,$(this));}'  _gid='Grid99'  _gflg='Grid99flg9999999'  class='buttonon' _sf_class='buttonon'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=17><input id='CHUUBUNSHOMEISAINO1_9999999'  name='CHUUBUNSHOMEISAINO1_9999999'  value='WFC#COLUMN_VALUE#WFC133WFC#COLUMN_VALUE#WFC'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=18><input id='CHUUBUNSHONO1_9999999'  name='CHUUBUNSHONO1_9999999'  value='WFC#COLUMN_VALUE#WFC135WFC#COLUMN_VALUE#WFC'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=19><input id='KIBOUTANKA_9999999'  name='KIBOUTANKA_9999999'  value='WFC#COLUMN_VALUE#WFC137WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=20><input id='NYUUKAYOTEIBI_9999999'  name='NYUUKAYOTEIBI_9999999'  value='WFC#COLUMN_VALUE#WFC139WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=21><input id='HINBANNO_9999999'  name='HINBANNO_9999999'  value='WFC#COLUMN_VALUE#WFC141WFC#COLUMN_VALUE#WFC'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=22><input id='KOUJIKANRIBANGOU2_9999999'  name='KOUJIKANRIBANGOU2_9999999'  value='WFC#COLUMN_VALUE#WFC145WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=23><input id='KAKUTEIKUBUN2_9999999'  name='KAKUTEIKUBUN2_9999999'  value='WFC#COLUMN_VALUE#WFC143WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		map.put("99", sBuffer.toString());
		GridDataRowTDMap.put("P00014", map);

		//GridRowStartTDMap data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<td class='g3 l' _colid=0><input style='float:left;' type=hidden id='Grid99delchkWFC#ROW_COUNT#WFC' name='Grid99delchkWFC#ROW_COUNT#WFC'>WFC#ROW_COUNT#WFC<input type=hidden id='Grid99flgWFC#ROW_COUNT#WFC' name='Grid99flgWFC#ROW_COUNT#WFC'></td>");
		map.put("99", sBuffer.toString());
		GridRowStartTDMap.put("P00014", map);

		//Grid title data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<input type='hidden' name='initRowGrid99' id='initRowGrid99' value='9999999'><input type='hidden' name='RowGrid99' id='RowGrid99' value='9999999'><table id='Grid99' name ='Grid99' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>区分*</th><th style='overflow:hidden;text-align:center;'>品番NO</th><th style='overflow:hidden;text-align:center;'>品名*</th><th style='overflow:hidden;text-align:center;'>個数*</th><th style='overflow:hidden;text-align:center;'>総個数*</th><th style='overflow:hidden;text-align:center;'>仕入先*</th><th style='overflow:hidden;text-align:center;'>希望納期</th><th style='overflow:hidden;text-align:center;'>担当</th><th style='overflow:hidden;text-align:center;'>手配先</th><th style='overflow:hidden;text-align:center;'>購入単価</th><th style='overflow:hidden;text-align:center;'>貨幣</th><th style='overflow:hidden;text-align:center;'>購入日付</th><th style='overflow:hidden;text-align:center;'>入荷日付</th><th style='overflow:hidden;text-align:center;'>小計</th><th style='overflow:hidden;text-align:center;'>過去単価</th><th style='overflow:hidden;text-align:center;'>確定</th><th style='display:none'>注文書明細NO</th><th style='display:none'>注文書NO</th><th style='display:none'>希望単価</th><th style='display:none'>入荷予定日</th><th style='display:none'>品番Nohide</th><th style='display:none'>工事管理番号hide</th><th style='display:none'>確定区分</th></tr></thead>");
		map.put("99", sBuffer.toString());
		GridTitleItemMap.put("P00014", map);

		//Grid zero row data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0>0<input type=hidden width=0px id='Grid99flg0' name='Grid99flg0'></td>");
		sBuffer.append("<td class='g1 o' _colid=1 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=SEISAKUHINKUBUN_0 name=SEISAKUHINKUBUN_0 data-bind='value: SEISAKUHINKUBUN' _req=1 class='editable' _subid=101 _itemname='区分' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj(\"SEISAKUHINKUBUN_0\").value=this.value;cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:74px;height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC101WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='HINBANNO1_0'  name='HINBANNO1_0'  class='editable' style='width:75px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='103'  _itemname='品番NO'  _rge='2'  type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='HINMEI_0'  name='HINMEI_0'  class='editable' style='width:95px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='105'  _itemname='品名'  _rge='2'  type='text'  onChange ='getObj(\"HINMEI_0\").value=this.value;ajaxDoAddExeJs(\"A013HINMEI1Change\",null,null,$(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=4 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KOSUU_0'  name='KOSUU_0'  class='editable' style='width:63px;height:26px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='107'  _itemname='個数'  _rge='2'  type='text'  onChange ='getObj(\"KOSUU_0\").value=this.value;A013KOSUU1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SOUKOSUU_0'  name='SOUKOSUU_0'  class='readonly' readOnly style='width:70px;height:26px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='109'  _itemname='総個数'  _rge='2' onblur='changeSpecHtml(this);' type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TSUKAMATSUNYUUSAKI_0'  name='TSUKAMATSUNYUUSAKI_0'  class='editable' style='width:143px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='111'  _itemname='仕入先'  _rge='2'  type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=KIBOUNOUKI_0 id=KIBOUNOUKI_0 data-bind='value: KIBOUNOUKI' value='' class='editable calendar' _subid=113 _itemname='希望納期' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj(\"KIBOUNOUKI_0\").value=this.value;dateFormatChange($(this),\"希望納期\");A013KIBOUNOUKI1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:88px;height:24px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g1 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=TANTOU_0 name=TANTOU_0 data-bind='value: TANTOU' _req=0 class='editable' _subid=115 _itemname='担当' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj(\"TANTOU_0\").value=this.value;cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:71px;height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC115WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g1 o' _colid=9 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='TEHAISAKI_0'  name='TEHAISAKI_0'  class='editable' style='width:145px;height:26px; padding:0 2px;text-align:left;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='117'  _itemname='手配先'  _rge='2'  type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=10 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KOUNYUUTANKA_0'  name='KOUNYUUTANKA_0'  class='editable' style='width:79px;height:26px; padding:0 2px;text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='119'  _itemname='購入単価'  _rge='2'  type='text'  onChange ='getObj(\"KOUNYUUTANKA_0\").value=this.value;A013KOUNYUUTANKA1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=11 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><select id=KAHEI_0 name=KAHEI_0 data-bind='value: KAHEI' _req=0 class='editable' _subid=121 _itemname='貨幣' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj(\"KAHEI_0\").value=this.value;A013KAHEI1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:73px;height:22px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'>WFC#ROW_DROPDOWNLIST_OPTIONS#WFC121WFC#ROW_DROPDOWNLIST_OPTIONS#WFC</select></div></td>");
		sBuffer.append("<td class='g2 o' _colid=12 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=TEHAIBI_0 id=TEHAIBI_0 data-bind='value: TEHAIBI' value='' class='editable calendar' _subid=123 _itemname='購入日付' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj(\"TEHAIBI_0\").value=this.value;dateFormatChange($(this),\"購入日付\");cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:79px;height:24px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g2 o' _colid=13 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=NYUUKABI_0 id=NYUUKABI_0 data-bind='value: NYUUKABI' value='' class='editable calendar' _subid=125 _itemname='入荷日付' _gid='Grid99' _gflg='Grid99flg0' onChange ='getObj(\"NYUUKABI_0\").value=this.value;dateFormatChange($(this),\"入荷日付\");A013NYUUKABI1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  style='width:84px;height:24px; padding:0 2px;text-align:center;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=14 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHOUKEI_0'  name='SHOUKEI_0'  class='readonly' readOnly style='width:53px;height:26px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='127'  _itemname='小計'  _ire='###,###,##0'  _rge='1'  type='text'  onChange ='getObj(\"SHOUKEI_0\").value=this.value;A013SHOUKEI1($(this));cs($(this),\"rowseq\",\"Grid99flg\",\"0\");'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=15 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='KAKOTANKA_0'  name='KAKOTANKA_0'  class='readonly' readOnly style='width:70px;height:26px; text-align:right;padding-right:2px;vertical-align:middle;font-size:14px;color:#000000;font-weight:normal;'  _subid='129'  _itemname='過去単価'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid99'  _gflg='Grid99flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=16><div style=\"overflow:hidden;\"><input id='grdB16AC16_0'  name='grdB16AC16_0'  value='確定'  type='button'  onClick ='if (SF.isServerExecute()) {SF.setServerExecute(false);getObj(\"grdB16AC16_0\").value=this.value;ajaxDoAddExeJs(\"A013grdB16AC161Click\",null,null,$(this));}'  _gid='Grid99'  _gflg='Grid99flg0'  class='buttonon' _sf_class='buttonon'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=17><input id='CHUUBUNSHOMEISAINO1_0'  name='CHUUBUNSHOMEISAINO1_0'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=18><input id='CHUUBUNSHONO1_0'  name='CHUUBUNSHONO1_0'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=19><input id='KIBOUTANKA_0'  name='KIBOUTANKA_0'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=20><input id='NYUUKAYOTEIBI_0'  name='NYUUKAYOTEIBI_0'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=21><input id='HINBANNO_0'  name='HINBANNO_0'  value='[自動採番]'  _k='1'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=22><input id='KOUJIKANRIBANGOU2_0'  name='KOUJIKANRIBANGOU2_0'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=23><input id='KAKUTEIKUBUN2_0'  name='KAKUTEIKUBUN2_0'  type='hidden' ></div></td></tr>");
		map.put("99", sBuffer.toString());
		GridRowZeroMap.put("P00014", map);

		//Grid item map
		mapList = new HashMap<String, ArrayList<ItemBean>>();
		beanList = new ArrayList<ItemBean>();
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "101";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "SEISAKUHINKUBUN";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "0:加工件;1:購入品";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "103";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "HINBANNO1";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "105";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "HINMEI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "107";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "KOSUU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "109";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "SOUKOSUU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "111";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "TSUKAMATSUNYUUSAKI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "113";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "KIBOUNOUKI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "115";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "TANTOU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "SYAIN";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "117";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "TEHAISAKI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "119";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "KOUNYUUTANKA";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "121";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "KAHEI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "0:JPY;1:RMB;2:USD";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "123";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "TEHAIBI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "125";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "NYUUKABI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "127";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "SHOUKEI";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "129";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "KAKOTANKA";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "11";
		itemBean.SubID = "131";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "133";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "CHUUBUNSHOMEISAINO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "135";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "CHUUBUNSHONO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "137";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "KIBOUTANKA";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "139";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "NYUUKAYOTEIBI";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "7";
		itemBean.SubID = "141";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "HINBANNO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "145";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "KOUJIKANRIBANGOU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A013GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "143";
		itemBean.TableID = "BUHINSYOUSAI";
		itemBean.FieldID = "KAKUTEIKUBUN";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		mapList.put("99", beanList);
		GridItemSubIDMap.put("P00014", mapList);
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
			gridTitle = getMapValueByKey(pageID, subID, A013GridDataConstant.GridTitleItemMap);
		}
		
		gridRowZero = getMapValueByKey(pageID, subID, A013GridDataConstant.GridRowZeroMap);
		gridRowZero = changeGridItem(gridRowZero, pageID, subID, null)	;
		if (dataListMap != null && dataListMap.size() > 0) {
			rowStartTD = getMapValueByKey(pageID, subID, A013GridDataConstant.GridRowStartTDMap);
			
			rowTD = getMapValueByKey(pageID, subID, A013GridDataConstant.GridDataRowTDMap);
			
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
    A013DropDownListOptionBean ddloc = new A013DropDownListOptionBean();
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
