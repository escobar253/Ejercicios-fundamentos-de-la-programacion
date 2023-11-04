import java.util.Scanner;
public class ejercicio8 
{
//entrada     
    static Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {
//proceso    
     System.out.print("ingresa el primer numero: ");   
     double numero1 = scanner.nextDouble();
     System.out.print("ingresa el segundo numero: ");
     double numero2 = scanner.nextDouble();
     System.out.print("ingresa el tercer numero: ");
     double numero3 = scanner.nextDouble();
     double promedio = (numero1 + numero2 + numero3) /3;
//salida    
     System.out.println("el promedio es: " + promedio);
     }   

}
