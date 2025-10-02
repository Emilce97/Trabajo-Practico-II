import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Serie de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }
}