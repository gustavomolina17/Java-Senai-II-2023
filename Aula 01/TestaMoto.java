import java.util.Scanner; // Importando o Scanner

public class TestaMoto{

    public static void main(String[] args) {

        moto scooter = new moto();
        moto bmw = new moto();

        scooter.velocidadeAtual = 25;
        bmw.velocidadeAtual = 46;
        scooter.velocidadeMáxima = 50;
        bmw.velocidadeMáxima = 220;

        scooter.ligarScooter();
        System.out.println(scooter.velocidadeAtual);

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você quer acelerar com a sua super Scooter??");
        double valor = sc.nextDouble();
        int teste = scooter.acelerarScooter(valor);
        System.out.println("Sua velocidade atual é "+scooter.velocidadeAtual+ "km/h");
        if (teste==0){
            System.out.println("Impossivel. Velocidade acima do limite");
        } else{
            System.out.println("Diminua a velocidade");
        }
        scooter.buzinarScooter();
        scooter.desligarScooter();
        System.out.println("");

        bmw.ligarBMW();
        System.out.println(bmw.velocidadeAtual);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Quanto você quer acelerar com a BWM??");
        double valor2 = sc.nextDouble();
        int teste2 = bmw.acelerarBMW(valor2);
        System.out.println("Sua velocidade atual é "+bmw.velocidadeAtual+ "km/h");
        if (teste2==0){
            System.out.println("Impossivel. Velocidade acima do limite");
        } else{
            System.out.println("Diminua a velocidade");
        }

        bmw.buzinarBMW();
        bmw.desligarBMW();


        sc.close();
        sc2.close();
    }
    
}