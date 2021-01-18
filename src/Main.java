
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("enter the number");
        String _number= scan.nextLine();
        ascPattern(Integer.parseInt(_number));
        System.out.println();
        System.out.println("printing descending pattern now");
        descPattern(Integer.parseInt(_number));
    }
    public static void ascPattern(int number){
        for (int _i =1; _i <= number;_i++){
            System.out.println();
            for(int _j=1;j<= _i;_j++)
                System.out.print("* ");
        }
    }

    public static void descPattern(int number){
        for(int _i=1;_i<=number;_i++){
            System.out.println();
            for(int _j=number;_j>=_i;_j--){
                System.out.print("* ");
            }
        }
    }
}
