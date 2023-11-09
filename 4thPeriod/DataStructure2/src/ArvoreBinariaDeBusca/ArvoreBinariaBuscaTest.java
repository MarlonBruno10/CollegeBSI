package ArvoreBinariaDeBusca;


import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ArvoreBinariaBuscaTest {

    private ArvoreBinariaBusca<Integer> arvore;

    @Before
    public void setUp() {
        arvore = new ArvoreBinariaBusca<Integer>();
    }

    @Test
    public void testInserir() throws Exception {
        // Inserir elementos na árvore
        arvore.inserir(new No(10));
        arvore.inserir(new No(5));
        arvore.inserir(new No(15));

        // Verificar se os elementos foram inseridos corretamente
        No no10 = arvore.buscar(10);
        No no5 = arvore.buscar(5);
        No no15 = arvore.buscar(15);

        assertEquals(10, no10.getDado());
        assertEquals(5, no5.getDado());
        assertEquals(15, no15.getDado());
    }

    @Test
    public void testRemover() throws Exception {
        arvore.inserir(new No(10));
        arvore.inserir(new No(5));
        arvore.inserir(new No(15));

        // Remover um elemento
        arvore.remover(new No(5));

        // Verificar se o elemento foi removido corretamente
        try {
            arvore.buscar(5);
            fail("Deveria lançar uma exceção de NoInexistenteException");
        } catch (NoInexistenteException e) {
            // Exceção esperada
        }
    }

    @Test
    public void testBuscar() throws Exception {
        arvore.inserir(new No(10));
        arvore.inserir(new No(5));
        arvore.inserir(new No(15));

        // Verificar se a busca funciona corretamente
        No no10 = arvore.buscar(10);
        No no5 = arvore.buscar(5);
        No no15 = arvore.buscar(15);

        assertEquals(10, no10.getDado());
        assertEquals(5, no5.getDado());
        assertEquals(15, no15.getDado());
    }

    @Test
    public void testPercorrerEmLargura() throws Exception {
        arvore.inserir(new No(10));
        arvore.inserir(new No(5));
        arvore.inserir(new No(15));
        arvore.inserir(new No(3));
        arvore.inserir(new No(7));

        // Verificar se a ordem da travessia em largura está correta
        assertEquals("10 5 15 3 7 ", getTraversalResult(arvore::percorrerEmLargura));
    }

    @Test
    public void testPosOrdem() throws Exception {
        arvore.inserir(new No(10));
        arvore.inserir(new No(5));
        arvore.inserir(new No(15));
        arvore.inserir(new No(3));
        arvore.inserir(new No(7));

        // Verificar se a ordem da travessia em pós-ordem está correta
        assertEquals("3 7 5 15 10 ", getTraversalResult(() -> {
            try {
                arvore.posOrdem(arvore.raiz);
            } catch (ArvoreVaziaException e) {
                throw new RuntimeException(e);
            }
        }));
    }

    @Test
    public void testInOrdem() throws Exception {
        arvore.inserir(new No(10));
        arvore.inserir(new No(5));
        arvore.inserir(new No(15));
        arvore.inserir(new No(3));
        arvore.inserir(new No(7));

        // Verificar se a ordem da travessia em ordem simétrica está correta
        assertEquals("3 5 7 10 15 ", getTraversalResult(() -> {
            try {
                arvore.inOrdem(arvore.raiz);
            } catch (ArvoreVaziaException e) {
                throw new RuntimeException(e);
            }
        }));
    }

    @Test
    public void testPreOrdem() throws Exception {
        arvore.inserir(new No(10));
        arvore.inserir(new No(5));
        arvore.inserir(new No(15));
        arvore.inserir(new No(3));
        arvore.inserir(new No(7));

        // Verificar se a ordem da travessia em pré-ordem está correta
        assertEquals("10 5 3 7 15 ", getTraversalResult(() -> {
            try {
                arvore.preOrdem(arvore.raiz);
            } catch (ArvoreVaziaException e) {
                throw new RuntimeException(e);
            }
        }));
    }

    // Método auxiliar para obter o resultado da travessia
    private String getTraversalResult(Runnable traversalMethod) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        traversalMethod.run();
        System.setOut(System.out);
        return outputStream.toString().trim();
    }
}
