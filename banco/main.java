package banco;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        System.out.println("--- Sistema de Gestión Bancaria ---");

        // 1. Crear una instancia de CuentaBancaria
        CuentaBancaria miCuenta = new CuentaBancaria("1234567890", "Ana Gómez", 1500000);
        miCuenta.mostrarDatos();

        Scanner sc = new Scanner(System.in);
        String opcion = "";

        do {
            // Muestra el menú
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción (1, 2, o 3): ");

            // Usamos nextLine() para leer la línea completa y evitar problemas de buffer
            opcion = sc.nextLine().trim();

            try {
                switch (opcion) {
                    case "1":
                        System.out.print("Ingrese el monto a depositar: ");
                        // Lee la línea y la convierte a Double
                        double montoDeposito = Double.parseDouble(sc.nextLine());
                        miCuenta.depositar(montoDeposito);
                        break;

                    case "2":
                        System.out.print("Ingrese el monto a retirar: ");
                        // Lee la línea y la convierte a Double
                        double montoRetiro = Double.parseDouble(sc.nextLine());
                        miCuenta.retirar(montoRetiro);
                        break;

                    case "3":
                        System.out.println("👋 ¡Gracias por usar el servicio! ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("❌ Opción no válida. Por favor, ingrese 1, 2 o 3.");
                        break;
                }
            } catch (NumberFormatException e) {
                // Captura si el usuario ingresa texto en lugar de un número para el monto
                System.out.println("❌ Error: Ingrese un valor numérico válido para el monto.");
            }

            // Muestra el saldo después de cada operación (excepto al salir)
            if (!opcion.equals("3")) {
                miCuenta.mostrarDatos();
            }

        } while (!opcion.equals("3"));

        sc.close(); // Buena práctica: cerrar el Scanner al terminar
    }
}