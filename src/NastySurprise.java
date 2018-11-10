import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NastySurprise {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton trick = new JButton();
	static JButton treat = new JButton();
	public static void main(String[] args) {
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		trick.setText("Trick");
		treat.setText("Treat");
		trick.getMouseListeners(this);
		treat.getMouseListeners(this);
	}

}
