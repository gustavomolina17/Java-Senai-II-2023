public class moto {

    // Criação dos atributos

    boolean ligada;
    double velocidadeAtual;
    double velocidadeMáxima;
    String combustivel;
    int cilindrada;
 
   //Criação dos métodos

   void ligarScooter(){
    ligada = true;
    System.out.println("A Scooter está ligada");
   }

   void ligarBMW(){
    ligada = true;
    System.out.println("A BMW está ligada");
   }

   void desligarScooter(){
    ligada = false;
    System.out.println("A Scooter está desligada");
   }

   void desligarBMW(){
    ligada = false;
    System.out.println("A BMW está desligada");
   }

   void buzinarScooter(){
    System.out.println("Biiiiiiiiiiiiiiii!!!!");
   }

   void buzinarBMW(){
    System.out.println("Foooooooooooon");
   }

   // Método com retorno

   int acelerarScooter(double quantidade){
    double novaVelocidade = velocidadeAtual + quantidade;
    velocidadeAtual = novaVelocidade;
    if (novaVelocidade>velocidadeMáxima){
        return 0;
    } else {
        return 1;
    }
   };

    int acelerarBMW(double quantidade2){
    double novaVelocidade = velocidadeAtual + quantidade2;
    velocidadeAtual = novaVelocidade;
    if (novaVelocidade>velocidadeMáxima){
        return 0;
    } else {
        return 1;
    }
   };


}


    
