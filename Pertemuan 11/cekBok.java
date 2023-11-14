import javax.swing.JFrame;

class CheckBox extends JFrame {
    CheckBox unta = new CheckBox("nama kamu siapa");
    CheckBox kuda = new CheckBox("nama kamu anton");
    CheckBox kuda2 = new CheckBox("nama kamu wong");

    CheckBox(String title) {
        super(title);
        setLocation(200, 100);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void objek() {
        setLayout(null);
        getContentPane().add(unta);
        getContentPane().add(kuda);
        getContentPane().add(kuda2);
        unta.setBounds(30, 90, 150, 20);
        kuda.setBounds(30, 120, 150, 20);
        kuda2.setBounds(30, 150, 150, 20);
        setVisible(true);
    }

    public static void main(String[] args) {
        CheckBox ZZ = new CheckBox("PROGRAM MENGHITUNG ZAKAT");
        ZZ.objek();
    }
}