public class coercion {
  public static void main(String[] args) {
  int a = 10;
  String b = "10";
  boolean c = true;
  double d = a / 2;

  System.out.println(a + b);
  System.out.println(d);
  // System.out.println(a - b); // a coercion de inteiros para strings não funciona na subtração
  // System.out.println(a - c); // a coercion de booleanos para inteiros não funciona
  System.out.println(b + c); // a coercion de booleanos para strings funciona porque o booleano é convertido para "true" ou "false" e faz uma concatenação
  
  }
}
