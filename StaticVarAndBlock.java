/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.staticvarandblock;

/**
 *
 * @author nayan
 */
public class StaticVarAndBlock {
    static int staticVariable;
    
    static{
        System.out.println("Static intialization block executed.");
        staticVariable = 10;
    }
    
    public StaticVarAndBlock(){
        System.out.println("Constructor executed.");
    }
    public static void displayStaticVariable(){
        System.out.println("Static variable value: " + staticVariable);
    }
    public static void main(String[] args){
        StaticVarAndBlock obj = new StaticVarAndBlock();
        
        displayStaticVariable();
        staticVariable = 20;
        displayStaticVariable();
    }

   }
