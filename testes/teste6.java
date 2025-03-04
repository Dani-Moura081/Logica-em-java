package testes;
import java.util.Scanner;
public class teste6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double compra = sc.nextDouble();
    int parcelas = sc.nextInt();
    double resultado = compra / parcelas;
    System.out.println(String.format("Sua compra de R$ %.2f em %dx parcelas de R$ %.2f foi concluída", compra, parcelas, resultado));
    sc.close();
  
  }
}

// ("Sua compra de R$ "+compra+" em "+parcelas+"x de R$ "+resultado+" foi concluída");