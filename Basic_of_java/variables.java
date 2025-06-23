/*Instance Variables:

->Definition: Instance variables are declared within a class but outside any methods, constructors, or blocks.
->Lifetime: They are created when an object of the class is instantiated and destroyed when the object is garbage collected.
->Access: Instance variables are accessible throughout the class (inside methods, constructors, etc.) using an object.
->Default Values: They have default values (e.g., 0 for numeric types, false for boolean, null for reference types) if not explicitly initialized.
->Storage: Each object has its own copy of instance variables.
The statement "Each object has its own copy of instance variables" means that instance variables are unique to each object of a class.

When a class is instantiated (i.e., when an object is created from that class), a new memory space is allocated for the instance variables of that specific object
This means:

Different objects of the same class can have different values for their instance variables, as each object has its own copy of them.
Instance variables are not shared between objects of the same class. Each object holds its own set of instance variables, and modifications to one object's instance
 variables do not affect other objects.
*/
class Person {
    String name;  // Instance variable
    int age;      // Instance variable
}

public class variables {
    public static void main(String[] args) {
        // Creating two objects of the Person class
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 25;

        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 30;

        // Each object has its own copy of instance variables
        System.out.println(person1.name + " is " + person1.age + " years old.");
        System.out.println(person2.name + " is " + person2.age + " years old.");
    }
}

/* 
Local Variables:

->Definition: Local variables are declared within methods, constructors, or blocks.
->Lifetime: They are created when the method/block is executed and destroyed when execution leaves the method/block.
->Access: Local variables are only accessible within the method, constructor, or block where they are defined.
->Default Values: Local variables do not have default values. They must be explicitly initialized before use.
->Storage: Local variables exist temporarily during the method execution.

Key Difference:

->Scope: Instance variables have class-level scope, whereas local variables have method/block-level scope.
->Initialization: Instance variables are automatically initialized, while local variables must be initialized before use.
->Instance variables are destroyed when the object is garbage collected
->Local variables are destroyed when the method or block finishes executing.
*/