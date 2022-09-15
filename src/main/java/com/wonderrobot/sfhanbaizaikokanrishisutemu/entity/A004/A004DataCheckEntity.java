package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A004;


import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @project
 *     
 * @comment
 *     table id: A004DataCheckEntity
 * @version

 */
public class A004DataCheckEntity {
   /**
	*	 KAISHAID1 会社ID
	*/

	@NotBlank(message = "validate.msg_P00004KAISHAID1")
	private String KAISHAID1;
   /**
	*	 KAISHAMEI1 会社名
	*/

	@NotBlank(message = "validate.msg_P00004KAISHAMEI1")
	private String KAISHAMEI1;
   /**
	*	 KAISHARYAKUSHOU1 会社略称
	*/
	private String KAISHARYAKUSHOU1;
   /**
	*	 ADORESU1 アドレス
	*/
	private String ADORESU1;
   /**
	*	 RENRAKUSAKI1 連絡先
	*/
	private String RENRAKUSAKI1;
   /**
	*	 SHIHARAIKIGEN1 支払期限
	*/

	@Pattern(regexp = "^\\s*$|(^(0|\\+?[1-9][0-9]*){0,}$)?",message = "validate.msg_P00004SHIHARAIKIGEN11")
	private String SHIHARAIKIGEN1;
   /**
	*	 KAISHAKUBUN1 会社区分
	*/
	private String KAISHAKUBUN1;
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
	* KAISHARYAKUSHOU1 会社略称を設定
	*
	* @param KAISHARYAKUSHOU1 会社略称
	*/
	public void setKAISHARYAKUSHOU1(String KAISHARYAKUSHOU1) {
		this.KAISHARYAKUSHOU1 = KAISHARYAKUSHOU1;
	}

   /**
	* KAISHARYAKUSHOU1 会社略称を取得
	*
	* @return KAISHARYAKUSHOU1 会社略称
	*/
	public String getKAISHARYAKUSHOU1() {
		return this.KAISHARYAKUSHOU1;
	}

   /**
	* ADORESU1 アドレスを設定
	*
	* @param ADORESU1 アドレス
	*/
	public void setADORESU1(String ADORESU1) {
		this.ADORESU1 = ADORESU1;
	}

   /**
	* ADORESU1 アドレスを取得
	*
	* @return ADORESU1 アドレス
	*/
	public String getADORESU1() {
		return this.ADORESU1;
	}

   /**
	* RENRAKUSAKI1 連絡先を設定
	*
	* @param RENRAKUSAKI1 連絡先
	*/
	public void setRENRAKUSAKI1(String RENRAKUSAKI1) {
		this.RENRAKUSAKI1 = RENRAKUSAKI1;
	}

   /**
	* RENRAKUSAKI1 連絡先を取得
	*
	* @return RENRAKUSAKI1 連絡先
	*/
	public String getRENRAKUSAKI1() {
		return this.RENRAKUSAKI1;
	}

   /**
	* SHIHARAIKIGEN1 支払期限を設定
	*
	* @param SHIHARAIKIGEN1 支払期限
	*/
	public void setSHIHARAIKIGEN1(String SHIHARAIKIGEN1) {
		this.SHIHARAIKIGEN1 = SHIHARAIKIGEN1;
	}

   /**
	* SHIHARAIKIGEN1 支払期限を取得
	*
	* @return SHIHARAIKIGEN1 支払期限
	*/
	public String getSHIHARAIKIGEN1() {
		return this.SHIHARAIKIGEN1;
	}

   /**
	* KAISHAKUBUN1 会社区分を設定
	*
	* @param KAISHAKUBUN1 会社区分
	*/
	public void setKAISHAKUBUN1(String KAISHAKUBUN1) {
		this.KAISHAKUBUN1 = KAISHAKUBUN1;
	}

   /**
	* KAISHAKUBUN1 会社区分を取得
	*
	* @return KAISHAKUBUN1 会社区分
	*/
	public String getKAISHAKUBUN1() {
		return this.KAISHAKUBUN1;
	}


}