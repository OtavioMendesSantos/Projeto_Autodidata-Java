package Faculdade.Atv1;// 5. Implemente um programa que leia uma sequência de números positivos,
// encerrando a leitura quando o número zero for inserido. O programa deve contar
// quantos números pares e ímpares foram inseridos, além de calcular a média dos
// números pares e a média geral dos números lidos. Inclua uma explicação de como o
// programa diferencia números pares de ímpares.

import java.util.Scanner;

public class ParesImparesMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        double somaPares = 0;
        double somaTotal = 0;
        int total = 0;

        System.out.println("Digite números (0 para encerrar):");

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            // Aqui eu uso o operador de módulo (ou resto da divisão), para descobrir
            // se o resto da divisão é igual a 0, se for, o número é par, se não, é impar
            if (num % 2 == 0) {
                pares++;
                somaPares += num;
            } else {
                impares++;
            }

            somaTotal += num;
            total++;
        }

        double mediaPares = pares > 0 ? somaPares / pares : 0;
        double mediaGeral = total > 0 ? somaTotal / total : 0;

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println("Média dos números pares: " + mediaPares);
        System.out.println("Média geral dos números lidos: " + mediaGeral);

        scanner.close();
    }
}