package testes;
import java.util.Scanner; 

public class teste5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double valor = sc.nextDouble();
    double desconto = sc.nextDouble();
    double valorDesconto = valor * (desconto / 100);
    double valorFinal = valor - valorDesconto;
    System.out.println("Compra finalizada! O total é de R$ "+valorFinal);   
    
  }
  
}
