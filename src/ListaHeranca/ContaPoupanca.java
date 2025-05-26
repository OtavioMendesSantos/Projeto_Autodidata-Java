package ListaHeranca;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros; // em percentual anual
    private LocalDate dataAniversario;

    public ContaPoupanca(String titular, double saldoInicial, double taxaDeJuros, LocalDate dataAniversario) {
        super(titular, saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
        this.dataAniversario = dataAniversario;
    }

    public double calculaRendimentos() {
        // Simples: rendimento anual
        double rendimento = this.saldo * (this.taxaDeJuros / 100);
        System.out.println("Rendimento anual: R$" + rendimento);
        return rendimento;
    }

    public void exibirDados() {
        System.out.println("Conta Poupança - Titular: " + this.titular + ", Saldo: R$" + this.saldo);
        System.out.println("Taxa de Juros: " + this.taxaDeJuros + "% ao ano");
        System.out.println("Data de Aniversário: " + this.dataAniversario);
    }
}

