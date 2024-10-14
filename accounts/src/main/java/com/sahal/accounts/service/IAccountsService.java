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


    /**
     * Fetches the account details for the customer with the given mobile number.
     *
     * @param mobileNumber the mobile number to fetch the account details for
     * @return the account details for the customer
     */
    CustomerDto fetchAccountDetails(String mobileNumber);


    boolean updateAccountDetails(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
