package POO.ProjetosEmAula.Aula01;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Televisor
        System.out.println("---------------");
        System.out.println("Classe Televisor ");
        Televisor tv = new Televisor("Samsung", "QLED", 55);
        tv.ligar();
        tv.exibirInformacoes();

        System.out.println("");
        System.out.println("---------------");
        System.out.println("Classe Televisor com Dvd ");
        TelevisorComDvd tvComDvd = new TelevisorComDvd("Sony", "QLED", 65, true);
        tvComDvd.ligar();
        tvComDvd.exibirInformacoes();

        System.out.println();
        System.out.println("---------------");
        System.out.println("Classe Geladeira ");

        // Criando um objeto da classe Geladeira
        Geladeira geladeira = new Geladeira("Brastemp", 450, true);
        geladeira.exibirInformacoes();

        System.out.println();
        System.out.println("---------------");
        System.out.println("Classe Fogão ");

        // Criando um objeto da classe Fogão
        Fogao fogao = new Fogao("Consul", 4, true);
        fogao.exibirInformacoes();

        System.out.println();
        System.out.println("---------------");
        System.out.println("Classe Automóvel ");

        // Criando um objeto da classe Automoveis
        Automoveis carro = new Automoveis("Toyota", "Corolla", 2020);
        carro.exibirInformacoes();

        System.out.println();
        System.out.println("---------------");
        System.out.println("Classe Objetos Geométricos ");

        // Criando um objeto da classe ObjetosGeometricos
        ObjetosGeometricos circulo = new ObjetosGeometricos("Círculo", 78.5);
        circulo.exibirInformacoes();
    }
}