package com.bridgelabz.AddressBookApp.Repository;

import com.bridgelabz.AddressBookApp.Model.AddressbookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressbookRepository extends JpaRepository<AddressbookData, Integer> {
    @Query(value = "select * from AddressBook where firstName like ?1% ", nativeQuery = true)
    List<AddressbookData> findPersonByName(String personName);

    @Query(value = "select * from AddressBook where city like ?1% ", nativeQuery = true)
    List<AddressbookData> findPersonByCity(String personCity);

    @Query(value = "select * from AddressBook where state like ?1% ", nativeQuery = true)
    List<AddressbookData> findPersonByState(String personState);

    @Query(value = "select * from AddressBook where zip like ?1% ", nativeQuery = true)
    List<AddressbookData> findPersonByZipcode(String personZipcode);

    @Query(value = "select * from addressbook_data where phone like ?1% ", nativeQuery = true)
    List<AddressbookData> findPersonByPhonenumber(String personPhonenumber);
}
