//Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em Kelvin.

package exercicio1e;

import java.util.Scanner;
/**
 *
 * @author Lucas Garcia
 */
public class Exercicio1e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit, Kelvin;

		System.out.print("Conversor de temperatura: Graus Fahrenheit -> Graus Kelvin\n\n"); 
		
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		Fahrenheit = entrada.nextDouble();
		
             Celsius = (Fahrenheit - 32 ) * 5 / 9;

            Kelvin = (Celsius + 273.15 );
             System.out.print("\n A medida convertida é " + Kelvin + "ºK\n");
		
	}

}
