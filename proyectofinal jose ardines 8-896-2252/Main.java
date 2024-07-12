import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaApicola sistema = new SistemaApicola();
        Scanner scanner = new Scanner(System.in);

        try {
            sistema.cargarDatos();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudieron cargar los datos: " + ((Throwable) e).getMessage());
        }

        while (true) {
            System.out.println("1. Agregar Colmena");
            System.out.println("2. Agregar Apicultor");
            System.out.println("3. Registrar Inspección");
            System.out.println("4. Mostrar Colmenas");
            System.out.println("5. Guardar y Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese ID de la colmena: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese ubicación: ");
                    String ubicacion = scanner.nextLine();
                    System.out.print("Ingrese estado de salud: ");
                    String estadoSalud = scanner.nextLine();
                    System.out.print("Ingrese cantidad de abejas: ");
                    int cantidadAbejas = scanner.nextInt();
                    System.out.print("Ingrese producción de miel: ");
                    double produccionMiel = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese edad de la abeja reina: ");
                    int edadAbejaReina = scanner.nextInt();
                    System.out.print("Ingrese productividad de la abeja reina: ");
                    double productividadAbejaReina = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese estado de salud de la abeja reina: ");
                    String estadoSaludAbejaReina = scanner.nextLine();

                    AbejaReina abejaReina = new AbejaReina(edadAbejaReina, productividadAbejaReina, estadoSaludAbejaReina);
                    Colmena colmena = new Colmena(id, ubicacion, estadoSalud, cantidadAbejas, produccionMiel, abejaReina);
                    sistema.agregarColmena(colmena);
                }

                case 2 -> {
                    System.out.print("Ingrese nombre del apicultor: ");
                    String nombreApicultor = scanner.nextLine();
                    System.out.print("Ingrese identificación del apicultor: ");
                    String idApicultor = scanner.nextLine();
                    System.out.print("Ingrese contacto del apicultor: ");
                    String contactoApicultor = scanner.nextLine();
                    
                    Apicultor apicultor = new Apicultor(nombreApicultor, idApicultor, contactoApicultor);
                    sistema.agregarApicultor(apicultor);
                }

                case 3 -> {
                    System.out.print("Ingrese ID de la colmena a inspeccionar: ");
                    String idColmena = scanner.nextLine();
                    System.out.print("Ingrese resultados de la inspección: ");
                    String resultados = scanner.nextLine();
                    System.out.print("Ingrese acciones tomadas: ");
                    String acciones = scanner.nextLine();
                    
                    Inspeccion inspeccion = new Inspeccion(new Date(), resultados, acciones);
                    Colmena colmenaAInspeccionar = sistema.getColmenas().stream()
                            .filter(c -> c.getId().equals(idColmena))
                            .findFirst()
                            .orElse(null);
                    
                    if (colmenaAInspeccionar != null) {
                        colmenaAInspeccionar.agregarInspeccion(inspeccion);
                    } else {
                        System.out.println("Colmena no encontrada.");
                    }
                }

                case 4 -> sistema.getColmenas().forEach(System.out::println);

                case 5 -> {
                    try {
                        sistema.guardarDatos();
                    } catch (IOException e) {
                        System.out.println("No se pudieron guardar los datos: " + e.getMessage());
                    }
                    scanner.close();
                    System.exit(0);
                }

                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
