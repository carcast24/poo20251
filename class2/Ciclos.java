public class Ciclos {
    public static void main(String[] args){
        //  inicia en; termina; incremento o decremento
        //    ↓           ↓       ↓
        for(int i = 1;  i <= 5;  i++) {
            System.out.println("ciclo numero: " + i);
        }
        /* estructura del while
         * inicia en;
         * while(condicion){
         * ---------------
         * incremendo o decremento
         * }
         */
        int j = 1;
        while(j <= 5){
            System.out.println("ciclo j numero: " + j);
            j++;
        }
        // aplique while para hacer un decremento, (su proceso es exactamente igual )

        int g = 10; // inicia en 
        while(g >= 1)// termina en{
            System.out.println("decremento g en: " + g);
            g--;// incremento o decremento
        }



    }
}
