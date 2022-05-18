package modelo;

import java.util.Scanner;

public class Sedes {

    private String nombre;
    private String direccion;
    private String ciudad;
    private int codigo;
    private final int NomaxCuentas = 10; //numero maximo de cuentas
    private Cuenta[] cuentas;
    Scanner leer = new Scanner(System.in);

    public Sedes() {
        this.cuentas = new Cuenta[NomaxCuentas];
    }

    public Sedes(String nombre, String direccion, String ciudad, int codigo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public void crearCuenta() {
        int num, numCuenta;
        String tipoCuenta, cc, nom, ape;
        double saldoInicial, saldo;
        char sexo;
        System.out.println("-Cuantas cuentas desea abrir: ");
        num = leer.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println("-Introduzca el numero de cuenta: ");
            numCuenta = leer.nextInt();
            System.out.println("-Introduzca el tipo de cuenta: ");
            tipoCuenta = leer.next();
            System.out.println("-Introduzca el saldo inicial: ");
            saldoInicial = leer.nextDouble();
            System.out.println("-Introduzca el saldo: ");
            saldo = leer.nextDouble();
            System.out.println("-Introduzca el numero de identificación del titular: ");
            cc = leer.next();
            System.out.println("-Introduzca el nombre: ");
            nom = leer.next();
            System.out.println("-Introduzca el apellido: ");
            ape = leer.next();
            System.out.println("-Introduzca tipo de sexo: ");
            sexo = leer.next().charAt(0);
            Titular titular = new Titular(cc, nom, ape, sexo);
            cuentas[i] = new Cuenta(numCuenta, tipoCuenta, saldoInicial, saldo, titular);
            System.out.println("La Cuenta ha sido creada con exito");

        }
    }

    public void consultarCuenta() {
        int num;
        System.out.println("-Ingrese el numero de cuenta: ");
        num = leer.nextInt();

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNoCuenta() == num) {
                System.out.println("La Búsqueda ha sido exitosa");
                System.out.println(cuenta);
            } else {
                System.out.println("AVISO: Este numero de cuenta no se encuentra registrado");

            }
        }

    }

    @Override
    public String toString() {

        return "\n Nombre de la Sede:  " + this.getNombre() + "\n Dirección de la Sede: " + this.getDireccion() + "\n Ciudad: " + this.getCiudad() + "\n codigo: " + this.getCodigo();

    }

}
