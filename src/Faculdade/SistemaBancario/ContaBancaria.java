package Faculdade.SistemaBancario;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;
    protected String conta;
    protected String agencia;

    public ContaBancaria(String titular, double saldoInicial, String conta, String agencia) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.conta = conta;
        this.agencia = agencia;
    }

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

    public void consultarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
