/**
 * CS 320 Module Three Milestone
 * 
 * File: ContactServiceTest.java
 * 
 * Description:
 * This class contains unit tests for the ContactService class as required by the 
 * CS 320 Module Three Milestone assignment. The assignment involves building 
 * a mobile application's backend logic using in-memory data structures and 
 * verifying its behavior with JUnit tests.
 * 
 * Purpose:
 * The ContactService is responsible for managing contact objects by supporting
 * operations such as adding, updating, and deleting contacts. Each contact
 * must meet specific requirements, including constraints on ID, name, phone number,
 * and address fields.
 * 
 * This test class uses JUnit 5 to validate:
 * - Adding contacts
 * - Preventing duplicate IDs
 * - Deleting contacts
 * - Updating contact fields (first name, last name, phone, and address)
 * 
 * Requirements tested:
 * - Unique, non-updatable contact ID (max 10 characters)
 * - Required, validated fields for first name, last name, phone, and address
 * - Field updates through ContactService methods
 * 
 * Author: Shelby Joiner
 * Date: 07/19/2025
 */

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        contacts.remove(contactId);
    }

    public void updateFirstName(String contactId, String newFirstName) {
        contacts.get(contactId).setFirstName(newFirstName);
    }

    public void updateLastName(String contactId, String newLastName) {
        contacts.get(contactId).setLastName(newLastName);
    }

    public void updatePhone(String contactId, String newPhone) {
        contacts.get(contactId).setPhone(newPhone);
    }

    public void updateAddress(String contactId, String newAddress) {
        contacts.get(contactId).setAddress(newAddress);
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
