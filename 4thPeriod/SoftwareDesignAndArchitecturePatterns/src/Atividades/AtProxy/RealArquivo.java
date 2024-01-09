package Atividades.AtProxy;

public class RealArquivo {
    private String nome;
    private String proprietario;
    private String conteudo;

    public RealArquivo(String nome) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void criar() {
        // Cria o arquivo real no disco
    }

    public void ler() {
        // Lê o conteúdo do arquivo real
    }

    public void atualizar() {
        // Atualiza o conteúdo do arquivo real
    }

    public void excluir() {
        // Exclui o arquivo real do disco
    }

}
