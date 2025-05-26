package Atv1;

// 1. Desenvolva um algoritmo que, dentro de um intervalo específico de números (de 1
//a 500), selecione e some os números que atendam a dois critérios: serem ímpares e
//também múltiplos de três. Além disso, exiba o total de números que atenderam a
//esses critérios.
public class SomaImparesMultiplosTres {
    public static void main(String[] args){
        int soma =0;
        int contador = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 2 != 0 && i % 3 == 0) {
                soma += i;
                contador++;
            }
        }

        System.out.println("Soma dos números ímpares e múltiplos de 3: " + soma);
        System.out.println("Total de números que atendem aos critérios: " + contador);
    }
}
