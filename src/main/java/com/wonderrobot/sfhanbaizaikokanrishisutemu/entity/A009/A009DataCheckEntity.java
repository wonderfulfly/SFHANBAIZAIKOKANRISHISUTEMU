package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009;


import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A009.A009grdB8Entity;

/**
 * @project
 *     
 * @comment
 *     table id: A009DataCheckEntity
 * @version

 */
public class A009DataCheckEntity {
   /**
	*	 KYAKUSAKI 客先
	*/
	private String KYAKUSAKI;
   /**
	*	 TANTOUSHA 担当者
	*/
	private String TANTOUSHA;
   /**
	*	 RYOUSHUUSHONO 領収書NO
	*/

	@NotBlank(message = "validate.msg_P00011RYOUSHUUSHONO")
	private String RYOUSHUUSHONO;
   /**
	*	 CHUUBUNSHONO1 注文書NO
	*/

	@NotBlank(message = "validate.msg_P00011CHUUBUNSHONO1")
	private String CHUUBUNSHONO1;
   /**
	*	 NYUUKINYOTEIHIDZUKE 入金予定日付
	*/
	private String NYUUKINYOTEIHIDZUKE;
   /**
	*	 SHIHARAIWARIAIGOUKEI 支払割合合計
	*/
	private String SHIHARAIWARIAIGOUKEI;
   /**
	*	 KANTOKU1 監督
	*/
	private String KANTOKU1;
   /**
	*	 CHUUMONHIDZUKE1 注文日付
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00011CHUUMONHIDZUKE19")
	private String CHUUMONHIDZUKE1;
   /**
	*	 NYUUKINKINGAKU1 入金金額
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00011NYUUKINKINGAKU119")
	private String NYUUKINKINGAKU1;
   /**
	*	 JISSAINYUUKINJOUTAI1 実際入金状態
	*/
	private String JISSAINYUUKINJOUTAI1;
   /**
	*	 JISSAINYUUKINHIDZUKE 実際入金日付
	*/
	private String JISSAINYUUKINHIDZUKE;
   /**
	*	 MSG msg
	*/
	private String MSG;
   /**
	*	 KYANSERUFURAGU キャンセルフラグ
	*/
	private String KYANSERUFURAGU;
   /**
	*	 Grid61 grdB8
	*/
	private List<A009grdB8Entity> Grid61;
   /**
	* KYAKUSAKI 客先を設定
	*
	* @param KYAKUSAKI 客先
	*/
	public void setKYAKUSAKI(String KYAKUSAKI) {
		this.KYAKUSAKI = KYAKUSAKI;
	}

   /**
	* KYAKUSAKI 客先を取得
	*
	* @return KYAKUSAKI 客先
	*/
	public String getKYAKUSAKI() {
		return this.KYAKUSAKI;
	}

   /**
	* TANTOUSHA 担当者を設定
	*
	* @param TANTOUSHA 担当者
	*/
	public void setTANTOUSHA(String TANTOUSHA) {
		this.TANTOUSHA = TANTOUSHA;
	}

   /**
	* TANTOUSHA 担当者を取得
	*
	* @return TANTOUSHA 担当者
	*/
	public String getTANTOUSHA() {
		return this.TANTOUSHA;
	}

   /**
	* RYOUSHUUSHONO 領収書NOを設定
	*
	* @param RYOUSHUUSHONO 領収書NO
	*/
	public void setRYOUSHUUSHONO(String RYOUSHUUSHONO) {
		this.RYOUSHUUSHONO = RYOUSHUUSHONO;
	}

   /**
	* RYOUSHUUSHONO 領収書NOを取得
	*
	* @return RYOUSHUUSHONO 領収書NO
	*/
	public String getRYOUSHUUSHONO() {
		return this.RYOUSHUUSHONO;
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
	* SHIHARAIWARIAIGOUKEI 支払割合合計を設定
	*
	* @param SHIHARAIWARIAIGOUKEI 支払割合合計
	*/
	public void setSHIHARAIWARIAIGOUKEI(String SHIHARAIWARIAIGOUKEI) {
		this.SHIHARAIWARIAIGOUKEI = SHIHARAIWARIAIGOUKEI;
	}

   /**
	* SHIHARAIWARIAIGOUKEI 支払割合合計を取得
	*
	* @return SHIHARAIWARIAIGOUKEI 支払割合合計
	*/
	public String getSHIHARAIWARIAIGOUKEI() {
		return this.SHIHARAIWARIAIGOUKEI;
	}

   /**
	* KANTOKU1 監督を設定
	*
	* @param KANTOKU1 監督
	*/
	public void setKANTOKU1(String KANTOKU1) {
		this.KANTOKU1 = KANTOKU1;
	}

   /**
	* KANTOKU1 監督を取得
	*
	* @return KANTOKU1 監督
	*/
	public String getKANTOKU1() {
		return this.KANTOKU1;
	}

   /**
	* CHUUMONHIDZUKE1 注文日付を設定
	*
	* @param CHUUMONHIDZUKE1 注文日付
	*/
	public void setCHUUMONHIDZUKE1(String CHUUMONHIDZUKE1) {
		this.CHUUMONHIDZUKE1 = CHUUMONHIDZUKE1;
	}

   /**
	* CHUUMONHIDZUKE1 注文日付を取得
	*
	* @return CHUUMONHIDZUKE1 注文日付
	*/
	public String getCHUUMONHIDZUKE1() {
		return this.CHUUMONHIDZUKE1;
	}

   /**
	* NYUUKINKINGAKU1 入金金額を設定
	*
	* @param NYUUKINKINGAKU1 入金金額
	*/
	public void setNYUUKINKINGAKU1(String NYUUKINKINGAKU1) {
		this.NYUUKINKINGAKU1 = NYUUKINKINGAKU1;
	}

   /**
	* NYUUKINKINGAKU1 入金金額を取得
	*
	* @return NYUUKINKINGAKU1 入金金額
	*/
	public String getNYUUKINKINGAKU1() {
		return this.NYUUKINKINGAKU1;
	}

   /**
	* JISSAINYUUKINJOUTAI1 実際入金状態を設定
	*
	* @param JISSAINYUUKINJOUTAI1 実際入金状態
	*/
	public void setJISSAINYUUKINJOUTAI1(String JISSAINYUUKINJOUTAI1) {
		this.JISSAINYUUKINJOUTAI1 = JISSAINYUUKINJOUTAI1;
	}

   /**
	* JISSAINYUUKINJOUTAI1 実際入金状態を取得
	*
	* @return JISSAINYUUKINJOUTAI1 実際入金状態
	*/
	public String getJISSAINYUUKINJOUTAI1() {
		return this.JISSAINYUUKINJOUTAI1;
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
	* MSG msgを設定
	*
	* @param MSG msg
	*/
	public void setMSG(String MSG) {
		this.MSG = MSG;
	}

   /**
	* MSG msgを取得
	*
	* @return MSG msg
	*/
	public String getMSG() {
		return this.MSG;
	}

   /**
	* KYANSERUFURAGU キャンセルフラグを設定
	*
	* @param KYANSERUFURAGU キャンセルフラグ
	*/
	public void setKYANSERUFURAGU(String KYANSERUFURAGU) {
		this.KYANSERUFURAGU = KYANSERUFURAGU;
	}

   /**
	* KYANSERUFURAGU キャンセルフラグを取得
	*
	* @return KYANSERUFURAGU キャンセルフラグ
	*/
	public String getKYANSERUFURAGU() {
		return this.KYANSERUFURAGU;
	}

   /**
	* Grid61 grdB8を設定
	*
	* @param Grid61 grdB8
	*/
	public void setGrid61(List<A009grdB8Entity> Grid61) {
		this.Grid61 = Grid61;
	}

   /**
	* Grid61 grdB8を取得
	*
	* @return Grid61 grdB8
	*/
	public List<A009grdB8Entity> getGrid61() {
		return this.Grid61;
	}


}