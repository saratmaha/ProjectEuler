import java.util.Arrays;
import java.util.HashMap;

/**
 * Method 1 - sort both strings and compare them 
 * Method 2 - Count number of characters in both strings and compare counts
 */
public class CCI_1_2 {
    public static void main(String[] args){
        String str1 = "saratz";
        String str2 = "sarat";

        Boolean method1 = false;
        Boolean method2 = false;
        
        method1 = method1(str1,str2);

        if(method1 == false)
            System.out.println("It is not permutation");
        else 
            System.out.println("It is permutation");

        method2 = method2(str1,str2);

        if(method2 == false)
            System.out.println("It is not permutation");
        else 
            System.out.println("It is permutation");
    }
    public static Boolean method1(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //System.out.println(String.valueOf(ch1) + " -- " + String.valueOf(ch2));

        if(String.valueOf(ch1).equals(String.valueOf(ch2))){
            return true;
        }
        return false;
    }

    public static Boolean method2(String str1, String str2){
        
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        HashMap<Character,Integer> charCountMap1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> charCountMap2 = new HashMap<Character,Integer>();

        for(Character c : ch1){
            if(!charCountMap1.containsKey(c)){
                charCountMap1.put(c, 1);
            }
            else {
                Integer count = charCountMap1.get(c);
                count = count + 1;
                charCountMap1.put(c, count);
            }
        }

        for(Character c : ch2){
            if(!charCountMap2.containsKey(c)){
                charCountMap2.put(c, 1);
            }
            else {
                Integer count = charCountMap2.get(c);
                count = count + 1;
                charCountMap2.put(c, count);
            }
        }

        for(Character c : charCountMap1.keySet()){        
            if(!charCountMap2.containsKey(c) || !charCountMap2.get(c).equals(charCountMap1.get(c))){
                return false;
            }
        }

        for(Character c : charCountMap2.keySet()){        
            if(!charCountMap1.containsKey(c) || !charCountMap1.get(c).equals(charCountMap2.get(c))){
                return false;
            }
        }

        return true;
    }
}