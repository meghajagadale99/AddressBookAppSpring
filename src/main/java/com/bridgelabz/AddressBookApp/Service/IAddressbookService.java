package com.bridgelabz.AddressBookApp.Service;

import com.bridgelabz.AddressBookApp.DTO.AddressbookDTO;
import com.bridgelabz.AddressBookApp.Model.AddressbookData;

import java.util.List;

public interface IAddressbookService {
    List<AddressbookData> getAddressbookData();

    AddressbookData getAddressbookDataById(int personId);

    AddressbookData createAddressbooData(AddressbookDTO addressbookDTO);

    AddressbookData updateAddressbookData(int personId,AddressbookDTO addressbookDTO);

    void deleteAddressbooData(int personId);
}
