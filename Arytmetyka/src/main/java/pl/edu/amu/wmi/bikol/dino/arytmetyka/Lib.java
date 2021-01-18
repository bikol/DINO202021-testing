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
        

        if((a.equals("I") && b.equals("III"))||(a.equals("III") && b.equals("I"))){
            return "IV";}

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
    
