/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_b1;

/**
 *
 * @author LabSispc03
 */
public class Cuadrado {
   
    private Double lado_cuadrado;
    
    public Cuadrado() {
    }
    

    public Cuadrado(Double lado_cuadrado) {
        this.lado_cuadrado = lado_cuadrado;
    }

  
    
    public Double Calculararea() {
       double area=lado_cuadrado*lado_cuadrado;
        return area;
    }
 
    public double Calcularperimetro(){
        double perimetro= lado_cuadrado+lado_cuadrado+lado_cuadrado+lado_cuadrado;
        return perimetro;
    }

    public Double getLado_cuadrado() {
        return lado_cuadrado;
    }

    public void setLado_cuadrado(Double lado_cuadrado) {
        this.lado_cuadrado = lado_cuadrado;
    }

    @Override
    public String toString() {
        return "el area del cuadrado es: "+this.Calculararea() +"\n el perimetro del cuadrado es: "+this.Calcularperimetro();
    }

    
}
