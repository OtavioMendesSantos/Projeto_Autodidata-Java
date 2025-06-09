package SistemaBancario;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldoInicial, String conta, String agencia) {
        super(titular, saldoInicial, conta, agencia);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação não permitida!");
        } else {
            setSaldo(getSaldo() + valor);
            System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Operação não permitida!");
        } else if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente!");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }

    public void renderJuros() {
        setSaldo(getSaldo() * 1.01);
        System.out.println("Juros aplicados: 1%.");
    }
}
