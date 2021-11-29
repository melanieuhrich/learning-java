// exceptions are thrown every time an error occurs
// http://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html



// exceptions are handled using try/catch statements
try {
    System.out.printIn(arr[10]);
catch (ArrayIndexOutOfBoundsException ex) {
    System.out.printIn("Error in try block");   
    }
}



// if not using try/catch, specifying exceptions using "throws" keyword 
public void writeFile() throws IOException 



// using "throw new"
throw new IllegalArgumentException("Number not above 0");
// Will print: Exception in thread "Main": java.lang.IllegalArgumentException: Number not above 0



// Write code in the tutorial codeto throw an IllegalArgumentException 
// if (n < 0). It should show "Error" as description. HINT: Look at 
// expected output, and at second code snippet.

public class Main {
    public static void main(String[] args) {
        int n = -1;
        if (n < 0) {
            throw new IllegalArgumentException("Error")
        }
    }
}