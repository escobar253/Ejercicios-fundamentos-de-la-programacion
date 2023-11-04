import java.util.Scanner;
public class ejercicio7 
{
//entrada   
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//proceso        
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        
        double longitud = 2 * Math.PI * radio;
        double areaInscrita = Math.PI * Math.pow(radio, 2);
//salida        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo inscrito es: " + areaInscrita);
        }

}
