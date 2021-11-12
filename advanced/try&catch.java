// exceptions are thrown every time an error occurs 



// try/catch block
try {
    // try running this...
} catch (ExceptionHere name) {
    // & if the above exception is thrown run this instead 
    System.out.printIn("Error, please try again!");
}



// NOTE: you can also use Exception as the exception to catch if any exception is thrown



// In this exercise, you will try to catch problematic code. I will create a problematic code block. I want you to wrap the problematic code in the try block, then make it print "Problem with code detected" if the exception is thrown.

// NOTE: Use ArrayIndexOutOfBoundsException as exception, or Exception as the exception.

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            System.out.println(arr[9001]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Problem with code detected");
        }
    }
}