package com.bridgelabz.AddressBookApp.Model;

import com.bridgelabz.AddressBookApp.DTO.AddressbookDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AddressbookData {
    private int personId;
    private String name;
    private String phNumber;

    public AddressbookData(int personId, AddressbookDTO addressbookDTO) {
        this.personId = personId;
        this.name = addressbookDTO.name;
        this.phNumber = addressbookDTO.phNumber;
    }
}
