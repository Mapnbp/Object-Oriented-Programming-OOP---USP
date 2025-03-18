public class Main {

    public static void main(String[] args) {
        Polinomio p = new Polinomio(5);

        // Primeiro vamos tentar entradas "erradas"
        p.mostraPx();
        p.add(new Termo(3, 6));

        // Entradas corretas
        p.add(new Termo(3, 2));
        p.add(new Termo(2, 3));
        p.add(new Termo(-1, 0));
        p.add(new Termo(-4, 1));
        p.mostraPx();

        // Soma com o termo de grau 2 ja existente
        p.add(new Termo(4, 2));
        p.mostraPx();

        // Deve exibir algo como "2.00x^3 + 7.00x^2 - 4.00x - 1.00"
        p.mostraPx();

        double x = 2.0;
        System.out.println("P(" + x + ") = " + p.calculaPx(x)); // Avaliação do polinômio em x = 2
    }
}