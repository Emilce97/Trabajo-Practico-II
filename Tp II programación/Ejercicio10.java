import java.util.Scanner;
public class Ejercicio10 {
    public static double calcularEnvio(double peso) {
        if (peso <= 5) return 1000;
        else if (peso <= 10) return 2000;
        else return 3000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = sc.nextDouble();
        System.out.println("Costo de envío: $" + calcularEnvio(peso));
    }
}