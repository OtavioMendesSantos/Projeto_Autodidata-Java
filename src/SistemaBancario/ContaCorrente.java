package SistemaBancario;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String titular, double saldoInicial, String conta, String agencia) {
        super(titular, saldoInicial, conta, agencia);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 2.50;
        if (saldo >= valor + taxa) {
            saldo -= (valor + taxa);
            System.out.printf("Saque de R$ %.2f realizado com taxa de R$ %.2f%n", valor, taxa);
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
    }
}
