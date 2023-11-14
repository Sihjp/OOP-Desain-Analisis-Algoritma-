package Latihan;

public class FaktorialMethod {
    public void test(int data){
        int nilai =1;
        if (data == 0||data == 1){
            nilai = 1;
        }
        else {
            for (int i =1; i <= data; i++){
                nilai *= i;
            }
        }
        System.out.println(data+"! = "+nilai);
    }
    public static void main(String[] args) {
        FaktorialMethod f5 = new FaktorialMethod();
        f5.test(4);
        f5.test(5);
    }
}
