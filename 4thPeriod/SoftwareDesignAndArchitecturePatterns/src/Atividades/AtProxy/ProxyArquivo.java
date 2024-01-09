package Atividades.AtProxy;

import java.util.Objects;

public class ProxyArquivo implements Arquivo{
    private Arquivo arquivo;
    private String usuario;

    public ProxyArquivo(Arquivo arquivo, String usuario) {
        this.arquivo = arquivo;
        this.usuario = usuario;
    }

    public ProxyArquivo(RealArquivo realArquivo, String usuario1) {
    }

    @Override
    public void criar() throws AcessoNegadoException {
        if (temPermissaoDeAcesso()) {
            arquivo.criar();
        }else {
            throw new AcessoNegadoException("O usuário não tem permissão para criar arquivos.");
        }
    }

    @Override
    public void ler() throws AcessoNegadoException {
        if (temPermissaoDeAcesso()) {
            arquivo.ler();
        }else {
            throw new AcessoNegadoException("O usuário não tem permissão para ler arquivos.");
        }
    }

    @Override
    public void atualizar() throws AcessoNegadoException {
        if (temPermissaoDeAcesso()) {
            arquivo.atualizar();
        }else {
            throw new AcessoNegadoException("O usuário não tem permissão para atualizar arquivos.");
        }
    }

    @Override
    public void excluir()throws AcessoNegadoException {
        if (temPermissaoDeAcesso()) {
            arquivo.excluir();
        }else {
            throw new AcessoNegadoException("O usuário não tem permissão para atualizar arquivos.");
        }
    }

    @Override
    public String getProprietario() {
        return usuario;
    }


    private boolean temPermissaoDeAcesso() {
        if (arquivo != null) {
            return arquivo.getProprietario().equals(usuario);
        } else {
            return false;
        }
    }
}
