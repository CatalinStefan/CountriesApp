package com.devtides.countriesapp.model;

import com.google.gson.annotations.SerializedName;

public class CountryModel {
    @SerializedName("name")
    String countryName;

    @SerializedName("capital")
    String capital;

    @SerializedName("flagPNG")
    String flag;

    public CountryModel(String countryName, String capital, String flag) {
        this.countryName = countryName;
        this.capital = capital;
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapital() {
        return capital;
    }

    public String getFlag() {
        return flag;
    }
}
