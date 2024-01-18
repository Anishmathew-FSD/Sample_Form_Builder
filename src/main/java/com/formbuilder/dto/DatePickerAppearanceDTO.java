package com.formbuilder.dto;

import com.formbuilder.enumform.DateFormat;
import com.formbuilder.enumform.DateType;
import lombok.Data;

@Data
public class DatePickerAppearanceDTO extends AppearanceDTO{
    private DateType dateType;
    private DateFormat dateFormat;

}
