import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

class BorderLayoutDemo extends Frame{
    public static void main(String args[]){
        BorderLayoutDemo bld = new BorderLayoutDemo();
        bld.setLayout(new BorderLayout());
        bld.add(new Button("NORTH"), BorderLayout.NORTH);
        bld.add(new Button("SOUTH"), BorderLayout.SOUTH);
        bld.add(new Button("EAST"), BorderLayout.EAST);
        bld.add(new Button("WEST"), BorderLayout.WEST);
        bld.add(new Button("CENTER"), BorderLayout.CENTER);
        bld.setSize(200,200);
        bld.setVisible(true);
    }
}