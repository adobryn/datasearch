package com.cities.datasearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitiesDataController {

    @Autowired
    PopulationDataSource dataSource;

    @GetMapping("citiesData/search/v1/test")
    public String test(){
        return dataSource.testData;
    }

    @GetMapping("citiesData/search/v1/health")
    public String HealthCheck(){
        return "alive";
    }

    @GetMapping("citiesData/search/v1/population")
    public String GetPopulation(){
        return "12345";
    }
}
