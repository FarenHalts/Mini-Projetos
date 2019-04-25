//Ler uma temperatura em graus Celsius e apresenta-la convertida em graus Kelvin.


package exercicio1d;

import java.util.Scanner;
/**
 *
 * @author Lucas Garcia
 */
public class Exercicio1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
		double Celsius, Kelvin; 

		System.out.print("Conversor de temperatura: Graus Celsius -> Graus Kelvin\n\n");
		
		
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();
		
		Kelvin = (Celsius + 273.15 );

		System.out.print("\n A medida convertida é " + Kelvin + "ºC\n");
	}

}
