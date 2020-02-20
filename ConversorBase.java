import java.util.*;

public class ConversorBase
{
    private ArrayList<Integer> valor;
    private int base;
    private String representacion;
    
    
    public ConversorBase(ArrayList<Integer> valor, int base, String representacion){
        
        this.valor = valor;
        this.base = base;
        this.representacion = representacion;
    
    
    }
    
  public ArrayList<Integer> convertirNumeroAbinario(int numero){
      ArrayList<Integer> resultado = new ArrayList<Integer>();
      
      while(numero > 0){
          int residuo = numero%2;
          numero = numero/2;
          resultado.add(residuo);
        
        }
      
      return resultado;
  }
  
  
  
 
}
