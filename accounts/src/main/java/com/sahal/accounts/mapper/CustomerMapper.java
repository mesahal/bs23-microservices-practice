package com.sahal.accounts.mapper;

import com.sahal.accounts.dto.CustomerDto;
import com.sahal.accounts.entity.Customer;

public class CustomerMapper {
    /**
     * Maps the given {@link Customer} entity to the given {@link CustomerDto} and
     * returns the mapped {@link CustomerDto}.
     *
     * @param customer the {@link Customer} entity to map from
     * @param customerDto the {@link CustomerDto} to map to
     * @return the mapped {@link CustomerDto}
     */
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    /**
     * Maps the given {@link CustomerDto} to the given {@link Customer} entity.
     *
     * @param customerDto the {@link CustomerDto} to map from
     * @param customer the {@link Customer} entity to map to
     * @return the mapped {@link Customer} entity
     */
    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }

}
