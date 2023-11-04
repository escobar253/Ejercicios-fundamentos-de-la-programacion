import java.util.Scanner;
public class ejercicio5 
{    
//entrada   
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//proceso    
    System.out.println("ingresa el lado de un cuadrado: ");
    double lado = scanner.nextDouble();
    double area = lado*lado;
    double perimetro = lado*4;
//salida    
    System.out.println("el area del cuadrado es: " + area); 
    System.out.println("el perimetro del cuadrado es: " + perimetro);
    }
   
}
