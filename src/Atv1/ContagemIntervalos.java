package Atv1;// 4. Desenvolva um programa que receba uma série de números de forma contínua até
// que um valor negativo seja inserido. O programa deve contar quantos números caem
// dentro dos seguintes intervalos: [0-25], [26-50], [51-75], [76-100]. Depois que o valor
// negativo for inserido, exiba o total de números contados em cada intervalo e faça
// uma breve análise dos resultados.
import java.util.Scanner;

public class ContagemIntervalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] contadores = new int[4]; // [0-25], [26-50], [51-75], [76-100]

        System.out.println("Digite números positivos (negativo para encerrar):");

        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }

            if (num >= 0 && num <= 25) {
                contadores[0]++;
            } else if (num >= 26 && num <= 50) {
                contadores[1]++;
            } else if (num >= 51 && num <= 75) {
                contadores[2]++;
            } else if (num >= 76 && num <= 100) {
                contadores[3]++;
            }
        }

        System.out.println("Quantidade de números em [0-25]: " + contadores[0]);
        System.out.println("Quantidade de números em [26-50]: " + contadores[1]);
        System.out.println("Quantidade de números em [51-75]: " + contadores[2]);
        System.out.println("Quantidade de números em [76-100]: " + contadores[3]);

        scanner.close();
    }
}