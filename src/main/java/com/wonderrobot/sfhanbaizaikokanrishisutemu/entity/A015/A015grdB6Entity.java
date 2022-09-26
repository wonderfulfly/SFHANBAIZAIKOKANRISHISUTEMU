package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015;


import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @project
 *     
 * @comment
 *     table id: A015grdB6Entity
 * @version

 */
public class A015grdB6Entity {
   /**
	*	 KAISHAMEI1 会社名
	*/

	@NotBlank(message = "validate.msg_P00006KAISHAMEI1")
	private String KAISHAMEI1;
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

	@Pattern(regexp = "^\\s*$|(^(0|\\+?[1-9][0-9]*){0,}$)?",message = "validate.msg_P00006SHIHARAIKIGEN1")
	private String SHIHARAIKIGEN;
   /**
	*	 KAISHAKUBUN 会社区分
	*/
	private String KAISHAKUBUN;
   /**
	*	 KAISHAID1 会社ID
	*/

	@NotBlank(message = "validate.msg_P00006KAISHAID1")
	private String KAISHAID1;
   /**
	* KAISHAMEI1 会社名を設定
	*
	* @param KAISHAMEI1 会社名
	*/
	public void setKAISHAMEI1(String KAISHAMEI1) {
		this.KAISHAMEI1 = KAISHAMEI1;
	}

   /**
	* KAISHAMEI1 会社名を取得
	*
	* @return KAISHAMEI1 会社名
	*/
	public String getKAISHAMEI1() {
		return this.KAISHAMEI1;
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
	public void setSHIHARAIKIGEN(String SHIHARAIKIGEN) {
		this.SHIHARAIKIGEN = SHIHARAIKIGEN;
	}

   /**
	* SHIHARAIKIGEN 支払期限を取得
	*
	* @return SHIHARAIKIGEN 支払期限
	*/
	public String getSHIHARAIKIGEN() {
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

   /**
	* KAISHAID1 会社IDを設定
	*
	* @param KAISHAID1 会社ID
	*/
	public void setKAISHAID1(String KAISHAID1) {
		this.KAISHAID1 = KAISHAID1;
	}

   /**
	* KAISHAID1 会社IDを取得
	*
	* @return KAISHAID1 会社ID
	*/
	public String getKAISHAID1() {
		return this.KAISHAID1;
	}


}