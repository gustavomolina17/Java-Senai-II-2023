
// Classe abstrata quer não pode ser instanciada
abstract class StarWars {
    String nome;

    public StarWars(String nome) {
        this.nome = nome;
    }

 // Método abstrato que deve ser implementado pelas subclasses
    public abstract void executarAcao();   
}

class Jedi extends StarWars { // Herança
    public Jedi(String nome) {
        super(nome);
    }

    @Override // Polimorfismo
    public void executarAcao() {
        System.out.println(nome + " usa a Força para o lado da luz.");
    }
}

class Sith extends StarWars {
    public Sith(String nome) {
        super(nome);
    }

    @Override
    public void executarAcao() {
        System.out.println(nome + " usa o Lado Negro da Força.");
    }
}