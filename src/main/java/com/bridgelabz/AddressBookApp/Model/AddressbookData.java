package com.bridgelabz.AddressBookApp.Model;

import com.bridgelabz.AddressBookApp.DTO.AddressbookDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address_book")
public @Data class AddressbookData {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private String zip;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;


    public AddressbookData(AddressbookDTO addressbookDTO) {
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