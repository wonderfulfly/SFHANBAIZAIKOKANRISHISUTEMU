package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008;


import java.util.List;
import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008.A008grdB8Entity;

/**
 * @project
 *     
 * @comment
 *     table id: A008DataCheckEntity
 * @version

 */
public class A008DataCheckEntity {
   /**
	*	 KYAKUSAKI 客先
	*/
	private String KYAKUSAKI;
   /**
	*	 CHUUMONHIDZUKE 注文日付
	*/
	private String CHUUMONHIDZUKE;
   /**
	*	 CHUUBUNSHONO 注文書NO
	*/
	private String CHUUBUNSHONO;
   /**
	*	 MINYUUKIN 未入金
	*/
	private String MINYUUKIN;
   /**
	*	 Grid23 grdB8
	*/
	private List<A008grdB8Entity> Grid23;
   /**
	* KYAKUSAKI 客先を設定
	*
	* @param KYAKUSAKI 客先
	*/
	public void setKYAKUSAKI(String KYAKUSAKI) {
		this.KYAKUSAKI = KYAKUSAKI;
	}

   /**
	* KYAKUSAKI 客先を取得
	*
	* @return KYAKUSAKI 客先
	*/
	public String getKYAKUSAKI() {
		return this.KYAKUSAKI;
	}

   /**
	* CHUUMONHIDZUKE 注文日付を設定
	*
	* @param CHUUMONHIDZUKE 注文日付
	*/
	public void setCHUUMONHIDZUKE(String CHUUMONHIDZUKE) {
		this.CHUUMONHIDZUKE = CHUUMONHIDZUKE;
	}

   /**
	* CHUUMONHIDZUKE 注文日付を取得
	*
	* @return CHUUMONHIDZUKE 注文日付
	*/
	public String getCHUUMONHIDZUKE() {
		return this.CHUUMONHIDZUKE;
	}

   /**
	* CHUUBUNSHONO 注文書NOを設定
	*
	* @param CHUUBUNSHONO 注文書NO
	*/
	public void setCHUUBUNSHONO(String CHUUBUNSHONO) {
		this.CHUUBUNSHONO = CHUUBUNSHONO;
	}

   /**
	* CHUUBUNSHONO 注文書NOを取得
	*
	* @return CHUUBUNSHONO 注文書NO
	*/
	public String getCHUUBUNSHONO() {
		return this.CHUUBUNSHONO;
	}

   /**
	* MINYUUKIN 未入金を設定
	*
	* @param MINYUUKIN 未入金
	*/
	public void setMINYUUKIN(String MINYUUKIN) {
		this.MINYUUKIN = MINYUUKIN;
	}

   /**
	* MINYUUKIN 未入金を取得
	*
	* @return MINYUUKIN 未入金
	*/
	public String getMINYUUKIN() {
		return this.MINYUUKIN;
	}

   /**
	* Grid23 grdB8を設定
	*
	* @param Grid23 grdB8
	*/
	public void setGrid23(List<A008grdB8Entity> Grid23) {
		this.Grid23 = Grid23;
	}

   /**
	* Grid23 grdB8を取得
	*
	* @return Grid23 grdB8
	*/
	public List<A008grdB8Entity> getGrid23() {
		return this.Grid23;
	}


}