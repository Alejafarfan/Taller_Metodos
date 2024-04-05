/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_b1;

/**
 *
 * @author LabSispc03
 */
public class Triangulo {
    private float base;
    private float altura;
    private float lado1;
    private float lado2;  
    
    public Triangulo(){
    
    }

    public Triangulo(float base, float altura, float lado1, float lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public float Calculararea(){
    float area=base*altura/2;
        return area;
 
    }
    
    public Float Calcularperimetro(){
    float perimetro=base+lado1+lado2;
    return perimetro;
    
    }
    public float Calcularhipotenusa(){
        float hipotenusa=(float) Math.sqrt(Math.pow(lado1,2)+ Math.pow(lado2,2));
        return hipotenusa;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "el area es: "+this.Calculararea()+" \n el perimetro es:"+this.Calcularperimetro()+"\n la hipotenusa es :"+this.Calcularhipotenusa();
    }
    
    
    
    
}
