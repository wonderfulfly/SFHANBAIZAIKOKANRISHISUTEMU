package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A013;



/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *     table id: A013BUHINSYOUSAIEntity
 * @version

 */
public class A013BUHINSYOUSAIEntity {
   /**
	*	 CHUUBUNSHONO 注文書NO
	*/
	private String CHUUBUNSHONO;
   /**
	*	 CHUUBUNSHOMEISAINO 注文書明細NO
	*/
	private String CHUUBUNSHOMEISAINO;
   /**
	*	 HINBANNO 品番NO
	*/
	private String HINBANNO;
   /**
	*	 KOUJIKANRIBANGOU 工事管理番号
	*/
	private String KOUJIKANRIBANGOU;
   /**
	*	 HINMEI 品名
	*/
	private String HINMEI;
   /**
	*	 KOSUU 個数
	*/
	private int KOSUU;
   /**
	*	 SOUKOSUU 総個数
	*/
	private int SOUKOSUU;
   /**
	*	 ZAISHITSU 材質
	*/
	private String ZAISHITSU;
   /**
	*	 BIKOU 備考
	*/
	private String BIKOU;
   /**
	*	 TSUKAMATSUNYUUSAKI 仕入先
	*/
	private String TSUKAMATSUNYUUSAKI;
   /**
	*	 SEISAKUHINKUBUN 製作品区分
	*/
	private String SEISAKUHINKUBUN;
   /**
	*	 KIBOUTANKA 希望単価
	*/
	private double KIBOUTANKA;
   /**
	*	 KIBOUNOUKI 希望納期
	*/
	private String KIBOUNOUKI;
   /**
	*	 TANTOU 担当
	*/
	private String TANTOU;
   /**
	*	 TEHAISAKI 手配先
	*/
	private String TEHAISAKI;
   /**
	*	 KOUNYUUTANKA 購入単価
	*/
	private double KOUNYUUTANKA;
   /**
	*	 TEHAIBI 手配日
	*/
	private String TEHAIBI;
   /**
	*	 NYUUKAYOTEIBI 入荷予定日
	*/
	private String NYUUKAYOTEIBI;
   /**
	*	 NYUUKABI 入荷日
	*/
	private String NYUUKABI;
   /**
	*	 SHOUKEI 小計
	*/
	private double SHOUKEI;
   /**
	*	 NYUUKOFURAGU 入庫フラグ
	*/
	private String NYUUKOFURAGU;
   /**
	*	 NYUUKOBANGOU 入庫番号
	*/
	private String NYUUKOBANGOU;
   /**
	*	 KAHEI 貨幣
	*/
	private String KAHEI;
   /**
	*	 KAKOTANKA 過去単価
	*/
	private String KAKOTANKA;
   /**
	*	 KAKUTEIKUBUN 確定区分
	*/
	private String KAKUTEIKUBUN;
   /**
	*	 TOUROKUSHAID 登録者ID
	*/
	private String TOUROKUSHAID;
   /**
	*	 BIKOU1 備考1
	*/
	private String BIKOU1;
   /**
	*	 HITSUYOU 必要
	*/
	private String HITSUYOU;
   /**
	*	 TEHAI 手配
	*/
	private String TEHAI;
   /**
	*	 KANRYOU 完了
	*/
	private String KANRYOU;
   /**
	*	 SOUKOSUU1 総個数1
	*/
	private int SOUKOSUU1;
   /**
	*	 HINBANNO1 品番NO1
	*/
	private String HINBANNO1;
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
	* HINBANNO 品番NOを設定
	*
	* @param HINBANNO 品番NO
	*/
	public void setHINBANNO(String HINBANNO) {
		this.HINBANNO = HINBANNO;
	}

   /**
	* HINBANNO 品番NOを取得
	*
	* @return HINBANNO 品番NO
	*/
	public String getHINBANNO() {
		return this.HINBANNO;
	}

   /**
	* KOUJIKANRIBANGOU 工事管理番号を設定
	*
	* @param KOUJIKANRIBANGOU 工事管理番号
	*/
	public void setKOUJIKANRIBANGOU(String KOUJIKANRIBANGOU) {
		this.KOUJIKANRIBANGOU = KOUJIKANRIBANGOU;
	}

   /**
	* KOUJIKANRIBANGOU 工事管理番号を取得
	*
	* @return KOUJIKANRIBANGOU 工事管理番号
	*/
	public String getKOUJIKANRIBANGOU() {
		return this.KOUJIKANRIBANGOU;
	}

   /**
	* HINMEI 品名を設定
	*
	* @param HINMEI 品名
	*/
	public void setHINMEI(String HINMEI) {
		this.HINMEI = HINMEI;
	}

   /**
	* HINMEI 品名を取得
	*
	* @return HINMEI 品名
	*/
	public String getHINMEI() {
		return this.HINMEI;
	}

   /**
	* KOSUU 個数を設定
	*
	* @param KOSUU 個数
	*/
	public void setKOSUU(int KOSUU) {
		this.KOSUU = KOSUU;
	}

   /**
	* KOSUU 個数を取得
	*
	* @return KOSUU 個数
	*/
	public int getKOSUU() {
		return this.KOSUU;
	}

   /**
	* SOUKOSUU 総個数を設定
	*
	* @param SOUKOSUU 総個数
	*/
	public void setSOUKOSUU(int SOUKOSUU) {
		this.SOUKOSUU = SOUKOSUU;
	}

   /**
	* SOUKOSUU 総個数を取得
	*
	* @return SOUKOSUU 総個数
	*/
	public int getSOUKOSUU() {
		return this.SOUKOSUU;
	}

   /**
	* ZAISHITSU 材質を設定
	*
	* @param ZAISHITSU 材質
	*/
	public void setZAISHITSU(String ZAISHITSU) {
		this.ZAISHITSU = ZAISHITSU;
	}

   /**
	* ZAISHITSU 材質を取得
	*
	* @return ZAISHITSU 材質
	*/
	public String getZAISHITSU() {
		return this.ZAISHITSU;
	}

   /**
	* BIKOU 備考を設定
	*
	* @param BIKOU 備考
	*/
	public void setBIKOU(String BIKOU) {
		this.BIKOU = BIKOU;
	}

   /**
	* BIKOU 備考を取得
	*
	* @return BIKOU 備考
	*/
	public String getBIKOU() {
		return this.BIKOU;
	}

   /**
	* TSUKAMATSUNYUUSAKI 仕入先を設定
	*
	* @param TSUKAMATSUNYUUSAKI 仕入先
	*/
	public void setTSUKAMATSUNYUUSAKI(String TSUKAMATSUNYUUSAKI) {
		this.TSUKAMATSUNYUUSAKI = TSUKAMATSUNYUUSAKI;
	}

   /**
	* TSUKAMATSUNYUUSAKI 仕入先を取得
	*
	* @return TSUKAMATSUNYUUSAKI 仕入先
	*/
	public String getTSUKAMATSUNYUUSAKI() {
		return this.TSUKAMATSUNYUUSAKI;
	}

   /**
	* SEISAKUHINKUBUN 製作品区分を設定
	*
	* @param SEISAKUHINKUBUN 製作品区分
	*/
	public void setSEISAKUHINKUBUN(String SEISAKUHINKUBUN) {
		this.SEISAKUHINKUBUN = SEISAKUHINKUBUN;
	}

   /**
	* SEISAKUHINKUBUN 製作品区分を取得
	*
	* @return SEISAKUHINKUBUN 製作品区分
	*/
	public String getSEISAKUHINKUBUN() {
		return this.SEISAKUHINKUBUN;
	}

   /**
	* KIBOUTANKA 希望単価を設定
	*
	* @param KIBOUTANKA 希望単価
	*/
	public void setKIBOUTANKA(double KIBOUTANKA) {
		this.KIBOUTANKA = KIBOUTANKA;
	}

   /**
	* KIBOUTANKA 希望単価を取得
	*
	* @return KIBOUTANKA 希望単価
	*/
	public double getKIBOUTANKA() {
		return this.KIBOUTANKA;
	}

   /**
	* KIBOUNOUKI 希望納期を設定
	*
	* @param KIBOUNOUKI 希望納期
	*/
	public void setKIBOUNOUKI(String KIBOUNOUKI) {
		this.KIBOUNOUKI = KIBOUNOUKI;
	}

   /**
	* KIBOUNOUKI 希望納期を取得
	*
	* @return KIBOUNOUKI 希望納期
	*/
	public String getKIBOUNOUKI() {
		return this.KIBOUNOUKI;
	}

   /**
	* TANTOU 担当を設定
	*
	* @param TANTOU 担当
	*/
	public void setTANTOU(String TANTOU) {
		this.TANTOU = TANTOU;
	}

   /**
	* TANTOU 担当を取得
	*
	* @return TANTOU 担当
	*/
	public String getTANTOU() {
		return this.TANTOU;
	}

   /**
	* TEHAISAKI 手配先を設定
	*
	* @param TEHAISAKI 手配先
	*/
	public void setTEHAISAKI(String TEHAISAKI) {
		this.TEHAISAKI = TEHAISAKI;
	}

   /**
	* TEHAISAKI 手配先を取得
	*
	* @return TEHAISAKI 手配先
	*/
	public String getTEHAISAKI() {
		return this.TEHAISAKI;
	}

   /**
	* KOUNYUUTANKA 購入単価を設定
	*
	* @param KOUNYUUTANKA 購入単価
	*/
	public void setKOUNYUUTANKA(double KOUNYUUTANKA) {
		this.KOUNYUUTANKA = KOUNYUUTANKA;
	}

   /**
	* KOUNYUUTANKA 購入単価を取得
	*
	* @return KOUNYUUTANKA 購入単価
	*/
	public double getKOUNYUUTANKA() {
		return this.KOUNYUUTANKA;
	}

   /**
	* TEHAIBI 手配日を設定
	*
	* @param TEHAIBI 手配日
	*/
	public void setTEHAIBI(String TEHAIBI) {
		this.TEHAIBI = TEHAIBI;
	}

   /**
	* TEHAIBI 手配日を取得
	*
	* @return TEHAIBI 手配日
	*/
	public String getTEHAIBI() {
		return this.TEHAIBI;
	}

   /**
	* NYUUKAYOTEIBI 入荷予定日を設定
	*
	* @param NYUUKAYOTEIBI 入荷予定日
	*/
	public void setNYUUKAYOTEIBI(String NYUUKAYOTEIBI) {
		this.NYUUKAYOTEIBI = NYUUKAYOTEIBI;
	}

   /**
	* NYUUKAYOTEIBI 入荷予定日を取得
	*
	* @return NYUUKAYOTEIBI 入荷予定日
	*/
	public String getNYUUKAYOTEIBI() {
		return this.NYUUKAYOTEIBI;
	}

   /**
	* NYUUKABI 入荷日を設定
	*
	* @param NYUUKABI 入荷日
	*/
	public void setNYUUKABI(String NYUUKABI) {
		this.NYUUKABI = NYUUKABI;
	}

   /**
	* NYUUKABI 入荷日を取得
	*
	* @return NYUUKABI 入荷日
	*/
	public String getNYUUKABI() {
		return this.NYUUKABI;
	}

   /**
	* SHOUKEI 小計を設定
	*
	* @param SHOUKEI 小計
	*/
	public void setSHOUKEI(double SHOUKEI) {
		this.SHOUKEI = SHOUKEI;
	}

   /**
	* SHOUKEI 小計を取得
	*
	* @return SHOUKEI 小計
	*/
	public double getSHOUKEI() {
		return this.SHOUKEI;
	}

   /**
	* NYUUKOFURAGU 入庫フラグを設定
	*
	* @param NYUUKOFURAGU 入庫フラグ
	*/
	public void setNYUUKOFURAGU(String NYUUKOFURAGU) {
		this.NYUUKOFURAGU = NYUUKOFURAGU;
	}

   /**
	* NYUUKOFURAGU 入庫フラグを取得
	*
	* @return NYUUKOFURAGU 入庫フラグ
	*/
	public String getNYUUKOFURAGU() {
		return this.NYUUKOFURAGU;
	}

   /**
	* NYUUKOBANGOU 入庫番号を設定
	*
	* @param NYUUKOBANGOU 入庫番号
	*/
	public void setNYUUKOBANGOU(String NYUUKOBANGOU) {
		this.NYUUKOBANGOU = NYUUKOBANGOU;
	}

   /**
	* NYUUKOBANGOU 入庫番号を取得
	*
	* @return NYUUKOBANGOU 入庫番号
	*/
	public String getNYUUKOBANGOU() {
		return this.NYUUKOBANGOU;
	}

   /**
	* KAHEI 貨幣を設定
	*
	* @param KAHEI 貨幣
	*/
	public void setKAHEI(String KAHEI) {
		this.KAHEI = KAHEI;
	}

   /**
	* KAHEI 貨幣を取得
	*
	* @return KAHEI 貨幣
	*/
	public String getKAHEI() {
		return this.KAHEI;
	}

   /**
	* KAKOTANKA 過去単価を設定
	*
	* @param KAKOTANKA 過去単価
	*/
	public void setKAKOTANKA(String KAKOTANKA) {
		this.KAKOTANKA = KAKOTANKA;
	}

   /**
	* KAKOTANKA 過去単価を取得
	*
	* @return KAKOTANKA 過去単価
	*/
	public String getKAKOTANKA() {
		return this.KAKOTANKA;
	}

   /**
	* KAKUTEIKUBUN 確定区分を設定
	*
	* @param KAKUTEIKUBUN 確定区分
	*/
	public void setKAKUTEIKUBUN(String KAKUTEIKUBUN) {
		this.KAKUTEIKUBUN = KAKUTEIKUBUN;
	}

   /**
	* KAKUTEIKUBUN 確定区分を取得
	*
	* @return KAKUTEIKUBUN 確定区分
	*/
	public String getKAKUTEIKUBUN() {
		return this.KAKUTEIKUBUN;
	}

   /**
	* TOUROKUSHAID 登録者IDを設定
	*
	* @param TOUROKUSHAID 登録者ID
	*/
	public void setTOUROKUSHAID(String TOUROKUSHAID) {
		this.TOUROKUSHAID = TOUROKUSHAID;
	}

   /**
	* TOUROKUSHAID 登録者IDを取得
	*
	* @return TOUROKUSHAID 登録者ID
	*/
	public String getTOUROKUSHAID() {
		return this.TOUROKUSHAID;
	}

   /**
	* BIKOU1 備考1を設定
	*
	* @param BIKOU1 備考1
	*/
	public void setBIKOU1(String BIKOU1) {
		this.BIKOU1 = BIKOU1;
	}

   /**
	* BIKOU1 備考1を取得
	*
	* @return BIKOU1 備考1
	*/
	public String getBIKOU1() {
		return this.BIKOU1;
	}

   /**
	* HITSUYOU 必要を設定
	*
	* @param HITSUYOU 必要
	*/
	public void setHITSUYOU(String HITSUYOU) {
		this.HITSUYOU = HITSUYOU;
	}

   /**
	* HITSUYOU 必要を取得
	*
	* @return HITSUYOU 必要
	*/
	public String getHITSUYOU() {
		return this.HITSUYOU;
	}

   /**
	* TEHAI 手配を設定
	*
	* @param TEHAI 手配
	*/
	public void setTEHAI(String TEHAI) {
		this.TEHAI = TEHAI;
	}

   /**
	* TEHAI 手配を取得
	*
	* @return TEHAI 手配
	*/
	public String getTEHAI() {
		return this.TEHAI;
	}

   /**
	* KANRYOU 完了を設定
	*
	* @param KANRYOU 完了
	*/
	public void setKANRYOU(String KANRYOU) {
		this.KANRYOU = KANRYOU;
	}

   /**
	* KANRYOU 完了を取得
	*
	* @return KANRYOU 完了
	*/
	public String getKANRYOU() {
		return this.KANRYOU;
	}

   /**
	* SOUKOSUU1 総個数1を設定
	*
	* @param SOUKOSUU1 総個数1
	*/
	public void setSOUKOSUU1(int SOUKOSUU1) {
		this.SOUKOSUU1 = SOUKOSUU1;
	}

   /**
	* SOUKOSUU1 総個数1を取得
	*
	* @return SOUKOSUU1 総個数1
	*/
	public int getSOUKOSUU1() {
		return this.SOUKOSUU1;
	}

   /**
	* HINBANNO1 品番NO1を設定
	*
	* @param HINBANNO1 品番NO1
	*/
	public void setHINBANNO1(String HINBANNO1) {
		this.HINBANNO1 = HINBANNO1;
	}

   /**
	* HINBANNO1 品番NO1を取得
	*
	* @return HINBANNO1 品番NO1
	*/
	public String getHINBANNO1() {
		return this.HINBANNO1;
	}


}