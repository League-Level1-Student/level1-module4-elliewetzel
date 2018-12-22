import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton("Joke");
	JButton punchline = new JButton("Punchline");
public static void main(String[] args) {
	new ChuckleClicker().makeButtons();
	
}

	private void makeButtons() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(joke);
	joke.addActionListener(this);
	panel.add(punchline);
	punchline.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(joke)) {
			JOptionPane.showMessageDialog(null, "A sandwich walks to a bar and orders a beer,");
		}
		if(e.getSource().equals(punchline)) {
			JOptionPane.showMessageDialog(null, "The bartender says, 'Sorry, we don't serve food here'.");
		}
	}
	
}