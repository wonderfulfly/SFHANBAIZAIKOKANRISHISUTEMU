package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A003;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A003InsertSaveEntity
 * @version

 */
public class A003InsertSaveEntity {
   /**
	*	 BUMONID 部門ID
	*/
	private String BUMONID;
   /**
	*	 BUMONMEI 部門名
	*/
	private String BUMONMEI;
   /**
	* BUMONID 部門IDを設定
	*
	* @param BUMONID 部門ID
	*/
	public void setBUMONID(String BUMONID) {
		this.BUMONID = BUMONID;
	}

   /**
	* BUMONID 部門IDを取得
	*
	* @return BUMONID 部門ID
	*/
	public String getBUMONID() {
		return this.BUMONID;
	}

   /**
	* BUMONMEI 部門名を設定
	*
	* @param BUMONMEI 部門名
	*/
	public void setBUMONMEI(String BUMONMEI) {
		this.BUMONMEI = BUMONMEI;
	}

   /**
	* BUMONMEI 部門名を取得
	*
	* @return BUMONMEI 部門名
	*/
	public String getBUMONMEI() {
		return this.BUMONMEI;
	}


}