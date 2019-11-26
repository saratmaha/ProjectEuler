/**
 * Step1 - Sort the string 
 * Step2 - Iterate and compare current element with next element until current element
 *         index size is 1 less than the index at the last element
 */
import java.util.Arrays;

public class IsUnique1_1 {

    public static void main(String[] args) {
        String str = "sraa";
        
        Boolean isUnique = true;
        isUnique = findUnique(str);        
        if(isUnique == true){
            System.out.println("Unique");
        }else {
            System.out.println("Not Unique");
        }
    }

    public static Boolean findUnique(String str) {
        
        char[] ch = str.toCharArray();
        if(ch.length == 1){
            return true;
        }
        Arrays.sort(ch);        
        for(int i = 0; i <= ch.length - 1;i++) {
            if(ch.length == 2){
                if(ch[i] == ch[i+1]){
                    return false;
                }
                else {
                    return true;
                }
            }                                       
            if(i != ch.length - 2){
                //System.out.println("length -- " + i + " -- " + (ch.length - 2));
                if(ch[i] == ch[i+1]){
                    return false;
                }
                else {
                    return true;
                }
            }                      
        }
        return true;        
    }
}