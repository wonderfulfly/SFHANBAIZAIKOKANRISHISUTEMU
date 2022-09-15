package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013;


import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013.A013grdB16Entity;

/**
 * @project
 *     
 * @comment
 *     table id: A013DataCheckEntity
 * @version

 */
public class A013DataCheckEntity {
   /**
	*	 TOKUISAKIUSER 得意先USER
	*/
	private String TOKUISAKIUSER;
   /**
	*	 MAISUU1 枚数
	*/
	private String MAISUU1;
   /**
	*	 KUDARISUU 行数
	*/
	private String KUDARISUU;
   /**
	*	 ASENBURIRAINMEISHOU アセンブリライン名称
	*/
	private String ASENBURIRAINMEISHOU;
   /**
	*	 KAKUTEIKUBUN1 確定区分1
	*/
	private String KAKUTEIKUBUN1;
   /**
	*	 SHANAIKOUJIBANGOU 社内工事番号
	*/
	private String SHANAIKOUJIBANGOU;
   /**
	*	 KIKAIMEISHOUMC 機械名称MC
	*/
	private String KIKAIMEISHOUMC;
   /**
	*	 KOUNYUUHIDZUKE1 購入日付1
	*/
	private String KOUNYUUHIDZUKE1;
   /**
	*	 HIDZUKE1 日付1
	*/
	private String HIDZUKE1;
   /**
	*	 BUHINMEISHOUPART 部品名称PART
	*/
	private String BUHINMEISHOUPART;
   /**
	*	 BUHINCHUUBUNSHONO 部品注文書NO
	*/

	@NotBlank(message = "validate.msg_P00012BUHINCHUUBUNSHONO")
	private String BUHINCHUUBUNSHONO;
   /**
	*	 SEISAKUSUUQTY 製作数QTY
	*/

	@Pattern(regexp = "^\\s*$|([+-]?\\d?)?",message = "validate.msg_P00012SEISAKUSUUQTY2")
	private String SEISAKUSUUQTY;
   /**
	*	 TANTOUSHA1 担当者
	*/
	private String TANTOUSHA1;
   /**
	*	 KOUJIKANRIBANGOU1 工事管理番号
	*/

	@NotBlank(message = "validate.msg_P00012KOUJIKANRIBANGOU1")
	private String KOUJIKANRIBANGOU1;
   /**
	*	 SHUKKANO1 出荷NO
	*/
	private String SHUKKANO1;
   /**
	*	 JPYGOUKEI JPY合計
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00012JPYGOUKEI19")
	private String JPYGOUKEI;
   /**
	*	 RMBGOUKEI RMB合計
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00012RMBGOUKEI19")
	private String RMBGOUKEI;
   /**
	*	 USDGOUKEI USD合計
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00012USDGOUKEI19")
	private String USDGOUKEI;
   /**
	*	 BUHINCHUUBUNSHOMEISAINO 部品注文書明細NO
	*/

	@NotBlank(message = "validate.msg_P00012BUHINCHUUBUNSHOMEISAINO")
	private String BUHINCHUUBUNSHOMEISAINO;
   /**
	*	 Grid99 grdB16
	*/
	private List<A013grdB16Entity> Grid99;
   /**
	*	 GENZAINICHIDZUKE 現在日付
	*/
	private String GENZAINICHIDZUKE;
   /**
	*	 TANKAMITEIHIDE 単価未定HIDE
	*/
	private String TANKAMITEIHIDE;
   /**
	*	 KETSUGOUMOJI1 結合文字1
	*/
	private String KETSUGOUMOJI1;
   /**
	*	 KETSUGOUMOJI2 結合文字2
	*/
	private String KETSUGOUMOJI2;
   /**
	*	 I31JPY I31JPY
	*/
	private String I31JPY;
   /**
	*	 I32RMB I32RMB
	*/
	private String I32RMB;
   /**
	*	 I33USD I33USD
	*/
	private String I33USD;
   /**
	*	 II II
	*/
	private String II;
   /**
	*	 SHOUHINNUMBER 商品NUMBER
	*/
	private String SHOUHINNUMBER;
   /**
	* TOKUISAKIUSER 得意先USERを設定
	*
	* @param TOKUISAKIUSER 得意先USER
	*/
	public void setTOKUISAKIUSER(String TOKUISAKIUSER) {
		this.TOKUISAKIUSER = TOKUISAKIUSER;
	}

   /**
	* TOKUISAKIUSER 得意先USERを取得
	*
	* @return TOKUISAKIUSER 得意先USER
	*/
	public String getTOKUISAKIUSER() {
		return this.TOKUISAKIUSER;
	}

   /**
	* MAISUU1 枚数を設定
	*
	* @param MAISUU1 枚数
	*/
	public void setMAISUU1(String MAISUU1) {
		this.MAISUU1 = MAISUU1;
	}

   /**
	* MAISUU1 枚数を取得
	*
	* @return MAISUU1 枚数
	*/
	public String getMAISUU1() {
		return this.MAISUU1;
	}

   /**
	* KUDARISUU 行数を設定
	*
	* @param KUDARISUU 行数
	*/
	public void setKUDARISUU(String KUDARISUU) {
		this.KUDARISUU = KUDARISUU;
	}

   /**
	* KUDARISUU 行数を取得
	*
	* @return KUDARISUU 行数
	*/
	public String getKUDARISUU() {
		return this.KUDARISUU;
	}

   /**
	* ASENBURIRAINMEISHOU アセンブリライン名称を設定
	*
	* @param ASENBURIRAINMEISHOU アセンブリライン名称
	*/
	public void setASENBURIRAINMEISHOU(String ASENBURIRAINMEISHOU) {
		this.ASENBURIRAINMEISHOU = ASENBURIRAINMEISHOU;
	}

   /**
	* ASENBURIRAINMEISHOU アセンブリライン名称を取得
	*
	* @return ASENBURIRAINMEISHOU アセンブリライン名称
	*/
	public String getASENBURIRAINMEISHOU() {
		return this.ASENBURIRAINMEISHOU;
	}

   /**
	* KAKUTEIKUBUN1 確定区分1を設定
	*
	* @param KAKUTEIKUBUN1 確定区分1
	*/
	public void setKAKUTEIKUBUN1(String KAKUTEIKUBUN1) {
		this.KAKUTEIKUBUN1 = KAKUTEIKUBUN1;
	}

   /**
	* KAKUTEIKUBUN1 確定区分1を取得
	*
	* @return KAKUTEIKUBUN1 確定区分1
	*/
	public String getKAKUTEIKUBUN1() {
		return this.KAKUTEIKUBUN1;
	}

   /**
	* SHANAIKOUJIBANGOU 社内工事番号を設定
	*
	* @param SHANAIKOUJIBANGOU 社内工事番号
	*/
	public void setSHANAIKOUJIBANGOU(String SHANAIKOUJIBANGOU) {
		this.SHANAIKOUJIBANGOU = SHANAIKOUJIBANGOU;
	}

   /**
	* SHANAIKOUJIBANGOU 社内工事番号を取得
	*
	* @return SHANAIKOUJIBANGOU 社内工事番号
	*/
	public String getSHANAIKOUJIBANGOU() {
		return this.SHANAIKOUJIBANGOU;
	}

   /**
	* KIKAIMEISHOUMC 機械名称MCを設定
	*
	* @param KIKAIMEISHOUMC 機械名称MC
	*/
	public void setKIKAIMEISHOUMC(String KIKAIMEISHOUMC) {
		this.KIKAIMEISHOUMC = KIKAIMEISHOUMC;
	}

   /**
	* KIKAIMEISHOUMC 機械名称MCを取得
	*
	* @return KIKAIMEISHOUMC 機械名称MC
	*/
	public String getKIKAIMEISHOUMC() {
		return this.KIKAIMEISHOUMC;
	}

   /**
	* KOUNYUUHIDZUKE1 購入日付1を設定
	*
	* @param KOUNYUUHIDZUKE1 購入日付1
	*/
	public void setKOUNYUUHIDZUKE1(String KOUNYUUHIDZUKE1) {
		this.KOUNYUUHIDZUKE1 = KOUNYUUHIDZUKE1;
	}

   /**
	* KOUNYUUHIDZUKE1 購入日付1を取得
	*
	* @return KOUNYUUHIDZUKE1 購入日付1
	*/
	public String getKOUNYUUHIDZUKE1() {
		return this.KOUNYUUHIDZUKE1;
	}

   /**
	* HIDZUKE1 日付1を設定
	*
	* @param HIDZUKE1 日付1
	*/
	public void setHIDZUKE1(String HIDZUKE1) {
		this.HIDZUKE1 = HIDZUKE1;
	}

   /**
	* HIDZUKE1 日付1を取得
	*
	* @return HIDZUKE1 日付1
	*/
	public String getHIDZUKE1() {
		return this.HIDZUKE1;
	}

   /**
	* BUHINMEISHOUPART 部品名称PARTを設定
	*
	* @param BUHINMEISHOUPART 部品名称PART
	*/
	public void setBUHINMEISHOUPART(String BUHINMEISHOUPART) {
		this.BUHINMEISHOUPART = BUHINMEISHOUPART;
	}

   /**
	* BUHINMEISHOUPART 部品名称PARTを取得
	*
	* @return BUHINMEISHOUPART 部品名称PART
	*/
	public String getBUHINMEISHOUPART() {
		return this.BUHINMEISHOUPART;
	}

   /**
	* BUHINCHUUBUNSHONO 部品注文書NOを設定
	*
	* @param BUHINCHUUBUNSHONO 部品注文書NO
	*/
	public void setBUHINCHUUBUNSHONO(String BUHINCHUUBUNSHONO) {
		this.BUHINCHUUBUNSHONO = BUHINCHUUBUNSHONO;
	}

   /**
	* BUHINCHUUBUNSHONO 部品注文書NOを取得
	*
	* @return BUHINCHUUBUNSHONO 部品注文書NO
	*/
	public String getBUHINCHUUBUNSHONO() {
		return this.BUHINCHUUBUNSHONO;
	}

   /**
	* SEISAKUSUUQTY 製作数QTYを設定
	*
	* @param SEISAKUSUUQTY 製作数QTY
	*/
	public void setSEISAKUSUUQTY(String SEISAKUSUUQTY) {
		this.SEISAKUSUUQTY = SEISAKUSUUQTY;
	}

   /**
	* SEISAKUSUUQTY 製作数QTYを取得
	*
	* @return SEISAKUSUUQTY 製作数QTY
	*/
	public String getSEISAKUSUUQTY() {
		return this.SEISAKUSUUQTY;
	}

   /**
	* TANTOUSHA1 担当者を設定
	*
	* @param TANTOUSHA1 担当者
	*/
	public void setTANTOUSHA1(String TANTOUSHA1) {
		this.TANTOUSHA1 = TANTOUSHA1;
	}

   /**
	* TANTOUSHA1 担当者を取得
	*
	* @return TANTOUSHA1 担当者
	*/
	public String getTANTOUSHA1() {
		return this.TANTOUSHA1;
	}

   /**
	* KOUJIKANRIBANGOU1 工事管理番号を設定
	*
	* @param KOUJIKANRIBANGOU1 工事管理番号
	*/
	public void setKOUJIKANRIBANGOU1(String KOUJIKANRIBANGOU1) {
		this.KOUJIKANRIBANGOU1 = KOUJIKANRIBANGOU1;
	}

   /**
	* KOUJIKANRIBANGOU1 工事管理番号を取得
	*
	* @return KOUJIKANRIBANGOU1 工事管理番号
	*/
	public String getKOUJIKANRIBANGOU1() {
		return this.KOUJIKANRIBANGOU1;
	}

   /**
	* SHUKKANO1 出荷NOを設定
	*
	* @param SHUKKANO1 出荷NO
	*/
	public void setSHUKKANO1(String SHUKKANO1) {
		this.SHUKKANO1 = SHUKKANO1;
	}

   /**
	* SHUKKANO1 出荷NOを取得
	*
	* @return SHUKKANO1 出荷NO
	*/
	public String getSHUKKANO1() {
		return this.SHUKKANO1;
	}

   /**
	* JPYGOUKEI JPY合計を設定
	*
	* @param JPYGOUKEI JPY合計
	*/
	public void setJPYGOUKEI(String JPYGOUKEI) {
		this.JPYGOUKEI = JPYGOUKEI;
	}

   /**
	* JPYGOUKEI JPY合計を取得
	*
	* @return JPYGOUKEI JPY合計
	*/
	public String getJPYGOUKEI() {
		return this.JPYGOUKEI;
	}

   /**
	* RMBGOUKEI RMB合計を設定
	*
	* @param RMBGOUKEI RMB合計
	*/
	public void setRMBGOUKEI(String RMBGOUKEI) {
		this.RMBGOUKEI = RMBGOUKEI;
	}

   /**
	* RMBGOUKEI RMB合計を取得
	*
	* @return RMBGOUKEI RMB合計
	*/
	public String getRMBGOUKEI() {
		return this.RMBGOUKEI;
	}

   /**
	* USDGOUKEI USD合計を設定
	*
	* @param USDGOUKEI USD合計
	*/
	public void setUSDGOUKEI(String USDGOUKEI) {
		this.USDGOUKEI = USDGOUKEI;
	}

   /**
	* USDGOUKEI USD合計を取得
	*
	* @return USDGOUKEI USD合計
	*/
	public String getUSDGOUKEI() {
		return this.USDGOUKEI;
	}

   /**
	* BUHINCHUUBUNSHOMEISAINO 部品注文書明細NOを設定
	*
	* @param BUHINCHUUBUNSHOMEISAINO 部品注文書明細NO
	*/
	public void setBUHINCHUUBUNSHOMEISAINO(String BUHINCHUUBUNSHOMEISAINO) {
		this.BUHINCHUUBUNSHOMEISAINO = BUHINCHUUBUNSHOMEISAINO;
	}

   /**
	* BUHINCHUUBUNSHOMEISAINO 部品注文書明細NOを取得
	*
	* @return BUHINCHUUBUNSHOMEISAINO 部品注文書明細NO
	*/
	public String getBUHINCHUUBUNSHOMEISAINO() {
		return this.BUHINCHUUBUNSHOMEISAINO;
	}

   /**
	* Grid99 grdB16を設定
	*
	* @param Grid99 grdB16
	*/
	public void setGrid99(List<A013grdB16Entity> Grid99) {
		this.Grid99 = Grid99;
	}

   /**
	* Grid99 grdB16を取得
	*
	* @return Grid99 grdB16
	*/
	public List<A013grdB16Entity> getGrid99() {
		return this.Grid99;
	}

   /**
	* GENZAINICHIDZUKE 現在日付を設定
	*
	* @param GENZAINICHIDZUKE 現在日付
	*/
	public void setGENZAINICHIDZUKE(String GENZAINICHIDZUKE) {
		this.GENZAINICHIDZUKE = GENZAINICHIDZUKE;
	}

   /**
	* GENZAINICHIDZUKE 現在日付を取得
	*
	* @return GENZAINICHIDZUKE 現在日付
	*/
	public String getGENZAINICHIDZUKE() {
		return this.GENZAINICHIDZUKE;
	}

   /**
	* TANKAMITEIHIDE 単価未定HIDEを設定
	*
	* @param TANKAMITEIHIDE 単価未定HIDE
	*/
	public void setTANKAMITEIHIDE(String TANKAMITEIHIDE) {
		this.TANKAMITEIHIDE = TANKAMITEIHIDE;
	}

   /**
	* TANKAMITEIHIDE 単価未定HIDEを取得
	*
	* @return TANKAMITEIHIDE 単価未定HIDE
	*/
	public String getTANKAMITEIHIDE() {
		return this.TANKAMITEIHIDE;
	}

   /**
	* KETSUGOUMOJI1 結合文字1を設定
	*
	* @param KETSUGOUMOJI1 結合文字1
	*/
	public void setKETSUGOUMOJI1(String KETSUGOUMOJI1) {
		this.KETSUGOUMOJI1 = KETSUGOUMOJI1;
	}

   /**
	* KETSUGOUMOJI1 結合文字1を取得
	*
	* @return KETSUGOUMOJI1 結合文字1
	*/
	public String getKETSUGOUMOJI1() {
		return this.KETSUGOUMOJI1;
	}

   /**
	* KETSUGOUMOJI2 結合文字2を設定
	*
	* @param KETSUGOUMOJI2 結合文字2
	*/
	public void setKETSUGOUMOJI2(String KETSUGOUMOJI2) {
		this.KETSUGOUMOJI2 = KETSUGOUMOJI2;
	}

   /**
	* KETSUGOUMOJI2 結合文字2を取得
	*
	* @return KETSUGOUMOJI2 結合文字2
	*/
	public String getKETSUGOUMOJI2() {
		return this.KETSUGOUMOJI2;
	}

   /**
	* I31JPY I31JPYを設定
	*
	* @param I31JPY I31JPY
	*/
	public void setI31JPY(String I31JPY) {
		this.I31JPY = I31JPY;
	}

   /**
	* I31JPY I31JPYを取得
	*
	* @return I31JPY I31JPY
	*/
	public String getI31JPY() {
		return this.I31JPY;
	}

   /**
	* I32RMB I32RMBを設定
	*
	* @param I32RMB I32RMB
	*/
	public void setI32RMB(String I32RMB) {
		this.I32RMB = I32RMB;
	}

   /**
	* I32RMB I32RMBを取得
	*
	* @return I32RMB I32RMB
	*/
	public String getI32RMB() {
		return this.I32RMB;
	}

   /**
	* I33USD I33USDを設定
	*
	* @param I33USD I33USD
	*/
	public void setI33USD(String I33USD) {
		this.I33USD = I33USD;
	}

   /**
	* I33USD I33USDを取得
	*
	* @return I33USD I33USD
	*/
	public String getI33USD() {
		return this.I33USD;
	}

   /**
	* II IIを設定
	*
	* @param II II
	*/
	public void setII(String II) {
		this.II = II;
	}

   /**
	* II IIを取得
	*
	* @return II II
	*/
	public String getII() {
		return this.II;
	}

   /**
	* SHOUHINNUMBER 商品NUMBERを設定
	*
	* @param SHOUHINNUMBER 商品NUMBER
	*/
	public void setSHOUHINNUMBER(String SHOUHINNUMBER) {
		this.SHOUHINNUMBER = SHOUHINNUMBER;
	}

   /**
	* SHOUHINNUMBER 商品NUMBERを取得
	*
	* @return SHOUHINNUMBER 商品NUMBER
	*/
	public String getSHOUHINNUMBER() {
		return this.SHOUHINNUMBER;
	}


}