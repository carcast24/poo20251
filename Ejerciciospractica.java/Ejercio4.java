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

        

    }
}