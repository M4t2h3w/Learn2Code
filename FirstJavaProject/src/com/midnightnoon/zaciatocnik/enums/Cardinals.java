package com.midnightnoon.zaciatocnik.enums;

public enum Cardinals {
    SEVER("S", "sever", "N", "north"),
    JUH("J", "juh", "S", "south"),
    VYCHOD("V", "vychod", "E", "east"),
    ZAPAD("Z", "zapad", "W", "west");

    private String abbrevSk;
    private String lowerSk;
    private String abbrevEng;
    private String lowerEng;

    Cardinals(String abbrevSk, String lowerSk, String abbrevEng, String lowerEng) {
        this.abbrevSk = abbrevSk;
        this.lowerSk = lowerSk;
        this.abbrevEng = abbrevEng;
        this.lowerEng = lowerEng;
    }

    public String getAbbrevSk() {
        return abbrevSk;
    }

    public String getLowerSk() {
        return lowerSk;
    }

    public String getAbbrevEng() {
        return abbrevEng;
    }

    public String getLowerEng() {
        return lowerEng;
    }
}
