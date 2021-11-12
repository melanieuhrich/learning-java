// compiling code in a file called MyFirstClass.java
javac MyFirstClass.java

// this will create a file called MyFirstClass.class which holds the compiled code

// to run it...
java MyFirstClass



// with arguments
public class Arguments {
    // the argument is an array of strings
    // these are the command line arguments you may pass to your program
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

// to compile and run with arguments --
javac Arguments.java 
java Arguments arg0 arg1 arg2