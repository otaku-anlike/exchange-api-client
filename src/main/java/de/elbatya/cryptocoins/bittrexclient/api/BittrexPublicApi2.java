package de.elbatya.cryptocoins.bittrexclient.api;

import de.elbatya.cryptocoins.bittrexclient.api.model.common.ApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.*;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public interface BittrexPublicApi2 {

    @RequestLine("GET /pub/market/getticks?marketname={marketname}&tickInterval={tickInterval}")
    ApiResult<List<Candle>> getCandles(@Param("marketname") String marketname, @Param("tickInterval") String tickInterval);

}
