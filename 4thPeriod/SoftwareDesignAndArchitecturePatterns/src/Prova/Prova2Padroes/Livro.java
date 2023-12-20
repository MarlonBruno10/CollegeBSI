package Prova.Prova2Padroes;

public class Livro {

    // Atributos basicos de Livro
    private String autor;
    private String titulo;
    private String isbn;
    private String anoPublicacao;

    public Livro(String autor, String titulo, String isbn, String anoPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos Getter e Setter
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
