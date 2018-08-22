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
public class Cuenta {
    //atributos
    public int number;
    public String owner;
    public float balance;
    
    public void setOwner (String _owner){
    }
    public String getOwner (){
    return null;
    }
    
    public void deposit (float value){
        balance = balance + value;
    
    }
    
}
