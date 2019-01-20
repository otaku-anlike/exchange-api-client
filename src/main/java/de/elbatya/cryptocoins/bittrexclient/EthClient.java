package de.elbatya.cryptocoins.bittrexclient;


import de.elbatya.cryptocoins.bittrexclient.api.EthPublicApi;
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
public class EthClient {

    public static final String DEFAULT_BASE_URL = "https://api.etherscan.io/";

    private EthPublicApi publicApi;

    private boolean credentialsAvailable = true;

    public EthClient() {
        this(DEFAULT_BASE_URL, null, null);
    }

    public EthClient(@Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, null, logLevel);
    }

    public EthClient(@Nullable ApiCredentials credentials) {
        this(DEFAULT_BASE_URL, credentials, null);
    }

    public EthClient(@Nullable ApiCredentials credentials, @Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, credentials, logLevel);
    }


    public EthClient(
            String baseUrl,
            @Nullable ApiCredentials credentials,
            @Nullable Logger.Level logLevel)
    {
        Util.checkNotNull(baseUrl, "The baseUrl must not be null!");

        ApiBuilderFactory apiBuilderFactory = new ApiBuilderFactory(baseUrl);

        Feign.Builder apiBuilder = apiBuilderFactory.createApiBuilder(credentials);

        if (logLevel != null) {
            apiBuilder
                    .logger(new Slf4jLogger(EthClient.class))
                    .logLevel(logLevel);
        }

        publicApi = apiBuilder.target(EthPublicApi.class, baseUrl);

        credentialsAvailable = credentials != null;


    }

    public EthPublicApi getPublicApi() {
        return publicApi;
    }

    private void failIfNoCredentials(String message){
        if(!credentialsAvailable){
            throw new RuntimeException(message);
        }
    }
}
