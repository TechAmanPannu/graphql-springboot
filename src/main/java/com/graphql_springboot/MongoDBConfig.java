package com.graphql_springboot;

import com.graphql_springboot.constants.AppConstants;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ReadPreference;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.mapping.Mapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Slf4j
@Configuration
public class MongoDBConfig {

    @SneakyThrows
    @Bean
    public Datastore datastore() {
        log.info("connecting mongodb ... ");
        MongoClient mongo;
        MongoClientSettings mongoClientSettings;
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        mongoClientSettings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry)
                .applyConnectionString(new ConnectionString(AppConstants.MONGO_DB_HOST))
                .readPreference(ReadPreference.primary())
                .build();
        mongo = MongoClients.create(mongoClientSettings);
        final Datastore datastore = Morphia.createDatastore(mongo, "test");
        registerEntities(datastore.getMapper());
        datastore.ensureIndexes();
        return datastore;
    }

    /*
     * Mongodb Entities needs to be registered before use,
     * make sure all used entities are registered here
     * */
    private void registerEntities(Mapper mapper) {

//        mapper.map(Demo.class);

    }

}
