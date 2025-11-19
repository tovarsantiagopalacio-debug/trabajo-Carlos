public class main {
    public static void main(String[] args) {
        // 1. Crear una instancia de CuentaBancaria
        System.out.println("--- Creación de Cuenta ---");
        CuentaBancaria miCuenta = new CuentaBancaria("1234567890", "Ana Gómez", 1500.50);
        miCuenta.mostrarDatos();

        // 2. Probar el método depositar
        System.out.println("\n--- Prueba de Depósito ---");
        miCuenta.depositar(250.00);

        // 3. Probar el método retirar (con fondos suficientes)
        System.out.println("\n--- Prueba de Retiro Exitoso ---");
        miCuenta.retirar(100.00);

        // 4. Probar el método retirar (sin fondos suficientes)
        System.out.println("\n--- Prueba de Retiro Fallido ---");
        miCuenta.retirar(2000.00);

        // 5. Mostrar datos actualizados
        miCuenta.mostrarDatos();
        
        // Uso de Getter
        System.out.println("Titular actual (usando getTitular): " + miCuenta.getTitular());
        
        // Uso de Setter
        miCuenta.setTitular("Ana María Gómez Pérez");
        System.out.println("Titular modificado (usando setTitular): " + miCuenta.getTitular());
        
        // El saldo final es visible a través del Getter
        System.out.println("Saldo final (usando getSaldo): " + miCuenta.getSaldo());

        // Mostrar datos finales
        miCuenta.mostrarDatos();
    }
}
