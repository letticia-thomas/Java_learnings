package Generics;

public class Cat implements Animal {

    String name;

    Cat(String name){
        this.name = name;
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Meawwwww!!!!");
    }
    
}
