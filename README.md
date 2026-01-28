import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Vehicle { 
    void bike() {
        System.out.println("I like Bike"); 
}

class Car extends Vehicle {
    void car() { 
        System.out.println("I love cars"); 
    }
    void cycle() {
        System.out.println("I have cycle");
    }
    void bicycle() {
        System.out.println("I own a bicycle");
    }
}

public class Sample {
    public static void main(String args[]) {
        Car v = new Car(); 
        v.car();
        v.cycle();
        v.bicycle();
    }
}
