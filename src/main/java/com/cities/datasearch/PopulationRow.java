package com.cities.datasearch;

/**
 * implements population dataset row
 *
 * example
 *
 * Country or Area,Year,Area,Sex,City,City type,Record Type,Reliability,Source Year,Value,Value Footnotes
 * Åland Islands,2013,Total,Both Sexes,MARIEHAMN,City proper,Estimate - de jure,"Final figure, complete",2014,11370
 */
public class PopulationRow {

    public String getCountry() {
        return country;
    }

    private String country;

    public Integer getYear() {
        return year;
    }

    public String getValue() {
        return value;
    }

    private Integer year;
    private String area;
    private String sexes;
    private String city;
    private String cityType;
    private String recordType;
    private String reliability;
    private Integer sourceYear;
    private String value;
    private String footNotes;

    PopulationRow(){
        year = 1900;
        area = "";
        sexes = "";
        city = "";
        cityType = "";
        recordType = "";
        reliability = "";
        sourceYear = 1900;
        value = "";
        footNotes = "";
    }

    PopulationRow(String[] dataRow){
        new PopulationRow();
        country = dataRow[0];
        year = Integer.valueOf(dataRow[1]);
        value = dataRow[9];
    }

}
