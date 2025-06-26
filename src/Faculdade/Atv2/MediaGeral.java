package Faculdade.Atv2;
//7- Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor,
//calcule e imprima a média geral.

import java.util.Scanner;

public class MediaGeral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0.0, nota;
        System.out.println("Digite a nota de 15 alunos:");
        for (int i = 0; i < 15; i++) {
            nota = sc.nextDouble();
            soma += nota;
        }
        double media = soma / 15.0;
        System.out.printf("Média geral: %.2f%n", media);
        sc.close();
    }
}
