# CS-320-Software-Test-Automation-QA
CS-320 Software Test, Automation QA


CS 320 Project Two – Contact Management Application
Project Overview

This project implements a Java-based contact management system. It demonstrates solid object-oriented design, unit testing, and service-oriented architecture. The goal is to manage a collection of contacts with functionality to add, update, delete, and retrieve contact information efficiently.

Project Files & Purpose
File	Purpose
Contact.java	Defines the Contact class, encapsulating fields such as name, email, and phone number. Includes constructors, getters, setters, and utility methods like toString() and equals().
ContactService.java	Implements a service layer (ContactService) that manages a collection of contacts. Provides methods to add, update, delete, and retrieve contacts, separating business logic from the data model.
ContactTest.java	Contains unit tests for the Contact class to ensure proper construction, field access, and behavior of utility methods.
ContactServiceTest.java	Contains unit tests for the ContactService class to validate operations like adding, updating, deleting, and retrieving contacts. Ensures service reliability and correctness.
CS 320 Project Two.docx	Provides the project instructions, requirements, and portfolio reflection prompts.
Key Concepts Practiced

Object-Oriented Design: Learned to encapsulate data and behavior within classes and separate responsibilities between models and services.

Unit Testing: Strengthened skills in writing automated tests to ensure code correctness and maintainability.

Service-Oriented Architecture: Gained experience separating business logic (ContactService) from data representation (Contact).

Portfolio Development: This project highlights practical Java skills and demonstrates my ability to implement, test, and document a complete application.

How to Run

Compile all Java files:

javac *.java


Execute the tests using JUnit or your preferred Java testing framework.

Reflection

This project reinforced my understanding of core Java programming principles and software engineering best practices. Writing unit tests for both the data model and service layer deepened my appreciation for TDD. The separation of concerns between Contact and ContactService clarified how to design maintainable and scalable applications. This work represents a concrete step in building a portfolio that demonstrates both coding skill and software design competence.
