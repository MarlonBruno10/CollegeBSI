package Atividades.AtProxy;

public class AcessoNegadoException extends Exception{
    public AcessoNegadoException(){
        super();
    }
    public AcessoNegadoException(String message){
        super(message);
    }
}
