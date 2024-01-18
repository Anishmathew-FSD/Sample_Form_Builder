package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class TableDataDTO {
    private String table;
    private String valueField;
    private String labelField;
    private List<CriteriaDTO> criteriaDTOS;
}
