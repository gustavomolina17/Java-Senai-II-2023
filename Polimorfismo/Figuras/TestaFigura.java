

public class TestaFigura {

    public static void main(String[] args) {

        Figura f1 = new Quadrado(6);
        Figura f2 = new Circulo(2);
        Figura f3 = new Triangulo(5, 2);

        // Comportamento polimórfico

        System.out.println("\n"+"****POLIMORFISMO****"+"\n");
        System.out.println("A área do Quadrado é: " + f1.calcularArea() + " cm²" + "\n" + "A área do Círculo é: "
                + f2.calcularArea() + " cm²" + "\n" + "A área do Triângulo é: " + f3.calcularArea() + " cm²");

    }

}