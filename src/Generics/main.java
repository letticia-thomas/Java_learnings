package Generics;

public class main {
    public static void main(String[] args){
        // Printer<Integer> printer = new Printer<Integer>(45);
        Printer<Cat> printer = new Printer<Cat>(new Cat("Manikutty"));
        printer.Print();
    }
}
