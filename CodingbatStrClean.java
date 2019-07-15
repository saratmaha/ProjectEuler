/**
 * Clean string recursively
 * 
 */
import java.util.*;

public class CodingbatStrClean {

    static List<Character> someSet = new ArrayList<>();

    public static void main(String[] args) {
        String str = "yy";
        stringClean(str, str.length());                      
        StringBuffer somebuffer = new StringBuffer();
        for(Character c : someSet) {           
           somebuffer.append(c);
        }
        System.out.println(somebuffer.reverse().toString());
    }

    public static List<Character> stringClean(String str, int length) {
        if(str.length() == 1) {
            if(!someSet.contains(str.charAt(0))) {
                someSet.add(str.charAt(0));
            }            
            return someSet;
        }
        else {
            
            if(!someSet.contains(str.charAt(length - 1))) {
                someSet.add(str.charAt(length - 1));               
                stringClean(str.substring(0, length - 1), length - 1 );
            }
            else {
                stringClean(str.substring(0, length - 1), length - 1 );
            }
            return someSet;
        }
    }
}