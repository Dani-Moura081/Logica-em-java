package testes;
import java.util.Scanner;

public class teste3 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      int num = ler.nextInt();
      double metade = num / 2.0;
      System.out.println(String.format("A metade de %d é %.2f", num, metade));
    }
    
}