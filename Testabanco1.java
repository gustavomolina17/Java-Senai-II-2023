public class Testabanco {
    public static void main(String[] args) {
        
    
    banco SenaiBank = new banco(10000.0, "Gustavo");
    SenaiBank.exibirInformações();
    SenaiBank.depositar(500);
    System.out.println(SenaiBank.consultarSaldo());
    
}
}