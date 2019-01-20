package de.elbatya.cryptocoins.bittrexclient;


//import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc.*;


import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.blockcc.*;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.huobipro.Tickers;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex.Currencies;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex.Market;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.idex.TradeHistory;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.tct.Summary;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.tct.SummaryEntry;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class TestStock {

	public static void testReflect(Object model){
		try {
			for (Field field : model.getClass().getDeclaredFields()) {
				field.setAccessible(true);

				if (field.get(model) instanceof String[]) {
					System.out.print(field.getName() + ":[");
					String[] strs = (String[]) field.get(model);
					for (String str:strs) {
						System.out.print(str + ",");
					}
					System.out.println("]");

				} else if (field.get(model) instanceof List) {
					List list = (List) field.get(model);
					for (Object subModel:list) {
						for (Field subField : subModel.getClass().getDeclaredFields()) {
							subField.setAccessible(true);
							System.out.println(subField.getName() + ":" + subField.get(subModel));
						}
					}


				} else {
					System.out.println(field.getName() + ":" + field.get(model));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("============================");
	}

	public static void main(String[] args) {



		//========================GATE =======================================
		// 比特儿
//		GateClient gateClient = new GateClient();
//		Map<String, Market> map = gateClient.getPublicApi().getMarket();
		// All trading Pairs
//		for (String key : map.keySet()) {
//			System.out.println(key);
//			Market market = map.get(key);
//			System.out.println(market.getLast());
//		}

//		List<Candle> list= gateClient.getPublicApi().getKline("btc_usdt",60,1).unwrap();
//		for (Candle Candle : list)
//		{
//			System.out.println(Candle.getClose());
//			System.out.println(Candle.getHigh());
//		}
//
//		System.out.println(CommonIntervalMap.ENUMMAP.get(BlockccInterval.HALF_HOURLY));


		// Market Info
		// String marketinfo = stockGet.marketinfo();
		// System.out.println(marketinfo);

		// Market Details
//		 String marketlist = stockGet.marketlist();
//		 System.out.println(marketlist);
//
//		// Tickers
//		 String tickers = stockGet.tickers();
//		 System.out.println(tickers);

		// Ticker 
		// String ticker = stockGet.ticker("eth_btc");
		// System.out.println(ticker);

		// Depth
		// String orderBook = stockGet.orderBook("eth_btc");
		// System.out.println(orderBook);

		// Trade History
		// String tradeHistory = stockGet.tradeHistory("eth_btc");
		// System.out.println(tradeHistory);

		// Get account fund balances
//		 String balance = stockPost.balance();
//		 System.out.println(balance);

		// get deposit address
		// String depositAddress = stockPost.depositAddress("btc");
		// System.out.println(depositAddress);

		// get deposit withdrawal history 
		// String depositsWithdrawals = stockPost.depositsWithdrawals("1469092370",
		// "1669092370");
		// System.out.println(depositsWithdrawals);

		// Place order buy
		// String buy = stockPost.buy("ltc_btc", "999","123");
		// System.out.println(buy);

		// Place order sell
		// String sell = stockPost.sell("ltc_btc", "999","123");
		// System.out.println(sell);

		// Cancel order
		// String cancelOrder = stockPost.cancelOrder("123456789", "ltc_btc");
		// System.out.println(cancelOrder);

		// Cancel all orders
		// String cancelAllOrders = stockPost.cancelAllOrders("1", "ltc_btc");
		// System.out.println(cancelAllOrders);

		// Get order status
		// String getOrder = stockPost.getOrder("123456789", "ltc_btc");
		// System.out.println(getOrder);

		// Get my open order list
		// String openOrders = stockPost.openOrders();
		// System.out.println(openOrders);

		// Get my last 24h trades
		// String myTradeHistory = stockPost.myTradeHistory("eth_btc","123456789");
		// System.out.println(myTradeHistory);

		// withdrawal 
		// String withdraw = stockPost.withdraw("btc","99","your addr");
		// System.out.println(withdraw);

		//========================IDEX =======================================
		IdexClient idexClient = new IdexClient();
//		Map<String, Market> idexMarket= idexClient.getPublicApi().getMarket();
//		for(Map.Entry<String, Market> entry : idexMarket.entrySet()){
//			System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue());
//			TestStock.testReflect(entry.getValue());
//		}
//		System.out.println("总交易对数 ："+idexMarket.entrySet().size());

//		Map<String, Currencies> idexCurrencies= idexClient.getPublicApi().getCurrencies();
//		for(Map.Entry<String, Currencies> entry : idexCurrencies.entrySet()){
//			System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue());
//			TestStock.testReflect(entry.getValue());
//		}
//		System.out.println("总交易对数 ："+idexCurrencies.entrySet().size());

//		Map<String, List<TradeHistory>> tradeHistoryMap = idexClient.getPublicApi().getTradeHistory("0xd6f363bcff417caec718945916e3cba9180cb179");
//		for(Map.Entry<String, List<TradeHistory>> entry : tradeHistoryMap.entrySet()){
//			System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue());
//			TestStock.testReflect(entry.getValue());
//			for (TradeHistory tradeHistory: entry.getValue()) {
//				TestStock.testReflect(tradeHistory);
//			}
//		}

		List<TradeHistory> tradeHistoryList = idexClient.getPublicApi().getTradeHistory("0xd6f363bcff417caec718945916e3cba9180cb179","ETH_MFTU");
		for (TradeHistory tradeHistory: tradeHistoryList) {
			TestStock.testReflect(tradeHistory);
		}

		//========================block cc =======================================
//		BlockccClient blockccClient = new BlockccClient();

//		ExchangeRate exchangeRate = blockccClient.getPublicApi().getExchangeRate().unwrap();
//		TestStock.testReflect(exchangeRate);

//		List<Markets> listMarkets = blockccClient.getPublicApi().getMarkets().unwrap();
//		for (Markets markets: listMarkets) {
//			TestStock.testReflect(markets);
//		}

//		List<Symbols> listSymbols = blockccClient.getPublicApi().getSymbols().unwrap();
//		for (Symbols symbols: listSymbols) {
//			TestStock.testReflect(symbols);
//		}

//		List<MarketPairs> listMarketPairs = blockccClient.getPublicApi().getMarketPairs().unwrap();
//		for (MarketPairs marketPairs: listMarketPairs) {
//			TestStock.testReflect(marketPairs);
//		}

//		Market listMarket = blockccClient.getPublicApi().getMarket("binance").unwrap();
//		TestStock.testReflect(listMarket);

//		Ticker ticker = blockccClient.getPublicApi().getTicker("binance","BTC_USDT").unwrap();
//		TestStock.testReflect(ticker);

//		Tickers tickers = blockccClient.getPublicApi().getTickers().unwrap();
//		Tickers tickers = blockccClient.getPublicApi().getTickers("BTC","binance","BTC_USDT",1,20).unwrap();
//		TestStock.testReflect(tickers);

//		Depth depth = blockccClient.getPublicApi().getDepth("binance","BTC_USDT").unwrap();
//		TestStock.testReflect(depth);

//		List<Kline> listKline = blockccClient.getPublicApi().getKline("binance","BTC_USDT",BlockccInterval.HALF_HOURLY.getIntervalId(),5,20).unwrap();
//		for (Kline kline: listKline) {
//			TestStock.testReflect(kline);
//		}

//		blockccClient.getPublicApi().getPrice("EOS");
//		List<Price> listPrice = blockccClient.getPublicApi().getPrice("EOS1").unwrap();
//		for (Price price: listPrice) {
//			TestStock.testReflect(price);
//		}

//		List<PriceHistory> listPriceHistory = blockccClient.getPublicApi().getPriceHistory("EOS",5).unwrap();
//		for (PriceHistory priceHistory: listPriceHistory) {
//			TestStock.testReflect(priceHistory);
//		}

//		NewPairs newPairs = blockccClient.getPublicApi().getNewPairs().unwrap();
//		TestStock.testReflect(newPairs);

//		NewPairs newPairs = blockccClient.getPublicApi().getNewPairs(1,2).unwrap();
//		TestStock.testReflect(newPairs);

		//========================block cc info=======================================
//		BlockccInfoClient blockccInfoClient = new BlockccInfoClient();
//		NoticesInfo noticesInfo = blockccInfoClient.getInfoApi().getNoticesInfo().unwrap();
//		List<NoticesInfoEntry> noticesInfoList = noticesInfo.getData();
//		System.out.println(noticesInfo.getInfoUrl());
//		for (NoticesInfoEntry noticesInfoEntry: noticesInfoList) {
//			TestStock.testReflect(noticesInfoEntry);
//		}

//		ExchangeTickers exchangeInfo = blockccInfoClient.getInfoApi().getExchangeTickers("gate-io",0,360).unwrap();
//		List<ExchangeTickersEntry> exchangeInfoList = exchangeInfo.getTickers();
//		System.out.println(exchangeInfo.getPage());
//		System.out.println(exchangeInfo.getSize());
//		System.out.println(exchangeInfo.getPageCount());
//		for (ExchangeTickersEntry exchangeInfoEntry: exchangeInfoList) {
//			TestStock.testReflect(exchangeInfoEntry);
//		}

//		CoinTickers coinTickers = blockccInfoClient.getInfoApi().getCoinTickers("eos","gate","ETH",0,200).unwrap();
//		List<CoinTickersEntry> coinTickersList = coinTickers.getTickers();
//		System.out.println(coinTickers.getPage());
//		System.out.println(coinTickers.getSize());
//		System.out.println(coinTickers.getPageCount());
//		for (CoinTickersEntry coinTickersEntry: coinTickersList) {
//			TestStock.testReflect(coinTickersEntry);
//		}

//		String[] exchangeCoins = blockccInfoClient.getInfoApi().getExchangeCoin("eos").unwrap();
//		for (String exchangeCoin:exchangeCoins) {
//			System.out.println(exchangeCoin);
//		}

//		CoinInfo coinInfo = blockccInfoClient.getInfoApi().getCoinInfo("tron").unwrap();
//		TestStock.testReflect(coinInfo);

//		NewPairsList newPairsList = blockccInfoClient.getInfoApi().getNewPairsList(10).unwrap();
//		TestStock.testReflect(newPairsList);

		//========================Aicoin=======================================
//		AicoinClient aicoinClient = new AicoinClient();
//		Depth depth = aicoinClient.getPublicApi().getDepth("binancebtcusdt");
//		TestStock.testReflect(depth);

//		List<Kline> listKline = aicoinClient.getPublicApi().getKline("binancebtcusdt",900).unwrap();
//		for (Kline kline: listKline) {
//			TestStock.testReflect(kline);
//		}


		//========================huobipro=======================================
//		HuobiproClient huobiproClient = new HuobiproClient();
//		huobiproClient.getPublicApi().getMarketTickers();
//		List<Tickers> tickersList = huobiproClient.getPublicApi().getMarketTickers();
//		for (Tickers tickers: tickersList) {
//			TestStock.testReflect(tickers);
//		}

		//========================token club=======================================
//		TctClient tctClient = new TctClient();
//		Summary summary = tctClient.getPublicApi().getTickerSummary(1000).unwrap();
//		int i = 1;
//		for (SummaryEntry summaryEntry: summary.getSummaryList()) {
//			TestStock.testReflect(summaryEntry);
//			i++;
//			System.out.println("币数"+i);
//		}

		//========================IDEX =======================================
//		EthClient ethClient = new EthClient();
//		String tokenSupply = ethClient.getPublicApi().getTokenSupply("0x02F2D4a04E6E01aCE88bD2Cd632875543b2eF577").unwrap();
//		System.out.println("总量 ："+tokenSupply);


//		Timestamp ts = new Timestamp(System.currentTimeMillis());
//		String tsStr = "";
//		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
////		Timestamp t = new Timestamp(15276619882);
//		Timestamp t = new Timestamp(Long.valueOf(String.valueOf("1527669100").substring(0,10)));
////		Date da = new Date(t);
//		try {
//			//方法一
////			tsStr = sdf.format(da);
////			System.out.println(tsStr);
//			//方法二
//			tsStr = t.toString();
//			System.out.println(tsStr);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}




	}
}
