package Faculdade.Atv1;
// 2. Escreva um algoritmo que leia a altura de 5 participantes de uma
// pesquisa. Após a leitura, o programa deve identificar e exibir as
// alturas máxima e mínima registradas.
// Explique como o algoritmo determina esses valores ao longo da execução.

import java.util.Scanner;

public class AlturasParticipantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] alturas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a altura do participante " + (i+1) + ": ");
            // Armazena a altura de cada participante num espaço do array
            alturas[i] = scanner.nextDouble();
        }

        double max = alturas[0];
        double min = alturas[0];

        // itera pelos itens dos arrays
        for (int i = 1; i < 5; i++) {
            // A cada iteração compara o valor do array com o valor máximo
            // e mínimo, caso seja maior ou menor, o valor max e min muda
            // para o valor contido no array
            if (alturas[i] > max) {
                max = alturas[i];
            }
            if (alturas[i] < min) {
                min = alturas[i];
            }
        }

        System.out.println("Altura máxima: " + max);
        System.out.println("Altura mínima: " + min);

        scanner.close();
    }
}