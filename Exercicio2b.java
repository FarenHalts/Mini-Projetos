//Ler um valor inteiro qualquer positivo ou negativo e apresentar o número lido como um
//valor positivo.

package exercicio2b;

import java.util.Scanner;
/**
 *
 * @author Lucas Garcia
 */
public class Exercicio2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int valor, soma = 0;
        	
        System.out.print("Digite o Valor: ");
        valor = entrada.nextInt();
        

        if (valor <= 0 ){
            soma = valor*-1;
        } else {
           soma = valor*1;
        }                         
        
        System.out.print("O valor é: " +soma);
    
    }
}
