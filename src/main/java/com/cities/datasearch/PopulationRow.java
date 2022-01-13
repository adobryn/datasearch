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
    private Integer year;
    private String area;
    private String sexes;
    private String city;
    private String cityType;
    private String recordType;
    private String reliability;
    private Integer sourceYear;
    private Long value;
    private String footNotes;

    PopulationRow(String[] dataRow){
        country = dataRow[0];
        year = 1;
        value = 2147483648L;
    }

}
