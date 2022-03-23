/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ser_Humano;

/**
 *
 * @author alunocmc
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
       Corpo_Humano C1 = new Corpo_Humano(20,9);
       C1.SetAltura(1.8f);
       System.out.println("IMC" + C1.GetIMC());
      
     
     
    }
    
}
