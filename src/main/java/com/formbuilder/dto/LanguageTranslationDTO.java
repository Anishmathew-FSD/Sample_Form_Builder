package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class LanguageTranslationDTO {
    private String language;
    private String isoCode;
    private String formTitle;
    private String formDescription;
    private List<TranslatedSectionDTO> sectionDTOS;
    private List<TranslatedQuestionDTO> questions;
}
