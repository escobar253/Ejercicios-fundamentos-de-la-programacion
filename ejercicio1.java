import java.util.Scanner;
public class ejercicio1 
{
//entrada   
    static Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        //inicio y proceso
            System.out.println("ingrese la base del triangulo: ");
            double base = scanner.nextDouble();
            System.out.println("ingrese la altura del triangulo: ");
            double altura = scanner.nextDouble();
            double area = (base*altura) /2;
        //salida
            System.out.println("el area del triangulo es: " + area);
            }
        
}
