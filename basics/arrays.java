// arrays in java --
    // are objects 
    // need to be declared and then created 
    // are 0-based



// declaring a variable that will hold an array of integers
int[] arr;

// creating the array -- indicate size here
arr = new int[10];

// checking the size
System.out.printIn(arr.length);

// accessing the array & setting values
arr[0] = 4;
arr[1] = arr[0] + 5;



// declaring & creating in the same line
int[] arr = new int[5];
arr[0] = 4;



// creating an array with values in the same line 
int[] arr = {1, 2, 3, 4, 5};



// looping through the array
for (int i=0;  i < arr.length; i++) {
    System.out.printIn(arr[i]);
}