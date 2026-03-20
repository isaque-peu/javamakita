import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner mp = new Scanner(System.in);
     
        int opcao = 1;

       System.out.println("/n===MENU===");
       System.out.println("1-Mostrar 'Olá'");
       System.out.println("2-Mostrar 'bem vindo'");
       System.out.println("0-Sair");
       System.out.println("Escolha uma opção:" );
        

       switch (opcao) {
        case 1:
            System.out.println("Olá");
            break;
       case 2 :
            System.out.println("Bem vindo");
            break;
        case 0 :
            System.out.println("Saindo do sistema");    
             break;
         default:
            System.out.println("opção invalida");


    }  while (opcao != 0);
        
    }
}
