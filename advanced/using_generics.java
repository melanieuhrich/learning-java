// generics provide compile-time safety that allows programmers to catch invalid types at compile time 



// when declaring a generic, it must have a data type parameter
List<String> names = new ArrayList<>();



// generics in class declaration
public class YourClass<Class1, Class2>{
    private Class1 bob1;
    private Class2 bob2;
    Abc(Class1 a, Class2 b){
        this.bob1 = a;
        this.bob2 = b;
    }
    public Class1 getBob1(){
        return (this.bob1);
    }
    public Class2 getBob2(){
        return (this.bob2);
    }
}

// in this case, <> is equivalent to <String, Integer>
YourClass<String, Integer> leBobs = new YourClass<>("words", 42);
String a = leBobs.getBob1();
// NOTE: you cannot use primitives for generics unless you use their class version
    // <~~int~~Integer>
    // <~~bool~~Boolean>
int b = letBobs.getBob2();
System.out,printIn("bob1 is '" + a + "', and bob2 is '" + b + "'.")



// Fix the FavoriteClasses class to use generics for it's three variables, 
// favorite1, favorite2, and favorite3, it's constructor, and it's three 
// functions to return each variable, as well as fixing r in the main section.

// Then define a variable of the FavoriteClasses class and use "Hello", 67, 6.3 as 
// the arguments for the constructor, and when you define it use your favorite 
// classes/types that go with the three arguments.

import java.util.*;
public class Main{
    public static class FavoriteClasses<ClassA,ClassB,ClassC>{
        private ClassA favorite1;
        private ClassB favorite2;
        private ClassC favorite3;
        FavoriteClasses(ClassA fav1, ClassB fav2, ClassC fav3){
            this.favorite1=fav1;
            this.favorite2=fav2;
            this.favorite3=fav3;
        }
        public ClassA getFav1(){
            return(this.favorite1);
        }
        public ClassB getFav2(){
            return(this.favorite2);
        }
        public ClassC getFav3(){
            return(this.favorite3);
        }
    }
    public static void main(String[] args){
        List<Double> r=new ArrayList<>();     //can also be double or any other that supports decimals
        r.add(6.3);
        r.add(5.9);
        FavoriteClasses<String, Integer, Double> a=new FavoriteClasses<>("Hello",67,r.get(0)); //same with int
        System.out.println("My favorites are " + a.getFav1() + ", "+ a.getFav2() + ", and " + a.getFav3() + ".");
    }
}