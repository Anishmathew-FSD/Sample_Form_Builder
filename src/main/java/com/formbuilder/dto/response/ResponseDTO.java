package com.formbuilder.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO<T> {

    private Boolean success = true;

    private String message = "";

    private T result;

    public ResponseDTO(T t) {
        this.setResult(t);
    }

    public ResponseDTO(String message) {
        this.message = message;
    }

    public ResponseDTO(String message, T result) {
        this.result = result;
        this.message = message;
    }
}
