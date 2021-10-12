package com.spring.repo;

import com.spring.entities.AddressBook;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressBookRepo {

    /**
     * create new address book list to store data
     */
    List<AddressBook> addressBookList = new ArrayList<AddressBook>();


    /**
     *
     * @param contact
     * @return
     */
    public AddressBook saveContact(AddressBook contact){
       addressBookList.add(contact);
       return contact;
    }

    /**
     * method to delete the contact
     * @param id
     */
    public void deleteContact(int id){
        addressBookList.removeIf(person -> id == person.id);
    }

    /**
     * method to edit existing person
     * @param editPerson
     * @return updated contact details
     */
    public AddressBook editPerson(AddressBook editPerson ){

        for (AddressBook existingPerson : addressBookList){

            if(existingPerson.id == editPerson.id){
                existingPerson.firstName = editPerson.firstName;
                existingPerson.lastName = editPerson.lastName;
                existingPerson.mobileNumber = editPerson.mobileNumber;
                existingPerson.street = editPerson.street;
                existingPerson.village = editPerson.village;
                existingPerson.dist = editPerson.village;
                return existingPerson;
            }
        }
        return null;
    }

    /**
     *
     * @param id
     * @return get the contact details as per provided id
     */
    public AddressBook getPersonById(int id){

         for(AddressBook person : addressBookList){
             if (person.id == id){
                 return person;
             }
         }
         return null;
    }

    /**
     *
     * @return all the contacts present in the list
     */
    public List<AddressBook> getAllPersons(){
        return addressBookList;
    }
}
