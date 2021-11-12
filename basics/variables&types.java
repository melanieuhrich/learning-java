// primitive (non-object) types in java --
    // byte (number, 1 byte)
    // short (number, 2 bytes)
    // int (number, 4 bytes)
    // long (number, 8 bytes)
    // float (float number, 4 bytes)
    // double (float number, 8 bytes)
    // char (a character, 2 bytes)
    // boolean (true or false, 1 byte)

// java is strong typed, meaning variables need to be defined before we use them



// numbers

// declaring and assigning a number
int myNumber;
myNumber = 5;
// OR combine them
int myNumber = 5;

// defining a double floating point number 
double d = 4.5;
d = 3.0;

// to use float, you will have to cast 
float f = (float) 4.5;
// OR 
float f = 4.5f; 



// characters & strings

// defining a character -- single quotes required
char c = 'g';

// string is a real type, but it's not primitive 

// creating a string with a constructor 
// string object stored in heap memory
String s1 = new String("Who let the dogs out?");

// just using quotation marks creates a string
// string literal stored in string pool 
String s2 = "Who who who who!";

// concatenating strings
// concatenation can only be done with strings and primitives -- never other objects
String s3 = s1 + s2;

// concatenating strings to primitives 
int num = 5;
String s = "I have" + num + "cookies";



// boolean
    // every comparison operator in java will return the type boolean 
    // unlike other languages, it only accepts two special values: true or false

boolean b = false;
b = true;

boolean toBe = false;
b = toBe || !toBe;
if (b) {
    System.out.printIn(toBe);
}

int children = 0;
// Will not work
b = children;
// Will not work
if (children) {
    // Will not work
}

int a;
boolean b = true;
boolean c = false;
a = b + c; 
// will throw an error 
System.out.printIn(a);



// Create all of the primitives (except long and double) with different values. Concatenate them into a string and print it to the screen so it will print: H3110 w0r1d 2.0 true

public class Main {
    public static void main(String[] args) {
        byte zero = 0;
        short a = 3;
        int b = 1;
        char d = ' ';
        float e = 2.0f;
        boolean f = true;
        String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
        System.out.println(output);
    }
}