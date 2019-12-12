package textarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Textarea extends JFrame{

public static void main(String[] args) {
    // TODO code application logic here
    
    JFrame frame = new JFrame("JTextArea demo"); 
    JPanel panel=new JPanel();
        frame.setSize(300, 250);                                  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
                                            
 
        JTextArea textArea = new JTextArea(); 
        textArea.setLineWrap(true);                 //إذا إنتهى السطر أقفز إلى السطر الثاني
        textArea.setWrapStyleWord(true);             //هذه الخاصية خاصة الجملة إن لم تسع في السطر الأول
        textArea.setBackground(new Color(120, 255, 60));
        panel.add(textArea);      
        frame.setContentPane(panel);
 
        frame.setVisible(true);
}

}
