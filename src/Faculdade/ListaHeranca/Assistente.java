package Faculdade.ListaHeranca;

public class Assistente extends Funcionario {
    private String matricula;

    public Assistente(String nome, double salario, String matricula){
        super(nome,salario);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String m){
        this.matricula = m;
    }

    @Override
    public void exibeDados() {
        System.out.println("O funcionário " + this.nome + " recebe " + this.salario + " por mês. " + "Matrícula: " + this.matricula);
    }
}
