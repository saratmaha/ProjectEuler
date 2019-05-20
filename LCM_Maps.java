import java.util.*;

public class LCM_Maps {
  
    public static void main(String[] args) {
       
        int lcm1 = 7;
        int lcm2 = 29;   
        
        Map<Integer, List<Integer>> primeFactersMap = new HashMap<Integer, List<Integer>>();
        
        LCM_Helper lcmHelper1 = new LCM_Helper();            
        ArrayList<Integer> primesList1 = lcmHelper1.primeNumbers(lcm1);       
        ArrayList<Integer> primeFactorsList1 = lcmHelper1.primeFactors1(lcm1,primesList1);       
        primeFactersMap.put(lcm1,primeFactorsList1);

        LCM_Helper lcmHelper2 = new LCM_Helper();
        ArrayList<Integer> primesList2 = lcmHelper2.primeNumbers(lcm2);
        ArrayList<Integer> primeFactorsList2 = lcmHelper2.primeFactors1(lcm2,primesList2);
        primeFactersMap.put(lcm2,primeFactorsList2);
        System.out.println(primeFactersMap.toString());

        Map<Integer,Integer> countprimes1 = primesCount(primeFactorsList1);
        Map<Integer,Integer> countprimes2 = primesCount(primeFactorsList2);

        double lcm = 1.0;

        for(int i : countprimes1.keySet()) {

            if(countprimes2.containsKey(i) && countprimes1.get(i) > countprimes2.get(i)) {                
                lcm = lcm * Math.pow(Double.valueOf(i), Double.valueOf(countprimes1.get(i)));               
            } 
            else {
                lcm = lcm * Math.pow(Double.valueOf(i), Double.valueOf(countprimes1.get(i)));
            }  
        }

        for(int j : countprimes2.keySet()) {                       
            if(!countprimes1.containsKey(j)) {                
                lcm = lcm * Math.pow(Double.valueOf(j), Double.valueOf(countprimes2.get(j)));               
            }            
        }

        System.out.println("LCM --> " + (int)lcm);
    }

    public static Map<Integer,Integer> primesCount(ArrayList<Integer> primesList) {
        Map<Integer,Integer> countPrimes = new HashMap<>();
        
        for(int i : primesList) {  
                    
            if(!countPrimes.containsKey(i)) {
                countPrimes.put(i, 1);
            } 
            else {
                countPrimes.put(i,countPrimes.get(i) + 1);
            }                                                                  
        }
        return countPrimes;
    }
}
