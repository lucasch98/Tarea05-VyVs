import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionesTest {

    private Funciones f = new Funciones();

    @Test
    public void esPrimoTest(){
        boolean resultado = f.esPrimo(13);
        assertTrue(resultado);
    }

    @Test
    public void noEsPrimoTest(){
        boolean resultado = f.esPrimo(8);
        assertFalse(resultado);
    }

    @Test
    public void noEsPrimoNumNegativoTest(){//Los numeros primos por definicion son naturales.
        boolean resultado = f.esPrimo(-2);
        assertFalse(resultado);
    }

    @Test
    public void numeroEsCapicuaTest(){
        boolean resultado = f.numeroEsCapicua(111);
        assertTrue(resultado);
    }

    @Test
    public void numeroNoEsCapicuaTest(){
        boolean resultado = f.numeroEsCapicua(123);
        assertFalse(resultado);
    }

    @Test
    public void factorialTest(){
        int resultado = f.factorial(3);
        assertEquals(6, resultado);
    }

}
