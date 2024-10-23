package com.sahal.accounts.repository;

import com.sahal.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    /**
     * Fetches the customer details for the given mobile number.
     *
     * @param mobileNumber the mobile number to fetch the customer details for
     * @return an optional containing the customer details if found, otherwise an empty optional
     */
    Optional<Customer> findByMobileNumber(String mobileNumber);


}
