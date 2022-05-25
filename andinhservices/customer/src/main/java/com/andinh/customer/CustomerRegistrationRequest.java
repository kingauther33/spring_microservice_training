package com.andinh.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
