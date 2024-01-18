package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class ApiUrlDTO {
    private String url;
    private boolean external;
    private String valueField;
    private String labelField;
    private String pathToItems;
    private List<HeaderDTO> headers;
    private List<ParameterDTO> parameters;
    private List<PathVariableDTO> pathVariables;
}
