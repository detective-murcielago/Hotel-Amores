package Main; // Paquete principal del programa

// Importación de clases necesarias del proyecto
import Entidades.*;
import controlador.*;

import java.io.*; // Para entrada/salida de datos
import java.time.LocalDate; // Para trabajar con fechas sin hora
import java.time.LocalDateTime; // Para trabajar con fechas con hora
import java.util.*; // Para uso de colecciones como List, UUID, etc.

public class test { // Clase principal del sistema

    public static void main(String[] args) throws IOException { // Método principal, lanza IOException por el uso de BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Permite leer datos del usuario por consola

        SistemaHotel sistema = SistemaHotel.getInstancia(); // Obtiene la instancia única del sistema (Singleton)
        Hotel hotel = sistema.getHotel(); // Obtiene el hotel que gestiona el sistema

        int opcion = 0; // Variable para almacenar la opción del menú
        do {
            try {
                // Se muestra el menú principal
                System.out.println("\n---- MENÚ DE HOTEL AMORES ----");
                System.out.println("1. Registrar habitación");
                System.out.println("2. Registrar huésped");
                System.out.println("3. Asignar habitación a huésped");
                System.out.println("4. Registrar empleado");
                System.out.println("5. Registrar salida de huésped");
                System.out.println("6. Dar mantenimiento a habitación");
                System.out.println("7. Reporte de ventas por día");
                System.out.println("8. Eliminar habitación");
                System.out.println("9. Listar huéspedes");
                System.out.println("10. Listar habitaciones");
                System.out.println("11. Listar empleados");
                System.out.println("12. Salir del sistema");
                System.out.print("Seleccione una opción: ");
                opcion = Integer.parseInt(br.readLine()); // Se lee y convierte la opción ingresada

                switch (opcion) { // Menú de opciones usando switch
                    case 1 -> { // Registrar habitación
                        System.out.print("Ingrese número de habitación: ");
                        String numero = br.readLine(); // Se lee el número de la habitación
                        System.out.print("Tipo (S=Simple, D=Doble, M=Matrimonial): ");
                        char tipo = br.readLine().toUpperCase().charAt(0); // Se lee y convierte el tipo a mayúscula
                        System.out.print("Estado (D=Disponible, O=Ocupado): ");
                        char estado = br.readLine().toUpperCase().charAt(0); // Se lee el estado
                        System.out.print("Precio por hora: ");
                        double precio = Double.parseDouble(br.readLine()); // Se lee el precio

                        Habitacion hab = new Habitacion(numero, tipo, estado, precio); // Se crea el objeto habitación
                        hotel.registrarHabitacion(hab); // Se registra la habitación en el hotel
                        System.out.println("Habitación registrada exitosamente.");
                    }

                    case 2 -> { // Registrar huésped
                        System.out.print("Nombre: ");
                        String nombre = br.readLine(); // Lee el nombre
                        System.out.print("Apellido: ");
                        String apellido = br.readLine(); // Lee el apellido
                        System.out.print("DNI: ");
                        int dni = Integer.parseInt(br.readLine()); // Lee el DNI
                        System.out.print("Teléfono: ");
                        int telefono = Integer.parseInt(br.readLine()); // Lee el teléfono

                        Huesped huesped = new Huesped(nombre, apellido, dni, telefono); // Crea objeto huésped
                        hotel.registrarHuesped(huesped); // Registra el huésped
                    }

                    case 3 -> { // Asignar habitación a huésped
                        System.out.print("Ingrese DNI del huésped: ");
                        int dniH = Integer.parseInt(br.readLine());
                        Huesped h = hotel.buscarHuespedPorDni(dniH); // Busca huésped por DNI

                        if (h == null) { // Verifica si el huésped existe
                            System.out.println("Huésped no encontrado.");
                            break;
                        }

                        System.out.print("Ingrese número de habitación: ");
                        String nroHab = br.readLine();
                        Habitacion habitacion = hotel.buscarHabitacionporNumero(nroHab); // Busca habitación

                        if (habitacion == null || habitacion.getEstado() != 'D') { // Valida disponibilidad
                            System.out.println("Habitación no disponible.");
                            break;
                        }

                        System.out.print("Horas de hospedaje: ");
                        int horas = Integer.parseInt(br.readLine()); // Lee duración del hospedaje

                        System.out.print("Cantidad de personas: ");
                        int cantPersonas = Integer.parseInt(br.readLine()); // Lee cantidad de personas

                        String idFicha = "F" + UUID.randomUUID().toString().substring(0, 6); // Genera ID aleatorio para ficha
                        List<Huesped> listaHuespedes = new ArrayList<>(); // Crea lista de huéspedes
                        listaHuespedes.add(h); // Añade huésped a la lista

                        LocalDateTime ingreso = LocalDateTime.now(); // Fecha y hora actual de ingreso

                        FichaHospedaje ficha = new FichaHospedaje(idFicha, listaHuespedes, habitacion, horas, ingreso, cantPersonas); // Crea ficha de hospedaje

                        h.asignarFichaHospedaje(ficha); // Asigna la ficha al huésped
                        habitacion.marcaOcupado(); // Marca la habitación como ocupada
                        hotel.registrarFichaHospedaje(ficha); // Registra la ficha en el hotel
                        System.out.println("Habitación asignada correctamente.");
                    }

                    case 4 -> { // Registrar empleado
                        System.out.print("Nombre: ");
                        String nEmp = br.readLine();
                        System.out.print("Apellido: ");
                        String apeEmp = br.readLine();
                        System.out.print("DNI: ");
                        int dniEmp = Integer.parseInt(br.readLine());
                        System.out.print("Teléfono: ");
                        int telEmp = Integer.parseInt(br.readLine());
                        System.out.print("ID: ");
                        int idEmp = Integer.parseInt(br.readLine());
                        System.out.print("Rol: ");
                        String rol = br.readLine();

                        Empleado emp = new Empleado(idEmp, rol, nEmp, apeEmp, dniEmp, telEmp); // Crea empleado
                        hotel.registrarEmpleado(emp); // Registra empleado
                    }

                    case 5 -> { // Registrar salida de huésped
                        System.out.print("DNI del huésped: ");
                        int dniSalida = Integer.parseInt(br.readLine());
                        FichaHospedaje fichaSalida = hotel.buscarFichaPorHuespedDni(dniSalida); // Busca ficha por DNI

                        if (fichaSalida != null) {
                            fichaSalida.registrarSalida(); // Registra la salida (actualiza fecha)
                            System.out.println("Salida registrada para: " + fichaSalida.getFechaSalida().toLocalDate()); // Muestra fecha

                            fichaSalida.getHabitacion().marcaDisponible(); // Libera la habitación

                            String codigo = "C" + UUID.randomUUID().toString().substring(0, 6).toUpperCase(); // Crea código de comprobante
                            double importe = fichaSalida.calcularImporteTotal(); // Calcula importe
                            LocalDateTime fechaEmision = LocalDateTime.now(); // Fecha del comprobante

                            ComprobantePago comprobante = new ComprobantePago(codigo, fichaSalida, importe, fechaEmision); // Crea comprobante
                            System.out.println(comprobante); // Muestra comprobante
                        } else {
                            System.out.println("Ficha no encontrada.");
                        }
                    }

                    case 6 -> { // Dar mantenimiento
                        System.out.print("ID del empleado que solicita mantenimiento: ");
                        int idMant = Integer.parseInt(br.readLine());
                        Empleado empleado = hotel.buscarEmpleadoPorId(idMant); // Busca empleado

                        if (empleado != null) {
                            System.out.print("Número de habitación: ");
                            String numMant = br.readLine();
                            hotel.Mantenimiento_Habitacion(numMant); // Marca mantenimiento
                        } else {
                            System.out.println("Empleado no encontrado.");
                        }
                    }

                    case 7 -> { // Reporte de ventas por día
                        System.out.print("Ingrese fecha (AAAA-MM-DD): ");
                        LocalDate fecha = LocalDate.parse(br.readLine()); // Convierte texto a fecha
                        double total = hotel.reporteVentasxDia(fecha); // Calcula ventas del día
                        System.out.println("Total de ventas: S/." + total);
                    }

                    case 8 -> { // Eliminar habitación
                        System.out.print("Número de habitación a eliminar: ");
                        String numEliminar = br.readLine();
                        hotel.eliminarHabitacion(numEliminar); // Elimina habitación
                        System.out.println("Habitación eliminada.");
                    }

                    case 9 -> { // Listar huéspedes
                        if (hotel.getListaHuespedes().isEmpty()) {
                            System.out.println("No hay huéspedes registrados.");
                        } else {
                            hotel.ListadeHuespedes(); // Lista huéspedes
                        }
                    }

                    case 10 -> { // Listar habitaciones
                        List<Habitacion> habitaciones = hotel.listarHabitacion(); // Obtiene lista de habitaciones
                        if (habitaciones.isEmpty()) {
                            System.out.println("No hay habitaciones registradas.");
                        } else {
                            for (Habitacion habItem : habitaciones) {
                                System.out.println(habItem); // Muestra cada habitación
                            }
                        }
                    }

                    case 11 -> { // Listar empleados
                        if (hotel.getListaEmpleados().isEmpty()) {
                            System.out.println("No hay empleados registrados.");
                        } else {
                            hotel.listarEmpleados(); // Muestra empleados
                        }
                    }

                    case 12 -> // Salir del sistema
                        System.out.println("Saliendo del sistema...");

                    default -> // Opción inválida
                        System.out.println("Opción inválida.");
                }

            } catch (Exception e) { // Captura errores
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 12); // El bucle se repite hasta que el usuario elija salir
    }
}
