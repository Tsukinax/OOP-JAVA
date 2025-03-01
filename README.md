# Object-Oriented Programming (OOP) in Java

## Introduction
This repository provides an overview of Object-Oriented Programming (OOP) principles in Java, including key concepts, examples, and best practices. OOP is a programming paradigm that uses objects and classes to structure code efficiently.

## Key OOP Concepts in Java
### 1. **Classes and Objects**
- A **class** is a blueprint for creating objects.
- An **object** is an instance of a class.
- Example:
  ```java
  class Car {
      String brand;
      int speed;
      
      void accelerate() {
          speed += 10;
      }
  }

  public class Main {
      public static void main(String[] args) {
          Car myCar = new Car();
          myCar.brand = "Toyota";
          myCar.accelerate();
          System.out.println("Car speed: " + myCar.speed);
      }
  }
  ```

### 2. **Encapsulation**
- Encapsulation is the bundling of data and methods that operate on the data within a class.
- It restricts direct access to some of the object's components.
- Example:
  ```java
  class Person {
      private String name;
      
      public void setName(String newName) {
          this.name = newName;
      }
      
      public String getName() {
          return name;
      }
  }
  ```

### 3. **Inheritance**
- Inheritance allows a class to inherit properties and behavior from another class.
- Example:
  ```java
  class Animal {
      void makeSound() {
          System.out.println("Animal makes a sound");
      }
  }

  class Dog extends Animal {
      void bark() {
          System.out.println("Dog barks");
      }
  }
  ```

### 4. **Polymorphism**
- Polymorphism allows a single interface to be used for different types.
- Example:
  ```java
  class Animal {
      void makeSound() {
          System.out.println("Animal makes a sound");
      }
  }

  class Cat extends Animal {
      void makeSound() {
          System.out.println("Meow");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Animal myAnimal = new Cat();
          myAnimal.makeSound();
      }
  }
  ```

### 5. **Abstraction**
- Abstraction hides implementation details and shows only essential features.
- Example:
  ```java
  abstract class Vehicle {
      abstract void start();
  }

  class Car extends Vehicle {
      void start() {
          System.out.println("Car starts with a key");
      }
  }
  ```

## Best Practices for OOP in Java
- Follow the **Single Responsibility Principle**.
- Use **encapsulation** to protect data.
- Favor **composition over inheritance** when applicable.
- Use **interfaces and abstract classes** appropriately.
- Follow **naming conventions** for better readability.

## How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/OOP-Java.git
   ```
2. Open the project in an IDE like **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the Java files using:
   ```sh
   javac Main.java
   java Main
   ```

## Contributing
Feel free to fork this repository and submit pull requests if you have improvements or additional examples.

## License
This project is licensed under the MIT License.

