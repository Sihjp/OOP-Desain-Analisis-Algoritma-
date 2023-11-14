package Latihan;

public class ProsedurMethod {
    public void segiempat(int panjang, int lebar){
        double luas;
        double keliling;
        luas = panjang * lebar;
        System.out.println("==================");
        System.out.println("Panjang segi empat ="+ panjang);
        System.out.println("Lebar segi empat ="+ lebar);
        System.out.println("Luas segi empat ="+ luas);
    }

    public static void main(String[] args){
        ProsedurMethod pm = new ProsedurMethod();
        pm.segiempat(10, 5);
    }
}
