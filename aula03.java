import java.util.Scanner;

public class aula03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // o que são operadores?
        // operadores são símbolos que são usados para realizar operações em dois valores 

        // operadores aritméticos: +, - , * , / , % 
        System.out.println("digite um número: ");
        int num1 = sc.nextInt();
        System.out.println("digite outro número: ");
        int num2 = sc.nextInt();
        
        System.out.println("em caso de soma:");
        System.out.println(num1 + num2);
        System.out.println("em caso de subtração:");
        System.out.println(num1 - num2);
        System.out.println("em caso de multiplicação:");
        System.out.println(num1 * num2);
        System.out.println("em caso de divisão:");
        System.out.println(num1 / num2);
        System.out.println("em caso de resto:");
        System.out.println(num1 % num2);

        
    }
}
