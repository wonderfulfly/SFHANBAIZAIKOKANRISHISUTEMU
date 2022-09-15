package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A010;


import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @project
 *     
 * @comment
 *     table id: A010grdC10Entity
 * @version

 */
public class A010grdC10Entity {
   /**
	*	 MITSUMORISHONO 見積書NO
	*/
	private String MITSUMORISHONO;
   /**
	*	 CHUUMONHIDZUKE 注文日付
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00010CHUUMONHIDZUKE9")
	private String CHUUMONHIDZUKE;
   /**
	*	 SHOUHINSOUGAKUJPY 商品総額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00010SHOUHINSOUGAKUJPY19")
	private String SHOUHINSOUGAKUJPY;
   /**
	*	 SHANAIKOUJIBANGOU 社内工事番号
	*/
	private String SHANAIKOUJIBANGOU;
   /**
	*	 KYAKUSAKIID1 客先
	*/

	@NotBlank(message = "validate.msg_P00010KYAKUSAKIID1")
	private String KYAKUSAKIID1;
   /**
	*	 SHUTSUNYUUKOFURAGU 出入庫状態
	*/

	@NotBlank(message = "validate.msg_P00010SHUTSUNYUUKOFURAGU")
	private String SHUTSUNYUUKOFURAGU;
   /**
	*	 TANTOUSHAID1 担当者
	*/

	@NotBlank(message = "validate.msg_P00010TANTOUSHAID1")
	private String TANTOUSHAID1;
   /**
	*	 KYAKUSAKITANTOU 客先担当
	*/
	private String KYAKUSAKITANTOU;
   /**
	*	 CHUUBUNSHONO 注文書NO
	*/

	@NotBlank(message = "validate.msg_P00010CHUUBUNSHONO")
	private String CHUUBUNSHONO;
   /**
	* MITSUMORISHONO 見積書NOを設定
	*
	* @param MITSUMORISHONO 見積書NO
	*/
	public void setMITSUMORISHONO(String MITSUMORISHONO) {
		this.MITSUMORISHONO = MITSUMORISHONO;
	}

   /**
	* MITSUMORISHONO 見積書NOを取得
	*
	* @return MITSUMORISHONO 見積書NO
	*/
	public String getMITSUMORISHONO() {
		return this.MITSUMORISHONO;
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
	* SHOUHINSOUGAKUJPY 商品総額を設定
	*
	* @param SHOUHINSOUGAKUJPY 商品総額
	*/
	public void setSHOUHINSOUGAKUJPY(String SHOUHINSOUGAKUJPY) {
		this.SHOUHINSOUGAKUJPY = SHOUHINSOUGAKUJPY;
	}

   /**
	* SHOUHINSOUGAKUJPY 商品総額を取得
	*
	* @return SHOUHINSOUGAKUJPY 商品総額
	*/
	public String getSHOUHINSOUGAKUJPY() {
		return this.SHOUHINSOUGAKUJPY;
	}

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
	* KYAKUSAKIID1 客先を設定
	*
	* @param KYAKUSAKIID1 客先
	*/
	public void setKYAKUSAKIID1(String KYAKUSAKIID1) {
		this.KYAKUSAKIID1 = KYAKUSAKIID1;
	}

   /**
	* KYAKUSAKIID1 客先を取得
	*
	* @return KYAKUSAKIID1 客先
	*/
	public String getKYAKUSAKIID1() {
		return this.KYAKUSAKIID1;
	}

   /**
	* SHUTSUNYUUKOFURAGU 出入庫状態を設定
	*
	* @param SHUTSUNYUUKOFURAGU 出入庫状態
	*/
	public void setSHUTSUNYUUKOFURAGU(String SHUTSUNYUUKOFURAGU) {
		this.SHUTSUNYUUKOFURAGU = SHUTSUNYUUKOFURAGU;
	}

   /**
	* SHUTSUNYUUKOFURAGU 出入庫状態を取得
	*
	* @return SHUTSUNYUUKOFURAGU 出入庫状態
	*/
	public String getSHUTSUNYUUKOFURAGU() {
		return this.SHUTSUNYUUKOFURAGU;
	}

   /**
	* TANTOUSHAID1 担当者を設定
	*
	* @param TANTOUSHAID1 担当者
	*/
	public void setTANTOUSHAID1(String TANTOUSHAID1) {
		this.TANTOUSHAID1 = TANTOUSHAID1;
	}

   /**
	* TANTOUSHAID1 担当者を取得
	*
	* @return TANTOUSHAID1 担当者
	*/
	public String getTANTOUSHAID1() {
		return this.TANTOUSHAID1;
	}

   /**
	* KYAKUSAKITANTOU 客先担当を設定
	*
	* @param KYAKUSAKITANTOU 客先担当
	*/
	public void setKYAKUSAKITANTOU(String KYAKUSAKITANTOU) {
		this.KYAKUSAKITANTOU = KYAKUSAKITANTOU;
	}

   /**
	* KYAKUSAKITANTOU 客先担当を取得
	*
	* @return KYAKUSAKITANTOU 客先担当
	*/
	public String getKYAKUSAKITANTOU() {
		return this.KYAKUSAKITANTOU;
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