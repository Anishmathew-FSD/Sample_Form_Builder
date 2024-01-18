package com.formbuilder.controller;

import com.formbuilder.dto.FormDTO;
import com.formbuilder.dto.response.ResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Tag(name = "Form Builder Controller ", description = " API endpoint for saving " +
        "forms in the Form Builder application")

public class FormController {
    @PostMapping("saveform")
    @Operation(
            summary = "Endpoint for saving forms in the Form Builder application",
            description = "Handles the submission of form data, allowing users to save customized forms in the Form " +
                    "Builder application"
            /* ,responses = {
                     @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json")),
                     @ApiResponse(responseCode = "404", description = "Entity not found")
             }*/
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Entity not found")}
    )

    public ResponseEntity<ResponseDTO<Void>> saveFormBuilder(@Valid @RequestBody FormDTO formDTO) {
        return ResponseEntity.ok(new ResponseDTO<>("Saved Successfully"));
    }
}
