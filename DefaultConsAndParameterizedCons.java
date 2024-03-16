/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.defaultconsandparameterizedcons;

/**
 *
 * @author nayan
 */
public class DefaultConsAndParameterizedCons {

        private int value;
        
        public DefaultConsAndParameterizedCons(){
            
            this.value = 0;
        } 
        
        public DefaultConsAndParameterizedCons(int value) {
            
            this.value = value;
        }
        
        public int getValue(){
            return value;
        }
        
        public void setValue(int value){
            this.value = value;
        }
        
        public static void main(String[] args){
            
            DefaultConsAndParameterizedCons obj1 = new DefaultConsAndParameterizedCons();
            DefaultConsAndParameterizedCons obj2 = new DefaultConsAndParameterizedCons(10);
            
            System.out.println("value of obj1: " + obj1.getValue());
            System.out.println("value of obj2: " + obj2.getValue());
            
            obj1.setValue(5);
            obj2.setValue(20);
            
            System.out.println("Modified value of obj1: " + obj1.getValue());
            System.out.println("Modified value of obj2: " + obj2.getValue());
        }
    }

