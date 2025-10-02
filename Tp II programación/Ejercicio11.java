public class Ejercicio11 {
    public static void main(String[] args) {
        double[] precios = {120.5, 89.9, 45.0, 200.0, 150.75};
        double suma = 0;
        double mayor = precios[0];
        double menor = precios[0];
        for (double p : precios) {
            suma += p;
            if (p > mayor) mayor = p;
            if (p < menor) menor = p;
        }
        System.out.println("Promedio: " + (suma / precios.length));
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}