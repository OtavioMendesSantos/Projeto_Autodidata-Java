package Faculdade.Atv2;

// Faça um programa que possua um vetor denominado A que armazene 6
// números inteiros. O programa deve executar os seguintes passos:
// A. Implemente um método que atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
// B. Implemente um método que armazene em uma variável inteira (simples) a
// soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela
// esta soma.
// C. Implemente um método que modifique o vetor na posição 4, atribuindo a esta
// posição o valor 100 e imprima o array.
// D. Implemente uma classe de teste para testar os itens A, B e C.

public class VetorOperacoes {
    // A. Método que cria e retorna o vetor com os valores indicados
    public static int[] inicializarVetor(){
        return new int[]{1, 0, 5, -2, -5, 7};
    }

    // B. Método que calcula a soma de A[0], A[1] e A[5]
    public static int calcularSoma(int[] vetor){
        return vetor[0] + vetor[1] + vetor[5];
    }

    // C. Método que modifica a posição 4 com o valor 100
    public static void modificarVetor(int[] vetor) {
        vetor[4] = 100;
    }

    // Método utilitário para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        System.out.print("Vetor: ");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
