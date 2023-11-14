// Menara Hanoi

public class Asparagus{
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers (nDisks, 'A', 'B', 'C');
    }
    public static void doTowers(int topN, char from, char inter, char to){
        if (topN == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Move disk " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
    
    
