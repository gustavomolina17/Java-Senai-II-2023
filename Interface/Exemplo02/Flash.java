package Exemplo02;

// Interface Superhero
interface Superhero {
    void runFast();
    void savePeople();
    void useSuperpower();
}

// Classe Flash
class Flash implements Superhero {
    @Override
    public void runFast() {
        System.out.println("Flash está correndo em velocidade máxima!");
    }

    @Override
    public void savePeople() {
        System.out.println("Flash está salvando pessoas em perigo!");
    }

    @Override
    public void useSuperpower() {
        System.out.println("Flash está usando seu superpoder de velocidade!");
    }
}

// Classe Speedster
class Speedster implements Superhero {
    @Override
    public void runFast() {
        System.out.println("O Speedster também está correndo muito rápido!");
    }

    @Override
    public void savePeople() {
        System.out.println("O Speedster está salvando vidas com sua velocidade!");
    }

    @Override
    public void useSuperpower() {
        System.out.println("O Speedster está usando seu próprio superpoder!");
    }
}


