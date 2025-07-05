package controlador;

import Entidades.*; // Importa todas las clases del paquete Entidades
import java.util.*; // Importa las utilidades estándar de Java (listas, etc.)
import java.time.LocalDate; // Importa la clase LocalDate para manejar fechas

public class Hotel {

    // Atributos del hotel
    private String nombre; // Nombre del hotel
    private String direccion; // Dirección del hotel
    private List<Huesped> ListaHuespedes; // Lista de huéspedes
    private List<Empleado> ListaEmpleados; // Lista de empleados
    private List<Habitacion> ListaHabitacion; // Lista de habitaciones
    private List<FichaHospedaje> ListaFHospedaje; // Lista de fichas de hospedaje

    // Constructor que inicializa el hotel con nombre, dirección y listas vacías
    public Hotel() {
        this.nombre = "Hotel Amores"; // Asigna nombre al hotel
        this.direccion = "av. El Golf 69"; // Asigna dirección al hotel
        this.ListaHuespedes = new ArrayList<>(); // Inicializa la lista de huéspedes
        this.ListaEmpleados = new ArrayList<>(); // Inicializa la lista de empleados
        this.ListaHabitacion = new ArrayList<>(); // Inicializa la lista de habitaciones
        this.ListaFHospedaje = new ArrayList<>(); // Inicializa la lista de fichas de hospedaje
    }

    // Métodos getter y setter para los atributos del hotel
    public String getNombre() {
        return nombre; // Retorna el nombre del hotel
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna un nuevo nombre al hotel
    }

    public String getDireccion() {
        return direccion; // Retorna la dirección del hotel
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion; // Asigna una nueva dirección al hotel
    }

    public List<Huesped> getListaHuespedes() {
        return ListaHuespedes; // Retorna la lista de huéspedes
    }

    public void setListaHuespedes(List<Huesped> ListaHuespedes) {
        this.ListaHuespedes = ListaHuespedes; // Asigna una nueva lista de huéspedes
    }

    public List<Empleado> getListaEmpleados() {
        return ListaEmpleados; // Retorna la lista de empleados
    }

    public void setListaEmpleados(List<Empleado> ListaEmpleados) {
        this.ListaEmpleados = ListaEmpleados; // Asigna una nueva lista de empleados
    }

    public List<Habitacion> getListaHabitacion() {
        return ListaHabitacion; // Retorna la lista de habitaciones
    }

    public void setListaHabitacion(List<Habitacion> ListaHabitacion) {
        this.ListaHabitacion = ListaHabitacion; // Asigna una nueva lista de habitaciones
    }

    public List<FichaHospedaje> getListaFHospedaje() {
        return ListaFHospedaje; // Retorna la lista de fichas de hospedaje
    }

    public void setListaFHospedaje(List<FichaHospedaje> ListaFHospedaje) {
        this.ListaFHospedaje = ListaFHospedaje; // Asigna una nueva lista de fichas
    }

    // Muestra la lista de huéspedes registrados
    public void ListadeHuespedes() {
        System.out.println("----Lista de huespedes----"); // Título
        for (Huesped h : ListaHuespedes) { // Recorre cada huésped
            System.out.println(h.toString()); // Imprime su información
        }
    }

    // Registra un nuevo huésped validando duplicados
    public boolean registrarHuesped(Huesped h) {
        if (h == null) { // Verifica si el huésped es nulo
            System.out.println("No se pudo registrar el huésped: objeto nulo.");
            return false;
        }

        // Verifica si ya existe un huésped con el mismo DNI o teléfono
        for (Huesped existente : ListaHuespedes) {
            if (existente.getDni() == h.getDni()) { // Duplicado por DNI
                System.out.println("Error: ya existe un huésped con el mismo DNI.");
                return false;
            }
            if (existente.getTelefono() == h.getTelefono()) { // Duplicado por teléfono
                System.out.println("Error: ya existe un huésped con el mismo teléfono.");
                return false;
            }
        }

        ListaHuespedes.add(h); // Agrega el huésped a la lista
        System.out.println("Huésped registrado: " + h); // Confirma registro
        return true; // Registro exitoso
    }

    // Busca un huésped por su DNI
    public Huesped buscarHuespedPorDni(int dni) {
        for (Huesped h : this.ListaHuespedes) { // Recorre la lista de huéspedes
            if (h.getDni() == dni) { // Compara DNI
                return h; // Retorna si lo encuentra
            }
        }
        return null; // Retorna null si no lo encuentra
    }

    // Devuelve los huéspedes hospedados en una habitación específica
    public List<Huesped> obtenerHuespedxHabitacion(String numeroHabitacion) {
        List<Huesped> resultado = new ArrayList<>(); // Lista temporal para almacenar huéspedes
        for (FichaHospedaje ficha : ListaFHospedaje) { // Recorre todas las fichas
            if (ficha.getHabitacion().getNumero().equals(numeroHabitacion)) { // Verifica número de habitación
                resultado.addAll(ficha.getHuespedes()); // Agrega todos los huéspedes de esa ficha
            }
        }
        return resultado; // Retorna la lista de huéspedes
    }

    // Registra un nuevo empleado, validando duplicados
    public boolean registrarEmpleado(Empleado empleado) {
        if (empleado == null) { // Verifica si es nulo
            System.out.println("No se pudo registrar el empleado: objeto nulo.");
            return false;
        }

        // Verifica duplicidad de ID, DNI y teléfono
        for (Empleado existente : ListaEmpleados) {
            if (existente.getId() == empleado.getId()) {
                System.out.println("Error: ya existe un empleado con el mismo ID.");
                return false;
            }
            if (existente.getDni() == empleado.getDni()) {
                System.out.println("Error: ya existe un empleado con el mismo DNI.");
                return false;
            }
            if (existente.getTelefono() == empleado.getTelefono()) {
                System.out.println("Error: ya existe un empleado con el mismo teléfono.");
                return false;
            }
        }

        ListaEmpleados.add(empleado); // Agrega el empleado
        System.out.println("Empleado registrado: " + empleado); // Muestra confirmación
        return true;
    }

    // Busca un empleado por su ID
    public Empleado buscarEmpleadoPorId(int id) {
        for (Empleado empleado : ListaEmpleados) { // Recorre empleados
            if (empleado.getId() == id) { // Compara ID
                return empleado; // Retorna si lo encuentra
            }
        }
        return null; // Retorna null si no lo encuentra
    }

    // Busca un empleado por su DNI
    public Empleado buscarEmpleadoPorDni(int dni) {
        for (Empleado e : ListaEmpleados) { // Recorre empleados
            if (e.getDni() == dni) { // Compara DNI
                return e; // Retorna si lo encuentra
            }
        }
        return null; // No encontrado
    }

    // Lista todos los empleados
    public void listarEmpleados() {
        System.out.println("---- Lista de empleados ----"); // Título
        for (Empleado emp : ListaEmpleados) { // Recorre y muestra empleados
            System.out.println(emp);
        }
    }

    // Marca una habitación como en mantenimiento
    public void Mantenimiento_Habitacion(String numero) {
        Habitacion h = buscarHabitacionporNumero(numero); // Busca la habitación
        if (h != null) { // Si la encuentra
            h.setEstado('M'); // M = Mantenimiento
            System.out.println("La habitación " + numero + " ha sido marcada como en mantenimiento.");
        }
    }

    // Calcula el total de ventas para un día específico
    public double reporteVentasxDia(LocalDate fecha) {
        double total = 0; // Total acumulado
        for (FichaHospedaje ficha : ListaFHospedaje) { // Recorre fichas
            if (ficha.getFechaSalida() != null // Verifica si tiene salida
                    && ficha.getFechaSalida().toLocalDate().equals(fecha) // Verifica fecha
                    && ficha.getEstado() == 'F') { // Verifica estado finalizado
                total += ficha.calcularImporteTotal(); // Suma el importe
            }
        }
        return total; // Retorna el total
    }

    // Registra una nueva habitación
    public void registrarHabitacion(Habitacion h) {
        ListaHabitacion.add(h); // Agrega la habitación a la lista
    }

    // Busca una habitación por número
    public Habitacion buscarHabitacionporNumero(String numero) {
        for (Habitacion h : ListaHabitacion) { // Recorre la lista
            if (h.getNumero().equals(numero)) { // Compara número
                return h; // Retorna si la encuentra
            }
        }
        return null; // No encontrada
    }

    // Elimina una habitación por número
    public void eliminarHabitacion(String numero) {
        ListaHabitacion.removeIf(h -> h.getNumero().equals(numero)); // Elimina si el número coincide
    }

    // Retorna todas las habitaciones
    public List<Habitacion> listarHabitacion() {
        return ListaHabitacion; // Devuelve la lista de habitaciones
    }

    // Registra una nueva ficha de hospedaje
    public void registrarFichaHospedaje(FichaHospedaje ficha) {
        this.ListaFHospedaje.add(ficha); // Agrega la ficha a la lista
    }

    // Busca una ficha activa por DNI del huésped
    public FichaHospedaje buscarFichaPorHuespedDni(int dni) {
        for (FichaHospedaje ficha : ListaFHospedaje) { // Recorre fichas
            for (Huesped h : ficha.getHuespedes()) { // Recorre huéspedes
                if (h.getDni() == dni && ficha.getFechaSalida() == null) {
                    return ficha; // Retorna ficha activa
                }
            }
        }
        return null; // No encontrada
    }

    // Busca ficha por habitación
    public FichaHospedaje buscarFichaPorHabitacion(Habitacion habitacion) {
        for (FichaHospedaje ficha : ListaFHospedaje) {
            if (ficha.getHabitacion().equals(habitacion)) {
                return ficha;
            }
        }
        return null;
    }

}
