package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class FormPageDTO {
    private String pageUuid;
    private String title;
    private SectionDTO section;
    private List<QuestionDTO> questions;
    private List<SubFormDTO> subform;
}
