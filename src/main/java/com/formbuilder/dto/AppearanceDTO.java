package com.formbuilder.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
// @Schema(name = "appearancedto", description = "testing") for schema swagger
public class AppearanceDTO {
    private String textAlign;
    private String font;
}
