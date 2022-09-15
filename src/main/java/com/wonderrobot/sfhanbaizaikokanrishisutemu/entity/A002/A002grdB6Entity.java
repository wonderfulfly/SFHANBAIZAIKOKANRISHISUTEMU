package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002;


import org.hibernate.validator.constraints.NotBlank;

/**
 * @project
 *     
 * @comment
 *     table id: A002grdB6Entity
 * @version

 */
public class A002grdB6Entity {
   /**
	*	 SHAINMEI1 社員名
	*/

	@NotBlank(message = "validate.msg_P00002SHAINMEI1")
	private String SHAINMEI1;
   /**
	*	 DENWABANGOU 電話番号
	*/
	private String DENWABANGOU;
   /**
	*	 KEITAIBANGOU 携帯番号
	*/
	private String KEITAIBANGOU;
   /**
	*	 EMAIL EMAIL
	*/
	private String EMAIL;
   /**
	*	 LINE LINE
	*/
	private String LINE;
   /**
	*	 YUUZAAKENGEN 部門
	*/
	private String YUUZAAKENGEN;
   /**
	*	 ROGUINID ログインID
	*/

	@NotBlank(message = "validate.msg_P00002ROGUINID")
	private String ROGUINID;
   /**
	*	 SHAINID1 社員ID
	*/

	@NotBlank(message = "validate.msg_P00002SHAINID1")
	private String SHAINID1;
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
	* DENWABANGOU 電話番号を設定
	*
	* @param DENWABANGOU 電話番号
	*/
	public void setDENWABANGOU(String DENWABANGOU) {
		this.DENWABANGOU = DENWABANGOU;
	}

   /**
	* DENWABANGOU 電話番号を取得
	*
	* @return DENWABANGOU 電話番号
	*/
	public String getDENWABANGOU() {
		return this.DENWABANGOU;
	}

   /**
	* KEITAIBANGOU 携帯番号を設定
	*
	* @param KEITAIBANGOU 携帯番号
	*/
	public void setKEITAIBANGOU(String KEITAIBANGOU) {
		this.KEITAIBANGOU = KEITAIBANGOU;
	}

   /**
	* KEITAIBANGOU 携帯番号を取得
	*
	* @return KEITAIBANGOU 携帯番号
	*/
	public String getKEITAIBANGOU() {
		return this.KEITAIBANGOU;
	}

   /**
	* EMAIL EMAILを設定
	*
	* @param EMAIL EMAIL
	*/
	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

   /**
	* EMAIL EMAILを取得
	*
	* @return EMAIL EMAIL
	*/
	public String getEMAIL() {
		return this.EMAIL;
	}

   /**
	* LINE LINEを設定
	*
	* @param LINE LINE
	*/
	public void setLINE(String LINE) {
		this.LINE = LINE;
	}

   /**
	* LINE LINEを取得
	*
	* @return LINE LINE
	*/
	public String getLINE() {
		return this.LINE;
	}

   /**
	* YUUZAAKENGEN 部門を設定
	*
	* @param YUUZAAKENGEN 部門
	*/
	public void setYUUZAAKENGEN(String YUUZAAKENGEN) {
		this.YUUZAAKENGEN = YUUZAAKENGEN;
	}

   /**
	* YUUZAAKENGEN 部門を取得
	*
	* @return YUUZAAKENGEN 部門
	*/
	public String getYUUZAAKENGEN() {
		return this.YUUZAAKENGEN;
	}

   /**
	* ROGUINID ログインIDを設定
	*
	* @param ROGUINID ログインID
	*/
	public void setROGUINID(String ROGUINID) {
		this.ROGUINID = ROGUINID;
	}

   /**
	* ROGUINID ログインIDを取得
	*
	* @return ROGUINID ログインID
	*/
	public String getROGUINID() {
		return this.ROGUINID;
	}

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


}