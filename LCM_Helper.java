import java.util.*;

public class LCM_Helper {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    ArrayList<Integer> primeFactorsList = new ArrayList<Integer>(); 

    public ArrayList<Integer> primeNumbers(int n) {
        
        for(int i=2; i<=n ; i++) {
            boolean isPrime = true;
            for(int j=2; j<=i/2; j++) {
                if(i % j == 0 && i != j) {
                    isPrime = false;                
                    break;
                }
            }
            if(isPrime == true) {
                primes.add(i);
            }                   
        }
        return primes;
    }

    public ArrayList<Integer> primeFactors1(int n, ArrayList<Integer> primes1) {
              
        for(Integer i : primes1) {          
            if(primes1.contains(n)) {
                primeFactorsList.add(n);               
                return primeFactorsList;
                
            }
            else if(n % i == 0) {
                primeFactorsList.add(i);
                primeFactors1(n / i, primes1);
                return primeFactorsList;
            }
        }
        return primeFactorsList;
    }
    
}