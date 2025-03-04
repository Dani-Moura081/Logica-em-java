package testes;
import java.util.Scanner;

public class teste8 {

  public static void main(String[] args) {
    // Sangue nos Oioo 🔥
      Scanner sc = new Scanner(System.in);
      double media1 = sc.nextDouble();
      double media2 = sc.nextDouble();
      double media3 = sc.nextDouble();
      double calculo = (media1+media2+media3) /3;
      boolean resultado = calculo >= 6;
      System.out.println("A média do aluno é " +calculo +" O aluno passou? "+resultado);
  }
}