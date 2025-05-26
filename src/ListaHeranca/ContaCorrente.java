package ListaHeranca;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;
    private String numeroCartaoDebito;

    public ContaCorrente(String titular, double saldoInicial, double limiteChequeEspecial, String numeroCartaoDebito) {
        super(titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.numeroCartaoDebito = numeroCartaoDebito;
    }

    @Override
    public boolean saque(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return false;
        }

        if (valor <= this.saldo + this.limiteChequeEspecial) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso (Cheque Especial incluído se necessário).");
            return true;
        } else {
            System.out.println("Limite insuficiente.");
            return false;
        }
    }

    public void exibirDados() {
        System.out.println("Conta Corrente - Titular: " + this.titular + ", Saldo: R$" + this.saldo);
        System.out.println("Limite Cheque Especial: R$" + this.limiteChequeEspecial);
        System.out.println("Número do Cartão de Débito: " + this.numeroCartaoDebito);
    }
}
