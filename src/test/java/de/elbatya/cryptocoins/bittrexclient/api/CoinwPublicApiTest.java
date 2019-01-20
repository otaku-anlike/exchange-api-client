package de.elbatya.cryptocoins.bittrexclient.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.elbatya.cryptocoins.bittrexclient.api.model.common.CoinwApiResult;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw.Candle;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw.Market;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.coinw.Ticker;
import de.elbatya.cryptocoins.bittrexclient.config.ObjectMapperConfigurer;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
import feign.mock.MockTarget;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author contact@elbatya.de
 */
public class CoinwPublicApiTest {

    private MockClient mockClient;
    private CoinwPublicApi api;
//    private final static String SYMBOL = "5";//HSR
    private final static String SYMBOL = "14";//ETH
    private final static Integer CODEI = 200;
    private final static String CODE = "200";

    private InputStream load(String file) {
        return getClass().getClassLoader().getResourceAsStream("publicapi/coinw/"+file);
    }

    @Before
    public void setUp() throws Exception {

        ClassLoader cl = getClass().getClassLoader();

        mockClient = new MockClient()
        .ok(HttpMethod.POST, "/appApi.html?action=depth&symbol=14", load("getdepth.json"))
        .ok(HttpMethod.POST, "/appApi.html?action=kline&symbol=14&step=60", load("getkline.json"))
        .ok(HttpMethod.POST, "/appApi.html?action=market&symbol=14", load("getmarket.json"));


        ObjectMapper strictMapper = ObjectMapperConfigurer.configure(new ObjectMapper());
        strictMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

        api = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder(strictMapper))
                .client(mockClient)
                .target(new MockTarget<>(CoinwPublicApi.class));
    }

    @Test
    public void getMarkets() throws Exception {
        Market markets = api.getMarket(SYMBOL);
        assertThat(markets).isNotNull();
        assertThat(markets.getCode()).isEqualTo(CODEI);
        assertThat(markets.getMsg()).isNotEmpty();
        assertThat(markets.getData()).isNotNull();
    }

    @Test
    public void getKline() throws Exception {
        CoinwApiResult<List<Candle>> candle = api.getKline(SYMBOL,60);
        assertThat(candle).isNotNull();
        assertThat(candle.getCode()).isEqualTo(CODE);
        assertThat(candle.getMsg()).isNotEmpty();
        assertThat(candle.getData()).isNotNull();
    }

    @Test
    public void getDepth() throws Exception {
        CoinwApiResult<Ticker> ticker = api.getDepth(SYMBOL);
        assertThat(ticker).isNotNull();
        assertThat(ticker.getCode()).isEqualTo(CODE);
        assertThat(ticker.getMsg()).isNotEmpty();
        assertThat(ticker.getData()).isNotNull();
    }



}