package com.wonderrobot.sfhanbaizaikokanrishisutemu.common.A008;
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
 *      class: A008GridDataConstant
 *      Page: 
 * @version
 */

public class A008GridDataConstant {
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
		sBuffer.append("<td class='g1 l' _colid=1 style='word-wrap: break-word;'><input type=text name=showKYAKUSAKIID_9999999 id=showKYAKUSAKIID_9999999 value='WFC#ITEM_SHOW_VALUE#WFC25WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=25 _itemname='客先' style='width:131px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=KYAKUSAKIID_9999999 id=KYAKUSAKIID_9999999 value='WFC#COLUMN_VALUE#WFC25WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHANAIKOUJIBANGOU_9999999'  name='SHANAIKOUJIBANGOU_9999999'  value='WFC#COLUMN_VALUE#WFC27WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:99px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='27'  _itemname='社内工事番号' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHOUHINSOUGAKUJPY_9999999'  name='SHOUHINSOUGAKUJPY_9999999'  value='WFC#COLUMN_VALUE#WFC29WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:68px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='29'  _itemname='契約金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 l' _colid=4 style='word-wrap: break-word;'><input type=text name=showTANTOUSHAID_9999999 id=showTANTOUSHAID_9999999 value='WFC#ITEM_SHOW_VALUE#WFC31WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=31 _itemname='担当者' style='width:79px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=TANTOUSHAID_9999999 id=TANTOUSHAID_9999999 value='WFC#COLUMN_VALUE#WFC31WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g2 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=CHUUMONHIDZUKE1_9999999 id=CHUUMONHIDZUKE1_9999999 data-bind='value: CHUUMONHIDZUKE1' value='WFC#COLUMN_VALUE#WFC33WFC#COLUMN_VALUE#WFC' class='readonly' readOnly _subid=33 _itemname='受注日付' _gid='Grid23' _gflg='Grid23flg9999999' onChange ='getObj(\"CHUUMONHIDZUKE1_9999999\").value=this.value;dateFormatChange($(this),\"受注日付\");cs($(this),\"rowseq\",\"Grid23flg\",\"0\");'  style='width:86px;height:29px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g2 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=SHIHARAIHIDZUKE_9999999 id=SHIHARAIHIDZUKE_9999999 data-bind='value: SHIHARAIHIDZUKE' value='WFC#COLUMN_VALUE#WFC35WFC#COLUMN_VALUE#WFC' class='readonly' readOnly _subid=35 _itemname='入金予定日' _gid='Grid23' _gflg='Grid23flg9999999' onChange ='getObj(\"SHIHARAIHIDZUKE_9999999\").value=this.value;dateFormatChange($(this),\"入金予定日\");cs($(this),\"rowseq\",\"Grid23flg\",\"0\");'  style='width:93px;height:29px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g1 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='FURIDASHIZUMIWARIAI_9999999'  name='FURIDASHIZUMIWARIAI_9999999'  value='WFC#COLUMN_VALUE#WFC37WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:71px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='37'  _itemname='振出済み%'  _rge='2' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=FURIDASHIZUMIHIDZUKE_9999999 id=FURIDASHIZUMIHIDZUKE_9999999 data-bind='value: FURIDASHIZUMIHIDZUKE' value='WFC#COLUMN_VALUE#WFC39WFC#COLUMN_VALUE#WFC' class='readonly' readOnly _subid=39 _itemname='振出日' _gid='Grid23' _gflg='Grid23flg9999999' onChange ='getObj(\"FURIDASHIZUMIHIDZUKE_9999999\").value=this.value;dateFormatChange($(this),\"振出日\");cs($(this),\"rowseq\",\"Grid23flg\",\"0\");'  style='width:100px;height:29px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=9 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='FURIDASHIZUMIKINGAKU_9999999'  name='FURIDASHIZUMIKINGAKU_9999999'  value='WFC#COLUMN_VALUE#WFC41WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:92px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='41'  _itemname='振出済み金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=10 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINWARIAI_9999999'  name='NYUUKINWARIAI_9999999'  value='WFC#COLUMN_VALUE#WFC43WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:62px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='43'  _itemname='未振出%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=11 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINGAKU_9999999'  name='NYUUKINGAKU_9999999'  value='WFC#COLUMN_VALUE#WFC45WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:81px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='45'  _itemname='未振出金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=12 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINZUMIWARIAI_9999999'  name='NYUUKINZUMIWARIAI_9999999'  value='WFC#COLUMN_VALUE#WFC47WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:72px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='47'  _itemname='入金済み%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=13 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINZUMIKINGAKU_9999999'  name='NYUUKINZUMIKINGAKU_9999999'  value='WFC#COLUMN_VALUE#WFC49WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:87px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='49'  _itemname='入金済み金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=14 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='MINYUUKINWARIAI_9999999'  name='MINYUUKINWARIAI_9999999'  value='WFC#COLUMN_VALUE#WFC51WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:72px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='51'  _itemname='未入金%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=15 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='MINYUUKINKINGAKU_9999999'  name='MINYUUKINKINGAKU_9999999'  value='WFC#COLUMN_VALUE#WFC53WFC#COLUMN_VALUE#WFC'  class='readonly' readOnly style='width:82px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='53'  _itemname='未入金金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg9999999' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=16><div style=\"overflow:hidden;\"><input id='grdB8AF8_9999999'  name='grdB8AF8_9999999'  value='編集'   _subid='55'  _itemname='編集'  type='button'  _gid='Grid23'  _gflg='Grid23flg9999999'  onclick='doLinkTrans55($(this));'  _sf_class='buttonon'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=17><input id='RESHIITONO_9999999'  name='RESHIITONO_9999999'  value='WFC#COLUMN_VALUE#WFC57WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=18><input id='CHUUBUNSHONO1_9999999'  name='CHUUBUNSHONO1_9999999'  value='WFC#COLUMN_VALUE#WFC59WFC#COLUMN_VALUE#WFC'  type='hidden' ></div></td>");
		map.put("23", sBuffer.toString());
		GridDataRowTDMap.put("A008", map);

		//GridRowStartTDMap data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<td class='g3 l' _colid=0><input style='float:left;' type=hidden id='Grid23delchkWFC#ROW_COUNT#WFC' name='Grid23delchkWFC#ROW_COUNT#WFC'>WFC#ROW_COUNT#WFC<input type=hidden id='Grid23flgWFC#ROW_COUNT#WFC' name='Grid23flgWFC#ROW_COUNT#WFC'></td>");
		map.put("23", sBuffer.toString());
		GridRowStartTDMap.put("A008", map);

		//Grid title data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<input type='hidden' name='initRowGrid23' id='initRowGrid23' value='9999999'><input type='hidden' name='RowGrid23' id='RowGrid23' value='9999999'><table id='Grid23' name ='Grid23' ><thead><tr><th style='text-align:center;'>No.</th><th style='overflow:hidden;text-align:center;'>客先*</th><th style='overflow:hidden;text-align:center;'>社内工事番号</th><th style='overflow:hidden;text-align:center;'>契約金額</th><th style='overflow:hidden;text-align:center;'>担当者</th><th style='overflow:hidden;text-align:center;'>受注日付</th><th style='overflow:hidden;text-align:center;'>入金予定日</th><th style='overflow:hidden;text-align:center;'>振出済み%</th><th style='overflow:hidden;text-align:center;'>振出日</th><th style='overflow:hidden;text-align:center;'>振出済み金額</th><th style='overflow:hidden;text-align:center;'>未振出%</th><th style='overflow:hidden;text-align:center;'>未振出金額</th><th style='overflow:hidden;text-align:center;'>入金済み%</th><th style='overflow:hidden;text-align:center;'>入金済み金額</th><th style='overflow:hidden;text-align:center;'>未入金%</th><th style='overflow:hidden;text-align:center;'>未入金金額</th><th style='overflow:hidden;text-align:center;'>編集</th><th style='display:none'>レシートNO</th><th style='display:none'>注文書NO</th></tr></thead>");
		map.put("23", sBuffer.toString());
		GridTitleItemMap.put("A008", map);

		//Grid zero row data map
		map = new HashMap<String, String>();
		sBuffer.setLength(0);
		sBuffer.append("<tr style='display:none' id ='rowseq0'><td align='right' class='g3 l' _colid=0>0<input type=hidden width=0px id='Grid23flg0' name='Grid23flg0'></td>");
		sBuffer.append("<td class='g1 l' _colid=1 style='word-wrap: break-word;'><input type=text name=showKYAKUSAKIID_0 id=showKYAKUSAKIID_0 value='WFC#ITEM_SHOW_VALUE#WFC25WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=25 _itemname='客先' style='width:131px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=KYAKUSAKIID_0 id=KYAKUSAKIID_0 value='WFC#COLUMN_VALUE#WFC25WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g1 o' _colid=2 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHANAIKOUJIBANGOU_0'  name='SHANAIKOUJIBANGOU_0'  class='readonly' readOnly style='width:99px;height:31px; text-align:left;font-size:14px;color:#000000;font-weight:normal;'  _subid='27'  _itemname='社内工事番号'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=3 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='SHOUHINSOUGAKUJPY_0'  name='SHOUHINSOUGAKUJPY_0'  class='readonly' readOnly style='width:68px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='29'  _itemname='契約金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g1 l' _colid=4 style='word-wrap: break-word;'><input type=text name=showTANTOUSHAID_0 id=showTANTOUSHAID_0 value='WFC#ITEM_SHOW_VALUE#WFC31WFC#ITEM_SHOW_VALUE#WFC' class='readonly' readOnly _subid=31 _itemname='担当者' style='width:79px;height:27px;font-size:14px;color:#000000;font-weight:normal;'><input type=hidden name=TANTOUSHAID_0 id=TANTOUSHAID_0 value='WFC#COLUMN_VALUE#WFC31WFC#COLUMN_VALUE#WFC'></td>");
		sBuffer.append("<td class='g2 o' _colid=5 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=CHUUMONHIDZUKE1_0 id=CHUUMONHIDZUKE1_0 data-bind='value: CHUUMONHIDZUKE1' value='' class='readonly' readOnly _subid=33 _itemname='受注日付' _gid='Grid23' _gflg='Grid23flg0' onChange ='getObj(\"CHUUMONHIDZUKE1_0\").value=this.value;dateFormatChange($(this),\"受注日付\");cs($(this),\"rowseq\",\"Grid23flg\",\"0\");'  style='width:86px;height:29px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g2 o' _colid=6 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=SHIHARAIHIDZUKE_0 id=SHIHARAIHIDZUKE_0 data-bind='value: SHIHARAIHIDZUKE' value='' class='readonly' readOnly _subid=35 _itemname='入金予定日' _gid='Grid23' _gflg='Grid23flg0' onChange ='getObj(\"SHIHARAIHIDZUKE_0\").value=this.value;dateFormatChange($(this),\"入金予定日\");cs($(this),\"rowseq\",\"Grid23flg\",\"0\");'  style='width:93px;height:29px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g1 o' _colid=7 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='FURIDASHIZUMIWARIAI_0'  name='FURIDASHIZUMIWARIAI_0'  class='readonly' readOnly style='width:71px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='37'  _itemname='振出済み%'  _rge='2' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g2 o' _colid=8 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input type=text name=FURIDASHIZUMIHIDZUKE_0 id=FURIDASHIZUMIHIDZUKE_0 data-bind='value: FURIDASHIZUMIHIDZUKE' value='' class='readonly' readOnly _subid=39 _itemname='振出日' _gid='Grid23' _gflg='Grid23flg0' onChange ='getObj(\"FURIDASHIZUMIHIDZUKE_0\").value=this.value;dateFormatChange($(this),\"振出日\");cs($(this),\"rowseq\",\"Grid23flg\",\"0\");'  style='width:100px;height:29px; padding:0 2px;text-align:center;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;z-index:1;' placeHolder=''></div></td>");
		sBuffer.append("<td class='g3 o' _colid=9 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='FURIDASHIZUMIKINGAKU_0'  name='FURIDASHIZUMIKINGAKU_0'  class='readonly' readOnly style='width:92px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='41'  _itemname='振出済み金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=10 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINWARIAI_0'  name='NYUUKINWARIAI_0'  class='readonly' readOnly style='width:62px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='43'  _itemname='未振出%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=11 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINGAKU_0'  name='NYUUKINGAKU_0'  class='readonly' readOnly style='width:81px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='45'  _itemname='未振出金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=12 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINZUMIWARIAI_0'  name='NYUUKINZUMIWARIAI_0'  class='readonly' readOnly style='width:72px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='47'  _itemname='入金済み%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=13 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='NYUUKINZUMIKINGAKU_0'  name='NYUUKINZUMIKINGAKU_0'  class='readonly' readOnly style='width:87px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='49'  _itemname='入金済み金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=14 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='MINYUUKINWARIAI_0'  name='MINYUUKINWARIAI_0'  class='readonly' readOnly style='width:72px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;'  _subid='51'  _itemname='未入金%'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g3 o' _colid=15 style ='vertical-align:middle;'><div style=\"overflow:hidden;\"><input id='MINYUUKINKINGAKU_0'  name='MINYUUKINKINGAKU_0'  class='readonly' readOnly style='width:82px;height:31px; text-align:right;padding-right:2px;font-size:14px;color:#000000;font-weight:normal;ime-mode:disabled;'  _subid='53'  _itemname='未入金金額'  _ire='###,###,##0'  _rge='1' onblur='changeSpecHtml(this);' type='text'  _gid='Grid23'  _gflg='Grid23flg0' ></div></td>");
		sBuffer.append("<td class='g1 o' _colid=16><div style=\"overflow:hidden;\"><input id='grdB8AF8_0'  name='grdB8AF8_0'  value='編集'   _subid='55'  _itemname='編集'  type='button'  _gid='Grid23'  _gflg='Grid23flg0'  onclick='doLinkTrans55($(this));'  _sf_class='buttonon'></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=17><input id='RESHIITONO_0'  name='RESHIITONO_0'  type='hidden' ></div></td>");
		sBuffer.append("<td style ='display:none' width='0px' _colid=18><input id='CHUUBUNSHONO1_0'  name='CHUUBUNSHONO1_0'  type='hidden' ></div></td></tr>");
		map.put("23", sBuffer.toString());
		GridRowZeroMap.put("A008", map);

		//Grid item map
		mapList = new HashMap<String, ArrayList<ItemBean>>();
		beanList = new ArrayList<ItemBean>();
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "25";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "KYAKUSAKIID";
		itemBean.ReadOnly = "2";
		itemBean.RelData = "KAISYA";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "27";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "SHANAIKOUJIBANGOU";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "29";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "SHOUHINSOUGAKUJPY";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "2";
		itemBean.SubID = "31";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "TANTOUSHAID";
		itemBean.ReadOnly = "2";
		itemBean.RelData = "SYAIN";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "33";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "CHUUMONHIDZUKE";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "35";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "SHIHARAIHIDZUKE";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "37";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "FURIDASHIZUMIWARIAI";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "9";
		itemBean.SubID = "39";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "FURIDASHIZUMIHIDZUKE";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "41";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "FURIDASHIZUMIKINGAKU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "43";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "NYUUKINWARIAI";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "45";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "NYUUKINGAKU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "47";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "NYUUKINZUMIWARIAI";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "49";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "NYUUKINZUMIKINGAKU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "51";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "MINYUUKINWARIAI";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "53";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "MINYUUKINKINGAKU";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "12";
		itemBean.SubID = "55";
		itemBean.TableID = "";
		itemBean.FieldID = "";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "A008A009u";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "1";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "57";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "RESHIITONO";
		itemBean.ReadOnly = "1";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		itemBean = new A008GridDataConstant().new ItemBean();
		itemBean.OjeKind = "5";
		itemBean.SubID = "59";
		itemBean.TableID = "I00003";
		itemBean.FieldID = "CHUUBUNSHONO";
		itemBean.ReadOnly = "0";
		itemBean.RelData = "";
		itemBean.DefaultValue = "";
		itemBean.DbFlg = "0";
		beanList.add(itemBean);
		mapList.put("23", beanList);
		GridItemSubIDMap.put("A008", mapList);
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
			gridTitle = getMapValueByKey(pageID, subID, A008GridDataConstant.GridTitleItemMap);
		}
		
		gridRowZero = getMapValueByKey(pageID, subID, A008GridDataConstant.GridRowZeroMap);
		gridRowZero = changeGridItem(gridRowZero, pageID, subID, null)	;
		if (dataListMap != null && dataListMap.size() > 0) {
			rowStartTD = getMapValueByKey(pageID, subID, A008GridDataConstant.GridRowStartTDMap);
			
			rowTD = getMapValueByKey(pageID, subID, A008GridDataConstant.GridDataRowTDMap);
			
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
    A008DropDownListOptionBean ddloc = new A008DropDownListOptionBean();
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
