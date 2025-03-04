package testes;
import java.util.Scanner;

public class teste4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int altura = sc.nextInt();
    int base = sc.nextInt();
    double area = (base * altura) / 2;
    System.out.println("A área do triângulo (Altura "+ altura  +" x Base " +base+ ") é "+area );
    
  }
}