package HP;

public class Pocoes {

    public static void main(String[] args) {
        LovePotion lovePotion = new LovePotion();
        InvisibilityPotion invisibilityPotion = new InvisibilityPotion();

        System.out.println("\t***Preparando Poções***\n");
        System.out.println("Preparando a poção do Amor: \n");
        lovePotion.mix();
        lovePotion.heat();
        lovePotion.drink();

        System.out.println("\nPreparando a poção da Invisibilidade\n");
        invisibilityPotion.mix();
        invisibilityPotion.heat();
        invisibilityPotion.drink();
        
    }
    
}
