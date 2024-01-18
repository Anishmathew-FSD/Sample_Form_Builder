package com.formbuilder.dto;

import lombok.Data;

@Data
public class CriteriaDTO {
    private int criteriaId;
    private String tableField;
    private String expression;
    private String option;
    private String optionValue;
    private String operator;
}
