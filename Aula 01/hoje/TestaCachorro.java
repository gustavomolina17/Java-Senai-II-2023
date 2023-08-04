public class TestaCachorro {

    public static void main(String[] args) {
        
        // Criação dos Cachorros

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Babalu";
        cachorro1.tamanho = 5;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Thor";
        cachorro2.tamanho = 18;

        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Bob";
        cachorro3.tamanho = 70;

        //Chamando o método Latir

        cachorro1.latir();
        cachorro2.latir();
        cachorro3.latir();

        System.out.println("O nome do cachorro 2 é: "+cachorro2.nome);






    }
    
}
