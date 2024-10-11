package com.sahal.accounts.service.impl;

import com.sahal.accounts.dto.CustomerDto;
import com.sahal.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    /**
     * Creates a new account for the given customer information.
     *
     * @param customerDto the customer information to create the account from
     */
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
