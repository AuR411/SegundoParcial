package biblioteca;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        String opcion;

        do {
        	generarRenglonL();
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Mostrar lista de libros");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Eliminar un libro");
            System.out.println("5. Salir\n");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agregarLibro(biblioteca);
                    break;
                case "2":
                	generarRenglonL();
                    biblioteca.mostrarLibros();
                    break;
                case "3":
                    buscarLibro(biblioteca);
                    break;
                case "4":
                    eliminarLibro(biblioteca);
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (!opcion.equals("5"));

        scanner.close();
    }

    private static void agregarLibro(Biblioteca biblioteca) {
    	generarRenglonC();
    	System.out.print("Ingrese el nombre del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el nombre del autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el año de publicación: ");
        String añoPublicacion = scanner.nextLine();
        System.out.print("Ingrese género: ");
        String genero = scanner.nextLine();
        Libros nuevoLibro = new Libros(titulo, autor, añoPublicacion, genero);
        biblioteca.agregarLibro(nuevoLibro);
    }

    private static void buscarLibro(Biblioteca biblioteca) {
    	generarRenglonL();
        System.out.print("Ingrese el título del libro que quiera buscar: ");
        String tituloLibro = scanner.nextLine();
        biblioteca.buscarLibro(tituloLibro);
    }

    private static void eliminarLibro(Biblioteca biblioteca) {
    	generarRenglonL();
        System.out.print("Ingrese el título del libro a eliminar: ");
        String tituloLibro = scanner.nextLine();
        biblioteca.eliminarLibro(tituloLibro);
    }
    
	public static void generarRenglonL() {
		System.out.println("____________________________\n");
		}
		
		public static void generarRenglonC() {
		System.out.println("___________\n");
		}
}

