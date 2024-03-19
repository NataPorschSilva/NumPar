
package com.mycompany.numpar;
import java.util.Scanner;
public class NumPar {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
      
        System.out.println(" Digite um número limite: ");
    int limite = teclado.nextInt();
    int numero = 2;
    
    do{ 
        System.out.println(numero);
        numero += 2;
        
    } while (numero <= limite);
    teclado.close();
}
}
    

