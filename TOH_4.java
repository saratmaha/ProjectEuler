public class TOH_4 {
    public static void main(String[] args) {
        System.out.println("Hello Java is working");
        int n = 4;
        String src = "A";
        String temp1 = "T1";
        String temp2 = "T2";
        String dest = "B";
        recursiveTowers(n,src,temp1, temp2,dest);
    }

    public static void recursiveTowers(int n,String src,  String temp1, String temp2, String dest) {
        if( n == 0) {
            return;
        }
        else if(n == 1) {
            System.out.println(n + " --> " + src + " -> " + dest);
            return;
        }
       /* else if (n == 2) {
            System.out.println(n + " --> " + src + " --> " + temp1);
            System.out.println(n + " --> " + src + " --> " + dest);
            System.out.println(n + " --> " + temp1 + " --> " + temp1);

        }*/
        else {           
            recursiveTowers(n-2,src, temp1, dest,temp2);
            System.out.println( n - 1 + " --> " + src + " --> " + temp1);
            System.out.println( n + " --> " + src + " --> " + dest);
            recursiveTowers(n-2,temp1, src, temp2,dest);
            if( n - 2 == 0) {
                System.out.println(n-1 + " -- > " + temp1 + " --> "+dest); 
            }
            else {
                System.out.println(n-1 + " -- > " + temp2 + " --> "+dest); 
            }                      
        }
    }
}
