package com.formbuilder.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "apidto", description = "testing")
public class APIDTO {
    private String name;
    private String valueForm;
    private String value;
}
