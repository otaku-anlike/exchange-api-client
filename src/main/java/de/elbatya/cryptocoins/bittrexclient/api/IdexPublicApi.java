package de.elbatya.cryptocoins.bittrexclient.api;

import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex.Currencies;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex.Market;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex.TradeHistory;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author contact@elbatya.de
 */
public interface IdexPublicApi {

    public final String BROWSER = "user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30";

    @RequestLine("POST /returnTicker")
    @Headers(BROWSER)
    Map<String, Market> getMarket();

    @RequestLine("POST /returnCurrencies")
    @Headers(BROWSER)
    Map<String, Currencies> getCurrencies();

    @RequestLine("GET /returnTradeHistory?address={ADDRESS}")
    @Headers(BROWSER)
    Map<String, List<TradeHistory>> getTradeHistory(@Param("ADDRESS") String address);

    @RequestLine("GET /returnTradeHistory?address={ADDRESS}&market={MARKET}")
    @Headers(BROWSER)
    List<TradeHistory> getTradeHistory(@Param("ADDRESS") String address, @Param("MARKET") String market);

}
