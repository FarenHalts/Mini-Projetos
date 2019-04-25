//Ler dois valores numéricos inteiros e apresentar o resultado da diferença dos valores.

package exercicio2a;

import java.util.Scanner;
/**
 *
 * @author Lucas Garcia
 */
public class Exercicio2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
        int valor1, valor2, soma;
        	
        System.out.print("Digite o 1° Valor: ");
        valor1 = entrada.nextInt();

        System.out.print("Digite o 2° Valor: ");
        valor2 = entrada.nextInt();
        
        soma=valor1-valor2;
        
       
        System.out.print("A diferença dos valores é: " +soma);
    
    }
}
