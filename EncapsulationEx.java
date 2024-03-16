/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulationex;

/**
 *
 * @author nayan
 */
public class EncapsulationEx {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 0 && age <= 120){
            this.age = age;
        }else{
            System.out.println("Invalid age provided.");
        }
    }
    public static void main(String[] args){
        EncapsulationEx obj = new EncapsulationEx();
        obj.setName("John Doe");
        obj.setAge(30);
        
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        
        obj.setAge(150);
    }
        
    
}
