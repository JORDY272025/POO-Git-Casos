package caso2;
import java.util.Scanner;

class Estudiante {
    // Atributos privados
    private String nombre;
    private int edad;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}

public class EstudianteInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa la edad del estudiante: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        System.out.print("Ingresa la carrera del estudiante: ");
        String carrera = sc.nextLine();

        // Crear objeto Estudiante
        Estudiante estudiante = new Estudiante(nombre, edad, carrera);

        // Mostrar datos
        System.out.println("\n--- Datos del Estudiante ---");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());

        sc.close();
    }
}
