//Ler uma temperatura em graus Celsius e exibi-la convertida em graus Fahrenheit.


package exercicio1b;

import java.util.Scanner;
/**
 *
 * @author Lucas Garcia
 */
public class Exercicio1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit;

		System.out.print("Conversor de temperatura: Graus Celsius -> Fahrenheit\n\n");
		
		
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();
		
		Fahrenheit = ( 9 * Celsius + 160 ) / 5;

		System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
		
	}

}
