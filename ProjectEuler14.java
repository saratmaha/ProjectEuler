/**
 * Step1: Compute number of steps for the sequence using given formula
 * Step2: repeat Step1 
 *          store the result for every number upto n 
 * Step3: Retrive the result from the stored values
 */
import java.util.*;
public class ProjectEuler14 {
    public static void main(String[] args){

        Map<Integer,Integer> resultMap = new HashMap<>();
        for(int i = 13 ; i <= 100000 ; i++) {
            int result = countSequence(i);
            resultMap.put(i,result);
        }

        int resultvalue = 0;  
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
    public static Integer count = 1;
    public static int countSequence(int n) {
        if( n == 1 ) {
            return  count;
        }
        else if( n % 2 == 0) {
            count = count + 1;
            n = n / 2;
            countSequence(n);
            return count;
        }
        else if( n % 2 != 0){
            count = count + 1;
            n = 3 * n + 1;
            countSequence(n);
            return count;
        }
        else {
            countSequence(n + 1);
            return count;
        }
    }
}
