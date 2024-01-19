package com.formbuilder.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
@Data
@ApiModel(description = "DTO for representing logic")
public class LogicDTO {
    private String expression;
    private String logicValue;
    @ApiModelProperty(value = "List of questions affected by this logic")
    private List<QuestionDTO> questionDTOS;

}
