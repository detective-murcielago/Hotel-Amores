package Entidades;

public class Huesped extends Persona {

    private FichaHospedaje fichahospedaje;

    // Constructor sin ficha (al registrar huésped inicialmente)
    public Huesped(String nombre, String apellido, int dni, int telefono) {
        super(nombre, apellido, dni, telefono);
        this.fichahospedaje = null;
    }

    public FichaHospedaje getFichahospedaje() {
        return fichahospedaje;
    }

    public void setFichahospedaje(FichaHospedaje fichahospedaje) {
        this.fichahospedaje = fichahospedaje;
    }

    // Método para asignar la ficha posteriormente (opcional)
    public void asignarFichaHospedaje(FichaHospedaje ficha) {
        this.fichahospedaje = ficha;
    }

    // Mostrar hospedaje si existe
    public void registrarHospedaje() {
        if (fichahospedaje != null) {
            System.out.println(fichahospedaje.toString());
        } else {
            System.out.println("No se ha registrado el hospedaje.");
        }
    }

    @Override
    public String toString() {
        return "Huesped{"
                + "nombre=" + getNombre()
                + ", apellido=" + getApellido()
                + ", dni=" + getDni()
                + ", telefono=" + getTelefono()
                + ", fichahospedaje_id=" + (fichahospedaje != null ? fichahospedaje.getIdFicha() : "Ninguno")
                + '}';
    }

}
