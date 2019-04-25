//Calcular e apresentar o valor do volume de um galão
//Tanto o raio quanto a área são dados de entrada do programa.

package exercicio1g;

import java.util.Scanner;
/**
 *
 * @author Lucas Garcia
 */
public class Exercicio1g {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        double RaioGalao, AreaGalao, VolumeGalao;

        System.out.print("Cálculo de volume de um galão\n\n");


        System.out.print("Digite Raio do galão (em cm): ");
        RaioGalao = entrada.nextDouble()/2;

        System.out.print("Digite a altura do galão (em cm): ");
        AreaGalao = entrada.nextDouble();


        VolumeGalao = Math.PI * RaioGalao * RaioGalao * AreaGalao;

        System.out.print("\n O volume do galão é de " + VolumeGalao + " cm³\n");
       
    }
}