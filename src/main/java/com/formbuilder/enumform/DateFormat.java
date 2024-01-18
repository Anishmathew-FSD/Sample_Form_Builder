package com.formbuilder.enumform;

public enum DateFormat {
    DD_MM_YYYY("dd/MM/yyyy"),
    MM_DD_YYYY("MM/dd/yyyy"),
    YYYY_MM_DD("yyyy/MM/dd");

    private final String format;

    DateFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

}
