package com.formbuilder.dto;

import com.formbuilder.enumform.ValueType;
import lombok.Data;

import java.util.List;
@Data
public class ValuesDTO {
    private ValueType valueType;
    private List<String> customValues;
    private String lookupData;
    private TableDataDTO tableDataDTO;
    private ApiUrlDTO apiUrl;
}
