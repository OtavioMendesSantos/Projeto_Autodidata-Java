package Faculdade.ListaHeranca;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor) {
        this.salario += valor;
        System.out.println("O valor foi adicionado com sucesso");
    }

    public double ganhoAnual() {
        return this.salario * 12;
    }

    public void exibeDados(){
        System.out.println("O funcionário " + this.nome + " recebe " + this.salario + " por mês.");
    }
}
