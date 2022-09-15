package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A013TANTOUSHA1SYAINEntity
 * @version

 */
public class A013TANTOUSHA1SYAINEntity {
   /**
	*	 SHAINID 社員ID
	*/
	private String SHAINID;
   /**
	*	 SHAINMEI 社員名
	*/
	private String SHAINMEI;
   /**
	* SHAINID 社員IDを設定
	*
	* @param SHAINID 社員ID
	*/
	public void setSHAINID(String SHAINID) {
		this.SHAINID = SHAINID;
	}

   /**
	* SHAINID 社員IDを取得
	*
	* @return SHAINID 社員ID
	*/
	public String getSHAINID() {
		return this.SHAINID;
	}

   /**
	* SHAINMEI 社員名を設定
	*
	* @param SHAINMEI 社員名
	*/
	public void setSHAINMEI(String SHAINMEI) {
		this.SHAINMEI = SHAINMEI;
	}

   /**
	* SHAINMEI 社員名を取得
	*
	* @return SHAINMEI 社員名
	*/
	public String getSHAINMEI() {
		return this.SHAINMEI;
	}


}