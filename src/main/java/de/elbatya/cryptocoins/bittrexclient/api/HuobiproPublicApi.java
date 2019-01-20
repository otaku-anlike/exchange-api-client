package de.elbatya.cryptocoins.bittrexclient.api;


import de.elbatya.cryptocoins.bittrexclient.api.model.common.HuobiproApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.binance.TickerStatistics;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.huobipro.Tickers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public interface HuobiproPublicApi {


    // Market tickers
    @RequestLine("GET /market/tickers")
    List<Tickers> getMarketTickers();

}
