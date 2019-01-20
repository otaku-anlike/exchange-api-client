package de.elbatya.cryptocoins.bittrexclient.api;

import de.elbatya.cryptocoins.bittrexclient.api.model.common.EthApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex.Currencies;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex.Market;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.Map;

/**
 * @author contact@elbatya.de
 */
public interface EthPublicApi {

    public final String API_KEY = "3EMEF11IM9EAK1CXS73N4EXRXVCINQIAAW";


//    @RequestLine("GET /api2/1/candlestick2/{symbol}?group_sec={GROUP_SEC}&range_hour={RANGE_HOUR}")
//    GateApiResult<List<Candle>> getKline(@Param("symbol") String symbol, @Param("GROUP_SEC") int groupSec, @Param("RANGE_HOUR") int rangeHour);

    @RequestLine("GET api?module=stats&action=tokensupply&contractaddress={CONTRACT}&apikey="+API_KEY)
//    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    EthApiResult<String> getTokenSupply(@Param("CONTRACT") String contract);


}
