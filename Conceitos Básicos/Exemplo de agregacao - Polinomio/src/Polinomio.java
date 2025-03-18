import java.util.ArrayList;

class Polinomio {
    private ArrayList<Termo> termos;
    private int grauMax;

    public Polinomio(int grauMax) {
        this.grauMax = grauMax;
        this.termos = new ArrayList<>();
    }

    public void add(Termo novoTermo) {
        if (novoTermo.getGrau() > grauMax) { // Verifica se o grau nao eh maior do que o grau max previo
            System.out.println("Erro: Grau do termo excede o grau máximo do polinômio.");
            return;
        }

        // Procura um termo de mesmo grau para somar, pode ser melhorado
        for (Termo termo : termos) {
            if (termo.getGrau() == novoTermo.getGrau()) {
                termo.setCoef(termo.getCoef() + novoTermo.getCoef());
                return;
            }
        }

        // Caso nao encontre um termo de mesmo grau
        termos.add(novoTermo);

        // Ordenar por grau decrescente
        termos.sort((a, b) -> b.getGrau() - a.getGrau());
    }

    public void mostraPx() {
        if (termos.isEmpty()) {
            System.out.println("P(x) não foi definido");
            return;
        }

        // Transforma o polinomio inteiro em uma string, ha maneira melhor de fazer
        StringBuilder polinomioStr = new StringBuilder();
        polinomioStr.append("P(x) = ");
        for (int i = 0; i < termos.size(); i++) {
            if (i > 0 && termos.get(i).getCoef() > 0) {
                polinomioStr.append(" + ");
            } else {
                polinomioStr.append(" ");
            }
            polinomioStr.append(termos.get(i).toString());
        }

        System.out.println(polinomioStr);
    }

    public double calculaPx(double x) {
        double resultado = 0.0;
        for (Termo termo : termos) {
            resultado += termo.getCoef() * Math.pow(x, termo.getGrau());
        }
        return resultado;
    }
}

