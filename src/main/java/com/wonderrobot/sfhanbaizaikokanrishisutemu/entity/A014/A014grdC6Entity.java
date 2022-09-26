package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A014;


import org.hibernate.validator.constraints.NotBlank;

/**
 * @project
 *     
 * @comment
 *     table id: A014grdC6Entity
 * @version

 */
public class A014grdC6Entity {
   /**
	*	 BUMONMEI1 部門名
	*/

	@NotBlank(message = "validate.msg_P00004BUMONMEI1")
	private String BUMONMEI1;
   /**
	*	 BUMONID1 部門ID
	*/

	@NotBlank(message = "validate.msg_P00004BUMONID1")
	private String BUMONID1;
   /**
	* BUMONMEI1 部門名を設定
	*
	* @param BUMONMEI1 部門名
	*/
	public void setBUMONMEI1(String BUMONMEI1) {
		this.BUMONMEI1 = BUMONMEI1;
	}

   /**
	* BUMONMEI1 部門名を取得
	*
	* @return BUMONMEI1 部門名
	*/
	public String getBUMONMEI1() {
		return this.BUMONMEI1;
	}

   /**
	* BUMONID1 部門IDを設定
	*
	* @param BUMONID1 部門ID
	*/
	public void setBUMONID1(String BUMONID1) {
		this.BUMONID1 = BUMONID1;
	}

   /**
	* BUMONID1 部門IDを取得
	*
	* @return BUMONID1 部門ID
	*/
	public String getBUMONID1() {
		return this.BUMONID1;
	}


}