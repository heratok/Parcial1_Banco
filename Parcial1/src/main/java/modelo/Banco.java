package modelo;

import java.util.Scanner;

public class Banco {

    private String nombre;
    private final int noMaxSedes = 10;
    private Sedes[] sedes;
    Scanner leer = new Scanner(System.in);

    public Banco() {
        this.sedes = new Sedes[noMaxSedes];
    }

    public Banco(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sedes[] getSedes() {
        return sedes;
    }

    public void setSedes(Sedes[] sedes) {
        this.sedes = sedes;
    }

    public void crearSedes() {  //este metodo sirve para crear sedes
        String nom, dire, ciud;
        int codi, numsede;

        System.out.println("-Cuantas sedes desea crear: ");
        numsede = leer.nextInt();
        if (numsede > 3) {
            System.out.println("No puede crear esa cantidad de sedes");

        } else {

            for (int i = 0; i < numsede; i++) {
                System.out.println("-Ingrese el nombre de la sede: ");
                nom = leer.next();
                System.out.println("-Ingrese la dirección de la sede: ");
                dire = leer.next();
                System.out.println("-Ingrese la Ciudad donde estará ubicada la sede: ");
                ciud = leer.next();
                System.out.println("-Ingrese el código de la sede: ");
                codi = leer.nextInt();

                sedes[i] = new Sedes(nom, dire, ciud, codi);

            }
        }
    }

    public void consultarSedes() {   //este metodo sirve para consultar las sedes
        int codigo2;
        System.out.println("-Ingrese el código de la sede a consultar: ");
        codigo2 = leer.nextInt();

        for (Sedes sede : sedes) {
            if (sede.getCodigo() == codigo2) {
                System.out.println("La Busqueda ha sido exitosa");
                System.out.println(sede);
            } else {
                System.out.println("Este codigo de sede no se encuentra registrado");
            }
        }

    }

    public void VerlistaSedes() {  //este metodo sirve para ver las lista de las sedes
        System.out.println("Lista de sedes");
        for (int i = 0; i < sedes.length; i++) {

            System.out.println(sedes[i]);
        }

    }

    @Override
    public String toString() {
        return "\n Nombre:  " + this.getNombre();

    }

}
