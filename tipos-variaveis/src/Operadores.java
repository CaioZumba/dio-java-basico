public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        
        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println( numero --);

        System.out.println(numero); 

        boolean variavel = true;
        
        variavel = !variavel; 
        
        System.out.println(variavel);


        int a, b;

        a = 5;
        b = 7;

        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);
        }
}
