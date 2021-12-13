package com.siamsoft.csm_crud_internal_database;

public class CustomList {


    private String strName;
    private String strMobile;
    private String strEmail;

    public CustomList() {

    }


    public CustomList(String strId, String strName, String strMobile, String strEmail) {
        this.strId = strId;
        this.strName = strName;
        this.strMobile = strMobile;
        this.strEmail = strEmail;
    }

    private String strId;

    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrMobile() {
        return strMobile;
    }

    public void setStrMobile(String strMobile) {
        this.strMobile = strMobile;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }







}
