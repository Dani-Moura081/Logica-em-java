import java.util.Scanner;

public class aula07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // o que é uma função? uma função é um bloco de código que pode ser executado 
    // várias vezes, sem precisar repetir o código. Funções são usadas para organizar 
    // o código e facilitar a manutenção do programa.
    System.out.println("Função simples de soma, digite dois números e ela irá somar");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int resultado = soma(num1, num2);
    System.out.println("Resultado da soma: " + resultado);
  }
  public static int soma(int num1, int num2) {
    return num1 + num2;
  }
}
