import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double nota;
        do {
            System.out.print("Ingrese una calificación (-1 para terminar): ");
            nota = sc.nextDouble();
            if (nota != -1) {
                suma += nota;
                contador++;
            }
        } while (nota != -1);
        if (contador > 0) {
            System.out.println("Promedio: " + (suma / contador));
        } else {
            System.out.println("No se ingresaron calificaciones.");
        }
    }
}