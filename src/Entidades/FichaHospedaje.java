package Entidades;

import java.time.Duration;// Se importa para calcular la duración entre dos fechas
import java.time.LocalDateTime;// Se importa para manejar fechas y horas
import java.util.List;// Para manejar listas de objetos

public class FichaHospedaje {

    private String idFicha;// Identificador único de la ficha
    private List<Huesped> huespedes;// Lista de huéspedes asociados a la ficha
    private Habitacion habitacion;// Habitación asignada al hospedaje
    private int horas;
    private LocalDateTime fechaIngreso;
    private LocalDateTime fechaSalida;// Fecha y hora de salida (puede ser null si aún no salió)
    private char estado; // 'A' = Activo, 'F' = Finalizado
    private int cantidadPersonas;// Número total de personas en la habitación

    // Constructor para crear una ficha con los datos necesarios
    public FichaHospedaje(String idFicha, List<Huesped> huespedes, Habitacion habitacion, int horas, LocalDateTime fechaIngreso, int cantidadPersona) {
        this.idFicha = idFicha;
        this.huespedes = huespedes;
        this.habitacion = habitacion;
        this.horas = horas;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = null; // Inicialmente no hay salida registrada
        this.estado = 'A';
        this.cantidadPersonas = cantidadPersona;
    }
    // Método para calcular el costo total del hospedaje

    public double calcularImporteTotal() {
        if (fechaIngreso == null || fechaSalida == null || habitacion == null) {
            return 0;// Si falta información, no se puede calcular
        }

        // Se calcula la diferencia entre ingreso y salida en minutos
        long minutos = Duration.between(fechaIngreso, fechaSalida).toMinutes();

        //  cobrar al menos 1 minuto
        if (minutos < 1) {
            minutos = 1;
        }

        // Calcular precio por minuto según el precio por hora de la habitación
        double precioPorHora = habitacion.getPrecioHora();
        double precioPorMinuto = precioPorHora / 60.0;

        // Retornar el importe total basado en minutos reales
        return minutos * precioPorMinuto;
    }

    // Devuelve la fecha estimada de salida según las horas contratadas
    public LocalDateTime getFechaSalidaEstimada() {
        return fechaIngreso.plusHours(horas);
    }

    // Getters y setters
    public String getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(String idFicha) {
        this.idFicha = idFicha;
    }

    public List<Huesped> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(List<Huesped> huespedes) {
        this.huespedes = huespedes;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    // Dentro de la clase FichaHospedaje

    public void registrarSalida() {
        this.fechaSalida = LocalDateTime.now();
        this.estado = 'F'; // Marca la ficha como finalizada
    }

    @Override
    public String toString() {
        return "FichaHospedaje{"
                + "idFicha='" + idFicha + '\''
                + ", habitacionNumero=" + (habitacion != null ? habitacion.getNumero() : "Sin asignar")
                + ", cantidadHuespedes=" + (huespedes != null ? huespedes.size() : 0)
                + ", horas=" + horas
                + ", fechaIngreso=" + fechaIngreso
                + ", fechaSalida=" + (fechaSalida != null ? fechaSalida : "No registrada")
                + ", estado=" + estado
                + ", cantidadPersonas=" + cantidadPersonas
                + '}';
    }

}
