package de.elbatya.cryptocoins.bittrexclient;


import de.elbatya.cryptocoins.bittrexclient.api.BlockccPublicApi;
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
public class BlockccClient {

    public static final String DEFAULT_BASE_URL = "https://data.block.cc/api/v1";

    private BlockccPublicApi publicApi;

    private boolean credentialsAvailable = true;

    public BlockccClient() {
        this(DEFAULT_BASE_URL, null, null);
    }

    public BlockccClient(@Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, null, logLevel);
    }

    public BlockccClient(@Nullable ApiCredentials credentials) {
        this(DEFAULT_BASE_URL, credentials, null);
    }

    public BlockccClient(@Nullable ApiCredentials credentials, @Nullable Logger.Level logLevel) {
        this(DEFAULT_BASE_URL, credentials, logLevel);
    }


    public BlockccClient(
            String baseUrl,
            @Nullable ApiCredentials credentials,
            @Nullable Logger.Level logLevel)
    {
        Util.checkNotNull(baseUrl, "The baseUrl must not be null!");

        ApiBuilderFactory apiBuilderFactory = new ApiBuilderFactory(baseUrl);

        Feign.Builder apiBuilder = apiBuilderFactory.createApiBuilder(credentials);

        if (logLevel != null) {
            apiBuilder
                    .logger(new Slf4jLogger(BlockccClient.class))
                    .logLevel(logLevel);
        }

        publicApi = apiBuilder.target(BlockccPublicApi.class, baseUrl);

        credentialsAvailable = credentials != null;


    }

    public BlockccPublicApi getPublicApi() {
        return publicApi;
    }

    private void failIfNoCredentials(String message){
        if(!credentialsAvailable){
            throw new RuntimeException(message);
        }
    }
}
