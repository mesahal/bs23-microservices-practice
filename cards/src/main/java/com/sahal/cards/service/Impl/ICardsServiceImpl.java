package com.sahal.cards.service.Impl;

import com.sahal.cards.dto.CardsDto;
import com.sahal.cards.repository.CardsRepository;
import com.sahal.cards.service.ICardsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ICardsServiceImpl implements ICardsService {

    private CardsRepository cardsRepository;

    @Override
    public void createCard(String mobileNumber) {

    }

    @Override
    public CardsDto fetchCard(String mobileNumber) {
        return null;
    }

    @Override
    public boolean updateCard(CardsDto cardsDto) {
        return false;
    }

    @Override
    public boolean deleteCard(String mobileNumber) {
        return false;
    }
}
