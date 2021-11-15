// abstract classes --
    // a class that contains abstract methods
    // can contain fields which are not 'final' and 'static'
    // cannot be instanciated but can be inherited by another class
    // the inheriting class must implement all the abstract methods or else the subclass should also be declared as abstract

abstract class abstractClass {
    // abstract methods are only declared, not implemented
    abstract void abstractMethod();
    // concrete methods are still allowed
    void concreteMethod() {
        System.out.printIn("This is a concrete method.");
    }
}



// interfaces --
    // abstract classes containing only abstract methods
    // can only contain 'final' and 'static' fields 
    // cannot contain implemented methods
    // when an abstract class implements an interface not all interface methods need to be implemented
    // if the class is not abstract, all the interface methods should be implemented

abstract class X implements Y {
    // implements all but one method of Y
}

class XX extends X {
    // implements the remaining method in Y
}



// Create a subclass of the abstract class and implement the abstract method.
abstract class abstractClass { 
    abstract void abstractMethod(); 
    void concreteMethod() { // concrete methods are still allowed in abstract classes 
        System.out.println("This is a concrete method."); 
    } 
}

class B extends abstractClass { 
    void abstractMethod() { 
        System.out.println("B's implementation of abstractMethod."); 
    } 
}

class C extends abstractClass { 
    // Your code goes here
    void abstractMethod() { 
        System.out.println("C's implementation of abstractMethod."); 
    } 
}

public class Main { 
    public static void main(String args[]) { 
        B b = new B(); 
        b.abstractMethod(); 
        b.concreteMethod();
        C c = new C(); 
        c.abstractMethod(); 
        c.concreteMethod();
    } 
}