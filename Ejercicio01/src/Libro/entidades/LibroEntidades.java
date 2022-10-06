/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.entidades;

/**
 *
 * @author Usuario
 */
public class LibroEntidades {
    
   private int ISBN;
   private String titulo;
   private String autor;
   private int paginas;

    public LibroEntidades() {
    }

    public LibroEntidades(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
  
    public void mostrarLibro(){
        System.out.println("\nISBN: " +getISBN() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nPaginas: " + getPaginas());
    }
}
