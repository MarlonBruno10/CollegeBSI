package Prova.Prova2Padroes;

import java.util.ArrayList;

public class BibliotecaFacade {

    // Criação das Listas
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public BibliotecaFacade() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    // Método responsável por criar e adicionar um livro à lista livros
    public Livro adicionarLivro(String titulo, String autor, String isbn, String anoPublicacao) {
        Livro livro = new Livro(titulo, autor, isbn, anoPublicacao);
        livros.add(livro);
        System.out.println("Livro Adicionado Com sucesso!!");
        return livro;
    }

    // Método responsável por remover um livro à lista livros
    public Livro removerLivro(String titulo, String autor, String isbn, String anoPublicacao) {
        Livro livro = new Livro(titulo, autor, isbn, anoPublicacao);
        livros.remove(livro);
        System.out.println("Livro Removido Com Sucesso!!");
        return livro;
    }

    // Método responsável por criar e adicionar um Usuário à lista usuarios
    public Usuario cadastrarUsuario(String nome, int codigo) {
        Usuario usuario = new Usuario(nome, codigo);
        usuarios.add(usuario);
        System.out.println("Usuário Cadastrado Com Sucesso!!");
        return usuario;
    }

    // Método responsável por remover um Usuário da lista usuarios
    public Usuario removerUsuario(String nome, int codigo) {
        Usuario usuario = new Usuario(nome, codigo);
        usuarios.remove(usuario);
        System.out.println("Usuário Removido Com Sucesso!!");
        return usuario;
    }

    // Método responsável por criar e adicionar um Emprestimo à lista de emprestimos
    public Emprestimo realizarEmprestimo(Usuario usuario, Livro livro, String dataEmprestimo, String dataDevolucao, String status) {
        Emprestimo emprestimo = new Emprestimo(usuario, livro, dataEmprestimo, dataDevolucao, status);
        emprestimos.add(emprestimo);
        System.out.println("Livro Emprestado Com Sucesso!!");
        return emprestimo;
    }

    // Método responsável por remover um Emprestimo à lista de emprestimos
    public Emprestimo removerEmprestimo(Usuario usuario, Livro livro, String dataEmprestimo, String dataDevolucao, String status) {
        Emprestimo emprestimo = new Emprestimo(usuario, livro, dataEmprestimo, dataDevolucao, status);
        emprestimos.remove(emprestimo);
        System.out.println("Livro Removido Com Sucesso!!");
        return emprestimo;
    }

    // Método responsável por se o livro está disponivel para emprestimos
    public boolean isLivroDisponivel(String titulo, String autor, String isbn) {
        Livro livro = getLivroPorTituloAutorIsbn(titulo, autor, isbn);
        if (livro == null) {
            return false;
        }
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro)) {
                return false;
            }
        }
        return true;
    }

    // Método responsável por verificar se o livro está cadastrado na biblioteco
    public Livro getLivroPorTituloAutorIsbn(String titulo, String autor, String isbn) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor) && livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }



}
