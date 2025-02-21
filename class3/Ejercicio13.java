public class Ejercicio13 {
    public static void main(String[] args) {
        /*
         * un arreglo de n elementos, almacenar los elementos 
         * mayores y menores que la media, almacenarlos en arreglos diferentes 
         * 
         * analisis: crear arreglo aleatorio y generar numeros aleatoreos
         * para que sean almacenados en el arreglo, posterior hallar la media y comparar 
         * cada posicion del arreglo para determinar 
         * si es mayor o menor a la media.
         */
        // n sera el numero aleatorio para el tamaño del arreglo
        int n = (int) (Math.random() * (15 -5)) + 5;
        int [] a = new int[n];
        
        //llenar arreglo con numero aleatorios  entre 0 y 50
        for(int i =0; i < a.length; i++){
            a[i] = (int) (Math.random() * (50 - 0)) + 0;
        }
        //carcular media arreglo a
        int sumaArreglo = 0; 
        for(int i =0; i < a.length; i++){
            sumaArreglo += a[i];
        }
        double media = sumaArreglo / a.length;
        System.out.println("media del arreglo..." + media);
            // definir la cantidad de elementos que tenga por ensima o por debajo de la media
          int contadorMayormedia=0, contadorMenormedia=0;
            for(int i =0; i < a.length; i++){
                if(a[i] >= media){
                    contadorMayormedia++;
                }else{
                    contadorMenormedia++;
                }
            }
            //creacion de los arreglos que almacenaran los mayores y menores a la media 

            int[] mayores = new int[contadorMayormedia];
            int[] menores = new int[contadorMenormedia];
            
            int posMayores=0, posMenores=0;
            for(int i =0; i < a.length; i++){
                if(a[i] >= media){
                    mayores[posMayores] = a [i];
                    posMayores++;
                }else{
                    menores[posMenores] = a[i];
                    posMenores++;
                }
            }
            //mostrar los arreglos de los mayores 
            for(int i =0; i < mayores.length; i++){
                System.out.println(mayores[i] + " ");
            }
            for(int i =0; i < menores.length; i++){
                System.out.println(menores[i] + " ");
            }
            

    }
}
