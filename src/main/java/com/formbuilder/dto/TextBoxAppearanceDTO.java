package com.formbuilder.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextBoxAppearanceDTO extends AppearanceDTO  {
    private int fontSize;
    private boolean underline;
    private boolean bold;
    private boolean italics;
    private String placeholder;
    private String defaultValue;

}
