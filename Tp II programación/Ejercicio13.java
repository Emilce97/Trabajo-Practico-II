public class Ejercicio13 {
    public static void imprimirRecursivo(int[] arr, int i) {
        if (i < arr.length) {
            System.out.print(arr[i] + " ");
            imprimirRecursivo(arr, i + 1);
        }
    }
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.print("Elementos del array: ");
        imprimirRecursivo(numeros, 0);
    }
}