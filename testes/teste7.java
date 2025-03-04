package testes;
import java.util.Scanner;

public class teste7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salarioBruto = sc.nextDouble();
    double bonus = sc.nextDouble();
    double desconto = sc.nextDouble();
    double salarioFinal = salarioBruto + ((salarioBruto * bonus) / 100) - desconto;
    // double salarioFinal = salarioBruto +
    System.out.println("Seu salário líquido é de R$ " + salarioFinal);

  }

}
