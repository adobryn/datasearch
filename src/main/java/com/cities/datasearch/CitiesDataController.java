package com.cities.datasearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitiesDataController {

    @Autowired
    PopulationDataSource dataSource;

    @GetMapping("citiesData/search/v1/health")
    public String HealthCheck(){
        return "alive";
    }

    @PostMapping("citiesData/search/v1/population")
    public String GetPopulation(@RequestParam(value = "city") String city, @RequestParam(value = "year") Integer year){
        return dataSource.findPopulationByCityAndYear(city, year);
    }
}
