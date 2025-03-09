import java.util.Arrays;
import java.util.Scanner;

public class Tarifador{
    public static void  main (String[] args){
        //invoco la clase scanner, me permite que el usuario ingrese datos al programa
        Scanner sc = new Scanner(System.in);

        // creamos e inicializamos los Arrays como lo solicitado.
        // 0 = puesto libre y 1 = puesto ocupado

        int[] motosBajocc = new int[20]; // motos < 400cc
        int[] motosAltocc = new int[10]; // motos >400cc

        // inicializamos en 0

       /* for (int i = 0; i < motosBajocc.length; ++i) {
            motosBajocc[i]= 0;
        }
        for (int i = 0; i < motosAltocc.length; ++i);{
            motosAltocc[i] = 0;
        }*/
        /**
         * quito las lineas de la 17 a la 22 ya que es reduntante inicializar en cero
         * un arreglo, ya que automaticamente se inicializa en scalar neutro
         *
         */
        // visualizamos el array
        System.out.println(Arrays.toString(motosAltocc));
        System.out.println(Arrays.toString(motosBajocc));

        int opcion; // vaariable que me permite almacenar la respuesta del usuario
        // usamos bucle do while, me permite ejecutar una lista mientras una condicion no se cumpla.

        do {
            System.out.println("----------- Menu Principal ----------");
            System.out.println("1. Registrar Moto");
            System.out.println("2. Cobro de Tarifa");
            System.out.println("3. Mostrar Estado del Parqueadero");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opccion");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    registrarMoto:(sc,motosBajocc,motosAltocc);
                    break;
                case 2:
                    cobrarTarifa:(sc,motosBajocc,motosAltocc);
                    break;
                case 3:
                    mostrarParqueadero:(motosBajocc,motosAltocc);
                    break;
                case 4:
                    System.out.println("saliendo del programa...");
                    break;
                default: // opcion por defecto que advierte al usuario que ingreso un parametro no registrado
                    System.out.println("opcion invalida, por favor ingrese una opcion de la lista");

            }

        } while (opcion !=4); // cuando la opcion sea diferente a 4 el bucle se repite de lo contrario da por terminado la iteracion



    }
}