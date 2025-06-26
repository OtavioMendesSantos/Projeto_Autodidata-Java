package Faculdade.ListaHeranca;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, double salario, String matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return this.bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return (this.salario + this.bonusSalarial) * 12;
    }

    @Override
    public void exibeDados() {
        System.out.println("O técnico " + this.nome + ", matrícula " + this.getMatricula() + ", recebe " + this.salario + " + bônus de " + this.bonusSalarial + " por mês.");
    }
}
