package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008;


import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @project
 *     
 * @comment
 *     table id: A008grdB8Entity
 * @version

 */
public class A008grdB8Entity {
   /**
	*	 SHANAIKOUJIBANGOU 社内工事番号
	*/
	private String SHANAIKOUJIBANGOU;
   /**
	*	 SHOUHINSOUGAKUJPY 契約金額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00010SHOUHINSOUGAKUJPY19")
	private String SHOUHINSOUGAKUJPY;
   /**
	*	 TANTOUSHAID 担当者
	*/
	private String TANTOUSHAID;
   /**
	*	 CHUUMONHIDZUKE1 受注日付
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00010CHUUMONHIDZUKE19")
	private String CHUUMONHIDZUKE1;
   /**
	*	 SHIHARAIHIDZUKE 入金予定日
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00010SHIHARAIHIDZUKE9")
	private String SHIHARAIHIDZUKE;
   /**
	*	 FURIDASHIZUMIWARIAI 振出済み%
	*/
	private String FURIDASHIZUMIWARIAI;
   /**
	*	 FURIDASHIZUMIHIDZUKE 振出日
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00010FURIDASHIZUMIHIDZUKE9")
	private String FURIDASHIZUMIHIDZUKE;
   /**
	*	 FURIDASHIZUMIKINGAKU 振出済み金額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00010FURIDASHIZUMIKINGAKU19")
	private String FURIDASHIZUMIKINGAKU;
   /**
	*	 NYUUKINWARIAI 未振出%
	*/
	private String NYUUKINWARIAI;
   /**
	*	 NYUUKINGAKU 未振出金額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00010NYUUKINGAKU19")
	private String NYUUKINGAKU;
   /**
	*	 NYUUKINZUMIWARIAI 入金済み%
	*/
	private String NYUUKINZUMIWARIAI;
   /**
	*	 NYUUKINZUMIKINGAKU 入金済み金額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00010NYUUKINZUMIKINGAKU19")
	private String NYUUKINZUMIKINGAKU;
   /**
	*	 MINYUUKINWARIAI 未入金%
	*/
	private String MINYUUKINWARIAI;
   /**
	*	 MINYUUKINKINGAKU 未入金金額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00010MINYUUKINKINGAKU19")
	private String MINYUUKINKINGAKU;
   /**
	*	 RESHIITONO レシートNO
	*/
	private String RESHIITONO;
   /**
	*	 CHUUBUNSHONO1 注文書NO
	*/
	private String CHUUBUNSHONO1;
   /**
	*	 KYAKUSAKIID 客先
	*/

	@NotBlank(message = "validate.msg_P00010KYAKUSAKIID")
	private String KYAKUSAKIID;
   /**
	* SHANAIKOUJIBANGOU 社内工事番号を設定
	*
	* @param SHANAIKOUJIBANGOU 社内工事番号
	*/
	public void setSHANAIKOUJIBANGOU(String SHANAIKOUJIBANGOU) {
		this.SHANAIKOUJIBANGOU = SHANAIKOUJIBANGOU;
	}

   /**
	* SHANAIKOUJIBANGOU 社内工事番号を取得
	*
	* @return SHANAIKOUJIBANGOU 社内工事番号
	*/
	public String getSHANAIKOUJIBANGOU() {
		return this.SHANAIKOUJIBANGOU;
	}

   /**
	* SHOUHINSOUGAKUJPY 契約金額を設定
	*
	* @param SHOUHINSOUGAKUJPY 契約金額
	*/
	public void setSHOUHINSOUGAKUJPY(String SHOUHINSOUGAKUJPY) {
		this.SHOUHINSOUGAKUJPY = SHOUHINSOUGAKUJPY;
	}

   /**
	* SHOUHINSOUGAKUJPY 契約金額を取得
	*
	* @return SHOUHINSOUGAKUJPY 契約金額
	*/
	public String getSHOUHINSOUGAKUJPY() {
		return this.SHOUHINSOUGAKUJPY;
	}

   /**
	* TANTOUSHAID 担当者を設定
	*
	* @param TANTOUSHAID 担当者
	*/
	public void setTANTOUSHAID(String TANTOUSHAID) {
		this.TANTOUSHAID = TANTOUSHAID;
	}

   /**
	* TANTOUSHAID 担当者を取得
	*
	* @return TANTOUSHAID 担当者
	*/
	public String getTANTOUSHAID() {
		return this.TANTOUSHAID;
	}

   /**
	* CHUUMONHIDZUKE1 受注日付を設定
	*
	* @param CHUUMONHIDZUKE1 受注日付
	*/
	public void setCHUUMONHIDZUKE1(String CHUUMONHIDZUKE1) {
		this.CHUUMONHIDZUKE1 = CHUUMONHIDZUKE1;
	}

   /**
	* CHUUMONHIDZUKE1 受注日付を取得
	*
	* @return CHUUMONHIDZUKE1 受注日付
	*/
	public String getCHUUMONHIDZUKE1() {
		return this.CHUUMONHIDZUKE1;
	}

   /**
	* SHIHARAIHIDZUKE 入金予定日を設定
	*
	* @param SHIHARAIHIDZUKE 入金予定日
	*/
	public void setSHIHARAIHIDZUKE(String SHIHARAIHIDZUKE) {
		this.SHIHARAIHIDZUKE = SHIHARAIHIDZUKE;
	}

   /**
	* SHIHARAIHIDZUKE 入金予定日を取得
	*
	* @return SHIHARAIHIDZUKE 入金予定日
	*/
	public String getSHIHARAIHIDZUKE() {
		return this.SHIHARAIHIDZUKE;
	}

   /**
	* FURIDASHIZUMIWARIAI 振出済み%を設定
	*
	* @param FURIDASHIZUMIWARIAI 振出済み%
	*/
	public void setFURIDASHIZUMIWARIAI(String FURIDASHIZUMIWARIAI) {
		this.FURIDASHIZUMIWARIAI = FURIDASHIZUMIWARIAI;
	}

   /**
	* FURIDASHIZUMIWARIAI 振出済み%を取得
	*
	* @return FURIDASHIZUMIWARIAI 振出済み%
	*/
	public String getFURIDASHIZUMIWARIAI() {
		return this.FURIDASHIZUMIWARIAI;
	}

   /**
	* FURIDASHIZUMIHIDZUKE 振出日を設定
	*
	* @param FURIDASHIZUMIHIDZUKE 振出日
	*/
	public void setFURIDASHIZUMIHIDZUKE(String FURIDASHIZUMIHIDZUKE) {
		this.FURIDASHIZUMIHIDZUKE = FURIDASHIZUMIHIDZUKE;
	}

   /**
	* FURIDASHIZUMIHIDZUKE 振出日を取得
	*
	* @return FURIDASHIZUMIHIDZUKE 振出日
	*/
	public String getFURIDASHIZUMIHIDZUKE() {
		return this.FURIDASHIZUMIHIDZUKE;
	}

   /**
	* FURIDASHIZUMIKINGAKU 振出済み金額を設定
	*
	* @param FURIDASHIZUMIKINGAKU 振出済み金額
	*/
	public void setFURIDASHIZUMIKINGAKU(String FURIDASHIZUMIKINGAKU) {
		this.FURIDASHIZUMIKINGAKU = FURIDASHIZUMIKINGAKU;
	}

   /**
	* FURIDASHIZUMIKINGAKU 振出済み金額を取得
	*
	* @return FURIDASHIZUMIKINGAKU 振出済み金額
	*/
	public String getFURIDASHIZUMIKINGAKU() {
		return this.FURIDASHIZUMIKINGAKU;
	}

   /**
	* NYUUKINWARIAI 未振出%を設定
	*
	* @param NYUUKINWARIAI 未振出%
	*/
	public void setNYUUKINWARIAI(String NYUUKINWARIAI) {
		this.NYUUKINWARIAI = NYUUKINWARIAI;
	}

   /**
	* NYUUKINWARIAI 未振出%を取得
	*
	* @return NYUUKINWARIAI 未振出%
	*/
	public String getNYUUKINWARIAI() {
		return this.NYUUKINWARIAI;
	}

   /**
	* NYUUKINGAKU 未振出金額を設定
	*
	* @param NYUUKINGAKU 未振出金額
	*/
	public void setNYUUKINGAKU(String NYUUKINGAKU) {
		this.NYUUKINGAKU = NYUUKINGAKU;
	}

   /**
	* NYUUKINGAKU 未振出金額を取得
	*
	* @return NYUUKINGAKU 未振出金額
	*/
	public String getNYUUKINGAKU() {
		return this.NYUUKINGAKU;
	}

   /**
	* NYUUKINZUMIWARIAI 入金済み%を設定
	*
	* @param NYUUKINZUMIWARIAI 入金済み%
	*/
	public void setNYUUKINZUMIWARIAI(String NYUUKINZUMIWARIAI) {
		this.NYUUKINZUMIWARIAI = NYUUKINZUMIWARIAI;
	}

   /**
	* NYUUKINZUMIWARIAI 入金済み%を取得
	*
	* @return NYUUKINZUMIWARIAI 入金済み%
	*/
	public String getNYUUKINZUMIWARIAI() {
		return this.NYUUKINZUMIWARIAI;
	}

   /**
	* NYUUKINZUMIKINGAKU 入金済み金額を設定
	*
	* @param NYUUKINZUMIKINGAKU 入金済み金額
	*/
	public void setNYUUKINZUMIKINGAKU(String NYUUKINZUMIKINGAKU) {
		this.NYUUKINZUMIKINGAKU = NYUUKINZUMIKINGAKU;
	}

   /**
	* NYUUKINZUMIKINGAKU 入金済み金額を取得
	*
	* @return NYUUKINZUMIKINGAKU 入金済み金額
	*/
	public String getNYUUKINZUMIKINGAKU() {
		return this.NYUUKINZUMIKINGAKU;
	}

   /**
	* MINYUUKINWARIAI 未入金%を設定
	*
	* @param MINYUUKINWARIAI 未入金%
	*/
	public void setMINYUUKINWARIAI(String MINYUUKINWARIAI) {
		this.MINYUUKINWARIAI = MINYUUKINWARIAI;
	}

   /**
	* MINYUUKINWARIAI 未入金%を取得
	*
	* @return MINYUUKINWARIAI 未入金%
	*/
	public String getMINYUUKINWARIAI() {
		return this.MINYUUKINWARIAI;
	}

   /**
	* MINYUUKINKINGAKU 未入金金額を設定
	*
	* @param MINYUUKINKINGAKU 未入金金額
	*/
	public void setMINYUUKINKINGAKU(String MINYUUKINKINGAKU) {
		this.MINYUUKINKINGAKU = MINYUUKINKINGAKU;
	}

   /**
	* MINYUUKINKINGAKU 未入金金額を取得
	*
	* @return MINYUUKINKINGAKU 未入金金額
	*/
	public String getMINYUUKINKINGAKU() {
		return this.MINYUUKINKINGAKU;
	}

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
	* CHUUBUNSHONO1 注文書NOを設定
	*
	* @param CHUUBUNSHONO1 注文書NO
	*/
	public void setCHUUBUNSHONO1(String CHUUBUNSHONO1) {
		this.CHUUBUNSHONO1 = CHUUBUNSHONO1;
	}

   /**
	* CHUUBUNSHONO1 注文書NOを取得
	*
	* @return CHUUBUNSHONO1 注文書NO
	*/
	public String getCHUUBUNSHONO1() {
		return this.CHUUBUNSHONO1;
	}

   /**
	* KYAKUSAKIID 客先を設定
	*
	* @param KYAKUSAKIID 客先
	*/
	public void setKYAKUSAKIID(String KYAKUSAKIID) {
		this.KYAKUSAKIID = KYAKUSAKIID;
	}

   /**
	* KYAKUSAKIID 客先を取得
	*
	* @return KYAKUSAKIID 客先
	*/
	public String getKYAKUSAKIID() {
		return this.KYAKUSAKIID;
	}


}