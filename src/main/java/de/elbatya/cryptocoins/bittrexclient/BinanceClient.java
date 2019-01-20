package de.elbatya.cryptocoins.bittrexclient;


import de.elbatya.cryptocoins.bittrexclient.api.BinancePublicApi;
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
public class BinanceClient {

    public static final String DEFAULT_BASE_URL = "https://api.binance.com";

    private BinancePublicApi publicApi;

    private boolean credentialsAvailable = true;

    public BinanceClient() {
        this(DEFAULT_BASE_URL, null, null);
    }

    public BinanceClient(@Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, null, logLevel);
    }

    public BinanceClient(@Nullable ApiCredentials credentials) {
        this(DEFAULT_BASE_URL, credentials, null);
    }

    public BinanceClient(@Nullable ApiCredentials credentials, @Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, credentials, logLevel);
    }


    public BinanceClient(
            String baseUrl,
            @Nullable ApiCredentials credentials,
            @Nullable Logger.Level logLevel)
    {
        Util.checkNotNull(baseUrl, "The baseUrl must not be null!");

        ApiBuilderFactory apiBuilderFactory = new ApiBuilderFactory(baseUrl);

        Feign.Builder apiBuilder = apiBuilderFactory.createApiBuilder(credentials);

        if (logLevel != null) {
            apiBuilder
                    .logger(new Slf4jLogger(BinanceClient.class))
                    .logLevel(logLevel);
        }

        publicApi = apiBuilder.target(BinancePublicApi.class, baseUrl);

        credentialsAvailable = credentials != null;


    }

    public BinancePublicApi getPublicApi() {
        return publicApi;
    }

    private void failIfNoCredentials(String message){
        if(!credentialsAvailable){
            throw new RuntimeException(message);
        }
    }
}
