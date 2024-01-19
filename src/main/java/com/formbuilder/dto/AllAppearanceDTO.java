package com.formbuilder.dto;

public class AllAppearanceDTO  {
    private TextBoxAppearanceDTO textBoxAppearance;
    private DropDownAppearanceDTO dropDownApperanceDTO;
    // Alternatively, you can have separate setter methods for each appearance type
    public void setTextBoxAppearance(TextBoxAppearanceDTO textBoxAppearance) {
        this.textBoxAppearance = textBoxAppearance;
    }

    public void setDropDownAppearance(DropDownAppearanceDTO dropDownApperanceDTO) {
        this.dropDownApperanceDTO = dropDownApperanceDTO;
    }

    // Getter methods can be added as needed
    public TextBoxAppearanceDTO getTextBoxAppearance() {
        return textBoxAppearance;
    }

    public DropDownAppearanceDTO getDropDownAppearance() {
        return dropDownApperanceDTO;
    }

}
