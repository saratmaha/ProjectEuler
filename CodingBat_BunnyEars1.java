public class CodingBat_BunnyEars1 {

    public static void main(String[] args) {
        int bunnys = 32;
        int num_ears = bunnyEars1(bunnys);

        System.out.println("Number of ears --> " + num_ears);
    }

    public static int bunnyEars1(int bunnys) {
        if(bunnys == 1) {
            return 2;
        }
        else {
            return bunnyEars1(bunnys - 1) + 2;
        }
    } 
}