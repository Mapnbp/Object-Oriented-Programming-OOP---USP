class Termo {
    private double coeficiente;
    private int grau;


    public Termo(double coeficiente, int grau) {
        this.coeficiente = coeficiente;
        this.grau = grau;
    }

    public double getCoef() {
        return coeficiente;
    }

    public int getGrau() {
        return grau;
    }

    public void setCoef(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    // Adaptacao do objeto para string, funciona como um sout
    public String toString() {
        if (grau == 0) return String.format("%.2f", coeficiente);
        if (grau == 1) return String.format("%.2fx", coeficiente);
        return String.format("%.2fx^%d", coeficiente, grau);
    }
}
