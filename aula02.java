import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) {
        // variável ler para ler dados no terminal
        Scanner ler = new Scanner(System.in);


        System.out.println( "Variáveis e tipos de dados primitivos");
        
        System.out.println("Diga seu nome:");
        String nome = ler.nextLine(); //string : sequencia de caracteres, comoo letras, números ou símbolos, que é utilizado para representar palavras
        System.out.println("Diga seu sexo:");
        char sexo = ler.next().charAt(0); //char : representa um caractere, com letra, número ou símbolo
        System.out.println("Diga sua idade:");
        int idade = ler.nextInt(); //int : representa um número inteiro, sem casas decimais
        System.out.println("Diga sua altura:");
        double altura = ler.nextDouble(); //double : representa um número decimal, com casas decimais
        System.out.println("Diga se está empregado:");
        boolean empregado = ler.nextBoolean(); //boolean : representa um valor lógico, verdadeiro ou falso
        System.out.println(String.format("nome: %s", nome));
        System.out.println(String.format("sexo: %c", sexo));
        System.out.println(String.format("idade: %d", idade));
        System.out.println(String.format("altura: %.2f", altura));
        System.out.println(String.format("empregado: %b", empregado));

    }
}
