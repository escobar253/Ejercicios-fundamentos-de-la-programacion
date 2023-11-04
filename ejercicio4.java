import java.util.Scanner;
public class ejercicio4 
{
//entrada
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//proceso
    System.out.print("ingrese la cantidad de euros: ");
    double euros = scanner.nextDouble();
//tasa de euro a dolar hoy 4/11/2023    
    double tasacambio = 1.07;
    double dolares = euros*tasacambio;
//salida
    System.out.println (euros + "euros equivalen a " + dolares + "dolares");
    }

}
