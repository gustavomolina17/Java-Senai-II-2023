package Animal;

public class TestaAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pluto", "58", "Azul");
        cachorro.comer(); // Método da Interface
        cachorro.dormir(); // Método da Interface
        cachorro.respirar(); // Método da herança
        System.out.println("O cachorro: " +cachorro.nome
        +" pesa "+cachorro.peso+" e é: "+cachorro.cor);
    }
    
}
