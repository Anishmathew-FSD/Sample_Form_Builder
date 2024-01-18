package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class FormLayoutDTO {
    private List<FormPageLayoutDTO> pages;
}
