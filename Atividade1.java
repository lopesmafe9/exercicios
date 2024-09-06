//a partir da segunda questão o main está junto
public class Atividade1 {

    public static void main(String[] args) {
    // Questão 2
        calculadora calcula = new calculadora();

        System.out.println();
        System.out.println(calcula.soma(9, 9));
        System.out.println(calcula.soma(3.5, 2.5));

        // Questão 3
        produto pro = new produto();

        System.out.println();
        pro.exibirInformacoes("LipGloss Obsidian Moonstone");
        pro.exibirInformacoes("Lip Balsam Obsidian Tiger Eye", 6);
        pro.exibirInformacoes("Lip Hydra Oil Obsidian", 11, 13.90);

        // Questão 4
        contribuinte c1 = new contribuinte();

        c1.setNome("Joana");
        c1.setSalarioBruto(3.687);
        c1.calcularImposto();

        System.out.println("Salário líquido de " + c1.getNome() + ": R$ " + c1.getSalarioLiquido());
        System.out.println(c1.toString());

        // Questão 5
        cachorro floquinho = new cachorro();
        gato mingau = new gato();

        System.out.println();

        floquinho.comer();
        floquinho.andar();
        floquinho.latir();

        mingau.andar();
        mingau.miar();
    }
}

