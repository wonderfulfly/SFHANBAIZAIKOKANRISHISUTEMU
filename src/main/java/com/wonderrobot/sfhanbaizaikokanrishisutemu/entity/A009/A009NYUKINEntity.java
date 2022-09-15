package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A009NYUKINEntity
 * @version

 */
public class A009NYUKINEntity {
   /**
	*	 RESHIITONO レシートNO
	*/
	private String RESHIITONO;
   /**
	*	 CHUUBUNSHONO 注文書NO
	*/
	private String CHUUBUNSHONO;
   /**
	*	 KYAKUSAKIID 客先ID
	*/
	private String KYAKUSAKIID;
   /**
	*	 NYUUKINKINGAKU 入金金額
	*/
	private double NYUUKINKINGAKU;
   /**
	*	 CHUUMONHIDZUKE 注文日付
	*/
	private String CHUUMONHIDZUKE;
   /**
	*	 NYUUKINYOTEIHIDZUKE 入金予定日付
	*/
	private String NYUUKINYOTEIHIDZUKE;
   /**
	*	 JISSAINYUUKINJOUTAI 実際入金状態
	*/
	private String JISSAINYUUKINJOUTAI;
   /**
	*	 JISSAINYUUKINHIDZUKE 実際入金日付
	*/
	private String JISSAINYUUKINHIDZUKE;
   /**
	*	 FURIKOMIKAISHAID 振込会社ID
	*/
	private String FURIKOMIKAISHAID;
   /**
	*	 TANTOUSHAID 担当者ID
	*/
	private String TANTOUSHAID;
   /**
	*	 FURIDASHIZUMIWARIAI 振出済み割合
	*/
	private double FURIDASHIZUMIWARIAI;
   /**
	*	 FURIDASHIHIDZUKE 振出日付
	*/
	private String FURIDASHIHIDZUKE;
   /**
	*	 FURIDASHIZUMIKINGAKU 振出済み金額
	*/
	private double FURIDASHIZUMIKINGAKU;
   /**
	*	 NYUUKINZUMIWARIAI 入金済み割合
	*/
	private double NYUUKINZUMIWARIAI;
   /**
	*	 NYUUKINZUMIHIDZUKE 入金済み日付
	*/
	private String NYUUKINZUMIHIDZUKE;
   /**
	*	 NYUUKINZUMIKINGAKU 入金済み金額
	*/
	private double NYUUKINZUMIKINGAKU;
   /**
	*	 KANTOKU 監督
	*/
	private String KANTOKU;
   /**
	* RESHIITONO レシートNOを設定
	*
	* @param RESHIITONO レシートNO
	*/
	public void setRESHIITONO(String RESHIITONO) {
		this.RESHIITONO = RESHIITONO;
	}

   /**
	* RESHIITONO レシートNOを取得
	*
	* @return RESHIITONO レシートNO
	*/
	public String getRESHIITONO() {
		return this.RESHIITONO;
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
	* KYAKUSAKIID 客先IDを設定
	*
	* @param KYAKUSAKIID 客先ID
	*/
	public void setKYAKUSAKIID(String KYAKUSAKIID) {
		this.KYAKUSAKIID = KYAKUSAKIID;
	}

   /**
	* KYAKUSAKIID 客先IDを取得
	*
	* @return KYAKUSAKIID 客先ID
	*/
	public String getKYAKUSAKIID() {
		return this.KYAKUSAKIID;
	}

   /**
	* NYUUKINKINGAKU 入金金額を設定
	*
	* @param NYUUKINKINGAKU 入金金額
	*/
	public void setNYUUKINKINGAKU(double NYUUKINKINGAKU) {
		this.NYUUKINKINGAKU = NYUUKINKINGAKU;
	}

   /**
	* NYUUKINKINGAKU 入金金額を取得
	*
	* @return NYUUKINKINGAKU 入金金額
	*/
	public double getNYUUKINKINGAKU() {
		return this.NYUUKINKINGAKU;
	}

   /**
	* CHUUMONHIDZUKE 注文日付を設定
	*
	* @param CHUUMONHIDZUKE 注文日付
	*/
	public void setCHUUMONHIDZUKE(String CHUUMONHIDZUKE) {
		this.CHUUMONHIDZUKE = CHUUMONHIDZUKE;
	}

   /**
	* CHUUMONHIDZUKE 注文日付を取得
	*
	* @return CHUUMONHIDZUKE 注文日付
	*/
	public String getCHUUMONHIDZUKE() {
		return this.CHUUMONHIDZUKE;
	}

   /**
	* NYUUKINYOTEIHIDZUKE 入金予定日付を設定
	*
	* @param NYUUKINYOTEIHIDZUKE 入金予定日付
	*/
	public void setNYUUKINYOTEIHIDZUKE(String NYUUKINYOTEIHIDZUKE) {
		this.NYUUKINYOTEIHIDZUKE = NYUUKINYOTEIHIDZUKE;
	}

   /**
	* NYUUKINYOTEIHIDZUKE 入金予定日付を取得
	*
	* @return NYUUKINYOTEIHIDZUKE 入金予定日付
	*/
	public String getNYUUKINYOTEIHIDZUKE() {
		return this.NYUUKINYOTEIHIDZUKE;
	}

   /**
	* JISSAINYUUKINJOUTAI 実際入金状態を設定
	*
	* @param JISSAINYUUKINJOUTAI 実際入金状態
	*/
	public void setJISSAINYUUKINJOUTAI(String JISSAINYUUKINJOUTAI) {
		this.JISSAINYUUKINJOUTAI = JISSAINYUUKINJOUTAI;
	}

   /**
	* JISSAINYUUKINJOUTAI 実際入金状態を取得
	*
	* @return JISSAINYUUKINJOUTAI 実際入金状態
	*/
	public String getJISSAINYUUKINJOUTAI() {
		return this.JISSAINYUUKINJOUTAI;
	}

   /**
	* JISSAINYUUKINHIDZUKE 実際入金日付を設定
	*
	* @param JISSAINYUUKINHIDZUKE 実際入金日付
	*/
	public void setJISSAINYUUKINHIDZUKE(String JISSAINYUUKINHIDZUKE) {
		this.JISSAINYUUKINHIDZUKE = JISSAINYUUKINHIDZUKE;
	}

   /**
	* JISSAINYUUKINHIDZUKE 実際入金日付を取得
	*
	* @return JISSAINYUUKINHIDZUKE 実際入金日付
	*/
	public String getJISSAINYUUKINHIDZUKE() {
		return this.JISSAINYUUKINHIDZUKE;
	}

   /**
	* FURIKOMIKAISHAID 振込会社IDを設定
	*
	* @param FURIKOMIKAISHAID 振込会社ID
	*/
	public void setFURIKOMIKAISHAID(String FURIKOMIKAISHAID) {
		this.FURIKOMIKAISHAID = FURIKOMIKAISHAID;
	}

   /**
	* FURIKOMIKAISHAID 振込会社IDを取得
	*
	* @return FURIKOMIKAISHAID 振込会社ID
	*/
	public String getFURIKOMIKAISHAID() {
		return this.FURIKOMIKAISHAID;
	}

   /**
	* TANTOUSHAID 担当者IDを設定
	*
	* @param TANTOUSHAID 担当者ID
	*/
	public void setTANTOUSHAID(String TANTOUSHAID) {
		this.TANTOUSHAID = TANTOUSHAID;
	}

   /**
	* TANTOUSHAID 担当者IDを取得
	*
	* @return TANTOUSHAID 担当者ID
	*/
	public String getTANTOUSHAID() {
		return this.TANTOUSHAID;
	}

   /**
	* FURIDASHIZUMIWARIAI 振出済み割合を設定
	*
	* @param FURIDASHIZUMIWARIAI 振出済み割合
	*/
	public void setFURIDASHIZUMIWARIAI(double FURIDASHIZUMIWARIAI) {
		this.FURIDASHIZUMIWARIAI = FURIDASHIZUMIWARIAI;
	}

   /**
	* FURIDASHIZUMIWARIAI 振出済み割合を取得
	*
	* @return FURIDASHIZUMIWARIAI 振出済み割合
	*/
	public double getFURIDASHIZUMIWARIAI() {
		return this.FURIDASHIZUMIWARIAI;
	}

   /**
	* FURIDASHIHIDZUKE 振出日付を設定
	*
	* @param FURIDASHIHIDZUKE 振出日付
	*/
	public void setFURIDASHIHIDZUKE(String FURIDASHIHIDZUKE) {
		this.FURIDASHIHIDZUKE = FURIDASHIHIDZUKE;
	}

   /**
	* FURIDASHIHIDZUKE 振出日付を取得
	*
	* @return FURIDASHIHIDZUKE 振出日付
	*/
	public String getFURIDASHIHIDZUKE() {
		return this.FURIDASHIHIDZUKE;
	}

   /**
	* FURIDASHIZUMIKINGAKU 振出済み金額を設定
	*
	* @param FURIDASHIZUMIKINGAKU 振出済み金額
	*/
	public void setFURIDASHIZUMIKINGAKU(double FURIDASHIZUMIKINGAKU) {
		this.FURIDASHIZUMIKINGAKU = FURIDASHIZUMIKINGAKU;
	}

   /**
	* FURIDASHIZUMIKINGAKU 振出済み金額を取得
	*
	* @return FURIDASHIZUMIKINGAKU 振出済み金額
	*/
	public double getFURIDASHIZUMIKINGAKU() {
		return this.FURIDASHIZUMIKINGAKU;
	}

   /**
	* NYUUKINZUMIWARIAI 入金済み割合を設定
	*
	* @param NYUUKINZUMIWARIAI 入金済み割合
	*/
	public void setNYUUKINZUMIWARIAI(double NYUUKINZUMIWARIAI) {
		this.NYUUKINZUMIWARIAI = NYUUKINZUMIWARIAI;
	}

   /**
	* NYUUKINZUMIWARIAI 入金済み割合を取得
	*
	* @return NYUUKINZUMIWARIAI 入金済み割合
	*/
	public double getNYUUKINZUMIWARIAI() {
		return this.NYUUKINZUMIWARIAI;
	}

   /**
	* NYUUKINZUMIHIDZUKE 入金済み日付を設定
	*
	* @param NYUUKINZUMIHIDZUKE 入金済み日付
	*/
	public void setNYUUKINZUMIHIDZUKE(String NYUUKINZUMIHIDZUKE) {
		this.NYUUKINZUMIHIDZUKE = NYUUKINZUMIHIDZUKE;
	}

   /**
	* NYUUKINZUMIHIDZUKE 入金済み日付を取得
	*
	* @return NYUUKINZUMIHIDZUKE 入金済み日付
	*/
	public String getNYUUKINZUMIHIDZUKE() {
		return this.NYUUKINZUMIHIDZUKE;
	}

   /**
	* NYUUKINZUMIKINGAKU 入金済み金額を設定
	*
	* @param NYUUKINZUMIKINGAKU 入金済み金額
	*/
	public void setNYUUKINZUMIKINGAKU(double NYUUKINZUMIKINGAKU) {
		this.NYUUKINZUMIKINGAKU = NYUUKINZUMIKINGAKU;
	}

   /**
	* NYUUKINZUMIKINGAKU 入金済み金額を取得
	*
	* @return NYUUKINZUMIKINGAKU 入金済み金額
	*/
	public double getNYUUKINZUMIKINGAKU() {
		return this.NYUUKINZUMIKINGAKU;
	}

   /**
	* KANTOKU 監督を設定
	*
	* @param KANTOKU 監督
	*/
	public void setKANTOKU(String KANTOKU) {
		this.KANTOKU = KANTOKU;
	}

   /**
	* KANTOKU 監督を取得
	*
	* @return KANTOKU 監督
	*/
	public String getKANTOKU() {
		return this.KANTOKU;
	}


}