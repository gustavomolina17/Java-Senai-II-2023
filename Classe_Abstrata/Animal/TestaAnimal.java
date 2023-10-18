package Animal;

public class TestaAnimal {
        public static void main(String[] args) {
            Animal pluto = new Cachorro("Pluto");
            Animal donald = new Pato("Donald");
    
            pluto.mover();     // O cachorro corre e late!
            donald.mover();  // O pato nada e grasna!
        }
    }

