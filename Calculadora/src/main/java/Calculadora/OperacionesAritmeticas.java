package Calculadora;

/**
 *
 * @author Carlos
 */
public class OperacionesAritmeticas {

    public double result;

    public OperacionesAritmeticas() {
    }

    public OperacionesAritmeticas(double result) {
        this.result = result;
    }

    public void calculoSuma(double n1, double n2) {
        result = n1 + n2;
    }

    public void calculoResta(double n1, double n2) {
        result = n1 - n2;
    }

    public void calculoMultiplicacion(double n1, double n2) {
        result = n1 * n2;
    }

    public void calculoDivision(double n1, double n2) {
        result = n1 / n2;
    }
}
