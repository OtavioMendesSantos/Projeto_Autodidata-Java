package Faculdade.ListaHeranca;

public class FuncionarioBanco {
    protected String nome;
    protected double salarioBase;

    public FuncionarioBanco(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return this.salarioBase;
    }

    public void exibirResumo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: Funcionário do Banco");
        System.out.println("Salário Total: " + this.calcularSalario());
    }
}
