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
    }
    
}
