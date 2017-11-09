/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.CalculePuntos;

/**
 * @author Eduar
 */
public class Main {
    
    public static void main(String [] args){
        CalculePuntos sim = new CalculePuntos(6, (int) 1e7);
        System.out.println(sim.pi());    
    }
}
