/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_b1;

/**
 *
 * @author LabSispc03
 */
public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double Cacularea() {
        double area = 3.14 * Math.pow(radio, 2);
        return area;
    }

    public double Calcularperimetro() {
        double perimetro = 2 * 3.14 * radio;
        return perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "El area del circulo es: "+ this.Cacularea()+" \n El perimetro del circulo es: "+this.Calcularperimetro();
    }
    
    

}
