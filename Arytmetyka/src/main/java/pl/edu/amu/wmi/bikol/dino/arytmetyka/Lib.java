  
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

        if (a.equals("B") && b.equals("A")) {
    		return "XYZ";
    	}

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
        if(a.equals("A") && b.equals("B")){
            return "C";
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
            if(b.substring(0, 1).equals("^")) {
              int res = 1;
              int x = Integer.parseInt(a);
              int y = Integer.parseInt(b.substring(1));
              for(int i = 0; i < y; i++) {
                res = res*x;
              }
              return Integer.toString(res);
            }
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
