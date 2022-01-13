package com.cities.datasearch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitiesDataController {

    @GetMapping("citiesData/search/v1/population")
    public String test(){
        return "test";
    }
}
