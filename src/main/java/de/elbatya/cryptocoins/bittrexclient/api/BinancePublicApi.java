package de.elbatya.cryptocoins.bittrexclient.api;


import de.elbatya.cryptocoins.bittrexclient.api.model.common.AicoinApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.aicoin.Depth;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.aicoin.Kline;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.binance.TickerStatistics;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public interface BinancePublicApi {


    // Market Depth
    @RequestLine("GET /api/v1/ticker/24hr")
    List<TickerStatistics> get24HrPriceStatistics();

    // Market Kline
    @RequestLine("GET /api/v1/ticker/24hr?symbol={symbol}")
    TickerStatistics get24HrPriceStatistics(@Param("symbol") String symbol);



}
