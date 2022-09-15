package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A010W6afterdeleteMITUMORIRINJIHYOUEntity
 * @version

 */
public class A010W6afterdeleteMITUMORIRINJIHYOUEntity {
   /**
	*	 MITSUMORINO 見積りNO
	*/
	private String MITSUMORINO;
   /**
	*	 KOUMOKU 項目
	*/
	private String KOUMOKU;
   /**
	*	 SUURYOU 数量
	*/
	private int SUURYOU;
   /**
	*	 PRICE 単価
	*/
	private double PRICE;
   /**
	*	 GOLD 金額
	*/
	private double GOLD;
   /**
	*	 KAHEI 貨幣
	*/
	private String KAHEI;
   /**
	* MITSUMORINO 見積りNOを設定
	*
	* @param MITSUMORINO 見積りNO
	*/
	public void setMITSUMORINO(String MITSUMORINO) {
		this.MITSUMORINO = MITSUMORINO;
	}

   /**
	* MITSUMORINO 見積りNOを取得
	*
	* @return MITSUMORINO 見積りNO
	*/
	public String getMITSUMORINO() {
		return this.MITSUMORINO;
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
	* GOLD 金額を設定
	*
	* @param GOLD 金額
	*/
	public void setGOLD(double GOLD) {
		this.GOLD = GOLD;
	}

   /**
	* GOLD 金額を取得
	*
	* @return GOLD 金額
	*/
	public double getGOLD() {
		return this.GOLD;
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