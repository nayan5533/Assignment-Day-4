/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphismex;

/**
 *
 * @author nayan
 */
class PetAnimal {
    public void sound(){
        System.out.println("Animal makes a sound");
    }
    
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends PetAnimal{
    
    public void sound(){
        System.out.println("Dog barks");
    }
    
    public void eat(String food){
        System.out.println("Dog eats " + food);
    }
}

public class PolymorphismEx {

    public static void main(String[] args) {
        PetAnimal animal = new Dog();
        animal.sound();
        animal.eat();
        
        Dog dog = new Dog();
        dog.sound();
        dog.eat("meat");
    }
}
