
package bibliotecaexamen;


public class Libro {
    private String titulo;
    private Autor[] autor;
    private int anio;
    private boolean favorito;

    public Libro(String titulo, Autor[] autor, int anio, boolean favorito) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.favorito = favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
        
   
    @Override
    public String toString() {
        
                
        String stringLibro = "Titulo: " + this.titulo  + ", \nAño: " + this.anio + ", \nFavorito: " + this.favorito + "\n";
               
        for(int i = 0; i < this.autor.length; i++) {
            stringLibro += "Autor " + (i+1) + ": " + this.autor[i] + "\n";
        }
        
        return stringLibro;
    }
    
}
