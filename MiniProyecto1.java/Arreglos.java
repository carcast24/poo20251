import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args){
        int[] motosPequeñas = new int[20]; // arreglo de 20 puestos para motos menores a 400cc
        int[] motosGrandes = new int[10]; // arreglo de 10 puestos para motos mayores a 400cc

        System.out.println(Arrays.toString(motosGrandes));
        System.out.println(Arrays.toString(motosPequeñas)); // para ver su contenido actua, por defecto esta en ceros
        
    }
    
}
