import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Diga seu peso: ");
        double peso = sc.nextDouble();
        double resultado = peso / (altura * altura);
        System.out.println("seu IMC é :" + resultado);
    
    }
}
