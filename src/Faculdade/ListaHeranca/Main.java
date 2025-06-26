package Faculdade.ListaHeranca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Funcionario f = new Funcionario("Lucas", 3000);
        //f.exibeDados();
        //f.addAumento(500);
        //f.exibeDados();
        //System.out.println("Ganho anual: " + f.ganhoAnual());
        //
        //System.out.println("-----------------------------------------------------");
        //
        //Assistente a = new Assistente("Maria", 2500, "A1234");
        //a.exibeDados();
        //
        //a.addAumento(300);
        //a.exibeDados();
        //
        //System.out.println("Matrícula: " + a.getMatricula());
        //System.out.println("Ganho anual: " + a.ganhoAnual());
        //
        //System.out.println("-----------------------------------------------------");
        //
        //Tecnico t = new Tecnico("João", 3000, "T5678", 500);
        //
        //t.exibeDados();
        //
        //System.out.println("Ganho anual: " + t.ganhoAnual());
        //
        //t.addAumento(200);
        //t.exibeDados();
        //System.out.println("Novo ganho anual: " + t.ganhoAnual());
        //
        //System.out.println("-----------------------------------------------------");
        //
        //Administrativo adm1 = new Administrativo("Márcio", 3000, "T6789", "noturno", 400);
        //Administrativo adm2 = new Administrativo("Carlos", 2800, "ADM002", "dia", 500);
        //
        //adm1.exibeDados();
        //System.out.println("Ganho anual: " + adm1.ganhoAnual());
        //
        //System.out.println();
        //
        //adm2.exibeDados();
        //System.out.println("Ganho anual: " + adm2.ganhoAnual());

        System.out.println("Exercício 1 -----------------------------------------------------");
        // Instanciando um Técnico
        Tecnico tecnico = new Tecnico("João", 3000, "T001", 500);
        tecnico.exibeDados();
        System.out.println("Ganho anual: " + tecnico.ganhoAnual());

        System.out.println();

        // Instanciando um Administrativo no turno da noite
        Administrativo administrativo = new Administrativo("Maria", 2800, "A002", "noite", 600);
        administrativo.exibeDados();
        System.out.println("Ganho anual: " + administrativo.ganhoAnual());

        System.out.println();

        // Instanciando um Assistente comum
        Assistente assistente = new Assistente("Pedro", 2500, "AS003");
        assistente.exibeDados();
        System.out.println("Ganho anual: " + assistente.ganhoAnual());

        System.out.println("Exercício 2 -----------------------------------------------------");
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        // Criando instâncias
        CarroAutonomo carro1 = new CarroAutonomo("Tesla", 2022, 5);
        Drone drone1 = new Drone("DJI", 2021, 15.5);

        // Adicionando na lista
        listaVeiculos.add(carro1);
        listaVeiculos.add(drone1);

        // Exibindo dados
        for (Veiculo v : listaVeiculos) {
            System.out.println("=== Dados do Veículo ===");
            v.exibirDados();
            System.out.println();
        }

        System.out.println("Exercício 3 -----------------------------------------------------");
        ArrayList<FuncionarioBanco> funcionarios = new ArrayList<>();

        // Instanciando os funcionários
        Gerente gerente = new Gerente("Carlos", 5000);
        Analista analista = new Analista("Ana", 4000);
        Estagiario estagiario = new Estagiario("Pedro", 1500);

        // Adicionando à lista
        funcionarios.add(gerente);
        funcionarios.add(analista);
        funcionarios.add(estagiario);

        // Exibindo resumos
        for (FuncionarioBanco f : funcionarios) {
            System.out.println("=== Resumo do Funcionário ===");
            f.exibirResumo();
            System.out.println();
        }

        System.out.println("Exercício  -----------------------------------------------------");
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Criando instâncias
        Professor prof = new Professor("Carlos", "123.456.789-00", "Engenharia");
        Aluno aluno = new Aluno("Ana", "987.654.321-00", "2023001");
        TecnicoAdministrativo tecnicoAdministrativo = new TecnicoAdministrativo("João", "456.123.789-00", "Biblioteca");

        // Adicionando à lista
        pessoas.add(prof);
        pessoas.add(aluno);
        pessoas.add(tecnicoAdministrativo);

        // Chamando a função que exibe os dados
        SistemaUniversitario.exibirTodosDados(pessoas);

        System.out.println("Exercício 5 -----------------------------------------------------");
        ContaCorrente cc = new ContaCorrente("João Silva", 1000.0, 500.0, "1234-5678-9012-3456");
        ContaPoupanca cp = new ContaPoupanca("Maria Souza", 2000.0, 3.5, LocalDate.of(2005, 4, 13));

        // Operações na Conta Corrente
        cc.exibirDados();
        cc.deposito(300);
        cc.saque(1500); // vai usar cheque especial
        cc.exibirSaldo();

        System.out.println();

        // Operações na Conta Poupança
        cp.exibirDados();
        cp.deposito(500);
        cp.calculaRendimentos();
        cp.exibirSaldo();

        System.out.println();

        // Transferência
        cc.transferencia(cp, 200);
        cc.exibirSaldo();
        cp.exibirSaldo();
    }
}
