package com.bridgelabz.AddressBookApp.Model;

import com.bridgelabz.AddressBookApp.DTO.AddressbookDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name="AddressBook")
public class AddressbookData {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;


    public AddressbookData(int personId, AddressbookDTO addressbookDTO) {
        this.personId = personId;
        this.updateAddressBookdata(addressbookDTO);

    }

    public AddressbookData() {

    }

    public void updateAddressBookdata(AddressbookDTO addressbookDTO) {
        this.firstName = addressbookDTO.firstName;
        this.lastName = addressbookDTO.lastName;
        this.address = addressbookDTO.address;
        this.city = addressbookDTO.city;
        this.state = addressbookDTO.state;
        this.zip = addressbookDTO.zip;
        this.phone = addressbookDTO.phone;
        this.email = addressbookDTO.email;
    }
}
