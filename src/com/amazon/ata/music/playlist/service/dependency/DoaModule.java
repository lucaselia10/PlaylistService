package com.amazon.ata.music.playlist.service.dependency;


import com.amazon.ata.aws.dynamodb.DynamoDbClientProvider;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DoaModule {



    @Singleton
    @Provides
    public DynamoDBMapper provideDynamoDbMapper() {
        return new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient());

    }


}
