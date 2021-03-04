package Exercicio2;

public interface Imposto {
    public void calcularImposto(double valor) {
        double Icms();
        double Ipi();
        double Cofins();

        total = icms + ipi + cofins;
        return total;
    }

}
