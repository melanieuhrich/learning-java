// interfaces --
    // are class templates
    // define methods for classes with signatures
    // because this is a template, the method signatures contain no code
    // the code is entered into the implementation of an interface



// two important notes --
    // if a class implements an interface, all of the interface's methods must appear in the class
    // the implements keyword is used when creating a class that is modeled after an interface



// declaring the Animal interface
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

// implementing the Animal interface for unique classes
class Dog implements Animal {
    boolean feed(boolean timeToEat) {
        // pour food into bowl
        return true;
    }
    void groom() {
        // brush well
    }
    void pet() {
        // pet cautiously 
    }
}

class Giraffe implements Animal {
    boolean feed(boolean timeToEat) {
        // point to the trees
        return true;
    }
    void groom() {
        // get a ladder
        // brush well
    }
    void pet() {
        // get a ladder
        // pet cautiously
    }
}

class Tiger implements Animal {
    boolean feed(boolean timeToEat) {
        // toss raw meat into cage
        return true;
    }
    void groom() {
        // tranquilize 
        // brush well
    }
    void pet() {
        // do not pet
    }
}
