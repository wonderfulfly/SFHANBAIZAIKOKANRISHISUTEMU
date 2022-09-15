package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006;


import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A006.A006grdB6Entity;

/**
 * @project
 *     
 * @comment
 *     table id: A006DataCheckEntity
 * @version

 */
public class A006DataCheckEntity {
   /**
	*	 SHOUHINMEI 商品名
	*/
	private String SHOUHINMEI;
   /**
	*	 KAISHAMEI 会社名
	*/
	private String KAISHAMEI;
   /**
	*	 Grid19 grdB6
	*/
	private List<A006grdB6Entity> Grid19;
   /**
	* SHOUHINMEI 商品名を設定
	*
	* @param SHOUHINMEI 商品名
	*/
	public void setSHOUHINMEI(String SHOUHINMEI) {
		this.SHOUHINMEI = SHOUHINMEI;
	}

   /**
	* SHOUHINMEI 商品名を取得
	*
	* @return SHOUHINMEI 商品名
	*/
	public String getSHOUHINMEI() {
		return this.SHOUHINMEI;
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

   /**
	* Grid19 grdB6を設定
	*
	* @param Grid19 grdB6
	*/
	public void setGrid19(List<A006grdB6Entity> Grid19) {
		this.Grid19 = Grid19;
	}

   /**
	* Grid19 grdB6を取得
	*
	* @return Grid19 grdB6
	*/
	public List<A006grdB6Entity> getGrid19() {
		return this.Grid19;
	}


}