import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // 1. Crear una instancia de CuentaBancaria
        System.out.println("--- Creación de Cuenta ---");
        CuentaBancaria miCuenta = new CuentaBancaria("1234567890", "Ana Gómez", 1500000);
        miCuenta.mostrarDatos();

        Scanner sc = new Scanner(System.in);
       String opcion = ""; // Declaramos afuera para usarla abajo

do {
    System.out.println("¿Quiere depositar, retirar o salir?");
    opcion = sc.next(); // Usamos next() para leer una palabra

    switch (opcion) {
        case "depositar":
            System.out.println("Ingrese el monto a depositar: ");
            double monto = sc.nextDouble();
            miCuenta.depositar(monto);
            break;
        case "retirar":
            System.out.println("Ingrese el monto a retirar: ");
            monto = sc.nextDouble();
            miCuenta.retirar(monto);
            break;
        case "salir":
            System.out.println("¡Hasta luego!");
            break;
        default:
            System.out.println("Opción no válida");
    }
    miCuenta.mostrarDatos();

} while (!opcion.equals("salir"));
    }
}

    

