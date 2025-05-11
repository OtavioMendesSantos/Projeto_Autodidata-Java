package Atv2;

//3- Ler um conjunto de números reais, armazenando-o em vetor e calcular o
//quadrado dos componentes deste vetor, armazenando o resultado em outro vetor,
//em seguida Imprimir ambos os vetores.

import java.util.Scanner;

public class NumeroInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números reais vai digitar? ");
        int n = sc.nextInt();
        double[] original = new double[n];
        double[] quadrado = new double[n];

        System.out.println("Digite " + n + " números reais:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextDouble();
            quadrado[i] = original[i] * original[i];
        }

        System.out.println("Original  |  Quadrado");
        for (int i = 0; i < n; i++) {
            System.out.printf("%8.2f | %9.2f%n", original[i], quadrado[i]);
        }
        sc.close();
    }
}
