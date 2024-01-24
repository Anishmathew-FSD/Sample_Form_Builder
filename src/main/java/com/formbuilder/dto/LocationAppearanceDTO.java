package com.formbuilder.dto;

import lombok.Data;

@Data
public class LocationAppearanceDTO {
    private  boolean setCurrentPosition;
    private  boolean defaultZoomLevel;
    private  boolean allowFullScreen;
    private String latitude;
    private String longitude;
}
