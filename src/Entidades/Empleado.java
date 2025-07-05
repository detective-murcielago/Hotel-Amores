package Entidades;

public class Empleado extends Persona {

    private int id;
    private String rol;

    public Empleado(int idEmpleado, String rol, String nombre, String apellido, int dni, int telefono) {
        super(nombre, apellido, dni, telefono);
        this.id = idEmpleado;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{"
                + "id=" + id
                + ", rol='" + rol + '\''
                + ", nombre='" + getNombre() + " " + getApellido() + '\''
                + ", dni=" + getDni()
                + ", telefono=" + getTelefono()
                + '}';
    }

}
