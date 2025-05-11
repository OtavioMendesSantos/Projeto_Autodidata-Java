package Atv2;

import java.util.Scanner;
import java.util.HashSet;

//10- Faça um programa que leia um vetor de 10 posições e verifique se existem
//valores iguais e os escreva na tela.

public class TemValoresIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        System.out.println("Digite 10 inteiros:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        // Para detectar repetidos
        HashSet<Integer> vistos = new HashSet<>();
        HashSet<Integer> repetidos = new HashSet<>();

        for (int num : v) {
            if (!vistos.add(num)) {
                repetidos.add(num);
            }
        }

        if (repetidos.isEmpty()) {
            System.out.println("Não há valores iguais.");
        } else {
            System.out.print("Valores repetidos: ");
            for (int num : repetidos) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
