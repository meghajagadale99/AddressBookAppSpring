package com.bridgelabz.AddressBookApp.Repository;

import com.bridgelabz.AddressBookApp.Model.AddressbookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressbookRepository extends JpaRepository<AddressbookData, Integer> {
}
