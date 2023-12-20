package Prova.Prova2Padroes;

public class Main {
    public static void main(String[] args) {
        // Instanciando a fachada
        BibliotecaFacade bibliotecaFacade = new BibliotecaFacade();

        // Adicionando um livro
        Livro livro1 = bibliotecaFacade.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-85-325-0536-0", "1954");

        // Adicionando um usuário
        Usuario usuario1 = bibliotecaFacade.cadastrarUsuario("João da Silva", 123456789);

        // Realizando um empréstimo
        Emprestimo emprestimo1 = bibliotecaFacade.realizarEmprestimo(usuario1, livro1, "2023-12-20", "2023-12-30", "Em andamento");

        // Verificando se o livro está disponível
        boolean livroDisponivel = bibliotecaFacade.isLivroDisponivel("O Senhor dos Anéis", "J.R.R. Tolkien", "978-85-325-0536-0");
        System.out.println("O livro O Senhor dos Anéis está disponível? " + livroDisponivel);

        // Removendo o livro
        Livro livroRemovido = bibliotecaFacade.removerLivro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-85-325-0536-0", "1954");

        // Remove o usuário
        Usuario usuarioRemovido = bibliotecaFacade.removerUsuario("João da Silva", 123456789);

        // Remove o empréstimo
        Emprestimo emprestimoRemovido = bibliotecaFacade.removerEmprestimo(usuario1, livro1, "2023-12-20", "2023-12-30", "Em andamento");
    }

}
