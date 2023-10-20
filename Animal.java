package Animal;

interface Animal{ // Criação da Interface
    void comer();
    void dormir();
}

class Mamifero{ // Classe Base (pai para a herança)
    
    String nome;
    String peso;
    String cor;

    public Mamifero(String nome, String peso, String cor){
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }
    void respirar(){
        System.out.println();
    }
    
}

class Cachorro extends Mamifero implements Animal{


    public Cachorro(String nome, String peso, String cor){
        super(nome, peso, cor);
    }

    @Override
    public void comer(){
        System.out.println("O animal está comendo");
    }

    @Override
    public void dormir(){
        System.out.println("O animal está dormindo");
    }
    @Override
    public void respirar(){
        System.out.println("O animal está respirando");
    }
}

