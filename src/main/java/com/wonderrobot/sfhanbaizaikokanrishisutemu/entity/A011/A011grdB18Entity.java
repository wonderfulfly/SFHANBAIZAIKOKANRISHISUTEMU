package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011;


import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @project
 *     
 * @comment
 *     table id: A011grdB18Entity
 * @version

 */
public class A011grdB18Entity {
   /**
	*	 KOUMOKU 項目
	*/
	private String KOUMOKU;
   /**
	*	 SUURYOU 数量
	*/

	@Pattern(regexp = "^\\s*$|(^(0|\\+?[1-9][0-9]*){0,}$)?",message = "validate.msg_P00013SUURYOU1")
	private String SUURYOU;
   /**
	*	 HANBAITANKA 販売単価
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00013HANBAITANKA19")
	private String HANBAITANKA;
   /**
	*	 KAHEI 貨幣
	*/
	private String KAHEI;
   /**
	*	 HANBAIKINGAKU 販売金額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00013HANBAIKINGAKU19")
	private String HANBAIKINGAKU;
   /**
	*	 TSUKAMATSUNYUUKINGAKUJPY 仕入金額(JPY)
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00013TSUKAMATSUNYUUKINGAKUJPY19")
	private String TSUKAMATSUNYUUKINGAKUJPY;
   /**
	*	 TSUKAMATSUNYUUKINGAKURMB 仕入金額(RMB)
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00013TSUKAMATSUNYUUKINGAKURMB19")
	private String TSUKAMATSUNYUUKINGAKURMB;
   /**
	*	 TSUKAMATSUNYUUKINGAKUUSD 仕入金額(USD)
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00013TSUKAMATSUNYUUKINGAKUUSD19")
	private String TSUKAMATSUNYUUKINGAKUUSD;
   /**
	*	 SHUKKOFURAGU 出庫フラグ
	*/
	private String SHUKKOFURAGU;
   /**
	*	 CHUUBUNSHONO2 注文書NOGIRD
	*/

	@NotBlank(message = "validate.msg_P00013CHUUBUNSHONO2")
	private String CHUUBUNSHONO2;
   /**
	*	 CHUUBUNSHOMEISAINO 注文書明細NO
	*/

	@NotBlank(message = "validate.msg_P00013CHUUBUNSHOMEISAINO")
	private String CHUUBUNSHOMEISAINO;
   /**
	*	 KUBUN 区分
	*/
	private String KUBUN;
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
	* HANBAITANKA 販売単価を設定
	*
	* @param HANBAITANKA 販売単価
	*/
	public void setHANBAITANKA(String HANBAITANKA) {
		this.HANBAITANKA = HANBAITANKA;
	}

   /**
	* HANBAITANKA 販売単価を取得
	*
	* @return HANBAITANKA 販売単価
	*/
	public String getHANBAITANKA() {
		return this.HANBAITANKA;
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

   /**
	* HANBAIKINGAKU 販売金額を設定
	*
	* @param HANBAIKINGAKU 販売金額
	*/
	public void setHANBAIKINGAKU(String HANBAIKINGAKU) {
		this.HANBAIKINGAKU = HANBAIKINGAKU;
	}

   /**
	* HANBAIKINGAKU 販売金額を取得
	*
	* @return HANBAIKINGAKU 販売金額
	*/
	public String getHANBAIKINGAKU() {
		return this.HANBAIKINGAKU;
	}

   /**
	* TSUKAMATSUNYUUKINGAKUJPY 仕入金額(JPY)を設定
	*
	* @param TSUKAMATSUNYUUKINGAKUJPY 仕入金額(JPY)
	*/
	public void setTSUKAMATSUNYUUKINGAKUJPY(String TSUKAMATSUNYUUKINGAKUJPY) {
		this.TSUKAMATSUNYUUKINGAKUJPY = TSUKAMATSUNYUUKINGAKUJPY;
	}

   /**
	* TSUKAMATSUNYUUKINGAKUJPY 仕入金額(JPY)を取得
	*
	* @return TSUKAMATSUNYUUKINGAKUJPY 仕入金額(JPY)
	*/
	public String getTSUKAMATSUNYUUKINGAKUJPY() {
		return this.TSUKAMATSUNYUUKINGAKUJPY;
	}

   /**
	* TSUKAMATSUNYUUKINGAKURMB 仕入金額(RMB)を設定
	*
	* @param TSUKAMATSUNYUUKINGAKURMB 仕入金額(RMB)
	*/
	public void setTSUKAMATSUNYUUKINGAKURMB(String TSUKAMATSUNYUUKINGAKURMB) {
		this.TSUKAMATSUNYUUKINGAKURMB = TSUKAMATSUNYUUKINGAKURMB;
	}

   /**
	* TSUKAMATSUNYUUKINGAKURMB 仕入金額(RMB)を取得
	*
	* @return TSUKAMATSUNYUUKINGAKURMB 仕入金額(RMB)
	*/
	public String getTSUKAMATSUNYUUKINGAKURMB() {
		return this.TSUKAMATSUNYUUKINGAKURMB;
	}

   /**
	* TSUKAMATSUNYUUKINGAKUUSD 仕入金額(USD)を設定
	*
	* @param TSUKAMATSUNYUUKINGAKUUSD 仕入金額(USD)
	*/
	public void setTSUKAMATSUNYUUKINGAKUUSD(String TSUKAMATSUNYUUKINGAKUUSD) {
		this.TSUKAMATSUNYUUKINGAKUUSD = TSUKAMATSUNYUUKINGAKUUSD;
	}

   /**
	* TSUKAMATSUNYUUKINGAKUUSD 仕入金額(USD)を取得
	*
	* @return TSUKAMATSUNYUUKINGAKUUSD 仕入金額(USD)
	*/
	public String getTSUKAMATSUNYUUKINGAKUUSD() {
		return this.TSUKAMATSUNYUUKINGAKUUSD;
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
	* CHUUBUNSHONO2 注文書NOGIRDを設定
	*
	* @param CHUUBUNSHONO2 注文書NOGIRD
	*/
	public void setCHUUBUNSHONO2(String CHUUBUNSHONO2) {
		this.CHUUBUNSHONO2 = CHUUBUNSHONO2;
	}

   /**
	* CHUUBUNSHONO2 注文書NOGIRDを取得
	*
	* @return CHUUBUNSHONO2 注文書NOGIRD
	*/
	public String getCHUUBUNSHONO2() {
		return this.CHUUBUNSHONO2;
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


}