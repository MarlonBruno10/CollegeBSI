package ArvoreBinariaDeBusca;

public interface IArvore<T> extends Comparable<T> {

    void inserir(No<T> no) throws Exception;

    void remover(No no) throws NoInexistenteException, ArvoreVaziaException;

    No buscar(int dado) throws NoInexistenteException, ArvoreVaziaException;

    No visitar(No no) throws NoInexistenteException, ArvoreVaziaException;

    boolean estaVazia();

    boolean ehCompleta();

    int altura();

    void imprimirArvore() throws ArvoreVaziaException;
}