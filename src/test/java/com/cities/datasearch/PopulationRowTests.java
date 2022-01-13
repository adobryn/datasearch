package com.cities.datasearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PopulationRowTests {
    @Test
    void shouldParseRowFromStringArray(){
        String testRowAsString = "Åland Islands,2013,Total,Both Sexes,MARIEHAMN,City proper,"
                + "Estimate - de jure,Provisional figure,2014,11370,";

        String[] testRowAsArray = testRowAsString.split(",");
        PopulationRow testRow = new PopulationRow(testRowAsArray);

        assertEquals(testRow.getCountry(), "Åland Islands");
        assertEquals(testRow.getYear(), 2013);
        assertEquals(testRow.getCity(), "MARIEHAMN");
        assertEquals(testRow.getValue(), "11370");
    }
}
