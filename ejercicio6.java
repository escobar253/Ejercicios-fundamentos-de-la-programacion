import java.util.Scanner;
public class ejercicio6 
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();
        
        double areaTotal = 2 * Math.PI * radio * (radio + altura);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        
        System.out.println("El área del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);
        }

}
