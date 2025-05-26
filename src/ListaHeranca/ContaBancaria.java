package ListaHeranca;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean saque(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    public boolean transferencia(ContaBancaria outraConta, double valor) {
        if (this.saque(valor)) {
            outraConta.deposito(valor);
            System.out.println("Transferência de R$" + valor + " realizada para " + outraConta.titular);
            return true;
        }
        return false;
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular + ", Saldo: R$" + this.saldo);
    }
}
