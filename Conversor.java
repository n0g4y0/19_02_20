
import java.util.*;


public class Conversor
{
    
    public ArrayList<Componente> descomponerDigitosNumero(int numero){
        
        ArrayList<Componente> resultado = new ArrayList();
        
        sacarDigitos(numero,resultado);
    
        return resultado;
    
    }
    
    private void sacarDigitos(int numero, ArrayList<Componente> resultado){
    
       int  contador = 0;
       
       while(numero > 0){
           int digito = numero%10;
           resultado.add(new Componente(digito,contador));
           contador++;
           numero = numero/10;
        }
    
    }
    
    
    public int getDigitosInvertidosNumero(int numero){
        
        int resultado = 0;
        
        while( numero > 0){
            
            int residuo = numero%10;
            
            int elevarPotencia = (int)Math.pow(10,calcularTamanioNumero(numero) - 1);
            
            resultado = resultado +  residuo * elevarPotencia;
            
            numero = numero/10;
            
        }
        
        return resultado;
        
    }
    
    private int calcularTamanioNumero(int numero){
        int resultado = 0;
        
        while (numero > 0){
            resultado++;
            numero = numero/10;
        }
    
        return resultado;
    }
    
    
   

}
