
/**
 *  n * (n-1) for big integers. BigIntegers multiplication
 */
import java.math.BigInteger;

public class ProjectEuler20 {
    

public static BigInteger fact = BigInteger.valueOf(1);
    public static void main(String[] args) {
        
        BigInteger bi = factorial(100);
        //System.out.println(bi);

        int count = 0;

        for(int i = 0; i <= bi.toString().length() - 1 ; i++) {
            count = count + Character.getNumericValue(bi.toString().charAt(i));
        }

        System.out.println(count);
    }

    public static BigInteger factorial(int n) {
        
        if( n == 1){
            return fact;
        }
        else {
            fact = fact.multiply(BigInteger.valueOf(n));
            factorial(n-1);            
            return fact;
        }   
    }
}

