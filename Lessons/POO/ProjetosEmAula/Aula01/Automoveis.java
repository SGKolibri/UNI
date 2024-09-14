package POO.ProjetosEmAula.Aula01;

public class Automoveis {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor padrão
    public Automoveis() {
        this.marca = "Toyota";
        this.modelo = "Corolla";
        this.ano = 1996;
    }

    // Construtor com parâmetros
    public Automoveis(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
