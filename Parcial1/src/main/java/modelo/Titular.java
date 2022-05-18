package modelo;

public class Titular {

    private String cc;
    private String nombre;
    private String apellido;
    private char sexo;

    public Titular() {
    }

    public Titular(String cc, String nombre, String apellido, char sexo) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public String getcc() {
        return cc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setcc(String cc) {
        this.cc = cc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "\n Numero cc:  " + this.getcc() + "\n Nombre: " + this.getNombre() + "\n Apellido: " + this.getApellido() + "\n Sexo: " + this.getSexo();

    }

}
