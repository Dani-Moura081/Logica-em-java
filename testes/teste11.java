package testes;
import java.util.Scanner;

public class teste11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean farol = sc.nextLine().equals("Verde");
    boolean carrosParados = sc.nextLine().equals("Sim");
    boolean resposta = farol == true && carrosParados == true;
    System.out.println("Pode atravessar? " +resposta);
    
  }
}
