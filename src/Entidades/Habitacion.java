package Entidades;

public class Habitacion {

    private String numero;
    private char tipo;// Simple=S, Doble=D y Matrimonial=M
    private double precioHora;
    private char estado;//Ocupado= O y Disponible=D
    private int CantidadHuesped = 4;

    public Habitacion(String numero, char tipo, char estado, double precioHora) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioHora = precioHora;
        this.estado = estado;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void marcaOcupado() {
        this.estado = 'O';
    }

    public void marcaDisponible() {
        this.estado = 'D';
    }

    @Override
    public String toString() {
        return "Habitacion{"
                + "numero=" + numero
                + ", tipo=" + tipo
                + ", precioHora=" + precioHora
                + ", estado=" + estado
                + ", cantidadMaximaHuespedes=" + CantidadHuesped
                + '}';
    }

}
