package Atv1;// 7. Escreva um programa que solicite ao usuário um valor N, entre 1 e 10, e calcule a
// tabuada desse número. A tabuada deve ser exibida de maneira organizada,
// mostrando cada operação de multiplicação, de 0 a 10, e o respectivo resultado.
// Discuta como o programa realiza o cálculo da tabuada e formata os resultados.
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Atv1.Tabuada do " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}