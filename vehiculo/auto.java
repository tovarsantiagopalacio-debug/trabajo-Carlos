package vehiculo;

public class auto extends vehiculo {
    private int puertas;

    public auto(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puertas: " + puertas);
    }
    public void tocarBocina() {
        System.out.println("Bocina tocada");
    }
}