package com.example.sports.db;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {

    @Value("${spring.couchbase.bucket.name}")
    private String loginBucket;

    private Cluster couchbaseCluster;

    @Autowired public Database(Cluster couchbaseCluster) {
        this.couchbaseCluster = couchbaseCluster;
    }

    @Bean
    public Bucket loginBucket() {
        return couchbaseCluster.openBucket(loginBucket);
    }

}
