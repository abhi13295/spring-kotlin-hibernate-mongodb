package com.outleap.demo.facade

import com.outleap.demo.dto.CustomerDto
import com.outleap.demo.entity.Customer
import com.outleap.demo.service.CustomerService
import org.springframework.stereotype.Component

@Component
class CustomerFacade(
    private val customerService: CustomerService
) {

    fun createCustomerFacade(customerDto: CustomerDto) {
        val customer = Customer()
        customer.contactNumber = customerDto.contactNumber
        customer.email = customerDto.email
        customer.name = customerDto.name
        customerService.createCustomer(customer)
    }
}
