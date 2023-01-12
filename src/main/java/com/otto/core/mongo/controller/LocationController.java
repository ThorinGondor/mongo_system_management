package com.otto.core.mongo.controller;

import com.otto.core.mongo.pojo.Location;
import com.otto.core.mongo.response.BasicResponse;
import com.otto.core.mongo.service.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/location")
@Slf4j
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/{id}")
    public BasicResponse<Location> findById(@PathVariable String id) {
        BasicResponse<Location> response = new BasicResponse();
        response.setData(locationService.findOne(id));
        return response;
    }

}
