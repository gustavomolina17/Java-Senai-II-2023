import java.util.Scanner;

public class TestaRanger {
    public static void main(String[] args) {
        
        System.out.println("\n"+"***It's Morphing Time***"+"\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do Power Ranger Verde: "+"\n");
        String nomeVerde = scanner.nextLine();
        PowerRanger ranger1 = new PowerRangerVerde(nomeVerde);
        
        System.out.print("Digite o nome do Power Ranger Preto: "+"\n");
        String nomePreto = scanner.nextLine();
        PowerRanger ranger2 = new PowerRangerPreto(nomePreto);

        System.out.print("Digite o nome da Power Ranger Rosa: "+"\n");
        String nomeRosa = scanner.nextLine();
        PowerRanger ranger3 = new PowerRangerRosa(nomeRosa);

        
        System.out.print("Digite o nome do Power Ranger Azul: "+"\n");
        String nomeAzul = scanner.nextLine();
        PowerRanger ranger4 = new PowerRangerAzul(nomeAzul);


        System.out.print("Digite o nome da Power Ranger Amarela: "+"\n");
        String nomeAmarela = scanner.nextLine();
        PowerRanger ranger5 = new PowerRangerAmarela(nomeAmarela);  

        System.out.print("Digite o nome do Power Ranger Vermelho: "+"\n");
        String nomeVermelho = scanner.nextLine();
        PowerRanger ranger6 = new PowerRangerVermelho(nomeVermelho);
        
        scanner.close();
        
        ranger1.morfar(); 
        ranger2.morfar(); 
        ranger3.morfar();
        ranger4.morfar();
        ranger5.morfar();
        ranger6.morfar();
    }
}





