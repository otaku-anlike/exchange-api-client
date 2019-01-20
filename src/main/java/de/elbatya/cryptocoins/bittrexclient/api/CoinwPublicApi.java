package de.elbatya.cryptocoins.bittrexclient.api;

import de.elbatya.cryptocoins.bittrexclient.api.model.common.ApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.common.CoinwApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw.Candle;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw.Market;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw.Ticker;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public interface CoinwPublicApi {

    @RequestLine("POST /appApi.html?action=depth&symbol={symbol}")
    CoinwApiResult<Ticker> getDepth(@Param("symbol") String symbol);

    @RequestLine("POST /appApi.html?action=kline&symbol={symbol}&step={step}")
    CoinwApiResult<List<Candle>> getKline(@Param("symbol") String symbol, @Param("step") int step);

    @RequestLine("POST /appApi.html?action=market&symbol={symbol}")
    Market getMarket(@Param("symbol") String symbol);

}
