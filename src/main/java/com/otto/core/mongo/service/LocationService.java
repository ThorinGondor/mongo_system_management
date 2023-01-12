package com.otto.core.mongo.service;

import com.otto.core.mongo.pojo.Location;

import java.util.List;

public interface LocationService {

    Location findOne(String id);

    void insert();

    void delete();

}
