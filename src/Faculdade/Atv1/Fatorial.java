package Faculdade.Atv1;
// 8. Desenvolva um programa que receba um valor inicial A e imprima a sequência de
// operações necessárias para calcular o fatorial de A, além de exibir o resultado final
// do cálculo. Como exemplo, mostre a sequência de multiplicações e o resultado final
// para o fatorial de 5. Explique como o programa gerencia o processo de multiplicação
// em sequência.
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println("Faculdade.Atv1.Fatorial não definido para números negativos.");
            return;
        }

        long resultado = 1;
        System.out.print(a + "! = ");

        if (a == 0) {
            System.out.println("1 = 1");
            return;
        }

        // Aqui eu defino o index sendo número escolhido
        // o indice diminui em 1 a cada iteração
        for (int i = a; i >= 1; i--) {
            // aqui o resultado recebe ele mesmo multiplicado pelo indice
            resultado *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }

        System.out.println(" = " + resultado);
        scanner.close();
    }
}