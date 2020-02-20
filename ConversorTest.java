
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ConversorTest
{
    @Test
    public void muestraDigitosMasPosicionPruebaUno(){
    
        Conversor pruebaConversor = new Conversor();

        
        ArrayList<Componente> resultante = pruebaConversor.descomponerDigitosNumero(123);
        
        ArrayList<Componente> esperado = new ArrayList<Componente>();
        esperado.add(new Componente(3,0));
        esperado.add(new Componente(2,1));
        esperado.add(new Componente(1,2));
        
        int resultante01 = (int)resultante.get(1).getDigito();
        int esperado01 = (int) esperado.get(1).getDigito();
        
        assertEquals(esperado01, resultante01);
        
    
    }
    
    @Test
    public void muestraDigitosMasPosicionPruebaDos(){
    
        Conversor pruebaConversor = new Conversor();

        
        ArrayList<Componente> resultante = pruebaConversor.descomponerDigitosNumero(123);
        
        ArrayList<Componente> esperado = new ArrayList<Componente>();
        esperado.add(new Componente(3,0));
        esperado.add(new Componente(2,1));
        esperado.add(new Componente(1,2));
        
        int resultante01 = (int)resultante.get(2).getDigito();
        int esperado01 = (int) esperado.get(2).getDigito();
        
        assertEquals(esperado01, resultante01);
        
    
    }
    
    
    @Test
    public void mostrarNumeroInvertidoTestPruebaUno(){
    
        Conversor test = new Conversor();

        assertEquals(123, test.getDigitosInvertidosNumero(321));
    
    }
    
    @Test
    public void mostrarNumeroInvertidoTestPruebaDos(){
    
        Conversor test = new Conversor();

        assertEquals(3001, test.getDigitosInvertidosNumero(1003));
    
    }
    
    
    
    /**
     * Default constructor for test class ConversorTest
     */
    public ConversorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
