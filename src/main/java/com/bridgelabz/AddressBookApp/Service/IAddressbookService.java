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

    List<AddressbookData> getPersonByName(String personName);

    List<AddressbookData> getPersonByCity(String personCity);

    List<AddressbookData> getPersonByState(String personState);

    List<AddressbookData> getPersonByZipcode(String personZipcode);

    List<AddressbookData> getPersonByPhonenumber(String personPhonenumber);
}
