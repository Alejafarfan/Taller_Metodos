/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_b1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author LabSispc03
 */
public class prueba1 {
    //este es el metodo de persona
    
    public static void main(String[] args) {
        Persona fecha=new Persona(LocalDate.of(2005,7, 13));
        
        System.out.println(fecha.Edad());
    }
    
}
