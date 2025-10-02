public class Ejercicio12 {
    public static void main(String[] args) {
        String[] productos = {"Leche", "Pan", "Queso", "Huevos"};
        int[] stock = {10, 5, 0, 20};
        for (int i = 0; i < productos.length; i++) {
            System.out.print(productos[i] + " - Stock: " + stock[i]);
            if (stock[i] == 0) {
                System.out.println(" (Agotado)");
            } else {
                System.out.println();
            }
        }
    }
}