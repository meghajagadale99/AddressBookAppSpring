package com.bridgelabz.AddressBookApp.Service;

import com.bridgelabz.AddressBookApp.DTO.AddressbookDTO;
import com.bridgelabz.AddressBookApp.Model.AddressbookData;

import java.util.List;

public interface IAddressbookService {
    List<AddressbookData> getAddressbookData();

    AddressbookData getAddressbookDataById(int personId);

    AddressbookData createAddressbooData(AddressbookDTO addressbookDTO);

    AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO);

    void deleteAddressbooData(int personId);

    List<AddressbookData> sortAddressBookByCity();

    List<AddressbookData> getAddressBookByCity(String city);

    List<AddressbookData> sortAddressBookByState();

    List<AddressbookData> getAddressBookByState(String state);

    List<AddressbookData> sortAddressBookByZip();

    List<AddressbookData> getAddressBookByZip(String zip);

    List<AddressbookData> sortAddressBookByName();

    List<AddressbookData> getAddressBookByFirstName(String first_name);
}
