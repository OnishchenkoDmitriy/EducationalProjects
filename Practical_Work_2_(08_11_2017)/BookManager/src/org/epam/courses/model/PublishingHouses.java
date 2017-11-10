package org.epam.courses.model;

public enum PublishingHouses {

    PUBL_HOUSE_1("RELX Group"),
    PUBL_HOUSE_2("Woongjin ThinkBig"),
    PUBL_HOUSE_3("Saraiva"),
    PUBL_HOUSE_4("OLMA Media Group"),
    PUBL_HOUSE_5("WEKA");

    private String publHouseName;

    PublishingHouses(String publHouseName){
        this.publHouseName = publHouseName;
    }

    public String getPublHouseName() {
        return publHouseName;
    }

}
