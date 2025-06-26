package Faculdade.Atv2;

import java.util.Scanner;

// 9- Fazer um programa para ler 5 valores e, em seguida, mostrar a posição onde se
// encontram o maior e o menor valor.

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[5];
        System.out.println("Digite 5 valores:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextDouble();
        }
        double maior = v[0], menor = v[0];
        int posMaior = 0, posMenor = 0;
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
                posMaior = i;
            }
            if (v[i] < menor) {
                menor = v[i];
                posMenor = i;
            }
        }
        System.out.printf("Maior: %.2f na posição %d%n", maior, posMaior);
        System.out.printf("Menor: %.2f na posição %d%n", menor, posMenor);
        sc.close();
    }
}
