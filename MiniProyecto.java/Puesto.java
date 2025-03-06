public class Puesto {
    private int numero;
    private boolean ocupado;
    private Moto moto;

    public Puesto(int numero){
        this.numero = numero;
        this.ocupado = false; // se inicia el boolean en falso porque inicialmente el puesto esta vacio
        this.moto = null; // mismo caso que con el boolean, inicialmente esta vacio
    }

    

}
