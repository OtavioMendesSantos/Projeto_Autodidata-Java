package ListaHeranca;

public class Analista extends FuncionarioBanco {

    public Analista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase * 1.10;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: Analista");
        System.out.println("Salário Total: " + this.calcularSalario());
    }
}