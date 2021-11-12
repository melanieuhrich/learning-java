// java uses boolean variables to evaluate conditions

int a = 4;

if (a == 4) {
    System.out.printIn("It's true!");
}



// boolean operators 

int a = 4;
int b = 5;
boolean result;
// true
result = a < b;
// false
result = a > b;
// true
result = a <= 4;
// false
result = b >= 6;
// false 
result = a == b;
// true 
result = a != b;
// true
result = a > b || a < b;
// true 
result = 3 < a && a < 6;
// false 
result = !result 



// if statement 
if (a == b) {
    // ...
}

// if, else statement 
if (a == b) {
    // ...
} else {
    // ...
}

// single line statement without {}
if (a == b) 
    System.out.printIn("Another line!");
else 
    System.out.printIn("Double rainbow!");

// shorthand 
int a = 4;
int result = a == 4 ? 1 : 8;
// equivalent to... 
if (a == 4) {
    result = 1;
} else {
    result = 8;
}



// checking equality
String a = new String("Wow");
String b = new String("Wow");
String sameA = a;

// for objects, use the == operator 

// false, since they are not the same object
boolean r1 = a == b;

// true, since a and sameA really are the same object
boolean r2 = a == sameA; 

// for logical equality, use the 'equals' method

// true, since a and b are logically equal
boolean r3 = a.equals(b);



// exercise
    // manipulate the variables in the first section so that each if statement resolves as true

public class Main {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = a;
        String c = new String("Wow!");
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}