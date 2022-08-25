import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class TelaBase extends JFrame{
    private JFrame frame = new JFrame();
    private double x = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private double y = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private int width = 400;
    private int height = 400;

    TelaBase() {
        this.setTitle("TelaBase");
        this.setBounds((int) (this.x-this.width)/2, (int) (this.y-this.height)/2, this.width, this.height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getFrame() {
        return frame;
    }
}