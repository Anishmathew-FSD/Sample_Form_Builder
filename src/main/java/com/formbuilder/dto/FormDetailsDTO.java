package com.formbuilder.dto;

import lombok.Data;

import java.util.List;

@Data
public class FormDetailsDTO {
    private String formTitle;
    private List<FormPageDTO> pages;
}
