# 1.6.2.1: Java Generic Methods Exercise

## Description

This project demonstrates the use of generic methods in Java. It includes two classes: `Person` and `GenericMethod`. The `GenericMethod` class contains a generic method that accepts various argument types, with one argument specifically defined as a `Person`.

## Classes

### Person

The `Person` class represents a person with the following attributes:
- `name` (first name)
- `surename` (last name)
- `age` (age)

#### Constructor
- `Persona(String name, String surename, int age)`

#### Methods
- `String toString()`: Returns a string representation of the `Person` object.

### GenericMethods

The `GenericMethod` class contains a generic method:
- `public void printGenericArgs(Person argument1 , T argument2 , T argument3)`: 
  - Accepts three arguments: 
    - `argument1`: a `Person`
    - `arg2`: a generic type
    - `arg3`: a generic type
  - Prints the received arguments to the console.

## Main Class

The `Main` class contains the `main` method:
1. Creates an instance of the `Person` class.
2. Calls the `metodeGeneric` method with different types of parameters.

## How to Run

Copy this repositori: https://github.com/ToniR90/1.6-Generics-Nivell2.1.git

## Output

The program prints the received arguments, showcasing the use of generic and non-generic parameters. 
