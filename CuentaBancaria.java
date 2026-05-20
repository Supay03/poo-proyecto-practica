package tarjeta;
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Su saldo restante es: " + saldo);
        } else {
            System.out.println("No se puede retirar ese monto: " + monto + " Su saldo actual es: " + saldo);
        }
    }
}

