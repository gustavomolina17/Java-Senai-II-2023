package Flash;

public class TestaHeroi {

    public static void main(String[] args) {

         Flash flash = new Flash();
         Speedster flashreverso = new Speedster();
        
    System.out.println("\tFlash o super-herói da velocidade: \n");
    flash.runFast();
    flash.savePeople();
    flash.useSuperPower();

    System.out.println("\n\tFlash Reverso: \n");
    flashreverso.runFast();
    flashreverso.savePeople();
    flashreverso.useSuperPower();

    }
    
}
