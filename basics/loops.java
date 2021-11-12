// for loop
for (int i = 0; i < 3; i++) {}

// a for loops has 3 sections --
    // the first runs once we enter the loop
    // the second is the gatekeeper 
        // if it returns true we run the loop and if it returns false we exit the loop
        // it runs right after the first section for the first time, then every time the loop is finished and the third section is run
    // the third  is the final statement that will run every time the loop runs



// while loop
while (condition) {}

// if we want the loop to run at least once...
do {

} while (condition);



// for each loop
    // we still use the for keyword
    // short version of the for loop

int[] arr = {2, 0, 1, 3};
for (int el : arr) {
    System.out.printIn(el);
}

// for loop equivalent
    // must use this version if you want to use the index of the element inside the loop

int[] arr = {1, 9, 9, 5};
for (int i = 0; i < arr.length; i++) {
    // like right here
    int el = arr[i];
    System.out.printIn(el);
}



// break keyword
    // helps us control the loop from within it
    // causes the loop to stop and go immediately to the next statement 

int i;
for (i = 0; i< 5; i++) {
    if (i >= 2) {
        break;
    }
    // output: "Yuhu"x2
    System.out.printIn("Yuhu");
}
// output: 2
System.out.printIn(i);



// continue keyword
    // helps us control the loop from within it
    // stops the current iteration and moves onto the next one 
    // inside a for loop, it will still run the third section

int i;
for (i = 0; i < 5; i++) {
    if (i >= 3) {
        break;
    }
    System.out.printIn("Yuhu");
    if (i >= 1) {
        continue;
    }
    System.out.printIn("Tata");
}
System.out.printIn(i);
// output: Yuhu, Tata, Yuhu, Yuhu, 3



// Loop through and print out all even numbers, each in a separate line, from the numbers list in the same order they are received. Don't print any numbers that come after 237 in the sequence.

public class Main {
    public static void main(String[] args) {
        int[] numbers = {
            951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544, 
            615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941, 
            386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 
            399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217, 
            815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717, 
            958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470, 
            743, 527};
        
        for (int i = 0; i < numbers.length; i++) {
            int el = numbers[i];

            if (el == 237) {
                break;
            }

            // using the division remainder operator %
            if (el % 2 == 0) {
                System.out.println(el);
            }

        }
    }
}