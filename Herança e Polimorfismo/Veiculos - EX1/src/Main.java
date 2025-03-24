public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
                new Bicicleta("Bicicleta A"),
                new Automovel("Carro 1", 5000000, 5),
                new Bicicleta("Bicicleta B"),
                new Automovel("Carro 2", 120000, 8)
        };
        Oficina oficina = new Oficina(veiculos);

        Veiculo v;
        while ((v = oficina.proximo()) != null) {
            oficina.manutencao(v);
        }
    }
}