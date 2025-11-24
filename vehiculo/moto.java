package vehiculo;

public class moto extends vehiculo {
    private int cilindraje;

    public moto(String marca, String modelo, int cilindraje) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("la motocicleta "+getMarca() + "  modelo " + getModelo() + " te va a romper el espejo");
        System.out.println("La motocicleta "+getMarca()+" de modelo "+getModelo()+" hace caballito");
    }
    public void hacerCaballito() {
        System.out.println("El moto esta haciendo caballito");

    }
    public void partirEspejos() {
        System.out.println("la motocicleta "+getMarca() + " modelo " + getModelo() + " te va a romper el espejo");
    }
}
 