/**
 * CS 320 Module Three Milestone
 * 
 * File: Contact.java
 * 
 * Description:
 * This class defines the Contact object as required by the CS 320 Module Three Milestone assignment.
 * The Contact object represents a single contact within the mobile application's backend system.
 * 
 * Purpose:
 * This class enforces strict validation rules for the following fields:
 * - contactId: Required, must be unique, not updatable, and no longer than 10 characters.
 * - firstName: Required, updatable, and must be no longer than 10 characters.
 * - lastName: Required, updatable, and must be no longer than 10 characters.
 * - phone: Required, updatable, and must be exactly 10 digits.
 * - address: Required, updatable, and must be no longer than 30 characters.
 * 
 * These constraints are enforced in both the constructor and the setter methods.
 * If invalid input is provided, the class throws an IllegalArgumentException.
 * 
 * This object is used by the ContactService class to manage in-memory contact records.
 * 
 * Author: Shelby Joiner
 * Date: 07/19/2025
 */


public class Contact {
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10)
            throw new IllegalArgumentException("Invalid contact ID");
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Invalid first name");
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Invalid last name");
        if (phone == null || phone.length() != 10)
            throw new IllegalArgumentException("Phone number must be exactly 10 digits");
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Invalid address");

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Invalid first name");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Invalid last name");
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10)
            throw new IllegalArgumentException("Phone number must be exactly 10 digits");
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Invalid address");
        this.address = address;
    }
}
