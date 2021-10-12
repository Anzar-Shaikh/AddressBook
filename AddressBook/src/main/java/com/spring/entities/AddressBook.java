package com.spring.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AddressBook {
    public int id;
    public String firstName;
    public String lastName;
    public long mobileNumber;
    public String street;
    public String village;
    public String dist;
    public int zipCode;

}
