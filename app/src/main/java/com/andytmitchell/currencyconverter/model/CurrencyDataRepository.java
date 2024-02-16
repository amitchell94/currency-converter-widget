package com.andytmitchell.currencyconverter.model;

import com.andytmitchell.currencyconverter.controller.CurrencyRateService;

import org.json.JSONObject;

public interface CurrencyDataRepository {
    void saveHomeCurrency(String homeCurrency);

    String getHomeCurrency();

    void saveTargetCurrency(String targetCurrency);

    String getTargetCurrency();

    void saveConversionRates(JSONObject ratesJson);

    void getConversionRates(String homeCurrency,boolean apiCallRequired, CurrencyRateService.CurrencyRateCallback callback);

    void saveLastFetchTime(long lastFetchTime);

    long getLastUpdated();
}
