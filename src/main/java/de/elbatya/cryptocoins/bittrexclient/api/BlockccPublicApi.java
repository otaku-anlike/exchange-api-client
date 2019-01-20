package de.elbatya.cryptocoins.bittrexclient.api;


import de.elbatya.cryptocoins.bittrexclient.api.model.common.BlockccApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc.*;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * @author contact@elbatya.de
 */
public interface BlockccPublicApi {

    //========IP=================
    //Your IP to Location
    @RequestLine("GET /ip")
    BlockccApiResult<Ip> getIp();

    //Your IP to Location
    @RequestLine("GET /ip?ip_address={ip_address}")
    BlockccApiResult<Ip> getIp(@Param("ip_address")  String ip_address);

    //====Exchange Rate=====
    //Currency Exchange Rate
    @RequestLine("GET /exrate")
    BlockccApiResult<ExchangeRate> getExchangeRate();
    @RequestLine("GET /exrate?base={base}&symbol={symbol}")
    BlockccApiResult<ExchangeRate> getExchangeRate(@Param("base") String base,@Param("symbol") String symbol);

    //=================BlockChain Data ======================
    //BlockChain Transaction Data
    @RequestLine("GET /tx?txhash={txhash}")
    BlockccApiResult<Tx> getTxByHash(@Param("txhash") String txhash);

    //BlockChain Address Data
    @RequestLine("GET /address?address={address}")
    BlockccApiResult<NewPairs> getBlockChainByAddress(@Param("address") String address);

    //==============Market List =========================
    // Markets
    @RequestLine("GET /markets")
    BlockccApiResult<List<Markets>> getMarkets();
    // Symbols
    @RequestLine("GET /symbols")
    BlockccApiResult<List<Symbols>> getSymbols();
    // MarketPairs
    @RequestLine("GET /market_pairs")
    BlockccApiResult<List<MarketPairs>> getMarketPairs();
    // Market
    @RequestLine("GET /market/{market}")
    BlockccApiResult<Market> getMarket(@Param("market") String market);


    //===============Market Data ===========================
    // Market Ticker
    @RequestLine("GET /ticker?market={market}&symbol_pair={symbol_pair}")
    BlockccApiResult<Ticker> getTicker(@Param("market") String market,@Param("symbol_pair") String symbol_pair);
    // Market Tickers
    @RequestLine("GET /tickers")
    BlockccApiResult<Tickers> getTickers();
    @RequestLine("GET /tickers?symbol={symbol}&market={market}&market_pair={market_pair}&page={page}&size={size}")
    BlockccApiResult<Tickers> getTickers(@Param("symbol") String symbol,@Param("market") String market,@Param("market_pair") String market_pair,@Param("page") int page,@Param("size") int size);
    // Market Depth
    @RequestLine("GET /depth?market={market}&symbol_pair={symbol_pair}")
    BlockccApiResult<Depth> getDepth(@Param("market") String market,@Param("symbol_pair") String symbol_pair);

    // Market Kline
    @RequestLine("GET /kline?market={market}&symbol_pair={symbol_pair}&type={type}")
    BlockccApiResult<List<Kline>> getKline(@Param("market") String market,@Param("symbol_pair") String symbol_pair,@Param("type") String type);
    @RequestLine("GET /kline?market={market}&symbol_pair={symbol_pair}&type={type}&limit={limit}&since={since}")
    BlockccApiResult<List<Kline>> getKline(@Param("market") String market,@Param("symbol_pair") String symbol_pair,@Param("type") String type,@Param("limit") int limit,@Param("since") int since);
    // Price Index
    @RequestLine("GET /price?symbol={symbol}")
    BlockccApiResult<List<Price>> getPrice(@Param("symbol") String symbol);
    // Price Index
    @RequestLine("GET /price/history?symbol={symbol}")
    BlockccApiResult<List<PriceHistory>> getPriceHistory(@Param("symbol") String symbol);
    @RequestLine("GET /price/history?symbol={symbol}&limit={limit}")
    BlockccApiResult<List<PriceHistory>> getPriceHistory(@Param("symbol") String symbol, @Param("limit") int limit);
    // New SymbolPairs
    @RequestLine("GET /new_pairs")
    BlockccApiResult<NewPairs> getNewPairs();
    @RequestLine("GET /new_pairs?page={page}&size={size}")
    BlockccApiResult<NewPairs> getNewPairs(@Param("page") int page, @Param("size") int size);

}
