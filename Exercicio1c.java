//Ler uma temperatura em graus Fahrenheit e apresenta-la convertida em graus Celsius.


package exercicio1c;

import java.util.Scanner;
/**
 *
 * @author Lucas Garcia
 */
public class Exercicio1c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit; 

		System.out.print("Conversor de temperatura: Graus Fahrenheit -> Graus Celsius\n\n");
		
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		Fahrenheit = entrada.nextDouble();
		
		Celsius = (Fahrenheit - 32 ) * 5 / 9;

		System.out.print("\n A medida convertida é " + Celsius + "ºC\n");
	}

}