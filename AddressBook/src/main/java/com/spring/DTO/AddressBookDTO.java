package com.spring.DTO;

import lombok.Data;

@Data
public class AddressBookDTO {
    public int id;
    public String firstName;
    public String lastName;
    public long contactNumber;
    public String street;
    public String village;
    public String dist;
    public int zipCode;

}
