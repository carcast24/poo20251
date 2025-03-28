
public class Cliente {
    private long cedula;
    private String nombre;

    private Cliente(long cedula, String nombre){
        this.cedula = 0;
        this.nombre = nombre;
    }

    public String toString(){
        return "Cliente { Nombre: " + nombre + 
                          "Cedula: " + cedula + "}";
    }


}
