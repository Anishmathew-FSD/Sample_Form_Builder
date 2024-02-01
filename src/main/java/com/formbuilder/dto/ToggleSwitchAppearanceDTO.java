package com.formbuilder.dto;

import lombok.Data;

@Data
public class ToggleSwitchAppearanceDTO extends AppearanceDTO{
    private boolean customizeLabel;
    private String labelOn;
    private String labelOff;


}
