package testes;
import java.util.Scanner;

public class teste9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean calculo = num % 2== 0;
    boolean resposta = calculo;

    System.out.println("Número é par? "+resposta);
    
  }

}
