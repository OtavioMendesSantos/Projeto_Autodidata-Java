package ListaHeranca;

public class Veiculo {
    protected String marca;
    protected int anoFabricacao;

    public Veiculo(String marca, int anoFabricacao) {
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public void exibirDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
    }
}
