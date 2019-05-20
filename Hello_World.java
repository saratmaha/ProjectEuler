public class Hello_World {
    public static void main(String[] args) {
        System.out.println("Hello Java is working");
        int n = 3;
        String src = "A";
        String temp = "C";
        String dest = "B";
        recursiveTowers(n,src,dest,temp);
    }


    public static void recursiveTowers(int n,String src, String dest, String temp) {
        if(n == 1) {
            System.out.println(src + " -> " + dest);
        }
        else {
            recursiveTowers(n-1,src, temp, dest);
            System.out.println(src + " -> " + dest);
            recursiveTowers(n-1, temp, dest, src);
        }
    }

}