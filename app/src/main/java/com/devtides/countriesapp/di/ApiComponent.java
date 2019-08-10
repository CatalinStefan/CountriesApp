package com.devtides.countriesapp.di;

import com.devtides.countriesapp.model.CountriesService;
import com.devtides.countriesapp.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

    void inject(ListViewModel viewModel);
}
