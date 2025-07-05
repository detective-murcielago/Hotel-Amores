package Entidades;

import java.time.LocalDateTime;// Para manejar fecha de emisión del comprobante

public class ComprobantePago {

    private String codigo;
    private FichaHospedaje fichahospedaje;// Referencia a la ficha que genera el comprobante
    private double importeTotal;
    private LocalDateTime fechaEmision;// Fecha de emisión del comprobante
    // Constructor que inicializa todos los campos del comprobante

    public ComprobantePago(String codigo, FichaHospedaje fichahospedaje, double importeTotal, LocalDateTime fechaEmision) {
        this.codigo = codigo;
        this.fichahospedaje = fichahospedaje;
        this.importeTotal = importeTotal;
        this.fechaEmision = fechaEmision;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public FichaHospedaje getFichahospedaje() {
        return fichahospedaje;
    }

    public void setFichahospedaje(FichaHospedaje fichahospedaje) {
        this.fichahospedaje = fichahospedaje;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    // Representación del comprobante en forma de texto legible

    @Override
    public String toString() {
        // Usamos StringBuilder para construir cadenas de texto de forma eficiente.
       // A diferencia de concatenar Strings con el operador '+', que crea muchos objetos intermedios,
      // StringBuilder modifica una sola instancia, lo que mejora el rendimiento y reduce el consumo de memoria.
     // Es preferible a StringBuffer cuando no se necesita sincronización (ambiente de un solo hilo).
        StringBuilder sb = new StringBuilder();
        sb.append("========== COMPROBANTE DE PAGO ==========\n");
        sb.append("Código: ").append(codigo).append("\n");
        sb.append("Fecha de emisión: ").append(fechaEmision).append("\n");

        sb.append("-----------------------------------------\n");
        sb.append("Habitación Nº: ").append(fichahospedaje.getHabitacion().getNumero()).append("\n");

        int cantidadHuespedes = fichahospedaje.getHuespedes().size();
        sb.append("Cantidad de personas: ").append(cantidadHuespedes).append("\n");

        sb.append("Huésped(es):\n");
        for (Huesped h : fichahospedaje.getHuespedes()) {
            sb.append("- ").append(h.getNombre()).append(" ").append(h.getApellido()).append("\n");
        }

        sb.append("-----------------------------------------\n");
        sb.append(String.format("Importe Total: %.2f", importeTotal)).append("\n");
        sb.append("=========================================\n");

        return sb.toString();
    }

}
