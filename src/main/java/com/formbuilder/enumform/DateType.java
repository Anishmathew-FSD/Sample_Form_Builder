package com.formbuilder.enumform;

public enum DateType {
    DATE_ONLY("Date Only"),
    TIME_ONLY("Time Only"),
    DATE_AND_TIME("Date and Time"),
    DATE_RANGE("Date Range");
    private final String format;

    DateType(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
