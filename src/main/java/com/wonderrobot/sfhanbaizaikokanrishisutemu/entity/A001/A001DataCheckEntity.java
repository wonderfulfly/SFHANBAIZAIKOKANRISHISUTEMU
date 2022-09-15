package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A001;


import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;

/**
 * @project
 *     
 * @comment
 *     table id: A001DataCheckEntity
 * @version

 */
public class A001DataCheckEntity {
   /**
	*	 SHAINID1 社員ID
	*/

	@NotBlank(message = "validate.msg_P00001SHAINID1")
	private String SHAINID1;
   /**
	*	 SHAINMEI1 社員名
	*/

	@NotBlank(message = "validate.msg_P00001SHAINMEI1")
	private String SHAINMEI1;
   /**
	*	 DENWABANGOU1 電話番号
	*/

	@Pattern(regexp = "^\\s*$|^(\\?81|0)\\d{1,4}[\\-]?\\d{1,4}[\\-]?\\d{4}$",message = "validate.msg_P00001DENWABANGOU123")
	private String DENWABANGOU1;
   /**
	*	 KEITAIBANGOU1  携帯番号
	*/
	private String KEITAIBANGOU1;
   /**
	*	 EMAIL1 EMAIL
	*/

	@Email(message = "validate.msg_P00001EMAIL15")
	private String EMAIL1;
   /**
	*	 LINE1 LINE
	*/
	private String LINE1;
   /**
	*	 BUMON 部門
	*/

	@NotBlank(message = "validate.msg_P00001BUMON")
	private String BUMON;
   /**
	*	 YUUKOUKUBUN1 有効区分
	*/
	private String YUUKOUKUBUN1;
   /**
	*	 ROGUINID1 ログインID
	*/

	@NotBlank(message = "validate.msg_P00001ROGUINID1")
	private String ROGUINID1;
   /**
	*	 PASUWAADO1 パスワード
	*/

	@NotBlank(message = "validate.msg_P00001PASUWAADO1")
	private String PASUWAADO1;
   /**
	* SHAINID1 社員IDを設定
	*
	* @param SHAINID1 社員ID
	*/
	public void setSHAINID1(String SHAINID1) {
		this.SHAINID1 = SHAINID1;
	}

   /**
	* SHAINID1 社員IDを取得
	*
	* @return SHAINID1 社員ID
	*/
	public String getSHAINID1() {
		return this.SHAINID1;
	}

   /**
	* SHAINMEI1 社員名を設定
	*
	* @param SHAINMEI1 社員名
	*/
	public void setSHAINMEI1(String SHAINMEI1) {
		this.SHAINMEI1 = SHAINMEI1;
	}

   /**
	* SHAINMEI1 社員名を取得
	*
	* @return SHAINMEI1 社員名
	*/
	public String getSHAINMEI1() {
		return this.SHAINMEI1;
	}

   /**
	* DENWABANGOU1 電話番号を設定
	*
	* @param DENWABANGOU1 電話番号
	*/
	public void setDENWABANGOU1(String DENWABANGOU1) {
		this.DENWABANGOU1 = DENWABANGOU1;
	}

   /**
	* DENWABANGOU1 電話番号を取得
	*
	* @return DENWABANGOU1 電話番号
	*/
	public String getDENWABANGOU1() {
		return this.DENWABANGOU1;
	}

   /**
	* KEITAIBANGOU1  携帯番号を設定
	*
	* @param KEITAIBANGOU1  携帯番号
	*/
	public void setKEITAIBANGOU1(String KEITAIBANGOU1) {
		this.KEITAIBANGOU1 = KEITAIBANGOU1;
	}

   /**
	* KEITAIBANGOU1  携帯番号を取得
	*
	* @return KEITAIBANGOU1  携帯番号
	*/
	public String getKEITAIBANGOU1() {
		return this.KEITAIBANGOU1;
	}

   /**
	* EMAIL1 EMAILを設定
	*
	* @param EMAIL1 EMAIL
	*/
	public void setEMAIL1(String EMAIL1) {
		this.EMAIL1 = EMAIL1;
	}

   /**
	* EMAIL1 EMAILを取得
	*
	* @return EMAIL1 EMAIL
	*/
	public String getEMAIL1() {
		return this.EMAIL1;
	}

   /**
	* LINE1 LINEを設定
	*
	* @param LINE1 LINE
	*/
	public void setLINE1(String LINE1) {
		this.LINE1 = LINE1;
	}

   /**
	* LINE1 LINEを取得
	*
	* @return LINE1 LINE
	*/
	public String getLINE1() {
		return this.LINE1;
	}

   /**
	* BUMON 部門を設定
	*
	* @param BUMON 部門
	*/
	public void setBUMON(String BUMON) {
		this.BUMON = BUMON;
	}

   /**
	* BUMON 部門を取得
	*
	* @return BUMON 部門
	*/
	public String getBUMON() {
		return this.BUMON;
	}

   /**
	* YUUKOUKUBUN1 有効区分を設定
	*
	* @param YUUKOUKUBUN1 有効区分
	*/
	public void setYUUKOUKUBUN1(String YUUKOUKUBUN1) {
		this.YUUKOUKUBUN1 = YUUKOUKUBUN1;
	}

   /**
	* YUUKOUKUBUN1 有効区分を取得
	*
	* @return YUUKOUKUBUN1 有効区分
	*/
	public String getYUUKOUKUBUN1() {
		return this.YUUKOUKUBUN1;
	}

   /**
	* ROGUINID1 ログインIDを設定
	*
	* @param ROGUINID1 ログインID
	*/
	public void setROGUINID1(String ROGUINID1) {
		this.ROGUINID1 = ROGUINID1;
	}

   /**
	* ROGUINID1 ログインIDを取得
	*
	* @return ROGUINID1 ログインID
	*/
	public String getROGUINID1() {
		return this.ROGUINID1;
	}

   /**
	* PASUWAADO1 パスワードを設定
	*
	* @param PASUWAADO1 パスワード
	*/
	public void setPASUWAADO1(String PASUWAADO1) {
		this.PASUWAADO1 = PASUWAADO1;
	}

   /**
	* PASUWAADO1 パスワードを取得
	*
	* @return PASUWAADO1 パスワード
	*/
	public String getPASUWAADO1() {
		return this.PASUWAADO1;
	}


}