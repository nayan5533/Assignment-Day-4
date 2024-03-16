/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petanimals;

/**
 *
 * @author nayan
 */
class InheritanceEx{
    public void sound(){
        System.out.println("Animanl makes a soiund");
    }
}

class Dog extends InheritanceEx{
    public void sound(){
        System.out.println("Dog barks");
    }
    public void wagTail(){
        System.out.println("Dog wags tail");
    }
}

public class PetAnimals{
    public static void main(String[] args){
        Dog dog = new Dog();
        
        dog.sound();
        dog.wagTail();
    }
}