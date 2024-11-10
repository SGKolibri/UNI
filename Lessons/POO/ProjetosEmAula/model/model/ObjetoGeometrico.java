package model;

// Superclasse ObjetoGeometrico
public class ObjetoGeometrico {
    private String cor;
    private double espessura;

    public ObjetoGeometrico(String cor, double espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    // Getters e setters para ObjetoGeometrico
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getEspessura() {
        return espessura;
    }

    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }

    @Override
    public String toString() {
        return "ObjetoGeometrico [Cor: " + cor + ", Espessura: " + espessura + "]";
    }

    public static void main(String[] args) {
        // Cria um objeto Retangulo e testa os getters e setters
        Retangulo retangulo = new Retangulo("Azul", 1.5, 10.0, 5.0);
        System.out.println("Retângulo:");
        System.out.println("Cor do Retângulo: " + retangulo.getCor());
        System.out.println("Espessura do Retângulo: " + retangulo.getEspessura());
        System.out.println("Largura do Retângulo: " + retangulo.getLargura());
        System.out.println("Altura do Retângulo: " + retangulo.getAltura());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());

        // Modificando o Retângulo
        retangulo.setCor("Vermelho");
        retangulo.setEspessura(2.0);
        retangulo.setLargura(15.0);
        retangulo.setAltura(7.5);
        System.out.println("\nApós modificações no Retângulo:");
        System.out.println(retangulo);

        // Cria um objeto Triangulo e testa os getters e setters
        Triangulo triangulo = new Triangulo("Verde", 1.0, 6.0, 8.0, 10.0, 12.0);
        System.out.println("\nTriângulo:");
        System.out.println("Cor do Triângulo: " + triangulo.getCor());
        System.out.println("Espessura do Triângulo: " + triangulo.getEspessura());
        System.out.println("Base do Triângulo: " + triangulo.getBase());
        System.out.println("Altura do Triângulo: " + triangulo.getAltura());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do Triângulo: " + triangulo.calcularPerimetro());

        // Modificando o Triângulo
        triangulo.setCor("Amarelo");
        triangulo.setEspessura(1.5);
        triangulo.setBase(7.0);
        triangulo.setAltura(12.0);
        System.out.println("\nApós modificações no Triângulo:");
        System.out.println(triangulo);

        // Cria um objeto Circulo e testa os getters e setters
        Circulo circulo = new Circulo("Azul", 1.5, 10.0);
        System.out.println("Círculo:");
        System.out.println("Cor do Círculo: " + circulo.getCor());
        System.out.println("Espessura do Círculo: " + circulo.getEspessura());
        System.out.println("Raio do Círculo: " + circulo.getRaio());
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro (Circunferência) do Círculo: " + circulo.calcularPerimetro());

        // Modificando o Círculo
        circulo.setCor("Vermelho");
        circulo.setEspessura(2.0);
        circulo.setRaio(15.0);
        System.out.println("\nApós modificações no Círculo:");
        System.out.println(circulo);
    }
}

// Subclasse Retangulo que herda de ObjetoGeometrico
class Retangulo extends ObjetoGeometrico {
    private double largura;
    private double altura;

    public Retangulo(String cor, double espessura, double largura, double altura) {
        super(cor, espessura);
        this.largura = largura;
        this.altura = altura;
    }

    // Getters e setters para Retangulo
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return "Retangulo [Cor: " + getCor() + ", Espessura: " + getEspessura() +
               ", Largura: " + largura + ", Altura: " + altura + 
               ", Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro() + "]";
    }
}

// Subclasse Triangulo que herda de ObjetoGeometrico
class Triangulo extends ObjetoGeometrico {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(String cor, double espessura, double base, double altura, double lado1, double lado2) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Getters e setters para Triangulo
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    // Método para calcular a área
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return base + lado1 + lado2;
    }

    @Override
    public String toString() {
        return "Triangulo [Cor: " + getCor() + ", Espessura: " + getEspessura() +
               ", Base: " + base + ", Altura: " + altura + ", Lado1: " + lado1 + ", Lado2: " + lado2 +
               ", Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro() + "]";
    }
}

class Circulo extends ObjetoGeometrico {
    private double raio;

    public Circulo(String cor, double espessura, double raio) {
        super(cor, espessura);
        this.raio = raio;
    }

    // Getter e setter para raio
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);  // Área = π * r²
    }

    // Método para calcular o perímetro (circunferência)
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;  // Perímetro = 2 * π * r
    }

    @Override
    public String toString() {
        return "Circulo [Cor: " + getCor() + ", Espessura: " + getEspessura() +
               ", Raio: " + raio + ", Área: " + calcularArea() + 
               ", Perímetro (Circunferência): " + calcularPerimetro() + "]";
    }
}