package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A006SYOUHINEntity
 * @version

 */
public class A006SYOUHINEntity {
   /**
	*	 SHOUHINNO 商品NO
	*/
	private String SHOUHINNO;
   /**
	*	 SHOUHINMEISHOU 商品名称
	*/
	private String SHOUHINMEISHOU;
   /**
	*	 TSUKAMATSUNYUUSAKI 仕入先
	*/
	private String TSUKAMATSUNYUUSAKI;
   /**
	*	 ZAISHITSU 材質
	*/
	private String ZAISHITSU;
   /**
	*	 PRICE 単価
	*/
	private double PRICE;
   /**
	*	 NYUUKAHIDZUKE 入荷日付
	*/
	private String NYUUKAHIDZUKE;
   /**
	*	 ZAIKOSUURYOU 在庫数量
	*/
	private int ZAIKOSUURYOU;
   /**
	*	 NYUUKOSUURYOU 入庫数量
	*/
	private int NYUUKOSUURYOU;
   /**
	*	 SHUKKOSUURYOU 出庫数量
	*/
	private int SHUKKOSUURYOU;
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
	* PRICE 単価を設定
	*
	* @param PRICE 単価
	*/
	public void setPRICE(double PRICE) {
		this.PRICE = PRICE;
	}

   /**
	* PRICE 単価を取得
	*
	* @return PRICE 単価
	*/
	public double getPRICE() {
		return this.PRICE;
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
	* ZAIKOSUURYOU 在庫数量を設定
	*
	* @param ZAIKOSUURYOU 在庫数量
	*/
	public void setZAIKOSUURYOU(int ZAIKOSUURYOU) {
		this.ZAIKOSUURYOU = ZAIKOSUURYOU;
	}

   /**
	* ZAIKOSUURYOU 在庫数量を取得
	*
	* @return ZAIKOSUURYOU 在庫数量
	*/
	public int getZAIKOSUURYOU() {
		return this.ZAIKOSUURYOU;
	}

   /**
	* NYUUKOSUURYOU 入庫数量を設定
	*
	* @param NYUUKOSUURYOU 入庫数量
	*/
	public void setNYUUKOSUURYOU(int NYUUKOSUURYOU) {
		this.NYUUKOSUURYOU = NYUUKOSUURYOU;
	}

   /**
	* NYUUKOSUURYOU 入庫数量を取得
	*
	* @return NYUUKOSUURYOU 入庫数量
	*/
	public int getNYUUKOSUURYOU() {
		return this.NYUUKOSUURYOU;
	}

   /**
	* SHUKKOSUURYOU 出庫数量を設定
	*
	* @param SHUKKOSUURYOU 出庫数量
	*/
	public void setSHUKKOSUURYOU(int SHUKKOSUURYOU) {
		this.SHUKKOSUURYOU = SHUKKOSUURYOU;
	}

   /**
	* SHUKKOSUURYOU 出庫数量を取得
	*
	* @return SHUKKOSUURYOU 出庫数量
	*/
	public int getSHUKKOSUURYOU() {
		return this.SHUKKOSUURYOU;
	}


}