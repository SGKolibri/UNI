package POO.ProjetosEmAula.Aula01;

// Geladeira e Fogão são subclasses de Eletrodomestico
public class Eletrodomestico {
    private String marca;
    private String modelo;

    // Construtor padrão
    public Eletrodomestico() {
        this.marca = "Samsung";
        this.modelo = "Desconhecido";
    }

    // Construtor com parâmetros
    public Eletrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
