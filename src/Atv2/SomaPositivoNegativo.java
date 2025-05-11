package Atv2;

// 8- Faça um programa que preencha um vetor com 10 números reais, calcule e
//mostre a quantidade de números negativos e a soma dos números positivos desse
//vetor.

import java.util.Scanner;

public class SomaPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[10];
        int countNeg = 0;
        double somaPos = 0.0;
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextDouble();
            if (v[i] < 0) countNeg++;
            else somaPos += v[i];
        }
        System.out.println("Quantidade de negativos: " + countNeg);
        System.out.printf("Soma dos positivos: %.2f%n", somaPos);
        sc.close();
    }
}
