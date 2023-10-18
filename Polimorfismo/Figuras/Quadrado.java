

public class Quadrado extends Figura { // Herança
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Declarando o cálculo de área do Quadrado
    // Sobreposição do método da superclasse

    public double calcularArea() {
        double area = 0;
        area = lado * lado;
        return area;
    }
}
