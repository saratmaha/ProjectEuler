/**
 *  Don't use int as 2 pow 1000 results a number which fits in BigInteger/BigDecimal
 */

import java.math.BigInteger;

public class ProjectEuler16 {

    public static int count = 0;    
    public static void main(String[] args) {
               
        BigInteger bin = new BigInteger("2").pow(1000);       
        int result = countTotal(bin, 0);
        System.out.println("Result --> " + result); 
        int count2 = countTotal2(bin);
        System.out.println("Iterative result -->  " + count2);        
    }   
    
    // Recursive
    public static int countTotal(BigInteger sb, int length) {

        if( length == sb.toString().length() ) {
            return count;
        }
        else {
            count = count + Character.getNumericValue(sb.toString().charAt(length));
            countTotal(sb, length + 1);
            return count;
        }        
    }     
        
    //Iterative 
    public static int countTotal2(BigInteger sb) {
        int count2 = 0;
        for(int i=0 ; i <= sb.toString().length() - 1; i++) {
            count2 = count2 + Character.getNumericValue(sb.toString().charAt(i));
        }
        return count2; 
    }   
}

