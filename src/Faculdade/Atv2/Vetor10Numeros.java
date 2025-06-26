package Faculdade.Atv2;

import java.util.Scanner;

// 4- Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele
// possui.

public class Vetor10Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int contadorPares = 0;
        System.out.println("Digite 10 inteiros:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
            if (v[i] % 2 == 0) contadorPares++;
        }
        System.out.println("Quantidade de pares: " + contadorPares);
        sc.close();
    }
}
