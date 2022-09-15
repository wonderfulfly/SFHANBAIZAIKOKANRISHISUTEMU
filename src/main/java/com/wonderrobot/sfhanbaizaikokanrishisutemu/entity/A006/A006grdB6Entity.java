package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006;


import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @project
 *     
 * @comment
 *     table id: A006grdB6Entity
 * @version

 */
public class A006grdB6Entity {
   /**
	*	 ZAISHITSU 材質
	*/
	private String ZAISHITSU;
   /**
	*	 TSUKAMATSUNYUUSAKI 仕入先
	*/
	private String TSUKAMATSUNYUUSAKI;
   /**
	*	 NYUUKAHIDZUKE 入荷日付
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00008NYUUKAHIDZUKE9")
	private String NYUUKAHIDZUKE;
   /**
	*	 PRICE 単価
	*/

	@Pattern(regexp = "^\\s*$|(^(0|\\+?[1-9][0-9]*){0,}$)?",message = "validate.msg_P00008PRICE1")
	private String PRICE;
   /**
	*	 ZAIKOSUURYOU 購買数量
	*/

	@Pattern(regexp = "^\\s*$|(^(0|\\+?[1-9][0-9]*){0,}$)?",message = "validate.msg_P00008ZAIKOSUURYOU1")
	private String ZAIKOSUURYOU;
   /**
	*	 SHOUHINNO 商品NO
	*/

	@NotBlank(message = "validate.msg_P00008SHOUHINNO")
	private String SHOUHINNO;
   /**
	*	 SHOUHINMEISHOU 商品名称
	*/
	private String SHOUHINMEISHOU;
   /**
	* ZAISHITSU 材質を設定
	*
	* @param ZAISHITSU 材質
	*/
	public void setZAISHITSU(String ZAISHITSU) {
		this.ZAISHITSU = ZAISHITSU;
	}

   /**
	* ZAISHITSU 材質を取得
	*
	* @return ZAISHITSU 材質
	*/
	public String getZAISHITSU() {
		return this.ZAISHITSU;
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
	* NYUUKAHIDZUKE 入荷日付を設定
	*
	* @param NYUUKAHIDZUKE 入荷日付
	*/
	public void setNYUUKAHIDZUKE(String NYUUKAHIDZUKE) {
		this.NYUUKAHIDZUKE = NYUUKAHIDZUKE;
	}

   /**
	* NYUUKAHIDZUKE 入荷日付を取得
	*
	* @return NYUUKAHIDZUKE 入荷日付
	*/
	public String getNYUUKAHIDZUKE() {
		return this.NYUUKAHIDZUKE;
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
	* ZAIKOSUURYOU 購買数量を設定
	*
	* @param ZAIKOSUURYOU 購買数量
	*/
	public void setZAIKOSUURYOU(String ZAIKOSUURYOU) {
		this.ZAIKOSUURYOU = ZAIKOSUURYOU;
	}

   /**
	* ZAIKOSUURYOU 購買数量を取得
	*
	* @return ZAIKOSUURYOU 購買数量
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
	* SHOUHINMEISHOU 商品名称を設定
	*
	* @param SHOUHINMEISHOU 商品名称
	*/
	public void setSHOUHINMEISHOU(String SHOUHINMEISHOU) {
		this.SHOUHINMEISHOU = SHOUHINMEISHOU;
	}

   /**
	* SHOUHINMEISHOU 商品名称を取得
	*
	* @return SHOUHINMEISHOU 商品名称
	*/
	public String getSHOUHINMEISHOU() {
		return this.SHOUHINMEISHOU;
	}


}