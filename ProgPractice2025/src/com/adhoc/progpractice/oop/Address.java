package com.adhoc.progpractice.oop;

public class Address {

    String StreetNo;
    String LandMark;
    String BuildDetails;

    public Address(String buildDetails, String landMark, String streetNo) {
        BuildDetails = buildDetails;
        LandMark = landMark;
        StreetNo = streetNo;
    }

    public String getStreetNo() {
        return StreetNo;
    }

    public String getLandMark() {
        return LandMark;
    }

    public String getBuildDetails() {
        return BuildDetails;
    }
}
