package com.bridgelabz.AddressBookApp.DTO;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class AddressbookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Addressbook name is Invalid")
    @NotEmpty(message = "Addressbook name cannot be null")
    public String name;
    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", message = "phonenumber is invalid")
    public String phNumber;


    public AddressbookDTO(String name, String phNumber) {
        this.name = name;
        this.phNumber = phNumber;
    }

    @Override
    public String toString() {
        return "AddressbookDTO{" +
                "name='" + name + '\'' +
                ", phNumber=" + phNumber +
                '}';
    }
}
