package com.bridgelabz.AddressBookApp.Controller;

import com.bridgelabz.AddressBookApp.DTO.AddressbookDTO;
import com.bridgelabz.AddressBookApp.DTO.ResponseDTO;
import com.bridgelabz.AddressBookApp.Model.AddressbookData;
import com.bridgelabz.AddressBookApp.Service.IAddressbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressbookController {

    @Autowired
    IAddressbookService addressbooService;

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressbookData() {
        List<AddressbookData> addressbookDataList = null;
        addressbookDataList = addressbooService.getAddressbookData();
        ResponseDTO responseDTO = new ResponseDTO("Get call success", addressbookDataList);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressbookData(@PathVariable(value = "personId") int personId) {
        AddressbookData addressbookData = null;
        addressbookData = addressbooService.getAddressbookDataById(personId);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success for id is successfully", addressbookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressbookData(@Valid @RequestBody AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = addressbooService.createAddressbooData(addressbookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data successfully ", addressbookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressbookData(@PathVariable int personId, @Valid @RequestBody AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = addressbooService.updateAddressbookData(personId, addressbookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll data successfully ", addressbookData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressbookData(@PathVariable("personId") int personId) {
        addressbooService.deleteAddressbooData(personId);
        ResponseDTO responseDTO = new ResponseDTO("Deleted data successfully", "person id: " + personId);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/firstName/{firstName}")
    public ResponseEntity<ResponseDTO> getAddessBookDataByName(@PathVariable("firstName") String personName) {
        List<AddressbookData> personDataList = null;
        personDataList = addressbooService.getPersonByName(personName);
        ResponseDTO respDTO = new ResponseDTO("Get Call for Name Successful", personDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<ResponseDTO> getAddessBookDataByCity(@PathVariable("city") String personCity) {
        List<AddressbookData> personDataList = null;
        personDataList = addressbooService.getPersonByCity(personCity);
        ResponseDTO respDTO = new ResponseDTO("Get Call for City Successful", personDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @GetMapping("/state/{state}")
    public ResponseEntity<ResponseDTO> getAddessBookDataByState(@PathVariable("state") String personState) {
        List<AddressbookData> personDataList = null;
        personDataList = addressbooService.getPersonByState(personState);
        ResponseDTO respDTO = new ResponseDTO("Get Call for State Successful", personDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/zip/{zip}")
    public ResponseEntity<ResponseDTO> getAddessBookDataByZipcode(@PathVariable("zip") String personZipcode) {
        List<AddressbookData> personDataList = null;
        personDataList = addressbooService.getPersonByZipcode(personZipcode);
        ResponseDTO respDTO = new ResponseDTO("Get Call for  Zipcode Successful", personDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/phone/{phone}")
    public ResponseEntity<ResponseDTO> getAddessBookDataByPhonenumber(@PathVariable("phone") String personPhonenumber) {
        List<AddressbookData> personDataList = null;
        personDataList = addressbooService.getPersonByPhonenumber(personPhonenumber);
        ResponseDTO respDTO = new ResponseDTO("Get Call for Phone Number Successful", personDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}