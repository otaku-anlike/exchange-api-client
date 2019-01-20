package de.elbatya.cryptocoins.bittrexclient.api;

import de.elbatya.cryptocoins.bittrexclient.api.model.common.GateApiResult;

import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.gate.Candle;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.gate.Market;
import feign.Param;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

/**
 * @author contact@elbatya.de
 */
public interface GatePublicApi {

    public final String PAIRS_URL = "/api2/1/pairs";


    public final String MARKETINFO_URL = "/api2/1/marketinfo";


    public final String MARKETLIST_URL = "/api2/1/marketlist";


    public final String TICKERS_URL = "/api2/1/tickers";


    public final String TICKER_URL = "/api2/1/ticker";


    public final String ORDERBOOK_URL = "/api2/1/orderBook";


    public final String BALANCE_URL = "/api2/1/private/balances";


//    @RequestLine("GET /appApi.html?action=depth&symbol={symbol}")
//    CoinwApiResult<Ticker> getDepth(@Param("symbol") String symbol);

    @RequestLine("GET /api2/1/candlestick2/{symbol}?group_sec={GROUP_SEC}&range_hour={RANGE_HOUR}")
    GateApiResult<List<Candle>> getKline(@Param("symbol") String symbol, @Param("GROUP_SEC") int groupSec, @Param("RANGE_HOUR") int rangeHour);

    @RequestLine("GET /api2/1/tickers")
    Map<String, Market> getMarket();

}
