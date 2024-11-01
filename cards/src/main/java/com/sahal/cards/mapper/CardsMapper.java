package com.sahal.cards.mapper;

import com.sahal.cards.dto.CardsDto;
import com.sahal.cards.entity.Cards;

public class CardsMapper {

    public static Cards mapToCards(CardsDto cardsDto, Cards cards) {
        cardsDto.setMobileNumber(cards.getMobileNumber());
        cardsDto.setCardType(cards.getCardType());
        cardsDto.setCardNumber(cards.getCardNumber());
        return cards;
    }

    public static CardsDto mapToCardsDto(Cards cards, CardsDto cardsDto) {
        cardsDto.setMobileNumber(cards.getMobileNumber());
        cardsDto.setCardType(cards.getCardType());
        cardsDto.setCardNumber(cards.getCardNumber());
        return cardsDto;
    }
}
