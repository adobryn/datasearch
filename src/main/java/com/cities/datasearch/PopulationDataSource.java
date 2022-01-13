package com.cities.datasearch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

@Component
public class PopulationDataSource{
    String testData;

    PopulationDataSource(){
        loadData();
    }

    public void loadData() {
        try {
            File initialFile = new File("src/main/resources/datasources/populations.csv");
            InputStream fileStream = new FileInputStream(initialFile);
            CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(fileStream)).withCSVParser(parser).build();
            List<String[]> r = reader.readAll();
            testData = Arrays.toString(r.get(0));
        }
        catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
