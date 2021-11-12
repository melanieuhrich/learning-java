// functions --
    // in java, must be defined inside classes
    // also called methods

public class Main {
    public static void foo() {
        // ....
    }
}

// foo --
    // a method we defined in class Main
    / static --
        // means this method belongs to the class Main and not a specific instance of Main
        // to call the method from a different class --
            Main.foo()
    / void --
        // means this method doesn't return a value
        // methods can return a single value in java and it has to be defined in the method declaration
        // however, you can use return by itself to exit the method
        //
    // this method doesn't get any arguments 



// arguments are copied when the method runs 
public void bar(int num1, int num2) {
    // ...
}



// passing arguments
int a = 3;
int b = 5;
// the value of a becomes num1 and the value of b becomes num2
bar(a, b);



// if the arguments are objects 
public void bar2(Student s1, Student s2) {
    // ...
}

Student joe = new Student("Joe");
Student jack = new Student("Jack");

// s1 and joe are now two references to the same object; running methods on s1 will affect joe
bar2(joe, jack);

// changing the VALUE of s1 will not affect the reference joe
s1.setName("Chuck");
// s1 == joe is now false
s1 = new Student("Norris");



// non-static methods --
    // are more common than static methods
    // can only be run on objects and not on the whole class
    // can access and alter the field of the object 

public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

// calling the methods will require an object of type Student
Student s = new Student();
s.setName("Danielle");
String name = s.getName();

// will not work
Student.setName("Bob");

// will not work
Student.getName();



// summary
    // every java method has to be within a class
    // static methods belong to a class while non-static methods belong to objects
    // passing parameters of primitive data types simply copies their value
    // the values of objects are passed by reference



// exercise
    // Write the method printFullName of student which prints the full name of a student.

class Student {
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void printFullName() {
        System.out.println (this.firstName+" "+this.lastName);
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            s.printFullName();
        }
    }
}