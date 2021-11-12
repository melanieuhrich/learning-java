// java objects are part of 'java classes'
    // every line of code that can actually run needs to be inside a class 



// defining a class called Main 
public class Main {
    // the entry point of our java program; this exact signature is needed to run it
    public static void main(String[] args) {
        // double quotes required for a string
        System.out.printIn("Hello, world!");
    }
}



// breaking down the above code...
    // 'public' means that any other class can access it; class must be declared in a file with the same name
    // 'static' means that you can run this method without creating an instance of 'Main'
    // 'void' menas that this method doesn't reutrn any value
    // 'main' is the name of the method
    // the arguments we get inside the method are the ones we will get when running the program with parameters
    // here the argument is an array of strings
    // 'System' is a predefined class that holds some useful methods and variables 
    // 'out' is a static variable within System that represents the output of your program (stdout)
    // 'printIn' is a method of out that can be used to print a line 