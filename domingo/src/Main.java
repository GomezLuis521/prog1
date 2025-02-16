import java.util.ArrayList;
import java.util.Scanner;

class Estudiante {
    private String id;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private int edad;


    public Estudiante(String id, String nombres, String apellidos, String correo, String telefono, int edad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("\nInformación del Estudiante:");
        System.out.println("ID: " + id);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        while (true) {

            System.out.print("Ingrese ID del estudiante: ");
            String id = scanner.nextLine();

            System.out.print("Ingrese nombres: ");
            String nombres = scanner.nextLine();

            System.out.print("Ingrese apellidos: ");
            String apellidos = scanner.nextLine();

            System.out.print("Ingrese correo: ");
            String correo = scanner.nextLine();

            System.out.print("Ingrese teléfono: ");
            String telefono = scanner.nextLine();

            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();


            Estudiante estudiante = new Estudiante(id, nombres, apellidos, correo, telefono, edad);
            estudiantes.add(estudiante);

            System.out.print("¿Desea agregar otro estudiante? (si/no): ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (!respuesta.equals("si")) {
                break;
            }
        }


        System.out.println("\nLista de Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInformacion();
        }

        scanner.close();
    }
}

