# Design Modelling in Java

A comprehensive collection of **Object-Oriented Design Principles** and **GoF Design Patterns** implemented using Java. This repository demonstrates how software design principles and design patterns can be applied to create scalable, maintainable, reusable, and loosely coupled applications.

---
## Overview

This repository contains practical implementations of core **Software Design Principles** and **Design Patterns** using Java. The goal is to understand how these concepts help in developing clean, flexible, and extensible software systems.

---
## Topics Covered

### Design Principles

#### DRY (Don't Repeat Yourself)
Avoid duplication of code by extracting common functionality into reusable methods and classes.

#### YAGNI (You Aren't Gonna Need It)
Implement only the functionality that is currently required and avoid unnecessary complexity.

### SOLID Principles

#### Single Responsibility Principle (SRP)
A class should have only one reason to change.

#### Open Closed Principle (OCP)
Software entities should be open for extension but closed for modification.

#### Liskov Substitution Principle (LSP)
Derived classes should be replaceable with their base classes without affecting program correctness.

#### Interface Segregation Principle (ISP)
Clients should not be forced to depend on interfaces they do not use.

#### Dependency Inversion Principle (DIP)
High-level modules should depend on abstractions rather than concrete implementations.

---

## Design Patterns
### Creational Patterns

#### Singleton Pattern
Ensures that only one instance of a class exists and provides a global access point to it.

#### Factory Pattern
Provides an interface for creating objects without exposing the object creation logic.

#### Builder Pattern
Constructs complex objects step by step while keeping the construction process separate from representation.

---
### Structural Patterns
#### Decorator Pattern
Dynamically adds new functionality to objects without modifying their existing code.

---
### Behavioral Patterns
#### Observer Pattern
Defines a one-to-many dependency between objects so that when one object changes state, all dependent objects are notified automatically.

---
## Project Structure

```text
Design_Modelling
│
├── Design_Principles
│   ├── DRY
│   ├── YAGNI
│   └── SOLID_Principles
│       ├── SingleResponsibilityPrinciple
│       ├── OpenClosedPrinciple
│       ├── LiskovSubstitutionPrinciple
│       ├── InterfaceSegregationPrinciple
│       └── DependencyInversionPrinciple
│
└── Design_Patterns
    ├── Creational_Patterns
    │   ├── SingletonPattern
    │   ├── FactoryPattern
    │   └── BuilderPattern
    │
    ├── Structural_Patterns
    │   └── DecoratorPattern
    │
    └── Behavioral_Patterns
        └── ObserverPattern
```

---

## Featured Project

### School District Children's Library

A mini library management system developed by applying multiple design patterns and software design principles.

**Patterns Used:**

- Singleton Pattern
- Factory Pattern
- Abstract Factory Pattern
- Builder Pattern
- Decorator Pattern
- Observer Pattern

**Principles Applied:**

- DRY
- YAGNI
- SOLID Principles

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Design Principles
- Design Patterns
- Maven
- JUnit
- Git
- GitHub

---

## How to Run

### Compile Java File

```bash
javac FileName.java
```

### Run Java Program

```bash
java FileName
```

### Example

```bash
javac Main.java
java Main
```

---

## Learning Outcomes

- Understand core software design principles.
- Learn the importance of low coupling and high cohesion.
- Apply SOLID principles in real-world scenarios.
- Implement commonly used design patterns in Java.
- Improve code maintainability, scalability, and reusability.
- Build flexible and extensible software systems.
- Follow object-oriented design best practices.

---

## Author
**Anushka Gupta**  
B.Tech – Computer Science Engineering

---
### Repository Purpose
This repository serves as a learning resource and practical reference for understanding **Design Principles** and **Design Patterns** in Java through hands-on implementation and real-world examples.
