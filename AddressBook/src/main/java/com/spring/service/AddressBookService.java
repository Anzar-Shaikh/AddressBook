package com.spring.service;

import com.spring.DTO.AddressBookDTO;
import com.spring.entities.AddressBook;
import com.spring.repo.AddressBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService {

    final AddressBookRepo addressBookRepo;
    final AddressBook person;

    /**
     *
     * @param addressBookRepo
     * @param addressBook
     */
    @Autowired
    public AddressBookService(AddressBookRepo addressBookRepo, AddressBook addressBook) {
        this.addressBookRepo = addressBookRepo;
        this.person = addressBook;
    }

    /**
     *
     * @return all contacts from repo
     */
    public List<AddressBook> getAllContacts(){
        return addressBookRepo.getAllPersons();
    }

    /**
     *
     * @param id
     * @return  single person from repository
     */

    public AddressBook getSinglePerson(int id){
        return addressBookRepo.getPersonById(id);
    }

    /**
     *
     * @param personDTO
     * @return  saved person in repository
     */
    public AddressBook savePerson(AddressBookDTO personDTO){

        person.id = personDTO.id;
        person.firstName = personDTO.firstName;
        person.lastName = personDTO.lastName;
        person.mobileNumber = personDTO.contactNumber;
        person.village = personDTO.village;
        person.dist = personDTO.dist;
        person.zipCode = personDTO.zipCode;

       return addressBookRepo.saveContact(person);
    }

    /**
     *
     * @param personDTO
     * @param id
     * @return person edited in repository
     */
    public AddressBook editPerson(AddressBookDTO personDTO , int id){
        person.id = id;
        person.firstName = personDTO.firstName;
        person.lastName = personDTO.lastName;
        person.mobileNumber = personDTO.contactNumber;
        person.village = personDTO.village;
        person.dist = personDTO.dist;
        person.zipCode = personDTO.zipCode;
        return  addressBookRepo.editPerson(person);
    }

    /**
     *  delete person provided by user
     * @param id
     */
    public void deletePerson(int id){
         addressBookRepo.deleteContact(id);
    }


}
