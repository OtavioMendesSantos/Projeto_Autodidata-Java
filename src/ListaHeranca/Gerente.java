package ListaHeranca;

public class Gerente extends FuncionarioBanco {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase * 1.20;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: Gerente");
        System.out.println("Salário Total: " + this.calcularSalario());
    }
}

