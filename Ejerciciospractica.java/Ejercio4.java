import java.util.Arrays;
import java.util.Random;

public class Ejercio4 {
    public static void main(String[] args) {
        /*
         * Analisis: hacer dos arreglos con edades de dos grupos de personas, luego
         * encontrar el mayor
         */
        int[] edad1 = new int[5]; // declaro areglos con sus dimenciones
        // lleno el primer arreglo manual
        edad1 [0] = 20;
        edad1 [1] = 50;
        edad1 [2] = 17;
        edad1 [3] = 13;
        edad1 [4] = 10;

        int[] edad2 = new int[5];
        Random random = new Random(); // objeto random para llamar sus metodos

        for(int i = 0 ; i < edad2.length; ++i ){
            edad2[i] = random.nextInt(71) + 10;
        }

        System.out.println(Arrays.toString(edad1)); // imprimo arreglos para ver sus cambios
        System.out.println(Arrays.toString(edad2));

        // Encontrar el mayor en el primer arreglo
        int mayorEdad1 = edad1[0];
        for (int i = 1; i < edad1.length; ++i) {
            if (edad1[i] > mayorEdad1) {
                mayorEdad1 = edad1[i];
            }
        }

        // Encontrar el mayor en el segundo arreglo
        int mayorEdad2 = edad2[0];
        for (int i = 1; i < edad2.length; ++i) {
            if (edad2[i] > mayorEdad2) {
                mayorEdad2 = edad2[i];
            }
        }

        // Encontrar el mayor entre los dos arreglos
        int mayor = (mayorEdad1 > mayorEdad2) ? mayorEdad1 : mayorEdad2;

        // Imprimir el número mayor
        System.out.println("Mayor en Array 1: " + mayorEdad1);
        System.out.println("Mayor en Array 2: " + mayorEdad2);
        System.out.println("la edad mayor entre los dos grupos es: " + mayor);

        

    }
}