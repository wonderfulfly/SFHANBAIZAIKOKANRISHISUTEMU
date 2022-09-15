package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015;


import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A015.A015grdB6Entity;

/**
 * @project
 *     
 * @comment
 *     table id: A015DataCheckEntity
 * @version

 */
public class A015DataCheckEntity {
   /**
	*	 KAISHAID 会社ID
	*/
	private String KAISHAID;
   /**
	*	 KAISHAMEI 会社名
	*/
	private String KAISHAMEI;
   /**
	*	 Grid13 grdB6
	*/
	private List<A015grdB6Entity> Grid13;
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

   /**
	* Grid13 grdB6を設定
	*
	* @param Grid13 grdB6
	*/
	public void setGrid13(List<A015grdB6Entity> Grid13) {
		this.Grid13 = Grid13;
	}

   /**
	* Grid13 grdB6を取得
	*
	* @return Grid13 grdB6
	*/
	public List<A015grdB6Entity> getGrid13() {
		return this.Grid13;
	}


}