import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class FrameWControls extends Frame{
    public static void main(String args[]){
        FrameWControls fwc = new FrameWControls();
        fwc.setLayout(new FlowLayout());
        fwc.setSize(600,600);
        fwc.add(new Button("Test Bro!"));
        fwc.add(new Label("Label"));
        fwc.add(new TextField());
        CheckboxGroup cbg = new CheckboxGroup();
        fwc.add(new Checkbox("chk1", cbg, true));
        fwc.add(new Checkbox("chk2", cbg, false));
        fwc.add(new Checkbox("chk3", cbg, false));
        fwc.setVisible(true);
    }
}