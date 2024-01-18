package com.formbuilder;

import com.formbuilder.dto.AppearanceDTO;
import com.formbuilder.dto.TextBoxAppearanceDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormBuilderApplication.class, args);
		AppearanceDTO text=new TextBoxAppearanceDTO();

	}

}
