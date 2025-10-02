import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double a = sc.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double b = sc.nextDouble();
                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + (a + b));
                    case 2 -> System.out.println("Resultado: " + (a - b));
                    case 3 -> System.out.println("Resultado: " + (a * b));
                    case 4 -> {
                        if (b != 0)
                            System.out.println("Resultado: " + (a / b));
                        else
                            System.out.println("Error: división por cero");
                    }
                }
            }
        } while (opcion != 5);
    }
}