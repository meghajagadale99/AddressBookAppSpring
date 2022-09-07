package com.bridgelabz.AddressBookApp.Service;

import com.bridgelabz.AddressBookApp.DTO.AddressbookDTO;
import com.bridgelabz.AddressBookApp.Exception.AddressbookException;
import com.bridgelabz.AddressBookApp.Model.AddressbookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressbookService implements IAddressbookService {

    List<AddressbookData> addressbookDataList = new ArrayList<>();

    @Override
    public List<AddressbookData> getAddressbookData() {
        return addressbookDataList;
    }

    @Override
    public AddressbookData getAddressbookDataById(int personId) {
        return addressbookDataList.stream()
                .filter(addressbookData -> addressbookData.getPersonId() == personId)
                .findFirst()
                .orElseThrow(() -> new AddressbookException("Person Not found"));
    }

    @Override
    public AddressbookData createAddressbooData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(addressbookDataList.size() + 1, addressbookDTO);
        addressbookDataList.add(addressbookData);
        return addressbookData;
    }

    @Override
    public AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = this.getAddressbookDataById(personId);
        addressbookData.updateAddressBookdata(addressbookDTO);
        addressbookDataList.set(personId - 1, addressbookData);
        return addressbookData;
    }

    @Override
    public void deleteAddressbooData(int personId) {
        int i = 1;
        addressbookDataList.remove(personId - 1);
        for (AddressbookData addressbookData : addressbookDataList) {
            addressbookData.setPersonId(i++);
        }
    }
}