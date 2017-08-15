/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.eazuaraa.a03;

import java.util.Scanner;

/**
 *
 * @author eazuara
 */
public class EDEazuaraAA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Introduzca el tamaño del vector:");
        
        Scanner tamaño = new Scanner(System.in);
        int n=tamaño.nextInt();
        
        Secuencial main = new Secuencial();
        main.setVector(main.RandomV(n));
        
        System.out.println(main.showVector());
    }
    
}
