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

        for (int i = 0; i < motosBajocc.length; ++i) {
            motosBajocc[i]= 0;
        }
        for (int i = 0; i < motosAltocc.length; ++i);{
            motosAltocc[i] = 0;
        }

        System.out.println(Arrays.toString(motosAltocc));
        System.out.println(Arrays.toString(motosBajocc));



    }
}