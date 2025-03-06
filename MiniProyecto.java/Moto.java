public class Moto {
    private String placa;
    private int cilindrada;
    private short horaIngreso; // uso shor ya que el intervalo que usa es el justo y ademas solo usa 2bytes de almacenamiento

    public Moto(String placa, int cilindrada, short horaIngreso){
        this.placa = placa;
        this.cilindrada = cilindrada;
        this.horaIngreso = horaIngreso;

    }

    public String getplaca(){
        return placa;
    }
    public int getcilindrada (){
        return cilindrada;

    }
    public short gethoraIngreso(){
        return horaIngreso;

    }
}

