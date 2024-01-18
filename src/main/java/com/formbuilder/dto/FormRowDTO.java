package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class FormRowDTO {
    private int rowid;
    private SubFormDTO subform;
    private String sectionid;
    private List<FormColumnDTO> columns;
}
