package Faculdade.Atv2;


import java.util.Scanner;

// 6- Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os
// valores lidos na ordem inversa.
public class VetorContrario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];
        System.out.println("Digite 6 inteiros:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println("Ordem inversa:");
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        sc.close();
    }
}
