
/**
 * Step1: Compute number of steps for the sequence using given formula (use iterative approach)
 * Step2: repeat Step1 
 *          store the result for every number upto n 
 * Step3: Retrive the result from the stored values
 */
import java.time.Instant;
import java.util.*;
public class ProjectEuler14 {
    public static void main(String[] args){

        Map<Integer,Long> resultMap = new HashMap<>();       

        for(int i = 1; i <= 1000000  ; i++) {
            if(i == 100000 || i == 200000 || i == 300000 || i == 400000 || i == 500000|| i == 600000 || i == 700000
                || i == 800000 || i == 900000 || i == 999999) {
                    System.out.println( Instant.now() );
            }
            long count = 1;
            int j = i;
            while( j != 1 ) {

                // Use already preserved values in map to reduce re-computing
                if(resultMap.containsKey(j)) {
                    count = count + (resultMap.get(j) - 1);
                    break;
                }
                if( j % 2 == 0) {
                    count = count + 1;
                    j = j / 2;                    
                }
                else {
                    count = count + 1;
                    j = 3 * j + 1;                   
                }
            } 
            resultMap.put(i, count);
        }

        long resultvalue = 0;  
        int resultkey = 0;     
        for(Integer key : resultMap.keySet()) {
            //System.out.println(key + " --> " + resultMap.get(key));
            if(resultMap.get(key) > resultvalue) {
                resultvalue = resultMap.get(key); 
                resultkey = key;
            }
        }
       System.out.println("result --> " + resultkey + " -- " + resultvalue);
    }
}
