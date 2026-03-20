//exercicio 10//
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

//Exercicio 11//
public class main {
    public static void main(String[] args);
        int soma = 0;
    for(int ram = 1; ram <= 100; ram++){
        if(ram % 2 == 0){
        soma += ram;
        }
     }
        System.out.println("Soma dos pares 1 a 100: " + soma);

    }
}

//exercicio 12//
public class main {
    public static void main(String[] args){
    int positivo = 0;
    int negativo = 0;
    

     for(int ram = -10;ram <= 10; ram++){
       if(ram > 0){
           positivo++;
       }else if (ram < 0){
           negativo++;
       }
        System.out.println("positivo" + positivo);
        System.out.println("negativo" + negativo);
      }
    }
}

//exercicio 13//
public class main {
    public static void main(String[] args){
   

    for(int ram = 1; ram <= 5; ram++){
      System.out.println("Tabuada do" + ram);
      
     for(int s = 1; s <= 10; s++){
      int resultado =  ram * s;
         System.out.println( ram + "x" +s+ "=" + resultado);
     
      
      }}
    }}

//exercicio 14//
public class main {
    public static void main(String[] args){
   
     double n1 = 80;
     double n2 = 60;
     double n3 = 70;
     double n4 = 50;
     double n5 = 90;
     
double media = (n1 + n2 + n3 + n4 + n5)/5;

System.out.println("Media: " + media);

if(media >= 70){
    System.out.println("Aprovado");
}else if (media >= 50){ 
    System.out.println("Recuperação");
}else{
    System.out.println("Reprovado");
} 
}}
