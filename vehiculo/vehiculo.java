package vehiculo;

public class vehiculo {
    private String marca;
    private String modelo;

    public vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public void arrancar() {
        System.out.println("El vehiculo esta arrancando");
    }

    public void detener() {
        System.out.println("El vehiculo esta detenido");
    }
}
