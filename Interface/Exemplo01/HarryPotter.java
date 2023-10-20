
// Interface Potion
interface Potion {
    void mix(); // Um método que representa a ação de misturar os ingredientes da poção.
    void heat(); // Um método que representa o aquecimento da poção no caldeirão.
    void drink(); // Um método que representa o ato de beber a poção.
}

// Classe LovePotion
class LovePotion implements Potion {
    @Override
    public void mix() {
        System.out.println("Misturando ingredientes mágicos da Poção do Amor.");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo a poção no caldeirão com um toque de paixão.");
    }

    @Override
    public void drink() {
        System.out.println("A pessoa que bebeu a Poção do Amor se apaixona profundamente!");
    }
}

// Classe InvisibilityPotion
class InvisibilityPotion implements Potion {
    @Override
    public void mix() {
        System.out.println("Misturando ingredientes mágicos da Poção de Invisibilidade.");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo a poção no caldeirão até que ela fique transparente.");
    }

    @Override
    public void drink() {
        System.out.println("O bebedor da Poção de Invisibilidade se torna invisível por um curto período de tempo.");
    }
}


