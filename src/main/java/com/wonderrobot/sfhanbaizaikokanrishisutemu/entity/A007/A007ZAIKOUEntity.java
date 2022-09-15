package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A007ZAIKOUEntity
 * @version

 */
public class A007ZAIKOUEntity {
   /**
	*	 ZAIKONO 在庫NO
	*/
	private String ZAIKONO;
   /**
	*	 CHUUBUNSHONO 注文書NO
	*/
	private String CHUUBUNSHONO;
   /**
	*	 SHUTSUNYUUKOJIKAN 出入庫時間
	*/
	private String SHUTSUNYUUKOJIKAN;
   /**
	*	 SHUTSUNYUUKOJOUTAI 出入庫状態
	*/
	private String SHUTSUNYUUKOJOUTAI;
   /**
	*	 SHOUHINNO 商品NO
	*/
	private String SHOUHINNO;
   /**
	*	 SHOUHINMEISHOU 商品名称
	*/
	private String SHOUHINMEISHOU;
   /**
	*	 SHOUHINKATABAN 商品型番
	*/
	private String SHOUHINKATABAN;
   /**
	*	 TSUKAMATSUNYUUSAKI 仕入先
	*/
	private String TSUKAMATSUNYUUSAKI;
   /**
	*	 DAIRITENNO 代理店NO
	*/
	private String DAIRITENNO;
   /**
	*	 SHUKKANO 出荷NO
	*/
	private String SHUKKANO;
   /**
	*	 TAN_I 単位
	*/
	private String TAN_I;
   /**
	*	 SUURYOU 数量
	*/
	private int SUURYOU;
   /**
	*	 PRICE 単価
	*/
	private double PRICE;
   /**
	*	 DAIKINKINGAKU 代金金額
	*/
	private double DAIKINKINGAKU;
   /**
	*	 ZEIGAKU 税額
	*/
	private double ZEIGAKU;
   /**
	*	 GOUKEI 合計
	*/
	private double GOUKEI;
   /**
	*	 ZAIKOSUURYOU 在庫数量
	*/
	private int ZAIKOSUURYOU;
   /**
	*	 CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	private String CHUUBUNSHOMEISAINO;
   /**
	*	 BIKOU 備考
	*/
	private String BIKOU;
   /**
	*	 KOUJIKANRIBANGOU 工事管理番号
	*/
	private String KOUJIKANRIBANGOU;
   /**
	*	 HINBANNO 品番NO
	*/
	private String HINBANNO;
   /**
	* ZAIKONO 在庫NOを設定
	*
	* @param ZAIKONO 在庫NO
	*/
	public void setZAIKONO(String ZAIKONO) {
		this.ZAIKONO = ZAIKONO;
	}

   /**
	* ZAIKONO 在庫NOを取得
	*
	* @return ZAIKONO 在庫NO
	*/
	public String getZAIKONO() {
		return this.ZAIKONO;
	}

   /**
	* CHUUBUNSHONO 注文書NOを設定
	*
	* @param CHUUBUNSHONO 注文書NO
	*/
	public void setCHUUBUNSHONO(String CHUUBUNSHONO) {
		this.CHUUBUNSHONO = CHUUBUNSHONO;
	}

   /**
	* CHUUBUNSHONO 注文書NOを取得
	*
	* @return CHUUBUNSHONO 注文書NO
	*/
	public String getCHUUBUNSHONO() {
		return this.CHUUBUNSHONO;
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
	* SHUTSUNYUUKOJOUTAI 出入庫状態を設定
	*
	* @param SHUTSUNYUUKOJOUTAI 出入庫状態
	*/
	public void setSHUTSUNYUUKOJOUTAI(String SHUTSUNYUUKOJOUTAI) {
		this.SHUTSUNYUUKOJOUTAI = SHUTSUNYUUKOJOUTAI;
	}

   /**
	* SHUTSUNYUUKOJOUTAI 出入庫状態を取得
	*
	* @return SHUTSUNYUUKOJOUTAI 出入庫状態
	*/
	public String getSHUTSUNYUUKOJOUTAI() {
		return this.SHUTSUNYUUKOJOUTAI;
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
	* DAIRITENNO 代理店NOを設定
	*
	* @param DAIRITENNO 代理店NO
	*/
	public void setDAIRITENNO(String DAIRITENNO) {
		this.DAIRITENNO = DAIRITENNO;
	}

   /**
	* DAIRITENNO 代理店NOを取得
	*
	* @return DAIRITENNO 代理店NO
	*/
	public String getDAIRITENNO() {
		return this.DAIRITENNO;
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
	* TAN_I 単位を設定
	*
	* @param TAN_I 単位
	*/
	public void setTAN_I(String TAN_I) {
		this.TAN_I = TAN_I;
	}

   /**
	* TAN_I 単位を取得
	*
	* @return TAN_I 単位
	*/
	public String getTAN_I() {
		return this.TAN_I;
	}

   /**
	* SUURYOU 数量を設定
	*
	* @param SUURYOU 数量
	*/
	public void setSUURYOU(int SUURYOU) {
		this.SUURYOU = SUURYOU;
	}

   /**
	* SUURYOU 数量を取得
	*
	* @return SUURYOU 数量
	*/
	public int getSUURYOU() {
		return this.SUURYOU;
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
	* DAIKINKINGAKU 代金金額を設定
	*
	* @param DAIKINKINGAKU 代金金額
	*/
	public void setDAIKINKINGAKU(double DAIKINKINGAKU) {
		this.DAIKINKINGAKU = DAIKINKINGAKU;
	}

   /**
	* DAIKINKINGAKU 代金金額を取得
	*
	* @return DAIKINKINGAKU 代金金額
	*/
	public double getDAIKINKINGAKU() {
		return this.DAIKINKINGAKU;
	}

   /**
	* ZEIGAKU 税額を設定
	*
	* @param ZEIGAKU 税額
	*/
	public void setZEIGAKU(double ZEIGAKU) {
		this.ZEIGAKU = ZEIGAKU;
	}

   /**
	* ZEIGAKU 税額を取得
	*
	* @return ZEIGAKU 税額
	*/
	public double getZEIGAKU() {
		return this.ZEIGAKU;
	}

   /**
	* GOUKEI 合計を設定
	*
	* @param GOUKEI 合計
	*/
	public void setGOUKEI(double GOUKEI) {
		this.GOUKEI = GOUKEI;
	}

   /**
	* GOUKEI 合計を取得
	*
	* @return GOUKEI 合計
	*/
	public double getGOUKEI() {
		return this.GOUKEI;
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
	* BIKOU 備考を設定
	*
	* @param BIKOU 備考
	*/
	public void setBIKOU(String BIKOU) {
		this.BIKOU = BIKOU;
	}

   /**
	* BIKOU 備考を取得
	*
	* @return BIKOU 備考
	*/
	public String getBIKOU() {
		return this.BIKOU;
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
	* HINBANNO 品番NOを設定
	*
	* @param HINBANNO 品番NO
	*/
	public void setHINBANNO(String HINBANNO) {
		this.HINBANNO = HINBANNO;
	}

   /**
	* HINBANNO 品番NOを取得
	*
	* @return HINBANNO 品番NO
	*/
	public String getHINBANNO() {
		return this.HINBANNO;
	}


}