package Faculdade.ListaHeranca;

import java.util.ArrayList;

public class SistemaUniversitario {
    public static void exibirTodosDados(ArrayList<Pessoa> pessoas) {
        for (Pessoa p : pessoas) {
            System.out.println("=== Dados ===");
            p.exibirDados(); // Chama a versão correta conforme a instância
            System.out.println();
        }
    }
}
