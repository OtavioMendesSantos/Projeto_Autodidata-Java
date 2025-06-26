package Faculdade.ListaHeranca;

public class Estagiario extends FuncionarioBanco {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void exibirResumo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: Estagiário");
        System.out.println("Salário Total: " + this.calcularSalario());
    }
}
