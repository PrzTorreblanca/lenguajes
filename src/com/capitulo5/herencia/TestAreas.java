/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo5.herencia;

/**
 *
 * @author campitos
 */
public class TestAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Area a=new Area(new Cuadrado(2));
        System.out.println(a.calcular());
        
        
        
    }
    
}
