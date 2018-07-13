package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by diao on 2018/7/13.
 */

public class County extends DataSupport {
    private int countyId;
    private String countyName;
    private int weatherId;
    private int cityId;

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
