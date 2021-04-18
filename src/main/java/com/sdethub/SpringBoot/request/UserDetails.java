package com.sdethub.SpringBoot.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetails {
    @NotNull(message = "First Name should not be null")
    @Size(min = 2, message = "First Name should be greater than 2 characters")
    private String firstName;

    @NotNull(message = "Last Name should not be null")
    @Size(min = 2, max = 15, message = "Last name should be accurate")
    private String lastName;

    @NotNull(message = "Email should not be blank")
    @Email
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
