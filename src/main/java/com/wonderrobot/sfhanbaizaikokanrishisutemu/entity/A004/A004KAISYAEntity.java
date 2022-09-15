package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A004KAISYAEntity
 * @version

 */
public class A004KAISYAEntity {
   /**
	*	 KAISHAID 会社ID
	*/
	private String KAISHAID;
   /**
	*	 KAISHAMEI 会社名
	*/
	private String KAISHAMEI;
   /**
	*	 KAISHARYAKUSHOU 会社略称
	*/
	private String KAISHARYAKUSHOU;
   /**
	*	 ADORESU アドレス
	*/
	private String ADORESU;
   /**
	*	 RENRAKUSAKI 連絡先
	*/
	private String RENRAKUSAKI;
   /**
	*	 SHIHARAIKIGEN 支払期限
	*/
	private int SHIHARAIKIGEN;
   /**
	*	 KAISHAKUBUN 会社区分
	*/
	private String KAISHAKUBUN;
   /**
	* KAISHAID 会社IDを設定
	*
	* @param KAISHAID 会社ID
	*/
	public void setKAISHAID(String KAISHAID) {
		this.KAISHAID = KAISHAID;
	}

   /**
	* KAISHAID 会社IDを取得
	*
	* @return KAISHAID 会社ID
	*/
	public String getKAISHAID() {
		return this.KAISHAID;
	}

   /**
	* KAISHAMEI 会社名を設定
	*
	* @param KAISHAMEI 会社名
	*/
	public void setKAISHAMEI(String KAISHAMEI) {
		this.KAISHAMEI = KAISHAMEI;
	}

   /**
	* KAISHAMEI 会社名を取得
	*
	* @return KAISHAMEI 会社名
	*/
	public String getKAISHAMEI() {
		return this.KAISHAMEI;
	}

   /**
	* KAISHARYAKUSHOU 会社略称を設定
	*
	* @param KAISHARYAKUSHOU 会社略称
	*/
	public void setKAISHARYAKUSHOU(String KAISHARYAKUSHOU) {
		this.KAISHARYAKUSHOU = KAISHARYAKUSHOU;
	}

   /**
	* KAISHARYAKUSHOU 会社略称を取得
	*
	* @return KAISHARYAKUSHOU 会社略称
	*/
	public String getKAISHARYAKUSHOU() {
		return this.KAISHARYAKUSHOU;
	}

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

   /**
	* SHIHARAIKIGEN 支払期限を設定
	*
	* @param SHIHARAIKIGEN 支払期限
	*/
	public void setSHIHARAIKIGEN(int SHIHARAIKIGEN) {
		this.SHIHARAIKIGEN = SHIHARAIKIGEN;
	}

   /**
	* SHIHARAIKIGEN 支払期限を取得
	*
	* @return SHIHARAIKIGEN 支払期限
	*/
	public int getSHIHARAIKIGEN() {
		return this.SHIHARAIKIGEN;
	}

   /**
	* KAISHAKUBUN 会社区分を設定
	*
	* @param KAISHAKUBUN 会社区分
	*/
	public void setKAISHAKUBUN(String KAISHAKUBUN) {
		this.KAISHAKUBUN = KAISHAKUBUN;
	}

   /**
	* KAISHAKUBUN 会社区分を取得
	*
	* @return KAISHAKUBUN 会社区分
	*/
	public String getKAISHAKUBUN() {
		return this.KAISHAKUBUN;
	}


}