package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libros> libroslist;

    public Biblioteca() {
        this.libroslist = new ArrayList<>();
    }

    public List<Libros> getLibroslist() {
        return libroslist;
    }

    public void setLibroslist(List<Libros> libroslist) {
        this.libroslist = libroslist;
    }
      //Sistema para agregar un libro
    public void agregarLibro(Libros libro) {
        if (libro != null) {
            if (libro.getTitulo().isEmpty() || libro.getTitulo().isBlank()) {
                System.out.println("Error al agregar el libro, el título no puede ser vacío");
                return;
            }
            this.libroslist.add(libro);
            System.out.println("Libro agregado correctamente");
        } else {
            System.out.println("Error al agregar el libro, intente de nuevo");
        }
    }
       // Sistema para mostrar lista de libro
    public void mostrarLibros() {
        if (this.libroslist.isEmpty()) {
            System.out.println("No hay libros en la lista, intente agregar un libro.");
            return;
        }
        
        System.out.println("Lista de libros:");
        for (Libros libro : this.libroslist) {
            System.out.println(libro);
        }
    }
       //Sistema para buscar un libro por su titulo
    public List<Libros> buscarLibro(String buscarTitulo) {
        List<Libros> librosEncontrados = new ArrayList<>();
        for (Libros libro : this.libroslist) {
            if (libro.getTitulo().toLowerCase().contains(buscarTitulo.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }
        if (librosEncontrados.isEmpty()) {
            System.out.println("No se encontraron libros con el nombre: " + buscarTitulo);
        } else {
            System.out.println("Libros encontrados:");
            for (Libros libro : librosEncontrados) {
                System.out.println(libro);
            }
        }
        return librosEncontrados;
    }
        //Sistema para borrar un libro por su titulo
    public void eliminarLibro(String eliminarTitulo) {
        List<Libros> librosParaEliminar = buscarLibro(eliminarTitulo);
        if (librosParaEliminar.isEmpty()) {
            System.out.println("No se encontró el libro con titulo: " + eliminarTitulo);
            return;
        }
        for (Libros libro : librosParaEliminar) {
            this.libroslist.remove(libro);
            System.out.println("Libro eliminado: " + libro);
        }
    }
}

	
	

