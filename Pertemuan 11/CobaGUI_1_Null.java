import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
class CobaGUI_1 extends JFrame{
    Button cb1 = new Button("Pilih A");
    Button cb2 = new Button("Pilih B");
    Button cb3 = new Button("Pilih C");
    CobaGUI_1(){
        setTitle("Program GUI Pertamaku");
        setLocation(200,100);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);
        cb1.setBackground(Color.MAGENTA);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(cb3);
        cb1.setBounds(30,90,150,20);
        cb2.setBounds(30,120,150,20);
        cb3.setBounds(30,150,150,20);
        setVisible(true);
    }
    public static void main(String[] args){
        CobaGUI_1 ZZ = new CobaGUI_1();
        ZZ.objek();
    }
}