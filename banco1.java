public class banco {
   private double saldo; //o saldo não pode ser alterado em qualquer parte do programa. 
   private String nomeTitular;
   

public banco(double saldo, String nomeTitular){
    if(saldo>=0){
        this.saldo = saldo;

    } else{ System.out.println("Saldo inicial inválido. O saldo deve ser maior que zero.");

    }
    this.nomeTitular = nomeTitular;
}
//Método para consultar o saldo da conta.

public double consultarSaldo(){
    return saldo;
}

//Método para depositar
public void depositar(double valor){
    if(valor>0){
        saldo += valor; //saldo = saldo + valor.
        System.out.println("Depósito de R$" +valor+ " realizado com sucesso.");
    } else{
        System.out.println("Valor inválido para depósito.");
    }
}

//Método para sacar

public boolean sacar(double valor){
    if(saldo>=valor && valor>0){
        saldo-=valor; //saldo = saldo - valor.
        System.out.println("Saque de R$" +valor+ "realizado com sucesso.");
        return true;
    }else{
        System.out.println("Saque inválido.");
        return false;
    }
}
    //Método para exibição dos dados da Conta

    public void exibirInformações(){
        System.out.println("======SENAI BANK ========");
        System.out.println("Titular da conta: "+nomeTitular);
        System.out.println("Saldo atual da Conta: R$"+saldo);
    
}

}
