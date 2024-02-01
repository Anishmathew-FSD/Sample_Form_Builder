package com.formbuilder.dto;

import com.formbuilder.enumform.ElementType;
import lombok.Data;

import java.util.List;
@Data
public class QuestionDTO {
    private String questionId;
    private String question;
    private boolean required;
    private ElementType elementType;
   private PropertiesDTO properties;
    private List<LogicDTO> logic;
}
