package Faculdade.Atv2;
// 2- Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
import java.util.Scanner;

public class Vetor6Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[6];
        System.out.println("Digite 6 inteiros:");
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println("Valores lidos:");
        for (int num : v) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
