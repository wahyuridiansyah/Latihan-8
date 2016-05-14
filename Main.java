package Tugas8;

/**
 *
 * @author wahyuridiansyah
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TipeData object = new TipeData();
        System.out.println("----------------------------------------");
        System.out.println("                WR Apps");
        System.out.println("----------------------------------------");
        System.out.print("Inputkan Angka : ");
        double inputan = in.nextDouble();
        if ((inputan % 2 != -1) && (inputan % 2 != 0) && (inputan % 2 != 1)) {
            System.out.println("----------------------------------------");
            object.MethodD1();
            System.out.println("----------------------------------------");
        } else {
            System.out.println("----------------------------------------");
            object.MethodI1();
            System.out.println("----------------------------------------");
        }
    }
}
