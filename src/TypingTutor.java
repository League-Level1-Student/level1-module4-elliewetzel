import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
	char currentLetter;
public static void main(String[] args) {
	new TypingTutor().TT();
	
}

private void TT() {
	// TODO Auto-generated method stub
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	frame.setSize(400, 120);
	frame.setTitle("Type of Die");
	frame.add(panel);
	panel.add(label);
	
	frame.setVisible(true);
	
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
}