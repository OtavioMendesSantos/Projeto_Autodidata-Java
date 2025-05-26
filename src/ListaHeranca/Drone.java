package ListaHeranca;

public class Drone extends Veiculo {
    private double alcanceKm;

    public Drone(String marca, int anoFabricacao, double alcanceKm) {
        super(marca, anoFabricacao);
        this.alcanceKm = alcanceKm;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Alcance: " + this.alcanceKm + " km");
    }
}
