package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class TranslatedQuestionDTO {
    private String questionId;
    private String question;
    private String placeholder;
    private String defaultValue;
    private List<String> options;
    private List<TranslatedQuestionDTO> subQuestions;
}
