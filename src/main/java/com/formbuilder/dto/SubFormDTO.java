package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class SubFormDTO {
    private String subformId;
    private String formTitle;
    private String description;
    private List<QuestionDTO> questions;
}
