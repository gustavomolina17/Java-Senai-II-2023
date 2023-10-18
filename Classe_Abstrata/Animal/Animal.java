package Animal;
/* Classe abstrata é uma classe em Java que não pode ser instanciada diretamente.
Em vez disso, ela serve como um modelo para outras classes (subclasses) que a estendem (HERANÇA). */


abstract class Animal {
    String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public abstract void mover();
    
}


/* Criação da classe concreta Cachorro que estende Animal e implementa o método mover
para representar o movimento de um cachorro */

 // Herança
 class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

 // Polimorfismo
    @Override
    public void mover() {
        System.out.println(nome + " corre e late!");
    }
}


/* Criação da classe concreta Pato que estende Animal e implementa o método mover
para representar o movimento de um pato */

class Pato extends Animal {
    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println(nome + " nada e grasna!");
    }
}
