package vista;

import modelo.*;
import java.util.Scanner;

public class PruebaBanco {

    static Scanner leer = new Scanner(System.in);

    public static void crearBanco() {
        String nomBanco;
        System.out.println("-Ingrese el nombre del banco: ");
        nomBanco = leer.next();
        Banco banco1 = new Banco(nomBanco);
    }

    public static void main(String[] args) {
        int op = 0;

        Banco banco2 = new Banco();
        Sedes sede2 = new Sedes();

        do {
            System.out.println("**** Bienvenido ingrese que desea hacer ******");
            System.out.println("1. Crear un Banco");
            System.out.println("2. Crear una sede");
            System.out.println("3. Crear una cuenta bancaria");
            System.out.println("4. Consultar una sedes");
            System.out.println("5. Lista de sedes");
            System.out.println("6. Consulta cuenta Bancaria");
            System.out.println("7. Salir");
            System.out.println("Seleccione una Opción:");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    crearBanco();
                    break;
                case 2:
                    banco2.crearSedes();
                    break;
                case 3:
                    sede2.crearCuenta();
                    break;
                case 4:
                    banco2.consultarSedes();
                    break;
                case 5:
                    banco2.VerlistaSedes();
                    break;
                case 6:
                    sede2.consultarCuenta();
                    break;

                default:
                    System.out.println("ERROR:Solo se permite un numero entre 1 y 7");

            }
        } while (op != 7);

    }

}
