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
public class Binario extends FetchClass {

    @Override
    int Fetch(int num) {
         int n = vector.length;
  
    int center;
    int start = 0; //Se declaran los 3 pibotes de referencia: inicio, fin y centro
    int last = n-1;

    while(start<=last){ 
     center=(start+last)/2; //Se suma el inicio y el numero de fin, para despues dividirlos entre 2 y encontrar el centro del arreglo
     
     
     if(vector[center]==num)
         return center; //Se regresa el valor del centro
     
     
     if(num < vector [center] ){ //Si el valor del numero es menor al del centro se recorrer el pivote final a la posicion centro-1
        last=center-1; 
     }
     
     
     else {
       start =center+1; //Si el valor del numero es mayor al del centro se recorre el pivote inicial a centro+1
     }
     
   }
   
    return -1;
 }
}
    
    
    

