// Superclass (Parent class)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass (Child class) inheriting from Animal
class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // Call the constructor of the superclass
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to demonstrate inheritance
public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Access methods from both superclass and subclass
        myDog.eat(); // Output: Buddy is eating.
        myDog.bark(); // Output: Buddy is barking.

        // Access the inherited property
        System.out.println("Dog's name: " + myDog.name); // Output: Dog's name: Buddy
        System.out.println("Dog's breed: " + myDog.breed); // Output: Dog's breed: Golden Retriever
    }
}
