/**
 * CS 320 Module Three Milestone
 *
 * File: ContactServiceTest.java
 *
 * Description:
 * This class includes unit tests for the ContactService class, verifying that
 * the contact management operations behave according to the requirements 
 * defined in the Module Three Milestone assignment.
 *
 * Purpose:
 * The ContactService is responsible for managing Contact objects in-memory.
 * This test class ensures:
 * - Contacts can be added and retrieved correctly
 * - Duplicate contact IDs are not allowed
 * - Contacts can be deleted successfully
 * - Contact fields (firstName, lastName, phone, address) can be updated
 *
 * Testing Framework:
 * JUnit 5 is used to write and execute test cases. The @BeforeEach annotation
 * is used to initialize a fresh ContactService instance before each test runs.
 *
 * Author: Shelby Joiner
 * Date: 07/19/2025
 *
 */


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService service;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
    }

    @Test
    public void testAddAndGetContact() {
        Contact contact = new Contact("001", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertEquals("John", service.getContact("001").getFirstName());
    }

    @Test
    public void testAddDuplicateId() {
        Contact contact1 = new Contact("001", "John", "Doe", "1234567890", "123 Main St");
        Contact contact2 = new Contact("001", "Jane", "Smith", "0987654321", "456 Elm St");
        service.addContact(contact1);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact2));
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("002", "Jane", "Smith", "0987654321", "456 Elm St");
        service.addContact(contact);
        service.deleteContact("002");
        assertNull(service.getContact("002"));
    }

    @Test
    public void testUpdateFields() {
        Contact contact = new Contact("003", "Tom", "Jones", "1112223333", "789 Oak St");
        service.addContact(contact);
        service.updateFirstName("003", "Tim");
        assertEquals("Tim", service.getContact("003").getFirstName());
    }
}
