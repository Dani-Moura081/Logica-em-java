import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class aula06 {
    // difença entre array e arraylist 
    //a principal diferença é que o array é imutável e o arraylist é mutável, ou seja, um tem um tamanho fixo e o outro tem um tamanho dinâmico.
    public static void main(String[] args) {
        // arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("digite 5 números para serem armazenados no array:");
        int[] numeros = new int[5];
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        numeros[3] = sc.nextInt();
        numeros[4] = sc.nextInt();
        System.out.println("Array: "+Arrays.toString(numeros)); // imprime o array
        // arraylist
        System.out.println("digite 5 números para serem armazenados no arraylist:");
        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(sc.nextInt());
        numeros2.add(sc.nextInt());
        numeros2.add(sc.nextInt());
        numeros2.add(sc.nextInt());
        numeros2.add(sc.nextInt());
        System.out.println("ArrayList: "+numeros2); // imprime o arraylist
        numeros2.remove(3);
        System.out.println("ArrayList após remover o elemento: "+numeros2); // imprime o
        // arraylist após remover o elemento
        System.out.println("Tamanho do arraylist: "+numeros2.size()); // imprime o tamanho do arraylist
        System.out.println("digite o número do elemento que deseja ver : ");
        int pos = sc.nextInt();
        System.out.println("Elemento na posição "+pos+" do arraylist: "+numeros2.get(pos)); // imprime o elemento na posição
    }
}
