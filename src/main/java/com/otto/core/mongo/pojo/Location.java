package com.otto.core.mongo.pojo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "location")
public class Location {

    private String id;

    private String country;

    private String province;

    private String city;

}
