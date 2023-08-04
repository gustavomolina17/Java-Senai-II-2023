public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Jalin",24,"Garoto de Programa");
        Pessoa pessoa2 = new Pessoa("Cinthia", 16, "estudante");
        Pessoa pessoa3 = new Pessoa("Charles Lee Ray", 31, "Assassino " );
        Pessoa pessoa4 = new Pessoa("Tomy Oliver", 22,"Ranger Verde");

        pessoa1.exibirInformacoes();
        System.out.println("");
        pessoa2.exibirInformacoes();
         System.out.println("");
        pessoa3.exibirInformacoes();
         System.out.println("");
        pessoa4.exibirInformacoes();
    }

    
    
}
