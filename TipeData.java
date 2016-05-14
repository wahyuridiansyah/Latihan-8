package Tugas8;

/**
 *
 * @author wahyuridiansyah
 */
public class TipeData implements I1, D1 {

    @Override
    public void MethodI1() {
        System.out.println("Inputan anda adalah tipe data Integer");
    }

    @Override
    public void MethodD1() {
        System.out.println("Inputan anda adalah tipe data Double");
    }

}
