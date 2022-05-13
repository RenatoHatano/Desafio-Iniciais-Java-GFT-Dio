import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

    String[] linha = input.split(" ");
//TODO: Complete os espaços em branco com uma possível solução para o desafio


    double media = Double.parseDouble( linha[0] )/
    Double.parseDouble( linha [1] );

    System.out.printf("%.2f",  media   );
  }
}