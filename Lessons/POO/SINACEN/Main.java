package POO.SINACEN;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.exibirDados();

        System.out.println();

        PlanoDeTreino planoBasico = new PlanoDeTreino();
        planoBasico.exibirPlano();

        System.out.println();

        PlanoDeTreino planoBasico2 = new PlanoDeTreino("Plano de Iniciantes", 6, "Iniciante");
        planoBasico2.exibirPlano();

        System.out.println();

        PlanoDeTreinoAvancado planoAvancado = new PlanoDeTreinoAvancado();
        planoAvancado.exibirPlano();
    }
}