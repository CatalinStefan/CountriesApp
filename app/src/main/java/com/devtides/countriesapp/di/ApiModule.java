package com.devtides.countriesapp.di;

import com.devtides.countriesapp.model.CountriesApi;
import com.devtides.countriesapp.model.CountriesService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiModule {

    private static final String BASE_URL = "https://raw.githubusercontent.com";

    @Provides
    public CountriesApi provideCountriesApi() {
        return new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(CountriesApi.class);
    }

    @Provides
    public CountriesService provideCountriesService() {
        return CountriesService.getInstance();
    }

}
