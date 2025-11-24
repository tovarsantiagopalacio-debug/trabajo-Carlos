package vehiculo;

public class funcionesAuto {
    public static void main(String[] args) {
        auto auto = new auto("Toyota", "Corolla", 4);
        auto.mostrarInformacion();
        auto.arrancar();
        auto.detener();
        auto.tocarBocina();

        moto moto = new moto("Yamaha", "YZF-R1", 1000);
        moto.mostrarInformacion();
        moto.arrancar();
        moto.detener();
        moto.hacerCaballito();
        moto.partirEspejos();
    }

}
