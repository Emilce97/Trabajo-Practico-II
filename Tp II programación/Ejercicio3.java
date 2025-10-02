import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        if (edad < 13) {
            System.out.println("Es un niño.");
        } else if (edad < 18) {
            System.out.println("Es un adolescente.");
        } else if (edad < 60) {
            System.out.println("Es un adulto.");
        } else {
            System.out.println("Es un adulto mayor.");
        }
    }
}