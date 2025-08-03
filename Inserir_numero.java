/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero_ini_final;

import java.util.Scanner;

/**
 *
 * @author rdsmachado
 */
public class Inserir_numero {
      Scanner num = new Scanner( System.in);
  
    
      private int numero = 0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    public int numero(){       
        numero = num.nextInt();
      
        
      return numero;   
    }
}
