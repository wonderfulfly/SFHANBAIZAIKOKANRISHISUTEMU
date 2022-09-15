package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A011KYAKUSAKIMEISHOUKAISYAEntity
 * @version

 */
public class A011KYAKUSAKIMEISHOUKAISYAEntity {
   /**
	*	 KAISHAID 会社ID
	*/
	private String KAISHAID;
   /**
	*	 KAISHAMEI 会社名
	*/
	private String KAISHAMEI;
   /**
	* KAISHAID 会社IDを設定
	*
	* @param KAISHAID 会社ID
	*/
	public void setKAISHAID(String KAISHAID) {
		this.KAISHAID = KAISHAID;
	}

   /**
	* KAISHAID 会社IDを取得
	*
	* @return KAISHAID 会社ID
	*/
	public String getKAISHAID() {
		return this.KAISHAID;
	}

   /**
	* KAISHAMEI 会社名を設定
	*
	* @param KAISHAMEI 会社名
	*/
	public void setKAISHAMEI(String KAISHAMEI) {
		this.KAISHAMEI = KAISHAMEI;
	}

   /**
	* KAISHAMEI 会社名を取得
	*
	* @return KAISHAMEI 会社名
	*/
	public String getKAISHAMEI() {
		return this.KAISHAMEI;
	}


}