package com.cities.datasearch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

@Component
public class PopulationDataSource{
    String testData;
    List<PopulationRow> populationsData;

    Logger logger = LoggerFactory.getLogger(PopulationDataSource.class);

    PopulationDataSource(){
        loadData();
    }

    public void loadData() {
        try {
            //open populations data set and initialize csv reader

            logger.info("Opening file...");
            File initialFile = new File("src/main/resources/datasources/populations.csv");
            InputStream fileStream = new FileInputStream(initialFile);

            CSVParser parser = new CSVParserBuilder().withSeparator(',')
                    .build();

            CSVReader reader = new CSVReaderBuilder(new InputStreamReader(fileStream))
                    .withCSVParser(parser)
                    .build();

            //skip header row
            reader.readNext();

            String[] values = null;
            populationsData = new ArrayList<>();

            //iterate through data file until foot notes section
            while ((values = reader.readNext()) != null && !values[0].contains("footnoteSeqID")){
                //parse the rows
                logger.info(Arrays.toString(values));
                populationsData.add(new PopulationRow(values));
            }

            testData = populationsData.get(0).getCountry();

        }
        catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
