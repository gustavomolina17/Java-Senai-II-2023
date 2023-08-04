import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        carro PaganiHuyara; // Criando uma variável do tipo carro
        PaganiHuyara = new carro(); // Objeto criado

        // Chamando os métodos

        PaganiHuyara.ligar();
        PaganiHuyara.roncar();
        PaganiHuyara.desligar();

        PaganiHuyara.velocidadeMaxima = 360;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você quer acelerar?");
        double valor = sc.nextDouble();
        int teste = PaganiHuyara.acelerar(valor);
        System.out.println("A velocidade atual é: " + PaganiHuyara.velocidadeAtual + "km/h.");
        if (teste == -1) {
            System.out.println("A velocidade é igual ou superior a velocidade máxima");
        }

        // Definindo as marchas do carro

        if (PaganiHuyara.velocidadeAtual == 0) {
            System.out.println("O Pagani Huyara está parado");
        }
        if (PaganiHuyara.velocidadeAtual > 0 && PaganiHuyara.velocidadeAtual <= 60) {
            System.out.println("O carro está na 1ª Marcha");
        }
        if (PaganiHuyara.velocidadeAtual > 90 && PaganiHuyara.velocidadeAtual <= 120) {
            System.out.println("O carro está na 2ª Marcha");
        }
        if (PaganiHuyara.velocidadeAtual > 150 && PaganiHuyara.velocidadeAtual <= 180) {
            System.out.println("O carro está na 3ª Marcha");
        }
        if (PaganiHuyara.velocidadeAtual > 210 && PaganiHuyara.velocidadeAtual <= 240) {
            System.out.println("O carro está na 4ª Marcha");
        }
        if (PaganiHuyara.velocidadeAtual > 270 && PaganiHuyara.velocidadeAtual <= 300) {
            System.out.println("O carro está na 5ª Marcha");
        }
        if (PaganiHuyara.velocidadeAtual > 330 && PaganiHuyara.velocidadeAtual <= 360) {
            System.out.println("O carro está na 6ª Marcha");
        }
        if (PaganiHuyara.velocidadeAtual > 360) {
            System.out.println("O carro está na 7ª Marcha");
        }

        sc.close();
    }
}
