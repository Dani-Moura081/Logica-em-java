import java.util.Scanner;

public class aula05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número e descubra a tabuada dele");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i) +"\n" );
        }
        // for: Executa o loop enquanto a condição for verdadeira, porém você pode instanciar as variaveis contadoras dentro da estrutura do loop. 

        System.out.println("Diga quantos números você quer somar: ");
        int qtd = sc.nextInt();
        int i = 1;
        int numPositivos = 0;
        int numNegativos = 0;
        do {
            System.out.println("Digite um número: ");
            int numDigitado = sc.nextInt();
            if (numDigitado > 0){
                numPositivos += numDigitado;
            }
            else if (numDigitado < 0){
                numNegativos += numDigitado;
            }
            else if (numDigitado == 0){
                System.out.println("zero não soma");
            }
            else {
                System.out.println("não é um número");
            }
            i++;
        } while (i <= qtd); // do while : Executa o loop primeiro e depois verifica a condição.
        System.out.println("resultado dos positivos: " + numPositivos);
        System.out.println("resultado dos negativos: " + numNegativos +"\n");

        System.out.println("Digite a quantidade de patinhos: ");
        int patinhos = sc.nextInt();
        while (patinhos > 1) {
            System.out.println(patinhos +" patinhos foram passear, além das montanhas para brincar. \n A mamãe gritou quá, quá, quá, qúa \n mas só " + patinhos-- +" patinhos voltaram de lá \n");
        }
        System.out.println("1 patinho foi passear, além das montanhas para brincar. \n A mamãe gritou quá, quá, quá, qúa \n mas todos os patinhos voltaram de lá");
        // while: Executa o loop enquanto a condição for verdadeira.
    }
}
