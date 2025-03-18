// Alterei para que as datas para imprimir localdate, que faz mais sentido.
// Tambem alterei para que cada operacao tivesse um valor
public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Carlos Silva", 30, "123.456.789-00");

        // Soma
        Operacao op1 = new Operacao(user1, 10.5f, 2.5f);
        float resultado1 = op1.calcular(1);
        op1.exibirResultado(resultado1);

        // Subtracao
        Operacao op2 = new Operacao(user1, 15.2f, 3.1f);
        float resultado2 = op2.calcular(2);
        op2.exibirResultado(resultado2);

        // Multiplicacao
        Operacao op3 = new Operacao(user1, 1.2f, 0.0f);
        float resultado3 = op3.calcular(3);
        op3.exibirResultado(resultado3);

        // Divisao
        Operacao op4 = new Operacao(user1, 150.7f, 5.4f);
        float resultado4 = op4.calcular(4);
        op4.exibirResultado(resultado4);

        // Erro por operacao invalida
        Operacao op5 = new Operacao(user1, 15.2f, 3.1f);
        float resultado5 = op5.calcular(7);
        op5.exibirResultado(resultado5);

        // Divisao por zero
        Operacao op6 = new Operacao(user1, 5.7f, 0.0f);
        float resultado6 = op6.calcular(4);
        op6.exibirResultado(resultado6);
    }
}