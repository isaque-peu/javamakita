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

//exercicio 15//
import java.util.Scanner;

public class MenuRepeticao {
    public static void main(String[] args) {
        Scanner is = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Mostrar números de 1 a 10");
            System.out.println("2 - Mostrar pares de 1 a 20");
            System.out.println("3 - Mostrar tabuada do 3");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = is.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Números de 1 a 10:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Números pares de 1 a 20:");
                    for (int i = 1; i <= 20; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Tabuada do 3:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("3 x " + i + " = " + (3 * i));
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        is.close();
    }
}

//exercicio16//
public class fatorial{
    public static void main(String[] args){

     int numero = 5;
     int fatorial = 1;


     for (int i = numero; i <= 1; i--) {
          fatorial *= i;
        

     }
   
       System.out.println("fatorial de " + numero + "=" + fatorial);
   
    }
}

//exercicio 17//
public class MultiplosDe{
    public static void main(String[] args) {
       int contador = 0;

        for(int ram = 1; ram<= 100; ram++){
            if(ram% 3 == 0){
                contador++;
            }
        }
         
        System.out.println("Qualidade de multiplos de 3 entre 1 e 100:" + contador);
    }}

//exercicio 18//
public class MaiorMenor{
    public static void main(String[] args){
     int n1 = 10;
     int n2 = 25;
     int n3 = 7;
     int n4 = 40;
     int n5 = 15;
      
     int maior = n2;
     int menor = n1;

     if(n2 > maior) maior = n2;
     if(n3 > maior) maior = n3;
     if(n4 > maior) maior = n4;
     if(n5 > maior) maior = n5;


     if(n2 < menor) menor = n2;
     if(n3 < menor) menor = n3;
     if(n4 < menor) menor = n4;
     if(n5 < menor) menor = n5;

      System.out.println("Maior valor:" + maior);
      System.out.println("Menor valor:" + menor);

    }
}
//exercicio 19//
import java.util.Scanner;

public class SomaAteParar{
   public static void main(String[] args) {
       Scanner is = new Scanner(System.in);

       int numero;
       int soma = 0;
         
       System.out.println("Digite números (0 para papar):");
       numero = is.nextInt();

         while (numero != 0){
             soma += numero;
             numero = is.nextInt();
       }

        System.out.println("Total acumulado: " +soma);
   } 
//exercicio 20//
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double n1 = sc.nextDouble();

                System.out.print("Digite o segundo número: ");
                double n2 = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (n1 * n2));
                        break;
                    case 4:
                        if (n2 != 0) {
                            System.out.println("Resultado: " + (n1 / n2));
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Programa encerrado!");
    }
}
