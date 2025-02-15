import java.util.Scanner;

public class aula04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else if (idade < 18 && idade > 0) {
            System.out.println("Você é menor de idade!");
        } else {
            System.out.println("Idade inválida!");
        }

        System.out.println("digite um número de 1 a 7, referente ao dia da semana:");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;

        }
    }

}
