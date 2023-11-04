import java.util.Scanner;
public class ejercicio2
{    
//entrada   
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//inicio y proceso 
    System.out.print("ingrese el primer numero: ");
    int numero1 = scanner.nextInt();
    System.out.print("ingrese el segundo numero: ");
    int numero2 = scanner.nextInt();
    int suma = numero1 + numero2;
//salida
    System.out.print("la suma es: " + suma);
    }
    
}
