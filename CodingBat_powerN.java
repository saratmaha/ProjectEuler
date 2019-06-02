public class CodingBat_powerN {

    public static void main(String[] args){
        int base = 10;
        int n = 3;
        int result = powerN(base, n);

        System.out.println("Power of the number: " + result);
    }

    public static int temp = 1;
    public static int powerN(int base, int n) {
        if(n == 1) {
            return base;
        }
        else {     
            temp = temp * base;      
            powerN(base, n - 1 );           
            return temp * base;
        }
    }
}