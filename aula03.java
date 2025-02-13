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
        System.out.println(num1 % num2 );



        // operadores de atribuição : = , += , -= , *= , /= , %=
        System.out.println("diga um número: ");    
        int x = sc.nextInt();
        System.out.println("quando o operador é = :");
        System.out.println(x);        

        x += 8; // x = x + 8
        System.out.println("quando o operador é += : ");
        System.out.println(x ); 
        
        x -= 5; // x = x - 5
        System.out.println("quando o operador é -= :");
        System.out.println(x); 
        
        x *= 2; // x = x * 2
        System.out.println("quando o operador é *= :");
        System.out.println(x); 

        x /= 2; // x = x / 2
        System.out.println("quando o operador é /= :");
        System.out.println(x); 
        x %= 3; // x = x % 3
        System.out.println("quando o operador é %= :");
        System.out.println(x); 
        // operadores de comparação : == , != , > , < , >= , <=
        System.out.println("digite um número: ");
        int y = sc.nextInt();
        System.out.println("quando o operador é == :");
        System.out.println(y == 5); // true ou false
        System.out.println("quando o operador é != :");
        System.out.println(y != 5); // true ou false
        System.out.println("quando o operador é > :");
        System.out.println(y > 5); // true ou false
        System.out.println("quando o operador é < :");
        System.out.println(y < 5); // true ou false
        System.out.println("quando o operador é >= :");
        System.out.println(y >= 5); // true ou false
        System.out.println("quando o operador é <= :");
        System.out.println(y <= 5); // true ou false
        // operadores lógicos : && , || , !, ^
        System.out.println("digite um número: ");
        int z = sc.nextInt();
        System.out.println("quando o operador é && :");
        System.out.println(z > 5 && z < 10); // true ou false
        System.out.println("quando o operador é || :");
        System.out.println(z > 5 || z < 10); // true ou false
        System.out.println("quando o operador é ! :");
        System.out.println(! (z > 5 && z < 10)); // true ou false
        System.out.println("quando o operador é ^ :");
        System.out.println(z > 5 ^ z < 10); // true ou false


    }
}
