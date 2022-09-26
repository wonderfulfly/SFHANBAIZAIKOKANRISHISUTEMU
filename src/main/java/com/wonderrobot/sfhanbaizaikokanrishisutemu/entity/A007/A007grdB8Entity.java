package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007;


import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @project
 *     
 * @comment
 *     table id: A007grdB8Entity
 * @version

 */
public class A007grdB8Entity {
   /**
	*	 CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	private String CHUUBUNSHOMEISAINO;
   /**
	*	 KOUJIKANRIBANGOU 工事管理番号
	*/
	private String KOUJIKANRIBANGOU;
   /**
	*	 ZAIKONO1 部品明細連番
	*/

	@NotBlank(message = "validate.msg_P00009ZAIKONO1")
	private String ZAIKONO1;
   /**
	*	 TSUKAMATSUNYUUSAKI 仕入先
	*/
	private String TSUKAMATSUNYUUSAKI;
   /**
	*	 SHOUHINMEISHOU 部品名称
	*/
	private String SHOUHINMEISHOU;
   /**
	*	 SHUTSUNYUUKOJIKAN 出入庫時間
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00009SHUTSUNYUUKOJIKAN9")
	private String SHUTSUNYUUKOJIKAN;
   /**
	*	 SUURYOU 数量
	*/

	@Pattern(regexp = "^\\s*$|(^(0|\\+?[1-9][0-9]*){0,}$)?",message = "validate.msg_P00009SUURYOU1")
	private String SUURYOU;
   /**
	*	 PRICE 単価
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00009PRICE19")
	private String PRICE;
   /**
	*	 SHUTSUNYUUKOJOUTAI 状態
	*/
	private String SHUTSUNYUUKOJOUTAI;
   /**
	*	 SHUKKANO 出荷NO
	*/
	private String SHUKKANO;
   /**
	*	 SHOUHINKATABAN 商品型番
	*/
	private String SHOUHINKATABAN;
   /**
	*	 ZAIKOSUURYOU 在庫数量
	*/

	@Pattern(regexp = "^\\s*$|(^(0|\\+?[1-9][0-9]*){0,}$)?",message = "validate.msg_P00009ZAIKOSUURYOU1")
	private String ZAIKOSUURYOU;
   /**
	*	 SHOUHINNO 商品NO
	*/
	private String SHOUHINNO;
   /**
	*	 CHUUBUNSHONO1 注文書NO
	*/

	@NotBlank(message = "validate.msg_P00009CHUUBUNSHONO1")
	private String CHUUBUNSHONO1;
   /**
	* CHUUBUNSHOMEISAINO 注文書明細NOを設定
	*
	* @param CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	public void setCHUUBUNSHOMEISAINO(String CHUUBUNSHOMEISAINO) {
		this.CHUUBUNSHOMEISAINO = CHUUBUNSHOMEISAINO;
	}

   /**
	* CHUUBUNSHOMEISAINO 注文書明細NOを取得
	*
	* @return CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	public String getCHUUBUNSHOMEISAINO() {
		return this.CHUUBUNSHOMEISAINO;
	}

   /**
	* KOUJIKANRIBANGOU 工事管理番号を設定
	*
	* @param KOUJIKANRIBANGOU 工事管理番号
	*/
	public void setKOUJIKANRIBANGOU(String KOUJIKANRIBANGOU) {
		this.KOUJIKANRIBANGOU = KOUJIKANRIBANGOU;
	}

   /**
	* KOUJIKANRIBANGOU 工事管理番号を取得
	*
	* @return KOUJIKANRIBANGOU 工事管理番号
	*/
	public String getKOUJIKANRIBANGOU() {
		return this.KOUJIKANRIBANGOU;
	}

   /**
	* ZAIKONO1 部品明細連番を設定
	*
	* @param ZAIKONO1 部品明細連番
	*/
	public void setZAIKONO1(String ZAIKONO1) {
		this.ZAIKONO1 = ZAIKONO1;
	}

   /**
	* ZAIKONO1 部品明細連番を取得
	*
	* @return ZAIKONO1 部品明細連番
	*/
	public String getZAIKONO1() {
		return this.ZAIKONO1;
	}

   /**
	* TSUKAMATSUNYUUSAKI 仕入先を設定
	*
	* @param TSUKAMATSUNYUUSAKI 仕入先
	*/
	public void setTSUKAMATSUNYUUSAKI(String TSUKAMATSUNYUUSAKI) {
		this.TSUKAMATSUNYUUSAKI = TSUKAMATSUNYUUSAKI;
	}

   /**
	* TSUKAMATSUNYUUSAKI 仕入先を取得
	*
	* @return TSUKAMATSUNYUUSAKI 仕入先
	*/
	public String getTSUKAMATSUNYUUSAKI() {
		return this.TSUKAMATSUNYUUSAKI;
	}

   /**
	* SHOUHINMEISHOU 部品名称を設定
	*
	* @param SHOUHINMEISHOU 部品名称
	*/
	public void setSHOUHINMEISHOU(String SHOUHINMEISHOU) {
		this.SHOUHINMEISHOU = SHOUHINMEISHOU;
	}

   /**
	* SHOUHINMEISHOU 部品名称を取得
	*
	* @return SHOUHINMEISHOU 部品名称
	*/
	public String getSHOUHINMEISHOU() {
		return this.SHOUHINMEISHOU;
	}

   /**
	* SHUTSUNYUUKOJIKAN 出入庫時間を設定
	*
	* @param SHUTSUNYUUKOJIKAN 出入庫時間
	*/
	public void setSHUTSUNYUUKOJIKAN(String SHUTSUNYUUKOJIKAN) {
		this.SHUTSUNYUUKOJIKAN = SHUTSUNYUUKOJIKAN;
	}

   /**
	* SHUTSUNYUUKOJIKAN 出入庫時間を取得
	*
	* @return SHUTSUNYUUKOJIKAN 出入庫時間
	*/
	public String getSHUTSUNYUUKOJIKAN() {
		return this.SHUTSUNYUUKOJIKAN;
	}

   /**
	* SUURYOU 数量を設定
	*
	* @param SUURYOU 数量
	*/
	public void setSUURYOU(String SUURYOU) {
		this.SUURYOU = SUURYOU;
	}

   /**
	* SUURYOU 数量を取得
	*
	* @return SUURYOU 数量
	*/
	public String getSUURYOU() {
		return this.SUURYOU;
	}

   /**
	* PRICE 単価を設定
	*
	* @param PRICE 単価
	*/
	public void setPRICE(String PRICE) {
		this.PRICE = PRICE;
	}

   /**
	* PRICE 単価を取得
	*
	* @return PRICE 単価
	*/
	public String getPRICE() {
		return this.PRICE;
	}

   /**
	* SHUTSUNYUUKOJOUTAI 状態を設定
	*
	* @param SHUTSUNYUUKOJOUTAI 状態
	*/
	public void setSHUTSUNYUUKOJOUTAI(String SHUTSUNYUUKOJOUTAI) {
		this.SHUTSUNYUUKOJOUTAI = SHUTSUNYUUKOJOUTAI;
	}

   /**
	* SHUTSUNYUUKOJOUTAI 状態を取得
	*
	* @return SHUTSUNYUUKOJOUTAI 状態
	*/
	public String getSHUTSUNYUUKOJOUTAI() {
		return this.SHUTSUNYUUKOJOUTAI;
	}

   /**
	* SHUKKANO 出荷NOを設定
	*
	* @param SHUKKANO 出荷NO
	*/
	public void setSHUKKANO(String SHUKKANO) {
		this.SHUKKANO = SHUKKANO;
	}

   /**
	* SHUKKANO 出荷NOを取得
	*
	* @return SHUKKANO 出荷NO
	*/
	public String getSHUKKANO() {
		return this.SHUKKANO;
	}

   /**
	* SHOUHINKATABAN 商品型番を設定
	*
	* @param SHOUHINKATABAN 商品型番
	*/
	public void setSHOUHINKATABAN(String SHOUHINKATABAN) {
		this.SHOUHINKATABAN = SHOUHINKATABAN;
	}

   /**
	* SHOUHINKATABAN 商品型番を取得
	*
	* @return SHOUHINKATABAN 商品型番
	*/
	public String getSHOUHINKATABAN() {
		return this.SHOUHINKATABAN;
	}

   /**
	* ZAIKOSUURYOU 在庫数量を設定
	*
	* @param ZAIKOSUURYOU 在庫数量
	*/
	public void setZAIKOSUURYOU(String ZAIKOSUURYOU) {
		this.ZAIKOSUURYOU = ZAIKOSUURYOU;
	}

   /**
	* ZAIKOSUURYOU 在庫数量を取得
	*
	* @return ZAIKOSUURYOU 在庫数量
	*/
	public String getZAIKOSUURYOU() {
		return this.ZAIKOSUURYOU;
	}

   /**
	* SHOUHINNO 商品NOを設定
	*
	* @param SHOUHINNO 商品NO
	*/
	public void setSHOUHINNO(String SHOUHINNO) {
		this.SHOUHINNO = SHOUHINNO;
	}

   /**
	* SHOUHINNO 商品NOを取得
	*
	* @return SHOUHINNO 商品NO
	*/
	public String getSHOUHINNO() {
		return this.SHOUHINNO;
	}

   /**
	* CHUUBUNSHONO1 注文書NOを設定
	*
	* @param CHUUBUNSHONO1 注文書NO
	*/
	public void setCHUUBUNSHONO1(String CHUUBUNSHONO1) {
		this.CHUUBUNSHONO1 = CHUUBUNSHONO1;
	}

   /**
	* CHUUBUNSHONO1 注文書NOを取得
	*
	* @return CHUUBUNSHONO1 注文書NO
	*/
	public String getCHUUBUNSHONO1() {
		return this.CHUUBUNSHONO1;
	}


}