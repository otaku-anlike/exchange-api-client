package de.elbatya.cryptocoins.bittrexclient.api;


import de.elbatya.cryptocoins.bittrexclient.api.model.common.BlockccApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc.*;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * @author contact@elbatya.de
 */
public interface BlockccInfoApi {



    //====NoticesInfo=====
    @RequestLine("GET /getNoticesInfo")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<NoticesInfo> getNoticesInfo();
    @RequestLine("GET /getNoticesInfo?size={size}")
    BlockccApiResult<NoticesInfo> getNoticesInfo(@Param("size") int size);

    //====exchange tickers=====
    @RequestLine("GET /exchange/tickers?name={name}")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<ExchangeTickers> getExchangeTickers(@Param("name") String name);
    @RequestLine("GET /exchange/tickers?name={name}&page={page}&size={size}")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<ExchangeTickers> getExchangeTickers(@Param("name") String name, @Param("page") int page, @Param("size") int size);
    @RequestLine("GET /coin/exchanges?coin={coin}")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<String[]> getExchangeCoin(@Param("coin") String coin);

    //====coin tickers=====
    @RequestLine("GET /coin/tickers?coin={coin}")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<CoinTickers> getCoinTickers(@Param("coin") String coin);
    @RequestLine("GET /coin/tickers?coin={coin}&exchange={exchange}")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<CoinTickers> getCoinTickers(@Param("coin") String coin, @Param("exchange") String exchange);
    @RequestLine("GET /coin/tickers?coin={coin}&exchange={exchange}&symbol={symbol}")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<CoinTickers> getCoinTickers(@Param("coin") String coin, @Param("exchange") String exchange, @Param("symbol") String symbol);
    @RequestLine("GET /coin/tickers?coin={coin}&exchange={exchange}&symbol={symbol}&page={page}&size={size}")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<CoinTickers> getCoinTickers(@Param("coin") String coin, @Param("exchange") String exchange, @Param("symbol") String symbol, @Param("page") int page, @Param("size") int size);

    //====coin info (ico)=====
    @RequestLine("GET /coin/get?coin={coin}")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<CoinInfo> getCoinInfo(@Param("coin") String coin);

    //====New SymbolPairs=====
    @RequestLine("GET /symbolPairSchedule/pairList?size={size}")
    @Headers("user-agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.30")
    BlockccApiResult<NewPairsList> getNewPairsList(@Param("size") int size);



}
