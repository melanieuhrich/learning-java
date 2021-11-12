// inheritance --
    // the adoption of all non-private properties and methods of one class (superclass) by another class (subclass)
    // making a copy of an existing class as the starting point for another
    // inherited classes are also called derived classes
    // the definition of a subclass uses the extends keyword 
    // there is no effective limit to the number of inheritance levels
    // methods and properties of a superclass can be overridden within its subclass
    // a superclass should be written as generically as possible, then subclasses can be created from it with more defined purposes



// superclass Door with an open method
public class Door {
    public void open ()
    {
        push();
    }
}

// subclass BankVaultDoor with more specific instructions
class BankVaultDoor extends Door {
    public void open() {
        enterCombination();
        pull;
    }
}

// a method that opens several types of doors
public class Main {

    public static void main(String[] args) {
        Door d1 = new BankVaultDoor();
        Door d2 = new HouseFrontDoor();
        Door d3 = new CarDoor();
    }

    if (arg[0] == "car") {
        d3.open();
    } else if (arg[0] == "bank") {
        d1.open();
    } else {
        d2.open();
    }
}



// Create a house front door class which inherits from the Door class and open it. 
// Assume the house door has a locked doorknob and it swings into the house. 
// Hint: Your code should use the super keyword.
    public class Door {
        public void open ()
        {
            push();
        }
    }

    class BankVaultDoor extends Door {
  
        public void open () {
            enterCombination();
            pull;
        }
  
    }

    class HouseFrontDoor extends Door {

        public void open () {
            insertKeyAndTurnKnob();
            super.push();
        }

    }