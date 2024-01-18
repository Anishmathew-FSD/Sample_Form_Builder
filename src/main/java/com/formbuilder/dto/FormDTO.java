package com.formbuilder.dto;

import lombok.Data;

@Data
public class FormDTO {
    private FormDetailsDTO form;
    private TranslationsDTO translations;
    private LayoutDTO layout;
}
