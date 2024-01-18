package com.formbuilder.dto;

import lombok.Data;

import java.util.List;
@Data
public class LogicDTO {
    private String expression;
    private String logicValue;
    private List<SubQuestionDTO> questions;

}
