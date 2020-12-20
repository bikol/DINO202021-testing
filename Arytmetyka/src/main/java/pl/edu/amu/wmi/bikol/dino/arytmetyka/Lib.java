package pl.edu.amu.wmi.bikol.dino.arytmetyka;

/**
 *
 * @author bikol
 */
public class Lib {
    
    public String add(String a, String b){
        
        try{
              Integer.parseInt(a);
              Integer.parseInt(b);
              return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
              
            } catch(NumberFormatException e){
              return a + " " + b;
            }
    }
    
    public String mul(String a , String b){
        return Integer.toString(Integer.parseInt(a) * Integer.parseInt(b));
    }
    
}
