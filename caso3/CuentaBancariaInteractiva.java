package caso3;
import java.util.Scanner;

public class CuentaBancariaInteractiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del titular: ");
        String titular = sc.nextLine();

        System.out.print("Ingresa el saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        CuentaBancaria cuenta = new CuentaBancaria(titular, saldoInicial);

        System.out.print("Ingresa cantidad a depositar: ");
        cuenta.depositar(sc.nextDouble());

        System.out.print("Ingresa cantidad a retirar: ");
        cuenta.retirar(sc.nextDouble());

        System.out.println("\n--- Estado de la cuenta ---");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo final: " + cuenta.getSaldo());

        sc.close();
    } 
}
