/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Estudiante
 */
public class Ejecutable {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.number = 5;
        cuenta1.owner = "Carito";
        cuenta1.balance = 200000;
        
        System.out.println (cuenta1.number);
        cuenta1. deposit (200);
        System.out.println(cuenta1.balance);
    }
      
}
