package Atv2;

public class VetorOperacoesTeste {
    public static void main(String[] args) {
        // A. Inicializar vetor
        int[] vetor = VetorOperacoes.inicializarVetor();

        // B. Calcular soma de A[0], A[1] e A[5]
        int soma = VetorOperacoes.calcularSoma(vetor);
        System.out.println("Soma de A[0], A[1] e A[5]: " + soma);

        // C. Modificar o valor da posição 4 para 100
        VetorOperacoes.modificarVetor(vetor);

        // Imprimir o vetor modificado
        VetorOperacoes.imprimirVetor(vetor);
    }
}
