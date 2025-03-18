import java.time.LocalDate;

class Operacao {
    private float o1, o2;
    private Usuario usuario;
    private String tipoOperacao;
    private LocalDate data;

    public Operacao(Usuario usuario, float o1, float o2) {
        this.usuario = usuario;
        this.o1 = o1;
        this.o2 = o2;
        this.data = LocalDate.now();
    }

    public float calcular(int op) {
        switch (op) {
            case 1: tipoOperacao = "Soma"; return o1 + o2;
            case 2: tipoOperacao = "Subtração"; return o1 - o2;
            case 3: tipoOperacao = "Multiplicação"; return o1 * o2;
            case 4: tipoOperacao = "Coeficiente"; return o2 != 0 ? o1 / o2 : Float.NaN;
            default: tipoOperacao = "Operação Inválida"; return Float.NaN;
        }
    }

    public void exibirResultado(float resultado) {
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Tipo de Operação: " + tipoOperacao);
        System.out.println("Data: " + data);
        System.out.println("Resultado: " + resultado);
        System.out.println("--------------------------------");
    }
}
