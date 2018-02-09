package com.example.sports.services;

import com.couchbase.client.java.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private Bucket bucket;

    @Autowired public MainService(Bucket bucket) {
        this.bucket = bucket;
    }
}
