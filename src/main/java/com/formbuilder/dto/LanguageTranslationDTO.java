package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class LanguageTranslationDTO {
    private String language;
    private String isoCode;
    private List<TranslatedQuestionDTO> questions;
}
