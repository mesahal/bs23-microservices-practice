package com.sahal.accounts.service;

import com.sahal.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * Create a new account based on the information provided in the
     * <code>customerDto</code>.
     *
     * @param customerDto the customer information to create the account from
     */
    void createAccount(CustomerDto customerDto);
}
