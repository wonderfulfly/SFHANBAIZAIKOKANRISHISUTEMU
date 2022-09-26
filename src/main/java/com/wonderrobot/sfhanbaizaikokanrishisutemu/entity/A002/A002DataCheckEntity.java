package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002;


import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A002.A002grdB6Entity;

/**
 * @project
 *     
 * @comment
 *     table id: A002DataCheckEntity
 * @version

 */
public class A002DataCheckEntity {
   /**
	*	 SHAINID 社員ID
	*/
	private String SHAINID;
   /**
	*	 SHAINMEI 社員名
	*/
	private String SHAINMEI;
   /**
	*	 Grid13 grdB6
	*/
	private List<A002grdB6Entity> Grid13;
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

   /**
	* Grid13 grdB6を設定
	*
	* @param Grid13 grdB6
	*/
	public void setGrid13(List<A002grdB6Entity> Grid13) {
		this.Grid13 = Grid13;
	}

   /**
	* Grid13 grdB6を取得
	*
	* @return Grid13 grdB6
	*/
	public List<A002grdB6Entity> getGrid13() {
		return this.Grid13;
	}


}