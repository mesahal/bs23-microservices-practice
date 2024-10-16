package com.sahal.accounts.mapper;

import com.sahal.accounts.dto.AccountsDto;
import com.sahal.accounts.entity.Accounts;

public class AccountsMapper {
    /**
     * Maps the given {@link Accounts} entity to the given {@link AccountsDto} and
     * returns the mapped {@link AccountsDto}.
     *
     * @param accounts the {@link Accounts} entity to map from
     * @param accountsDto the {@link AccountsDto} to map to
     * @return the mapped {@link AccountsDto}
     */
    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    /**
     * Maps an {@link AccountsDto} to an {@link Accounts} instance.
     * @param accountsDto the source
     * @param accounts the target
     * @return the target with its fields set to the values of the source
     */
    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }

}
