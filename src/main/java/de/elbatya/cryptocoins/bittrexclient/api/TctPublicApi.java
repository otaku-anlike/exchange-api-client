package de.elbatya.cryptocoins.bittrexclient.api;

import de.elbatya.cryptocoins.bittrexclient.api.model.common.TctApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.tct.Summary;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public interface TctPublicApi {


    @RequestLine("GET /v3/ticker/summary?type=0&sort=1&offset=0&limit={limit}&top=0")
//    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    TctApiResult<Summary> getTickerSummary(@Param("limit") int limit);

}
