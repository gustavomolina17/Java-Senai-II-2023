package HP;

// Interface Poção

interface Potion{
    void mix(); // Um método para misturar as poções
    void heat(); // Um método para aquecer as poções
    void drink(); // Um método para beber as poções
}

class LovePotion implements Potion{
   
    @Override //Polimorfismo
    public void mix(){
        System.out.println("Misturando os ingredientes da Poção do Amor.");
    }
    @Override
    public void heat(){
        System.out.println("Aquecendo a poção no caldeirão com um toque de paixão.");
    }

   @Override
    public void drink(){
        System.out.println("A pessoa que bebeu a poção se APAIXONA PROFUNDAMENTE.");
    }

    }

    class InvisibilityPotion implements Potion{

        @Override
        public void mix(){
            System.out.println("Misturando os ingredientes da Poção de Invisibilidade.");
        }

        @Override
        public void heat(){
            System.out.println("Aquecendo a poção no caldeirão até que ela fique transparente.");
        }

        @Override
        public void drink(){
            System.out.println("Após beber a poção você fica invisivel.");
        }
    }



