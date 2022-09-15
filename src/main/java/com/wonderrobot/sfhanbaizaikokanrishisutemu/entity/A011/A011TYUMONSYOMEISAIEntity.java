package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A011TYUMONSYOMEISAIEntity
 * @version

 */
public class A011TYUMONSYOMEISAIEntity {
   /**
	*	 CHUUBUNSHONO 注文書NO
	*/
	private String CHUUBUNSHONO;
   /**
	*	 CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	private String CHUUBUNSHOMEISAINO;
   /**
	*	 KOUMOKU 項目
	*/
	private String KOUMOKU;
   /**
	*	 KUBUN 区分
	*/
	private String KUBUN;
   /**
	*	 SHOUHINNO 商品NO
	*/
	private String SHOUHINNO;
   /**
	*	 SUURYOU 数量
	*/
	private int SUURYOU;
   /**
	*	 HANBAITANKA 販売単価
	*/
	private double HANBAITANKA;
   /**
	*	 HANBAIKINGAKU 販売金額
	*/
	private double HANBAIKINGAKU;
   /**
	*	 TSUKAMATSUNYUUKINGAKURMB 仕入金額RMB
	*/
	private double TSUKAMATSUNYUUKINGAKURMB;
   /**
	*	 SHUKKOFURAGU 出庫フラグ
	*/
	private String SHUKKOFURAGU;
   /**
	*	 SHUKKASUURYOU 出荷数量
	*/
	private int SHUKKASUURYOU;
   /**
	*	 NYUUKASUURYOU 入荷数量
	*/
	private int NYUUKASUURYOU;
   /**
	*	 BUHINUMU 部品有無
	*/
	private String BUHINUMU;
   /**
	*	 TSUKAMATSUNYUUKINGAKUJPY 仕入金額JPY
	*/
	private double TSUKAMATSUNYUUKINGAKUJPY;
   /**
	*	 TSUKAMATSUNYUUKINGAKUUSD 仕入金額USD
	*/
	private double TSUKAMATSUNYUUKINGAKUUSD;
   /**
	*	 KAHEI 貨幣
	*/
	private String KAHEI;
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
	* KOUMOKU 項目を設定
	*
	* @param KOUMOKU 項目
	*/
	public void setKOUMOKU(String KOUMOKU) {
		this.KOUMOKU = KOUMOKU;
	}

   /**
	* KOUMOKU 項目を取得
	*
	* @return KOUMOKU 項目
	*/
	public String getKOUMOKU() {
		return this.KOUMOKU;
	}

   /**
	* KUBUN 区分を設定
	*
	* @param KUBUN 区分
	*/
	public void setKUBUN(String KUBUN) {
		this.KUBUN = KUBUN;
	}

   /**
	* KUBUN 区分を取得
	*
	* @return KUBUN 区分
	*/
	public String getKUBUN() {
		return this.KUBUN;
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
	* HANBAITANKA 販売単価を設定
	*
	* @param HANBAITANKA 販売単価
	*/
	public void setHANBAITANKA(double HANBAITANKA) {
		this.HANBAITANKA = HANBAITANKA;
	}

   /**
	* HANBAITANKA 販売単価を取得
	*
	* @return HANBAITANKA 販売単価
	*/
	public double getHANBAITANKA() {
		return this.HANBAITANKA;
	}

   /**
	* HANBAIKINGAKU 販売金額を設定
	*
	* @param HANBAIKINGAKU 販売金額
	*/
	public void setHANBAIKINGAKU(double HANBAIKINGAKU) {
		this.HANBAIKINGAKU = HANBAIKINGAKU;
	}

   /**
	* HANBAIKINGAKU 販売金額を取得
	*
	* @return HANBAIKINGAKU 販売金額
	*/
	public double getHANBAIKINGAKU() {
		return this.HANBAIKINGAKU;
	}

   /**
	* TSUKAMATSUNYUUKINGAKURMB 仕入金額RMBを設定
	*
	* @param TSUKAMATSUNYUUKINGAKURMB 仕入金額RMB
	*/
	public void setTSUKAMATSUNYUUKINGAKURMB(double TSUKAMATSUNYUUKINGAKURMB) {
		this.TSUKAMATSUNYUUKINGAKURMB = TSUKAMATSUNYUUKINGAKURMB;
	}

   /**
	* TSUKAMATSUNYUUKINGAKURMB 仕入金額RMBを取得
	*
	* @return TSUKAMATSUNYUUKINGAKURMB 仕入金額RMB
	*/
	public double getTSUKAMATSUNYUUKINGAKURMB() {
		return this.TSUKAMATSUNYUUKINGAKURMB;
	}

   /**
	* SHUKKOFURAGU 出庫フラグを設定
	*
	* @param SHUKKOFURAGU 出庫フラグ
	*/
	public void setSHUKKOFURAGU(String SHUKKOFURAGU) {
		this.SHUKKOFURAGU = SHUKKOFURAGU;
	}

   /**
	* SHUKKOFURAGU 出庫フラグを取得
	*
	* @return SHUKKOFURAGU 出庫フラグ
	*/
	public String getSHUKKOFURAGU() {
		return this.SHUKKOFURAGU;
	}

   /**
	* SHUKKASUURYOU 出荷数量を設定
	*
	* @param SHUKKASUURYOU 出荷数量
	*/
	public void setSHUKKASUURYOU(int SHUKKASUURYOU) {
		this.SHUKKASUURYOU = SHUKKASUURYOU;
	}

   /**
	* SHUKKASUURYOU 出荷数量を取得
	*
	* @return SHUKKASUURYOU 出荷数量
	*/
	public int getSHUKKASUURYOU() {
		return this.SHUKKASUURYOU;
	}

   /**
	* NYUUKASUURYOU 入荷数量を設定
	*
	* @param NYUUKASUURYOU 入荷数量
	*/
	public void setNYUUKASUURYOU(int NYUUKASUURYOU) {
		this.NYUUKASUURYOU = NYUUKASUURYOU;
	}

   /**
	* NYUUKASUURYOU 入荷数量を取得
	*
	* @return NYUUKASUURYOU 入荷数量
	*/
	public int getNYUUKASUURYOU() {
		return this.NYUUKASUURYOU;
	}

   /**
	* BUHINUMU 部品有無を設定
	*
	* @param BUHINUMU 部品有無
	*/
	public void setBUHINUMU(String BUHINUMU) {
		this.BUHINUMU = BUHINUMU;
	}

   /**
	* BUHINUMU 部品有無を取得
	*
	* @return BUHINUMU 部品有無
	*/
	public String getBUHINUMU() {
		return this.BUHINUMU;
	}

   /**
	* TSUKAMATSUNYUUKINGAKUJPY 仕入金額JPYを設定
	*
	* @param TSUKAMATSUNYUUKINGAKUJPY 仕入金額JPY
	*/
	public void setTSUKAMATSUNYUUKINGAKUJPY(double TSUKAMATSUNYUUKINGAKUJPY) {
		this.TSUKAMATSUNYUUKINGAKUJPY = TSUKAMATSUNYUUKINGAKUJPY;
	}

   /**
	* TSUKAMATSUNYUUKINGAKUJPY 仕入金額JPYを取得
	*
	* @return TSUKAMATSUNYUUKINGAKUJPY 仕入金額JPY
	*/
	public double getTSUKAMATSUNYUUKINGAKUJPY() {
		return this.TSUKAMATSUNYUUKINGAKUJPY;
	}

   /**
	* TSUKAMATSUNYUUKINGAKUUSD 仕入金額USDを設定
	*
	* @param TSUKAMATSUNYUUKINGAKUUSD 仕入金額USD
	*/
	public void setTSUKAMATSUNYUUKINGAKUUSD(double TSUKAMATSUNYUUKINGAKUUSD) {
		this.TSUKAMATSUNYUUKINGAKUUSD = TSUKAMATSUNYUUKINGAKUUSD;
	}

   /**
	* TSUKAMATSUNYUUKINGAKUUSD 仕入金額USDを取得
	*
	* @return TSUKAMATSUNYUUKINGAKUUSD 仕入金額USD
	*/
	public double getTSUKAMATSUNYUUKINGAKUUSD() {
		return this.TSUKAMATSUNYUUKINGAKUUSD;
	}

   /**
	* KAHEI 貨幣を設定
	*
	* @param KAHEI 貨幣
	*/
	public void setKAHEI(String KAHEI) {
		this.KAHEI = KAHEI;
	}

   /**
	* KAHEI 貨幣を取得
	*
	* @return KAHEI 貨幣
	*/
	public String getKAHEI() {
		return this.KAHEI;
	}


}