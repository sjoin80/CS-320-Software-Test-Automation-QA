/**
 * CS 320 Module Three Milestone
 *
 * File: ContactTest.java
 *
 * Description:
 * This class contains unit tests for the Contact class required in the Module Three
 * Milestone assignment. The Contact class represents an individual with validated
 * attributes such as contactId, firstName, lastName, phone number, and address.
 *
 * Purpose:
 * These tests confirm that the Contact constructor and setter methods:
 * - Enforce validation rules (e.g., string length, non-null fields)
 * - Correctly throw IllegalArgumentException when invalid input is provided
 *
 * Testing Framework:
 * JUnit 5 is used to test Contact instantiation and setter validation logic.
 *
 * Author: Shelby Joiner
 * Date: 07/19/2025
 */


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("001", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("001", contact.getContactId());
        assertEquals("John", contact.getFirstName());
    }

    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testSettersValidation() {
        Contact contact = new Contact("002", "Jane", "Smith", "0987654321", "456 Elm St");
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("123"));
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
    }
}
