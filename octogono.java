import java.util.Scanner;

public class octogono {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("diga um número pro qual você quer saber a área: ");
        int valor = sc.nextInt();
        int area = valor * 8;
        System.out.println("a área do octogono é: " + area);
    }
}

