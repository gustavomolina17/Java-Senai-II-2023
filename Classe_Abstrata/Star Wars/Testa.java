 

/* Neste exemplo, a classe abstrata PersonagemStarWars define um método abstrato executarAcao().
 As classes concretas Jedi e Sith herdam de StarWars e implementam o método executarAcao().
Isso permite que cada personagem execute uma ação específica relacionada ao seu alinhamento na Força.*/



public class Testa {
    public static void main(String[] args) {
        StarWars lukeSkywalker = new Jedi("Luke Skywalker");
        StarWars darthVader = new Sith("Darth Vader");

        lukeSkywalker.executarAcao(); // Executa a ação de um Jedi
        darthVader.executarAcao(); // Executa a ação de um Sith
    }
}