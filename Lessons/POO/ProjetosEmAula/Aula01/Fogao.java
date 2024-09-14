package POO.ProjetosEmAula.Aula01;

public class Fogao {
    private String marca;
    private int quantidadeBocas;
    private boolean forno;

    // Construtor padrão
    public Fogao() {
        this.marca = "Brastemp";
        this.quantidadeBocas = 5;
        this.forno = false;
    }

    // Construtor com parâmetros
    public Fogao(String marca, int quantidadeBocas, boolean forno) {
        this.marca = marca;
        this.quantidadeBocas = quantidadeBocas;
        this.forno = forno;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeBocas() {
        return quantidadeBocas;
    }

    public void setQuantidadeBocas(int quantidadeBocas) {
        this.quantidadeBocas = quantidadeBocas;
    }

    public boolean isForno() {
        return forno;
    }

    public void setForno(boolean forno) {
        this.forno = forno;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade de Bocas: " + quantidadeBocas);
        System.out.println("Forno: " + (forno ? "Sim" : "Não"));
    }
}
