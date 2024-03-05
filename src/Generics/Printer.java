package Generics;

public class Printer<T extends Cat> {
    T item;
    Printer(T item){
        this.item = item;
    }
    public void Print(){
        item.makeSomeNoise();
        System.out.println("My name is  "+this.item.name + Cat.feature);
    }
}
