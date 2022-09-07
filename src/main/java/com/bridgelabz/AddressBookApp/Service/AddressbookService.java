package com.bridgelabz.AddressBookApp.Service;

import com.bridgelabz.AddressBookApp.DTO.AddressbookDTO;
import com.bridgelabz.AddressBookApp.Exception.AddressbookException;
import com.bridgelabz.AddressBookApp.Model.AddressbookData;
import com.bridgelabz.AddressBookApp.Repository.AddressbookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressbookService implements IAddressbookService {

    @Autowired
    private AddressbookRepository addressbookRepository;

    List<AddressbookData> addressbookDataList = new ArrayList<>();

    @Override
    public List<AddressbookData> getAddressbookData() {
        return addressbookRepository.findAll();
    }

    @Override
    public AddressbookData getAddressbookDataById(int personId) {
        return addressbookRepository
                .findById(personId)
                .orElseThrow(() -> new AddressbookException("Person with perssonId " + personId + " doesnot exists"));
    }

    @Override
    public AddressbookData createAddressbooData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(addressbookDTO);
        log.debug("AddressbookData: " + addressbookData.toString());
        return addressbookRepository.save(addressbookData);
    }

    @Override
    public AddressbookData updateAddressbookData(int personId, AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = this.getAddressbookDataById(personId);
        addressbookData.updateAddressBookdata(addressbookDTO);
        return addressbookRepository.save(addressbookData);
    }

    @Override
    public void deleteAddressbooData(int personId) {
        AddressbookData addressbookData = this.getAddressbookDataById(personId);
        addressbookRepository.delete(addressbookData);
    }

    @Override
    public List<AddressbookData> getPersonByName(String personName) {
        return addressbookRepository.findPersonByName(personName);
    }

    @Override
    public List<AddressbookData> getPersonByCity(String personCity) {
        return addressbookRepository.findPersonByCity(personCity);
    }

    @Override
    public List<AddressbookData> getPersonByState(String personState) {
        return addressbookRepository.findPersonByState(personState);
    }

    @Override
    public List<AddressbookData> getPersonByZipcode(String personZipcode) {
        return addressbookRepository.findPersonByZipcode(personZipcode);
    }

    @Override
    public List<AddressbookData> getPersonByPhonenumber(String personPhonenumber) {
        return addressbookRepository.findPersonByPhonenumber(personPhonenumber);
    }
}
