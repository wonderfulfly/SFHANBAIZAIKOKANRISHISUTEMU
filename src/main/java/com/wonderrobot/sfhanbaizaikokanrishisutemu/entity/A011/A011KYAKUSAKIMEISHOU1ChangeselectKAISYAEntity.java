package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity
 * @version

 */
public class A011KYAKUSAKIMEISHOU1ChangeselectKAISYAEntity {
   /**
	*	 ADORESU アドレス
	*/
	private String ADORESU;
   /**
	*	 RENRAKUSAKI 連絡先
	*/
	private String RENRAKUSAKI;
   /**
	* ADORESU アドレスを設定
	*
	* @param ADORESU アドレス
	*/
	public void setADORESU(String ADORESU) {
		this.ADORESU = ADORESU;
	}

   /**
	* ADORESU アドレスを取得
	*
	* @return ADORESU アドレス
	*/
	public String getADORESU() {
		return this.ADORESU;
	}

   /**
	* RENRAKUSAKI 連絡先を設定
	*
	* @param RENRAKUSAKI 連絡先
	*/
	public void setRENRAKUSAKI(String RENRAKUSAKI) {
		this.RENRAKUSAKI = RENRAKUSAKI;
	}

   /**
	* RENRAKUSAKI 連絡先を取得
	*
	* @return RENRAKUSAKI 連絡先
	*/
	public String getRENRAKUSAKI() {
		return this.RENRAKUSAKI;
	}


}