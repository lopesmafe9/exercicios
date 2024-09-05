/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formasgeometricas;

/**
 *
 * @author mariafernanda.sousa
 */
public class calcularArea {
    public double calcular (double lado){
        return lado * lado;
    }
    
    public double calcular (double base, double altura){
        return base * altura;
    }
    
    public double calcular (double raio, boolean isCirculo){
        return Math.PI * raio * raio;
}

 
}
