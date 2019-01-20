package de.elbatya.cryptocoins.bittrexclient.api;

import de.elbatya.cryptocoins.bittrexclient.api.model.common.CoinwApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw.Candle;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw.Market;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw.Ticker;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.rate.Rates;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public interface RatePublicApi {

    @RequestLine("GET /latest.json?app_id={appid}")
    Rates getRate(@Param("appid") String appid);


}
