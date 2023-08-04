public class Carro{

    String modelo;
    int anoFabricacao;
    String cor;

    //Método Construtor

    public Carro(String modelo, int anoFabricacao,String cor){
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    // Método para exibir as informações do carro

    public void exibirInformacoes(){

        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano de Fabricação: "+ anoFabricacao);
        System.out.println("Cor: "+ cor);

    }
}