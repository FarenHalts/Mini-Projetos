//Calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um
//automóvel que faz 12 km por litro. Para obter o cálculo, o usuário deve fornecer o
//tempo gasto na viagem e a velocidade média. O programa deve apresentar os
//valores da velocidade média, tempo gasto, distância percorrida e quantidade de litros
//utilizada na viagem.

package exercicio1a;

import java.util.Scanner;
/**
 *
 * @author Lucas Garcia
 */
public class Exercicio1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double VelocidadeMedia, TempoGasto, Autonomia = 12;
        double Distancia, LitrosUsados;		

        System.out.print("Cálculo da quantidade de litros de combustível gasta em uma viagem\n\n");


        System.out.print("Digite o tempo que você gastou em sua viagem (horas): ");
        TempoGasto = entrada.nextDouble();

        System.out.print("Digite o Velocidade Média em que você fez o percurso (Km/h): ");
        VelocidadeMedia = entrada.nextDouble();


        Distancia = VelocidadeMedia * TempoGasto;
        LitrosUsados = Distancia / Autonomia;


        System.out.print("\n\n\nResultados:\n\n");
        System.out.print("Velocidade média = " + VelocidadeMedia + " Km/h\n");
        System.out.print("Tempo gasto = " + TempoGasto + " horas\n");
        System.out.print("Distancia Percorrida = " + Distancia + " Km\n");
        System.out.print("Quantidade de Combustível utilizado: " + LitrosUsados + " litros\n");

        
       }

   }
