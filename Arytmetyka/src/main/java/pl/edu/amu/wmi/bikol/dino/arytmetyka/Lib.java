package pl.edu.amu.wmi.bikol.dino.arytmetyka;

/**
 *
 * @author bikol
 */
public class Lib {
    
    public String add(String a, String b){ 
        
        try{
           return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        }catch(NumberFormatException nfe){
           return a.concat(" ").concat(b);
        }    
    }
    
    public String mul(String a , String b){
        
        try{
            return Integer.toString(Integer.parseInt(a) * Integer.parseInt(b));
        }catch(NumberFormatException nfe){
            int numOfTimes;
            String result;
            
            numOfTimes = Integer.parseInt(b);
            result = "";
            
            for(int i=0; i<numOfTimes; i++) {
                result += a;
            }
            
            return result;
        }
    }
    
}
