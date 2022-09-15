package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A011W41ClickselectZAIKOU4Entity
 * @version

 */
public class A011W41ClickselectZAIKOU4Entity {
   /**
	*	 SHOUHINNO 商品NO
	*/
	private String SHOUHINNO;
   /**
	*	 SUURYOU 数量
	*/
	private int SUURYOU;
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


}