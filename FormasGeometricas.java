/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formasgeometricas;

/**
 *
 * @author mariafernanda.sousa
 */
public class FormasGeometricas {
    
    public static void main(String[] args) {
        calcularArea calcular = new calcularArea();
        
        System.out.println("área do quadrado: " + calcular.calcularArea(2));
        System.out.println("área do retângulo: " + calcular.calcularArea(2,1));
        System.out.println("área do circulo: " + calcular.calcularArea(2,true));
    }
}
