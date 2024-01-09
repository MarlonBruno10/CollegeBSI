package Atividades.AtProxy;

public interface Arquivo {

    void criar() throws AcessoNegadoException;
    void ler()throws AcessoNegadoException;;
    void atualizar()throws AcessoNegadoException;;
    void excluir()throws AcessoNegadoException;;

    String getProprietario();
}
