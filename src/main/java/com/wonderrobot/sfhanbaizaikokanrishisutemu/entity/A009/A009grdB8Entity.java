package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009;


import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @project
 *     
 * @comment
 *     table id: A009grdB8Entity
 * @version

 */
public class A009grdB8Entity {
   /**
	*	 SHIHARAIWARIAI 支払割合
	*/
	private String SHIHARAIWARIAI;
   /**
	*	 FURIDASHIZUMIHIDZUKE 領収書発行日
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00011FURIDASHIZUMIHIDZUKE9")
	private String FURIDASHIZUMIHIDZUKE;
   /**
	*	 FURIDASHIZUMIKINGAKU 振出済み金額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00011FURIDASHIZUMIKINGAKU19")
	private String FURIDASHIZUMIKINGAKU;
   /**
	*	 FURIDASHIZUMIWARIAI 振出済み%
	*/
	private String FURIDASHIZUMIWARIAI;
   /**
	*	 NYUUKINZUMIHIDZUKE 入金済み日付
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00011NYUUKINZUMIHIDZUKE9")
	private String NYUUKINZUMIHIDZUKE;
   /**
	*	 NYUUKINZUMIKINGAKU 入金済み金額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00011NYUUKINZUMIKINGAKU19")
	private String NYUUKINZUMIKINGAKU;
   /**
	*	 NYUUKINZUMIWARIAI 入金済み%
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00011NYUUKINZUMIWARIAI19")
	private String NYUUKINZUMIWARIAI;
   /**
	*	 RESHIITOMEISAINO 領収書明細NO
	*/

	@NotBlank(message = "validate.msg_P00011RESHIITOMEISAINO")
	private String RESHIITOMEISAINO;
   /**
	*	 RESHIITONO1 領収書NOHIDE
	*/

	@NotBlank(message = "validate.msg_P00011RESHIITONO1")
	private String RESHIITONO1;
   /**
	*	 SHIHARAIHIDZUKE 支払日付
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00011SHIHARAIHIDZUKE9")
	private String SHIHARAIHIDZUKE;
   /**
	* SHIHARAIWARIAI 支払割合を設定
	*
	* @param SHIHARAIWARIAI 支払割合
	*/
	public void setSHIHARAIWARIAI(String SHIHARAIWARIAI) {
		this.SHIHARAIWARIAI = SHIHARAIWARIAI;
	}

   /**
	* SHIHARAIWARIAI 支払割合を取得
	*
	* @return SHIHARAIWARIAI 支払割合
	*/
	public String getSHIHARAIWARIAI() {
		return this.SHIHARAIWARIAI;
	}

   /**
	* FURIDASHIZUMIHIDZUKE 領収書発行日を設定
	*
	* @param FURIDASHIZUMIHIDZUKE 領収書発行日
	*/
	public void setFURIDASHIZUMIHIDZUKE(String FURIDASHIZUMIHIDZUKE) {
		this.FURIDASHIZUMIHIDZUKE = FURIDASHIZUMIHIDZUKE;
	}

   /**
	* FURIDASHIZUMIHIDZUKE 領収書発行日を取得
	*
	* @return FURIDASHIZUMIHIDZUKE 領収書発行日
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
	* RESHIITOMEISAINO 領収書明細NOを設定
	*
	* @param RESHIITOMEISAINO 領収書明細NO
	*/
	public void setRESHIITOMEISAINO(String RESHIITOMEISAINO) {
		this.RESHIITOMEISAINO = RESHIITOMEISAINO;
	}

   /**
	* RESHIITOMEISAINO 領収書明細NOを取得
	*
	* @return RESHIITOMEISAINO 領収書明細NO
	*/
	public String getRESHIITOMEISAINO() {
		return this.RESHIITOMEISAINO;
	}

   /**
	* RESHIITONO1 領収書NOHIDEを設定
	*
	* @param RESHIITONO1 領収書NOHIDE
	*/
	public void setRESHIITONO1(String RESHIITONO1) {
		this.RESHIITONO1 = RESHIITONO1;
	}

   /**
	* RESHIITONO1 領収書NOHIDEを取得
	*
	* @return RESHIITONO1 領収書NOHIDE
	*/
	public String getRESHIITONO1() {
		return this.RESHIITONO1;
	}

   /**
	* SHIHARAIHIDZUKE 支払日付を設定
	*
	* @param SHIHARAIHIDZUKE 支払日付
	*/
	public void setSHIHARAIHIDZUKE(String SHIHARAIHIDZUKE) {
		this.SHIHARAIHIDZUKE = SHIHARAIHIDZUKE;
	}

   /**
	* SHIHARAIHIDZUKE 支払日付を取得
	*
	* @return SHIHARAIHIDZUKE 支払日付
	*/
	public String getSHIHARAIHIDZUKE() {
		return this.SHIHARAIHIDZUKE;
	}


}