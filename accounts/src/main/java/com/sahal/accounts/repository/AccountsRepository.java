package com.sahal.accounts.repository;

import com.sahal.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    /**
     * Fetches the account for the customer with the given customer id.
     *
     * @param customerId the customer id to fetch the account for
     * @return an optional containing the account for the given customer id
     */
    Optional<Accounts> findByCustomerId(Long customerId);

    /**
     * Deletes the account for the customer with the given customer id.
     *
     * @param customerId the customer id to delete the account for
     */
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);

}