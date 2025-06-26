package Faculdade.SistemaBancario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, ContaBancaria> contas = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Bem-vindo ao Sistema Bancário ===");
            System.out.println("Digite o nome do titular (ou '0' para sair):");
            String titular = scanner.nextLine().trim();

            if (titular.equals("0")) {
                System.out.println("Encerrando o programa. Até logo!");
                break;
            }

            ContaBancaria conta = contas.get(titular);

            if (conta == null) {
                System.out.println("Titular '" + titular + "' não encontrado.");
                if (!contas.isEmpty()) {
                    System.out.println("Usuários disponíveis:");
                    contas.keySet().forEach(nome -> System.out.println(" - " + nome));
                }

                conta = criarNovaConta(titular);
                contas.put(titular, conta); // ADICIONADO
                System.out.println("Conta criada com sucesso!");
            } else {
                System.out.println("Conta encontrada!");
            }

            exibirMenu(conta);
        }
    }

    private static ContaBancaria criarNovaConta(String titular) {
        int opcao = -1;
        while (opcao != 1 && opcao != 2) {
            System.out.println("Escolha o tipo de conta:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.print("Opção: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números.");
            }
        }

        System.out.print("Número da conta: ");
        String numeroConta = scanner.nextLine();
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();

        double saldoInicial = 0.0;
        boolean saldoValido = false;
        while (!saldoValido) {
            System.out.print("Saldo inicial: R$ ");
            try {
                saldoInicial = Double.parseDouble(scanner.nextLine());
                if (saldoInicial < 0) {
                    System.out.println("O saldo não pode ser negativo.");
                } else {
                    saldoValido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um valor numérico válido.");
            }
        }

        if (opcao == 1) {
            return new ContaCorrente(titular, saldoInicial, numeroConta, agencia);
        } else {
            return new ContaPoupanca(titular, saldoInicial, numeroConta, agencia);
        }
    }

    private static void exibirMenu(ContaBancaria conta) {
        while (true) {
            System.out.println("\n=== Menu da Conta ===");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            if (conta instanceof ContaPoupanca) {
                System.out.println("4 - Render Juros");
            }
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite apenas números.");
                continue;
            }

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    try {
                        double valorDeposito = Double.parseDouble(scanner.nextLine());
                        conta.depositar(valorDeposito);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    try {
                        double valorSaque = Double.parseDouble(scanner.nextLine());
                        conta.sacar(valorSaque);
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case 4:
                    if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).renderJuros();
                        System.out.println("Juros aplicados com sucesso!");
                    } else {
                        System.out.println("Opção inválida para o tipo de conta!");
                    }
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
