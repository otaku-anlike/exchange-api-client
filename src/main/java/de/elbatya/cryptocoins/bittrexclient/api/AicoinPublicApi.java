package de.elbatya.cryptocoins.bittrexclient.api;


import de.elbatya.cryptocoins.bittrexclient.api.model.common.AicoinApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.aicoin.Depth;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.aicoin.Kline;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public interface AicoinPublicApi {


    // Market Depth
    @RequestLine("GET /depth?symbol={symbol}")
    Depth getDepth(@Param("symbol") String symbol);

    // Market Kline
    @RequestLine("GET period?symbol={symbol}&step={step}")
    AicoinApiResult<List<Kline>> getKline(@Param("symbol") String symbol, @Param("step") int step);



}
