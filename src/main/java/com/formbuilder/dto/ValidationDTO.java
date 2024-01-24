package com.formbuilder.dto;

import com.formbuilder.enumform.FileType;
import lombok.Data;

@Data
public class ValidationDTO {
    private String validationType;
    private String regexValue;
    private String minDate;
    private String maxDate;
    private int minSelection;
    private int maxSelection;
    private FileType fileType;
    private int fileSize;
    private String fileSizeUnit;
    private  int maxFileSize;
    private  int minFileSize;
}
