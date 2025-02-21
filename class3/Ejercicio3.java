public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * dado un arreglo lineal de numeros, sumar separadamente
         * los numeros pares y los numeros impares
         * analisi: declarar un arreglo
         * en dos variables ir guardando la suma de los numeros pares e impares
         * iterar en for, con la condicion de validar si el escalar es panr o impar
         * n%2==0 --> par
         * 
         * imprimir el resultado
         *
         */
        int[] b = { 5, 10, 8, 6, 7, 20, 30 };
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                sumaPares += b[i];
            } else {
                sumaImpares += b[i];
            }

        }
        System.out.println("la suma de los pares es: " + sumaPares);
        System.out.println("la suma de los impares es: " + sumaImpares);

    }
}
