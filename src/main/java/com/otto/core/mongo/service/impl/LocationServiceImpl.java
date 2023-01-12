package com.otto.core.mongo.service.impl;

import com.otto.core.mongo.pojo.Location;
import com.otto.core.mongo.service.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LocationServiceImpl implements LocationService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Location findOne(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query, Location.class);
    }

    @Override
    public void insert() {

    }

    @Override
    public void delete() {

    }
}
