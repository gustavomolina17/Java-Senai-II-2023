public class Cachorro {

    // Criação dos atributos

    int tamanho;
    String nome;

    // Criação das ações

    void latir(){

        if (tamanho>60){
            System.out.println("Woof, Woof!!!!");
        }

        if (tamanho >=14 && tamanho<=60){
            System.out.println("Ruff, Ruff");
        }

        else{
            System.out.println("Yip, yip");
        }

    }
    
}
