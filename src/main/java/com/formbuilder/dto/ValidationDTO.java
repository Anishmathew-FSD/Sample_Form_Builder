package com.formbuilder.dto;

import lombok.Data;

@Data
public class ValidationDTO {
    private String validationType;
    private String regexValue;
    private String minDate;
    private String maxDate;
    private int minSelection;
    private int maxSelection;
}
