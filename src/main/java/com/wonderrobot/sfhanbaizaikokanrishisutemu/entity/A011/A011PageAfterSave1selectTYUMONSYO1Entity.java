package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011;


import com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A011.A011TYUMONSYOMEISAIEntity;
import java.util.List;

/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A011PageAfterSave1selectTYUMONSYO1Entity
 * @version

 */
public class A011PageAfterSave1selectTYUMONSYO1Entity {
   /**
	*	 CHUUBUNSHONO 注文書NO
	*/
	private String CHUUBUNSHONO;
   /**
	*	 SHANAIKOUJIBANGOU 社内工事番号
	*/
	private String SHANAIKOUJIBANGOU;
   /**
	*	 CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	private String CHUUBUNSHOMEISAINO;
   /**
	*	 A011TYUMONSYOMEISAIEntityList null
	*/
	private List<A011TYUMONSYOMEISAIEntity> A011TYUMONSYOMEISAIEntityList;
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
	* CHUUBUNSHOMEISAINO 注文書明細NOを設定
	*
	* @param CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	public void setCHUUBUNSHOMEISAINO(String CHUUBUNSHOMEISAINO) {
		this.CHUUBUNSHOMEISAINO = CHUUBUNSHOMEISAINO;
	}

   /**
	* CHUUBUNSHOMEISAINO 注文書明細NOを取得
	*
	* @return CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	public String getCHUUBUNSHOMEISAINO() {
		return this.CHUUBUNSHOMEISAINO;
	}

   /**
	* A011TYUMONSYOMEISAIEntityList nullを設定
	*
	* @param A011TYUMONSYOMEISAIEntityList null
	*/
	public void setA011TYUMONSYOMEISAIEntityList(List<A011TYUMONSYOMEISAIEntity> A011TYUMONSYOMEISAIEntityList) {
		this.A011TYUMONSYOMEISAIEntityList = A011TYUMONSYOMEISAIEntityList;
	}

   /**
	* A011TYUMONSYOMEISAIEntityList nullを取得
	*
	* @return A011TYUMONSYOMEISAIEntityList null
	*/
	public List<A011TYUMONSYOMEISAIEntity> getA011TYUMONSYOMEISAIEntityList() {
		return this.A011TYUMONSYOMEISAIEntityList;
	}


}