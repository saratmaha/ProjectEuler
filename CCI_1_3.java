/**
 * URLify
 * Method 1: Use String replace method
 * Method 2: Use Character array
 * Step1: Identify the space character and change it with %20
 */
public class CCI_1_3 {
    public static void main(String[] args) {
        
        String str = "  sarat is doing urlify  ";
        String url = urlify(str);

        System.out.println("Urlified string -- " + url);
    }

    public static String urlify(String url){

        StringBuilder str1 = new StringBuilder();
        char[] urlchar = url.toCharArray();

        for(int i=0;i<=urlchar.length-1;i++){
            
            if(Character.isWhitespace(urlchar[i])) {                
                str1.append("%20");
            } else {
                str1.append(urlchar[i]);
            }
        }
        return str1.toString();        
    }
}