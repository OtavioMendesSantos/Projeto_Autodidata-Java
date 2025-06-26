package Faculdade.Atv1;

// 6. Crie um programa que gere e exiba todos os números ímpares situados entre 100 e
// 200. Explique como o programa decide se um número é ímpar e como ele percorre o
// intervalo especificado.
public class NumerosImpares100a200 {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 100 e 200:");

        // Aqui eu itero pelos elementos enquanto o index for menor ou igual a 200
        for (int i = 100; i <= 200; i++) {
            // Aqui eu uso o operador de módulo (ou resto da divisão), para descobrir
            // se o resto da divisão é igual a 0, se for, o número é par, se não, é impar
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}