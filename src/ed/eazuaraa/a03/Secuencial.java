/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.eazuaraa.a03;

/**
 *
 * @author eazuara
 */
public class Secuencial extends FetchClass {

    @Override
    int Fetch(int numero) {
          for(int i=0; i<vector.length; i++){  
                                             
            if(vector[i]== numero){
                return i;
        }
        }
        return -1;
    }

    
}
    
    

