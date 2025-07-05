package controlador;

/**
 * Clase Singleton que representa el sistema central del hotel.
 * Se asegura de que haya una sola instancia de esta clase en toda la aplicación.
 */
public class SistemaHotel {

    // Instancia única de la clase SistemaHotel (Singleton)
    private static SistemaHotel instancia;

    // Atributo que contiene el hotel que se está gestionando
    private Hotel hotel;

    /**
     * Constructor privado para evitar que se creen múltiples instancias de SistemaHotel.
     * Solo se llama una vez desde getInstancia().
     */
    private SistemaHotel() {
        hotel = new Hotel(); // Se crea la instancia del hotel
    }

    public static SistemaHotel getInstancia() {
        if (instancia == null) {
            instancia = new SistemaHotel(); // Se crea la instancia una sola vez
        }
        return instancia;
    }

    /**
     * Método para acceder al hotel gestionado por el sistema.
     *
     * @return el objeto Hotel
     */
    public Hotel getHotel() {
        return hotel;
    }
}

