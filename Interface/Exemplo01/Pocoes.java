


public class Pocoes {
    public static void main(String[] args) {
        LovePotion lovePotion = new LovePotion();
        InvisibilityPotion invisibilityPotion = new InvisibilityPotion();

        System.out.println("Preparando a Poção do Amor:");
        lovePotion.mix();
        lovePotion.heat();
        lovePotion.drink();

        System.out.println("\nPreparando a Poção de Invisibilidade:");
        invisibilityPotion.mix();
        invisibilityPotion.heat();
        invisibilityPotion.drink();
    }
}
