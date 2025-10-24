package caso3;
class CuentaBancaria {
    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    // Métodos get y set
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    // Métodos para operaciones
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso: S/" + cantidad);
        } else {
            System.out.println("Cantidad inválida para depositar.");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente. Operación cancelada.");
        } else if (cantidad <= 0) {
            System.out.println("Cantidad inválida para retirar.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso: S/" + cantidad);
        }
    }
}
