package ArvoreBinariaDeBusca;

// Interface da Arvore Binaria de Busca
public interface IArvoreBinaria extends IArvore{
    //Métodos de para percorrer uma arvore
    void preOrdem(No no) throws ArvoreVaziaException;
    void inOrdem(No no) throws ArvoreVaziaException;
    void posOrdem(No no) throws ArvoreVaziaException;

}
