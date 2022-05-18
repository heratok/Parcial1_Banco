package modelo;

public class Cuenta {

    private int noCuenta;
    private String tipCuenta; //tipo de cuenta
    private double saldo;
    private double saldoInicial;
    private Titular titularCuenta; //titular de la cuenta

    public Cuenta() {

    }

    public Cuenta(int noCuenta, String tipCuenta, double saldo, double saldoInicial, Titular titularCuenta) {
        this.noCuenta = noCuenta;
        this.tipCuenta = tipCuenta;
        this.saldo = saldo;
        this.saldoInicial = saldoInicial;
        this.titularCuenta = titularCuenta;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getTipCuenta() {
        return tipCuenta;
    }

    public void setTipCuenta(String tipCuenta) {
        this.tipCuenta = tipCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Titular getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(Titular titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    @Override
    public String toString() {
        return "\n \n -Numero de Cuenta:  " + this.getNoCuenta() + "\n -Tipo de Cuenta: " + this.getTipCuenta() + "\n -Saldo Inicial: " + this.getSaldoInicial() + "\n -Saldo: " + this.getSaldo() + "\n -Titular de la Cuenta: " + this.getTitularCuenta();

    }
}
