package Faculdade.Atv2;

//5- Escreva um programa que leia 10 números inteiros e os armazene em um vetor.
//Imprima o vetor, o maior elemento e a posição que ele se encontra.

import java.util.Scanner;

public class MaiorNumeroEPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        System.out.println("Digite 10 inteiros:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }
        int maior = v[0], pos = 0;
        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
                pos = i;
            }
        }
        System.out.print("Vetor: ");
        for (int num : v) System.out.print(num + " ");
        System.out.println();
        System.out.println("Maior valor: " + maior + " na posição: " + pos);
        sc.close();
    }
}
