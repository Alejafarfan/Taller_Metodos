/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_b1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author LabSispc03
 */
public class Persona {

    private LocalDate fecha_naci;

    public Persona() {
    }

    public Persona(LocalDate fecha_naci) {
        this.fecha_naci = fecha_naci;
    }

    public Period Edad() {
        LocalDate fecha_actual=LocalDate.now();
        return Period.between(fecha_naci,fecha_actual);
    }

    public LocalDate getFecha_naci() {
        return fecha_naci;
    }

    public void setFecha_naci(LocalDate fecha_naci) {
        this.fecha_naci = fecha_naci;
    }

    @Override
    public String toString() {
        return "Persona{" + "fecha_naci=" + fecha_naci + '}';
    }

    
}
  