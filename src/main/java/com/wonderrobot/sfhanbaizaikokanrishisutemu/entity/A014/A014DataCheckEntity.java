package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014;


import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014.A014grdC6Entity;

/**
 * @project
 *     
 * @comment
 *     table id: A014DataCheckEntity
 * @version

 */
public class A014DataCheckEntity {
   /**
	*	 BUMONID 部門ID
	*/
	private String BUMONID;
   /**
	*	 BUMONMEI 部門名
	*/
	private String BUMONMEI;
   /**
	*	 Grid13 grdC6
	*/
	private List<A014grdC6Entity> Grid13;
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

   /**
	* Grid13 grdC6を設定
	*
	* @param Grid13 grdC6
	*/
	public void setGrid13(List<A014grdC6Entity> Grid13) {
		this.Grid13 = Grid13;
	}

   /**
	* Grid13 grdC6を取得
	*
	* @return Grid13 grdC6
	*/
	public List<A014grdC6Entity> getGrid13() {
		return this.Grid13;
	}


}