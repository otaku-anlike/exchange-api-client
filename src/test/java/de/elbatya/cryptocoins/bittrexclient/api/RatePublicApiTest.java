package de.elbatya.cryptocoins.bittrexclient.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.elbatya.cryptocoins.bittrexclient.api.model.publicapi.rate.Rates;
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

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author contact@elbatya.de
 */
public class RatePublicApiTest {

    private MockClient mockClient;
    private RatePublicApi api;
    private final static String APPID = "b950d828630341d6950fee5bf97004a1";
    private final static String USD = "USD";

    private InputStream load(String file) {
        return getClass().getClassLoader().getResourceAsStream("publicapi/rate/"+file);
    }

    @Before
    public void setUp() throws Exception {

        ClassLoader cl = getClass().getClassLoader();

        mockClient = new MockClient()
        .ok(HttpMethod.GET, "/latest.json?app_id=b950d828630341d6950fee5bf97004a1", load("getrate.json"));


        ObjectMapper strictMapper = ObjectMapperConfigurer.configure(new ObjectMapper());
        strictMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

        api = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder(strictMapper))
                .client(mockClient)
                .target(new MockTarget<>(RatePublicApi.class));
    }

    @Test
    public void getRates() throws Exception {
        Rates rates = api.getRate(APPID);
        assertThat(rates).isNotNull();
        assertThat(rates.getBase()).isEqualTo(USD);
        assertThat(rates.getDisclaimer()).isNotEmpty();
        assertThat(rates.getLicense()).isNotEmpty();
        assertThat(rates.getRates()).isNotNull();
    }

}