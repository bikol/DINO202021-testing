package pl.edu.amu.wmi.bikol.dino.arytmetyka;

/**
 *
 * @author bikol
 */
public class Lib {
    
    public String add(String a, String b){ 
        
        switch (a) {
        	case "one": a = "1"; break;
        	case "two": a = "2"; break;
        	case "three": a = "3"; break;
        }
        
        switch (b) {
    		case "one": b = "1"; break;
    		case "two": b = "2"; break;
    		case "three": b = "3"; break;
        }
        
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
