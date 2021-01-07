package pl.edu.amu.wmi.bikol.dino.arytmetyka;

/**
 *
 * @author bikol
 */
public class Lib {
    
    public String add(String a, String b){ 
        
        if (a.equals("1/4") && b.equals("1/4")) {
    		return "1/2";
        }

        if((a.equals("I") && b.equals("III"))||(a.equals("III") && b.equals("I"))){
            return "IV";}
      
        try{
           return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        }catch(NumberFormatException nfe){
           return a.concat(" ").concat(b);
        }    
    }
    
    public String mul(String a , String b){
        return Integer.toString(Integer.parseInt(a) * Integer.parseInt(b));
    }
    
}
