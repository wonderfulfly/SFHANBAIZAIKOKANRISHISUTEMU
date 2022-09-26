package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011;


import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;
import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011grdB18Entity;

/**
 * @project
 *     
 * @comment
 *     table id: A011DataCheckEntity
 * @version

 */
public class A011DataCheckEntity {
   /**
	*	 SHUTSUNYUUKOFURAGU1 出入庫フラグ
	*/
	private String SHUTSUNYUUKOFURAGU1;
   /**
	*	 CHUUMONHIDZUKE1 注文日付
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00013CHUUMONHIDZUKE19")
	private String CHUUMONHIDZUKE1;
   /**
	*	 CHUUBUNSHONO1 注文書NO
	*/

	@NotBlank(message = "validate.msg_P00013CHUUBUNSHONO1")
	private String CHUUBUNSHONO1;
   /**
	*	 SHUKKANO1 出荷NO
	*/
	private String SHUKKANO1;
   /**
	*	 MITSUMORISHONO1 見積書NO
	*/
	private String MITSUMORISHONO1;
   /**
	*	 KYAKUSAKIMEISHOU 客先名称
	*/
	private String KYAKUSAKIMEISHOU;
   /**
	*	 KYAKUSAKITANTOU1 客先担当
	*/
	private String KYAKUSAKITANTOU1;
   /**
	*	 ADORESU1 アドレス
	*/
	private String ADORESU1;
   /**
	*	 DENWABANGOU1 電話番号
	*/
	private String DENWABANGOU1;
   /**
	*	 RESHIITONO レシートNO
	*/
	private String RESHIITONO;
   /**
	*	 SHANAIKOUJIBANGOU1 社内工事番号
	*/

	@NotBlank(message = "validate.msg_P00013SHANAIKOUJIBANGOU1")
	private String SHANAIKOUJIBANGOU1;
   /**
	*	 HINMEI1 品名
	*/
	private String HINMEI1;
   /**
	*	 TANTOUSHA 担当者
	*/
	private String TANTOUSHA;
   /**
	*	 KEIYAKUSAKI1 契約先
	*/
	private String KEIYAKUSAKI1;
   /**
	*	 NOUKIYOTEIBI1 納期予定日
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00013NOUKIYOTEIBI19")
	private String NOUKIYOTEIBI1;
   /**
	*	 NOUNYUUBI1 納入日
	*/

	@Pattern(regexp = "^\\s*$|(^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]((((0?[13578])|(1[02]))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]((0?[1-9])|(1[0-9])|(2[0-8])))))))?",message = "validate.msg_P00013NOUNYUUBI19")
	private String NOUNYUUBI1;
   /**
	*	 JPYGOUKEI JPY合計
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00013JPYGOUKEI19")
	private String JPYGOUKEI;
   /**
	*	 RMBGOUKEI RMB合計
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00013RMBGOUKEI19")
	private String RMBGOUKEI;
   /**
	*	 USDGOUKEI USD合計
	*/

	@Pattern(regexp = "^\\s*$|(^\\d+(\\.\\d+)?$)?",message = "validate.msg_P00013USDGOUKEI19")
	private String USDGOUKEI;
   /**
	*	 Grid95 grdB18
	*/
	private List<A011grdB18Entity> Grid95;
   /**
	*	 JPYGOUKEI1 JPY合計1
	*/
	private String JPYGOUKEI1;
   /**
	*	 RMBGOUKEI1 RMB合計1
	*/
	private String RMBGOUKEI1;
   /**
	*	 USDGOUKEI1 USD合計1
	*/
	private String USDGOUKEI1;
   /**
	* SHUTSUNYUUKOFURAGU1 出入庫フラグを設定
	*
	* @param SHUTSUNYUUKOFURAGU1 出入庫フラグ
	*/
	public void setSHUTSUNYUUKOFURAGU1(String SHUTSUNYUUKOFURAGU1) {
		this.SHUTSUNYUUKOFURAGU1 = SHUTSUNYUUKOFURAGU1;
	}

   /**
	* SHUTSUNYUUKOFURAGU1 出入庫フラグを取得
	*
	* @return SHUTSUNYUUKOFURAGU1 出入庫フラグ
	*/
	public String getSHUTSUNYUUKOFURAGU1() {
		return this.SHUTSUNYUUKOFURAGU1;
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
	* SHUKKANO1 出荷NOを設定
	*
	* @param SHUKKANO1 出荷NO
	*/
	public void setSHUKKANO1(String SHUKKANO1) {
		this.SHUKKANO1 = SHUKKANO1;
	}

   /**
	* SHUKKANO1 出荷NOを取得
	*
	* @return SHUKKANO1 出荷NO
	*/
	public String getSHUKKANO1() {
		return this.SHUKKANO1;
	}

   /**
	* MITSUMORISHONO1 見積書NOを設定
	*
	* @param MITSUMORISHONO1 見積書NO
	*/
	public void setMITSUMORISHONO1(String MITSUMORISHONO1) {
		this.MITSUMORISHONO1 = MITSUMORISHONO1;
	}

   /**
	* MITSUMORISHONO1 見積書NOを取得
	*
	* @return MITSUMORISHONO1 見積書NO
	*/
	public String getMITSUMORISHONO1() {
		return this.MITSUMORISHONO1;
	}

   /**
	* KYAKUSAKIMEISHOU 客先名称を設定
	*
	* @param KYAKUSAKIMEISHOU 客先名称
	*/
	public void setKYAKUSAKIMEISHOU(String KYAKUSAKIMEISHOU) {
		this.KYAKUSAKIMEISHOU = KYAKUSAKIMEISHOU;
	}

   /**
	* KYAKUSAKIMEISHOU 客先名称を取得
	*
	* @return KYAKUSAKIMEISHOU 客先名称
	*/
	public String getKYAKUSAKIMEISHOU() {
		return this.KYAKUSAKIMEISHOU;
	}

   /**
	* KYAKUSAKITANTOU1 客先担当を設定
	*
	* @param KYAKUSAKITANTOU1 客先担当
	*/
	public void setKYAKUSAKITANTOU1(String KYAKUSAKITANTOU1) {
		this.KYAKUSAKITANTOU1 = KYAKUSAKITANTOU1;
	}

   /**
	* KYAKUSAKITANTOU1 客先担当を取得
	*
	* @return KYAKUSAKITANTOU1 客先担当
	*/
	public String getKYAKUSAKITANTOU1() {
		return this.KYAKUSAKITANTOU1;
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
	* SHANAIKOUJIBANGOU1 社内工事番号を設定
	*
	* @param SHANAIKOUJIBANGOU1 社内工事番号
	*/
	public void setSHANAIKOUJIBANGOU1(String SHANAIKOUJIBANGOU1) {
		this.SHANAIKOUJIBANGOU1 = SHANAIKOUJIBANGOU1;
	}

   /**
	* SHANAIKOUJIBANGOU1 社内工事番号を取得
	*
	* @return SHANAIKOUJIBANGOU1 社内工事番号
	*/
	public String getSHANAIKOUJIBANGOU1() {
		return this.SHANAIKOUJIBANGOU1;
	}

   /**
	* HINMEI1 品名を設定
	*
	* @param HINMEI1 品名
	*/
	public void setHINMEI1(String HINMEI1) {
		this.HINMEI1 = HINMEI1;
	}

   /**
	* HINMEI1 品名を取得
	*
	* @return HINMEI1 品名
	*/
	public String getHINMEI1() {
		return this.HINMEI1;
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
	* KEIYAKUSAKI1 契約先を設定
	*
	* @param KEIYAKUSAKI1 契約先
	*/
	public void setKEIYAKUSAKI1(String KEIYAKUSAKI1) {
		this.KEIYAKUSAKI1 = KEIYAKUSAKI1;
	}

   /**
	* KEIYAKUSAKI1 契約先を取得
	*
	* @return KEIYAKUSAKI1 契約先
	*/
	public String getKEIYAKUSAKI1() {
		return this.KEIYAKUSAKI1;
	}

   /**
	* NOUKIYOTEIBI1 納期予定日を設定
	*
	* @param NOUKIYOTEIBI1 納期予定日
	*/
	public void setNOUKIYOTEIBI1(String NOUKIYOTEIBI1) {
		this.NOUKIYOTEIBI1 = NOUKIYOTEIBI1;
	}

   /**
	* NOUKIYOTEIBI1 納期予定日を取得
	*
	* @return NOUKIYOTEIBI1 納期予定日
	*/
	public String getNOUKIYOTEIBI1() {
		return this.NOUKIYOTEIBI1;
	}

   /**
	* NOUNYUUBI1 納入日を設定
	*
	* @param NOUNYUUBI1 納入日
	*/
	public void setNOUNYUUBI1(String NOUNYUUBI1) {
		this.NOUNYUUBI1 = NOUNYUUBI1;
	}

   /**
	* NOUNYUUBI1 納入日を取得
	*
	* @return NOUNYUUBI1 納入日
	*/
	public String getNOUNYUUBI1() {
		return this.NOUNYUUBI1;
	}

   /**
	* JPYGOUKEI JPY合計を設定
	*
	* @param JPYGOUKEI JPY合計
	*/
	public void setJPYGOUKEI(String JPYGOUKEI) {
		this.JPYGOUKEI = JPYGOUKEI;
	}

   /**
	* JPYGOUKEI JPY合計を取得
	*
	* @return JPYGOUKEI JPY合計
	*/
	public String getJPYGOUKEI() {
		return this.JPYGOUKEI;
	}

   /**
	* RMBGOUKEI RMB合計を設定
	*
	* @param RMBGOUKEI RMB合計
	*/
	public void setRMBGOUKEI(String RMBGOUKEI) {
		this.RMBGOUKEI = RMBGOUKEI;
	}

   /**
	* RMBGOUKEI RMB合計を取得
	*
	* @return RMBGOUKEI RMB合計
	*/
	public String getRMBGOUKEI() {
		return this.RMBGOUKEI;
	}

   /**
	* USDGOUKEI USD合計を設定
	*
	* @param USDGOUKEI USD合計
	*/
	public void setUSDGOUKEI(String USDGOUKEI) {
		this.USDGOUKEI = USDGOUKEI;
	}

   /**
	* USDGOUKEI USD合計を取得
	*
	* @return USDGOUKEI USD合計
	*/
	public String getUSDGOUKEI() {
		return this.USDGOUKEI;
	}

   /**
	* Grid95 grdB18を設定
	*
	* @param Grid95 grdB18
	*/
	public void setGrid95(List<A011grdB18Entity> Grid95) {
		this.Grid95 = Grid95;
	}

   /**
	* Grid95 grdB18を取得
	*
	* @return Grid95 grdB18
	*/
	public List<A011grdB18Entity> getGrid95() {
		return this.Grid95;
	}

   /**
	* JPYGOUKEI1 JPY合計1を設定
	*
	* @param JPYGOUKEI1 JPY合計1
	*/
	public void setJPYGOUKEI1(String JPYGOUKEI1) {
		this.JPYGOUKEI1 = JPYGOUKEI1;
	}

   /**
	* JPYGOUKEI1 JPY合計1を取得
	*
	* @return JPYGOUKEI1 JPY合計1
	*/
	public String getJPYGOUKEI1() {
		return this.JPYGOUKEI1;
	}

   /**
	* RMBGOUKEI1 RMB合計1を設定
	*
	* @param RMBGOUKEI1 RMB合計1
	*/
	public void setRMBGOUKEI1(String RMBGOUKEI1) {
		this.RMBGOUKEI1 = RMBGOUKEI1;
	}

   /**
	* RMBGOUKEI1 RMB合計1を取得
	*
	* @return RMBGOUKEI1 RMB合計1
	*/
	public String getRMBGOUKEI1() {
		return this.RMBGOUKEI1;
	}

   /**
	* USDGOUKEI1 USD合計1を設定
	*
	* @param USDGOUKEI1 USD合計1
	*/
	public void setUSDGOUKEI1(String USDGOUKEI1) {
		this.USDGOUKEI1 = USDGOUKEI1;
	}

   /**
	* USDGOUKEI1 USD合計1を取得
	*
	* @return USDGOUKEI1 USD合計1
	*/
	public String getUSDGOUKEI1() {
		return this.USDGOUKEI1;
	}


}