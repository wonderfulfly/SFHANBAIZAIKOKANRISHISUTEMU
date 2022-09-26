package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A013BUHINRepeatCheckEntity
 * @version

 */
public class A013BUHINRepeatCheckEntity {
   /**
	*	 KOUJIKANRIBANGOU 工事管理番号
	*/
	private String KOUJIKANRIBANGOU;
   /**
	*	 CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	private String CHUUBUNSHOMEISAINO;
   /**
	*	 CHUUBUNSHONO 注文書NO
	*/
	private String CHUUBUNSHONO;
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


}