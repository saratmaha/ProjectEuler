public class CodingBat_BunnyEars2 {

    public static void main(String[] args) {
        int bunnys = 10;
        int num_ears = bunnyEars2(bunnys);

        System.out.println("Number of ears --> " + num_ears);

    }

    public static int bunnyEars2(int bunnys) {
        if(bunnys == 0) {
            return 0;
        }
        else if(bunnys == 1) {
            return 2;
        }
        else if(bunnys % 2 == 0){
            return bunnyEars2(bunnys - 1) + 3;
        }
        else if(bunnys % 2 != 0) {
            return bunnyEars2(bunnys - 1) + 2;
        }
        else {
            return 0;
        }
    } 
}
