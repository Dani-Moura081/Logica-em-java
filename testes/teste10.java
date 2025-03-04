package testes;
import java.util.Scanner;
public class teste10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual é o personagem de Friends que trabalha com TI?");
    boolean pergunta = sc.nextLine().equals("Chandler");
    System.out.println("Resposta correta....: "+pergunta);
  }
}
