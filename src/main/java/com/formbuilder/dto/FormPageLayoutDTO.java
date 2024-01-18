package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class FormPageLayoutDTO {
    private String pageuuid;
    private List<FormRowDTO> rows;
}
