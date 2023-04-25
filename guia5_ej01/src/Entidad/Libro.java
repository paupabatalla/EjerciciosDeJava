package Entidad;

public class Libro {

    public String autor;
    public String titulo;
    public int paginas;
    public int ISBN;

    public Libro() {

    }

    public Libro(String autor, String titulo, int paginas, int ISBN) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        this.ISBN = ISBN;
    }

    public void ingresarDatos(String autor, String titulo, int paginas, int ISBN) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        this.ISBN = ISBN;
    }

    public void mostrarDatos() {
        System.out.println("El autor del libro es " + this.autor);
        System.out.println("El titulo del libro es " + this.titulo);
        System.out.println("El libro tiene " + this.paginas + " paginas");
        System.out.println("El ISBN del libro es " + this.ISBN);
    }

}
