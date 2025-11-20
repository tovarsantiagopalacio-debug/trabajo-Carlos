package banco;
/**
 * Clase que representa una Cuenta Bancaria.
 */
public class CuentaBancaria {
    // Atributos privados (Encapsulamiento)
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // --- Métodos Get ---

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // --- Métodos Set ---

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // --- Métodos de Operación ---

    /**
     * Deposita un monto en la cuenta.
     */
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito de " + monto + " realizado. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }

    /**
     * Retira un monto de la cuenta, solo si hay fondos suficientes.
     */
    public boolean retirar(double monto) {
        if (monto > 0) {
            if (this.saldo >= monto) {
                this.saldo -= monto;
                System.out.println("Retiro de " + monto + " realizado. Nuevo saldo: " + this.saldo);
                return true;
            } else {
                System.out.println("Error: Saldo insuficiente. Saldo actual: " + this.saldo);
                return false;
            }
        } else {
            System.out.println("Error: El monto a retirar debe ser positivo.");
            return false;
        }
    }

    /**
     * Muestra toda la información de la cuenta.
     */
    public void mostrarDatos() {
        System.out.println("\n--- Información de la Cuenta Bancaria ---");
        System.out.println("Número de Cuenta: " + this.numeroCuenta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("----------------------------------------");
    }
}