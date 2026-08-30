import java.util.Date;

public class Pago {
    private double monto;
    private Banco banco;

    public Pago(double monto, Banco banco) {
        if (monto <= 0) throw new IllegalArgumentException("Monto inválido.");
        if (banco == null) throw new IllegalArgumentException("Banco no puede ser nulo.");
        this.monto = monto;
        this.banco = banco;
    }

    public boolean realizarPago() {
        return banco.procesarPago(monto);
    }
}