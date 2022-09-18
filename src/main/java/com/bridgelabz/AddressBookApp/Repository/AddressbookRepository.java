package com.bridgelabz.AddressBookApp.Repository;

import com.bridgelabz.AddressBookApp.Model.AddressbookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressbookRepository extends JpaRepository<AddressbookData, Integer> {
    @Query(value = "select * from address_book order by city", nativeQuery = true)
    List<AddressbookData> sortByCity();

    @Query(value = "select * from address_book where city = :city", nativeQuery = true)
    List<AddressbookData> findAllByCity(String city);

    @Query(value = "select * from address_book order by state", nativeQuery = true)
    List<AddressbookData> sortByState();

    @Query(value = "select * from address_book where state = :state", nativeQuery = true)
    List<AddressbookData> findAllByState(String state);

    @Query(value = "select * from address_book order by zip", nativeQuery = true)
    List<AddressbookData> sortByZip();

    @Query(value = "select * from address_book where zip = :zip", nativeQuery = true)
    List<AddressbookData> findAllByZip(String zip);

    @Query(value = "select * from address_book order by first_name", nativeQuery = true)
    List<AddressbookData> sortByName();

    @Query(value = "select * from address_book where first_name = :first_name", nativeQuery = true)
    List<AddressbookData> findAllByFirstName(String first_name);
}
