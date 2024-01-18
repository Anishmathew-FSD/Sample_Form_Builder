package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class TranslationsDTO {
    private List<LanguageTranslationDTO> languages;
}
