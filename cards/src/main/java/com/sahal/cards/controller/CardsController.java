package com.sahal.cards.controller;

import com.sahal.cards.dto.ResponseDto;
import com.sahal.cards.service.ICardsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "CRUD REST APIs for Cards in EazyBank",
        description = "CRUD REST APIs in EazyBank to CREATE, UPDATE, FETCH AND DELETE card details"
)
@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Validated
public class CardsController {
    private ICardsService iCardsService;

    @Operation(
        summary = "Create Card REST API",
        description = "REST API to create new card inside EazyBank"
    )
    public ResponseEntity<ResponseDto> createCard() {
        return null;
    }


    public ResponseEntity<ResponseDto> fetchCard() {
        return null;
    }

    public ResponseEntity<ResponseDto> updateCard() {
        return null;
    }

    public ResponseEntity<ResponseDto> deleteCard() {
        return null;
    }



}
