package Faculdade.ListaHeranca;

public class Administrativo extends Assistente{
    String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, String matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // Getter e Setter para adicionalNoturno
    public double getAdicionalNoturno() {
        return this.adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    // Sobrescrevendo ganhoAnual
    @Override
    public double ganhoAnual() {
        if (this.turno.equalsIgnoreCase("noite")) {
            return (this.salario + this.adicionalNoturno) * 12;
        } else {
            return this.salario * 12;
        }
    }

    // Sobrescrevendo exibeDados para mostrar turno e adicional
    @Override
    public void exibeDados() {
        System.out.println("O administrativo " + this.nome +
                ", matrícula " + this.getMatricula() +
                ", trabalha no turno " + this.turno +
                " e recebe " + this.salario + " por mês." +
                (this.turno.equalsIgnoreCase("noite") ?
                        " Adicional noturno: " + this.adicionalNoturno : ""));
    }
}
