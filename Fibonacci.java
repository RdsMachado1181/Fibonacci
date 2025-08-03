/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero_ini_final;

import java.util.ArrayList;

/**
 *
 * @author rdsmachado
 */
public class Fibonacci {
   Inserir_numero num_ins = new Inserir_numero();
   
        
 int a = 0;
 int b = 1;
 int total = 0;
    /**
     *
     * @param ins_num       
     */
    public void fibonacci_num( Inserir_numero ins_num){     
       
        
        for ( int i = 0; i <  ins_num.getNumero()   ; i++) {
          
      System.out.println ( a + ",  "   );
      total = a + b; 
      a = b;
      b = total;
         
        }
        
       
    }
}
    
