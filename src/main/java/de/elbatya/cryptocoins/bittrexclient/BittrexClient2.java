package de.elbatya.cryptocoins.bittrexclient;


import de.elbatya.cryptocoins.bittrexclient.api.BittrexAccountApi;
import de.elbatya.cryptocoins.bittrexclient.api.BittrexMarketApi;
import de.elbatya.cryptocoins.bittrexclient.api.BittrexPublicApi;
import de.elbatya.cryptocoins.bittrexclient.api.BittrexPublicApi2;
import de.elbatya.cryptocoins.bittrexclient.config.ApiBuilderFactory;
import de.elbatya.cryptocoins.bittrexclient.config.ApiCredentials;
import feign.Feign;
import feign.Logger;
import feign.Util;
import feign.slf4j.Slf4jLogger;

import javax.annotation.Nullable;

/**
 * @author contact@elbatya.de
 */
public class BittrexClient2 {

    public static final String DEFAULT_BASE_URL = "https://bittrex.com/api/v2.0";

    private BittrexPublicApi2 publicApi2;

    private boolean credentialsAvailable = true;

    public BittrexClient2() {
        this(DEFAULT_BASE_URL, null, null);
    }

    public BittrexClient2(@Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, null, logLevel);
    }

    public BittrexClient2(@Nullable ApiCredentials credentials) {
        this(DEFAULT_BASE_URL, credentials, null);
    }

    public BittrexClient2(@Nullable ApiCredentials credentials, @Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, credentials, logLevel);
    }


    public BittrexClient2(
            String baseUrl,
            @Nullable ApiCredentials credentials,
            @Nullable Logger.Level logLevel)
    {
        Util.checkNotNull(baseUrl, "The baseUrl must not be null!");

        ApiBuilderFactory apiBuilderFactory = new ApiBuilderFactory(baseUrl);

        Feign.Builder apiBuilder = apiBuilderFactory.createApiBuilder(credentials);

        if (logLevel != null) {
            apiBuilder
                    .logger(new Slf4jLogger(BittrexClient2.class))
                    .logLevel(logLevel);
        }

        publicApi2 = apiBuilder.target(BittrexPublicApi2.class, baseUrl);

        credentialsAvailable = credentials != null;


    }


    public BittrexPublicApi2 getPublicApi2() {
        return publicApi2;
    }

    private void failIfNoCredentials(String message){
        if(!credentialsAvailable){
            throw new RuntimeException(message);
        }
    }
}
