package Atividades.AtProxy;

import java.security.Permission;

public class Main {
    public static void main(String[] args) throws AcessoNegadoException {
        Arquivo arquivo = new ProxyArquivo(new RealArquivo("arquivo.txt"), "usuario1");
        arquivo.criar();
        arquivo.ler();
        arquivo.atualizar();
        arquivo.excluir();

        arquivo = new ProxyArquivo(new RealArquivo("arquivo.txt"), "usuario2");
        arquivo.criar();
        arquivo.ler();
        arquivo.atualizar();
        arquivo.excluir();
    }
}
