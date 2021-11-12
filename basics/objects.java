// everything in java is within classes and objects

// state 
    // a group variables saved together within a java object
    // called fields or member variables

class Point {
    int x;
    int y;
}

// creating an instance of the class using a default constructor (a constructor that doesn't get arguments)
Point p = new Point();

// defining our own constructor
    // means that we can no longer use the default constructor 'new Point()'
    // we can now only use the defined constructor 'new Point(4, 1)'
class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// we can define more than one constructor, so 'Point' can be created in several ways
class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// 'this' keyword --
    // can be used within a constructor to call a different constructor(in order to avoid code duplication)
    // can only be the first line within the constructor 
    // also used as a reference to the current object we are running on

// now that we have defined p we can access x and y
p.x = 3;
p.y = 6;



// defining methods on 'Point'

class Point {
    int x;
    int y;
    void printPoint() {
        System.out.printIn("(" + x + "," + y + ")");
    }

    Point center(Point other) {
        // returns the center between this point and the other point
        // notice we are using an integer, we won't get an accurate value
        return new Point((x + other.x) / 2, (y + other.y) / 2);
    }
}



// private keyword: when used before a variable or method, means that only the class itself can access that variable or method

// public keyword: means that everybody can access it 



// exercise -- 
    // Write a new method in Point called scale, that will make the point closer by half to (0,0). So for example, point (8, 4) after scale will be (4, 2).

class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }
    
    public void scale(){
        x = x/2;
        y = y/2;
    }
}

public class Main {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}