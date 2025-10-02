import java.util.Scanner;
public class Ejercicio9 {
    public static double aplicarDescuento(double precio, double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el descuento (%): ");
        double descuento = sc.nextDouble();
        System.out.println("Precio final: " + aplicarDescuento(precio, descuento));
    }
}