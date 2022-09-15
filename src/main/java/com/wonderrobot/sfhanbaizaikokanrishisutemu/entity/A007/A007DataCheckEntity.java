package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007;


import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A007.A007grdB8Entity;

/**
 * @project
 *     
 * @comment
 *     table id: A007DataCheckEntity
 * @version

 */
public class A007DataCheckEntity {
   /**
	*	 CHUUBUNSHONO 注文書No
	*/
	private String CHUUBUNSHONO;
   /**
	*	 BUHINMEI 部品名
	*/
	private String BUHINMEI;
   /**
	*	 ZAIKONO 在庫NO
	*/
	private String ZAIKONO;
   /**
	*	 SHANAIKOUJIBANGOU 社内工事番号
	*/
	private String SHANAIKOUJIBANGOU;
   /**
	*	 Grid19 grdB8
	*/
	private List<A007grdB8Entity> Grid19;
   /**
	* CHUUBUNSHONO 注文書Noを設定
	*
	* @param CHUUBUNSHONO 注文書No
	*/
	public void setCHUUBUNSHONO(String CHUUBUNSHONO) {
		this.CHUUBUNSHONO = CHUUBUNSHONO;
	}

   /**
	* CHUUBUNSHONO 注文書Noを取得
	*
	* @return CHUUBUNSHONO 注文書No
	*/
	public String getCHUUBUNSHONO() {
		return this.CHUUBUNSHONO;
	}

   /**
	* BUHINMEI 部品名を設定
	*
	* @param BUHINMEI 部品名
	*/
	public void setBUHINMEI(String BUHINMEI) {
		this.BUHINMEI = BUHINMEI;
	}

   /**
	* BUHINMEI 部品名を取得
	*
	* @return BUHINMEI 部品名
	*/
	public String getBUHINMEI() {
		return this.BUHINMEI;
	}

   /**
	* ZAIKONO 在庫NOを設定
	*
	* @param ZAIKONO 在庫NO
	*/
	public void setZAIKONO(String ZAIKONO) {
		this.ZAIKONO = ZAIKONO;
	}

   /**
	* ZAIKONO 在庫NOを取得
	*
	* @return ZAIKONO 在庫NO
	*/
	public String getZAIKONO() {
		return this.ZAIKONO;
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
	* Grid19 grdB8を設定
	*
	* @param Grid19 grdB8
	*/
	public void setGrid19(List<A007grdB8Entity> Grid19) {
		this.Grid19 = Grid19;
	}

   /**
	* Grid19 grdB8を取得
	*
	* @return Grid19 grdB8
	*/
	public List<A007grdB8Entity> getGrid19() {
		return this.Grid19;
	}


}