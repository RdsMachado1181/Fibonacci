/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_ini_final;

/**
 *
 * @author rdsmachado
 */
public class Numero_ini_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inserir_numero inserir_num = new Inserir_numero();
         
        Fibonacci   num_resp = new Fibonacci();
        
        System.out.println(" Digite um numero positivo ");
      inserir_num.numero();
       
     num_resp.fibonacci_num( inserir_num);
    }
    
}
