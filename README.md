# Java OOP 

### Table of Contents

- [General info](#general-info)
- [Technologies](#technologies)
- [Setup](#setup)
- [Things learned](#things-learned)
>- 4 pillars of object oriented programming.
>- Constructor method
>- Static methods and classes
>- Abstract methods and classes.
>- Polymorphism.
>- Documentation with java Docs.
>- Enums.
>- Inheritance.
>- Data encapsulation.
>- Collections.
- [Commands](#commands)


------------
### General info
This repository contains files and explanations about Java OOP course. In the Java OOP course I reinforced knowledge about OOP and learned new thigs about OOP but oriented to Java. This course taught more about class methods manipulation. The repository contains files such as Doctor, Patient, Nurse, and User. Inside the model folder are the classes used, being User the super class and Nurse, Patient and Doctor classes that inherit from it. ISchedulable is an interface and AppointmentDoctor and AppointmentNurse implement it. All these files are found separately so that the code is modular, all working through the Main class.

------------
### Technologies

- IntelliJ Idea 1.2
- OpenJDK 8

##### Setup

###### IntelliJ IDEA 
- Go to https://www.jetbrains.com/idea/download/ and download the Community version

###### OpenJDK
- Go to https://adoptopenjdk.net/ and download the following version:
    - OpenJDK 8
------------

### Things learned

- UML principles 
- 4 pillars of object oriented programming. Inheritance, Encapsulation, Abstraction and Polymorphism.
- Object analysis and abstraction.
- Properties and behaviors.
- Classes and abstraction.
- Modularity principles.
- Constructor method. It tells the minimum requiered data to create an object from a class. There can be multiple constructor methods for a single class. **public ClassName(String requieredString, int requieredInt){}**. Another example: **public ClasName(){}** this constructor doesn´t requeire any data to create an object.
- Static methods and classes. The keyword static indicates that the particular member belongs to a type itself, rather than to an instance of that type. This means that only one instance of that static member is created which is shared across all instances of the class. Example: public **static** numberOfFriends(){}.
- Abstract methods and classes. Abstract is a non-access modifier in java applicable for classes, methods but not variables. It is used to achieve abstraction which is one of the pillar of Object Oriented Programming(OOP). We can't make an instance of an abstract class. Example: public **abstract** class ExampleClass{}.
- Polymorphisms (overwritting a method). Is the ability of an object to take many forms. We use @Override to indicate this is an overwitten method.
- Documentation with Java Docs.
- Nested classes.
- Ennumearations for constant collections. An enum type is a special data type that enables for a variable to be a set of predefined constants. If it has a constructor method this must be private to prevent the creation of new objects.
- How Map works.
- Inheritance in classes and interfaces (extends). In java we use "extends" to indicate a class or interface inherits from another class or interface.
- Implementation of interfaces in classes.
- Final for constants values.
- Iterations
- Wrappers for making primitive variables into objects.
- Anonymous classes (making instances of an abstract class).
- Data encapsulation. Use of private to achieve this.
- Collections. A collection represents a group of objects, known as its elements.  Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet). We can store, search or sort using java collections.
- Importing classes and packages.


------------
### Commands
Here are some of the most used commands
|  Command | Function  |
| ------------ | ------------ |
| public | Acces modifier. private and default are also access modifiers.  |
| static | Gives global scope. |
| void | The method doesn't return any value.|
| import | Import files. |
| this. | Specifies the variables within a method.|
| get | Gives acces to variables from methods |
| set | Gives acces and ability to modify variables from methods |
| extends | Used for classes and interfaces to inherit from other classes and interfaces, respectively. |
| implements | Used for classes to implement interfaces. |
| enum | Creates a class made of constants. |
| super | Used in methods to specify the variables caming from the super class. |
| scanner | Gives an input made by the user. |


