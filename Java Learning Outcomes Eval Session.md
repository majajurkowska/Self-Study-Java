# Welcome to the Learning Outcomes Evaluation

Dear students,

Welcome to this Learning Outcomes Evaluation session. Over the next two hours, we will be assessing your understanding 
and mastery of the learning outcomes for this semester. This evaluation is an important opportunity for you to showcase your knowledge and skills.

Please take this evaluation seriously and demonstrate your best work from the last two weeks by using your personal git account as proof. 
Remember to answer each question thoroughly and provide clear explanations where necessary.

Best regards,
Ghada Hassan and Kay Berkling

## Ethics Section regarding generative and other forms of AI

The student acknowledges and agrees that the use of AI is strictly prohibited during this evaluation. 
By submitting this report, the student affirms that they have completed the assessment independently and without the assistance of any AI technologies. 
This agreement serves to ensure the integrity and authenticity of the student's work, as well as their understanding of the learning outcomes.


## Checklist before handing in your work

- [ ] Review the assignment requirements to ensure you have completed all the necessary tasks.
- [ ] Pay careful attention to the requested links that must come from your project.
- [ ] Double-check your links and make sure that links lead to where you intended. Each answer should have links to work done by you in your own git repository
- [ ] Make sure you have at least 10 references to your project code (This is important evidence to prove that your project is substantial enough to support the 
- learning outcome of object oriented design and coding within a larger piece of code.)
- [ ] Include comments to explain your referenced code and why it supports the learning outcome
- [ ] Proofread any accompanying documentation or comments for grammar and clarity.
- [ ] Commit and push this markup file to your personal git repository and hand in the link and a hard-copy via email at the end of the exam.

Remember, this checklist is not exhaustive, but it should help you ensure that your work is complete, well-structured, and meets the required standards.

Good luck with your evaluation!


## Learning Outcomes

| Exam Question | Total Achievable Points | Points Reached During Grading |
|---------------|------------------------|-------------------------------|
| Algorithms    |           4            |                               |
| Data types    |           4            |                               |
| Complex Data Structures |  4            |                               |
| Concepts of OOP |          6            |                               |
| OO Design     |           6            |                               |
| Class concepts |            8           |                               |
| Testing       |           6            |                               |
| Operator/Method Overloading | 6 |                               |
| Templates/Generics |       6            |                               |
| Class libraries |          6            |                               |
| Multi-threading |          6            |                               |
| Lambda expressions |       6            |                               |
| Serialization |            6           |                               |
| Database connectivity |   6            |                               |
| Total        |           80          |                               |



## Evaluation Questions

Please answer the following questions to the best of your ability to show your understanding of the learning outcomes. 
Please provide examples from your project code to support your answers. Only links to your own git will count. 
When you explain what you did make sure to explain why you did it this way with clear reasoning relating to your own work and not generic statements that anyone could make. 

## Evaluation Material


### Algorithms

Algorithms are manyfold and Java can be used to program these. Examples are sorting or search strategies but also mathematical calculations. 
Please refer to **two** areas in either your regular coding practice or within your project, where you have coded an algorithm. 
Do not make reference to code written for other classes, like theoretical informatics.

ANSWER
So here i learned how to use comparator in order to sort things with our own logic/a simple algorithm
so in my case my method switched places of i and j if the second number of my number i (if i have 29 then i was checking 9 etc.)
was bigger than the one of j and then I passed that comparator to the sort method to sort my ArrayList

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/ComparatorVsComparable.java


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |


### Data types

Please explain the concept of data types and provide examples of different data types in Java.
Typical data types in java are int, double, float, char, boolean, long, short, byte, String, and arrays. 
Please provide one example for each of the **three** following data types in your code. One of these links must be to your project.
* Array
* Strings
* boolean

Regarding the link to your project, explain the context in which you have used this data type being specific to your project. 

ANSWER
So in java we have primitive and non-primitive data types. Primitive data types include byte(for storing a small range of numbers 1 byte I think), 
short(for storing numbers with range smaller than int), int, long(for storing numbers with a wider range than int), 
char(for storing single characters i think it was taking 2 bits in java because they support different languages), 
float(for storing floating point numbers like 4,6f), double(takes double memory of float and is also for storing floating point numbers) and boolean(stores true and false).
And non-primitive ones are Strings and arrays. The difference being that the primitive ones are more predefined and the non-primitive ones being 
more customizable.

from exercises
https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/PrimitiveDataTypes.java
https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/StringIntro.java

and from the project(it's hard to choose a specific file because we use data types anywhere we go in java)
so here for example i used a lot of String data type which is the non-primitive data type and also a class
https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/library_management_spring/library-management/src/main/java/com/example/librarymanagement/model/Book.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           1            |                               |
|           1           |                               |
|           2 (project link)          |                               |



### Complex Data Structures

Examples of complex data structures in Java are ArrayList, HashMap, HashSet, LinkedList, and TreeMap. 
Please provide an example of how you have used **two** of these complex data structures in your code and explain why you have chosen these data structures. 
Examples do not have to come from the project.

ANSWER
I learned in the links below about 
ArrayLists and HashMap (and Hashtable - which i learned its almost same as HashMap but its synchronized so good when we're working with threads)
This was a part of the course i chose to follow and i think something every beginner learns.

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/ArrayList.java
https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/HashMapAndHashtable.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |



### Concepts of OOP
Concepts of OOP are the basic building blocks of object-oriented programming, such as classes, objects, methods, and attributes. 
Explain HOW and WHY your **project** demonstrates the use of OOP by using all of the following concepts:
* Classes/Objects
* Methods
* Attributes 
Link to the code in your project that demonstrates what you have explained above.

ANSWER
Here used classes - my book class
have here multiple methods like my constructors, getters and setters
and attributes like title or author

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/library_management_spring/library-management/src/main/java/com/example/librarymanagement/model/Book.java


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|          2              |                               |
|          2              |                               |
|          2              |                               |



### OO Design
Please showcase **two** areas **where** you have used object orientation in your project. (How and why you use it will be the next question below.)
Examples in Java of good oo design are composition, encapsulation, inheritance, polymorphism, and abstraction. 

ANSWER
In the linked file below we have multiple examples of those topics. for example:
- where my class Book implements the interface Serializable that's an example of inheritance, my class inherits the methods of this interface and overrides them
also inherits other properties of the interface
- we also have here an example of encapsulation were the private vars and encapsulated in the getters and setters methods
- if my class didn't implement all the methods of the interface it would need to be abstract
- i think method overriding was also an example of polymorphism, but also in the first link we have polymorphism through the dependency injection

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/library_management_spring/library-management/src/main/java/com/example/librarymanagement/LibraryManagementApplication.java
https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/library_management_spring/library-management/src/main/java/com/example/librarymanagement/model/Book.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|              3         |                               |
|              3         |                               |



### Advanced Class Concepts
Advanced class concepts include constructors, abstract classes, interfaces, access modifiers, static methods, and variables. 
Please provide an example of how you have used **two** of these class concepts in your **project** code and explain why you have chosen these 
class concepts and how they work within your code.

ANSWER
so in this file of my project i have multiple of those concepts: 
- i have a constructor for my book class (both a default one and one with parameters/parameterized constructor)
that allows to create new objects with the help of this constructor in the case of the parameterized one already setting some values for variables
- i have a Serializable interface implemented by my book class
- i have access modifiers(getters and setters) for my private vars in my book class
  this allows interacting with the private variables using those methods which restricts the usage

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/library_management_spring/library-management/src/main/java/com/example/librarymanagement/model/Book.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|            4           |                               |
|            4           |                               |

### Testing
Java code is tested by using JUnit. Please explain how you have used JUnit in your project and provide a link to the code where you have used JUnit. 
Links do not have to refer to your project and can refer to your practice code. If you tested without JUnit, please explain how you tested your code.
Be detailed about what you are testing and how you argue for your test cases. 
Test cases usually cover the following areas:
* boundary cases
* normal cases
* error cases / catching exceptions 

ANSWER 
As a part of my course i covered among other things try and catch (also other things like throw, throws, custom exceptions but i think just one link here)
so try and catch is a good way of noticing those exceptions/errors and  handling them in the try block we put our statements usually 
the critical statement and try to execute it and in the catch block we create an instance/an object of an exception we are executing 
and handling it so the code can keep executing and not breaking down.
we also have a hierarchy of handling exceptions from the most specific ones(children) to most broad(parents)

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/TryCatch.java



| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Operator/Method Overloading
An example of operator overloading is the "+" operator that can be used to add two numbers or concatenate two strings. 
An example of method overloading is having two methods with the same name but different parameters. 
Please provide an example of how you have used operator or method overloading in your code and explain why you have chosen this method of coding.
The link does not have to be to your project and can be to your practice code.

ANSWER
So here i have an example of method overloading where i made three add methods each with different number of parameters 
or also type of parameters (like int, double)
depending on what arguments we pass, java will know which add method functionality to apply
i chose it because it was a part of my course i watched but also a straight forward and simple way of showing method overloading

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/MethodOverloading.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



### Generics
Generics in java are used to create classes, interfaces, and methods that operate on objects of specified types. 
Please provide an example of how you have used generics in your code and explain why you have chosen to use generics. 
The link does not have to be to your project and can be to your practice code.

ANSWER
Here in my project created a generic type List<Book> that can only handle/take in a book class object to ensure stability and that correct info is passed

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/library_management_spring/library-management/src/main/java/com/example/librarymanagement/service/LibraryService.java

Also here i used it for List<Integer> and Comparator<StudentInfo> to specify what return i want to work with

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/ComparatorVsComparable.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Class Libraries
Examples of class libraries in java are the Java Standard Library, JavaFX, Apache Commons, JUnit, Log4j, Jackson, Guava, Joda-Time, Hibernate, 
Spring, Maven, and many more. Please provide an example of how you have used a class library in your **project** code and explain why you have chosen 
to use this class library. 

ANSWER
I used spring and maven for my project 

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/library_management_spring/library-management/pom.xml

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6           |                               |

### Multi-threading
multi-threading is the ability of a CPU to execute multiple processes or threads concurrently. 
Please explain the concept of multi-threading and provide an example of how you have used multi-threading in your code. 
The link does not have to be to your project and can be to your practice code.


ANSWER
as stated above its the ability of a CPU to execute multiple processes or threads concurrently, meaning one process or task will not wait for the other one
to be done before it starts executing. they share the time they are being executed in and they take turns in a sense 

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/MultipleThreads.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Lambda Expressions
An example of a lambda expression is the following code: 
```java
List<String> list = new ArrayList<>();
list.forEach((String s) -> System.out.println(s));
```
Please explain the concept of lambda expressions and provide an example of how you have used lambda expressions in your code. 
The link does not have to be to your project and can be to your practice code.

ANSWER
lambda expression is something that only works with functional interfaces (interfaces with one method)
its a way of writing code shorter and simpler but not writing parts of code that the jdk will assume are there because its implied
we dont need to for example specify the arguments type, if we have one argument we skip on brackets 
we also skip on the name of the method and explicit creating an instance like in my case new L() so we are working with anonymous object im pretty sure

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/src/LambdaExpression.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|           6            |                               |


### Serialization

Serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file. 
Please explain why you would use serialization and provide an example of how you have used serialization in your code. 
The link does not have to be to your project and can be to your practice code.

ANSWER
i used serialization for my book class so that my book objects are converted into JSON format for easier storage/communication 

https://github.com/majajurkowska/Self-Study-Java/blob/main/Java%20Projects/library_management_spring/library-management/src/main/java/com/example/librarymanagement/model/Book.java

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6          |                               |


### Database Connectivity
Web applications use databases to store data. Please explain how you have connected to a database in your project and provide 
an example of how you have used database connectivity in your code. The link does not have to be to your project and can be to your practice code. 
Do not use code from other classes, like database programming, Web Engineering, or theoretical informatics.
This topic appeared in your learning agreement as the last point in the table under advanced topics.

*your text*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



