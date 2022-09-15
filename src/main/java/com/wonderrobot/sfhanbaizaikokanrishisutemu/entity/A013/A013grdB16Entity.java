package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013;


import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @project
 *     
 * @comment
 *     table id: A013grdB16Entity
 * @version

 */
public class A013grdB16Entity {
   /**
	*	 HINBANNO1 品番NO
	*/
	private String HINBANNO1;
   /**
	*	 HINMEI 品名
	*/

	@NotBlank(message = "validate.msg_P00012HINMEI")
	private String HINMEI;
   /**
	*	 KOSUU 個数
	*/

	@NotBlank(message = "validate.msg_P00012KOSUU")
	@Pattern(regexp = "^\\s*$|([+-]?\\d?)?",message = "validate.msg_P00012KOSUU2")
	private String KOSUU;
   /**
	*	 SOUKOSUU 総個数
	*/

	@NotBlank(message = "validate.msg_P00012SOUKOSUU")
	@Pattern(regexp = "^\\s*$|([+-]?\\d?)?",message = "validate.msg_P00012SOUKOSUU2")
	private String SOUKOSUU;
   /**
	*	 TSUKAMATSUNYUUSAKI 仕入先
	*/

	@NotBlank(message = "validate.msg_P00012TSUKAMATSUNYUUSAKI")
	private String TSUKAMATSUNYUUSAKI;
   /**
	*	 KIBOUNOUKI 希望納期
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00012KIBOUNOUKI9")
	private String KIBOUNOUKI;
   /**
	*	 TANTOU 担当
	*/
	private String TANTOU;
   /**
	*	 TEHAISAKI 手配先
	*/
	private String TEHAISAKI;
   /**
	*	 KOUNYUUTANKA 購入単価
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00012KOUNYUUTANKA19")
	private String KOUNYUUTANKA;
   /**
	*	 KAHEI 貨幣
	*/
	private String KAHEI;
   /**
	*	 TEHAIBI 購入日付
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00012TEHAIBI9")
	private String TEHAIBI;
   /**
	*	 NYUUKABI 入荷日付
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00012NYUUKABI9")
	private String NYUUKABI;
   /**
	*	 SHOUKEI 小計
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00012SHOUKEI19")
	private String SHOUKEI;
   /**
	*	 KAKOTANKA 過去単価
	*/
	private String KAKOTANKA;
   /**
	*	 CHUUBUNSHOMEISAINO1 注文書明細NO
	*/

	@NotBlank(message = "validate.msg_P00012CHUUBUNSHOMEISAINO1")
	private String CHUUBUNSHOMEISAINO1;
   /**
	*	 CHUUBUNSHONO1 注文書NO
	*/

	@NotBlank(message = "validate.msg_P00012CHUUBUNSHONO1")
	private String CHUUBUNSHONO1;
   /**
	*	 KIBOUTANKA 希望単価
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00012KIBOUTANKA19")
	private String KIBOUTANKA;
   /**
	*	 NYUUKAYOTEIBI 入荷予定日
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00012NYUUKAYOTEIBI9")
	private String NYUUKAYOTEIBI;
   /**
	*	 HINBANNO 品番Nohide
	*/

	@NotBlank(message = "validate.msg_P00012HINBANNO")
	private String HINBANNO;
   /**
	*	 KAKUTEIKUBUN2 確定区分
	*/
	private String KAKUTEIKUBUN2;
   /**
	*	 KOUJIKANRIBANGOU2 工事管理番号hide
	*/

	@NotBlank(message = "validate.msg_P00012KOUJIKANRIBANGOU2")
	private String KOUJIKANRIBANGOU2;
   /**
	*	 SEISAKUHINKUBUN 区分
	*/

	@NotBlank(message = "validate.msg_P00012SEISAKUHINKUBUN")
	private String SEISAKUHINKUBUN;
   /**
	* HINBANNO1 品番NOを設定
	*
	* @param HINBANNO1 品番NO
	*/
	public void setHINBANNO1(String HINBANNO1) {
		this.HINBANNO1 = HINBANNO1;
	}

   /**
	* HINBANNO1 品番NOを取得
	*
	* @return HINBANNO1 品番NO
	*/
	public String getHINBANNO1() {
		return this.HINBANNO1;
	}

   /**
	* HINMEI 品名を設定
	*
	* @param HINMEI 品名
	*/
	public void setHINMEI(String HINMEI) {
		this.HINMEI = HINMEI;
	}

   /**
	* HINMEI 品名を取得
	*
	* @return HINMEI 品名
	*/
	public String getHINMEI() {
		return this.HINMEI;
	}

   /**
	* KOSUU 個数を設定
	*
	* @param KOSUU 個数
	*/
	public void setKOSUU(String KOSUU) {
		this.KOSUU = KOSUU;
	}

   /**
	* KOSUU 個数を取得
	*
	* @return KOSUU 個数
	*/
	public String getKOSUU() {
		return this.KOSUU;
	}

   /**
	* SOUKOSUU 総個数を設定
	*
	* @param SOUKOSUU 総個数
	*/
	public void setSOUKOSUU(String SOUKOSUU) {
		this.SOUKOSUU = SOUKOSUU;
	}

   /**
	* SOUKOSUU 総個数を取得
	*
	* @return SOUKOSUU 総個数
	*/
	public String getSOUKOSUU() {
		return this.SOUKOSUU;
	}

   /**
	* TSUKAMATSUNYUUSAKI 仕入先を設定
	*
	* @param TSUKAMATSUNYUUSAKI 仕入先
	*/
	public void setTSUKAMATSUNYUUSAKI(String TSUKAMATSUNYUUSAKI) {
		this.TSUKAMATSUNYUUSAKI = TSUKAMATSUNYUUSAKI;
	}

   /**
	* TSUKAMATSUNYUUSAKI 仕入先を取得
	*
	* @return TSUKAMATSUNYUUSAKI 仕入先
	*/
	public String getTSUKAMATSUNYUUSAKI() {
		return this.TSUKAMATSUNYUUSAKI;
	}

   /**
	* KIBOUNOUKI 希望納期を設定
	*
	* @param KIBOUNOUKI 希望納期
	*/
	public void setKIBOUNOUKI(String KIBOUNOUKI) {
		this.KIBOUNOUKI = KIBOUNOUKI;
	}

   /**
	* KIBOUNOUKI 希望納期を取得
	*
	* @return KIBOUNOUKI 希望納期
	*/
	public String getKIBOUNOUKI() {
		return this.KIBOUNOUKI;
	}

   /**
	* TANTOU 担当を設定
	*
	* @param TANTOU 担当
	*/
	public void setTANTOU(String TANTOU) {
		this.TANTOU = TANTOU;
	}

   /**
	* TANTOU 担当を取得
	*
	* @return TANTOU 担当
	*/
	public String getTANTOU() {
		return this.TANTOU;
	}

   /**
	* TEHAISAKI 手配先を設定
	*
	* @param TEHAISAKI 手配先
	*/
	public void setTEHAISAKI(String TEHAISAKI) {
		this.TEHAISAKI = TEHAISAKI;
	}

   /**
	* TEHAISAKI 手配先を取得
	*
	* @return TEHAISAKI 手配先
	*/
	public String getTEHAISAKI() {
		return this.TEHAISAKI;
	}

   /**
	* KOUNYUUTANKA 購入単価を設定
	*
	* @param KOUNYUUTANKA 購入単価
	*/
	public void setKOUNYUUTANKA(String KOUNYUUTANKA) {
		this.KOUNYUUTANKA = KOUNYUUTANKA;
	}

   /**
	* KOUNYUUTANKA 購入単価を取得
	*
	* @return KOUNYUUTANKA 購入単価
	*/
	public String getKOUNYUUTANKA() {
		return this.KOUNYUUTANKA;
	}

   /**
	* KAHEI 貨幣を設定
	*
	* @param KAHEI 貨幣
	*/
	public void setKAHEI(String KAHEI) {
		this.KAHEI = KAHEI;
	}

   /**
	* KAHEI 貨幣を取得
	*
	* @return KAHEI 貨幣
	*/
	public String getKAHEI() {
		return this.KAHEI;
	}

   /**
	* TEHAIBI 購入日付を設定
	*
	* @param TEHAIBI 購入日付
	*/
	public void setTEHAIBI(String TEHAIBI) {
		this.TEHAIBI = TEHAIBI;
	}

   /**
	* TEHAIBI 購入日付を取得
	*
	* @return TEHAIBI 購入日付
	*/
	public String getTEHAIBI() {
		return this.TEHAIBI;
	}

   /**
	* NYUUKABI 入荷日付を設定
	*
	* @param NYUUKABI 入荷日付
	*/
	public void setNYUUKABI(String NYUUKABI) {
		this.NYUUKABI = NYUUKABI;
	}

   /**
	* NYUUKABI 入荷日付を取得
	*
	* @return NYUUKABI 入荷日付
	*/
	public String getNYUUKABI() {
		return this.NYUUKABI;
	}

   /**
	* SHOUKEI 小計を設定
	*
	* @param SHOUKEI 小計
	*/
	public void setSHOUKEI(String SHOUKEI) {
		this.SHOUKEI = SHOUKEI;
	}

   /**
	* SHOUKEI 小計を取得
	*
	* @return SHOUKEI 小計
	*/
	public String getSHOUKEI() {
		return this.SHOUKEI;
	}

   /**
	* KAKOTANKA 過去単価を設定
	*
	* @param KAKOTANKA 過去単価
	*/
	public void setKAKOTANKA(String KAKOTANKA) {
		this.KAKOTANKA = KAKOTANKA;
	}

   /**
	* KAKOTANKA 過去単価を取得
	*
	* @return KAKOTANKA 過去単価
	*/
	public String getKAKOTANKA() {
		return this.KAKOTANKA;
	}

   /**
	* CHUUBUNSHOMEISAINO1 注文書明細NOを設定
	*
	* @param CHUUBUNSHOMEISAINO1 注文書明細NO
	*/
	public void setCHUUBUNSHOMEISAINO1(String CHUUBUNSHOMEISAINO1) {
		this.CHUUBUNSHOMEISAINO1 = CHUUBUNSHOMEISAINO1;
	}

   /**
	* CHUUBUNSHOMEISAINO1 注文書明細NOを取得
	*
	* @return CHUUBUNSHOMEISAINO1 注文書明細NO
	*/
	public String getCHUUBUNSHOMEISAINO1() {
		return this.CHUUBUNSHOMEISAINO1;
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
	* KIBOUTANKA 希望単価を設定
	*
	* @param KIBOUTANKA 希望単価
	*/
	public void setKIBOUTANKA(String KIBOUTANKA) {
		this.KIBOUTANKA = KIBOUTANKA;
	}

   /**
	* KIBOUTANKA 希望単価を取得
	*
	* @return KIBOUTANKA 希望単価
	*/
	public String getKIBOUTANKA() {
		return this.KIBOUTANKA;
	}

   /**
	* NYUUKAYOTEIBI 入荷予定日を設定
	*
	* @param NYUUKAYOTEIBI 入荷予定日
	*/
	public void setNYUUKAYOTEIBI(String NYUUKAYOTEIBI) {
		this.NYUUKAYOTEIBI = NYUUKAYOTEIBI;
	}

   /**
	* NYUUKAYOTEIBI 入荷予定日を取得
	*
	* @return NYUUKAYOTEIBI 入荷予定日
	*/
	public String getNYUUKAYOTEIBI() {
		return this.NYUUKAYOTEIBI;
	}

   /**
	* HINBANNO 品番Nohideを設定
	*
	* @param HINBANNO 品番Nohide
	*/
	public void setHINBANNO(String HINBANNO) {
		this.HINBANNO = HINBANNO;
	}

   /**
	* HINBANNO 品番Nohideを取得
	*
	* @return HINBANNO 品番Nohide
	*/
	public String getHINBANNO() {
		return this.HINBANNO;
	}

   /**
	* KAKUTEIKUBUN2 確定区分を設定
	*
	* @param KAKUTEIKUBUN2 確定区分
	*/
	public void setKAKUTEIKUBUN2(String KAKUTEIKUBUN2) {
		this.KAKUTEIKUBUN2 = KAKUTEIKUBUN2;
	}

   /**
	* KAKUTEIKUBUN2 確定区分を取得
	*
	* @return KAKUTEIKUBUN2 確定区分
	*/
	public String getKAKUTEIKUBUN2() {
		return this.KAKUTEIKUBUN2;
	}

   /**
	* KOUJIKANRIBANGOU2 工事管理番号hideを設定
	*
	* @param KOUJIKANRIBANGOU2 工事管理番号hide
	*/
	public void setKOUJIKANRIBANGOU2(String KOUJIKANRIBANGOU2) {
		this.KOUJIKANRIBANGOU2 = KOUJIKANRIBANGOU2;
	}

   /**
	* KOUJIKANRIBANGOU2 工事管理番号hideを取得
	*
	* @return KOUJIKANRIBANGOU2 工事管理番号hide
	*/
	public String getKOUJIKANRIBANGOU2() {
		return this.KOUJIKANRIBANGOU2;
	}

   /**
	* SEISAKUHINKUBUN 区分を設定
	*
	* @param SEISAKUHINKUBUN 区分
	*/
	public void setSEISAKUHINKUBUN(String SEISAKUHINKUBUN) {
		this.SEISAKUHINKUBUN = SEISAKUHINKUBUN;
	}

   /**
	* SEISAKUHINKUBUN 区分を取得
	*
	* @return SEISAKUHINKUBUN 区分
	*/
	public String getSEISAKUHINKUBUN() {
		return this.SEISAKUHINKUBUN;
	}


}