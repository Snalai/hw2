package org.example.work1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pushok", 2);
        Owner owner = new Owner("Alex", 20 );
        cat.mya();
        cat.greet(owner.nameOwner);
        System.out.println("Он взял меня когда ему было " + cat.ageOwn(owner.ageOwner)+ ".");




    }
}
