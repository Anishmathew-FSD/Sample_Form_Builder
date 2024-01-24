package com.formbuilder.dto;

import lombok.Data;

@Data
public class FilePickerAppearanceDTO {
    private boolean dragAndDrop;
    private boolean previewUploadedFiles;
    private boolean multiFileUploads;
}
