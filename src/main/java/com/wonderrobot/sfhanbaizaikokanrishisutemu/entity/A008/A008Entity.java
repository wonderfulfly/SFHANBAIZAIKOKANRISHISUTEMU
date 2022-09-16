package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity.A008;

import java.util.Date;

/**
 * @project
 *     入金管理検索
 * @comment
 *     table id: A008Entity
 * @version
 *     
 */
public class A008Entity {

    /**
     *     CHUUBUNSHONO 注文書NO
     */
    private String CHUUBUNSHONO;

    /**
     *     CHUUBUNSHONO1 注文書NO
     */
    private String CHUUBUNSHONO1;

    /**
     *     CHUUMONHIDZUKE 注文日付
     */
    private String CHUUMONHIDZUKE;

    /**
     *     CHUUMONHIDZUKE1 受注日付
     */
    private Date CHUUMONHIDZUKE1;

    /**
     *     FURIDASHIZUMIHIDZUKE 振出日
     */
    private Date FURIDASHIZUMIHIDZUKE;

    /**
     *     FURIDASHIZUMIKINGAKU 振出済み金額
     */
    private double FURIDASHIZUMIKINGAKU;

    /**
     *     FURIDASHIZUMIWARIAI 振出済み%
     */
    private String FURIDASHIZUMIWARIAI;

    /**
     *     KYAKUSAKI 客先
     */
    private String KYAKUSAKI;

    /**
     *     KYAKUSAKIID 客先
     */
    private String KYAKUSAKIID;

    /**
     *     MINYUUKIN 未入金
     */
    private String MINYUUKIN;

    /**
     *     NYUUKINGAKU 未振出金額
     */
    private double NYUUKINGAKU;

    /**
     *     NYUUKINWARIAI 未振出%
     */
    private String NYUUKINWARIAI;

    /**
     *     NYUUKINZUMIKINGAKU 入金済み金額
     */
    private double NYUUKINZUMIKINGAKU;

    /**
     *     NYUUKINZUMIWARIAI 入金済み%
     */
    private String NYUUKINZUMIWARIAI;

    /**
     *     RESHIITONO レシートNO
     */
    private String RESHIITONO;

    /**
     *     SHANAIKOUJIBANGOU 社内工事番号
     */
    private String SHANAIKOUJIBANGOU;

    /**
     *     SHIHARAIHIDZUKE 入金予定日
     */
    private Date SHIHARAIHIDZUKE;

    /**
     *     SHOUHINSOUGAKUJPY 契約金額
     */
    private double SHOUHINSOUGAKUJPY;

    /**
     *     SHUUSHOVIEW_MINYUUKINKINGAKU14 未入金金額
     */
    private double SHUUSHOVIEW_MINYUUKINKINGAKU14;

    /**
     *     TANTOUSHAID 担当者
     */
    private String TANTOUSHAID;

    /**
     *     USHUUSHOVIEW_MINYUUKINWARIAI13 未入金%
     */
    private String USHUUSHOVIEW_MINYUUKINWARIAI13;


    /**
     * CHUUBUNSHONO 注文書NO Set
     *
     * @param CHUUBUNSHONO 注文書NO
     */
    public void setCHUUBUNSHONO(String CHUUBUNSHONO) {
        this.CHUUBUNSHONO = CHUUBUNSHONO;
    }

    /**
     * CHUUBUNSHONO 注文書NO Get
     *
     * @return CHUUBUNSHONO 注文書NO
    */
    public String getCHUUBUNSHONO() {
        return this.CHUUBUNSHONO;
    }

    /**
     * CHUUBUNSHONO1 注文書NO Set
     *
     * @param CHUUBUNSHONO1 注文書NO
     */
    public void setCHUUBUNSHONO1(String CHUUBUNSHONO1) {
        this.CHUUBUNSHONO1 = CHUUBUNSHONO1;
    }

    /**
     * CHUUBUNSHONO1 注文書NO Get
     *
     * @return CHUUBUNSHONO1 注文書NO
    */
    public String getCHUUBUNSHONO1() {
        return this.CHUUBUNSHONO1;
    }

    /**
     * CHUUMONHIDZUKE 注文日付 Set
     *
     * @param CHUUMONHIDZUKE 注文日付
     */
    public void setCHUUMONHIDZUKE(String CHUUMONHIDZUKE) {
        this.CHUUMONHIDZUKE = CHUUMONHIDZUKE;
    }

    /**
     * CHUUMONHIDZUKE 注文日付 Get
     *
     * @return CHUUMONHIDZUKE 注文日付
    */
    public String getCHUUMONHIDZUKE() {
        return this.CHUUMONHIDZUKE;
    }

    /**
     * CHUUMONHIDZUKE1 受注日付 Set
     *
     * @param CHUUMONHIDZUKE1 受注日付
     */
    public void setCHUUMONHIDZUKE1(Date CHUUMONHIDZUKE1) {
        this.CHUUMONHIDZUKE1 = CHUUMONHIDZUKE1;
    }

    /**
     * CHUUMONHIDZUKE1 受注日付 Get
     *
     * @return CHUUMONHIDZUKE1 受注日付
    */
    public Date getCHUUMONHIDZUKE1() {
        return this.CHUUMONHIDZUKE1;
    }

    /**
     * FURIDASHIZUMIHIDZUKE 振出日 Set
     *
     * @param FURIDASHIZUMIHIDZUKE 振出日
     */
    public void setFURIDASHIZUMIHIDZUKE(Date FURIDASHIZUMIHIDZUKE) {
        this.FURIDASHIZUMIHIDZUKE = FURIDASHIZUMIHIDZUKE;
    }

    /**
     * FURIDASHIZUMIHIDZUKE 振出日 Get
     *
     * @return FURIDASHIZUMIHIDZUKE 振出日
    */
    public Date getFURIDASHIZUMIHIDZUKE() {
        return this.FURIDASHIZUMIHIDZUKE;
    }

    /**
     * FURIDASHIZUMIKINGAKU 振出済み金額 Set
     *
     * @param FURIDASHIZUMIKINGAKU 振出済み金額
     */
    public void setFURIDASHIZUMIKINGAKU(double FURIDASHIZUMIKINGAKU) {
        this.FURIDASHIZUMIKINGAKU = FURIDASHIZUMIKINGAKU;
    }

    /**
     * FURIDASHIZUMIKINGAKU 振出済み金額 Get
     *
     * @return FURIDASHIZUMIKINGAKU 振出済み金額
    */
    public double getFURIDASHIZUMIKINGAKU() {
        return this.FURIDASHIZUMIKINGAKU;
    }

    /**
     * FURIDASHIZUMIWARIAI 振出済み% Set
     *
     * @param FURIDASHIZUMIWARIAI 振出済み%
     */
    public void setFURIDASHIZUMIWARIAI(String FURIDASHIZUMIWARIAI) {
        this.FURIDASHIZUMIWARIAI = FURIDASHIZUMIWARIAI;
    }

    /**
     * FURIDASHIZUMIWARIAI 振出済み% Get
     *
     * @return FURIDASHIZUMIWARIAI 振出済み%
    */
    public String getFURIDASHIZUMIWARIAI() {
        return this.FURIDASHIZUMIWARIAI;
    }

    /**
     * KYAKUSAKI 客先 Set
     *
     * @param KYAKUSAKI 客先
     */
    public void setKYAKUSAKI(String KYAKUSAKI) {
        this.KYAKUSAKI = KYAKUSAKI;
    }

    /**
     * KYAKUSAKI 客先 Get
     *
     * @return KYAKUSAKI 客先
    */
    public String getKYAKUSAKI() {
        return this.KYAKUSAKI;
    }

    /**
     * KYAKUSAKIID 客先 Set
     *
     * @param KYAKUSAKIID 客先
     */
    public void setKYAKUSAKIID(String KYAKUSAKIID) {
        this.KYAKUSAKIID = KYAKUSAKIID;
    }

    /**
     * KYAKUSAKIID 客先 Get
     *
     * @return KYAKUSAKIID 客先
    */
    public String getKYAKUSAKIID() {
        return this.KYAKUSAKIID;
    }

    /**
     * MINYUUKIN 未入金 Set
     *
     * @param MINYUUKIN 未入金
     */
    public void setMINYUUKIN(String MINYUUKIN) {
        this.MINYUUKIN = MINYUUKIN;
    }

    /**
     * MINYUUKIN 未入金 Get
     *
     * @return MINYUUKIN 未入金
    */
    public String getMINYUUKIN() {
        return this.MINYUUKIN;
    }

    /**
     * NYUUKINGAKU 未振出金額 Set
     *
     * @param NYUUKINGAKU 未振出金額
     */
    public void setNYUUKINGAKU(double NYUUKINGAKU) {
        this.NYUUKINGAKU = NYUUKINGAKU;
    }

    /**
     * NYUUKINGAKU 未振出金額 Get
     *
     * @return NYUUKINGAKU 未振出金額
    */
    public double getNYUUKINGAKU() {
        return this.NYUUKINGAKU;
    }

    /**
     * NYUUKINWARIAI 未振出% Set
     *
     * @param NYUUKINWARIAI 未振出%
     */
    public void setNYUUKINWARIAI(String NYUUKINWARIAI) {
        this.NYUUKINWARIAI = NYUUKINWARIAI;
    }

    /**
     * NYUUKINWARIAI 未振出% Get
     *
     * @return NYUUKINWARIAI 未振出%
    */
    public String getNYUUKINWARIAI() {
        return this.NYUUKINWARIAI;
    }

    /**
     * NYUUKINZUMIKINGAKU 入金済み金額 Set
     *
     * @param NYUUKINZUMIKINGAKU 入金済み金額
     */
    public void setNYUUKINZUMIKINGAKU(double NYUUKINZUMIKINGAKU) {
        this.NYUUKINZUMIKINGAKU = NYUUKINZUMIKINGAKU;
    }

    /**
     * NYUUKINZUMIKINGAKU 入金済み金額 Get
     *
     * @return NYUUKINZUMIKINGAKU 入金済み金額
    */
    public double getNYUUKINZUMIKINGAKU() {
        return this.NYUUKINZUMIKINGAKU;
    }

    /**
     * NYUUKINZUMIWARIAI 入金済み% Set
     *
     * @param NYUUKINZUMIWARIAI 入金済み%
     */
    public void setNYUUKINZUMIWARIAI(String NYUUKINZUMIWARIAI) {
        this.NYUUKINZUMIWARIAI = NYUUKINZUMIWARIAI;
    }

    /**
     * NYUUKINZUMIWARIAI 入金済み% Get
     *
     * @return NYUUKINZUMIWARIAI 入金済み%
    */
    public String getNYUUKINZUMIWARIAI() {
        return this.NYUUKINZUMIWARIAI;
    }

    /**
     * RESHIITONO レシートNO Set
     *
     * @param RESHIITONO レシートNO
     */
    public void setRESHIITONO(String RESHIITONO) {
        this.RESHIITONO = RESHIITONO;
    }

    /**
     * RESHIITONO レシートNO Get
     *
     * @return RESHIITONO レシートNO
    */
    public String getRESHIITONO() {
        return this.RESHIITONO;
    }

    /**
     * SHANAIKOUJIBANGOU 社内工事番号 Set
     *
     * @param SHANAIKOUJIBANGOU 社内工事番号
     */
    public void setSHANAIKOUJIBANGOU(String SHANAIKOUJIBANGOU) {
        this.SHANAIKOUJIBANGOU = SHANAIKOUJIBANGOU;
    }

    /**
     * SHANAIKOUJIBANGOU 社内工事番号 Get
     *
     * @return SHANAIKOUJIBANGOU 社内工事番号
    */
    public String getSHANAIKOUJIBANGOU() {
        return this.SHANAIKOUJIBANGOU;
    }

    /**
     * SHIHARAIHIDZUKE 入金予定日 Set
     *
     * @param SHIHARAIHIDZUKE 入金予定日
     */
    public void setSHIHARAIHIDZUKE(Date SHIHARAIHIDZUKE) {
        this.SHIHARAIHIDZUKE = SHIHARAIHIDZUKE;
    }

    /**
     * SHIHARAIHIDZUKE 入金予定日 Get
     *
     * @return SHIHARAIHIDZUKE 入金予定日
    */
    public Date getSHIHARAIHIDZUKE() {
        return this.SHIHARAIHIDZUKE;
    }

    /**
     * SHOUHINSOUGAKUJPY 契約金額 Set
     *
     * @param SHOUHINSOUGAKUJPY 契約金額
     */
    public void setSHOUHINSOUGAKUJPY(double SHOUHINSOUGAKUJPY) {
        this.SHOUHINSOUGAKUJPY = SHOUHINSOUGAKUJPY;
    }

    /**
     * SHOUHINSOUGAKUJPY 契約金額 Get
     *
     * @return SHOUHINSOUGAKUJPY 契約金額
    */
    public double getSHOUHINSOUGAKUJPY() {
        return this.SHOUHINSOUGAKUJPY;
    }

    /**
     * SHUUSHOVIEW_MINYUUKINKINGAKU14 未入金金額 Set
     *
     * @param SHUUSHOVIEW_MINYUUKINKINGAKU14 未入金金額
     */
    public void setShuushoviewMinyuukinkingaku14(double SHUUSHOVIEW_MINYUUKINKINGAKU14) {
        this.SHUUSHOVIEW_MINYUUKINKINGAKU14 = SHUUSHOVIEW_MINYUUKINKINGAKU14;
    }

    /**
     * SHUUSHOVIEW_MINYUUKINKINGAKU14 未入金金額 Get
     *
     * @return SHUUSHOVIEW_MINYUUKINKINGAKU14 未入金金額
    */
    public double getShuushoviewMinyuukinkingaku14() {
        return this.SHUUSHOVIEW_MINYUUKINKINGAKU14;
    }

    /**
     * TANTOUSHAID 担当者 Set
     *
     * @param TANTOUSHAID 担当者
     */
    public void setTANTOUSHAID(String TANTOUSHAID) {
        this.TANTOUSHAID = TANTOUSHAID;
    }

    /**
     * TANTOUSHAID 担当者 Get
     *
     * @return TANTOUSHAID 担当者
    */
    public String getTANTOUSHAID() {
        return this.TANTOUSHAID;
    }

    /**
     * USHUUSHOVIEW_MINYUUKINWARIAI13 未入金% Set
     *
     * @param USHUUSHOVIEW_MINYUUKINWARIAI13 未入金%
     */
    public void setUshuushoviewMinyuukinwariai13(String USHUUSHOVIEW_MINYUUKINWARIAI13) {
        this.USHUUSHOVIEW_MINYUUKINWARIAI13 = USHUUSHOVIEW_MINYUUKINWARIAI13;
    }

    /**
     * USHUUSHOVIEW_MINYUUKINWARIAI13 未入金% Get
     *
     * @return USHUUSHOVIEW_MINYUUKINWARIAI13 未入金%
    */
    public String getUshuushoviewMinyuukinwariai13() {
        return this.USHUUSHOVIEW_MINYUUKINWARIAI13;
    }

}