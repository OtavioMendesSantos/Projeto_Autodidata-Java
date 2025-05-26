package Atv1;// 3. Crie um programa que solicite ao usuário uma quantidade indefinida de valores
// numéricos. O programa deve calcular e exibir a média aritmética dos números
// inseridos, além de contar quantos desses números são positivos e quantos são
// negativos. Finalmente, calcule e apresente a porcentagem de números positivos e
// negativos. Considere que o usuário deve inserir pelo menos um número positivo e
// um negativo.
import java.util.Scanner;

public class MediaEPorcentagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int positivos = 0;
        int negativos = 0;
        int total = 0;

        System.out.println("Digite números (digite 0 para encerrar):");

        while (true) {
            double num = scanner.nextDouble();

            if (num == 0) {
                if (positivos > 0 && negativos > 0) {
                    break;
                } else {
                    System.out.println("É necessário inserir pelo menos um número positivo e um negativo.");
                    continue;
                }
            }

            soma += num;
            total++;

            if (num > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        double media = soma / total;
        double percPositivos = (double) positivos / total * 100;
        double percNegativos = (double) negativos / total * 100;

        System.out.println("Quantidade total de números: " + total);
        System.out.println("Média aritmética: " + media);
        System.out.println("Quantidade de números positivos: " + positivos + " (" + percPositivos + "%)");
        System.out.println("Quantidade de números negativos: " + negativos + " (" + percNegativos + "%)");

        scanner.close();
    }
}